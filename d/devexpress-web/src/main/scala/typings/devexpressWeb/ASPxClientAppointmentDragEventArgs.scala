package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentDrag event.
  */
trait ASPxClientAppointmentDragEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies whether or not appointments can be dropped into the intervals over which they are currently dragged.
    */
  var allow: Boolean
  
  /**
    * Provides information about dragged appointments.
    */
  var dragInformation: js.Array[ASPxClientAppointmentDragInfo]
  
  /**
    * Gets a mouse event object related to the current drag operation.
    */
  var mouseEvent: Any
}
object ASPxClientAppointmentDragEventArgs {
  
  inline def apply(allow: Boolean, dragInformation: js.Array[ASPxClientAppointmentDragInfo], mouseEvent: Any): ASPxClientAppointmentDragEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], dragInformation = dragInformation.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentDragEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientAppointmentDragEventArgs] (val x: Self) extends AnyVal {
    
    inline def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setDragInformation(value: js.Array[ASPxClientAppointmentDragInfo]): Self = StObject.set(x, "dragInformation", value.asInstanceOf[js.Any])
    
    inline def setDragInformationVarargs(value: ASPxClientAppointmentDragInfo*): Self = StObject.set(x, "dragInformation", js.Array(value*))
    
    inline def setMouseEvent(value: Any): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
  }
}
