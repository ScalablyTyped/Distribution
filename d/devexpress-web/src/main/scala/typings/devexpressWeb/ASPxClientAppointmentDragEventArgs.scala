package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentDrag event.
  */
@js.native
trait ASPxClientAppointmentDragEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies whether or not appointments can be dropped into the intervals over which they are currently dragged.
    */
  var allow: Boolean = js.native
  /**
    * Provides information about dragged appointments.
    */
  var dragInformation: js.Array[ASPxClientAppointmentDragInfo] = js.native
  /**
    * Gets a mouse event object related to the current drag operation.
    */
  var mouseEvent: js.Any = js.native
}

object ASPxClientAppointmentDragEventArgs {
  @scala.inline
  def apply(allow: Boolean, dragInformation: js.Array[ASPxClientAppointmentDragInfo], mouseEvent: js.Any): ASPxClientAppointmentDragEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], dragInformation = dragInformation.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentDragEventArgs]
  }
  @scala.inline
  implicit class ASPxClientAppointmentDragEventArgsOps[Self <: ASPxClientAppointmentDragEventArgs] (val x: Self) extends AnyVal {
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
    def setAllow(value: Boolean): Self = this.set("allow", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragInformationVarargs(value: ASPxClientAppointmentDragInfo*): Self = this.set("dragInformation", js.Array(value :_*))
    @scala.inline
    def setDragInformation(value: js.Array[ASPxClientAppointmentDragInfo]): Self = this.set("dragInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseEvent(value: js.Any): Self = this.set("mouseEvent", value.asInstanceOf[js.Any])
  }
  
}

