package typings.gapiDotClientDotLanguage.gapiNs.clientNs.languageNs

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
  var language: js.UndefOr[String] = js.undefined
  /** The sentiment for all the sentences in the document. */
  var sentences: js.UndefOr[js.Array[Sentence]] = js.undefined
}

object AnalyzeSentimentResponse {
  @scala.inline
  def apply(documentSentiment: Sentiment = null, language: String = null, sentences: js.Array[Sentence] = null): AnalyzeSentimentResponse = {
    val __obj = js.Dynamic.literal()
    if (documentSentiment != null) __obj.updateDynamic("documentSentiment")(documentSentiment)
    if (language != null) __obj.updateDynamic("language")(language)
    if (sentences != null) __obj.updateDynamic("sentences")(sentences)
    __obj.asInstanceOf[AnalyzeSentimentResponse]
  }
}

