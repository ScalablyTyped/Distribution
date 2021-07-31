package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentResizeEventArgs
  extends StObject
     with EventArgs {
  
  val appointmentId: String
  
  var handled: Boolean
  
  val newInterval: BootstrapTimeInterval
  
  val oldInterval: BootstrapTimeInterval
  
  val operation: BootstrapSchedulerAppointmentOperation
}
object AppointmentResizeEventArgs {
  
  @scala.inline
  def apply(
    appointmentId: String,
    handled: Boolean,
    newInterval: BootstrapTimeInterval,
    oldInterval: BootstrapTimeInterval,
    operation: BootstrapSchedulerAppointmentOperation,
    sender: Control
  ): AppointmentResizeEventArgs = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], newInterval = newInterval.asInstanceOf[js.Any], oldInterval = oldInterval.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentResizeEventArgs]
  }
  
  @scala.inline
  implicit class AppointmentResizeEventArgsMutableBuilder[Self <: AppointmentResizeEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointmentId(value: String): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewInterval(value: BootstrapTimeInterval): Self = StObject.set(x, "newInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldInterval(value: BootstrapTimeInterval): Self = StObject.set(x, "oldInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: BootstrapSchedulerAppointmentOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
