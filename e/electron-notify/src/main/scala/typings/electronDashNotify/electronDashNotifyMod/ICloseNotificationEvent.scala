package typings.electronDashNotify.electronDashNotifyMod

import typings.electronDashNotify.electronDashNotifyStrings.click
import typings.electronDashNotify.electronDashNotifyStrings.close
import typings.electronDashNotify.electronDashNotifyStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICloseNotificationEvent extends js.Object {
  var event: close | show | click
  var id: Double
}

object ICloseNotificationEvent {
  @scala.inline
  def apply(event: close | show | click, id: Double): ICloseNotificationEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id)
  
    __obj.asInstanceOf[ICloseNotificationEvent]
  }
}

