package typings.ejWebAll.ej.DateTimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeDrillDown extends js.Object {
  /** After choosing the time, the popup will close automatically if we set it as true, otherwise we focus out the DateTimePicker or choose timeNow button for closing the popup.
    */
  var autoClose: js.UndefOr[Boolean] = js.undefined
  /** This is the field to show/hide the timeDrillDown in DateTimePicker.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Sets the interval time of minutes on selected date.
    */
  var interval: js.UndefOr[Double] = js.undefined
  /** Allows the user to show or hide the meridian with time in DateTimePicker.
    */
  var showMeridian: js.UndefOr[Boolean] = js.undefined
}

object TimeDrillDown {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined,
    showMeridian: js.UndefOr[Boolean] = js.undefined
  ): TimeDrillDown = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMeridian)) __obj.updateDynamic("showMeridian")(showMeridian.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeDrillDown]
  }
}

