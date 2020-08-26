package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentDrop event.
  */
@js.native
trait ASPxClientAppointmentDropEventArgs extends ASPxClientEventArgs {
  /**
    * Provides information about dropped appointments.
    */
  var dragInformation: js.Array[ASPxClientAppointmentDragInfo] = js.native
  /**
    * Gets or sets a value that specifies whether the event is handled, and the default processing is not required.
    */
  var handled: Boolean = js.native
  /**
    * Provides access to an object that enables you to choose an operation to perform.
    */
  var operation: ASPxClientAppointmentOperation = js.native
}

object ASPxClientAppointmentDropEventArgs {
  @scala.inline
  def apply(
    dragInformation: js.Array[ASPxClientAppointmentDragInfo],
    handled: Boolean,
    operation: ASPxClientAppointmentOperation
  ): ASPxClientAppointmentDropEventArgs = {
    val __obj = js.Dynamic.literal(dragInformation = dragInformation.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentDropEventArgs]
  }
  @scala.inline
  implicit class ASPxClientAppointmentDropEventArgsOps[Self <: ASPxClientAppointmentDropEventArgs] (val x: Self) extends AnyVal {
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
    def setDragInformationVarargs(value: ASPxClientAppointmentDragInfo*): Self = this.set("dragInformation", js.Array(value :_*))
    @scala.inline
    def setDragInformation(value: js.Array[ASPxClientAppointmentDragInfo]): Self = this.set("dragInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: ASPxClientAppointmentOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
  }
  
}

