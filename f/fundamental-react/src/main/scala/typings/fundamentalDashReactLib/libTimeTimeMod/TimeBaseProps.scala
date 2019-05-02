package typings
package fundamentalDashReactLib.libTimeTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeBaseProps extends js.Object {
  /* Set to **true** to use the 12-hour clock (hours ranging from 01 to 12) and to display a meridiem control. */
  var format12Hours: js.UndefOr[scala.Boolean] = js.undefined
  /* Enables the input for hours. */
  var showHour: js.UndefOr[scala.Boolean] = js.undefined
  /* Enables the input for minutes. */
  var showMinute: js.UndefOr[scala.Boolean] = js.undefined
  /* Enables the input for seconds. */
  var showSecond: js.UndefOr[scala.Boolean] = js.undefined
  /* Set to **true** to show up/down buttons for each input. */
  var spinners: js.UndefOr[scala.Boolean] = js.undefined
  /* The time component values. Contains four properties:
    **hour** (with values from 01 to 12 when `format12Hours` is true or 00 to 23 when `format12Hours` is false),
    **minute** (with values from 00 to 59), **second** (with values from 00 to 59),
    **meridiem** (with values 0 for AM or 1 for PM). */
  var time: js.UndefOr[fundamentalDashReactLib.Anon_0] = js.undefined
}

object TimeBaseProps {
  @scala.inline
  def apply(
    format12Hours: js.UndefOr[scala.Boolean] = js.undefined,
    showHour: js.UndefOr[scala.Boolean] = js.undefined,
    showMinute: js.UndefOr[scala.Boolean] = js.undefined,
    showSecond: js.UndefOr[scala.Boolean] = js.undefined,
    spinners: js.UndefOr[scala.Boolean] = js.undefined,
    time: fundamentalDashReactLib.Anon_0 = null
  ): TimeBaseProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(format12Hours)) __obj.updateDynamic("format12Hours")(format12Hours)
    if (!js.isUndefined(showHour)) __obj.updateDynamic("showHour")(showHour)
    if (!js.isUndefined(showMinute)) __obj.updateDynamic("showMinute")(showMinute)
    if (!js.isUndefined(showSecond)) __obj.updateDynamic("showSecond")(showSecond)
    if (!js.isUndefined(spinners)) __obj.updateDynamic("spinners")(spinners)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[TimeBaseProps]
  }
}

