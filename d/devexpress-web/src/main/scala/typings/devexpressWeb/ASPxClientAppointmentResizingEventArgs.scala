package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentResizing event.
  */
@JSGlobal("ASPxClientAppointmentResizingEventArgs")
@js.native
class ASPxClientAppointmentResizingEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientAppointmentResizingEventArgs class.
    * @param mouseEvent A mouse event object related to the resizing operation.
    * @param appointmentId A string containing an appointment identifier.
    * @param oldInterval An  object specifying the appointment's interval before the resize operation.
    * @param newInterval An  object specifying the appointment's interval after the resize operation.
    */
  def this(
    mouseEvent: js.Any,
    appointmentId: String,
    oldInterval: ASPxClientTimeInterval,
    newInterval: ASPxClientTimeInterval
  ) = this()
  /**
    * Specifies whether or not an appointment can be resized to the new time interval.
    */
  var allow: Boolean = js.native
  /**
    * Gets the resized appointment's identifier.
    */
  var appointmentId: String = js.native
  /**
    * Gets a mouse event object related to the current appointment resizing operation.
    */
  var mouseEvent: js.Any = js.native
  /**
    * Gets the appointment's interval after resizing.
    */
  var newInterval: ASPxClientTimeInterval = js.native
  /**
    * Gets the appointment's interval before resizing.
    */
  var oldInterval: ASPxClientTimeInterval = js.native
}

