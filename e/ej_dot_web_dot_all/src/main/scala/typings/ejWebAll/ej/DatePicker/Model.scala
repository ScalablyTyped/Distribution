package typings.ejWebAll.ej.DatePicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** allow or restrict the drill down to multiple levels of view (month/year/decade) in DatePicker calendar
    * @Default {true}
    */
  var allowDrillDown: js.UndefOr[Boolean] = js.native
  
  /** Used to allow or restrict the editing in DatePicker input field directly. By setting false to this API, You can only pick the date from DatePicker popup.
    * @Default {true}
    */
  var allowEdit: js.UndefOr[Boolean] = js.native
  
  /** Fires before closing the DatePicker popup.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.native
  
  /** Fires when each date is created in the DatePicker popup calendar.
    */
  var beforeDateCreate: js.UndefOr[js.Function1[/* e */ BeforeDateCreateEventArgs, Unit]] = js.native
  
  /** Fires before opening the DatePicker popup.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
  
  /** Disable the list of specified date value.
    * @Default {{}}
    */
  var blackoutDates: js.UndefOr[js.Any] = js.native
  
  /** Sets the specified text value to the today button in the DatePicker calendar.
    * @Default {Today}
    */
  var buttonText: js.UndefOr[String] = js.native
  
  /** Fires when the DatePicker input value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  
  /** Fires when DatePicker popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  
  /** Fires when the DatePicker is created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Sets the root CSS class for DatePicker theme, which is used customize.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Formats the value of the DatePicker in to the specified date format. If this API is not specified, dateFormat will be set based on the current culture of DatePicker.
    * @Default {MM/dd/yyyy}
    */
  var dateFormat: js.UndefOr[String] = js.native
  
  /** Specifies the header format of days in DatePicker calendar. See below to get available Headers options
    * @Default {ej.DatePicker.Header.Short}
    */
  var dayHeaderFormat: js.UndefOr[String | Header] = js.native
  
  /** Specifies the navigation depth level in DatePicker calendar. This option is not applied when start level view option is lower than depth level view. See below to know available
    * levels in DatePicker Calendar
    */
  var depthLevel: js.UndefOr[String | Level] = js.native
  
  /** Fires when the DatePicker is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** Allows to embed the DatePicker calendar in the page. Also associates DatePicker with div element instead of input.
    * @Default {false}
    */
  var displayInline: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the animation effect with DatePicker calendar.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  
  /** Sustain the entire widget model of DatePicker even after form post or browser refresh
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  
  /** Displays DatePicker calendar along with DatePicker input field in Right to Left direction.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** Allows to enter valid or invalid date in input textbox and indicate as error if it is invalid value, when this API value is set to true. For false value, invalid date is not
    * allowed to input field and corrected to valid date automatically, even if invalid date is given.
    * @Default {false}
    */
  var enableStrictMode: js.UndefOr[Boolean] = js.native
  
  /** Enable or disable the DatePicker control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Used  the required fields for special Dates in DatePicker in order to customize the special dates in a calendar.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.native
  
  /** Fires when DatePicker input gets focus.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.native
  
  /** Fires when DatePicker input loses the focus.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.native
  
  /** Specifies the header format to be displayed in the DatePicker calendar.
    * @Default {MMMM yyyy}
    */
  var headerFormat: js.UndefOr[String] = js.native
  
  /** Specifies the height of the DatePicker input text.
    * @Default {28px}
    */
  var height: js.UndefOr[String] = js.native
  
  /** HighlightSection is used to highlight currently selected date's month/week/workdays. See below to get available HighlightSection options
    * @Default {none}
    */
  var highlightSection: js.UndefOr[String | HighlightSection] = js.native
  
  /** Weekend  dates will be highlighted when this property is set to true.
    * @Default {false}
    */
  var highlightWeekend: js.UndefOr[Boolean] = js.native
  
  /** Specifies the HTML Attributes of the DatePicker.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  
  /** Change the DatePicker calendar and date format based on given culture.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Specifies the maximum date in the calendar that the user can select.
    * @Default {new Date(2099, 11, 31)}
    */
  var maxDate: js.UndefOr[String | Date] = js.native
  
  /** Specifies the minimum date in the calendar that the user can select.
    * @Default {new Date(1900, 00, 01)}
    */
  var minDate: js.UndefOr[String | Date] = js.native
  
  /** Fires when calender view navigates to month/year/decade/century.
    */
  var navigate: js.UndefOr[js.Function1[/* e */ NavigateEventArgs, Unit]] = js.native
  
  /** Fires when DatePicker popup is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  
  /** Allows to toggles the read only state of the DatePicker. When the widget is readOnly, it doesn't allow your input.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /** Fires when a date is selected from the DatePicker popup.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  
  /** It allow to show/hide the disabled date ranges
    * @Default {true}
    */
  var showDisabledRange: js.UndefOr[Boolean] = js.native
  
  /** It allows to display footer in DatePicker calendar.
    * @Default {true}
    */
  var showFooter: js.UndefOr[Boolean] = js.native
  
  /** It allows to display/hides the other months days from the current month calendar in a DatePicker.
    * @Default {true}
    */
  var showOtherMonths: js.UndefOr[Boolean] = js.native
  
  /** Shows/hides the date icon button at right side of textbox, which is used to open or close the DatePicker calendar popup.
    * @Default {true}
    */
  var showPopupButton: js.UndefOr[Boolean] = js.native
  
  /** DatePicker input is displayed with rounded corner when this property is set to true.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  
  /** Used to show the tooltip when hovering on the days in the DatePicker calendar.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  
  /** Specifies the special dates in DatePicker.
    * @Default {null}
    */
  var specialDates: js.UndefOr[js.Any] = js.native
  
  /** Specifies the start day of the week in DatePicker calendar.
    * @Default {0}
    */
  var startDay: js.UndefOr[Double] = js.native
  
  /** Specifies the start level view in DatePicker calendar. See below available Levels
    * @Default {ej.DatePicker.Level.Month}
    */
  var startLevel: js.UndefOr[String | Level] = js.native
  
  /** Specifies the number of months to be navigate for one click of next and previous button in a DatePicker Calendar.
    * @Default {1}
    */
  var stepMonths: js.UndefOr[Double] = js.native
  
  /** Provides option to customize the tooltip format.
    * @Default {ddd MMM dd yyyy}
    */
  var tooltipFormat: js.UndefOr[String] = js.native
  
  /** Sets the jQuery validation support to DatePicker Date value. See validation
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.native
  
  /** Sets the jQuery validation custom rules to the DatePicker. see validation
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  
  /** sets or returns the current value of DatePicker
    * @Default {null}
    */
  var value: js.UndefOr[String | Date] = js.native
  
  /** Specifies the water mark text to be displayed in input text.
    * @Default {Select date}
    */
  var watermarkText: js.UndefOr[String] = js.native
  
  /** Allows to embed  a new column with the calendar in the popup, which will display the week number of every week in a calendar year.
    * @Default {false}
    */
  var weekNumber: js.UndefOr[Boolean] = js.native
  
  /** Specifies the width of the DatePicker input text.
    * @Default {160px}
    */
  var width: js.UndefOr[String] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setAllowDrillDown(value: Boolean): Self = this.set("allowDrillDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDrillDown: Self = this.set("allowDrillDown", js.undefined)
    
    @scala.inline
    def setAllowEdit(value: Boolean): Self = this.set("allowEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEdit: Self = this.set("allowEdit", js.undefined)
    
    @scala.inline
    def setBeforeClose(value: /* e */ BeforeCloseEventArgs => Unit): Self = this.set("beforeClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    
    @scala.inline
    def setBeforeDateCreate(value: /* e */ BeforeDateCreateEventArgs => Unit): Self = this.set("beforeDateCreate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeDateCreate: Self = this.set("beforeDateCreate", js.undefined)
    
    @scala.inline
    def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = this.set("beforeOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeOpen: Self = this.set("beforeOpen", js.undefined)
    
    @scala.inline
    def setBlackoutDates(value: js.Any): Self = this.set("blackoutDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlackoutDates: Self = this.set("blackoutDates", js.undefined)
    
    @scala.inline
    def setButtonText(value: String): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ ChangeEventArgs => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ CloseEventArgs => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setDayHeaderFormat(value: String | Header): Self = this.set("dayHeaderFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayHeaderFormat: Self = this.set("dayHeaderFormat", js.undefined)
    
    @scala.inline
    def setDepthLevel(value: String | Level): Self = this.set("depthLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepthLevel: Self = this.set("depthLevel", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setDisplayInline(value: Boolean): Self = this.set("displayInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayInline: Self = this.set("displayInline", js.undefined)
    
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setEnableStrictMode(value: Boolean): Self = this.set("enableStrictMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableStrictMode: Self = this.set("enableStrictMode", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFields(value: Fields): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFocusIn(value: /* e */ FocusInEventArgs => Unit): Self = this.set("focusIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocusIn: Self = this.set("focusIn", js.undefined)
    
    @scala.inline
    def setFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = this.set("focusOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocusOut: Self = this.set("focusOut", js.undefined)
    
    @scala.inline
    def setHeaderFormat(value: String): Self = this.set("headerFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFormat: Self = this.set("headerFormat", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHighlightSection(value: String | HighlightSection): Self = this.set("highlightSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightSection: Self = this.set("highlightSection", js.undefined)
    
    @scala.inline
    def setHighlightWeekend(value: Boolean): Self = this.set("highlightWeekend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightWeekend: Self = this.set("highlightWeekend", js.undefined)
    
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: String | Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: String | Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setNavigate(value: /* e */ NavigateEventArgs => Unit): Self = this.set("navigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNavigate: Self = this.set("navigate", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ OpenEventArgs => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ SelectEventArgs => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setShowDisabledRange(value: Boolean): Self = this.set("showDisabledRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDisabledRange: Self = this.set("showDisabledRange", js.undefined)
    
    @scala.inline
    def setShowFooter(value: Boolean): Self = this.set("showFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFooter: Self = this.set("showFooter", js.undefined)
    
    @scala.inline
    def setShowOtherMonths(value: Boolean): Self = this.set("showOtherMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOtherMonths: Self = this.set("showOtherMonths", js.undefined)
    
    @scala.inline
    def setShowPopupButton(value: Boolean): Self = this.set("showPopupButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPopupButton: Self = this.set("showPopupButton", js.undefined)
    
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    
    @scala.inline
    def setShowTooltip(value: Boolean): Self = this.set("showTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTooltip: Self = this.set("showTooltip", js.undefined)
    
    @scala.inline
    def setSpecialDates(value: js.Any): Self = this.set("specialDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecialDates: Self = this.set("specialDates", js.undefined)
    
    @scala.inline
    def setStartDay(value: Double): Self = this.set("startDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDay: Self = this.set("startDay", js.undefined)
    
    @scala.inline
    def setStartLevel(value: String | Level): Self = this.set("startLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartLevel: Self = this.set("startLevel", js.undefined)
    
    @scala.inline
    def setStepMonths(value: Double): Self = this.set("stepMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepMonths: Self = this.set("stepMonths", js.undefined)
    
    @scala.inline
    def setTooltipFormat(value: String): Self = this.set("tooltipFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipFormat: Self = this.set("tooltipFormat", js.undefined)
    
    @scala.inline
    def setValidationMessage(value: js.Any): Self = this.set("validationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationMessage: Self = this.set("validationMessage", js.undefined)
    
    @scala.inline
    def setValidationRules(value: js.Any): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
    
    @scala.inline
    def setValue(value: String | Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWatermarkText(value: String): Self = this.set("watermarkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatermarkText: Self = this.set("watermarkText", js.undefined)
    
    @scala.inline
    def setWeekNumber(value: Boolean): Self = this.set("weekNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekNumber: Self = this.set("weekNumber", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
