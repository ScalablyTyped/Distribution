package typings.googleapis.buildSrcApisLanguageV1beta2Mod.language_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The sentiment analysis response message.
  */
@js.native
trait Schema$AnalyzeSentimentResponse extends js.Object {
  /**
    * The overall sentiment of the input document.
    */
  var documentSentiment: js.UndefOr[Schema$Sentiment] = js.native
  /**
    * The language of the text, which will be the same as the language
    * specified in the request or, if not specified, the automatically-detected
    * language. See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The sentiment for all the sentences in the document.
    */
  var sentences: js.UndefOr[js.Array[Schema$Sentence]] = js.native
}

object Schema$AnalyzeSentimentResponse {
  @scala.inline
  def apply(
    documentSentiment: Schema$Sentiment = null,
    language: String = null,
    sentences: js.Array[Schema$Sentence] = null
  ): Schema$AnalyzeSentimentResponse = {
    val __obj = js.Dynamic.literal()
    if (documentSentiment != null) __obj.updateDynamic("documentSentiment")(documentSentiment.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (sentences != null) __obj.updateDynamic("sentences")(sentences.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AnalyzeSentimentResponse]
  }
}

