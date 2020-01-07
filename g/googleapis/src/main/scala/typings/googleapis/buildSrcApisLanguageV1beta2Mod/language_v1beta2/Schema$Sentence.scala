package typings.googleapis.buildSrcApisLanguageV1beta2Mod.language_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a sentence in the input document.
  */
@js.native
trait Schema$Sentence extends js.Object {
  /**
    * For calls to AnalyzeSentiment or if
    * AnnotateTextRequest.Features.extract_document_sentiment is set to true,
    * this field will contain the sentiment for the sentence.
    */
  var sentiment: js.UndefOr[Schema$Sentiment] = js.native
  /**
    * The sentence text.
    */
  var text: js.UndefOr[Schema$TextSpan] = js.native
}

object Schema$Sentence {
  @scala.inline
  def apply(sentiment: Schema$Sentiment = null, text: Schema$TextSpan = null): Schema$Sentence = {
    val __obj = js.Dynamic.literal()
    if (sentiment != null) __obj.updateDynamic("sentiment")(sentiment.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Sentence]
  }
}

