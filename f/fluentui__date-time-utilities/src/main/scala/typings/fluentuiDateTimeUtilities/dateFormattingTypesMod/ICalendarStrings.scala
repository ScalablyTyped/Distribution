package typings.fluentuiDateTimeUtilities.dateFormattingTypesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalendarStrings extends IDateFormatting {
  
  /**
    * Aria-label for the "close" button.
    */
  var closeButtonAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * String to render for button to direct the user to today's date.
    */
  var goToToday: String = js.native
  
  /**
    * Aria-label for input."
    */
  var inputAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Aria-label format string for restricted input. Should have 2 string params, 0 is minDate and 1 is maxDate"
    */
  var inputBoundedFormatString: js.UndefOr[String] = js.native
  
  /**
    * Aria-label format string for restricted input only with maxDate. Should have 1 string param, 0 is maxDate"
    */
  var inputMaxBoundedFormatString: js.UndefOr[String] = js.native
  
  /**
    * Aria-label format string for restricted input only with minDate. Should have 1 string param, 0 is minDate"
    */
  var inputMinBoundedFormatString: js.UndefOr[String] = js.native
  
  /**
    * Placeholder string for an unfilled input.
    */
  var inputPlaceholder: String = js.native
  
  /**
    * Error message to render for TextField if input date string parsing fails.
    */
  var invalidInputErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * Error message to render for TextField if date boundary (minDate, maxDate) validation fails.
    */
  var isOutOfBoundsErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * Error message to render for TextField if isRequired validation fails.
    */
  var isRequiredErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * Aria-label format string for the header button in the month picker. Should have 1 string param, e.g. "`{0}`,
    * select to change the year". This aria-label will only be applied if the year picker is enabled; otherwise
    * the label will default to the header string, e.g. "2019".
    */
  var monthPickerHeaderAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Aria-label for the "next month" button in day picker.
    */
  var nextMonthAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Aria-label for the "next year" button in month picker.
    */
  var nextYearAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Aria-label for the "next year range" button in year picker.
    */
  var nextYearRangeAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Title for button to open the calendar.
    */
  var openCalendarTitle: String = js.native
  
  /**
    * Aria-label for the "previous month" button in day picker.
    */
  var prevMonthAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Aria-label for the "previous year" button in month picker.
    */
  var prevYearAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Aria-label for the "previous year range" button in year picker.
    */
  var prevYearRangeAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Aria-label format string for the currently selected date. Should have 1 string param, e.g. "Selected date `{0}`"
    */
  var selectedDateFormatString: js.UndefOr[String] = js.native
  
  /**
    * Aria-label format string for today's date. Should have 1 string param, e.g. "Today's date `{0}`"
    */
  var todayDateFormatString: js.UndefOr[String] = js.native
  
  /**
    * Aria-label format string for the week number header. Should have 1 string param, e.g. "week number `{0}`"
    */
  var weekNumberFormatString: js.UndefOr[String] = js.native
  
  /**
    * Aria-label format string for the header button in the year picker.
    * Should have 1 string param, e.g. "`{0}`, select to change the month"
    */
  var yearPickerHeaderAriaLabel: js.UndefOr[String] = js.native
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
  implicit class ICalendarStringsOps[Self <: ICalendarStrings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGoToToday(value: String): Self = this.set("goToToday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputPlaceholder(value: String): Self = this.set("inputPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenCalendarTitle(value: String): Self = this.set("openCalendarTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonAriaLabel(value: String): Self = this.set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseButtonAriaLabel: Self = this.set("closeButtonAriaLabel", js.undefined)
    
    @scala.inline
    def setInputAriaLabel(value: String): Self = this.set("inputAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputAriaLabel: Self = this.set("inputAriaLabel", js.undefined)
    
    @scala.inline
    def setInputBoundedFormatString(value: String): Self = this.set("inputBoundedFormatString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputBoundedFormatString: Self = this.set("inputBoundedFormatString", js.undefined)
    
    @scala.inline
    def setInputMaxBoundedFormatString(value: String): Self = this.set("inputMaxBoundedFormatString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputMaxBoundedFormatString: Self = this.set("inputMaxBoundedFormatString", js.undefined)
    
    @scala.inline
    def setInputMinBoundedFormatString(value: String): Self = this.set("inputMinBoundedFormatString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputMinBoundedFormatString: Self = this.set("inputMinBoundedFormatString", js.undefined)
    
    @scala.inline
    def setInvalidInputErrorMessage(value: String): Self = this.set("invalidInputErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidInputErrorMessage: Self = this.set("invalidInputErrorMessage", js.undefined)
    
    @scala.inline
    def setIsOutOfBoundsErrorMessage(value: String): Self = this.set("isOutOfBoundsErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOutOfBoundsErrorMessage: Self = this.set("isOutOfBoundsErrorMessage", js.undefined)
    
    @scala.inline
    def setIsRequiredErrorMessage(value: String): Self = this.set("isRequiredErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRequiredErrorMessage: Self = this.set("isRequiredErrorMessage", js.undefined)
    
    @scala.inline
    def setMonthPickerHeaderAriaLabel(value: String): Self = this.set("monthPickerHeaderAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthPickerHeaderAriaLabel: Self = this.set("monthPickerHeaderAriaLabel", js.undefined)
    
    @scala.inline
    def setNextMonthAriaLabel(value: String): Self = this.set("nextMonthAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMonthAriaLabel: Self = this.set("nextMonthAriaLabel", js.undefined)
    
    @scala.inline
    def setNextYearAriaLabel(value: String): Self = this.set("nextYearAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextYearAriaLabel: Self = this.set("nextYearAriaLabel", js.undefined)
    
    @scala.inline
    def setNextYearRangeAriaLabel(value: String): Self = this.set("nextYearRangeAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextYearRangeAriaLabel: Self = this.set("nextYearRangeAriaLabel", js.undefined)
    
    @scala.inline
    def setPrevMonthAriaLabel(value: String): Self = this.set("prevMonthAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevMonthAriaLabel: Self = this.set("prevMonthAriaLabel", js.undefined)
    
    @scala.inline
    def setPrevYearAriaLabel(value: String): Self = this.set("prevYearAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevYearAriaLabel: Self = this.set("prevYearAriaLabel", js.undefined)
    
    @scala.inline
    def setPrevYearRangeAriaLabel(value: String): Self = this.set("prevYearRangeAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevYearRangeAriaLabel: Self = this.set("prevYearRangeAriaLabel", js.undefined)
    
    @scala.inline
    def setSelectedDateFormatString(value: String): Self = this.set("selectedDateFormatString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedDateFormatString: Self = this.set("selectedDateFormatString", js.undefined)
    
    @scala.inline
    def setTodayDateFormatString(value: String): Self = this.set("todayDateFormatString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayDateFormatString: Self = this.set("todayDateFormatString", js.undefined)
    
    @scala.inline
    def setWeekNumberFormatString(value: String): Self = this.set("weekNumberFormatString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekNumberFormatString: Self = this.set("weekNumberFormatString", js.undefined)
    
    @scala.inline
    def setYearPickerHeaderAriaLabel(value: String): Self = this.set("yearPickerHeaderAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearPickerHeaderAriaLabel: Self = this.set("yearPickerHeaderAriaLabel", js.undefined)
  }
}
