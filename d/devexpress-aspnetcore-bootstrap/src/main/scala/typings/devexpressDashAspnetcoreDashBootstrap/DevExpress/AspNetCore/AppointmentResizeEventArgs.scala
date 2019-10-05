package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(appointmentId = appointmentId, handled = handled, newInterval = newInterval, oldInterval = oldInterval, operation = operation, sender = sender)
  
    __obj.asInstanceOf[AppointmentResizeEventArgs]
  }
}

