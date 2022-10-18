package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek
import typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDateMathDateMathMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDays(date: js.Date, days: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(date.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addMonths(date: js.Date, months: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMonths")(date.asInstanceOf[js.Any], months.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addWeeks(date: js.Date, weeks: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addWeeks")(date.asInstanceOf[js.Any], weeks.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addYears(date: js.Date, years: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addYears")(date.asInstanceOf[js.Any], years.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def compareDatePart(date1: js.Date, date2: js.Date): Number = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDatePart")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Number]
  
  inline def compareDates(date1: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDates")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getDatePartHashValue(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatePartHashValue")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getDateRangeArray(date: js.Date, dateRangeType: DateRangeType, firstDayOfWeek: DayOfWeek): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek]
  ): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek],
    daysToSelectInDayView: Double
  ): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], daysToSelectInDayView.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: Unit,
    daysToSelectInDayView: Double
  ): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], daysToSelectInDayView.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  inline def getEndDateOfWeek(date: js.Date, firstDayOfWeek: DayOfWeek): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndDateOfWeek")(date.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getMonthEnd(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getMonthStart(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getStartDateOfWeek(date: js.Date, firstDayOfWeek: DayOfWeek): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getStartDateOfWeek")(date.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getWeekNumber(date: js.Date, firstDayOfWeek: DayOfWeek, firstWeekOfYear: FirstWeekOfYear): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekNumber")(date.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getWeekNumbersInMonth(
    weeksInMonth: Double,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: js.Date
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekNumbersInMonth")(weeksInMonth.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear.asInstanceOf[js.Any], navigatedDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getYearEnd(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getYearStart(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def isInDateRangeArray(date: js.Date, dateRange: js.Array[js.Date]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInDateRangeArray")(date.asInstanceOf[js.Any], dateRange.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setMonth(date: js.Date, month: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMonth")(date.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[js.Date]
}
