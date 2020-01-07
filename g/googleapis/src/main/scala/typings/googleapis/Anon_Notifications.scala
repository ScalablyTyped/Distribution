package typings.googleapis

import typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3.Schema$CalendarNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Notifications extends js.Object {
  var notifications: js.UndefOr[js.Array[Schema$CalendarNotification]] = js.native
}

object Anon_Notifications {
  @scala.inline
  def apply(notifications: js.Array[Schema$CalendarNotification] = null): Anon_Notifications = {
    val __obj = js.Dynamic.literal()
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Notifications]
  }
}

