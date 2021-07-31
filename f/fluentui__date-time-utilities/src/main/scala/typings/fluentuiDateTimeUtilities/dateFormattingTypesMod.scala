package typings.fluentuiDateTimeUtilities

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFormattingTypesMod {
  
  trait ICalendarStrings
    extends StObject
       with IDateFormatting {
    
    /**
      * Aria-label for the "close" button.
      */
    var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * String to render for button to direct the user to today's date.
      */
    var goToToday: String
    
    /**
      * Aria-label for input."
      */
    var inputAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label format string for restricted input. Should have 2 string params, 0 is minDate and 1 is maxDate"
      */
    var inputBoundedFormatString: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label format string for restricted input only with maxDate. Should have 1 string param, 0 is maxDate"
      */
    var inputMaxBoundedFormatString: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label format string for restricted input only with minDate. Should have 1 string param, 0 is minDate"
      */
    var inputMinBoundedFormatString: js.UndefOr[String] = js.undefined
    
    /**
      * Placeholder string for an unfilled input.
      */
    var inputPlaceholder: String
    
    /**
      * Error message to render for TextField if input date string parsing fails.
      */
    var invalidInputErrorMessage: js.UndefOr[String] = js.undefined
    
    /**
      * Error message to render for TextField if date boundary (minDate, maxDate) validation fails.
      */
    var isOutOfBoundsErrorMessage: js.UndefOr[String] = js.undefined
    
    /**
      * Error message to render for TextField if isRequired validation fails.
      */
    var isRequiredErrorMessage: js.UndefOr[String] = js.undefined
    
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
      * Title for button to open the calendar.
      */
    var openCalendarTitle: String
    
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
    
    @scala.inline
    def apply(
      days: js.Array[String],
      formatDay: Date => String,
      formatMonthDayYear: (Date, IDateGridStrings) => String,
      formatMonthYear: (Date, IDateGridStrings) => String,
      formatYear: Date => String,
      goToToday: String,
      inputPlaceholder: String,
      months: js.Array[String],
      openCalendarTitle: String,
      parseDate: String => Date | Null,
      shortDays: js.Array[String],
      shortMonths: js.Array[String]
    ): ICalendarStrings = {
      val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], formatDay = js.Any.fromFunction1(formatDay), formatMonthDayYear = js.Any.fromFunction2(formatMonthDayYear), formatMonthYear = js.Any.fromFunction2(formatMonthYear), formatYear = js.Any.fromFunction1(formatYear), goToToday = goToToday.asInstanceOf[js.Any], inputPlaceholder = inputPlaceholder.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], openCalendarTitle = openCalendarTitle.asInstanceOf[js.Any], parseDate = js.Any.fromFunction1(parseDate), shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICalendarStrings]
    }
    
    @scala.inline
    implicit class ICalendarStringsMutableBuilder[Self <: ICalendarStrings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonAriaLabelUndefined: Self = StObject.set(x, "closeButtonAriaLabel", js.undefined)
      
      @scala.inline
      def setGoToToday(value: String): Self = StObject.set(x, "goToToday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputAriaLabel(value: String): Self = StObject.set(x, "inputAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputAriaLabelUndefined: Self = StObject.set(x, "inputAriaLabel", js.undefined)
      
      @scala.inline
      def setInputBoundedFormatString(value: String): Self = StObject.set(x, "inputBoundedFormatString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputBoundedFormatStringUndefined: Self = StObject.set(x, "inputBoundedFormatString", js.undefined)
      
      @scala.inline
      def setInputMaxBoundedFormatString(value: String): Self = StObject.set(x, "inputMaxBoundedFormatString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputMaxBoundedFormatStringUndefined: Self = StObject.set(x, "inputMaxBoundedFormatString", js.undefined)
      
      @scala.inline
      def setInputMinBoundedFormatString(value: String): Self = StObject.set(x, "inputMinBoundedFormatString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputMinBoundedFormatStringUndefined: Self = StObject.set(x, "inputMinBoundedFormatString", js.undefined)
      
      @scala.inline
      def setInputPlaceholder(value: String): Self = StObject.set(x, "inputPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidInputErrorMessage(value: String): Self = StObject.set(x, "invalidInputErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidInputErrorMessageUndefined: Self = StObject.set(x, "invalidInputErrorMessage", js.undefined)
      
      @scala.inline
      def setIsOutOfBoundsErrorMessage(value: String): Self = StObject.set(x, "isOutOfBoundsErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOutOfBoundsErrorMessageUndefined: Self = StObject.set(x, "isOutOfBoundsErrorMessage", js.undefined)
      
      @scala.inline
      def setIsRequiredErrorMessage(value: String): Self = StObject.set(x, "isRequiredErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRequiredErrorMessageUndefined: Self = StObject.set(x, "isRequiredErrorMessage", js.undefined)
      
      @scala.inline
      def setMonthPickerHeaderAriaLabel(value: String): Self = StObject.set(x, "monthPickerHeaderAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthPickerHeaderAriaLabelUndefined: Self = StObject.set(x, "monthPickerHeaderAriaLabel", js.undefined)
      
      @scala.inline
      def setNextMonthAriaLabel(value: String): Self = StObject.set(x, "nextMonthAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMonthAriaLabelUndefined: Self = StObject.set(x, "nextMonthAriaLabel", js.undefined)
      
      @scala.inline
      def setNextYearAriaLabel(value: String): Self = StObject.set(x, "nextYearAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextYearAriaLabelUndefined: Self = StObject.set(x, "nextYearAriaLabel", js.undefined)
      
      @scala.inline
      def setNextYearRangeAriaLabel(value: String): Self = StObject.set(x, "nextYearRangeAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextYearRangeAriaLabelUndefined: Self = StObject.set(x, "nextYearRangeAriaLabel", js.undefined)
      
      @scala.inline
      def setOpenCalendarTitle(value: String): Self = StObject.set(x, "openCalendarTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevMonthAriaLabel(value: String): Self = StObject.set(x, "prevMonthAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevMonthAriaLabelUndefined: Self = StObject.set(x, "prevMonthAriaLabel", js.undefined)
      
      @scala.inline
      def setPrevYearAriaLabel(value: String): Self = StObject.set(x, "prevYearAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevYearAriaLabelUndefined: Self = StObject.set(x, "prevYearAriaLabel", js.undefined)
      
      @scala.inline
      def setPrevYearRangeAriaLabel(value: String): Self = StObject.set(x, "prevYearRangeAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevYearRangeAriaLabelUndefined: Self = StObject.set(x, "prevYearRangeAriaLabel", js.undefined)
      
      @scala.inline
      def setSelectedDateFormatString(value: String): Self = StObject.set(x, "selectedDateFormatString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDateFormatStringUndefined: Self = StObject.set(x, "selectedDateFormatString", js.undefined)
      
      @scala.inline
      def setTodayDateFormatString(value: String): Self = StObject.set(x, "todayDateFormatString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayDateFormatStringUndefined: Self = StObject.set(x, "todayDateFormatString", js.undefined)
      
      @scala.inline
      def setWeekNumberFormatString(value: String): Self = StObject.set(x, "weekNumberFormatString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekNumberFormatStringUndefined: Self = StObject.set(x, "weekNumberFormatString", js.undefined)
      
      @scala.inline
      def setYearPickerHeaderAriaLabel(value: String): Self = StObject.set(x, "yearPickerHeaderAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearPickerHeaderAriaLabelUndefined: Self = StObject.set(x, "yearPickerHeaderAriaLabel", js.undefined)
    }
  }
  
  trait IDateFormatting
    extends StObject
       with IDateGridStrings {
    
    /**
      * Format the day according to specified function.
      * Intended use case is localization.
      */
    def formatDay(date: Date): String
    
    /**
      * Format the month, day and year according to specified function.
      * Intended use case is localization.
      */
    def formatMonthDayYear(date: Date, strings: IDateGridStrings): String
    
    /**
      * Format the month and year according to specified function.
      * Intended use case is localization.
      */
    def formatMonthYear(date: Date, strings: IDateGridStrings): String
    
    /**
      * Format the year according to specified function.
      * Intended use case is localization.
      */
    def formatYear(date: Date): String
    
    /**
      * Parse date from string representation into Date type.
      */
    def parseDate(date: String): Date | Null
  }
  object IDateFormatting {
    
    @scala.inline
    def apply(
      days: js.Array[String],
      formatDay: Date => String,
      formatMonthDayYear: (Date, IDateGridStrings) => String,
      formatMonthYear: (Date, IDateGridStrings) => String,
      formatYear: Date => String,
      months: js.Array[String],
      parseDate: String => Date | Null,
      shortDays: js.Array[String],
      shortMonths: js.Array[String]
    ): IDateFormatting = {
      val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], formatDay = js.Any.fromFunction1(formatDay), formatMonthDayYear = js.Any.fromFunction2(formatMonthDayYear), formatMonthYear = js.Any.fromFunction2(formatMonthYear), formatYear = js.Any.fromFunction1(formatYear), months = months.asInstanceOf[js.Any], parseDate = js.Any.fromFunction1(parseDate), shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDateFormatting]
    }
    
    @scala.inline
    implicit class IDateFormattingMutableBuilder[Self <: IDateFormatting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormatDay(value: Date => String): Self = StObject.set(x, "formatDay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatMonthDayYear(value: (Date, IDateGridStrings) => String): Self = StObject.set(x, "formatMonthDayYear", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatMonthYear(value: (Date, IDateGridStrings) => String): Self = StObject.set(x, "formatMonthYear", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatYear(value: Date => String): Self = StObject.set(x, "formatYear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseDate(value: String => Date | Null): Self = StObject.set(x, "parseDate", js.Any.fromFunction1(value))
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
    
    @scala.inline
    def apply(
      days: js.Array[String],
      months: js.Array[String],
      shortDays: js.Array[String],
      shortMonths: js.Array[String]
    ): IDateGridStrings = {
      val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDateGridStrings]
    }
    
    @scala.inline
    implicit class IDateGridStringsMutableBuilder[Self <: IDateGridStrings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDays(value: js.Array[String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysVarargs(value: String*): Self = StObject.set(x, "days", js.Array(value :_*))
      
      @scala.inline
      def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
      
      @scala.inline
      def setShortDays(value: js.Array[String]): Self = StObject.set(x, "shortDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortDaysVarargs(value: String*): Self = StObject.set(x, "shortDays", js.Array(value :_*))
      
      @scala.inline
      def setShortMonths(value: js.Array[String]): Self = StObject.set(x, "shortMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortMonthsVarargs(value: String*): Self = StObject.set(x, "shortMonths", js.Array(value :_*))
    }
  }
}
