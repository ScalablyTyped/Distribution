package typings.eonasdanBootstrapDatetimepicker.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Datetimepicker extends js.Object {
  
  /**
    * Returns the options.allowInputToggle option.
    */
  def allowInputToggle(): Boolean = js.native
  /**
    * If true, the picker will show on textbox focus and icon click when used in a button group.
    */
  def allowInputToggle(allowInputToggle: Boolean): Datetimepicker = js.native
  
  /**
    * Returns the current options.calendarWeeks option configuration.
    */
  def calendarWeeks(): Boolean = js.native
  /**
    * Set if the week numbers will appear to the left on the days view.
    */
  def calendarWeeks(calendarWeeks: Boolean): Datetimepicker = js.native
  
  /**
    * Clears the datepicker by setting the value to null.
    */
  def clear(): Datetimepicker = js.native
  
  /**
    * Returns the options.collapse option configuration.
    */
  def collapse(): Boolean = js.native
  /**
    * If set to false the picker will display similar to sideBySide except vertical.
    */
  def collapse(collapse: Boolean): Datetimepicker = js.native
  
  /**
    * Returns the component's model current date, a moment object or null if not set.
    */
  def date(): Moment = js.native
  /**
    * Takes string, Date, moment, null parameter and sets the components model current moment to it.
    * Passing a null value unsets the components model current moment.
    * Parsing of the newDate parameter is made using moment library with the options.format and options.useStrict components configuration.
    * Throws:
    * - TypeError - in case the newDate cannot be parsed
    *
    * Emits:
    * - dp.change - in case newDate is different from current moment
    */
  def date(date: DateComparable): Datetimepicker = js.native
  
  /**
    * Returns the options.datepickerInput option.
    */
  def datepickerInput(): String = js.native
  def datepickerInput(datepickerInput: String): Datetimepicker = js.native
  
  /**
    * Returns the options.dayViewHeaderFormat option.
    */
  def dayViewHeaderFormat(): String = js.native
  /**
    * Used to customize the header of the day view.
    */
  def dayViewHeaderFormat(dayViewHeaderFormat: String): Datetimepicker = js.native
  
  /**
    * Returns the options.daysOfWeekDisabled configuration
    * IMPORTANT! Throws exception if not set explicitly https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1459
    */
  def daysOfWeekDisabled(): js.Array[DayOfWeek] = js.native
  /**
    * Takes an [ Number:0 to 6 ] and disallow the user to select weekdays that exist in this array.
    * This has lower priority over the options.minDate, options.maxDate, options.disabledDates and options.enabledDates configuration settings.
    * Emits:
    * - dp.change - if the currently selected moment falls in the values passed on the daysOfWeek parameter.
    * - dp.error - if the currently selected moment falls in the values passed on the daysOfWeek parameter.
    */
  def daysOfWeekDisabled(daysOfWeek: js.Array[DayOfWeek]): Datetimepicker = js.native
  
  /**
    * For the moment this function will only prevent the picker from calling hide() on blur so that the picker can be inspected.
    */
  def debug(): Datetimepicker = js.native
  
  /**
    * Returns a moment with the options.defaultDate option configuration or false if not set.
    */
  def defaultDate(): Moment | Boolean = js.native
  def defaultDate(dates: Boolean): Datetimepicker = js.native
  /**
    * Will set the picker's inital date.
    * If a boolean:false value is passed the options.defaultDate parameter is cleared.
    * Throws:
    * - TypeError - if the provided date doesn't pass validation, including disabledDates, enabledDates, minDate, maxDate, and daysOfWeekDisabled
    * - TypeError - if the provided date cannot be parsed by momentjs
    */
  def defaultDate(dates: DateComparable): Datetimepicker = js.native
  
  /**
    * Destroys the widget and removes all attached event listeners.
    */
  def destroy(): Unit = js.native
  
  /**
    * Disables the input element, the component is attached to, by adding a disabled="true" attribute to it. If the widget was visible before that call it is hidden.
    * Emits:
    * - dp.hide - if the widget was visible before that call
    */
  def disable(): Datetimepicker = js.native
  
  /**
    * Returns the options.disabledDates option.
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
    * For example:
    * disabledDates = ["2010-10-10"]; -> disabledDated will be { "2010-01-01": true }
    */
  def disabledDates(): IndexedDates | Boolean = js.native
  /**
    * Takes an array of values and disallows the user to select those days.
    * Setting this takes precedence over options.minDate, options.maxDate configuration.
    * Also calling this function removes the configuration of options.enabledDates if such exist.
    * Note: These values are matched with Day granularity.
    */
  def disabledDates(dates: js.Array[DateComparable]): Datetimepicker = js.native
  def disabledDates(dates: Boolean): Datetimepicker = js.native
  
  /**
    * Returns the options.disabledHours option.
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
    * For example:
    * enabledHours = [0, 1]; -> enabledHours will be { "0": true, "1": true }
    */
  def disabledHours(): IndexedHours | Boolean = js.native
  /**
    * Must be in 24 hour format. Will disallow hour selections (much like disabledTimeIntervals) but will affect all days.
    * Note: Like en/disabledDates, the en/disabledHours options are mutually exclusive and will reset one of the options back to false.
    * For example:
    * disabledHours: [0, 1, 2, 3, 4, 5, 6, 7, 8, 18, 19, 20, 21, 22, 23, 24]
    * enabledHours: [9, 10, 11, 12, 13, 14, 15, 16]
    */
  def disabledHours(disabledHours: js.Array[Double]): Datetimepicker = js.native
  def disabledHours(disabledHours: Boolean): Datetimepicker = js.native
  
  /**
    * Returns the options.disabledTimeIntervals option.
    */
  def disabledTimeIntervals(): js.Array[FromTo] | Boolean = js.native
  /**
    * Disables time selection between the given moments.
    * For example:
    * disabledTimeIntervals: [[moment({ h: 0 }), moment({ h: 8 })], [moment({ h: 18 }), moment({ h: 24 })]]
    * Will disable times between 12-8am and 6-12pm today
    */
  def disabledTimeIntervals(disabledTimeIntervals: js.Array[FromTo]): Datetimepicker = js.native
  def disabledTimeIntervals(disabledTimeIntervals: Boolean): Datetimepicker = js.native
  
  /**
    * Enables the input element, the component is attached to, by removing disabled attribute from it.
    */
  def enable(): Datetimepicker = js.native
  
  /**
    * Returns the options.enabledDates option.
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
    * For example:
    * enabledDates = ["2010-10-10"]; -> enabledDated will be { "2010-01-01": true }
    */
  def enabledDates(): IndexedDates | Boolean = js.native
  /**
    * Takes an array of values and allows the user to select only from those days.
    * Setting this takes precedence over options.minDate, options.maxDate configuration.
    * Also calling this function with boolean:false removes the configuration of options.disabledDates if such exist.
    * Note: These values are matched with Day granularity.
    */
  def enabledDates(dates: js.Array[DateComparable]): Datetimepicker = js.native
  def enabledDates(dates: Boolean): Datetimepicker = js.native
  
  /**
    * Returns the options.enabledHours option.
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
    * For example:
    * disabledHours = [0, 1]; -> disabledHours will be { "0": true, "1": true }
    */
  def enabledHours(): IndexedHours | Boolean = js.native
  /**
    * Must be in 24 hour format. Will allow hour selections (much like enabledTimeIntervals) but will affect all days.
    * Note: Like en/disabledDates, the en/disabledHours options are mutually exclusive and will reset one of the options back to false.
    * For example:
    * disabledHours: [0, 1, 2, 3, 4, 5, 6, 7, 8, 18, 19, 20, 21, 22, 23, 24]
    * enabledHours: [9, 10, 11, 12, 13, 14, 15, 16]
    */
  def enabledHours(enabledHours: js.Array[Double]): Datetimepicker = js.native
  def enabledHours(enabledHours: Boolean): Datetimepicker = js.native
  
  /**
    * Returns a boolean or array with the options.extraFormats option configuration.
    */
  def extraFormats(): js.Array[String] | Boolean = js.native
  /**
    * Takes an array of valid input moment format options, or boolean:false.
    */
  def extraFormats(formats: js.Array[String]): Datetimepicker = js.native
  def extraFormats(formats: Boolean): Datetimepicker = js.native
  
  /**
    * Returns the options.focusOnShow option.
    */
  def focusOnShow(): Boolean = js.native
  /**
    * If false, the textbox will not be given focus when the picker is shown.
    */
  def focusOnShow(focusOnShow: Boolean): Datetimepicker = js.native
  
  /**
    * Returns the component's options.format.
    */
  def format(): String | Boolean = js.native
  /**
    * Takes a moment.js format string and sets the components options.format.
    * This is used for displaying and also for parsing input strings either from the input element the component is attached to or the date() function.
    * The parameter can also be a boolean:false in which case the format is set to the locale's L LT.
    * Note: this is also used to determine if the TimePicker sub component will display the hours in 12 or 24 format. (if "a" or "h" exists in the passed string then a 12 hour mode is set)
    */
  def format(format: String): Datetimepicker = js.native
  def format(format: Boolean): Datetimepicker = js.native
  
  /**
    * Hides the widget.
    * Emits:
    * - dp.hide - if the widget was visible before that call
    */
  def hide(): Datetimepicker = js.native
  
  /**
    * Returns options.icons.
    */
  def icons(): Icons = js.native
  /**
    * Takes an Object of strings.
    * Throws:
    * - TypeError - if icons parameter is not an Object
    */
  def icons(icons: Icons): Datetimepicker = js.native
  
  /**
    * Returns the options.ignoreReadonly option.
    */
  def ignoreReadonly(): Boolean = js.native
  /**
    * Set this to true to allow the picker to be used even if the input field is readonly. This will not bypass the disabled property.
    */
  def ignoreReadonly(ignoreReadonly: Boolean): Datetimepicker = js.native
  
  /**
    * Returns the options.inline option.
    */
  def `inline`(): Boolean = js.native
  /**
    * Used to customize the header of the day view.
    */
  def `inline`(`inline`: Boolean): Datetimepicker = js.native
  
  /**
    * Returns the options.keepInvalid option.
    */
  def keepInvalid(): Boolean = js.native
  /**
    * If true, invalid dates will not be reverted to a previous selection or changed.
    */
  def keepInvalid(keepInvalid: Boolean): Datetimepicker = js.native
  
  /**
    * Returns the currently set options.keyBinds option.
    */
  def keyBinds(): KeyBinds = js.native
  /**
    * Allows for several keyBinding functions to be specified for ease of access or accessibility.
    */
  def keyBinds(keyBinds: KeyBinds): Datetimepicker = js.native
  
  /**
    * Returns the currently set locale of the options.locale.
    */
  def locale(): String = js.native
  /**
    * Takes a string of any valid moment locale e.g. de for German.
    * Throws:
    * - TypeError - if the locale is not loaded via a separate script or moment-with-locales
    */
  def locale(newLocale: String): Datetimepicker = js.native
  
  /**
    * Returns the currently set moment of the options.maxDate or false if not set.
    */
  def maxDate(): Moment | Boolean = js.native
  def maxDate(maxDate: Boolean): Datetimepicker = js.native
  /**
    * Takes a parameter and disallows the user to select a moment that is after that moment.
    * If a boolean:false value is passed options.maxDate is cleared and there is no restriction to the maximum moment the user can select.
    * Note: If the parameter is before the currently selected moment the currently selected moment changes to maxDate
    * Throws:
    * - TypeError - if the parameter cannot be parsed using the options.format and options.useStrict configuration settings
    * - TypeError - if the parameter is before options.minDate
    *
    * Emits:
    * - dp.change - if the new maxDate is after currently selected moment
    * - dp.error - if the new maxDate is after currently selected moment
    */
  def maxDate(maxDate: DateComparable): Datetimepicker = js.native
  
  /**
    * Returns the currently set moment of the options.minDate or false if not set.
    */
  def minDate(): Moment | Boolean = js.native
  def minDate(minDate: Boolean): Datetimepicker = js.native
  /**
    * Takes a parameter and disallows the user to select a moment that is before that moment.
    * If a boolean:false value is passed the options.minDate parameter is cleared and there is no restriction to the miminum moment the user can select.
    * Note: If the parameter is after the currently selected moment the currently selected moment changes to minDate parameter
    * Throws:
    * - TypeError - if the parameter cannot be parsed using the options.format and options.useStrict configuration settings
    * - TypeError - if the parameter is after options.maxDate
    *
    * Emits:
    * - dp.change - if the new minDate is after currently selected moment
    * - dp.error - if the new minDate is after currently selected moment
    */
  def minDate(minDate: DateComparable): Datetimepicker = js.native
  
  /**
    * Returns the components current options object.
    * Note that the changing the values of the returned object does not change the components actual configuration.
    */
  def options(): GetOptions = js.native
  /**
    * Takes an object variable with option key:value properties and configures the component. Use this to update multiple options on the component.
    */
  def options(options: SetOptions): Datetimepicker = js.native
  
  /**
    * Returns the options.parseInputDate option.
    */
  def parseInputDate(): ParseInputDateFunction = js.native
  /**
    * Allows custom input formatting.
    * For example:
    * The user can enter "yesterday"" or "30 days ago".
    */
  def parseInputDate(parseInputDate: ParseInputDateFunction): Datetimepicker = js.native
  
  /**
    * Shows the widget.
    * Emits:
    * - dp.show - if the widget was hidden before that call
    * - dp.change - if the widget is opened for the first time and the useCurrent is set to true or to a granularity value and the input element the component is attached to has an empty value
    */
  def show(): Datetimepicker = js.native
  
  /**
    * Returns the options.showClear option.
    */
  def showClear(): Boolean = js.native
  /**
    * Set if the clear date button will appear on the widget.
    */
  def showClear(showClear: Boolean): Datetimepicker = js.native
  
  /**
    * Returns the options.showClose option.
    */
  def showClose(): Boolean = js.native
  /**
    * If true, an icon will be displayed on the toolbar that will hide the picker.
    */
  def showClose(showClose: Boolean): Datetimepicker = js.native
  
  /**
    * Returns the options.showTodayButton option.
    */
  def showTodayButton(): Boolean = js.native
  /**
    * Set if the Today button will appear on the widget.
    */
  def showTodayButton(showTodayButton: Boolean): Datetimepicker = js.native
  
  /**
    * Returns a boolean of the options.sideBySide.
    */
  def sideBySide(): Boolean = js.native
  /**
    * If sideBySide is true and the time picker is used, both components will display side by side instead of collapsing.
    */
  def sideBySide(sideBySide: Boolean): Datetimepicker = js.native
  
  /**
    * Returns a number with the options.stepping option configuration.
    */
  def stepping(): Double = js.native
  /**
    * This will be the amount the up/down arrows move the minute value with a time picker.
    */
  def stepping(step: Double): Datetimepicker = js.native
  
  //////////////////////////////////////////////////////////////////////////////////////
  //// Below are the getters/setters for the properties of the 'options(): Options' ////
  //////////////////////////////////////////////////////////////////////////////////////
  /**
    * Returns the component's options.timeZone.
    */
  def timeZone(): String = js.native
  def timeZone(newZone: String): Datetimepicker = js.native
  
  /**
    * Shows or hides the widget.
    * Emits:
    * - dp.hide - if the widget is hidden after the toggle call
    * - dp.show - if the widget is show after the toggle call
    * - dp.change - if the widget is opened for the first time and the input element is empty and options.useCurrent != false
    */
  def toggle(): Datetimepicker = js.native
  
  /**
    * Returns the options.toolbarplacement option.
    */
  def toolbarPlacement(): ToolbarPlacement = js.native
  /**
    * Changes the placement of the toolbar where the today, clear, component switch icon are located.
    * See valid values at DatetimepickerOptions.toolbarplacement
    * Throws:
    * - TypeError if the parameter is not a valid value
    */
  def toolbarPlacement(toolbarPlacement: ToolbarPlacement): Datetimepicker = js.native
  
  /**
    * Returns the options.tooltips option.
    */
  def tooltips(): Tooltips = js.native
  /**
    * Sets the tooltips for icons.
    * Throws:
    * - TypeError - if tooltips parameter is not an Object
    */
  def tooltips(tooltips: Tooltips): Datetimepicker = js.native
  
  /**
    * Returns the options.useCurrent option configuration.
    */
  def useCurrent(): Boolean | UseCurrent = js.native
  /**
    * Takes a boolean or string.
    * If a boolean true is passed and the components model moment is not set (either through setDate or through a valid value on the input element the component is attached to) then the first time the user opens the datetimepicker widget the value is initialized to the current moment of the action.
    * If a false boolean is passed then no initialization happens on the input element.
    * You can select the granularity on the initialized moment by passing one of the following strings ("year", "month", "day", "hour", "minute") in the variable.
    * If for example you pass "day" to the useCurrent function and the input field is empty the first time the user opens the datetimepicker widget the input text will be initialized to the current datetime with day granularity (ie if currentTime = 2014-08-10 13:32:33 the input value will be initialized to 2014-08-10 00:00:00)
    * Note: If the options.defaultDate is set or the input element the component is attached to has already a value that takes precedence and the functionality of useCurrent is not triggered!
    */
  def useCurrent(useCurrent: Boolean): Datetimepicker = js.native
  def useCurrent(useCurrent: UseCurrent): Datetimepicker = js.native
  
  /**
    * Returns the options.useStrict
    */
  def useStrict(): Boolean = js.native
  /**
    * If useStrict is true, momentjs parsing rules will be stricter when determining if a date is valid or not.
    */
  def useStrict(useStrict: Boolean): Datetimepicker = js.native
  
  /**
    * Returns the options.viewDate option.
    */
  def viewDate(): Moment | Boolean = js.native
  def viewDate(viewDate: Boolean): Datetimepicker = js.native
  /**
    * This will change the viewDate without changing or setting the selected date.
    */
  def viewDate(viewDate: DateComparable): Datetimepicker = js.native
  
  /**
    * Returns the options.viewMode.
    */
  def viewMode(): ViewMode = js.native
  /**
    * Takes a string. Valid values are "days", "months", "years" and "decades"
    * Throws:
    * - TypeError - if newViewMode parameter is not an a string or if newViewMode is not a valid value
    */
  def viewMode(newViewMode: ViewMode): Datetimepicker = js.native
  
  /**
    * Returns the options.widgetPositioning object.
    */
  def widgetPositioning(): WidgetPositioning = js.native
  /**
    * WidgetPositioning defines where the dropdown with the widget will appear relative to the input element the component is attached to.
    * "auto" is the default value for both horizontal and vertical keys and it tries to automatically place the dropdown in a position that is visible to the user.
    * Usually you should not override those options unless you have a special need in your layout.
    */
  def widgetPositioning(positioningObject: WidgetPositioning): Datetimepicker = js.native
}
