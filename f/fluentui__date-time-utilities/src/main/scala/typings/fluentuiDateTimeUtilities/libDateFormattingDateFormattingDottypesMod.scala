package typings.fluentuiDateTimeUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDateFormattingDateFormattingDottypesMod {
  
  trait ICalendarStrings
    extends StObject
       with IDateGridStrings {
    
    /**
      * Aria-label for the "close" button.
      */
    var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label for when a date is marked
      */
    var dayMarkedAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * String to render for button to direct the user to today's date.
      */
    var goToToday: String
    
    /**
      * Aria-label format string for the header button in the month picker. Should have 1 string param, e.g. "`{0}`,
      * select to change the year". This aria-label will only be applied if the year picker is enabled; otherwise
      * the label will default to the header string, e.g. "2019".
      */
    var monthPickerHeaderAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label for the "next month" button in day picker.
      */
    var nextMonthAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label for the "next year" button in month picker.
      */
    var nextYearAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label for the "next year range" button in year picker.
      */
    var nextYearRangeAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label for the "previous month" button in day picker.
      */
    var prevMonthAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label for the "previous year" button in month picker.
      */
    var prevYearAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label for the "previous year range" button in year picker.
      */
    var prevYearRangeAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label format string for the currently selected date. Should have 1 string param, e.g. "Selected date `{0}`"
      */
    var selectedDateFormatString: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label format string for today's date. Should have 1 string param, e.g. "Today's date `{0}`"
      */
    var todayDateFormatString: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label format string for the week number header. Should have 1 string param, e.g. "week number `{0}`"
      */
    var weekNumberFormatString: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label format string for the header button in the year picker.
      * Should have 1 string param, e.g. "`{0}`, select to change the month"
      */
    var yearPickerHeaderAriaLabel: js.UndefOr[String] = js.undefined
  }
  object ICalendarStrings {
    
    inline def apply(
      days: js.Array[String],
      goToToday: String,
      months: js.Array[String],
      shortDays: js.Array[String],
      shortMonths: js.Array[String]
    ): ICalendarStrings = {
      val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], goToToday = goToToday.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICalendarStrings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICalendarStrings] (val x: Self) extends AnyVal {
      
      inline def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonAriaLabelUndefined: Self = StObject.set(x, "closeButtonAriaLabel", js.undefined)
      
      inline def setDayMarkedAriaLabel(value: String): Self = StObject.set(x, "dayMarkedAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setDayMarkedAriaLabelUndefined: Self = StObject.set(x, "dayMarkedAriaLabel", js.undefined)
      
      inline def setGoToToday(value: String): Self = StObject.set(x, "goToToday", value.asInstanceOf[js.Any])
      
      inline def setMonthPickerHeaderAriaLabel(value: String): Self = StObject.set(x, "monthPickerHeaderAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMonthPickerHeaderAriaLabelUndefined: Self = StObject.set(x, "monthPickerHeaderAriaLabel", js.undefined)
      
      inline def setNextMonthAriaLabel(value: String): Self = StObject.set(x, "nextMonthAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNextMonthAriaLabelUndefined: Self = StObject.set(x, "nextMonthAriaLabel", js.undefined)
      
      inline def setNextYearAriaLabel(value: String): Self = StObject.set(x, "nextYearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNextYearAriaLabelUndefined: Self = StObject.set(x, "nextYearAriaLabel", js.undefined)
      
      inline def setNextYearRangeAriaLabel(value: String): Self = StObject.set(x, "nextYearRangeAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNextYearRangeAriaLabelUndefined: Self = StObject.set(x, "nextYearRangeAriaLabel", js.undefined)
      
      inline def setPrevMonthAriaLabel(value: String): Self = StObject.set(x, "prevMonthAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevMonthAriaLabelUndefined: Self = StObject.set(x, "prevMonthAriaLabel", js.undefined)
      
      inline def setPrevYearAriaLabel(value: String): Self = StObject.set(x, "prevYearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevYearAriaLabelUndefined: Self = StObject.set(x, "prevYearAriaLabel", js.undefined)
      
      inline def setPrevYearRangeAriaLabel(value: String): Self = StObject.set(x, "prevYearRangeAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevYearRangeAriaLabelUndefined: Self = StObject.set(x, "prevYearRangeAriaLabel", js.undefined)
      
      inline def setSelectedDateFormatString(value: String): Self = StObject.set(x, "selectedDateFormatString", value.asInstanceOf[js.Any])
      
      inline def setSelectedDateFormatStringUndefined: Self = StObject.set(x, "selectedDateFormatString", js.undefined)
      
      inline def setTodayDateFormatString(value: String): Self = StObject.set(x, "todayDateFormatString", value.asInstanceOf[js.Any])
      
      inline def setTodayDateFormatStringUndefined: Self = StObject.set(x, "todayDateFormatString", js.undefined)
      
      inline def setWeekNumberFormatString(value: String): Self = StObject.set(x, "weekNumberFormatString", value.asInstanceOf[js.Any])
      
      inline def setWeekNumberFormatStringUndefined: Self = StObject.set(x, "weekNumberFormatString", js.undefined)
      
      inline def setYearPickerHeaderAriaLabel(value: String): Self = StObject.set(x, "yearPickerHeaderAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setYearPickerHeaderAriaLabelUndefined: Self = StObject.set(x, "yearPickerHeaderAriaLabel", js.undefined)
    }
  }
  
  trait IDateFormatting extends StObject {
    
    /**
      * Get a localized string for a day.
      */
    def formatDay(date: js.Date): String
    
    /**
      * Get a localized string for a month.
      */
    def formatMonth(date: js.Date, strings: IDateGridStrings): String
    
    /**
      * Get a localized string for a month, day, and year.
      */
    def formatMonthDayYear(date: js.Date, strings: IDateGridStrings): String
    
    /**
      * Get a localized string for a month and year.
      */
    def formatMonthYear(date: js.Date, strings: IDateGridStrings): String
    
    /**
      * Get a localized string for a year.
      */
    def formatYear(date: js.Date): String
  }
  object IDateFormatting {
    
    inline def apply(
      formatDay: js.Date => String,
      formatMonth: (js.Date, IDateGridStrings) => String,
      formatMonthDayYear: (js.Date, IDateGridStrings) => String,
      formatMonthYear: (js.Date, IDateGridStrings) => String,
      formatYear: js.Date => String
    ): IDateFormatting = {
      val __obj = js.Dynamic.literal(formatDay = js.Any.fromFunction1(formatDay), formatMonth = js.Any.fromFunction2(formatMonth), formatMonthDayYear = js.Any.fromFunction2(formatMonthDayYear), formatMonthYear = js.Any.fromFunction2(formatMonthYear), formatYear = js.Any.fromFunction1(formatYear))
      __obj.asInstanceOf[IDateFormatting]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDateFormatting] (val x: Self) extends AnyVal {
      
      inline def setFormatDay(value: js.Date => String): Self = StObject.set(x, "formatDay", js.Any.fromFunction1(value))
      
      inline def setFormatMonth(value: (js.Date, IDateGridStrings) => String): Self = StObject.set(x, "formatMonth", js.Any.fromFunction2(value))
      
      inline def setFormatMonthDayYear(value: (js.Date, IDateGridStrings) => String): Self = StObject.set(x, "formatMonthDayYear", js.Any.fromFunction2(value))
      
      inline def setFormatMonthYear(value: (js.Date, IDateGridStrings) => String): Self = StObject.set(x, "formatMonthYear", js.Any.fromFunction2(value))
      
      inline def setFormatYear(value: js.Date => String): Self = StObject.set(x, "formatYear", js.Any.fromFunction1(value))
    }
  }
  
  trait IDateGridStrings extends StObject {
    
    /**
      * An array of strings for the full names of days of the week.
      * The array is 0-based, so days[0] should be the full name of Sunday.
      */
    var days: js.Array[String]
    
    /**
      * An array of strings for the full names of months.
      * The array is 0-based, so months[0] should be the full name of January.
      */
    var months: js.Array[String]
    
    /**
      * An array of strings for the initials of the days of the week.
      * The array is 0-based, so days[0] should be the initial of Sunday.
      */
    var shortDays: js.Array[String]
    
    /**
      * An array of strings for the short names of months.
      * The array is 0-based, so shortMonths[0] should be the short name of January.
      */
    var shortMonths: js.Array[String]
  }
  object IDateGridStrings {
    
    inline def apply(
      days: js.Array[String],
      months: js.Array[String],
      shortDays: js.Array[String],
      shortMonths: js.Array[String]
    ): IDateGridStrings = {
      val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDateGridStrings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDateGridStrings] (val x: Self) extends AnyVal {
      
      inline def setDays(value: js.Array[String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysVarargs(value: String*): Self = StObject.set(x, "days", js.Array(value*))
      
      inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value*))
      
      inline def setShortDays(value: js.Array[String]): Self = StObject.set(x, "shortDays", value.asInstanceOf[js.Any])
      
      inline def setShortDaysVarargs(value: String*): Self = StObject.set(x, "shortDays", js.Array(value*))
      
      inline def setShortMonths(value: js.Array[String]): Self = StObject.set(x, "shortMonths", value.asInstanceOf[js.Any])
      
      inline def setShortMonthsVarargs(value: String*): Self = StObject.set(x, "shortMonths", js.Array(value*))
    }
  }
}
