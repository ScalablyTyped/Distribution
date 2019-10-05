package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListEntryNotificationSettings extends js.Object {
  var notifications: js.UndefOr[js.Array[CalendarNotification]] = js.undefined
}

object CalendarListEntryNotificationSettings {
  @scala.inline
  def apply(notifications: js.Array[CalendarNotification] = null): CalendarListEntryNotificationSettings = {
    val __obj = js.Dynamic.literal()
    if (notifications != null) __obj.updateDynamic("notifications")(notifications)
    __obj.asInstanceOf[CalendarListEntryNotificationSettings]
  }
}

