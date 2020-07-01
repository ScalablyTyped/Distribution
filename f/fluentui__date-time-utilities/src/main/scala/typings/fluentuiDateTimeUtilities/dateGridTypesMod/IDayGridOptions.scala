package typings.fluentuiDateTimeUtilities.dateGridTypesMod

import typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDayGridOptions extends IRestrictedDatesOptions {
  /**
    * The date range type indicating how  many days should be selected as the user
    * selects days
    */
  var dateRangeType: DateRangeType
  /**
    * The number of days to select while dateRangeType === DateRangeType.Day. Used in order to have multi-day
    * views.
    * @defaultValue 1
    */
  var daysToSelectInDayView: js.UndefOr[Double] = js.undefined
  /**
    * The first day of the week for your locale.
    */
  var firstDayOfWeek: DayOfWeek
  /**
    * Defines when the first week of the year should start, FirstWeekOfYear.FirstDay,
    * FirstWeekOfYear.FirstFullWeek or FirstWeekOfYear.FirstFourDayWeek are the possible values
    */
  var firstWeekOfYear: FirstWeekOfYear
  /**
    * The currently navigated date
    */
  var navigatedDate: Date
  /**
    * The currently selected date
    */
  var selectedDate: Date
  /**
    * Whether the calendar should show the week number (weeks 1 to 53) before each week row
    */
  var showWeekNumbers: js.UndefOr[Boolean] = js.undefined
  /**
    * Value of today. If null, current time in client machine will be used.
    */
  var today: js.UndefOr[Date] = js.undefined
  /**
    * How many weeks to show by default. If not provided, will show enough weeks to display the current
    * month, between 4 and 6 depending
    */
  var weeksToShow: js.UndefOr[Double] = js.undefined
  /**
    * The days that are selectable when `dateRangeType` is WorkWeek.
    * If `dateRangeType` is not WorkWeek this property does nothing.
    */
  var workWeekDays: js.UndefOr[js.Array[DayOfWeek]] = js.undefined
}

object IDayGridOptions {
  @scala.inline
  def apply(
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: Date,
    selectedDate: Date,
    daysToSelectInDayView: js.UndefOr[Double] = js.undefined,
    maxDate: Date = null,
    minDate: Date = null,
    restrictedDates: js.Array[Date] = null,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    today: Date = null,
    weeksToShow: js.UndefOr[Double] = js.undefined,
    workWeekDays: js.Array[DayOfWeek] = null
  ): IDayGridOptions = {
    val __obj = js.Dynamic.literal(dateRangeType = dateRangeType.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear = firstWeekOfYear.asInstanceOf[js.Any], navigatedDate = navigatedDate.asInstanceOf[js.Any], selectedDate = selectedDate.asInstanceOf[js.Any])
    if (!js.isUndefined(daysToSelectInDayView)) __obj.updateDynamic("daysToSelectInDayView")(daysToSelectInDayView.get.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (restrictedDates != null) __obj.updateDynamic("restrictedDates")(restrictedDates.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers.get.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    if (!js.isUndefined(weeksToShow)) __obj.updateDynamic("weeksToShow")(weeksToShow.get.asInstanceOf[js.Any])
    if (workWeekDays != null) __obj.updateDynamic("workWeekDays")(workWeekDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDayGridOptions]
  }
}

