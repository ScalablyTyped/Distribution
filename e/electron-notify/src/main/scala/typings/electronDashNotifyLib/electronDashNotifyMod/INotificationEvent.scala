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
    val __obj = js.Dynamic.literal(closeNotification = closeNotification, event = event.asInstanceOf[js.Any], id = id)
  
    __obj.asInstanceOf[INotificationEvent]
  }
}

