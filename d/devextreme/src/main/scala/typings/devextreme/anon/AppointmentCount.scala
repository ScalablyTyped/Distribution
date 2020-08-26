package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppointmentCount extends js.Object {
  var appointmentCount: js.UndefOr[Double] = js.native
  var isCompact: js.UndefOr[Boolean] = js.native
}

object AppointmentCount {
  @scala.inline
  def apply(): AppointmentCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentCount]
  }
  @scala.inline
  implicit class AppointmentCountOps[Self <: AppointmentCount] (val x: Self) extends AnyVal {
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
    def setAppointmentCount(value: Double): Self = this.set("appointmentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppointmentCount: Self = this.set("appointmentCount", js.undefined)
    @scala.inline
    def setIsCompact(value: Boolean): Self = this.set("isCompact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCompact: Self = this.set("isCompact", js.undefined)
  }
  
}

