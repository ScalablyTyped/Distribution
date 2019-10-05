package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentDropEventArgs extends EventArgs {
  val dragInformation: js.Array[BootstrapSchedulerAppointmentDragInfo]
  var handled: Boolean
  val operation: BootstrapSchedulerAppointmentOperation
}

object AppointmentDropEventArgs {
  @scala.inline
  def apply(
    dragInformation: js.Array[BootstrapSchedulerAppointmentDragInfo],
    handled: Boolean,
    operation: BootstrapSchedulerAppointmentOperation,
    sender: Control
  ): AppointmentDropEventArgs = {
    val __obj = js.Dynamic.literal(dragInformation = dragInformation, handled = handled, operation = operation, sender = sender)
  
    __obj.asInstanceOf[AppointmentDropEventArgs]
  }
}

