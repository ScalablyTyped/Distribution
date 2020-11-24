package typings.ejWebAll.ej.DateTimePicker

import typings.ejWebAll.ej.DatePicker.Header
import typings.ejWebAll.ej.DatePicker.Level
import typings.ejWebAll.ej.popupPosition
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Used to allow or restrict the editing in DateTimePicker input field directly. By setting false to this API, You can only pick the date and time values from DateTimePicker popup.
    * @Default {true}
    */
  var allowEdit: js.UndefOr[Boolean] = js.native
  
  /** Fires before the datetime popup closed in the DateTimePicker.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.native
  
  /** Fires before the datetime popup open in the DateTimePicker.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
  
  /** Disable the list of specified date value.
    * @Default {{}}
    */
  var blackoutDates: js.UndefOr[js.Any] = js.native
  
  /** Displays the custom text for the buttons inside the DateTimePicker popup. when the culture value changed, we can change the buttons text based on the culture.
    * @Default {{ today: Today, timeNow: Time Now, done: Done, timeTitle: Time }}
    */
  var buttonText: js.UndefOr[ButtonText] = js.native
  
  /** Fires when the datetime value changed in the DateTimePicker textbox.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  
  /** Fires when DateTimePicker popup closes.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  
  /** Fires after DateTimePicker control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Set the root class for DateTimePicker theme. This cssClass API helps to use custom skinning option for DateTimePicker control.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Defines the datetime format displayed in the DateTimePicker. The value should be a combination of date format and time format.
    * @Default {M/d/yyyy h:mm tt}
    */
  var dateTimeFormat: js.UndefOr[String] = js.native
  
  /** Specifies the header format of the datepicker inside the DateTimePicker popup. See DatePicker.Header
    * @Default {ej.DatePicker.Header.Short}
    */
  var dayHeaderFormat: js.UndefOr[Header | String] = js.native
  
  /** Specifies the navigation depth level in DatePicker calendar inside DateTimePicker popup. This option is not applied when start level view option is lower than depth level view.
    * See ej.DatePicker.Level
    */
  var depthLevel: js.UndefOr[Level | String] = js.native
  
  /** Fires when the DateTimePicker is destroyed successfully
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** Specifies the list of time range to be disabled.
    * @Default {{}}
    */
  var disableTimeRanges: js.UndefOr[js.Any] = js.native
  
  /** Enable or disable the animation effect in DateTimePicker.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the state maintenance of DateTimePicker.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  
  /** Sets the DateTimePicker direction as right to left alignment.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** When enableStrictMode true it allows the value outside of the range also but it highlights the textbox with error class, otherwise it internally changed to the correct value.
    * @Default {false}
    */
  var enableStrictMode: js.UndefOr[Boolean] = js.native
  
  /** When this property is set to false, it disables the DateTimePicker control.
    * @Default {false}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Fires when the focus-in happens in the DateTimePicker textbox.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.native
  
  /** Fires when the focus-out happens in the DateTimePicker textbox.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.native
  
  /** Specifies the header format to be displayed in the DatePicker calendar inside the DateTimePicker popup.
    * @Default {MMMM yyyy}
    */
  var headerFormat: js.UndefOr[String] = js.native
  
  /** Defines the height of the DateTimePicker textbox.
    * @Default {30}
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /** Specifies the HTML Attributes of the ejDateTimePicker
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  
  /** Sets the time interval between the two adjacent time values in the time popup.
    * @Default {30}
    */
  var interval: js.UndefOr[Double] = js.native
  
  /** Defines the localization culture for DateTimePicker.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Sets the maximum value to the DateTimePicker. Beyond the maximum value an error class is added to the wrapper element when we set true to enableStrictMode.
    * @Default {new Date(12/31/2099 11:59:59 PM)}
    */
  var maxDateTime: js.UndefOr[String | Date] = js.native
  
  /** Sets the minimum value to the DateTimePicker. Behind the minimum value an error class is added to the wrapper element.
    * @Default {new Date(1/1/1900 12:00:00 AM)}
    */
  var minDateTime: js.UndefOr[String | Date] = js.native
  
  /** Fires when DateTimePicker popup opens.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  
  /** Specifies the popup position of DateTimePicker.See below to know available popup positions
    * @Default {ej.PopupPosition.Bottom}
    */
  var popupPosition: js.UndefOr[String | typings.ejWebAll.ej.popupPosition] = js.native
  
  /** Indicates that the DateTimePicker value can only be read and canâ€™t change.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /** It allows showing days in other months of DatePicker calendar inside the DateTimePicker popup.
    * @Default {true}
    */
  var showOtherMonths: js.UndefOr[Boolean] = js.native
  
  /** Shows or hides the arrow button from the DateTimePicker textbox. When the button disabled, the DateTimePicker popup opens while focus in the textbox and hides while focus out from
    * the textbox.
    * @Default {true}
    */
  var showPopupButton: js.UndefOr[Boolean] = js.native
  
  /** Changes the sharped edges into rounded corner for the DateTimePicker textbox and popup.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  
  /** Specifies the special dates in DateTimePicker.
    * @Default {null}
    */
  var specialDates: js.UndefOr[js.Any] = js.native
  
  /** Specifies the start day of the week in datepicker inside the DateTimePicker popup.
    * @Default {1}
    */
  var startDay: js.UndefOr[Double] = js.native
  
  /** Specifies the start level view in datepicker inside the DateTimePicker popup. See DatePicker.Level
    * @Default {ej.DatePicker.Level.Month or month}
    */
  var startLevel: js.UndefOr[Level | String] = js.native
  
  /** Specifies the number of months to navigate at one click of next and previous button in datepicker inside the DateTimePicker popup.
    * @Default {1}
    */
  var stepMonths: js.UndefOr[Double] = js.native
  
  /** Defines the time format displayed in the time dropdown inside the DateTimePicker popup.
    * @Default {h:mm tt}
    */
  var timeDisplayFormat: js.UndefOr[String] = js.native
  
  /** We can drill down up to time interval on selected date with meridian details.
    * @Default {{ enabled: false, interval: 5, showMeridian: false, autoClose: true }}
    */
  var timeDrillDown: js.UndefOr[TimeDrillDown] = js.native
  
  /** Defines the width of the time dropdown inside the DateTimePicker popup.
    * @Default {100}
    */
  var timePopupWidth: js.UndefOr[String | Double] = js.native
  
  /** Set the jQuery validation error message in DateTimePicker.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.native
  
  /** Set the jQuery validation rules in DateTimePicker.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  
  /** Sets the DateTime value to the control.
    */
  var value: js.UndefOr[String | Date] = js.native
  
  /** Specifies the water mark text to be displayed in input text.
    * @Default {Select date and time}
    */
  var watermarkText: js.UndefOr[String] = js.native
  
  /** Defines the width of the DateTimePicker textbox.
    * @Default {143}
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
    def setAllowEdit(value: Boolean): Self = this.set("allowEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEdit: Self = this.set("allowEdit", js.undefined)
    
    @scala.inline
    def setBeforeClose(value: /* e */ BeforeCloseEventArgs => Unit): Self = this.set("beforeClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    
    @scala.inline
    def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = this.set("beforeOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeOpen: Self = this.set("beforeOpen", js.undefined)
    
    @scala.inline
    def setBlackoutDates(value: js.Any): Self = this.set("blackoutDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlackoutDates: Self = this.set("blackoutDates", js.undefined)
    
    @scala.inline
    def setButtonText(value: ButtonText): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    
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
    def setDateTimeFormat(value: String): Self = this.set("dateTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTimeFormat: Self = this.set("dateTimeFormat", js.undefined)
    
    @scala.inline
    def setDayHeaderFormat(value: Header | String): Self = this.set("dayHeaderFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayHeaderFormat: Self = this.set("dayHeaderFormat", js.undefined)
    
    @scala.inline
    def setDepthLevel(value: Level | String): Self = this.set("depthLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepthLevel: Self = this.set("depthLevel", js.undefined)
    
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
    def setHeaderFormat(value: String): Self = this.set("headerFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFormat: Self = this.set("headerFormat", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
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
    def setMaxDateTime(value: String | Date): Self = this.set("maxDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDateTime: Self = this.set("maxDateTime", js.undefined)
    
    @scala.inline
    def setMinDateTime(value: String | Date): Self = this.set("minDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDateTime: Self = this.set("minDateTime", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ OpenEventArgs => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPopupPosition(value: String | popupPosition): Self = this.set("popupPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupPosition: Self = this.set("popupPosition", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
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
    def setSpecialDates(value: js.Any): Self = this.set("specialDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecialDates: Self = this.set("specialDates", js.undefined)
    
    @scala.inline
    def setStartDay(value: Double): Self = this.set("startDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDay: Self = this.set("startDay", js.undefined)
    
    @scala.inline
    def setStartLevel(value: Level | String): Self = this.set("startLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartLevel: Self = this.set("startLevel", js.undefined)
    
    @scala.inline
    def setStepMonths(value: Double): Self = this.set("stepMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepMonths: Self = this.set("stepMonths", js.undefined)
    
    @scala.inline
    def setTimeDisplayFormat(value: String): Self = this.set("timeDisplayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeDisplayFormat: Self = this.set("timeDisplayFormat", js.undefined)
    
    @scala.inline
    def setTimeDrillDown(value: TimeDrillDown): Self = this.set("timeDrillDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeDrillDown: Self = this.set("timeDrillDown", js.undefined)
    
    @scala.inline
    def setTimePopupWidth(value: String | Double): Self = this.set("timePopupWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimePopupWidth: Self = this.set("timePopupWidth", js.undefined)
    
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
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
