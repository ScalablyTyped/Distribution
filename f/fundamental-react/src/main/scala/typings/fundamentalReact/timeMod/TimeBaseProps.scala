package typings.fundamentalReact.timeMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.AnonHour
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeBaseProps extends js.Object {
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to use the 12-hour clock (hours ranging from 01 to 12) and to display a meridiem control. */
  var format12Hours: js.UndefOr[Boolean] = js.undefined
  /* Enables the input for hours. */
  var showHour: js.UndefOr[Boolean] = js.undefined
  /* Enables the input for minutes. */
  var showMinute: js.UndefOr[Boolean] = js.undefined
  /* Enables the input for seconds. */
  var showSecond: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to show up/down buttons for each input. */
  var spinners: js.UndefOr[Boolean] = js.undefined
  /* The time component values. Contains four properties:
    **hour** (with values from 01 to 12 when `format12Hours` is true or 00 to 23 when `format12Hours` is false),
    **minute** (with values from 00 to 59), **second** (with values from 00 to 59),
    **meridiem** (with values 0 for AM or 1 for PM). */
  var time: js.UndefOr[AnonHour] = js.undefined
}

object TimeBaseProps {
  @scala.inline
  def apply(
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    format12Hours: js.UndefOr[Boolean] = js.undefined,
    showHour: js.UndefOr[Boolean] = js.undefined,
    showMinute: js.UndefOr[Boolean] = js.undefined,
    showSecond: js.UndefOr[Boolean] = js.undefined,
    spinners: js.UndefOr[Boolean] = js.undefined,
    time: AnonHour = null
  ): TimeBaseProps = {
    val __obj = js.Dynamic.literal()
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(format12Hours)) __obj.updateDynamic("format12Hours")(format12Hours.asInstanceOf[js.Any])
    if (!js.isUndefined(showHour)) __obj.updateDynamic("showHour")(showHour.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinute)) __obj.updateDynamic("showMinute")(showMinute.asInstanceOf[js.Any])
    if (!js.isUndefined(showSecond)) __obj.updateDynamic("showSecond")(showSecond.asInstanceOf[js.Any])
    if (!js.isUndefined(spinners)) __obj.updateDynamic("spinners")(spinners.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeBaseProps]
  }
}

