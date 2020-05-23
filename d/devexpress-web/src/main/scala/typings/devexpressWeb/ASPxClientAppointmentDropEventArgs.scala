package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentDrop event.
  */
trait ASPxClientAppointmentDropEventArgs extends ASPxClientEventArgs {
  /**
    * Provides information about dropped appointments.
    */
  var dragInformation: js.Array[ASPxClientAppointmentDragInfo]
  /**
    * Gets or sets a value that specifies whether the event is handled, and the default processing is not required.
    */
  var handled: Boolean
  /**
    * Provides access to an object that enables you to choose an operation to perform.
    */
  var operation: ASPxClientAppointmentOperation
}

object ASPxClientAppointmentDropEventArgs {
  @scala.inline
  def apply(
    dragInformation: js.Array[ASPxClientAppointmentDragInfo],
    handled: Boolean,
    operation: ASPxClientAppointmentOperation
  ): ASPxClientAppointmentDropEventArgs = {
    val __obj = js.Dynamic.literal(dragInformation = dragInformation.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentDropEventArgs]
  }
}

