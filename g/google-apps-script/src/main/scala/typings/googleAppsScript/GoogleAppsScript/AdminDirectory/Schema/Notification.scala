package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends js.Object {
  var body: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var fromAddress: js.UndefOr[String] = js.native
  var isUnread: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var notificationId: js.UndefOr[String] = js.native
  var sendTime: js.UndefOr[String] = js.native
  var subject: js.UndefOr[String] = js.native
}

object Notification {
  @scala.inline
  def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setFromAddress(value: String): Self = this.set("fromAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromAddress: Self = this.set("fromAddress", js.undefined)
    @scala.inline
    def setIsUnread(value: Boolean): Self = this.set("isUnread", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsUnread: Self = this.set("isUnread", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNotificationId(value: String): Self = this.set("notificationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationId: Self = this.set("notificationId", js.undefined)
    @scala.inline
    def setSendTime(value: String): Self = this.set("sendTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendTime: Self = this.set("sendTime", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
  
}

