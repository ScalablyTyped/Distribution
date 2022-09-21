package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentDrag event.
  */
@JSGlobal("ASPxClientAppointmentDragEventArgs")
@js.native
open class ASPxClientAppointmentDragEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientAppointmentDragEventArgs {
  /**
    * Initializes a new instance of the ASPxClientAppointmentDragEventArgs class.
    * @param mouseEvent A mouse event object related to the drag operation.
    * @param dragInformation An array of ASPxClientAppointmentDragInfo objects storing information about dragged appointments.
    */
  def this(mouseEvent: Any, dragInformation: js.Array[typings.devexpressWeb.ASPxClientAppointmentDragInfo]) = this()
  
  /**
    * Specifies whether or not appointments can be dropped into the intervals over which they are currently dragged.
    */
  /* CompleteClass */
  var allow: Boolean = js.native
  
  /**
    * Provides information about dragged appointments.
    */
  /* CompleteClass */
  var dragInformation: js.Array[typings.devexpressWeb.ASPxClientAppointmentDragInfo] = js.native
  
  /**
    * Gets a mouse event object related to the current drag operation.
    */
  /* CompleteClass */
  var mouseEvent: Any = js.native
}
