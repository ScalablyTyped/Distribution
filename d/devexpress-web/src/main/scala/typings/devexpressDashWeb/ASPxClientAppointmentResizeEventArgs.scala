package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the AppointmentResize event.
  */
trait ASPxClientAppointmentResizeEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the resized appointment's identifier.
    * Value: A string containing an appointment identifier.
    */
  var appointmentId: String
  /**
    * Gets or sets whether default event processing is required.
    * Value: true to process an event using only custom code; otherwise, false.
    */
  var handled: Boolean
  /**
    * Gets the appointment's interval after resizing.
    * Value: An <see cref="ASPxClientTimeInterval" /> object representing the interval assigned to the appointment.
    */
  var newInterval: ASPxClientTimeInterval
  /**
    * Gets the appointment's interval before resizing.
    * Value: An <see cref="ASPxClientTimeInterval" /> object representing the interval assigned to the appointment.
    */
  var oldInterval: ASPxClientTimeInterval
  /**
    * Provides access to an object that enables you to choose an operation to perform.
    * Value: An ASPxClientAppointmentOperation object providing methods to perform the required operation.
    */
  var operation: ASPxClientAppointmentOperation
}

object ASPxClientAppointmentResizeEventArgs {
  @scala.inline
  def apply(
    appointmentId: String,
    handled: Boolean,
    newInterval: ASPxClientTimeInterval,
    oldInterval: ASPxClientTimeInterval,
    operation: ASPxClientAppointmentOperation
  ): ASPxClientAppointmentResizeEventArgs = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId, handled = handled, newInterval = newInterval, oldInterval = oldInterval, operation = operation)
  
    __obj.asInstanceOf[ASPxClientAppointmentResizeEventArgs]
  }
}

