package typings.fundamentalReact.calendarMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.NextMonth
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  monthListProps ? :{[x: string] : any},   tableBodyProps ? :{[x: string] : any},   tableHeaderProps ? :{[x: string] : any},   tableProps ? :{[x: string] : any},   yearListProps ? :{[x: string] : any}, onChange ? (date : std.Date): void, [x: string] : any} & fundamental-react.fundamental-react/lib/Calendar/Calendar.CalendarBaseProps */
trait CalendarProps
  extends /* x */ StringDictionary[js.Any] {
  var blockedDates: js.UndefOr[js.Array[Date]] = js.undefined
  var disableAfterDate: js.UndefOr[Date] = js.undefined
  var disableBeforeDate: js.UndefOr[Date] = js.undefined
  var disableFutureDates: js.UndefOr[Boolean] = js.undefined
  var disablePastDates: js.UndefOr[Boolean] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var disableWeekday: js.UndefOr[js.Array[String]] = js.undefined
  var disableWeekends: js.UndefOr[Boolean] = js.undefined
  var disabledDates: js.UndefOr[js.Array[Date]] = js.undefined
  var localizedText: js.UndefOr[NextMonth] = js.undefined
  var monthListProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.undefined
  var tableBodyProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var tableHeaderProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var tableProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var yearListProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object CalendarProps {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    blockedDates: js.Array[Date] = null,
    disableAfterDate: Date = null,
    disableBeforeDate: Date = null,
    disableFutureDates: js.UndefOr[Boolean] = js.undefined,
    disablePastDates: js.UndefOr[Boolean] = js.undefined,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disableWeekday: js.Array[String] = null,
    disableWeekends: js.UndefOr[Boolean] = js.undefined,
    disabledDates: js.Array[Date] = null,
    localizedText: NextMonth = null,
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
    if (disableAfterDate != null) __obj.updateDynamic("disableAfterDate")(disableAfterDate.asInstanceOf[js.Any])
    if (disableBeforeDate != null) __obj.updateDynamic("disableBeforeDate")(disableBeforeDate.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFutureDates)) __obj.updateDynamic("disableFutureDates")(disableFutureDates.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePastDates)) __obj.updateDynamic("disablePastDates")(disablePastDates.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.get.asInstanceOf[js.Any])
    if (disableWeekday != null) __obj.updateDynamic("disableWeekday")(disableWeekday.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWeekends)) __obj.updateDynamic("disableWeekends")(disableWeekends.get.asInstanceOf[js.Any])
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

