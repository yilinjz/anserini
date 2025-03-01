/*
 * Anserini: A Lucene toolkit for reproducible information retrieval research
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.anserini.search;

import io.anserini.index.IndexInvertedDenseVectorsTest;
import org.junit.Test;

/**
 * Tests for {@link EvaluateInvertedDenseVectors}
 */
public class EvaluateInvertedDenseVectorsTest {

  @Test
  public void evalFWTest() throws Exception {
    String path = "target/idx-sample-fw";
    String encoding = "fw";
    IndexInvertedDenseVectorsTest.createIndex(path, encoding, false);
    String[] args = new String[]{"-encoding", encoding, "-input", "src/test/resources/mini-word-vectors.txt", "-index",
        path, "-topics", "src/test/resources/sample_topics/Trec"};
    EvaluateInvertedDenseVectors.main(args);
  }

  @Test
  public void evalLLTest() throws Exception {
    String path = "target/idx-sample-ll";
    String encoding = "lexlsh";
    IndexInvertedDenseVectorsTest.createIndex(path, encoding, false);
    String[] args = new String[]{"-encoding", encoding, "-input", "src/test/resources/mini-word-vectors.txt", "-index",
        path, "-topics", "src/test/resources/sample_topics/Trec"};
    EvaluateInvertedDenseVectors.main(args);
  }

}