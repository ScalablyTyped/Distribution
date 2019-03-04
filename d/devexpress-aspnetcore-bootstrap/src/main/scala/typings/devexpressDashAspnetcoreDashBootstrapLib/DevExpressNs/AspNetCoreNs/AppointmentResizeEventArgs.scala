package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentResizeEventArgs extends EventArgs {
  val appointmentId: java.lang.String
  var handled: scala.Boolean
  val newInterval: BootstrapTimeInterval
  val oldInterval: BootstrapTimeInterval
  val operation: BootstrapSchedulerAppointmentOperation
}

object AppointmentResizeEventArgs {
  @scala.inline
  def apply(
    appointmentId: java.lang.String,
    handled: scala.Boolean,
    newInterval: BootstrapTimeInterval,
    oldInterval: BootstrapTimeInterval,
    operation: BootstrapSchedulerAppointmentOperation,
    sender: Control
  ): AppointmentResizeEventArgs = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId, handled = handled, newInterval = newInterval, oldInterval = oldInterval, operation = operation, sender = sender)
  
    __obj.asInstanceOf[AppointmentResizeEventArgs]
  }
}

