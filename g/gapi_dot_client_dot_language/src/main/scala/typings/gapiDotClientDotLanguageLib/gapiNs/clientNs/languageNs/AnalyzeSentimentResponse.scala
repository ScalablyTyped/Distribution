package typings
package gapiDotClientDotLanguageLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyzeSentimentResponse extends js.Object {
  /** The overall sentiment of the input document. */
  var documentSentiment: js.UndefOr[Sentiment] = js.undefined
  /**
    * The language of the text, which will be the same as the language specified
    * in the request or, if not specified, the automatically-detected language.
    * See Document.language field for more details.
    */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** The sentiment for all the sentences in the document. */
  var sentences: js.UndefOr[js.Array[Sentence]] = js.undefined
}

