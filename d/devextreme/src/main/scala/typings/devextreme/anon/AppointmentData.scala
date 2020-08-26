package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppointmentData extends js.Object {
  var appointmentData: js.UndefOr[js.Any] = js.native
  var targetedAppointmentData: js.UndefOr[js.Any] = js.native
}

object AppointmentData {
  @scala.inline
  def apply(): AppointmentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentData]
  }
  @scala.inline
  implicit class AppointmentDataOps[Self <: AppointmentData] (val x: Self) extends AnyVal {
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
    def setAppointmentData(value: js.Any): Self = this.set("appointmentData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppointmentData: Self = this.set("appointmentData", js.undefined)
    @scala.inline
    def setTargetedAppointmentData(value: js.Any): Self = this.set("targetedAppointmentData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetedAppointmentData: Self = this.set("targetedAppointmentData", js.undefined)
  }
  
}

