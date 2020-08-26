package typings.gapiClientPlusdomains.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actor extends js.Object {
  /**
    * If this activity's object is itself another activity, such as when a person reshares an activity, this property specifies the original activity's
    * actor.
    */
  var actor: js.UndefOr[DisplayName] = js.native
  /** The media objects attached to this activity. */
  var attachments: js.UndefOr[js.Array[Content]] = js.native
  /** The HTML-formatted content, which is suitable for display. */
  var content: js.UndefOr[String] = js.native
  /** The ID of the object. When resharing an activity, this is the ID of the activity that is being reshared. */
  var id: js.UndefOr[String] = js.native
  /**
    * The type of the object. Possible values include, but are not limited to, the following values:
    * - "note" - Textual content.
    * - "activity" - A Google+ activity.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * The content (text) as provided by the author, which is stored without any HTML formatting. When creating or updating an activity, this value must be
    * supplied as plain text in the request.
    */
  var originalContent: js.UndefOr[String] = js.native
  /** People who +1'd this activity. */
  var plusoners: js.UndefOr[SelfLink] = js.native
  /** Comments in reply to this activity. */
  var replies: js.UndefOr[SelfLink] = js.native
  /** People who reshared this activity. */
  var resharers: js.UndefOr[SelfLink] = js.native
  /** Status of the activity as seen by the viewer. */
  var statusForViewer: js.UndefOr[CanComment] = js.native
  /** The URL that points to the linked resource. */
  var url: js.UndefOr[String] = js.native
}

object Actor {
  @scala.inline
  def apply(): Actor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actor]
  }
  @scala.inline
  implicit class ActorOps[Self <: Actor] (val x: Self) extends AnyVal {
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
    def setActor(value: DisplayName): Self = this.set("actor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
    @scala.inline
    def setAttachmentsVarargs(value: Content*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[Content]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    @scala.inline
    def setOriginalContent(value: String): Self = this.set("originalContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalContent: Self = this.set("originalContent", js.undefined)
    @scala.inline
    def setPlusoners(value: SelfLink): Self = this.set("plusoners", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlusoners: Self = this.set("plusoners", js.undefined)
    @scala.inline
    def setReplies(value: SelfLink): Self = this.set("replies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplies: Self = this.set("replies", js.undefined)
    @scala.inline
    def setResharers(value: SelfLink): Self = this.set("resharers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResharers: Self = this.set("resharers", js.undefined)
    @scala.inline
    def setStatusForViewer(value: CanComment): Self = this.set("statusForViewer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusForViewer: Self = this.set("statusForViewer", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

