package typings.ejWebAll.ej.TimePicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Fires when the time value changed in the TimePicker.
    */
  var beforeChange: js.UndefOr[js.Function1[/* e */ BeforeChangeEventArgs, Unit]] = js.native
  
  /** Fires when the TimePicker popup before opened.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
  
  /** Fires when the time value changed in the TimePicker.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  
  /** Fires when the TimePicker popup closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  
  /** Fires when create TimePicker successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Sets the root CSS class for the TimePicker theme, which is used to customize.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Fires when the TimePicker is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** Specifies the list of time range to be disabled.
    * @Default {{}}
    */
  var disableTimeRanges: js.UndefOr[js.Any] = js.native
  
  /** Specifies the animation behavior in TimePicker.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  
  /** Save current model value to browser cookies for maintaining states. When refreshing the TimePicker control page, the model value is applied from browser cookies or HTML 5local
    * storage.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  
  /** Displays the TimePicker as right to left alignment.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** When the enableStrictMode is set as true it allows the value outside of the range and also indicate with red color border, otherwise it internally changed to the min or max range
    * value based an input value.
    * @Default {false}
    */
  var enableStrictMode: js.UndefOr[Boolean] = js.native
  
  /** When this property is set to false, it disables the TimePicker control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Fires when the TimePicker control gets focus.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.native
  
  /** Fires when the TimePicker control get lost focus.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.native
  
  /** Defines the height of the TimePicker textbox.
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /** Sets the step value for increment an hour value through arrow keys or mouse scroll.
    * @Default {1}
    */
  var hourInterval: js.UndefOr[Double] = js.native
  
  /** It allows to define the characteristics of the TimePicker control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  
  /** Sets the time interval between the two adjacent time values in the popup.
    * @Default {30}
    */
  var interval: js.UndefOr[Double] = js.native
  
  /** Defines the localization info used by the TimePicker.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Sets the maximum time value to the TimePicker.
    * @Default {11:59:59 PM}
    */
  var maxTime: js.UndefOr[String] = js.native
  
  /** Sets the minimum time value to the TimePicker.
    * @Default {12:00:00 AM}
    */
  var minTime: js.UndefOr[String] = js.native
  
  /** Sets the step value for increment the minute value through arrow keys or mouse scroll.
    * @Default {1}
    */
  var minutesInterval: js.UndefOr[Double] = js.native
  
  /** Fires when the TimePicker popup opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  
  /** Defines the height of the TimePicker popup.
    * @Default {191px}
    */
  var popupHeight: js.UndefOr[String | Double] = js.native
  
  /** Defines the width of the TimePicker popup.
    * @Default {auto}
    */
  var popupWidth: js.UndefOr[String | Double] = js.native
  
  /** Toggles the readonly state of the TimePicker. When the widget is readOnly, it doesnâ€™t allow your input.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /** Sets the step value for increment the seconds value through arrow keys or mouse scroll.
    * @Default {1}
    */
  var secondsInterval: js.UndefOr[Double] = js.native
  
  /** Fires when the value is selected from the TimePicker dropdown list.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  
  /** shows or hides the drop down button in TimePicker.
    * @Default {true}
    */
  var showPopupButton: js.UndefOr[Boolean] = js.native
  
  /** TimePicker is displayed with rounded corner when this property is set to true.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  
  /** Defines the time format displayed in the TimePicker.
    * @Default {h:mm tt}
    */
  var timeFormat: js.UndefOr[String] = js.native
  
  /** Set the jQuery validation error message in TimePicker.
    * @Default {null}
    */
  var validationMessages: js.UndefOr[js.Any] = js.native
  
  /** Set the jQuery validation rules in TimePicker.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  
  /** Sets a specified time value on the TimePicker.
    * @Default {null}
    */
  var value: js.UndefOr[String | Date] = js.native
  
  /** Specifies the water mark text to be displayed in input text.
    * @Default {select a time}
    */
  var watermarkText: js.UndefOr[String] = js.native
  
  /** Defines the width of the TimePicker textbox.
    */
  var width: js.UndefOr[String | Double] = js.native
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
    def setBeforeChange(value: /* e */ BeforeChangeEventArgs => Unit): Self = this.set("beforeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeChange: Self = this.set("beforeChange", js.undefined)
    
    @scala.inline
    def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = this.set("beforeOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeOpen: Self = this.set("beforeOpen", js.undefined)
    
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
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setDisableTimeRanges(value: js.Any): Self = this.set("disableTimeRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTimeRanges: Self = this.set("disableTimeRanges", js.undefined)
    
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
    def setFocusIn(value: /* e */ FocusInEventArgs => Unit): Self = this.set("focusIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocusIn: Self = this.set("focusIn", js.undefined)
    
    @scala.inline
    def setFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = this.set("focusOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocusOut: Self = this.set("focusOut", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHourInterval(value: Double): Self = this.set("hourInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourInterval: Self = this.set("hourInterval", js.undefined)
    
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxTime(value: String): Self = this.set("maxTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTime: Self = this.set("maxTime", js.undefined)
    
    @scala.inline
    def setMinTime(value: String): Self = this.set("minTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTime: Self = this.set("minTime", js.undefined)
    
    @scala.inline
    def setMinutesInterval(value: Double): Self = this.set("minutesInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutesInterval: Self = this.set("minutesInterval", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ OpenEventArgs => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPopupHeight(value: String | Double): Self = this.set("popupHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupHeight: Self = this.set("popupHeight", js.undefined)
    
    @scala.inline
    def setPopupWidth(value: String | Double): Self = this.set("popupWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupWidth: Self = this.set("popupWidth", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setSecondsInterval(value: Double): Self = this.set("secondsInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondsInterval: Self = this.set("secondsInterval", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ SelectEventArgs => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setShowPopupButton(value: Boolean): Self = this.set("showPopupButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPopupButton: Self = this.set("showPopupButton", js.undefined)
    
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    
    @scala.inline
    def setTimeFormat(value: String): Self = this.set("timeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeFormat: Self = this.set("timeFormat", js.undefined)
    
    @scala.inline
    def setValidationMessages(value: js.Any): Self = this.set("validationMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationMessages: Self = this.set("validationMessages", js.undefined)
    
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
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
