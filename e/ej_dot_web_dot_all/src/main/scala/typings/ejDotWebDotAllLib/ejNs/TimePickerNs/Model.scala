package typings
package ejDotWebDotAllLib.ejNs.TimePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires when the time value changed in the TimePicker.
    */
  var beforeChange: js.UndefOr[js.Function1[/* e */ BeforeChangeEventArgs, scala.Unit]] = js.undefined
  /** Fires when the TimePicker popup before opened.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, scala.Unit]] = js.undefined
  /** Fires when the time value changed in the TimePicker.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Fires when the TimePicker popup closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, scala.Unit]] = js.undefined
  /** Fires when create TimePicker successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Sets the root CSS class for the TimePicker theme, which is used to customize.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when the TimePicker is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Specifies the list of time range to be disabled.
    * @Default {{}}
    */
  var disableTimeRanges: js.UndefOr[js.Any] = js.undefined
  /** Specifies the animation behavior in TimePicker.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Save current model value to browser cookies for maintaining states. When refreshing the TimePicker control page, the model value is applied from browser cookies or HTML 5local
    * storage.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Displays the TimePicker as right to left alignment.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** When the enableStrictMode is set as true it allows the value outside of the range and also indicate with red color border, otherwise it internally changed to the min or max range
    * value based an input value.
    * @Default {false}
    */
  var enableStrictMode: js.UndefOr[scala.Boolean] = js.undefined
  /** When this property is set to false, it disables the TimePicker control.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when the TimePicker control gets focus.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, scala.Unit]] = js.undefined
  /** Fires when the TimePicker control get lost focus.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, scala.Unit]] = js.undefined
  /** Defines the height of the TimePicker textbox.
    */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Sets the step value for increment an hour value through arrow keys or mouse scroll.
    * @Default {1}
    */
  var hourInterval: js.UndefOr[scala.Double] = js.undefined
  /** It allows to define the characteristics of the TimePicker control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Sets the time interval between the two adjacent time values in the popup.
    * @Default {30}
    */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /** Defines the localization info used by the TimePicker.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the maximum time value to the TimePicker.
    * @Default {11:59:59 PM}
    */
  var maxTime: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the minimum time value to the TimePicker.
    * @Default {12:00:00 AM}
    */
  var minTime: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the step value for increment the minute value through arrow keys or mouse scroll.
    * @Default {1}
    */
  var minutesInterval: js.UndefOr[scala.Double] = js.undefined
  /** Fires when the TimePicker popup opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, scala.Unit]] = js.undefined
  /** Defines the height of the TimePicker popup.
    * @Default {191px}
    */
  var popupHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Defines the width of the TimePicker popup.
    * @Default {auto}
    */
  var popupWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Toggles the readonly state of the TimePicker. When the widget is readOnly, it doesnâ€™t allow your input.
    * @Default {false}
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the step value for increment the seconds value through arrow keys or mouse scroll.
    * @Default {1}
    */
  var secondsInterval: js.UndefOr[scala.Double] = js.undefined
  /** Fires when the value is selected from the TimePicker dropdown list.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, scala.Unit]] = js.undefined
  /** shows or hides the drop down button in TimePicker.
    * @Default {true}
    */
  var showPopupButton: js.UndefOr[scala.Boolean] = js.undefined
  /** TimePicker is displayed with rounded corner when this property is set to true.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the time format displayed in the TimePicker.
    * @Default {h:mm tt}
    */
  var timeFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Set the jQuery validation error message in TimePicker.
    * @Default {null}
    */
  var validationMessages: js.UndefOr[js.Any] = js.undefined
  /** Set the jQuery validation rules in TimePicker.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.undefined
  /** Sets a specified time value on the TimePicker.
    * @Default {null}
    */
  var value: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  /** Specifies the water mark text to be displayed in input text.
    * @Default {select a time}
    */
  var watermarkText: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the width of the TimePicker textbox.
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    beforeChange: /* e */ BeforeChangeEventArgs => scala.Unit = null,
    beforeOpen: /* e */ BeforeOpenEventArgs => scala.Unit = null,
    change: /* e */ ChangeEventArgs => scala.Unit = null,
    close: /* e */ CloseEventArgs => scala.Unit = null,
    create: /* e */ CreateEventArgs => scala.Unit = null,
    cssClass: java.lang.String = null,
    destroy: /* e */ DestroyEventArgs => scala.Unit = null,
    disableTimeRanges: js.Any = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enableStrictMode: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    focusIn: /* e */ FocusInEventArgs => scala.Unit = null,
    focusOut: /* e */ FocusOutEventArgs => scala.Unit = null,
    height: java.lang.String | scala.Double = null,
    hourInterval: scala.Int | scala.Double = null,
    htmlAttributes: js.Any = null,
    interval: scala.Int | scala.Double = null,
    locale: java.lang.String = null,
    maxTime: java.lang.String = null,
    minTime: java.lang.String = null,
    minutesInterval: scala.Int | scala.Double = null,
    open: /* e */ OpenEventArgs => scala.Unit = null,
    popupHeight: java.lang.String | scala.Double = null,
    popupWidth: java.lang.String | scala.Double = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    secondsInterval: scala.Int | scala.Double = null,
    select: /* e */ SelectEventArgs => scala.Unit = null,
    showPopupButton: js.UndefOr[scala.Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined,
    timeFormat: java.lang.String = null,
    validationMessages: js.Any = null,
    validationRules: js.Any = null,
    value: java.lang.String | stdLib.Date = null,
    watermarkText: java.lang.String = null,
    width: java.lang.String | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction1(beforeChange))
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(js.Any.fromFunction1(beforeOpen))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (disableTimeRanges != null) __obj.updateDynamic("disableTimeRanges")(disableTimeRanges)
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableStrictMode)) __obj.updateDynamic("enableStrictMode")(enableStrictMode)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (focusIn != null) __obj.updateDynamic("focusIn")(js.Any.fromFunction1(focusIn))
    if (focusOut != null) __obj.updateDynamic("focusOut")(js.Any.fromFunction1(focusOut))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hourInterval != null) __obj.updateDynamic("hourInterval")(hourInterval.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime)
    if (minTime != null) __obj.updateDynamic("minTime")(minTime)
    if (minutesInterval != null) __obj.updateDynamic("minutesInterval")(minutesInterval.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (popupHeight != null) __obj.updateDynamic("popupHeight")(popupHeight.asInstanceOf[js.Any])
    if (popupWidth != null) __obj.updateDynamic("popupWidth")(popupWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (secondsInterval != null) __obj.updateDynamic("secondsInterval")(secondsInterval.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (!js.isUndefined(showPopupButton)) __obj.updateDynamic("showPopupButton")(showPopupButton)
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat)
    if (validationMessages != null) __obj.updateDynamic("validationMessages")(validationMessages)
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (watermarkText != null) __obj.updateDynamic("watermarkText")(watermarkText)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

