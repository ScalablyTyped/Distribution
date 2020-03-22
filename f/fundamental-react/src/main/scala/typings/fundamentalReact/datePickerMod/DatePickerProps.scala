package typings.fundamentalReact.datePickerMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.AnonDate
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  buttonProps ? :{[x: string] : any},   compact ? :boolean,   enableRangeSelection ? :boolean,   inputProps ? :{[x: string] : any}, onBlur ? (hasDateFormattedDate : {  date  :std.Date,   formattedDate  :string}): void, [x: string] : any} & fundamental-react.fundamental-react/lib/Calendar/Calendar.CalendarBaseProps */
trait DatePickerProps
  extends /* x */ StringDictionary[js.Any] {
  /* Blocks dates that are in between the blocked dates. */
  var blockedDates: js.UndefOr[js.Array[Date]] = js.undefined
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Disables dates of a calendar that come after the specified date. */
  var disableAfterDate: js.UndefOr[Date] = js.undefined
  /* Disables dates of a calendar that come before the specified date. */
  var disableBeforeDate: js.UndefOr[Date] = js.undefined
  /* Set to **true** to disable dates after today's date. */
  var disableFutureDates: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to disable dates before today's date. */
  var disablePastDates: js.UndefOr[Boolean] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  /* Disables dates that match a weekday. */
  var disableWeekday: js.UndefOr[js.Array[String]] = js.undefined
  /* Set to **true** to disables dates that match a weekend. */
  var disableWeekends: js.UndefOr[Boolean] = js.undefined
  /* Disables dates that are in between the disabled dates. */
  var disabledDates: js.UndefOr[js.Array[Date]] = js.undefined
  /* Set to **true** to enable the selection of a date range (begin and end). */
  var enableRangeSelection: js.UndefOr[Boolean] = js.undefined
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* hasDateFormattedDate */ AnonDate, Unit]] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    blockedDates: js.Array[Date] = null,
    buttonProps: StringDictionary[js.Any] = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    customStyles: StringDictionary[js.Any] = null,
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
    onBlur: /* hasDateFormattedDate */ AnonDate => Unit = null
  ): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (blockedDates != null) __obj.updateDynamic("blockedDates")(blockedDates.asInstanceOf[js.Any])
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
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
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    __obj.asInstanceOf[DatePickerProps]
  }
}

