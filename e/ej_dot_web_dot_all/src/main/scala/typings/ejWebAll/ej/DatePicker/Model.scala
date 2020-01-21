package typings.ejWebAll.ej.DatePicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** allow or restrict the drill down to multiple levels of view (month/year/decade) in DatePicker calendar
    * @Default {true}
    */
  var allowDrillDown: js.UndefOr[Boolean] = js.undefined
  /** Used to allow or restrict the editing in DatePicker input field directly. By setting false to this API, You can only pick the date from DatePicker popup.
    * @Default {true}
    */
  var allowEdit: js.UndefOr[Boolean] = js.undefined
  /** Fires before closing the DatePicker popup.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.undefined
  /** Fires when each date is created in the DatePicker popup calendar.
    */
  var beforeDateCreate: js.UndefOr[js.Function1[/* e */ BeforeDateCreateEventArgs, Unit]] = js.undefined
  /** Fires before opening the DatePicker popup.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.undefined
  /** Disable the list of specified date value.
    * @Default {{}}
    */
  var blackoutDates: js.UndefOr[js.Any] = js.undefined
  /** Sets the specified text value to the today button in the DatePicker calendar.
    * @Default {Today}
    */
  var buttonText: js.UndefOr[String] = js.undefined
  /** Fires when the DatePicker input value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Fires when DatePicker popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
  /** Fires when the DatePicker is created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Sets the root CSS class for DatePicker theme, which is used customize.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Formats the value of the DatePicker in to the specified date format. If this API is not specified, dateFormat will be set based on the current culture of DatePicker.
    * @Default {MM/dd/yyyy}
    */
  var dateFormat: js.UndefOr[String] = js.undefined
  /** Specifies the header format of days in DatePicker calendar. See below to get available Headers options
    * @Default {ej.DatePicker.Header.Short}
    */
  var dayHeaderFormat: js.UndefOr[String | Header] = js.undefined
  /** Specifies the navigation depth level in DatePicker calendar. This option is not applied when start level view option is lower than depth level view. See below to know available
    * levels in DatePicker Calendar
    */
  var depthLevel: js.UndefOr[String | Level] = js.undefined
  /** Fires when the DatePicker is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Allows to embed the DatePicker calendar in the page. Also associates DatePicker with div element instead of input.
    * @Default {false}
    */
  var displayInline: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the animation effect with DatePicker calendar.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Sustain the entire widget model of DatePicker even after form post or browser refresh
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Displays DatePicker calendar along with DatePicker input field in Right to Left direction.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Allows to enter valid or invalid date in input textbox and indicate as error if it is invalid value, when this API value is set to true. For false value, invalid date is not
    * allowed to input field and corrected to valid date automatically, even if invalid date is given.
    * @Default {false}
    */
  var enableStrictMode: js.UndefOr[Boolean] = js.undefined
  /** Enable or disable the DatePicker control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Used  the required fields for special Dates in DatePicker in order to customize the special dates in a calendar.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.undefined
  /** Fires when DatePicker input gets focus.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.undefined
  /** Fires when DatePicker input loses the focus.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.undefined
  /** Specifies the header format to be displayed in the DatePicker calendar.
    * @Default {MMMM yyyy}
    */
  var headerFormat: js.UndefOr[String] = js.undefined
  /** Specifies the height of the DatePicker input text.
    * @Default {28px}
    */
  var height: js.UndefOr[String] = js.undefined
  /** HighlightSection is used to highlight currently selected date's month/week/workdays. See below to get available HighlightSection options
    * @Default {none}
    */
  var highlightSection: js.UndefOr[String | HighlightSection] = js.undefined
  /** Weekend  dates will be highlighted when this property is set to true.
    * @Default {false}
    */
  var highlightWeekend: js.UndefOr[Boolean] = js.undefined
  /** Specifies the HTML Attributes of the DatePicker.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Change the DatePicker calendar and date format based on given culture.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Specifies the maximum date in the calendar that the user can select.
    * @Default {new Date(2099, 11, 31)}
    */
  var maxDate: js.UndefOr[String | Date] = js.undefined
  /** Specifies the minimum date in the calendar that the user can select.
    * @Default {new Date(1900, 00, 01)}
    */
  var minDate: js.UndefOr[String | Date] = js.undefined
  /** Fires when calender view navigates to month/year/decade/century.
    */
  var navigate: js.UndefOr[js.Function1[/* e */ NavigateEventArgs, Unit]] = js.undefined
  /** Fires when DatePicker popup is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
  /** Allows to toggles the read only state of the DatePicker. When the widget is readOnly, it doesn't allow your input.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** Fires when a date is selected from the DatePicker popup.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.undefined
  /** It allow to show/hide the disabled date ranges
    * @Default {true}
    */
  var showDisabledRange: js.UndefOr[Boolean] = js.undefined
  /** It allows to display footer in DatePicker calendar.
    * @Default {true}
    */
  var showFooter: js.UndefOr[Boolean] = js.undefined
  /** It allows to display/hides the other months days from the current month calendar in a DatePicker.
    * @Default {true}
    */
  var showOtherMonths: js.UndefOr[Boolean] = js.undefined
  /** Shows/hides the date icon button at right side of textbox, which is used to open or close the DatePicker calendar popup.
    * @Default {true}
    */
  var showPopupButton: js.UndefOr[Boolean] = js.undefined
  /** DatePicker input is displayed with rounded corner when this property is set to true.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Used to show the tooltip when hovering on the days in the DatePicker calendar.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  /** Specifies the special dates in DatePicker.
    * @Default {null}
    */
  var specialDates: js.UndefOr[js.Any] = js.undefined
  /** Specifies the start day of the week in DatePicker calendar.
    * @Default {0}
    */
  var startDay: js.UndefOr[Double] = js.undefined
  /** Specifies the start level view in DatePicker calendar. See below available Levels
    * @Default {ej.DatePicker.Level.Month}
    */
  var startLevel: js.UndefOr[String | Level] = js.undefined
  /** Specifies the number of months to be navigate for one click of next and previous button in a DatePicker Calendar.
    * @Default {1}
    */
  var stepMonths: js.UndefOr[Double] = js.undefined
  /** Provides option to customize the tooltip format.
    * @Default {ddd MMM dd yyyy}
    */
  var tooltipFormat: js.UndefOr[String] = js.undefined
  /** Sets the jQuery validation support to DatePicker Date value. See validation
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.undefined
  /** Sets the jQuery validation custom rules to the DatePicker. see validation
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.undefined
  /** sets or returns the current value of DatePicker
    * @Default {null}
    */
  var value: js.UndefOr[String | Date] = js.undefined
  /** Specifies the water mark text to be displayed in input text.
    * @Default {Select date}
    */
  var watermarkText: js.UndefOr[String] = js.undefined
  /** Allows to embed  a new column with the calendar in the popup, which will display the week number of every week in a calendar year.
    * @Default {false}
    */
  var weekNumber: js.UndefOr[Boolean] = js.undefined
  /** Specifies the width of the DatePicker input text.
    * @Default {160px}
    */
  var width: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowDrillDown: js.UndefOr[Boolean] = js.undefined,
    allowEdit: js.UndefOr[Boolean] = js.undefined,
    beforeClose: /* e */ BeforeCloseEventArgs => Unit = null,
    beforeDateCreate: /* e */ BeforeDateCreateEventArgs => Unit = null,
    beforeOpen: /* e */ BeforeOpenEventArgs => Unit = null,
    blackoutDates: js.Any = null,
    buttonText: String = null,
    change: /* e */ ChangeEventArgs => Unit = null,
    close: /* e */ CloseEventArgs => Unit = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    dateFormat: String = null,
    dayHeaderFormat: String | Header = null,
    depthLevel: String | Level = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    displayInline: js.UndefOr[Boolean] = js.undefined,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableStrictMode: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fields: Fields = null,
    focusIn: /* e */ FocusInEventArgs => Unit = null,
    focusOut: /* e */ FocusOutEventArgs => Unit = null,
    headerFormat: String = null,
    height: String = null,
    highlightSection: String | HighlightSection = null,
    highlightWeekend: js.UndefOr[Boolean] = js.undefined,
    htmlAttributes: js.Any = null,
    locale: String = null,
    maxDate: String | Date = null,
    minDate: String | Date = null,
    navigate: /* e */ NavigateEventArgs => Unit = null,
    open: /* e */ OpenEventArgs => Unit = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    select: /* e */ SelectEventArgs => Unit = null,
    showDisabledRange: js.UndefOr[Boolean] = js.undefined,
    showFooter: js.UndefOr[Boolean] = js.undefined,
    showOtherMonths: js.UndefOr[Boolean] = js.undefined,
    showPopupButton: js.UndefOr[Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    showTooltip: js.UndefOr[Boolean] = js.undefined,
    specialDates: js.Any = null,
    startDay: Int | Double = null,
    startLevel: String | Level = null,
    stepMonths: Int | Double = null,
    tooltipFormat: String = null,
    validationMessage: js.Any = null,
    validationRules: js.Any = null,
    value: String | Date = null,
    watermarkText: String = null,
    weekNumber: js.UndefOr[Boolean] = js.undefined,
    width: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDrillDown)) __obj.updateDynamic("allowDrillDown")(allowDrillDown.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEdit)) __obj.updateDynamic("allowEdit")(allowEdit.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (beforeDateCreate != null) __obj.updateDynamic("beforeDateCreate")(js.Any.fromFunction1(beforeDateCreate))
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(js.Any.fromFunction1(beforeOpen))
    if (blackoutDates != null) __obj.updateDynamic("blackoutDates")(blackoutDates.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dayHeaderFormat != null) __obj.updateDynamic("dayHeaderFormat")(dayHeaderFormat.asInstanceOf[js.Any])
    if (depthLevel != null) __obj.updateDynamic("depthLevel")(depthLevel.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(displayInline)) __obj.updateDynamic("displayInline")(displayInline.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enableStrictMode)) __obj.updateDynamic("enableStrictMode")(enableStrictMode.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (focusIn != null) __obj.updateDynamic("focusIn")(js.Any.fromFunction1(focusIn))
    if (focusOut != null) __obj.updateDynamic("focusOut")(js.Any.fromFunction1(focusOut))
    if (headerFormat != null) __obj.updateDynamic("headerFormat")(headerFormat.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (highlightSection != null) __obj.updateDynamic("highlightSection")(highlightSection.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightWeekend)) __obj.updateDynamic("highlightWeekend")(highlightWeekend.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(js.Any.fromFunction1(navigate))
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (!js.isUndefined(showDisabledRange)) __obj.updateDynamic("showDisabledRange")(showDisabledRange.asInstanceOf[js.Any])
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(showOtherMonths)) __obj.updateDynamic("showOtherMonths")(showOtherMonths.asInstanceOf[js.Any])
    if (!js.isUndefined(showPopupButton)) __obj.updateDynamic("showPopupButton")(showPopupButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.asInstanceOf[js.Any])
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip.asInstanceOf[js.Any])
    if (specialDates != null) __obj.updateDynamic("specialDates")(specialDates.asInstanceOf[js.Any])
    if (startDay != null) __obj.updateDynamic("startDay")(startDay.asInstanceOf[js.Any])
    if (startLevel != null) __obj.updateDynamic("startLevel")(startLevel.asInstanceOf[js.Any])
    if (stepMonths != null) __obj.updateDynamic("stepMonths")(stepMonths.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (validationMessage != null) __obj.updateDynamic("validationMessage")(validationMessage.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (watermarkText != null) __obj.updateDynamic("watermarkText")(watermarkText.asInstanceOf[js.Any])
    if (!js.isUndefined(weekNumber)) __obj.updateDynamic("weekNumber")(weekNumber.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

