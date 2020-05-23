package typings.gapiClientCalendar.anon

import typings.gapiClientCalendar.gapi.client.calendar.CalendarNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notifications extends js.Object {
  /** The list of notifications set for this calendar. */
  var notifications: js.UndefOr[js.Array[CalendarNotification]] = js.undefined
}

object Notifications {
  @scala.inline
  def apply(notifications: js.Array[CalendarNotification] = null): Notifications = {
    val __obj = js.Dynamic.literal()
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notifications]
  }
}

