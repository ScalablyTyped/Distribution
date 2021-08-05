package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentResizingEventArgs
  extends StObject
     with EventArgs {
  
  var allow: Boolean
  
  val appointmentId: String
  
  val mouseEvent: js.Any
  
  val newInterval: BootstrapTimeInterval
  
  val oldInterval: BootstrapTimeInterval
}
object AppointmentResizingEventArgs {
  
  inline def apply(
    allow: Boolean,
    appointmentId: String,
    mouseEvent: js.Any,
    newInterval: BootstrapTimeInterval,
    oldInterval: BootstrapTimeInterval,
    sender: Control
  ): AppointmentResizingEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], appointmentId = appointmentId.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any], newInterval = newInterval.asInstanceOf[js.Any], oldInterval = oldInterval.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentResizingEventArgs]
  }
  
  extension [Self <: AppointmentResizingEventArgs](x: Self) {
    
    inline def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAppointmentId(value: String): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
    
    inline def setMouseEvent(value: js.Any): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
    
    inline def setNewInterval(value: BootstrapTimeInterval): Self = StObject.set(x, "newInterval", value.asInstanceOf[js.Any])
    
    inline def setOldInterval(value: BootstrapTimeInterval): Self = StObject.set(x, "oldInterval", value.asInstanceOf[js.Any])
  }
}
