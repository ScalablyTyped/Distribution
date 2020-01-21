package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentDrag event.
  */
@JSGlobal("ASPxClientAppointmentDragEventArgs")
@js.native
class ASPxClientAppointmentDragEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientAppointmentDragEventArgs class.
    * @param mouseEvent A mouse event object related to the drag operation.
    * @param dragInformation An array of ASPxClientAppointmentDragInfo objects storing information about dragged appointments.
    */
  def this(mouseEvent: js.Any, dragInformation: js.Array[ASPxClientAppointmentDragInfo]) = this()
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

