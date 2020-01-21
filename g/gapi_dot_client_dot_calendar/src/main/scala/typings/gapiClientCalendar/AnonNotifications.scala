package typings.gapiClientCalendar

import typings.gapiClientCalendar.gapi.client.calendar.CalendarNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotifications extends js.Object {
  /** The list of notifications set for this calendar. */
  var notifications: js.UndefOr[js.Array[CalendarNotification]] = js.undefined
}

object AnonNotifications {
  @scala.inline
  def apply(notifications: js.Array[CalendarNotification] = null): AnonNotifications = {
    val __obj = js.Dynamic.literal()
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotifications]
  }
}

