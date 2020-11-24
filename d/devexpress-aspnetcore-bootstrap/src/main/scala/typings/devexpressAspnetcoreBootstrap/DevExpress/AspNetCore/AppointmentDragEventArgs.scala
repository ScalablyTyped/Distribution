package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

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
  implicit class AppointmentDragEventArgsOps[Self <: AppointmentDragEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllow(value: Boolean): Self = this.set("allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragInformationVarargs(value: BootstrapSchedulerAppointmentDragInfo*): Self = this.set("dragInformation", js.Array(value :_*))
    
    @scala.inline
    def setDragInformation(value: js.Array[BootstrapSchedulerAppointmentDragInfo]): Self = this.set("dragInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEvent(value: js.Any): Self = this.set("mouseEvent", value.asInstanceOf[js.Any])
  }
}
