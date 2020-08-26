package typings.electronNotify.mod

import typings.electronNotify.electronNotifyStrings.click
import typings.electronNotify.electronNotifyStrings.close
import typings.electronNotify.electronNotifyStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICloseNotificationEvent extends js.Object {
  var event: close | show | click = js.native
  var id: Double = js.native
}

object ICloseNotificationEvent {
  @scala.inline
  def apply(event: close | show | click, id: Double): ICloseNotificationEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloseNotificationEvent]
  }
  @scala.inline
  implicit class ICloseNotificationEventOps[Self <: ICloseNotificationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvent(value: close | show | click): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

