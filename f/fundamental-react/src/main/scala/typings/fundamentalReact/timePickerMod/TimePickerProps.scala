package typings.fundamentalReact.timePickerMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.Hour
import typings.fundamentalReact.anon.MeridiemPM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  buttonProps ? :{[x: string] : any},   disabled ? :boolean,   id ? :string,   inputProps ? :{[x: string] : any},   localizedText ? :{  meridiemAM  :string,   meridiemPM  :string},   popoverProps ? :{[x: string] : any},   timeProps ? :{[x: string] : any},   value ? :string, onChange ? (args : ...any): any, [x: string] : any} & fundamental-react.fundamental-react/lib/Time/Time.TimeBaseProps */
trait TimePickerProps
  extends /* x */ StringDictionary[js.Any] {
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var format12Hours: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var localizedText: js.UndefOr[MeridiemPM] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var popoverProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var showHour: js.UndefOr[Boolean] = js.undefined
  var showMinute: js.UndefOr[Boolean] = js.undefined
  var showSecond: js.UndefOr[Boolean] = js.undefined
  var spinners: js.UndefOr[Boolean] = js.undefined
  var time: js.UndefOr[Hour] = js.undefined
  var timeProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TimePickerProps {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    buttonProps: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    format12Hours: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inputProps: StringDictionary[js.Any] = null,
    localizedText: MeridiemPM = null,
    onChange: /* repeated */ js.Any => _ = null,
    popoverProps: StringDictionary[js.Any] = null,
    showHour: js.UndefOr[Boolean] = js.undefined,
    showMinute: js.UndefOr[Boolean] = js.undefined,
    showSecond: js.UndefOr[Boolean] = js.undefined,
    spinners: js.UndefOr[Boolean] = js.undefined,
    time: Hour = null,
    timeProps: StringDictionary[js.Any] = null,
    value: String = null
  ): TimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(format12Hours)) __obj.updateDynamic("format12Hours")(format12Hours.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (!js.isUndefined(showHour)) __obj.updateDynamic("showHour")(showHour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinute)) __obj.updateDynamic("showMinute")(showMinute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSecond)) __obj.updateDynamic("showSecond")(showSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spinners)) __obj.updateDynamic("spinners")(spinners.get.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (timeProps != null) __obj.updateDynamic("timeProps")(timeProps.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerProps]
  }
}

