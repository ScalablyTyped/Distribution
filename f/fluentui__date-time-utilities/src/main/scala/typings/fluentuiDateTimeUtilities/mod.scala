package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.dateFormattingTypesMod.ICalendarStrings
import typings.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateFormatting
import typings.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateGridStrings
import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IAvailableDateOptions
import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IDay
import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IDayGridOptions
import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IRestrictedDatesOptions
import typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import typings.std.Date
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluentui/date-time-utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/date-time-utilities", "DAYS_IN_WEEK")
  @js.native
  val DAYS_IN_WEEK: /* 7 */ Double = js.native
  
  @JSImport("@fluentui/date-time-utilities", "DEFAULT_CALENDAR_STRINGS")
  @js.native
  val DEFAULT_CALENDAR_STRINGS: ICalendarStrings = js.native
  
  @JSImport("@fluentui/date-time-utilities", "DEFAULT_DATE_FORMATTING")
  @js.native
  val DEFAULT_DATE_FORMATTING: IDateFormatting = js.native
  
  @JSImport("@fluentui/date-time-utilities", "DEFAULT_LOCALIZED_STRINGS")
  @js.native
  val DEFAULT_LOCALIZED_STRINGS: IDateGridStrings = js.native
  
  @JSImport("@fluentui/date-time-utilities", "DateRangeType")
  @js.native
  object DateRangeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType & Double] = js.native
    
    /* 0 */ val Day: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Day & Double = js.native
    
    /* 2 */ val Month: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Month & Double = js.native
    
    /* 1 */ val Week: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Week & Double = js.native
    
    /* 3 */ val WorkWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.WorkWeek & Double = js.native
  }
  
  @JSImport("@fluentui/date-time-utilities", "DayOfWeek")
  @js.native
  object DayOfWeek extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek & Double] = js.native
    
    /* 5 */ val Friday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Friday & Double = js.native
    
    /* 1 */ val Monday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Monday & Double = js.native
    
    /* 6 */ val Saturday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Saturday & Double = js.native
    
    /* 0 */ val Sunday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Sunday & Double = js.native
    
    /* 4 */ val Thursday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Thursday & Double = js.native
    
    /* 2 */ val Tuesday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Tuesday & Double = js.native
    
    /* 3 */ val Wednesday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Wednesday & Double = js.native
  }
  
  @JSImport("@fluentui/date-time-utilities", "FirstWeekOfYear")
  @js.native
  object FirstWeekOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear & Double] = js.native
    
    /* 0 */ val FirstDay: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstDay & Double = js.native
    
    /* 2 */ val FirstFourDayWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFourDayWeek & Double = js.native
    
    /* 1 */ val FirstFullWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFullWeek & Double = js.native
  }
  
  @JSImport("@fluentui/date-time-utilities", "MonthOfYear")
  @js.native
  object MonthOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear & Double] = js.native
    
    /* 3 */ val April: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.April & Double = js.native
    
    /* 7 */ val August: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.August & Double = js.native
    
    /* 11 */ val December: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.December & Double = js.native
    
    /* 1 */ val February: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.February & Double = js.native
    
    /* 0 */ val January: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.January & Double = js.native
    
    /* 6 */ val July: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.July & Double = js.native
    
    /* 5 */ val June: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.June & Double = js.native
    
    /* 2 */ val March: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.March & Double = js.native
    
    /* 4 */ val May: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.May & Double = js.native
    
    /* 10 */ val November: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.November & Double = js.native
    
    /* 9 */ val October: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.October & Double = js.native
    
    /* 8 */ val September: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.September & Double = js.native
  }
  
  @scala.inline
  def addDays(date: Date, days: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(date.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def addMonths(date: Date, months: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMonths")(date.asInstanceOf[js.Any], months.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def addWeeks(date: Date, weeks: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addWeeks")(date.asInstanceOf[js.Any], weeks.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def addYears(date: Date, years: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addYears")(date.asInstanceOf[js.Any], years.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def compareDatePart(date1: Date, date2: Date): Number = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDatePart")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Number]
  
  @scala.inline
  def compareDates(date1: Date, date2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDates")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def findAvailableDate(options: IAvailableDateOptions): js.UndefOr[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAvailableDate")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Date]]
  
  @scala.inline
  def formatDay(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDay")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def formatMonthDayYear(date: Date, strings: IDateGridStrings): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonthDayYear")(date.asInstanceOf[js.Any], strings.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatMonthYear(date: Date, strings: IDateGridStrings): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonthYear")(date.asInstanceOf[js.Any], strings.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatYear(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatYear")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getBoundedDateRange(dateRange: js.Array[Date]): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
  @scala.inline
  def getBoundedDateRange(dateRange: js.Array[Date], minDate: Unit, maxDate: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  @scala.inline
  def getBoundedDateRange(dateRange: js.Array[Date], minDate: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  @scala.inline
  def getBoundedDateRange(dateRange: js.Array[Date], minDate: Date, maxDate: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @scala.inline
  def getDatePartHashValue(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatePartHashValue")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getDateRangeArray(date: Date, dateRangeType: DateRangeType, firstDayOfWeek: DayOfWeek): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  @scala.inline
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek]
  ): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  @scala.inline
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek],
    daysToSelectInDayView: Double
  ): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], daysToSelectInDayView.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  @scala.inline
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: Unit,
    daysToSelectInDayView: Double
  ): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], daysToSelectInDayView.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @scala.inline
  def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: js.Array[DayOfWeek], firstDayOfWeek: DayOfWeek): DateRangeType = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeTypeToUse")(dateRangeType.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[DateRangeType]
  @scala.inline
  def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: Unit, firstDayOfWeek: DayOfWeek): DateRangeType = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeTypeToUse")(dateRangeType.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[DateRangeType]
  
  @scala.inline
  def getDayGrid(options: IDayGridOptions): js.Array[js.Array[IDay]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayGrid")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[IDay]]]
  
  @scala.inline
  def getEndDateOfWeek(date: Date, firstDayOfWeek: DayOfWeek): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndDateOfWeek")(date.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def getMonthEnd(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthEnd")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def getMonthStart(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthStart")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def getStartDateOfWeek(date: Date, firstDayOfWeek: DayOfWeek): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getStartDateOfWeek")(date.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def getWeekNumber(date: Date, firstDayOfWeek: DayOfWeek, firstWeekOfYear: FirstWeekOfYear): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekNumber")(date.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getWeekNumbersInMonth(
    weeksInMonth: Double,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: Date
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekNumbersInMonth")(weeksInMonth.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear.asInstanceOf[js.Any], navigatedDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def getYearEnd(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearEnd")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def getYearStart(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearStart")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def isAfterMaxDate(date: Date, options: IRestrictedDatesOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAfterMaxDate")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isBeforeMinDate(date: Date, options: IRestrictedDatesOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBeforeMinDate")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isContiguous(days: js.Array[DayOfWeek], isSingleWeek: Boolean, firstDayOfWeek: DayOfWeek): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContiguous")(days.asInstanceOf[js.Any], isSingleWeek.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isInDateRangeArray(date: Date, dateRange: js.Array[Date]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInDateRangeArray")(date.asInstanceOf[js.Any], dateRange.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isRestrictedDate(date: Date, options: IRestrictedDatesOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRestrictedDate")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def setMonth(date: Date, month: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMonth")(date.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[Date]
}
