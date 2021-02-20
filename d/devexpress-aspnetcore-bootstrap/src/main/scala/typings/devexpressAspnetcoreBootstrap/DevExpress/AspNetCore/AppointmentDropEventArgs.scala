package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentDropEventArgs extends EventArgs {
  
  val dragInformation: js.Array[BootstrapSchedulerAppointmentDragInfo] = js.native
  
  var handled: Boolean = js.native
  
  val operation: BootstrapSchedulerAppointmentOperation = js.native
}
object AppointmentDropEventArgs {
  
  @scala.inline
  def apply(
    dragInformation: js.Array[BootstrapSchedulerAppointmentDragInfo],
    handled: Boolean,
    operation: BootstrapSchedulerAppointmentOperation,
    sender: Control
  ): AppointmentDropEventArgs = {
    val __obj = js.Dynamic.literal(dragInformation = dragInformation.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentDropEventArgs]
  }
  
  @scala.inline
  implicit class AppointmentDropEventArgsMutableBuilder[Self <: AppointmentDropEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragInformation(value: js.Array[BootstrapSchedulerAppointmentDragInfo]): Self = StObject.set(x, "dragInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragInformationVarargs(value: BootstrapSchedulerAppointmentDragInfo*): Self = StObject.set(x, "dragInformation", js.Array(value :_*))
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: BootstrapSchedulerAppointmentOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
