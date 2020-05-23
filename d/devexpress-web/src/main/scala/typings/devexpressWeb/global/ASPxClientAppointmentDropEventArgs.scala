package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentDrop event.
  */
@JSGlobal("ASPxClientAppointmentDropEventArgs")
@js.native
class ASPxClientAppointmentDropEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientAppointmentDropEventArgs {
  /**
    * Initializes a new instance of the ASPxClientAppointmentDropEventArgs class.
    * @param operation An ASPxClientAppointmentOperation object providing methods to perform or cancel the drag operation.
    * @param dragInformation An array of ASPxClientAppointmentDragInfo objects storing information about dropped appointments.
    */
  def this(
    operation: typings.devexpressWeb.ASPxClientAppointmentOperation,
    dragInformation: js.Array[typings.devexpressWeb.ASPxClientAppointmentDragInfo]
  ) = this()
  /**
    * Provides information about dropped appointments.
    */
  /* CompleteClass */
  override var dragInformation: js.Array[typings.devexpressWeb.ASPxClientAppointmentDragInfo] = js.native
  /**
    * Gets or sets a value that specifies whether the event is handled, and the default processing is not required.
    */
  /* CompleteClass */
  override var handled: Boolean = js.native
  /**
    * Provides access to an object that enables you to choose an operation to perform.
    */
  /* CompleteClass */
  override var operation: typings.devexpressWeb.ASPxClientAppointmentOperation = js.native
}

