package typings.eonasdanBootstrapDatetimepicker

import org.scalablytyped.runtime.StringDictionary
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerNumbers.`0`
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerNumbers.`1`
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerNumbers.`2`
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerNumbers.`3`
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerNumbers.`4`
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerNumbers.`5`
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerNumbers.`6`
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.DateTimePicker
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.auto
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.bottom
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.dpDotchange
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.dpDoterror
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.dpDothide
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.dpDotshow
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.dpDotupdate
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.left
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.right
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.top
import typings.eonasdanBootstrapDatetimepicker.mod.global.JQuery
import typings.jquery.JQueryEventObject
import typings.moment.mod.Moment
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait ChangeEventObject extends JQueryEventObject {
    
    /**
      * Date the picker changed to. Type: moment object (clone)
      */
    var date: Moment = js.native
    
    /**
      * Previous date. Type: moment object (clone) or false in the event of a null
      */
    var oldDate: Moment | Boolean = js.native
  }
  
  type DateComparable = String | Date | Moment
  
  @js.native
  trait Datetimepicker extends StObject {
    
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerNumbers.`0`
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerNumbers.`1`
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerNumbers.`2`
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerNumbers.`3`
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerNumbers.`4`
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerNumbers.`5`
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerNumbers.`6`
  */
  trait DayOfWeek extends StObject
  object DayOfWeek {
    
    @scala.inline
    def Friday: `5` = 5.asInstanceOf[`5`]
    
    @scala.inline
    def Monday: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def Saturday: `6` = 6.asInstanceOf[`6`]
    
    @scala.inline
    def Sunday: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def Thursday: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def Tuesday: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def Wednesday: `3` = 3.asInstanceOf[`3`]
  }
  
  @js.native
  trait ErrorEventObject extends JQueryEventObject {
    
    /**
      * The invalid date. Type: moment object (clone)
      */
    var date: Moment = js.native
  }
  
  type FromTo = js.Tuple2[Moment, Moment]
  
  @js.native
  trait GetOptions extends OptionsBase {
    
    /**
      * Disables selection of dates in the array, e.g. holidays
      * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
      * For example:
      * disabledDates = ["2010-10-10"]; -> disabledDated will be { "2010-01-01": true }
      * Default: false
      */
    var disabledDates: js.UndefOr[IndexedDates | Boolean] = js.native
    
    /**
      * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days.
      * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
      * For example:
      * disabledHours = [0, 1]; -> disabledHours will be { "0": true, "1": true }
      * Default: false
      */
    var disabledHours: js.UndefOr[IndexedHours | Boolean] = js.native
    
    /**
      * Enables selection of dates NOT in the array, e.g. holidays
      * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
      * For example:
      * enabledDates = ["2010-10-10"]; -> enabledDated will be { "2010-01-01": true }
      * Default: false
      */
    var enabledDates: js.UndefOr[IndexedDates | Boolean] = js.native
    
    /**
      * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days.
      * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
      * For example:
      * enabledHours = [0, 1]; -> enabledHours will be { "0": true, "1": true }
      * Default: false
      */
    var enabledHours: js.UndefOr[IndexedHours | Boolean] = js.native
  }
  object GetOptions {
    
    @scala.inline
    def apply(): GetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOptions]
    }
    
    @scala.inline
    implicit class GetOptionsMutableBuilder[Self <: GetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabledDates(value: IndexedDates | Boolean): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      @scala.inline
      def setDisabledHours(value: IndexedHours | Boolean): Self = StObject.set(x, "disabledHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledHoursUndefined: Self = StObject.set(x, "disabledHours", js.undefined)
      
      @scala.inline
      def setEnabledDates(value: IndexedDates | Boolean): Self = StObject.set(x, "enabledDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledDatesUndefined: Self = StObject.set(x, "enabledDates", js.undefined)
      
      @scala.inline
      def setEnabledHours(value: IndexedHours | Boolean): Self = StObject.set(x, "enabledHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledHoursUndefined: Self = StObject.set(x, "enabledHours", js.undefined)
    }
  }
  
  @js.native
  trait HideEventObject extends JQueryEventObject {
    
    /**
      * The currently set date. Type: moment object (clone)
      */
    var date: Moment = js.native
  }
  
  @js.native
  trait Icons extends StObject {
    
    /**
      * Default: "glyphicon glyphicon-trash"
      */
    var clear: js.UndefOr[String] = js.native
    
    /**
      * Default: "glyphicon glyphicon-remove"
      */
    var close: js.UndefOr[String] = js.native
    
    /**
      * Default: "glyphicon glyphicon-calendar"
      */
    var date: js.UndefOr[String] = js.native
    
    /**
      * Default: "glyphicon glyphicon-time"
      */
    var down: js.UndefOr[String] = js.native
    
    /**
      * Default: "glyphicon glyphicon-chevron-left"
      */
    var next: js.UndefOr[String] = js.native
    
    /**
      * Default: "glyphicon glyphicon-screenshot"
      */
    var previous: js.UndefOr[String] = js.native
    
    /**
      * Default: "glyphicon glyphicon-chevron-right"
      */
    var time: js.UndefOr[String] = js.native
    
    /**
      * Default: "glyphicon glyphicon-chevron-down"
      */
    var today: js.UndefOr[String] = js.native
    
    /**
      * Default: "glyphicon glyphicon-chevron-up"
      */
    var up: js.UndefOr[String] = js.native
  }
  object Icons {
    
    @scala.inline
    def apply(): Icons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Icons]
    }
    
    @scala.inline
    implicit class IconsMutableBuilder[Self <: Icons] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDown(value: String): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      @scala.inline
      def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      @scala.inline
      def setUp(value: String): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
    }
  }
  
  type IndexedDates = StringDictionary[Boolean]
  
  type IndexedHours = StringDictionary[Boolean]
  
  @js.native
  trait KeyBinds extends StObject {
    
    var `control down`: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
    
    var `control space`: js.UndefOr[js.Function1[/* widget */ JQuery, _]] = js.native
    
    var `control up`: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
    
    var delete: js.UndefOr[js.Function0[_]] = js.native
    
    var down: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
    
    var enter: js.UndefOr[js.Function0[_]] = js.native
    
    var escape: js.UndefOr[js.Function0[_]] = js.native
    
    var left: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
    
    var pageDown: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
    
    var pageUp: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
    
    var right: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
    
    var t: js.UndefOr[js.Function0[_]] = js.native
    
    var up: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
  }
  object KeyBinds {
    
    @scala.inline
    def apply(): KeyBinds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyBinds]
    }
    
    @scala.inline
    implicit class KeyBindsMutableBuilder[Self <: KeyBinds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setControl down`(value: /* widget */ JQuery | Boolean => _): Self = StObject.set(x, "control down", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setControl downUndefined`: Self = StObject.set(x, "control down", js.undefined)
      
      @scala.inline
      def `setControl space`(value: /* widget */ JQuery => _): Self = StObject.set(x, "control space", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setControl spaceUndefined`: Self = StObject.set(x, "control space", js.undefined)
      
      @scala.inline
      def `setControl up`(value: /* widget */ JQuery | Boolean => _): Self = StObject.set(x, "control up", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setControl upUndefined`: Self = StObject.set(x, "control up", js.undefined)
      
      @scala.inline
      def setDelete(value: () => _): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      @scala.inline
      def setDown(value: /* widget */ JQuery | Boolean => _): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      @scala.inline
      def setEnter(value: () => _): Self = StObject.set(x, "enter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setEscape(value: () => _): Self = StObject.set(x, "escape", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setLeft(value: /* widget */ JQuery | Boolean => _): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setPageDown(value: /* widget */ JQuery | Boolean => _): Self = StObject.set(x, "pageDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPageDownUndefined: Self = StObject.set(x, "pageDown", js.undefined)
      
      @scala.inline
      def setPageUp(value: /* widget */ JQuery | Boolean => _): Self = StObject.set(x, "pageUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPageUpUndefined: Self = StObject.set(x, "pageUp", js.undefined)
      
      @scala.inline
      def setRight(value: /* widget */ JQuery | Boolean => _): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setT(value: () => _): Self = StObject.set(x, "t", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTUndefined: Self = StObject.set(x, "t", js.undefined)
      
      @scala.inline
      def setUp(value: /* widget */ JQuery | Boolean => _): Self = StObject.set(x, "up", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
    }
  }
  
  @js.native
  trait OptionsBase extends StObject {
    
    /**
      * If true, the picker will show on textbox focus and icon click when used in a button group
      * Default: false
      */
    var allowInputToggle: js.UndefOr[Boolean] = js.native
    
    /**
      * Shows the week of the year to the left of first day of the week.
      * Default: false
      */
    var calendarWeeks: js.UndefOr[Boolean] = js.native
    
    /**
      * Using a Bootstraps collapse to switch between date/time pickers.
      * Default: true
      */
    var collapse: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: ".datepickerinput"
      */
    var datepickerInput: js.UndefOr[String] = js.native
    
    /**
      * Changes the heading of the datepicker when in "days" view.
      * Default: "MMMM YYYY"
      */
    var dayViewHeaderFormat: js.UndefOr[String] = js.native
    
    /**
      * Accepts: array of numbers from 0-6
      * Disables the section of days of the week, e.g. weekends.
      * Default: false
      */
    var daysOfWeekDisabled: js.UndefOr[js.Array[DayOfWeek] | Boolean] = js.native
    
    /**
      * Will cause the date picker to stay open after a blur event.
      * Default: false
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets the picker default date/time. Overrides useCurrent
      * Default: false
      */
    var defaultDate: js.UndefOr[DateComparable | Boolean] = js.native
    
    /**
      * Disables time selection between the given moments.
      * For example:
      * [[moment({ h: 0 }), moment({ h: 8 })], [moment({ h: 18 }), moment({ h: 24 })]]
      * Default: false
      */
    var disabledTimeIntervals: js.UndefOr[Boolean | js.Array[FromTo]] = js.native
    
    /**
      * Allows for several input formats to be valid.
      * Default: false
      */
    var extraFormats: js.UndefOr[js.Array[String] | Boolean] = js.native
    
    /**
      * If false, the textbox will not be given focus when the picker is shown
      * Default: true
      */
    var focusOnShow: js.UndefOr[Boolean] = js.native
    
    /**
      * See momentjs' docs for valid formats. Format also dictates what components are shown, e.g. MM/dd/YYYY will not display the time picker.
      * Default: false
      */
    var format: js.UndefOr[String | Boolean] = js.native
    
    /**
      * Change the default icons for the pickers functions
      * Default: {
      *              time: "glyphicon glyphicon-time",
      *              date: "glyphicon glyphicon-calendar",
      *              up: "glyphicon glyphicon-chevron-up",
      *              down: "glyphicon glyphicon-chevron-down",
      *              previous: "glyphicon glyphicon-chevron-left",
      *              next: "glyphicon glyphicon-chevron-right",
      *              today: "glyphicon glyphicon-screenshot",
      *              clear: "glyphicon glyphicon-trash",
      *              close: "glyphicon glyphicon-remove"
      *          }
      */
    var icons: js.UndefOr[Icons] = js.native
    
    /**
      * Allow date picker show event to fire even when the associated input element has the readonly="readonly" property.
      * Default: false
      */
    var ignoreReadonly: js.UndefOr[Boolean] = js.native
    
    /**
      * Will display the picker inline without the need of a input field. This will also hide borders and shadows.
      * Default: false
      */
    var `inline`: js.UndefOr[Boolean] = js.native
    
    /**
      * Will cause the date picker to not revert or overwrite invalid dates.
      * Default: false
      */
    var keepInvalid: js.UndefOr[Boolean] = js.native
    
    /**
      * Will cause the date picker to stay open after selecting a date if no time components are being used.
      * Default: false
      */
    var keepOpen: js.UndefOr[Boolean] = js.native
    
    /**
      * Allows for custom events to fire on keyboard press.
      * For example:
      *                keybinds:
      *                {
      *                        up: (widget) => console.log(widget),
      *                        "control up": (widget) => console.log(widget)
      *                }
      * The widget parameter is false, if the datepicker is closed.
      * Default: {
      *          up: function (widget) {
      *              if (widget.find(".datepicker").is(":visible")) {
      *                  this.date(this.date().clone().subtract(7, "d"));
      *              } else {
      *                  this.date(this.date().clone().add(1, "m"));
      *              }
      *          },
      *          down: function (widget) {
      *              if (!widget) {
      *                  this.show();
      *              }
      *              else if (widget.find(".datepicker").is(":visible")) {
      *                  this.date(this.date().clone().add(7, "d"));
      *              } else {
      *                  this.date(this.date().clone().subtract(1, "m"));
      *              }
      *          },
      *          "control up": function (widget) {
      *              if (widget.find(".datepicker").is(":visible")) {
      *                  this.date(this.date().clone().subtract(1, "y"));
      *              } else {
      *                  this.date(this.date().clone().add(1, "h"));
      *              }
      *          },
      *          "control down": function (widget) {
      *              if (widget.find(".datepicker").is(":visible")) {
      *                  this.date(this.date().clone().add(1, "y"));
      *              } else {
      *                  this.date(this.date().clone().subtract(1, "h"));
      *              }
      *          },
      *          left: function (widget) {
      *              if (widget.find(".datepicker").is(":visible")) {
      *                  this.date(this.date().clone().subtract(1, "d"));
      *              }
      *          },
      *          right: function (widget) {
      *              if (widget.find(".datepicker").is(":visible")) {
      *                  this.date(this.date().clone().add(1, "d"));
      *              }
      *          },
      *          pageUp: function (widget) {
      *              if (widget.find(".datepicker").is(":visible")) {
      *                  this.date(this.date().clone().subtract(1, "M"));
      *              }
      *          },
      *          pageDown: function (widget) {
      *              if (widget.find(".datepicker").is(":visible")) {
      *                  this.date(this.date().clone().add(1, "M"));
      *              }
      *          },
      *          enter: function () {
      *              this.hide();
      *          },
      *          escape: function () {
      *              this.hide();
      *          },
      *          "control space": function (widget) {
      *              if (widget.find(".timepicker").is(":visible")) {
      *                  widget.find(".btn[data-action="togglePeriod"]").click();
      *              }
      *          },
      *          t: function () {
      *              this.date(moment());
      *          },
      *          "delete": function () {
      *              this.clear();
      *          }
      *       }
      */
    var keyBinds: js.UndefOr[KeyBinds] = js.native
    
    /**
      * See momentjs for valid locales.
      * You must include moment-with-locales.js or a local js file.
      * Default: moment.locale()
      */
    var locale: js.UndefOr[String] = js.native
    
    /**
      * Prevents date/time selections after this date.
      * maxDate will override defaultDate and useCurrent if either of these settings are the same day since both options are invalid according to the rules you've selected.
      * Default: false
      */
    var maxDate: js.UndefOr[DateComparable | Boolean] = js.native
    
    /**
      * Prevents date/time selections before this date.
      * minDate will override defaultDate and useCurrent if either of these settings are the same day since both options are invalid according to the rules you've selected.
      * Default: false
      */
    var minDate: js.UndefOr[DateComparable | Boolean] = js.native
    
    /**
      * Allows custom input formatting.
      * For example:
      * The user can enter "yesterday" or "30 days ago".
      */
    var parseInputDate: js.UndefOr[ParseInputDateFunction] = js.native
    
    /**
      * Show the "Clear" button in the icon toolbar.
      * Clicking the "Clear" button will set the calendar to null.
      * Default: false
      */
    var showClear: js.UndefOr[Boolean] = js.native
    
    /**
      * Show the "Close" button in the icon toolbar.
      * Clicking the "Close" button will call hide()
      * Default: false
      */
    var showClose: js.UndefOr[Boolean] = js.native
    
    /**
      * Show the "Today" button in the icon toolbar.
      * Clicking the "Today" button will set the calendar view and set the date to now.
      * Default: false
      */
    var showTodayButton: js.UndefOr[Boolean] = js.native
    
    /**
      * Shows the picker side by side when using the time and date together.
      * Default: false
      */
    var sideBySide: js.UndefOr[Boolean] = js.native
    
    /**
      * Number of minutes the up/down arrow's will move the minutes value in the time picker.
      * Default: 1
      */
    var stepping: js.UndefOr[Double] = js.native
    
    /**
      * Default: "Etc/UTC"
      */
    var timeZone: js.UndefOr[String] = js.native
    
    /**
      * Changes the placement of the icon toolbar.
      * Default: "default"
      */
    var toolbarPlacement: js.UndefOr[ToolbarPlacement] = js.native
    
    /**
      * This will change the tooltips over each icon to a custom string
      * Default: {
      *              today: "Go to today",
      *              clear: "Clear selection",
      *              close: "Close the picker",
      *              selectMonth: "Select Month",
      *              prevMonth: "Previous Month",
      *              nextMonth: "Next Month",
      *              selectYear: "Select Year",
      *              prevYear: "Previous Year",
      *              nextYear: "Next Year",
      *              selectDecade: "Select Decade",
      *              prevDecade: "Previous Decade",
      *              nextDecade: "Next Decade",
      *              prevCentury: "Previous Century",
      *              nextCentury: "Next Century"
      *          }
      */
    var tooltips: js.UndefOr[Tooltips] = js.native
    
    /**
      * On show, will set the picker to the current date/time
      * Default: true
      */
    var useCurrent: js.UndefOr[Boolean | UseCurrent] = js.native
    
    /**
      * Defines if moment should use strict date parsing when considering a date to be valid
      * Default: false
      */
    var useStrict: js.UndefOr[Boolean] = js.native
    
    /**
      * This will change the viewDate without changing or setting the selected date.
      * Default: false
      */
    var viewDate: js.UndefOr[DateComparable | Boolean] = js.native
    
    /**
      * The default view to display when the picker is shown.
      * Note: To limit the picker to selecting, for instance the year and month, use format: MM/YYYY
      * Default: "days"
      */
    var viewMode: js.UndefOr[ViewMode] = js.native
    
    /**
      * On picker show, places the widget at the identifier (string) or jQuery object if the element has css position: "relative"
      * Default: null
      */
    var widgetParent: js.UndefOr[String | JQuery] = js.native
    
    /**
      * Accepts: object with the all or one of the parameters above
      * horizontal: 'auto', 'left', 'right'
      * vertical: 'auto', 'top', 'bottom'
      * Default: {
      *              horizontal: 'auto'
      *              vertical: 'auto'
      *          }
      */
    var widgetPositioning: js.UndefOr[WidgetPositioning] = js.native
  }
  object OptionsBase {
    
    @scala.inline
    def apply(): OptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsBase]
    }
    
    @scala.inline
    implicit class OptionsBaseMutableBuilder[Self <: OptionsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowInputToggle(value: Boolean): Self = StObject.set(x, "allowInputToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowInputToggleUndefined: Self = StObject.set(x, "allowInputToggle", js.undefined)
      
      @scala.inline
      def setCalendarWeeks(value: Boolean): Self = StObject.set(x, "calendarWeeks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarWeeksUndefined: Self = StObject.set(x, "calendarWeeks", js.undefined)
      
      @scala.inline
      def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      @scala.inline
      def setDatepickerInput(value: String): Self = StObject.set(x, "datepickerInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatepickerInputUndefined: Self = StObject.set(x, "datepickerInput", js.undefined)
      
      @scala.inline
      def setDayViewHeaderFormat(value: String): Self = StObject.set(x, "dayViewHeaderFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayViewHeaderFormatUndefined: Self = StObject.set(x, "dayViewHeaderFormat", js.undefined)
      
      @scala.inline
      def setDaysOfWeekDisabled(value: js.Array[DayOfWeek] | Boolean): Self = StObject.set(x, "daysOfWeekDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysOfWeekDisabledUndefined: Self = StObject.set(x, "daysOfWeekDisabled", js.undefined)
      
      @scala.inline
      def setDaysOfWeekDisabledVarargs(value: DayOfWeek*): Self = StObject.set(x, "daysOfWeekDisabled", js.Array(value :_*))
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDefaultDate(value: DateComparable | Boolean): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      @scala.inline
      def setDisabledTimeIntervals(value: Boolean | js.Array[FromTo]): Self = StObject.set(x, "disabledTimeIntervals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledTimeIntervalsUndefined: Self = StObject.set(x, "disabledTimeIntervals", js.undefined)
      
      @scala.inline
      def setDisabledTimeIntervalsVarargs(value: FromTo*): Self = StObject.set(x, "disabledTimeIntervals", js.Array(value :_*))
      
      @scala.inline
      def setExtraFormats(value: js.Array[String] | Boolean): Self = StObject.set(x, "extraFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraFormatsUndefined: Self = StObject.set(x, "extraFormats", js.undefined)
      
      @scala.inline
      def setExtraFormatsVarargs(value: String*): Self = StObject.set(x, "extraFormats", js.Array(value :_*))
      
      @scala.inline
      def setFocusOnShow(value: Boolean): Self = StObject.set(x, "focusOnShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOnShowUndefined: Self = StObject.set(x, "focusOnShow", js.undefined)
      
      @scala.inline
      def setFormat(value: String | Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIcons(value: Icons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setIgnoreReadonly(value: Boolean): Self = StObject.set(x, "ignoreReadonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreReadonlyUndefined: Self = StObject.set(x, "ignoreReadonly", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setKeepInvalid(value: Boolean): Self = StObject.set(x, "keepInvalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepInvalidUndefined: Self = StObject.set(x, "keepInvalid", js.undefined)
      
      @scala.inline
      def setKeepOpen(value: Boolean): Self = StObject.set(x, "keepOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepOpenUndefined: Self = StObject.set(x, "keepOpen", js.undefined)
      
      @scala.inline
      def setKeyBinds(value: KeyBinds): Self = StObject.set(x, "keyBinds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyBindsUndefined: Self = StObject.set(x, "keyBinds", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxDate(value: DateComparable | Boolean): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: DateComparable | Boolean): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setParseInputDate(value: /* inputDate */ String => Moment): Self = StObject.set(x, "parseInputDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseInputDateUndefined: Self = StObject.set(x, "parseInputDate", js.undefined)
      
      @scala.inline
      def setShowClear(value: Boolean): Self = StObject.set(x, "showClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowClearUndefined: Self = StObject.set(x, "showClear", js.undefined)
      
      @scala.inline
      def setShowClose(value: Boolean): Self = StObject.set(x, "showClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseUndefined: Self = StObject.set(x, "showClose", js.undefined)
      
      @scala.inline
      def setShowTodayButton(value: Boolean): Self = StObject.set(x, "showTodayButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTodayButtonUndefined: Self = StObject.set(x, "showTodayButton", js.undefined)
      
      @scala.inline
      def setSideBySide(value: Boolean): Self = StObject.set(x, "sideBySide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideBySideUndefined: Self = StObject.set(x, "sideBySide", js.undefined)
      
      @scala.inline
      def setStepping(value: Double): Self = StObject.set(x, "stepping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSteppingUndefined: Self = StObject.set(x, "stepping", js.undefined)
      
      @scala.inline
      def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      
      @scala.inline
      def setToolbarPlacement(value: ToolbarPlacement): Self = StObject.set(x, "toolbarPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarPlacementUndefined: Self = StObject.set(x, "toolbarPlacement", js.undefined)
      
      @scala.inline
      def setTooltips(value: Tooltips): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
      
      @scala.inline
      def setUseCurrent(value: Boolean | UseCurrent): Self = StObject.set(x, "useCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCurrentUndefined: Self = StObject.set(x, "useCurrent", js.undefined)
      
      @scala.inline
      def setUseStrict(value: Boolean): Self = StObject.set(x, "useStrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStrictUndefined: Self = StObject.set(x, "useStrict", js.undefined)
      
      @scala.inline
      def setViewDate(value: DateComparable | Boolean): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewDateUndefined: Self = StObject.set(x, "viewDate", js.undefined)
      
      @scala.inline
      def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
      
      @scala.inline
      def setWidgetParent(value: String | JQuery): Self = StObject.set(x, "widgetParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetParentUndefined: Self = StObject.set(x, "widgetParent", js.undefined)
      
      @scala.inline
      def setWidgetPositioning(value: WidgetPositioning): Self = StObject.set(x, "widgetPositioning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetPositioningUndefined: Self = StObject.set(x, "widgetPositioning", js.undefined)
    }
  }
  
  type ParseInputDateFunction = js.Function1[/* inputDate */ String, Moment]
  
  @js.native
  trait SetOptions extends OptionsBase {
    
    /**
      * Disables selection of dates in the array, e.g. holidays
      * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
      * For example:
      * disabledDates = ["2010-10-10"]; -> disabledDated will be { "2010-01-01": true }
      * Default: false
      */
    var disabledDates: js.UndefOr[js.Array[DateComparable] | Boolean] = js.native
    
    /**
      * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days.
      * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
      * For example:
      * disabledHours = [0, 1]; -> disabledHours will be { "0": true, "1": true }
      * Default: false
      */
    var disabledHours: js.UndefOr[js.Array[Double] | Boolean] = js.native
    
    /**
      * Enables selection of dates NOT in the array, e.g. holidays
      * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
      * For example:
      * enabledDates = ["2010-10-10"]; -> enabledDated will be { "2010-01-01": true }
      * Default: false
      */
    var enabledDates: js.UndefOr[js.Array[DateComparable] | Boolean] = js.native
    
    /**
      * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days.
      * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
      * For example:
      * enabledHours = [0, 1]; -> enabledHours will be { "0": true, "1": true }
      * Default: false
      */
    var enabledHours: js.UndefOr[js.Array[Double] | Boolean] = js.native
  }
  object SetOptions {
    
    @scala.inline
    def apply(): SetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetOptions]
    }
    
    @scala.inline
    implicit class SetOptionsMutableBuilder[Self <: SetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabledDates(value: js.Array[DateComparable] | Boolean): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      @scala.inline
      def setDisabledDatesVarargs(value: DateComparable*): Self = StObject.set(x, "disabledDates", js.Array(value :_*))
      
      @scala.inline
      def setDisabledHours(value: js.Array[Double] | Boolean): Self = StObject.set(x, "disabledHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledHoursUndefined: Self = StObject.set(x, "disabledHours", js.undefined)
      
      @scala.inline
      def setDisabledHoursVarargs(value: Double*): Self = StObject.set(x, "disabledHours", js.Array(value :_*))
      
      @scala.inline
      def setEnabledDates(value: js.Array[DateComparable] | Boolean): Self = StObject.set(x, "enabledDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledDatesUndefined: Self = StObject.set(x, "enabledDates", js.undefined)
      
      @scala.inline
      def setEnabledDatesVarargs(value: DateComparable*): Self = StObject.set(x, "enabledDates", js.Array(value :_*))
      
      @scala.inline
      def setEnabledHours(value: js.Array[Double] | Boolean): Self = StObject.set(x, "enabledHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledHoursUndefined: Self = StObject.set(x, "enabledHours", js.undefined)
      
      @scala.inline
      def setEnabledHoursVarargs(value: Double*): Self = StObject.set(x, "enabledHours", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.default
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.top
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.bottom
  */
  trait ToolbarPlacement extends StObject
  object ToolbarPlacement {
    
    @scala.inline
    def default: typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.default = "default".asInstanceOf[typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.default]
    
    @scala.inline
    def bottom: typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.bottom = "bottom".asInstanceOf[typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.bottom]
    
    @scala.inline
    def top: typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.top = "top".asInstanceOf[typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.top]
  }
  
  @js.native
  trait Tooltips extends StObject {
    
    /**
      * Default: "Clear selection"
      */
    var clear: js.UndefOr[String] = js.native
    
    /**
      * Default: "Close the picker"
      */
    var close: js.UndefOr[String] = js.native
    
    /**
      * Default: "Decrement Hour"
      */
    var decrementHour: js.UndefOr[String] = js.native
    
    /**
      * Default: "Decrement Minute"
      */
    var decrementMinute: js.UndefOr[String] = js.native
    
    /**
      * Default: "Decrement Second"
      */
    var decrementSecond: js.UndefOr[String] = js.native
    
    /**
      * Default: "Increment Hour"
      */
    var incrementHour: js.UndefOr[String] = js.native
    
    /**
      * Default: "Increment Minute"
      */
    var incrementMinute: js.UndefOr[String] = js.native
    
    /**
      * Default: "Increment Second"
      */
    var incrementSecond: js.UndefOr[String] = js.native
    
    /**
      * Default: "Next Century"
      */
    var nextCentury: js.UndefOr[String] = js.native
    
    /**
      * Default: "Next Decade"
      */
    var nextDecade: js.UndefOr[String] = js.native
    
    /**
      * Default: "Next Month"
      */
    var nextMonth: js.UndefOr[String] = js.native
    
    /**
      * Default: "Next Year"
      */
    var nextYear: js.UndefOr[String] = js.native
    
    /**
      * Default: "Pick Hour"
      */
    var pickHour: js.UndefOr[String] = js.native
    
    /**
      * Default: "Pick Minute"
      */
    var pickMinute: js.UndefOr[String] = js.native
    
    /**
      * Default: "Pick Second"
      */
    var pickSecond: js.UndefOr[String] = js.native
    
    /**
      * Default: "Previous Century"
      */
    var prevCentury: js.UndefOr[String] = js.native
    
    /**
      * Default: "Previous Decade"
      */
    var prevDecade: js.UndefOr[String] = js.native
    
    /**
      * Default: "Previous Month"
      */
    var prevMonth: js.UndefOr[String] = js.native
    
    /**
      * Default: "Previous Year"
      */
    var prevYear: js.UndefOr[String] = js.native
    
    /**
      * Default: "Select Decade"
      */
    var selectDecade: js.UndefOr[String] = js.native
    
    /**
      * Default: "Select Month"
      */
    var selectMonth: js.UndefOr[String] = js.native
    
    /**
      * Default: "Select Time"
      */
    var selectTime: js.UndefOr[String] = js.native
    
    /**
      * Default: "Select Year"
      */
    var selectYear: js.UndefOr[String] = js.native
    
    /**
      * Default: "Go to today"
      */
    var today: js.UndefOr[String] = js.native
    
    /**
      * Default:  "Toggle Period"
      */
    var togglePeriod: js.UndefOr[String] = js.native
  }
  object Tooltips {
    
    @scala.inline
    def apply(): Tooltips = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tooltips]
    }
    
    @scala.inline
    implicit class TooltipsMutableBuilder[Self <: Tooltips] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setDecrementHour(value: String): Self = StObject.set(x, "decrementHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecrementHourUndefined: Self = StObject.set(x, "decrementHour", js.undefined)
      
      @scala.inline
      def setDecrementMinute(value: String): Self = StObject.set(x, "decrementMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecrementMinuteUndefined: Self = StObject.set(x, "decrementMinute", js.undefined)
      
      @scala.inline
      def setDecrementSecond(value: String): Self = StObject.set(x, "decrementSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecrementSecondUndefined: Self = StObject.set(x, "decrementSecond", js.undefined)
      
      @scala.inline
      def setIncrementHour(value: String): Self = StObject.set(x, "incrementHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementHourUndefined: Self = StObject.set(x, "incrementHour", js.undefined)
      
      @scala.inline
      def setIncrementMinute(value: String): Self = StObject.set(x, "incrementMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementMinuteUndefined: Self = StObject.set(x, "incrementMinute", js.undefined)
      
      @scala.inline
      def setIncrementSecond(value: String): Self = StObject.set(x, "incrementSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementSecondUndefined: Self = StObject.set(x, "incrementSecond", js.undefined)
      
      @scala.inline
      def setNextCentury(value: String): Self = StObject.set(x, "nextCentury", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextCenturyUndefined: Self = StObject.set(x, "nextCentury", js.undefined)
      
      @scala.inline
      def setNextDecade(value: String): Self = StObject.set(x, "nextDecade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextDecadeUndefined: Self = StObject.set(x, "nextDecade", js.undefined)
      
      @scala.inline
      def setNextMonth(value: String): Self = StObject.set(x, "nextMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMonthUndefined: Self = StObject.set(x, "nextMonth", js.undefined)
      
      @scala.inline
      def setNextYear(value: String): Self = StObject.set(x, "nextYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextYearUndefined: Self = StObject.set(x, "nextYear", js.undefined)
      
      @scala.inline
      def setPickHour(value: String): Self = StObject.set(x, "pickHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickHourUndefined: Self = StObject.set(x, "pickHour", js.undefined)
      
      @scala.inline
      def setPickMinute(value: String): Self = StObject.set(x, "pickMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickMinuteUndefined: Self = StObject.set(x, "pickMinute", js.undefined)
      
      @scala.inline
      def setPickSecond(value: String): Self = StObject.set(x, "pickSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickSecondUndefined: Self = StObject.set(x, "pickSecond", js.undefined)
      
      @scala.inline
      def setPrevCentury(value: String): Self = StObject.set(x, "prevCentury", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevCenturyUndefined: Self = StObject.set(x, "prevCentury", js.undefined)
      
      @scala.inline
      def setPrevDecade(value: String): Self = StObject.set(x, "prevDecade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevDecadeUndefined: Self = StObject.set(x, "prevDecade", js.undefined)
      
      @scala.inline
      def setPrevMonth(value: String): Self = StObject.set(x, "prevMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevMonthUndefined: Self = StObject.set(x, "prevMonth", js.undefined)
      
      @scala.inline
      def setPrevYear(value: String): Self = StObject.set(x, "prevYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevYearUndefined: Self = StObject.set(x, "prevYear", js.undefined)
      
      @scala.inline
      def setSelectDecade(value: String): Self = StObject.set(x, "selectDecade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectDecadeUndefined: Self = StObject.set(x, "selectDecade", js.undefined)
      
      @scala.inline
      def setSelectMonth(value: String): Self = StObject.set(x, "selectMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectMonthUndefined: Self = StObject.set(x, "selectMonth", js.undefined)
      
      @scala.inline
      def setSelectTime(value: String): Self = StObject.set(x, "selectTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectTimeUndefined: Self = StObject.set(x, "selectTime", js.undefined)
      
      @scala.inline
      def setSelectYear(value: String): Self = StObject.set(x, "selectYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectYearUndefined: Self = StObject.set(x, "selectYear", js.undefined)
      
      @scala.inline
      def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      @scala.inline
      def setTogglePeriod(value: String): Self = StObject.set(x, "togglePeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTogglePeriodUndefined: Self = StObject.set(x, "togglePeriod", js.undefined)
    }
  }
  
  @js.native
  trait UpdateEventObject extends JQueryEventObject {
    
    /**
      * Change type as a momentjs format token. string e.g. yyyy on year change
      */
    var change: String = js.native
    
    /**
      * New viewDate.
      */
    var viewDate: Moment = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.year
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.month
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.day
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.hour
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.minute
  */
  trait UseCurrent extends StObject
  object UseCurrent {
    
    @scala.inline
    def day: typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.day = "day".asInstanceOf[typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.day]
    
    @scala.inline
    def hour: typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.hour = "hour".asInstanceOf[typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.hour]
    
    @scala.inline
    def minute: typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.minute = "minute".asInstanceOf[typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.minute]
    
    @scala.inline
    def month: typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.month = "month".asInstanceOf[typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.month]
    
    @scala.inline
    def year: typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.year = "year".asInstanceOf[typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.year]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.days
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.months
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.years
    - typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.decades
  */
  trait ViewMode extends StObject
  object ViewMode {
    
    @scala.inline
    def days: typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.days = "days".asInstanceOf[typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.days]
    
    @scala.inline
    def decades: typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.decades = "decades".asInstanceOf[typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.decades]
    
    @scala.inline
    def months: typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.months = "months".asInstanceOf[typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.months]
    
    @scala.inline
    def years: typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.years = "years".asInstanceOf[typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.years]
  }
  
  @js.native
  trait WidgetPositioning extends StObject {
    
    var horizontal: js.UndefOr[auto | left | right] = js.native
    
    var vertical: js.UndefOr[auto | top | bottom] = js.native
  }
  object WidgetPositioning {
    
    @scala.inline
    def apply(): WidgetPositioning = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidgetPositioning]
    }
    
    @scala.inline
    implicit class WidgetPositioningMutableBuilder[Self <: WidgetPositioning] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: auto | left | right): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setVertical(value: auto | top | bottom): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      @JSName("data")
      def data_DateTimePicker(key: DateTimePicker): Datetimepicker = js.native
      
      def datetimepicker(): JQuery = js.native
      def datetimepicker(options: SetOptions): JQuery = js.native
      
      @JSName("off")
      def off_dpchange(events: dpDotchange): JQuery = js.native
      @JSName("off")
      def off_dpchange(events: dpDotchange, handler: js.Function1[/* eventobject */ ChangeEventObject, _]): JQuery = js.native
      @JSName("off")
      def off_dpchange(
        events: dpDotchange,
        selector: js.UndefOr[scala.Nothing],
        handler: js.Function1[/* eventobject */ ChangeEventObject, _]
      ): JQuery = js.native
      @JSName("off")
      def off_dpchange(events: dpDotchange, selector: String): JQuery = js.native
      @JSName("off")
      def off_dpchange(
        events: dpDotchange,
        selector: String,
        handler: js.Function1[/* eventobject */ ChangeEventObject, _]
      ): JQuery = js.native
      @JSName("off")
      def off_dperror(events: dpDoterror): JQuery = js.native
      @JSName("off")
      def off_dperror(events: dpDoterror, handler: js.Function1[/* eventobject */ ErrorEventObject, _]): JQuery = js.native
      @JSName("off")
      def off_dperror(
        events: dpDoterror,
        selector: js.UndefOr[scala.Nothing],
        handler: js.Function1[/* eventobject */ ErrorEventObject, _]
      ): JQuery = js.native
      @JSName("off")
      def off_dperror(events: dpDoterror, selector: String): JQuery = js.native
      @JSName("off")
      def off_dperror(events: dpDoterror, selector: String, handler: js.Function1[/* eventobject */ ErrorEventObject, _]): JQuery = js.native
      @JSName("off")
      def off_dphide(events: dpDothide): JQuery = js.native
      @JSName("off")
      def off_dphide(events: dpDothide, handler: js.Function1[/* eventobject */ HideEventObject, _]): JQuery = js.native
      @JSName("off")
      def off_dphide(
        events: dpDothide,
        selector: js.UndefOr[scala.Nothing],
        handler: js.Function1[/* eventobject */ HideEventObject, _]
      ): JQuery = js.native
      @JSName("off")
      def off_dphide(events: dpDothide, selector: String): JQuery = js.native
      @JSName("off")
      def off_dphide(events: dpDothide, selector: String, handler: js.Function1[/* eventobject */ HideEventObject, _]): JQuery = js.native
      @JSName("off")
      def off_dpshow(events: dpDotshow): JQuery = js.native
      @JSName("off")
      def off_dpshow(events: dpDotshow, handler: js.Function1[/* eventobject */ JQueryEventObject, _]): JQuery = js.native
      @JSName("off")
      def off_dpshow(
        events: dpDotshow,
        selector: js.UndefOr[scala.Nothing],
        handler: js.Function1[/* eventobject */ JQueryEventObject, _]
      ): JQuery = js.native
      @JSName("off")
      def off_dpshow(events: dpDotshow, selector: String): JQuery = js.native
      @JSName("off")
      def off_dpshow(events: dpDotshow, selector: String, handler: js.Function1[/* eventobject */ JQueryEventObject, _]): JQuery = js.native
      @JSName("off")
      def off_dpupdate(events: dpDotupdate): JQuery = js.native
      @JSName("off")
      def off_dpupdate(events: dpDotupdate, handler: js.Function1[/* eventobject */ UpdateEventObject, _]): JQuery = js.native
      @JSName("off")
      def off_dpupdate(
        events: dpDotupdate,
        selector: js.UndefOr[scala.Nothing],
        handler: js.Function1[/* eventobject */ UpdateEventObject, _]
      ): JQuery = js.native
      @JSName("off")
      def off_dpupdate(events: dpDotupdate, selector: String): JQuery = js.native
      @JSName("off")
      def off_dpupdate(
        events: dpDotupdate,
        selector: String,
        handler: js.Function1[/* eventobject */ UpdateEventObject, _]
      ): JQuery = js.native
      
      @JSName("on")
      def on_dpchange(events: dpDotchange, handler: js.Function1[/* eventObject */ ChangeEventObject, _]): JQuery = js.native
      @JSName("on")
      def on_dpchange(events: dpDotchange, selector: String, data: js.Any): JQuery = js.native
      @JSName("on")
      def on_dpchange(
        events: dpDotchange,
        selector: String,
        data: js.Any,
        handler: js.Function1[/* eventobject */ ChangeEventObject, _]
      ): JQuery = js.native
      @JSName("on")
      def on_dpchange(
        events: dpDotchange,
        selector: String,
        handler: js.Function1[/* eventobject */ ChangeEventObject, _]
      ): JQuery = js.native
      @JSName("on")
      def on_dperror(events: dpDoterror, handler: js.Function1[/* eventObject */ ErrorEventObject, _]): JQuery = js.native
      @JSName("on")
      def on_dperror(events: dpDoterror, selector: String, data: js.Any): JQuery = js.native
      @JSName("on")
      def on_dperror(
        events: dpDoterror,
        selector: String,
        data: js.Any,
        handler: js.Function1[/* eventobject */ ErrorEventObject, _]
      ): JQuery = js.native
      @JSName("on")
      def on_dperror(events: dpDoterror, selector: String, handler: js.Function1[/* eventobject */ ErrorEventObject, _]): JQuery = js.native
      @JSName("on")
      def on_dphide(events: dpDothide, handler: js.Function1[/* eventObject */ HideEventObject, _]): JQuery = js.native
      @JSName("on")
      def on_dphide(events: dpDothide, selector: String, data: js.Any): JQuery = js.native
      @JSName("on")
      def on_dphide(
        events: dpDothide,
        selector: String,
        data: js.Any,
        handler: js.Function1[/* eventobject */ HideEventObject, _]
      ): JQuery = js.native
      @JSName("on")
      def on_dphide(events: dpDothide, selector: String, handler: js.Function1[/* eventobject */ HideEventObject, _]): JQuery = js.native
      @JSName("on")
      def on_dpshow(events: dpDotshow, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
      @JSName("on")
      def on_dpshow(events: dpDotshow, selector: String, data: js.Any): JQuery = js.native
      @JSName("on")
      def on_dpshow(
        events: dpDotshow,
        selector: String,
        data: js.Any,
        handler: js.Function1[/* eventobject */ JQueryEventObject, _]
      ): JQuery = js.native
      @JSName("on")
      def on_dpshow(events: dpDotshow, selector: String, handler: js.Function1[/* eventobject */ JQueryEventObject, _]): JQuery = js.native
      @JSName("on")
      def on_dpupdate(events: dpDotupdate, handler: js.Function1[/* eventObject */ UpdateEventObject, _]): JQuery = js.native
      @JSName("on")
      def on_dpupdate(events: dpDotupdate, selector: String, data: js.Any): JQuery = js.native
      @JSName("on")
      def on_dpupdate(
        events: dpDotupdate,
        selector: String,
        data: js.Any,
        handler: js.Function1[/* eventobject */ UpdateEventObject, _]
      ): JQuery = js.native
      @JSName("on")
      def on_dpupdate(
        events: dpDotupdate,
        selector: String,
        handler: js.Function1[/* eventobject */ UpdateEventObject, _]
      ): JQuery = js.native
    }
  }
}
