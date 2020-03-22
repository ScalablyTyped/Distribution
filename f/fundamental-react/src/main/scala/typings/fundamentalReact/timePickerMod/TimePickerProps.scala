package typings.fundamentalReact.timePickerMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.AnonHour
import typings.fundamentalReact.AnonMeridiemAM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  buttonProps ? :{[x: string] : any},   disabled ? :boolean,   id ? :string,   inputProps ? :{[x: string] : any},   localizedText ? :{  meridiemAM  :string,   meridiemPM  :string},   popoverProps ? :{[x: string] : any},   timeProps ? :{[x: string] : any},   value ? :string, [x: string] : any} & fundamental-react.fundamental-react/lib/Time/Time.TimeBaseProps */
trait TimePickerProps
  extends /* x */ StringDictionary[js.Any] {
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to use the 12-hour clock (hours ranging from 01 to 12) and to display a meridiem control. */
  var format12Hours: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var localizedText: js.UndefOr[AnonMeridiemAM] = js.undefined
  var popoverProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
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
  /* Additional props to be spread to the `Time` component. */
  var timeProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Initial time value for the input. */
  var value: js.UndefOr[String] = js.undefined
}

object TimePickerProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    buttonProps: StringDictionary[js.Any] = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    format12Hours: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inputProps: StringDictionary[js.Any] = null,
    localizedText: AnonMeridiemAM = null,
    popoverProps: StringDictionary[js.Any] = null,
    showHour: js.UndefOr[Boolean] = js.undefined,
    showMinute: js.UndefOr[Boolean] = js.undefined,
    showSecond: js.UndefOr[Boolean] = js.undefined,
    spinners: js.UndefOr[Boolean] = js.undefined,
    time: AnonHour = null,
    timeProps: StringDictionary[js.Any] = null,
    value: String = null
  ): TimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(format12Hours)) __obj.updateDynamic("format12Hours")(format12Hours.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (!js.isUndefined(showHour)) __obj.updateDynamic("showHour")(showHour.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinute)) __obj.updateDynamic("showMinute")(showMinute.asInstanceOf[js.Any])
    if (!js.isUndefined(showSecond)) __obj.updateDynamic("showSecond")(showSecond.asInstanceOf[js.Any])
    if (!js.isUndefined(spinners)) __obj.updateDynamic("spinners")(spinners.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (timeProps != null) __obj.updateDynamic("timeProps")(timeProps.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerProps]
  }
}

