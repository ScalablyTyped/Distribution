package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the AppointmentResizing event.
 */

trait ASPxClientAppointmentResizingEventArgs extends ASPxClientEventArgs {
  /**
       * Specifies whether or not an appointment can be resized to the new time interval.
       * Value: true to allow resizing the appointment; otherwise, false.
       */
  var allow: scala.Boolean
  /**
       * Gets the resized appointment's identifier.
       * Value: A string containing an appointment identifier.
       */
  var appointmentId: java.lang.String
  /**
       * Gets a mouse event object related to the current appointment resizing operation.
       * Value: An object providing event properties specific to mouse events.
       */
  var mouseEvent: js.Object
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
}

