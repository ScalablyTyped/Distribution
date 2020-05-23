package typings.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notifications extends js.Object {
  var notifications: js.Array[MethodType]
}

object Notifications {
  @scala.inline
  def apply(notifications: js.Array[MethodType]): Notifications = {
    val __obj = js.Dynamic.literal(notifications = notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notifications]
  }
}

