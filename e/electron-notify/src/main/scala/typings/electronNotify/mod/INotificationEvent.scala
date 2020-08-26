package typings.electronNotify.mod

import typings.electronNotify.electronNotifyStrings.click
import typings.electronNotify.electronNotifyStrings.close
import typings.electronNotify.electronNotifyStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotificationEvent extends ICloseNotificationEvent {
  def closeNotification(reason: js.Any): Unit = js.native
}

object INotificationEvent {
  @scala.inline
  def apply(closeNotification: js.Any => Unit, event: close | show | click, id: Double): INotificationEvent = {
    val __obj = js.Dynamic.literal(closeNotification = js.Any.fromFunction1(closeNotification), event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotificationEvent]
  }
  @scala.inline
  implicit class INotificationEventOps[Self <: INotificationEvent] (val x: Self) extends AnyVal {
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
    def setCloseNotification(value: js.Any => Unit): Self = this.set("closeNotification", js.Any.fromFunction1(value))
  }
  
}

