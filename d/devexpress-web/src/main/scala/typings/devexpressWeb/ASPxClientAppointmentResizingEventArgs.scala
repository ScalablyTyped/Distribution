package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentResizing event.
  */
trait ASPxClientAppointmentResizingEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies whether or not an appointment can be resized to the new time interval.
    */
  var allow: Boolean
  
  /**
    * Gets the resized appointment's identifier.
    */
  var appointmentId: String
  
  /**
    * Gets a mouse event object related to the current appointment resizing operation.
    */
  var mouseEvent: Any
  
  /**
    * Gets the appointment's interval after resizing.
    */
  var newInterval: ASPxClientTimeInterval
  
  /**
    * Gets the appointment's interval before resizing.
    */
  var oldInterval: ASPxClientTimeInterval
}
object ASPxClientAppointmentResizingEventArgs {
  
  inline def apply(
    allow: Boolean,
    appointmentId: String,
    mouseEvent: Any,
    newInterval: ASPxClientTimeInterval,
    oldInterval: ASPxClientTimeInterval
  ): ASPxClientAppointmentResizingEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], appointmentId = appointmentId.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any], newInterval = newInterval.asInstanceOf[js.Any], oldInterval = oldInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentResizingEventArgs]
  }
  
  extension [Self <: ASPxClientAppointmentResizingEventArgs](x: Self) {
    
    inline def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAppointmentId(value: String): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
    
    inline def setMouseEvent(value: Any): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
    
    inline def setNewInterval(value: ASPxClientTimeInterval): Self = StObject.set(x, "newInterval", value.asInstanceOf[js.Any])
    
    inline def setOldInterval(value: ASPxClientTimeInterval): Self = StObject.set(x, "oldInterval", value.asInstanceOf[js.Any])
  }
}
