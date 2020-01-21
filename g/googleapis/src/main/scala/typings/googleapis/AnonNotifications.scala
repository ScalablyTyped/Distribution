package typings.googleapis

import typings.googleapis.calendarV3Mod.calendarV3.SchemaCalendarNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNotifications extends js.Object {
  var notifications: js.UndefOr[js.Array[SchemaCalendarNotification]] = js.native
}

object AnonNotifications {
  @scala.inline
  def apply(notifications: js.Array[SchemaCalendarNotification] = null): AnonNotifications = {
    val __obj = js.Dynamic.literal()
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotifications]
  }
}

