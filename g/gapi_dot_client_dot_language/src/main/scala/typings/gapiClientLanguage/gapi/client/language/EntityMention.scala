package typings.gapiClientLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityMention extends js.Object {
  /**
    * For calls to AnalyzeEntitySentiment or if
    * AnnotateTextRequest.Features.extract_entity_sentiment is set to
    * true, this field will contain the sentiment expressed for this mention of
    * the entity in the provided document.
    */
  var sentiment: js.UndefOr[Sentiment] = js.native
  /** The mention text. */
  var text: js.UndefOr[TextSpan] = js.native
  /** The type of the entity mention. */
  var `type`: js.UndefOr[String] = js.native
}

object EntityMention {
  @scala.inline
  def apply(): EntityMention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityMention]
  }
  @scala.inline
  implicit class EntityMentionOps[Self <: EntityMention] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSentiment(value: Sentiment): Self = this.set("sentiment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentiment: Self = this.set("sentiment", js.undefined)
    @scala.inline
    def setText(value: TextSpan): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

