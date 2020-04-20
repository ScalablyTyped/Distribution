package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentDragEventArgs extends EventArgs {
  var allow: Boolean
  val dragInformation: js.Array[BootstrapSchedulerAppointmentDragInfo]
  val mouseEvent: js.Any
}

object AppointmentDragEventArgs {
  @scala.inline
  def apply(
    allow: Boolean,
    dragInformation: js.Array[BootstrapSchedulerAppointmentDragInfo],
    mouseEvent: js.Any,
    sender: Control
  ): AppointmentDragEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], dragInformation = dragInformation.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentDragEventArgs]
  }
}

