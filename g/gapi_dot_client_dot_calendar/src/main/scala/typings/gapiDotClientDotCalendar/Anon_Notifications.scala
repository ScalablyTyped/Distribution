package typings.gapiDotClientDotCalendar

import typings.gapiDotClientDotCalendar.gapiNs.clientNs.calendarNs.CalendarNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Notifications extends js.Object {
  /** The list of notifications set for this calendar. */
  var notifications: js.UndefOr[js.Array[CalendarNotification]] = js.undefined
}

object Anon_Notifications {
  @scala.inline
  def apply(notifications: js.Array[CalendarNotification] = null): Anon_Notifications = {
    val __obj = js.Dynamic.literal()
    if (notifications != null) __obj.updateDynamic("notifications")(notifications)
    __obj.asInstanceOf[Anon_Notifications]
  }
}

