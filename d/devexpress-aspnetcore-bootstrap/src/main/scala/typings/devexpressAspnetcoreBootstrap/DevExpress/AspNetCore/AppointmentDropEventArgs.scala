package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentDropEventArgs
  extends StObject
     with EventArgs {
  
  val dragInformation: js.Array[BootstrapSchedulerAppointmentDragInfo]
  
  var handled: Boolean
  
  val operation: BootstrapSchedulerAppointmentOperation
}
object AppointmentDropEventArgs {
  
  inline def apply(
    dragInformation: js.Array[BootstrapSchedulerAppointmentDragInfo],
    handled: Boolean,
    operation: BootstrapSchedulerAppointmentOperation,
    sender: Control
  ): AppointmentDropEventArgs = {
    val __obj = js.Dynamic.literal(dragInformation = dragInformation.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentDropEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentDropEventArgs] (val x: Self) extends AnyVal {
    
    inline def setDragInformation(value: js.Array[BootstrapSchedulerAppointmentDragInfo]): Self = StObject.set(x, "dragInformation", value.asInstanceOf[js.Any])
    
    inline def setDragInformationVarargs(value: BootstrapSchedulerAppointmentDragInfo*): Self = StObject.set(x, "dragInformation", js.Array(value*))
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: BootstrapSchedulerAppointmentOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
