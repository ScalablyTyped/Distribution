package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppointmentDeletingEventArgs extends CancelEventArgs {
  val appointmentIds: js.Array[js.Object] = js.native
}

object AppointmentDeletingEventArgs {
  @scala.inline
  def apply(appointmentIds: js.Array[js.Object], cancel: Boolean, sender: Control): AppointmentDeletingEventArgs = {
    val __obj = js.Dynamic.literal(appointmentIds = appointmentIds.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentDeletingEventArgs]
  }
  @scala.inline
  implicit class AppointmentDeletingEventArgsOps[Self <: AppointmentDeletingEventArgs] (val x: Self) extends AnyVal {
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
    def setAppointmentIdsVarargs(value: js.Object*): Self = this.set("appointmentIds", js.Array(value :_*))
    @scala.inline
    def setAppointmentIds(value: js.Array[js.Object]): Self = this.set("appointmentIds", value.asInstanceOf[js.Any])
  }
  
}

