package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Stores information about an appointment drag operation.
 */

trait ASPxClientAppointmentDragInfo extends js.Object {
  /**
       * Gets the dragged appointment's identifier.
       * Value: A string containing an appointment identifier.
       */
  var appointmentId: java.lang.String
  /**
       * Gets the appointment's interval after the drag operation.
       * Value: An <see cref="ASPxClientTimeInterval" /> object representing the interval assigned to the appointment.
       */
  var newInterval: ASPxClientTimeInterval
  /**
       * Gets resources associated with the appointment after the drag operation.
       * Value: An array of strings containing resource identifiers.
       */
  var newResources: js.Array[java.lang.String]
  /**
       * Gets the appointment's interval before the drag operation.
       * Value: An <see cref="ASPxClientTimeInterval" /> object representing the interval assigned to the appointment.
       */
  var oldInterval: ASPxClientTimeInterval
  /**
       * Gets resources that were associated with the appointment before the drag operation.
       * Value: A array of strings containing resource identifiers.
       */
  var oldResources: js.Array[java.lang.String]
}

