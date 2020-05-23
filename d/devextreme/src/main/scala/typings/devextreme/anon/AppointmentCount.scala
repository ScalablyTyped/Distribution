package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentCount extends js.Object {
  var appointmentCount: js.UndefOr[Double] = js.undefined
  var isCompact: js.UndefOr[Boolean] = js.undefined
}

object AppointmentCount {
  @scala.inline
  def apply(appointmentCount: js.UndefOr[Double] = js.undefined, isCompact: js.UndefOr[Boolean] = js.undefined): AppointmentCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appointmentCount)) __obj.updateDynamic("appointmentCount")(appointmentCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCompact)) __obj.updateDynamic("isCompact")(isCompact.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentCount]
  }
}

