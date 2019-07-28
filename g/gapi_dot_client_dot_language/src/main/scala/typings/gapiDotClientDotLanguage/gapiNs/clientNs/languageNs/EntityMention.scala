package typings.gapiDotClientDotLanguage.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityMention extends js.Object {
  /**
    * For calls to AnalyzeEntitySentiment or if
    * AnnotateTextRequest.Features.extract_entity_sentiment is set to
    * true, this field will contain the sentiment expressed for this mention of
    * the entity in the provided document.
    */
  var sentiment: js.UndefOr[Sentiment] = js.undefined
  /** The mention text. */
  var text: js.UndefOr[TextSpan] = js.undefined
  /** The type of the entity mention. */
  var `type`: js.UndefOr[String] = js.undefined
}

object EntityMention {
  @scala.inline
  def apply(sentiment: Sentiment = null, text: TextSpan = null, `type`: String = null): EntityMention = {
    val __obj = js.Dynamic.literal()
    if (sentiment != null) __obj.updateDynamic("sentiment")(sentiment)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EntityMention]
  }
}

