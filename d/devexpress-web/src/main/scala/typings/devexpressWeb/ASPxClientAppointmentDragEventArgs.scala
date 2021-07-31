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
  var mouseEvent: js.Any
}
object ASPxClientAppointmentDragEventArgs {
  
  @scala.inline
  def apply(allow: Boolean, dragInformation: js.Array[ASPxClientAppointmentDragInfo], mouseEvent: js.Any): ASPxClientAppointmentDragEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], dragInformation = dragInformation.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentDragEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientAppointmentDragEventArgsMutableBuilder[Self <: ASPxClientAppointmentDragEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragInformation(value: js.Array[ASPxClientAppointmentDragInfo]): Self = StObject.set(x, "dragInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragInformationVarargs(value: ASPxClientAppointmentDragInfo*): Self = StObject.set(x, "dragInformation", js.Array(value :_*))
    
    @scala.inline
    def setMouseEvent(value: js.Any): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
  }
}
