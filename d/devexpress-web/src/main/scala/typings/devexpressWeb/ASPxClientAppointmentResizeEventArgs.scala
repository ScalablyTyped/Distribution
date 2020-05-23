package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentResize event.
  */
trait ASPxClientAppointmentResizeEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the resized appointment's identifier.
    */
  var appointmentId: String
  /**
    * Gets or sets whether default event processing is required.
    */
  var handled: Boolean
  /**
    * Gets the appointment's interval after resizing.
    */
  var newInterval: ASPxClientTimeInterval
  /**
    * Gets the appointment's interval before resizing.
    */
  var oldInterval: ASPxClientTimeInterval
  /**
    * Provides access to an object that enables you to choose an operation to perform.
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
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], newInterval = newInterval.asInstanceOf[js.Any], oldInterval = oldInterval.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentResizeEventArgs]
  }
}

