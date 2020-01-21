package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentResizingEventArgs extends EventArgs {
  var allow: Boolean
  val appointmentId: String
  val mouseEvent: js.Any
  val newInterval: BootstrapTimeInterval
  val oldInterval: BootstrapTimeInterval
}

object AppointmentResizingEventArgs {
  @scala.inline
  def apply(
    allow: Boolean,
    appointmentId: String,
    mouseEvent: js.Any,
    newInterval: BootstrapTimeInterval,
    oldInterval: BootstrapTimeInterval,
    sender: Control
  ): AppointmentResizingEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], appointmentId = appointmentId.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any], newInterval = newInterval.asInstanceOf[js.Any], oldInterval = oldInterval.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppointmentResizingEventArgs]
  }
}

