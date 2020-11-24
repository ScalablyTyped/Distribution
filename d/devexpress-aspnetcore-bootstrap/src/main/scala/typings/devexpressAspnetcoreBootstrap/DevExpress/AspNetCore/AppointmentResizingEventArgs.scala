package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentResizingEventArgs extends EventArgs {
  
  var allow: Boolean = js.native
  
  val appointmentId: String = js.native
  
  val mouseEvent: js.Any = js.native
  
  val newInterval: BootstrapTimeInterval = js.native
  
  val oldInterval: BootstrapTimeInterval = js.native
}
object AppointmentResizingEventArgs {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AppointmentResizingEventArgsOps[Self <: AppointmentResizingEventArgs] (val x: Self) extends AnyVal {
    
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
    def setAppointmentId(value: String): Self = this.set("appointmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEvent(value: js.Any): Self = this.set("mouseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewInterval(value: BootstrapTimeInterval): Self = this.set("newInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldInterval(value: BootstrapTimeInterval): Self = this.set("oldInterval", value.asInstanceOf[js.Any])
  }
}
