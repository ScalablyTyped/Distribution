package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the AppointmentDrag event.
  */
trait ASPxClientAppointmentDragEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies whether or not appointments can be dropped into the intervals over which they are currently dragged.
    * Value: true to allow dropping appointments; otherwise, false.
    */
  var allow: Boolean
  /**
    * Provides information about dragged appointments.
    * Value: An array of ASPxClientAppointmentDragInfo objects storing information about dragged appointments.
    */
  var dragInformation: js.Array[ASPxClientAppointmentDragInfo]
  /**
    * Gets a mouse event object related to the current drag operation.
    * Value: An object providing event properties specific to mouse events.
    */
  var mouseEvent: js.Object
}

object ASPxClientAppointmentDragEventArgs {
  @scala.inline
  def apply(allow: Boolean, dragInformation: js.Array[ASPxClientAppointmentDragInfo], mouseEvent: js.Object): ASPxClientAppointmentDragEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow, dragInformation = dragInformation, mouseEvent = mouseEvent)
  
    __obj.asInstanceOf[ASPxClientAppointmentDragEventArgs]
  }
}

