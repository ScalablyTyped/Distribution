package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notifications extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[Notification]] = js.native
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  var unreadNotificationsCount: js.UndefOr[Double] = js.native
}

object Notifications {
  @scala.inline
  def apply(): Notifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notifications]
  }
  @scala.inline
  implicit class NotificationsOps[Self <: Notifications] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Notification*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Notification]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setUnreadNotificationsCount(value: Double): Self = this.set("unreadNotificationsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnreadNotificationsCount: Self = this.set("unreadNotificationsCount", js.undefined)
  }
  
}

