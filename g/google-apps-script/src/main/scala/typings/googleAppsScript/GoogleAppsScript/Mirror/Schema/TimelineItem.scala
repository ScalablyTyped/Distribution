package typings.googleAppsScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineItem extends js.Object {
  var attachments: js.UndefOr[js.Array[Attachment]] = js.native
  var bundleId: js.UndefOr[String] = js.native
  var canonicalUrl: js.UndefOr[String] = js.native
  var created: js.UndefOr[String] = js.native
  var creator: js.UndefOr[Contact] = js.native
  var displayTime: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var html: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var inReplyTo: js.UndefOr[String] = js.native
  var isBundleCover: js.UndefOr[Boolean] = js.native
  var isDeleted: js.UndefOr[Boolean] = js.native
  var isPinned: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var location: js.UndefOr[Location] = js.native
  var menuItems: js.UndefOr[js.Array[MenuItem]] = js.native
  var notification: js.UndefOr[NotificationConfig] = js.native
  var pinScore: js.UndefOr[Double] = js.native
  var recipients: js.UndefOr[js.Array[Contact]] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var sourceItemId: js.UndefOr[String] = js.native
  var speakableText: js.UndefOr[String] = js.native
  var speakableType: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var updated: js.UndefOr[String] = js.native
}

object TimelineItem {
  @scala.inline
  def apply(): TimelineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineItem]
  }
  @scala.inline
  implicit class TimelineItemOps[Self <: TimelineItem] (val x: Self) extends AnyVal {
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
    def setAttachmentsVarargs(value: Attachment*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[Attachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    @scala.inline
    def setCanonicalUrl(value: String): Self = this.set("canonicalUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanonicalUrl: Self = this.set("canonicalUrl", js.undefined)
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setCreator(value: Contact): Self = this.set("creator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreator: Self = this.set("creator", js.undefined)
    @scala.inline
    def setDisplayTime(value: String): Self = this.set("displayTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayTime: Self = this.set("displayTime", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInReplyTo(value: String): Self = this.set("inReplyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInReplyTo: Self = this.set("inReplyTo", js.undefined)
    @scala.inline
    def setIsBundleCover(value: Boolean): Self = this.set("isBundleCover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBundleCover: Self = this.set("isBundleCover", js.undefined)
    @scala.inline
    def setIsDeleted(value: Boolean): Self = this.set("isDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDeleted: Self = this.set("isDeleted", js.undefined)
    @scala.inline
    def setIsPinned(value: Boolean): Self = this.set("isPinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPinned: Self = this.set("isPinned", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMenuItemsVarargs(value: MenuItem*): Self = this.set("menuItems", js.Array(value :_*))
    @scala.inline
    def setMenuItems(value: js.Array[MenuItem]): Self = this.set("menuItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItems: Self = this.set("menuItems", js.undefined)
    @scala.inline
    def setNotification(value: NotificationConfig): Self = this.set("notification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    @scala.inline
    def setPinScore(value: Double): Self = this.set("pinScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinScore: Self = this.set("pinScore", js.undefined)
    @scala.inline
    def setRecipientsVarargs(value: Contact*): Self = this.set("recipients", js.Array(value :_*))
    @scala.inline
    def setRecipients(value: js.Array[Contact]): Self = this.set("recipients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setSourceItemId(value: String): Self = this.set("sourceItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceItemId: Self = this.set("sourceItemId", js.undefined)
    @scala.inline
    def setSpeakableText(value: String): Self = this.set("speakableText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeakableText: Self = this.set("speakableText", js.undefined)
    @scala.inline
    def setSpeakableType(value: String): Self = this.set("speakableType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeakableType: Self = this.set("speakableType", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
  
}

