package typings.googleapis.anon

import typings.googleapis.calendarV3Mod.calendarV3.SchemaCalendarNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notifications extends js.Object {
  var notifications: js.UndefOr[js.Array[SchemaCalendarNotification]] = js.native
}

object Notifications {
  @scala.inline
  def apply(notifications: js.Array[SchemaCalendarNotification] = null): Notifications = {
    val __obj = js.Dynamic.literal()
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notifications]
  }
}

