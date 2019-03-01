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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appointmentId")(appointmentId)
    __obj.updateDynamic("handled")(handled)
    __obj.updateDynamic("newInterval")(newInterval)
    __obj.updateDynamic("oldInterval")(oldInterval)
    __obj.updateDynamic("operation")(operation)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[AppointmentResizeEventArgs]
  }
}

