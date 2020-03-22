package typings.fundamentalReact.calendarMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.AnonDay1Sun
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  localizedText ? :{  day1Sun  :string,   day2Mon  :string,   day3Tues  :string,   day4Wed  :string,   day5Thurs  :string,   day6Fri  :string,   day7Sat  :string,   dayChar1Sun  :string,   dayChar2Mon  :string,   dayChar3Tues  :string,   dayChar4Wed  :string,   dayChar5Thurs  :string,   dayChar6Fri  :string,   dayChar7Sat  :string,   month01Jan  :string,   month02Feb  :string,   month03Mar  :string,   month04Apr  :string,   month05May  :string,   month06Jun  :string,   month07Jul  :string,   month08Aug  :string,   month09Sep  :string,   month10Oct  :string,   month11Nov  :string,   month12Dec  :string},   monthListProps ? :{[x: string] : any},   tableBodyProps ? :{[x: string] : any},   tableHeaderProps ? :{[x: string] : any},   tableProps ? :{[x: string] : any},   yearListProps ? :{[x: string] : any}, onChange ? (date : std.Date): void, [x: string] : any} & fundamental-react.fundamental-react/lib/Calendar/Calendar.CalendarBaseProps */
trait CalendarProps
  extends /* x */ StringDictionary[js.Any] {
  /* Blocks dates that are in between the blocked dates. */
  var blockedDates: js.UndefOr[js.Array[Date]] = js.undefined
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
  var localizedText: js.UndefOr[AnonDay1Sun] = js.undefined
  /* Additional props to be spread to the month's `<ul>` element. */
  var monthListProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.undefined
  /* Additional props to be spread to the `<tbody>` element. */
  var tableBodyProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* 'Additional props to be spread to the `<thead>` element.' */
  var tableHeaderProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the `<table>` element. */
  var tableProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the year's `<ul>` element. */
  var yearListProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object CalendarProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    blockedDates: js.Array[Date] = null,
    customStyles: StringDictionary[js.Any] = null,
    disableAfterDate: Date = null,
    disableBeforeDate: Date = null,
    disableFutureDates: js.UndefOr[Boolean] = js.undefined,
    disablePastDates: js.UndefOr[Boolean] = js.undefined,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disableWeekday: js.Array[String] = null,
    disableWeekends: js.UndefOr[Boolean] = js.undefined,
    disabledDates: js.Array[Date] = null,
    localizedText: AnonDay1Sun = null,
    monthListProps: StringDictionary[js.Any] = null,
    onChange: /* date */ Date => Unit = null,
    tableBodyProps: StringDictionary[js.Any] = null,
    tableHeaderProps: StringDictionary[js.Any] = null,
    tableProps: StringDictionary[js.Any] = null,
    yearListProps: StringDictionary[js.Any] = null
  ): CalendarProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (blockedDates != null) __obj.updateDynamic("blockedDates")(blockedDates.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (disableAfterDate != null) __obj.updateDynamic("disableAfterDate")(disableAfterDate.asInstanceOf[js.Any])
    if (disableBeforeDate != null) __obj.updateDynamic("disableBeforeDate")(disableBeforeDate.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFutureDates)) __obj.updateDynamic("disableFutureDates")(disableFutureDates.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePastDates)) __obj.updateDynamic("disablePastDates")(disablePastDates.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (disableWeekday != null) __obj.updateDynamic("disableWeekday")(disableWeekday.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWeekends)) __obj.updateDynamic("disableWeekends")(disableWeekends.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (monthListProps != null) __obj.updateDynamic("monthListProps")(monthListProps.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (tableBodyProps != null) __obj.updateDynamic("tableBodyProps")(tableBodyProps.asInstanceOf[js.Any])
    if (tableHeaderProps != null) __obj.updateDynamic("tableHeaderProps")(tableHeaderProps.asInstanceOf[js.Any])
    if (tableProps != null) __obj.updateDynamic("tableProps")(tableProps.asInstanceOf[js.Any])
    if (yearListProps != null) __obj.updateDynamic("yearListProps")(yearListProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps]
  }
}

