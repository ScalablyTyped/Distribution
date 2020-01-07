package typings.googleapis.buildSrcApisLanguageV1beta2Mod.language_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a mention for an entity in the text. Currently, proper noun
  * mentions are supported.
  */
@js.native
trait Schema$EntityMention extends js.Object {
  /**
    * For calls to AnalyzeEntitySentiment or if
    * AnnotateTextRequest.Features.extract_entity_sentiment is set to true,
    * this field will contain the sentiment expressed for this mention of the
    * entity in the provided document.
    */
  var sentiment: js.UndefOr[Schema$Sentiment] = js.native
  /**
    * The mention text.
    */
  var text: js.UndefOr[Schema$TextSpan] = js.native
  /**
    * The type of the entity mention.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$EntityMention {
  @scala.inline
  def apply(sentiment: Schema$Sentiment = null, text: Schema$TextSpan = null, `type`: String = null): Schema$EntityMention = {
    val __obj = js.Dynamic.literal()
    if (sentiment != null) __obj.updateDynamic("sentiment")(sentiment.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EntityMention]
  }
}

