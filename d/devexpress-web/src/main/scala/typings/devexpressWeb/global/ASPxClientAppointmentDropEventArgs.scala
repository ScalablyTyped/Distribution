package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
