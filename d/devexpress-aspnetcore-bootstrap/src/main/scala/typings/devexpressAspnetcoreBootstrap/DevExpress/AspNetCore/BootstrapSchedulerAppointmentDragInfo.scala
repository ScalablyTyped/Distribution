package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapSchedulerAppointmentDragInfo extends js.Object {
  
  val appointmentId: String = js.native
  
  val instance: js.Any = js.native
  
  val newInterval: BootstrapTimeInterval | Null = js.native
  
  val oldInterval: BootstrapTimeInterval | Null = js.native
}
object BootstrapSchedulerAppointmentDragInfo {
  
  @scala.inline
  def apply(appointmentId: String, instance: js.Any): BootstrapSchedulerAppointmentDragInfo = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSchedulerAppointmentDragInfo]
  }
  
  @scala.inline
  implicit class BootstrapSchedulerAppointmentDragInfoOps[Self <: BootstrapSchedulerAppointmentDragInfo] (val x: Self) extends AnyVal {
    
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
    def setAppointmentId(value: String): Self = this.set("appointmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: js.Any): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewInterval(value: BootstrapTimeInterval): Self = this.set("newInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewIntervalNull: Self = this.set("newInterval", null)
    
    @scala.inline
    def setOldInterval(value: BootstrapTimeInterval): Self = this.set("oldInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldIntervalNull: Self = this.set("oldInterval", null)
  }
}
