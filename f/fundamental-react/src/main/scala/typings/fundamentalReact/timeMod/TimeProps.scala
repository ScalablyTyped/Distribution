package typings.fundamentalReact.timeMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.AnonHour
import typings.fundamentalReact.AnonMeridiemAM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  disabled ? :boolean,   hoursDownButtonProps ? :any,   hoursInputProps ? :any,   hoursUpButtonProps ? :any,   id ? :string,   localizedText ? :{  meridiemAM ? :string,   meridiemPM ? :string},   meridiemDownButtonProps ? :any,   meridiemInputProps ? :any,   meridiemUpButtonProps ? :any,   minutesDownButtonProps ? :any,   minutesInputProps ? :any,   minutesUpButtonProps ? :any,   secondsDownButtonProps ? :any,   secondsInputProps ? :any,   secondsUpButtonProps ? :any, onChange ? (time : {  hour  :string,   minute  :string,   second  :string,   meridiem  :0 | 1}): void, [x: string] : any} & fundamental-react.fundamental-react/lib/Time/Time.TimeBaseProps */
trait TimeProps
  extends /* x */ StringDictionary[js.Any] {
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var format12Hours: js.UndefOr[Boolean] = js.undefined
  var hoursDownButtonProps: js.UndefOr[js.Any] = js.undefined
  var hoursInputProps: js.UndefOr[js.Any] = js.undefined
  var hoursUpButtonProps: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var localizedText: js.UndefOr[AnonMeridiemAM] = js.undefined
  var meridiemDownButtonProps: js.UndefOr[js.Any] = js.undefined
  var meridiemInputProps: js.UndefOr[js.Any] = js.undefined
  var meridiemUpButtonProps: js.UndefOr[js.Any] = js.undefined
  var minutesDownButtonProps: js.UndefOr[js.Any] = js.undefined
  var minutesInputProps: js.UndefOr[js.Any] = js.undefined
  var minutesUpButtonProps: js.UndefOr[js.Any] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* time */ AnonHour, Unit]] = js.undefined
  var secondsDownButtonProps: js.UndefOr[js.Any] = js.undefined
  var secondsInputProps: js.UndefOr[js.Any] = js.undefined
  var secondsUpButtonProps: js.UndefOr[js.Any] = js.undefined
  var showHour: js.UndefOr[Boolean] = js.undefined
  var showMinute: js.UndefOr[Boolean] = js.undefined
  var showSecond: js.UndefOr[Boolean] = js.undefined
  var spinners: js.UndefOr[Boolean] = js.undefined
  var time: js.UndefOr[AnonHour] = js.undefined
}

object TimeProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    format12Hours: js.UndefOr[Boolean] = js.undefined,
    hoursDownButtonProps: js.Any = null,
    hoursInputProps: js.Any = null,
    hoursUpButtonProps: js.Any = null,
    id: String = null,
    localizedText: AnonMeridiemAM = null,
    meridiemDownButtonProps: js.Any = null,
    meridiemInputProps: js.Any = null,
    meridiemUpButtonProps: js.Any = null,
    minutesDownButtonProps: js.Any = null,
    minutesInputProps: js.Any = null,
    minutesUpButtonProps: js.Any = null,
    onChange: /* time */ AnonHour => Unit = null,
    secondsDownButtonProps: js.Any = null,
    secondsInputProps: js.Any = null,
    secondsUpButtonProps: js.Any = null,
    showHour: js.UndefOr[Boolean] = js.undefined,
    showMinute: js.UndefOr[Boolean] = js.undefined,
    showSecond: js.UndefOr[Boolean] = js.undefined,
    spinners: js.UndefOr[Boolean] = js.undefined,
    time: AnonHour = null
  ): TimeProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(format12Hours)) __obj.updateDynamic("format12Hours")(format12Hours.asInstanceOf[js.Any])
    if (hoursDownButtonProps != null) __obj.updateDynamic("hoursDownButtonProps")(hoursDownButtonProps.asInstanceOf[js.Any])
    if (hoursInputProps != null) __obj.updateDynamic("hoursInputProps")(hoursInputProps.asInstanceOf[js.Any])
    if (hoursUpButtonProps != null) __obj.updateDynamic("hoursUpButtonProps")(hoursUpButtonProps.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (meridiemDownButtonProps != null) __obj.updateDynamic("meridiemDownButtonProps")(meridiemDownButtonProps.asInstanceOf[js.Any])
    if (meridiemInputProps != null) __obj.updateDynamic("meridiemInputProps")(meridiemInputProps.asInstanceOf[js.Any])
    if (meridiemUpButtonProps != null) __obj.updateDynamic("meridiemUpButtonProps")(meridiemUpButtonProps.asInstanceOf[js.Any])
    if (minutesDownButtonProps != null) __obj.updateDynamic("minutesDownButtonProps")(minutesDownButtonProps.asInstanceOf[js.Any])
    if (minutesInputProps != null) __obj.updateDynamic("minutesInputProps")(minutesInputProps.asInstanceOf[js.Any])
    if (minutesUpButtonProps != null) __obj.updateDynamic("minutesUpButtonProps")(minutesUpButtonProps.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (secondsDownButtonProps != null) __obj.updateDynamic("secondsDownButtonProps")(secondsDownButtonProps.asInstanceOf[js.Any])
    if (secondsInputProps != null) __obj.updateDynamic("secondsInputProps")(secondsInputProps.asInstanceOf[js.Any])
    if (secondsUpButtonProps != null) __obj.updateDynamic("secondsUpButtonProps")(secondsUpButtonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(showHour)) __obj.updateDynamic("showHour")(showHour.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinute)) __obj.updateDynamic("showMinute")(showMinute.asInstanceOf[js.Any])
    if (!js.isUndefined(showSecond)) __obj.updateDynamic("showSecond")(showSecond.asInstanceOf[js.Any])
    if (!js.isUndefined(spinners)) __obj.updateDynamic("spinners")(spinners.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeProps]
  }
}

