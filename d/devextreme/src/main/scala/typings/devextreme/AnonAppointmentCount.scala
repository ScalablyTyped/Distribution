package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppointmentCount extends js.Object {
  var appointmentCount: js.UndefOr[Double] = js.undefined
  var isCompact: js.UndefOr[Boolean] = js.undefined
}

object AnonAppointmentCount {
  @scala.inline
  def apply(appointmentCount: Int | Double = null, isCompact: js.UndefOr[Boolean] = js.undefined): AnonAppointmentCount = {
    val __obj = js.Dynamic.literal()
    if (appointmentCount != null) __obj.updateDynamic("appointmentCount")(appointmentCount.asInstanceOf[js.Any])
    if (!js.isUndefined(isCompact)) __obj.updateDynamic("isCompact")(isCompact.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppointmentCount]
  }
}

