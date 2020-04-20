package typings.gapiCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotifications extends js.Object {
  var notifications: js.Array[AnonMethodType]
}

object AnonNotifications {
  @scala.inline
  def apply(notifications: js.Array[AnonMethodType]): AnonNotifications = {
    val __obj = js.Dynamic.literal(notifications = notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotifications]
  }
}

