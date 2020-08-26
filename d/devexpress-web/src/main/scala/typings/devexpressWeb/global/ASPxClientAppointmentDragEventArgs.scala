package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentDrag event.
  */
@JSGlobal("ASPxClientAppointmentDragEventArgs")
@js.native
class ASPxClientAppointmentDragEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientAppointmentDragEventArgs {
  /**
    * Initializes a new instance of the ASPxClientAppointmentDragEventArgs class.
    * @param mouseEvent A mouse event object related to the drag operation.
    * @param dragInformation An array of ASPxClientAppointmentDragInfo objects storing information about dragged appointments.
    */
  def this(mouseEvent: js.Any, dragInformation: js.Array[typings.devexpressWeb.ASPxClientAppointmentDragInfo]) = this()
}

