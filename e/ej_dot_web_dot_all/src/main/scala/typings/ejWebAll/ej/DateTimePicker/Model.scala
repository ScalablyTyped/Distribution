package typings.ejWebAll.ej.DateTimePicker

import typings.ejWebAll.ej.DatePicker.Header
import typings.ejWebAll.ej.DatePicker.Level
import typings.ejWebAll.ej.popupPosition
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Used to allow or restrict the editing in DateTimePicker input field directly. By setting false to this API, You can only pick the date and time values from DateTimePicker popup.
    * @Default {true}
    */
  var allowEdit: js.UndefOr[Boolean] = js.undefined
  /** Fires before the datetime popup closed in the DateTimePicker.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.undefined
  /** Fires before the datetime popup open in the DateTimePicker.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.undefined
  /** Disable the list of specified date value.
    * @Default {{}}
    */
  var blackoutDates: js.UndefOr[js.Any] = js.undefined
  /** Displays the custom text for the buttons inside the DateTimePicker popup. when the culture value changed, we can change the buttons text based on the culture.
    * @Default {{ today: Today, timeNow: Time Now, done: Done, timeTitle: Time }}
    */
  var buttonText: js.UndefOr[ButtonText] = js.undefined
  /** Fires when the datetime value changed in the DateTimePicker textbox.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Fires when DateTimePicker popup closes.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
  /** Fires after DateTimePicker control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Set the root class for DateTimePicker theme. This cssClass API helps to use custom skinning option for DateTimePicker control.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Defines the datetime format displayed in the DateTimePicker. The value should be a combination of date format and time format.
    * @Default {M/d/yyyy h:mm tt}
    */
  var dateTimeFormat: js.UndefOr[String] = js.undefined
  /** Specifies the header format of the datepicker inside the DateTimePicker popup. See DatePicker.Header
    * @Default {ej.DatePicker.Header.Short}
    */
  var dayHeaderFormat: js.UndefOr[Header | String] = js.undefined
  /** Specifies the navigation depth level in DatePicker calendar inside DateTimePicker popup. This option is not applied when start level view option is lower than depth level view.
    * See ej.DatePicker.Level
    */
  var depthLevel: js.UndefOr[Level | String] = js.undefined
  /** Fires when the DateTimePicker is destroyed successfully
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Specifies the list of time range to be disabled.
    * @Default {{}}
    */
  var disableTimeRanges: js.UndefOr[js.Any] = js.undefined
  /** Enable or disable the animation effect in DateTimePicker.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the state maintenance of DateTimePicker.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Sets the DateTimePicker direction as right to left alignment.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** When enableStrictMode true it allows the value outside of the range also but it highlights the textbox with error class, otherwise it internally changed to the correct value.
    * @Default {false}
    */
  var enableStrictMode: js.UndefOr[Boolean] = js.undefined
  /** When this property is set to false, it disables the DateTimePicker control.
    * @Default {false}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Fires when the focus-in happens in the DateTimePicker textbox.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.undefined
  /** Fires when the focus-out happens in the DateTimePicker textbox.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.undefined
  /** Specifies the header format to be displayed in the DatePicker calendar inside the DateTimePicker popup.
    * @Default {MMMM yyyy}
    */
  var headerFormat: js.UndefOr[String] = js.undefined
  /** Defines the height of the DateTimePicker textbox.
    * @Default {30}
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /** Specifies the HTML Attributes of the ejDateTimePicker
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Sets the time interval between the two adjacent time values in the time popup.
    * @Default {30}
    */
  var interval: js.UndefOr[Double] = js.undefined
  /** Defines the localization culture for DateTimePicker.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Sets the maximum value to the DateTimePicker. Beyond the maximum value an error class is added to the wrapper element when we set true to enableStrictMode.
    * @Default {new Date(12/31/2099 11:59:59 PM)}
    */
  var maxDateTime: js.UndefOr[String | Date] = js.undefined
  /** Sets the minimum value to the DateTimePicker. Behind the minimum value an error class is added to the wrapper element.
    * @Default {new Date(1/1/1900 12:00:00 AM)}
    */
  var minDateTime: js.UndefOr[String | Date] = js.undefined
  /** Fires when DateTimePicker popup opens.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
  /** Specifies the popup position of DateTimePicker.See below to know available popup positions
    * @Default {ej.PopupPosition.Bottom}
    */
  var popupPosition: js.UndefOr[String | typings.ejWebAll.ej.popupPosition] = js.undefined
  /** Indicates that the DateTimePicker value can only be read and canâ€™t change.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** It allows showing days in other months of DatePicker calendar inside the DateTimePicker popup.
    * @Default {true}
    */
  var showOtherMonths: js.UndefOr[Boolean] = js.undefined
  /** Shows or hides the arrow button from the DateTimePicker textbox. When the button disabled, the DateTimePicker popup opens while focus in the textbox and hides while focus out from
    * the textbox.
    * @Default {true}
    */
  var showPopupButton: js.UndefOr[Boolean] = js.undefined
  /** Changes the sharped edges into rounded corner for the DateTimePicker textbox and popup.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Specifies the special dates in DateTimePicker.
    * @Default {null}
    */
  var specialDates: js.UndefOr[js.Any] = js.undefined
  /** Specifies the start day of the week in datepicker inside the DateTimePicker popup.
    * @Default {1}
    */
  var startDay: js.UndefOr[Double] = js.undefined
  /** Specifies the start level view in datepicker inside the DateTimePicker popup. See DatePicker.Level
    * @Default {ej.DatePicker.Level.Month or month}
    */
  var startLevel: js.UndefOr[Level | String] = js.undefined
  /** Specifies the number of months to navigate at one click of next and previous button in datepicker inside the DateTimePicker popup.
    * @Default {1}
    */
  var stepMonths: js.UndefOr[Double] = js.undefined
  /** Defines the time format displayed in the time dropdown inside the DateTimePicker popup.
    * @Default {h:mm tt}
    */
  var timeDisplayFormat: js.UndefOr[String] = js.undefined
  /** We can drill down up to time interval on selected date with meridian details.
    * @Default {{ enabled: false, interval: 5, showMeridian: false, autoClose: true }}
    */
  var timeDrillDown: js.UndefOr[TimeDrillDown] = js.undefined
  /** Defines the width of the time dropdown inside the DateTimePicker popup.
    * @Default {100}
    */
  var timePopupWidth: js.UndefOr[String | Double] = js.undefined
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
  var value: js.UndefOr[String | Date] = js.undefined
  /** Specifies the water mark text to be displayed in input text.
    * @Default {Select date and time}
    */
  var watermarkText: js.UndefOr[String] = js.undefined
  /** Defines the width of the DateTimePicker textbox.
    * @Default {143}
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowEdit: js.UndefOr[Boolean] = js.undefined,
    beforeClose: /* e */ BeforeCloseEventArgs => Unit = null,
    beforeOpen: /* e */ BeforeOpenEventArgs => Unit = null,
    blackoutDates: js.Any = null,
    buttonText: ButtonText = null,
    change: /* e */ ChangeEventArgs => Unit = null,
    close: /* e */ CloseEventArgs => Unit = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    dateTimeFormat: String = null,
    dayHeaderFormat: Header | String = null,
    depthLevel: Level | String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    disableTimeRanges: js.Any = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableStrictMode: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    focusIn: /* e */ FocusInEventArgs => Unit = null,
    focusOut: /* e */ FocusOutEventArgs => Unit = null,
    headerFormat: String = null,
    height: String | Double = null,
    htmlAttributes: js.Any = null,
    interval: js.UndefOr[Double] = js.undefined,
    locale: String = null,
    maxDateTime: String | Date = null,
    minDateTime: String | Date = null,
    open: /* e */ OpenEventArgs => Unit = null,
    popupPosition: String | popupPosition = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    showOtherMonths: js.UndefOr[Boolean] = js.undefined,
    showPopupButton: js.UndefOr[Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    specialDates: js.Any = null,
    startDay: js.UndefOr[Double] = js.undefined,
    startLevel: Level | String = null,
    stepMonths: js.UndefOr[Double] = js.undefined,
    timeDisplayFormat: String = null,
    timeDrillDown: TimeDrillDown = null,
    timePopupWidth: String | Double = null,
    validationMessage: js.Any = null,
    validationRules: js.Any = null,
    value: String | Date = null,
    watermarkText: String = null,
    width: String | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEdit)) __obj.updateDynamic("allowEdit")(allowEdit.get.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(js.Any.fromFunction1(beforeOpen))
    if (blackoutDates != null) __obj.updateDynamic("blackoutDates")(blackoutDates.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dateTimeFormat != null) __obj.updateDynamic("dateTimeFormat")(dateTimeFormat.asInstanceOf[js.Any])
    if (dayHeaderFormat != null) __obj.updateDynamic("dayHeaderFormat")(dayHeaderFormat.asInstanceOf[js.Any])
    if (depthLevel != null) __obj.updateDynamic("depthLevel")(depthLevel.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (disableTimeRanges != null) __obj.updateDynamic("disableTimeRanges")(disableTimeRanges.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableStrictMode)) __obj.updateDynamic("enableStrictMode")(enableStrictMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (focusIn != null) __obj.updateDynamic("focusIn")(js.Any.fromFunction1(focusIn))
    if (focusOut != null) __obj.updateDynamic("focusOut")(js.Any.fromFunction1(focusOut))
    if (headerFormat != null) __obj.updateDynamic("headerFormat")(headerFormat.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDateTime != null) __obj.updateDynamic("maxDateTime")(maxDateTime.asInstanceOf[js.Any])
    if (minDateTime != null) __obj.updateDynamic("minDateTime")(minDateTime.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (popupPosition != null) __obj.updateDynamic("popupPosition")(popupPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showOtherMonths)) __obj.updateDynamic("showOtherMonths")(showOtherMonths.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPopupButton)) __obj.updateDynamic("showPopupButton")(showPopupButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.get.asInstanceOf[js.Any])
    if (specialDates != null) __obj.updateDynamic("specialDates")(specialDates.asInstanceOf[js.Any])
    if (!js.isUndefined(startDay)) __obj.updateDynamic("startDay")(startDay.get.asInstanceOf[js.Any])
    if (startLevel != null) __obj.updateDynamic("startLevel")(startLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(stepMonths)) __obj.updateDynamic("stepMonths")(stepMonths.get.asInstanceOf[js.Any])
    if (timeDisplayFormat != null) __obj.updateDynamic("timeDisplayFormat")(timeDisplayFormat.asInstanceOf[js.Any])
    if (timeDrillDown != null) __obj.updateDynamic("timeDrillDown")(timeDrillDown.asInstanceOf[js.Any])
    if (timePopupWidth != null) __obj.updateDynamic("timePopupWidth")(timePopupWidth.asInstanceOf[js.Any])
    if (validationMessage != null) __obj.updateDynamic("validationMessage")(validationMessage.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (watermarkText != null) __obj.updateDynamic("watermarkText")(watermarkText.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

