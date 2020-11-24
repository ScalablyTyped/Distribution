package typings.eonasdanBootstrapDatetimepicker.mod

import typings.eonasdanBootstrapDatetimepicker.mod.global.JQuery
import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsBase extends js.Object {
  
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
  implicit class OptionsBaseOps[Self <: OptionsBase] (val x: Self) extends AnyVal {
    
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
    def setAllowInputToggle(value: Boolean): Self = this.set("allowInputToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInputToggle: Self = this.set("allowInputToggle", js.undefined)
    
    @scala.inline
    def setCalendarWeeks(value: Boolean): Self = this.set("calendarWeeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarWeeks: Self = this.set("calendarWeeks", js.undefined)
    
    @scala.inline
    def setCollapse(value: Boolean): Self = this.set("collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
    @scala.inline
    def setDatepickerInput(value: String): Self = this.set("datepickerInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatepickerInput: Self = this.set("datepickerInput", js.undefined)
    
    @scala.inline
    def setDayViewHeaderFormat(value: String): Self = this.set("dayViewHeaderFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayViewHeaderFormat: Self = this.set("dayViewHeaderFormat", js.undefined)
    
    @scala.inline
    def setDaysOfWeekDisabledVarargs(value: DayOfWeek*): Self = this.set("daysOfWeekDisabled", js.Array(value :_*))
    
    @scala.inline
    def setDaysOfWeekDisabled(value: js.Array[DayOfWeek] | Boolean): Self = this.set("daysOfWeekDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysOfWeekDisabled: Self = this.set("daysOfWeekDisabled", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDefaultDate(value: DateComparable | Boolean): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    
    @scala.inline
    def setDisabledTimeIntervalsVarargs(value: FromTo*): Self = this.set("disabledTimeIntervals", js.Array(value :_*))
    
    @scala.inline
    def setDisabledTimeIntervals(value: Boolean | js.Array[FromTo]): Self = this.set("disabledTimeIntervals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledTimeIntervals: Self = this.set("disabledTimeIntervals", js.undefined)
    
    @scala.inline
    def setExtraFormatsVarargs(value: String*): Self = this.set("extraFormats", js.Array(value :_*))
    
    @scala.inline
    def setExtraFormats(value: js.Array[String] | Boolean): Self = this.set("extraFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraFormats: Self = this.set("extraFormats", js.undefined)
    
    @scala.inline
    def setFocusOnShow(value: Boolean): Self = this.set("focusOnShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusOnShow: Self = this.set("focusOnShow", js.undefined)
    
    @scala.inline
    def setFormat(value: String | Boolean): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setIcons(value: Icons): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setIgnoreReadonly(value: Boolean): Self = this.set("ignoreReadonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreReadonly: Self = this.set("ignoreReadonly", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setKeepInvalid(value: Boolean): Self = this.set("keepInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepInvalid: Self = this.set("keepInvalid", js.undefined)
    
    @scala.inline
    def setKeepOpen(value: Boolean): Self = this.set("keepOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepOpen: Self = this.set("keepOpen", js.undefined)
    
    @scala.inline
    def setKeyBinds(value: KeyBinds): Self = this.set("keyBinds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyBinds: Self = this.set("keyBinds", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: DateComparable | Boolean): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: DateComparable | Boolean): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setParseInputDate(value: /* inputDate */ String => Moment): Self = this.set("parseInputDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParseInputDate: Self = this.set("parseInputDate", js.undefined)
    
    @scala.inline
    def setShowClear(value: Boolean): Self = this.set("showClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClear: Self = this.set("showClear", js.undefined)
    
    @scala.inline
    def setShowClose(value: Boolean): Self = this.set("showClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClose: Self = this.set("showClose", js.undefined)
    
    @scala.inline
    def setShowTodayButton(value: Boolean): Self = this.set("showTodayButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTodayButton: Self = this.set("showTodayButton", js.undefined)
    
    @scala.inline
    def setSideBySide(value: Boolean): Self = this.set("sideBySide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideBySide: Self = this.set("sideBySide", js.undefined)
    
    @scala.inline
    def setStepping(value: Double): Self = this.set("stepping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepping: Self = this.set("stepping", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setToolbarPlacement(value: ToolbarPlacement): Self = this.set("toolbarPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarPlacement: Self = this.set("toolbarPlacement", js.undefined)
    
    @scala.inline
    def setTooltips(value: Tooltips): Self = this.set("tooltips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltips: Self = this.set("tooltips", js.undefined)
    
    @scala.inline
    def setUseCurrent(value: Boolean | UseCurrent): Self = this.set("useCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCurrent: Self = this.set("useCurrent", js.undefined)
    
    @scala.inline
    def setUseStrict(value: Boolean): Self = this.set("useStrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseStrict: Self = this.set("useStrict", js.undefined)
    
    @scala.inline
    def setViewDate(value: DateComparable | Boolean): Self = this.set("viewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewDate: Self = this.set("viewDate", js.undefined)
    
    @scala.inline
    def setViewMode(value: ViewMode): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
    
    @scala.inline
    def setWidgetParent(value: String | JQuery): Self = this.set("widgetParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidgetParent: Self = this.set("widgetParent", js.undefined)
    
    @scala.inline
    def setWidgetPositioning(value: WidgetPositioning): Self = this.set("widgetPositioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidgetPositioning: Self = this.set("widgetPositioning", js.undefined)
  }
}
