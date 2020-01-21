package typings.electronNotify.mod

import typings.electronNotify.electronNotifyStrings.click
import typings.electronNotify.electronNotifyStrings.close
import typings.electronNotify.electronNotifyStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotificationEvent extends ICloseNotificationEvent {
  def closeNotification(reason: js.Any): Unit
}

object INotificationEvent {
  @scala.inline
  def apply(closeNotification: js.Any => Unit, event: close | show | click, id: Double): INotificationEvent = {
    val __obj = js.Dynamic.literal(closeNotification = js.Any.fromFunction1(closeNotification), event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INotificationEvent]
  }
}

