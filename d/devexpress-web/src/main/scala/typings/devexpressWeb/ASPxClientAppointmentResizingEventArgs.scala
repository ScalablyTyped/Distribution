package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentResizing event.
  */
trait ASPxClientAppointmentResizingEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies whether or not an appointment can be resized to the new time interval.
    */
  var allow: Boolean
  /**
    * Gets the resized appointment's identifier.
    */
  var appointmentId: String
  /**
    * Gets a mouse event object related to the current appointment resizing operation.
    */
  var mouseEvent: js.Any
  /**
    * Gets the appointment's interval after resizing.
    */
  var newInterval: ASPxClientTimeInterval
  /**
    * Gets the appointment's interval before resizing.
    */
  var oldInterval: ASPxClientTimeInterval
}

object ASPxClientAppointmentResizingEventArgs {
  @scala.inline
  def apply(
    allow: Boolean,
    appointmentId: String,
    mouseEvent: js.Any,
    newInterval: ASPxClientTimeInterval,
    oldInterval: ASPxClientTimeInterval
  ): ASPxClientAppointmentResizingEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], appointmentId = appointmentId.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any], newInterval = newInterval.asInstanceOf[js.Any], oldInterval = oldInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentResizingEventArgs]
  }
}

