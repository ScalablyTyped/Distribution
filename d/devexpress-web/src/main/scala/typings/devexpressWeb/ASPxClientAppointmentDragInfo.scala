package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores information about an appointment drag operation.
  */
trait ASPxClientAppointmentDragInfo extends js.Object {
  /**
    * Gets the dragged appointment's identifier.
    */
  var appointmentId: String
  /**
    * Gets the appointment's interval after the drag operation.
    */
  var newInterval: ASPxClientTimeInterval
  /**
    * Gets resources associated with the appointment after the drag operation.
    */
  var newResources: js.Array[String]
  /**
    * Gets the appointment's interval before the drag operation.
    */
  var oldInterval: ASPxClientTimeInterval
  /**
    * Gets resources that were associated with the appointment before the drag operation.
    */
  var oldResources: js.Array[String]
}

object ASPxClientAppointmentDragInfo {
  @scala.inline
  def apply(
    appointmentId: String,
    newInterval: ASPxClientTimeInterval,
    newResources: js.Array[String],
    oldInterval: ASPxClientTimeInterval,
    oldResources: js.Array[String]
  ): ASPxClientAppointmentDragInfo = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], newInterval = newInterval.asInstanceOf[js.Any], newResources = newResources.asInstanceOf[js.Any], oldInterval = oldInterval.asInstanceOf[js.Any], oldResources = oldResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentDragInfo]
  }
}

