package typings
package ejDotWebDotAllLib.ejNs.DatePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** allow or restrict the drill down to multiple levels of view (month/year/decade) in DatePicker calendar
    * @Default {true}
    */
  var allowDrillDown: js.UndefOr[scala.Boolean] = js.undefined
  /** Used to allow or restrict the editing in DatePicker input field directly. By setting false to this API, You can only pick the date from DatePicker popup.
    * @Default {true}
    */
  var allowEdit: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires before closing the DatePicker popup.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, scala.Unit]] = js.undefined
  /** Fires when each date is created in the DatePicker popup calendar.
    */
  var beforeDateCreate: js.UndefOr[js.Function1[/* e */ BeforeDateCreateEventArgs, scala.Unit]] = js.undefined
  /** Fires before opening the DatePicker popup.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, scala.Unit]] = js.undefined
  /** Disable the list of specified date value.
    * @Default {{}}
    */
  var blackoutDates: js.UndefOr[js.Any] = js.undefined
  /** Sets the specified text value to the today button in the DatePicker calendar.
    * @Default {Today}
    */
  var buttonText: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when the DatePicker input value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Fires when DatePicker popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, scala.Unit]] = js.undefined
  /** Fires when the DatePicker is created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Sets the root CSS class for DatePicker theme, which is used customize.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Formats the value of the DatePicker in to the specified date format. If this API is not specified, dateFormat will be set based on the current culture of DatePicker.
    * @Default {MM/dd/yyyy}
    */
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the header format of days in DatePicker calendar. See below to get available Headers options
    * @Default {ej.DatePicker.Header.Short}
    */
  var dayHeaderFormat: js.UndefOr[java.lang.String | Header] = js.undefined
  /** Specifies the navigation depth level in DatePicker calendar. This option is not applied when start level view option is lower than depth level view. See below to know available
    * levels in DatePicker Calendar
    */
  var depthLevel: js.UndefOr[java.lang.String | Level] = js.undefined
  /** Fires when the DatePicker is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Allows to embed the DatePicker calendar in the page. Also associates DatePicker with div element instead of input.
    * @Default {false}
    */
  var displayInline: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the animation effect with DatePicker calendar.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Sustain the entire widget model of DatePicker even after form post or browser refresh
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Displays DatePicker calendar along with DatePicker input field in Right to Left direction.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows to enter valid or invalid date in input textbox and indicate as error if it is invalid value, when this API value is set to true. For false value, invalid date is not
    * allowed to input field and corrected to valid date automatically, even if invalid date is given.
    * @Default {false}
    */
  var enableStrictMode: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable or disable the DatePicker control.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Used  the required fields for special Dates in DatePicker in order to customize the special dates in a calendar.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.undefined
  /** Fires when DatePicker input gets focus.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, scala.Unit]] = js.undefined
  /** Fires when DatePicker input loses the focus.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, scala.Unit]] = js.undefined
  /** Specifies the header format to be displayed in the DatePicker calendar.
    * @Default {MMMM yyyy}
    */
  var headerFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the height of the DatePicker input text.
    * @Default {28px}
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** HighlightSection is used to highlight currently selected date's month/week/workdays. See below to get available HighlightSection options
    * @Default {none}
    */
  var highlightSection: js.UndefOr[java.lang.String | HighlightSection] = js.undefined
  /** Weekend  dates will be highlighted when this property is set to true.
    * @Default {false}
    */
  var highlightWeekend: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the HTML Attributes of the DatePicker.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Change the DatePicker calendar and date format based on given culture.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the maximum date in the calendar that the user can select.
    * @Default {new Date(2099, 11, 31)}
    */
  var maxDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  /** Specifies the minimum date in the calendar that the user can select.
    * @Default {new Date(1900, 00, 01)}
    */
  var minDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  /** Fires when calender view navigates to month/year/decade/century.
    */
  var navigate: js.UndefOr[js.Function1[/* e */ NavigateEventArgs, scala.Unit]] = js.undefined
  /** Fires when DatePicker popup is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, scala.Unit]] = js.undefined
  /** Allows to toggles the read only state of the DatePicker. When the widget is readOnly, it doesn't allow your input.
    * @Default {false}
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when a date is selected from the DatePicker popup.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, scala.Unit]] = js.undefined
  /** It allow to show/hide the disabled date ranges
    * @Default {true}
    */
  var showDisabledRange: js.UndefOr[scala.Boolean] = js.undefined
  /** It allows to display footer in DatePicker calendar.
    * @Default {true}
    */
  var showFooter: js.UndefOr[scala.Boolean] = js.undefined
  /** It allows to display/hides the other months days from the current month calendar in a DatePicker.
    * @Default {true}
    */
  var showOtherMonths: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows/hides the date icon button at right side of textbox, which is used to open or close the DatePicker calendar popup.
    * @Default {true}
    */
  var showPopupButton: js.UndefOr[scala.Boolean] = js.undefined
  /** DatePicker input is displayed with rounded corner when this property is set to true.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Used to show the tooltip when hovering on the days in the DatePicker calendar.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the special dates in DatePicker.
    * @Default {null}
    */
  var specialDates: js.UndefOr[js.Any] = js.undefined
  /** Specifies the start day of the week in DatePicker calendar.
    * @Default {0}
    */
  var startDay: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the start level view in DatePicker calendar. See below available Levels
    * @Default {ej.DatePicker.Level.Month}
    */
  var startLevel: js.UndefOr[java.lang.String | Level] = js.undefined
  /** Specifies the number of months to be navigate for one click of next and previous button in a DatePicker Calendar.
    * @Default {1}
    */
  var stepMonths: js.UndefOr[scala.Double] = js.undefined
  /** Provides option to customize the tooltip format.
    * @Default {ddd MMM dd yyyy}
    */
  var tooltipFormat: js.UndefOr[java.lang.String] = js.undefined
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
  var value: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  /** Specifies the water mark text to be displayed in input text.
    * @Default {Select date}
    */
  var watermarkText: js.UndefOr[java.lang.String] = js.undefined
  /** Allows to embed  a new column with the calendar in the popup, which will display the week number of every week in a calendar year.
    * @Default {false}
    */
  var weekNumber: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the width of the DatePicker input text.
    * @Default {160px}
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

