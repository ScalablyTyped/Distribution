package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentToolTipShowingEventArgs extends CancelEventArgs {
  
  val appointment: BootstrapSchedulerAppointment = js.native
}
object AppointmentToolTipShowingEventArgs {
  
  @scala.inline
  def apply(appointment: BootstrapSchedulerAppointment, cancel: Boolean, sender: Control): AppointmentToolTipShowingEventArgs = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentToolTipShowingEventArgs]
  }
  
  @scala.inline
  implicit class AppointmentToolTipShowingEventArgsOps[Self <: AppointmentToolTipShowingEventArgs] (val x: Self) extends AnyVal {
    
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
    def setAppointment(value: BootstrapSchedulerAppointment): Self = this.set("appointment", value.asInstanceOf[js.Any])
  }
}
