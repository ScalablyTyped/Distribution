package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the AppointmentDrop event.
  */
trait ASPxClientAppointmentDropEventArgs extends ASPxClientEventArgs {
  /**
    * Provides information about dropped appointments.
    * Value: An array of ASPxClientAppointmentDragInfo objects storing information about dropped appointments.
    */
  var dragInformation: js.Array[ASPxClientAppointmentDragInfo]
  /**
    * Gets or sets a value that specifies whether the event is handled, and the default processing is not required.
    * Value: true, if if the event is completely handled by custom code and no default processing is required; otherwise, false.
    */
  var handled: scala.Boolean
  /**
    * Provides access to an object that enables you to choose an operation to perform.
    * Value: An ASPxClientAppointmentOperation object providing methods to perform the required operation.
    */
  var operation: ASPxClientAppointmentOperation
}

object ASPxClientAppointmentDropEventArgs {
  @scala.inline
  def apply(
    dragInformation: js.Array[ASPxClientAppointmentDragInfo],
    handled: scala.Boolean,
    operation: ASPxClientAppointmentOperation
  ): ASPxClientAppointmentDropEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dragInformation")(dragInformation)
    __obj.updateDynamic("handled")(handled)
    __obj.updateDynamic("operation")(operation)
    __obj.asInstanceOf[ASPxClientAppointmentDropEventArgs]
  }
}

