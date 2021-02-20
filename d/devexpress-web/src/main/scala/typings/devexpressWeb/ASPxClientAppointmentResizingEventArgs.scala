package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentResizing event.
  */
@js.native
trait ASPxClientAppointmentResizingEventArgs extends ASPxClientEventArgs {
  
  /**
    * Specifies whether or not an appointment can be resized to the new time interval.
    */
  var allow: Boolean = js.native
  
  /**
    * Gets the resized appointment's identifier.
    */
  var appointmentId: String = js.native
  
  /**
    * Gets a mouse event object related to the current appointment resizing operation.
    */
  var mouseEvent: js.Any = js.native
  
  /**
    * Gets the appointment's interval after resizing.
    */
  var newInterval: ASPxClientTimeInterval = js.native
  
  /**
    * Gets the appointment's interval before resizing.
    */
  var oldInterval: ASPxClientTimeInterval = js.native
}
object ASPxClientAppointmentResizingEventArgs {
  
  @scala.inline
  def apply(
    allow: Boolean,
    appointmentId: String,
    mouseEvent: js.Any,
    newInterval: ASPxClientTimeInterval,
    oldInterval: ASPxClientTimeInterval
  ): ASPxClientAppointmentResizingEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], appointmentId = appointmentId.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any], newInterval = newInterval.asInstanceOf[js.Any], oldInterval = oldInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentResizingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientAppointmentResizingEventArgsMutableBuilder[Self <: ASPxClientAppointmentResizingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentId(value: String): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEvent(value: js.Any): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewInterval(value: ASPxClientTimeInterval): Self = StObject.set(x, "newInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldInterval(value: ASPxClientTimeInterval): Self = StObject.set(x, "oldInterval", value.asInstanceOf[js.Any])
  }
}
