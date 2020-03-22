package typings.fundamentalReact.datePickerMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.AnonDate
import typings.fundamentalReact.AnonNextMonth
import typings.fundamentalReact.AnonState
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  buttonLabel ? :string,   buttonProps ? :{[x: string] : any},   compact ? :boolean,   defaultValue ? :string,   enableRangeSelection ? :boolean,   inputProps ? :{[x: string] : any},   locale ? :string, onBlur ? (hasDateFormattedDate : {  date  :std.Date,   formattedDate  :string}): void,   validationState ? :{  state ? :'error' | 'warning' | 'information' | 'success',   text ? :string}, [x: string] : any} & fundamental-react.fundamental-react/lib/Calendar/Calendar.CalendarBaseProps */
trait DatePickerProps
  extends /* x */ StringDictionary[js.Any] {
  var blockedDates: js.UndefOr[js.Array[Date]] = js.undefined
  var buttonLabel: js.UndefOr[String] = js.undefined
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var disableAfterDate: js.UndefOr[Date] = js.undefined
  var disableBeforeDate: js.UndefOr[Date] = js.undefined
  var disableFutureDates: js.UndefOr[Boolean] = js.undefined
  var disablePastDates: js.UndefOr[Boolean] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var disableWeekday: js.UndefOr[js.Array[String]] = js.undefined
  var disableWeekends: js.UndefOr[Boolean] = js.undefined
  var disabledDates: js.UndefOr[js.Array[Date]] = js.undefined
  var enableRangeSelection: js.UndefOr[Boolean] = js.undefined
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var localizedText: js.UndefOr[AnonNextMonth] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* hasDateFormattedDate */ AnonDate, Unit]] = js.undefined
  var validationState: js.UndefOr[AnonState] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    blockedDates: js.Array[Date] = null,
    buttonLabel: String = null,
    buttonProps: StringDictionary[js.Any] = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    disableAfterDate: Date = null,
    disableBeforeDate: Date = null,
    disableFutureDates: js.UndefOr[Boolean] = js.undefined,
    disablePastDates: js.UndefOr[Boolean] = js.undefined,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disableWeekday: js.Array[String] = null,
    disableWeekends: js.UndefOr[Boolean] = js.undefined,
    disabledDates: js.Array[Date] = null,
    enableRangeSelection: js.UndefOr[Boolean] = js.undefined,
    inputProps: StringDictionary[js.Any] = null,
    locale: String = null,
    localizedText: AnonNextMonth = null,
    onBlur: /* hasDateFormattedDate */ AnonDate => Unit = null,
    validationState: AnonState = null
  ): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (blockedDates != null) __obj.updateDynamic("blockedDates")(blockedDates.asInstanceOf[js.Any])
    if (buttonLabel != null) __obj.updateDynamic("buttonLabel")(buttonLabel.asInstanceOf[js.Any])
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disableAfterDate != null) __obj.updateDynamic("disableAfterDate")(disableAfterDate.asInstanceOf[js.Any])
    if (disableBeforeDate != null) __obj.updateDynamic("disableBeforeDate")(disableBeforeDate.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFutureDates)) __obj.updateDynamic("disableFutureDates")(disableFutureDates.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePastDates)) __obj.updateDynamic("disablePastDates")(disablePastDates.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (disableWeekday != null) __obj.updateDynamic("disableWeekday")(disableWeekday.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWeekends)) __obj.updateDynamic("disableWeekends")(disableWeekends.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRangeSelection)) __obj.updateDynamic("enableRangeSelection")(enableRangeSelection.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (validationState != null) __obj.updateDynamic("validationState")(validationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerProps]
  }
}

