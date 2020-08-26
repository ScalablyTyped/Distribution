package typings.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notifications extends js.Object {
  var notifications: js.Array[MethodType] = js.native
}

object Notifications {
  @scala.inline
  def apply(notifications: js.Array[MethodType]): Notifications = {
    val __obj = js.Dynamic.literal(notifications = notifications.asInstanceOf[js.Any])
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
    def setNotificationsVarargs(value: MethodType*): Self = this.set("notifications", js.Array(value :_*))
    @scala.inline
    def setNotifications(value: js.Array[MethodType]): Self = this.set("notifications", value.asInstanceOf[js.Any])
  }
  
}

