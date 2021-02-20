package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentDragEventArgs extends EventArgs {
  
  var allow: Boolean = js.native
  
  val dragInformation: js.Array[BootstrapSchedulerAppointmentDragInfo] = js.native
  
  val mouseEvent: js.Any = js.native
}
object AppointmentDragEventArgs {
  
  @scala.inline
  def apply(
    allow: Boolean,
    dragInformation: js.Array[BootstrapSchedulerAppointmentDragInfo],
    mouseEvent: js.Any,
    sender: Control
  ): AppointmentDragEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], dragInformation = dragInformation.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentDragEventArgs]
  }
  
  @scala.inline
  implicit class AppointmentDragEventArgsMutableBuilder[Self <: AppointmentDragEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragInformation(value: js.Array[BootstrapSchedulerAppointmentDragInfo]): Self = StObject.set(x, "dragInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragInformationVarargs(value: BootstrapSchedulerAppointmentDragInfo*): Self = StObject.set(x, "dragInformation", js.Array(value :_*))
    
    @scala.inline
    def setMouseEvent(value: js.Any): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
  }
}
