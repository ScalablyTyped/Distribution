package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentResizeEventArgs extends EventArgs {
  val appointmentId: String
  var handled: Boolean
  val newInterval: BootstrapTimeInterval
  val oldInterval: BootstrapTimeInterval
  val operation: BootstrapSchedulerAppointmentOperation
}

object AppointmentResizeEventArgs {
  @scala.inline
  def apply(
    appointmentId: String,
    handled: Boolean,
    newInterval: BootstrapTimeInterval,
    oldInterval: BootstrapTimeInterval,
    operation: BootstrapSchedulerAppointmentOperation,
    sender: Control
  ): AppointmentResizeEventArgs = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], newInterval = newInterval.asInstanceOf[js.Any], oldInterval = oldInterval.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentResizeEventArgs]
  }
}

