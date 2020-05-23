package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentDrag event.
  */
trait ASPxClientAppointmentDragEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies whether or not appointments can be dropped into the intervals over which they are currently dragged.
    */
  var allow: Boolean
  /**
    * Provides information about dragged appointments.
    */
  var dragInformation: js.Array[ASPxClientAppointmentDragInfo]
  /**
    * Gets a mouse event object related to the current drag operation.
    */
  var mouseEvent: js.Any
}

object ASPxClientAppointmentDragEventArgs {
  @scala.inline
  def apply(allow: Boolean, dragInformation: js.Array[ASPxClientAppointmentDragInfo], mouseEvent: js.Any): ASPxClientAppointmentDragEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], dragInformation = dragInformation.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentDragEventArgs]
  }
}

