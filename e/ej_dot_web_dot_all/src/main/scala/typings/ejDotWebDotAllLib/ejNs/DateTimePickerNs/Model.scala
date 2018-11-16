package typings
package ejDotWebDotAllLib.ejNs.DateTimePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Model extends js.Object {
  /** Used to allow or restrict the editing in DateTimePicker input field directly. By setting false to this API, You can only pick the date and time values from DateTimePicker popup.
               * @Default {true}
               */
  var allowEdit: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires before the datetime popup closed in the DateTimePicker.
               */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, scala.Unit]] = js.undefined
  /** Fires before the datetime popup open in the DateTimePicker.
               */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, scala.Unit]] = js.undefined
  /** Displays the custom text for the buttons inside the DateTimePicker popup. when the culture value changed, we can change the buttons text based on the culture.
               * @Default {{ today: Today, timeNow: Time Now, done: Done, timeTitle: Time }}
               */
  var buttonText: js.UndefOr[ButtonText] = js.undefined
  /** Fires when the datetime value changed in the DateTimePicker textbox.
               */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Fires when DateTimePicker popup closes.
               */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, scala.Unit]] = js.undefined
  /** Fires after DateTimePicker control is created.
               */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Set the root class for DateTimePicker theme. This cssClass API helps to use custom skinning option for DateTimePicker control.
               */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the datetime format displayed in the DateTimePicker. The value should be a combination of date format and time format.
               * @Default {M/d/yyyy h:mm tt}
               */
  var dateTimeFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the header format of the datepicker inside the DateTimePicker popup. See DatePicker.Header
               * @Default {ej.DatePicker.Header.Short}
               */
  var dayHeaderFormat: js.UndefOr[ejDotWebDotAllLib.ejNs.DatePickerNs.Header | java.lang.String] = js.undefined
  /** Specifies the navigation depth level in DatePicker calendar inside DateTimePicker popup. This option is not applied when start level view option is lower than depth level view.
               * See ej.DatePicker.Level
               */
  var depthLevel: js.UndefOr[ejDotWebDotAllLib.ejNs.DatePickerNs.Level | java.lang.String] = js.undefined
  /** Fires when the DateTimePicker is destroyed successfully
               */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Enable or disable the animation effect in DateTimePicker.
               * @Default {true}
               */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the state maintenance of DateTimePicker.
               * @Default {false}
               */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the DateTimePicker direction as right to left alignment.
               * @Default {false}
               */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** When enableStrictMode true it allows the value outside of the range also but it highlights the textbox with error class, otherwise it internally changed to the correct value.
               * @Default {false}
               */
  var enableStrictMode: js.UndefOr[scala.Boolean] = js.undefined
  /** When this property is set to false, it disables the DateTimePicker control.
               * @Default {false}
               */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when the focus-in happens in the DateTimePicker textbox.
               */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, scala.Unit]] = js.undefined
  /** Fires when the focus-out happens in the DateTimePicker textbox.
               */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, scala.Unit]] = js.undefined
  /** Specifies the header format to be displayed in the DatePicker calendar inside the DateTimePicker popup.
               * @Default {MMMM yyyy}
               */
  var headerFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the height of the DateTimePicker textbox.
               * @Default {30}
               */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Specifies the HTML Attributes of the ejDateTimePicker
               * @Default {{}}
               */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Sets the time interval between the two adjacent time values in the time popup.
               * @Default {30}
               */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /** Defines the localization culture for DateTimePicker.
               * @Default {en-US}
               */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the maximum value to the DateTimePicker. Beyond the maximum value an error class is added to the wrapper element when we set true to enableStrictMode.
               * @Default {new Date(12/31/2099 11:59:59 PM)}
               */
  var maxDateTime: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  /** Sets the minimum value to the DateTimePicker. Behind the minimum value an error class is added to the wrapper element.
               * @Default {new Date(1/1/1900 12:00:00 AM)}
               */
  var minDateTime: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  /** Fires when DateTimePicker popup opens.
               */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, scala.Unit]] = js.undefined
  /** Specifies the popup position of DateTimePicker.See below to know available popup positions
               * @Default {ej.PopupPosition.Bottom}
               */
  var popupPosition: js.UndefOr[java.lang.String | ejDotWebDotAllLib.ejNs.popupPosition] = js.undefined
  /** Indicates that the DateTimePicker value can only be read and canâ€™t change.
               * @Default {false}
               */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** It allows showing days in other months of DatePicker calendar inside the DateTimePicker popup.
               * @Default {true}
               */
  var showOtherMonths: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows or hides the arrow button from the DateTimePicker textbox. When the button disabled, the DateTimePicker popup opens while focus in the textbox and hides while focus out from
               * the textbox.
               * @Default {true}
               */
  var showPopupButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Changes the sharped edges into rounded corner for the DateTimePicker textbox and popup.
               * @Default {false}
               */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the start day of the week in datepicker inside the DateTimePicker popup.
               * @Default {1}
               */
  var startDay: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the start level view in datepicker inside the DateTimePicker popup. See DatePicker.Level
               * @Default {ej.DatePicker.Level.Month or month}
               */
  var startLevel: js.UndefOr[ejDotWebDotAllLib.ejNs.DatePickerNs.Level | java.lang.String] = js.undefined
  /** Specifies the number of months to navigate at one click of next and previous button in datepicker inside the DateTimePicker popup.
               * @Default {1}
               */
  var stepMonths: js.UndefOr[scala.Double] = js.undefined
  /** Defines the time format displayed in the time dropdown inside the DateTimePicker popup.
               * @Default {h:mm tt}
               */
  var timeDisplayFormat: js.UndefOr[java.lang.String] = js.undefined
  /** We can drill down up to time interval on selected date with meridian details.
               * @Default {{ enabled: false, interval: 5, showMeridian: false, autoClose: true }}
               */
  var timeDrillDown: js.UndefOr[TimeDrillDown] = js.undefined
  /** Defines the width of the time dropdown inside the DateTimePicker popup.
               * @Default {100}
               */
  var timePopupWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Set the jQuery validation error message in DateTimePicker.
               * @Default {null}
               */
  var validationMessage: js.UndefOr[js.Any] = js.undefined
  /** Set the jQuery validation rules in DateTimePicker.
               * @Default {null}
               */
  var validationRules: js.UndefOr[js.Any] = js.undefined
  /** Sets the DateTime value to the control.
               */
  var value: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  /** Specifies the water mark text to be displayed in input text.
               * @Default {Select date and time}
               */
  var watermarkText: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the width of the DateTimePicker textbox.
               * @Default {143}
               */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

