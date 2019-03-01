package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentDragEventArgs extends EventArgs {
  var allow: scala.Boolean
  val dragInformation: js.Array[BootstrapSchedulerAppointmentDragInfo]
  val mouseEvent: js.Any
}

object AppointmentDragEventArgs {
  @scala.inline
  def apply(
    allow: scala.Boolean,
    dragInformation: js.Array[BootstrapSchedulerAppointmentDragInfo],
    mouseEvent: js.Any,
    sender: Control
  ): AppointmentDragEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allow")(allow)
    __obj.updateDynamic("dragInformation")(dragInformation)
    __obj.updateDynamic("mouseEvent")(mouseEvent)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[AppointmentDragEventArgs]
  }
}

