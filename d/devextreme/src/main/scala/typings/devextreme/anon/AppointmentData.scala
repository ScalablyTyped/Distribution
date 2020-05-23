package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentData extends js.Object {
  var appointmentData: js.UndefOr[js.Any] = js.undefined
  var targetedAppointmentData: js.UndefOr[js.Any] = js.undefined
}

object AppointmentData {
  @scala.inline
  def apply(appointmentData: js.Any = null, targetedAppointmentData: js.Any = null): AppointmentData = {
    val __obj = js.Dynamic.literal()
    if (appointmentData != null) __obj.updateDynamic("appointmentData")(appointmentData.asInstanceOf[js.Any])
    if (targetedAppointmentData != null) __obj.updateDynamic("targetedAppointmentData")(targetedAppointmentData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentData]
  }
}

