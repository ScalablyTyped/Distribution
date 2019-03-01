package typings
package electronDashNotifyLib.electronDashNotifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICloseNotificationEvent extends js.Object {
  var event: electronDashNotifyLib.electronDashNotifyLibStrings.close | electronDashNotifyLib.electronDashNotifyLibStrings.show | electronDashNotifyLib.electronDashNotifyLibStrings.click
  var id: scala.Double
}

object ICloseNotificationEvent {
  @scala.inline
  def apply(
    event: electronDashNotifyLib.electronDashNotifyLibStrings.close | electronDashNotifyLib.electronDashNotifyLibStrings.show | electronDashNotifyLib.electronDashNotifyLibStrings.click,
    id: scala.Double
  ): ICloseNotificationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ICloseNotificationEvent]
  }
}

