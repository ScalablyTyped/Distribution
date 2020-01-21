package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentResize event.
  */
@JSGlobal("ASPxClientAppointmentResizeEventArgs")
@js.native
class ASPxClientAppointmentResizeEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientAppointmentResizeEventArgs class.
    * @param operation An ASPxClientAppointmentOperation object providing methods to perform or cancel the resize operation.
    * @param appointmentId A string containing an appointment identifier.
    * @param oldInterval An  object specifying the appointment's interval before the resize operation.
    * @param newInterval An  object specifying the appointment's interval after the resize operation.
    */
  def this(
    operation: ASPxClientAppointmentOperation,
    appointmentId: String,
    oldInterval: ASPxClientTimeInterval,
    newInterval: ASPxClientTimeInterval
  ) = this()
  /**
    * Gets the resized appointment's identifier.
    */
  var appointmentId: String = js.native
  /**
    * Gets or sets whether default event processing is required.
    */
  var handled: Boolean = js.native
  /**
    * Gets the appointment's interval after resizing.
    */
  var newInterval: ASPxClientTimeInterval = js.native
  /**
    * Gets the appointment's interval before resizing.
    */
  var oldInterval: ASPxClientTimeInterval = js.native
  /**
    * Provides access to an object that enables you to choose an operation to perform.
    */
  var operation: ASPxClientAppointmentOperation = js.native
}

