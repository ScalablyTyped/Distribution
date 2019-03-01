package typings
package electronDashNotifyLib.electronDashNotifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotificationEvent extends ICloseNotificationEvent {
  def closeNotification(reason: js.Any): scala.Unit
}

object INotificationEvent {
  @scala.inline
  def apply(
    closeNotification: js.Function1[js.Any, scala.Unit],
    event: electronDashNotifyLib.electronDashNotifyLibStrings.close | electronDashNotifyLib.electronDashNotifyLibStrings.show | electronDashNotifyLib.electronDashNotifyLibStrings.click,
    id: scala.Double
  ): INotificationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closeNotification")(closeNotification)
    __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[INotificationEvent]
  }
}

