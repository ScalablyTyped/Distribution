package typings.ejWebAll.ej

import typings.ejWebAll.ej.DatePicker.Header
import typings.ejWebAll.ej.DatePicker.Level
import typings.std.Date
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimePicker
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** Disables the DateTimePicker control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Enables the DateTimePicker control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Returns the current datetime value in the DateTimePicker.
    * @returns {string}
    */
  def getValue(): String = js.native
  
  /** Hides or closes the DateTimePicker popup.
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  @JSName("model")
  var model_DateTimePicker: Model = js.native
  
  /** Updates the current system date value and time value to the DateTimePicker.
    * @returns {void}
    */
  def setCurrentDateTime(): Unit = js.native
  
  /** Shows or opens the DateTimePicker popup.
    * @returns {void}
    */
  def show(): Unit = js.native
}
object DateTimePicker {
  
  trait BeforeCloseEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the DateTimePicker popup.
      */
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns the event parameters from DateTimePicker.
      */
    var events: js.UndefOr[js.Any] = js.undefined
    
    /** returns the DateTimePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeCloseEventArgs {
    
    @scala.inline
    def apply(): BeforeCloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeCloseEventArgs]
    }
    
    @scala.inline
    implicit class BeforeCloseEventArgsMutableBuilder[Self <: BeforeCloseEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeOpenEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the DateTimePicker popup.
      */
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns the event parameters from DateTimePicker.
      */
    var events: js.UndefOr[js.Any] = js.undefined
    
    /** returns the DateTimePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeOpenEventArgs {
    
    @scala.inline
    def apply(): BeforeOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeOpenEventArgs]
    }
    
    @scala.inline
    implicit class BeforeOpenEventArgsMutableBuilder[Self <: BeforeOpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ButtonText extends StObject {
    
    /** Sets the text for the Done button inside the datetime popup.
      */
    var done: js.UndefOr[String] = js.undefined
    
    /** Sets the text for the Now button inside the datetime popup.
      */
    var timeNow: js.UndefOr[String] = js.undefined
    
    /** Sets the header text for the Time dropdown.
      */
    var timeTitle: js.UndefOr[String] = js.undefined
    
    /** Sets the text for the Today button inside the datetime popup.
      */
    var today: js.UndefOr[String] = js.undefined
  }
  object ButtonText {
    
    @scala.inline
    def apply(): ButtonText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonText]
    }
    
    @scala.inline
    implicit class ButtonTextMutableBuilder[Self <: ButtonText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDone(value: String): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      @scala.inline
      def setTimeNow(value: String): Self = StObject.set(x, "timeNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeNowUndefined: Self = StObject.set(x, "timeNow", js.undefined)
      
      @scala.inline
      def setTimeTitle(value: String): Self = StObject.set(x, "timeTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeTitleUndefined: Self = StObject.set(x, "timeTitle", js.undefined)
      
      @scala.inline
      def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
    }
  }
  
  trait ChangeEventArgs extends StObject {
    
    /** returns true if change event triggered by interaction, otherwise returns false
      */
    var isInteraction: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current value is valid or not
      */
    var isValidState: js.UndefOr[Boolean] = js.undefined
    
    /** returns the TimePicker model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the previously selected date time value
      */
    var prevDateTime: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the modified datetime value
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ChangeEventArgs {
    
    @scala.inline
    def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit class ChangeEventArgsMutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      @scala.inline
      def setIsValidState(value: Boolean): Self = StObject.set(x, "isValidState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsValidStateUndefined: Self = StObject.set(x, "isValidState", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPrevDateTime(value: String): Self = StObject.set(x, "prevDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevDateTimeUndefined: Self = StObject.set(x, "prevDateTime", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CloseEventArgs extends StObject {
    
    /** returns the TimePicker model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the previously selected date time value
      */
    var prevDateTime: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the modified datetime value
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object CloseEventArgs {
    
    @scala.inline
    def apply(): CloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseEventArgs]
    }
    
    @scala.inline
    implicit class CloseEventArgsMutableBuilder[Self <: CloseEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPrevDateTime(value: String): Self = StObject.set(x, "prevDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevDateTimeUndefined: Self = StObject.set(x, "prevDateTime", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** returns the DateTimePicker model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the DateTimePicker model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait FocusInEventArgs extends StObject {
    
    /** returns the TimePicker model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the datetime value, which is in text box
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object FocusInEventArgs {
    
    @scala.inline
    def apply(): FocusInEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusInEventArgs]
    }
    
    @scala.inline
    implicit class FocusInEventArgsMutableBuilder[Self <: FocusInEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FocusOutEventArgs extends StObject {
    
    /** returns the TimePicker model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the datetime value, which is in text box
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object FocusOutEventArgs {
    
    @scala.inline
    def apply(): FocusOutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusOutEventArgs]
    }
    
    @scala.inline
    implicit class FocusOutEventArgsMutableBuilder[Self <: FocusOutEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
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
    def apply(): typings.ejWebAll.ej.DateTimePicker.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.DateTimePicker.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.DateTimePicker.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEdit(value: Boolean): Self = StObject.set(x, "allowEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEditUndefined: Self = StObject.set(x, "allowEdit", js.undefined)
      
      @scala.inline
      def setBeforeClose(value: /* e */ BeforeCloseEventArgs => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      @scala.inline
      def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      @scala.inline
      def setBlackoutDates(value: js.Any): Self = StObject.set(x, "blackoutDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlackoutDatesUndefined: Self = StObject.set(x, "blackoutDates", js.undefined)
      
      @scala.inline
      def setButtonText(value: ButtonText): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      @scala.inline
      def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setClose(value: /* e */ CloseEventArgs => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDateTimeFormat(value: String): Self = StObject.set(x, "dateTimeFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTimeFormatUndefined: Self = StObject.set(x, "dateTimeFormat", js.undefined)
      
      @scala.inline
      def setDayHeaderFormat(value: Header | String): Self = StObject.set(x, "dayHeaderFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayHeaderFormatUndefined: Self = StObject.set(x, "dayHeaderFormat", js.undefined)
      
      @scala.inline
      def setDepthLevel(value: Level | String): Self = StObject.set(x, "depthLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthLevelUndefined: Self = StObject.set(x, "depthLevel", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setDisableTimeRanges(value: js.Any): Self = StObject.set(x, "disableTimeRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTimeRangesUndefined: Self = StObject.set(x, "disableTimeRanges", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnableStrictMode(value: Boolean): Self = StObject.set(x, "enableStrictMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableStrictModeUndefined: Self = StObject.set(x, "enableStrictMode", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFocusIn(value: /* e */ FocusInEventArgs => Unit): Self = StObject.set(x, "focusIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusInUndefined: Self = StObject.set(x, "focusIn", js.undefined)
      
      @scala.inline
      def setFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = StObject.set(x, "focusOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusOutUndefined: Self = StObject.set(x, "focusOut", js.undefined)
      
      @scala.inline
      def setHeaderFormat(value: String): Self = StObject.set(x, "headerFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFormatUndefined: Self = StObject.set(x, "headerFormat", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxDateTime(value: String | Date): Self = StObject.set(x, "maxDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateTimeUndefined: Self = StObject.set(x, "maxDateTime", js.undefined)
      
      @scala.inline
      def setMinDateTime(value: String | Date): Self = StObject.set(x, "minDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateTimeUndefined: Self = StObject.set(x, "minDateTime", js.undefined)
      
      @scala.inline
      def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPopupPosition(value: String | popupPosition): Self = StObject.set(x, "popupPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupPositionUndefined: Self = StObject.set(x, "popupPosition", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setShowOtherMonths(value: Boolean): Self = StObject.set(x, "showOtherMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOtherMonthsUndefined: Self = StObject.set(x, "showOtherMonths", js.undefined)
      
      @scala.inline
      def setShowPopupButton(value: Boolean): Self = StObject.set(x, "showPopupButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPopupButtonUndefined: Self = StObject.set(x, "showPopupButton", js.undefined)
      
      @scala.inline
      def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      @scala.inline
      def setSpecialDates(value: js.Any): Self = StObject.set(x, "specialDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecialDatesUndefined: Self = StObject.set(x, "specialDates", js.undefined)
      
      @scala.inline
      def setStartDay(value: Double): Self = StObject.set(x, "startDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDayUndefined: Self = StObject.set(x, "startDay", js.undefined)
      
      @scala.inline
      def setStartLevel(value: Level | String): Self = StObject.set(x, "startLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartLevelUndefined: Self = StObject.set(x, "startLevel", js.undefined)
      
      @scala.inline
      def setStepMonths(value: Double): Self = StObject.set(x, "stepMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepMonthsUndefined: Self = StObject.set(x, "stepMonths", js.undefined)
      
      @scala.inline
      def setTimeDisplayFormat(value: String): Self = StObject.set(x, "timeDisplayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeDisplayFormatUndefined: Self = StObject.set(x, "timeDisplayFormat", js.undefined)
      
      @scala.inline
      def setTimeDrillDown(value: TimeDrillDown): Self = StObject.set(x, "timeDrillDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeDrillDownUndefined: Self = StObject.set(x, "timeDrillDown", js.undefined)
      
      @scala.inline
      def setTimePopupWidth(value: String | Double): Self = StObject.set(x, "timePopupWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePopupWidthUndefined: Self = StObject.set(x, "timePopupWidth", js.undefined)
      
      @scala.inline
      def setValidationMessage(value: js.Any): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationMessageUndefined: Self = StObject.set(x, "validationMessage", js.undefined)
      
      @scala.inline
      def setValidationRules(value: js.Any): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      @scala.inline
      def setValue(value: String | Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWatermarkText(value: String): Self = StObject.set(x, "watermarkText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatermarkTextUndefined: Self = StObject.set(x, "watermarkText", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait OpenEventArgs extends StObject {
    
    /** returns the TimePicker model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the previously selected date time value
      */
    var prevDateTime: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the modified datetime value
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object OpenEventArgs {
    
    @scala.inline
    def apply(): OpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenEventArgs]
    }
    
    @scala.inline
    implicit class OpenEventArgsMutableBuilder[Self <: OpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPrevDateTime(value: String): Self = StObject.set(x, "prevDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevDateTimeUndefined: Self = StObject.set(x, "prevDateTime", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait TimeDrillDown extends StObject {
    
    /** After choosing the time, the popup will close automatically if we set it as true, otherwise we focus out the DateTimePicker or choose timeNow button for closing the popup.
      */
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    /** This is the field to show/hide the timeDrillDown in DateTimePicker.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the interval time of minutes on selected date.
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /** Allows the user to show or hide the meridian with time in DateTimePicker.
      */
    var showMeridian: js.UndefOr[Boolean] = js.undefined
  }
  object TimeDrillDown {
    
    @scala.inline
    def apply(): TimeDrillDown = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeDrillDown]
    }
    
    @scala.inline
    implicit class TimeDrillDownMutableBuilder[Self <: TimeDrillDown] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setShowMeridian(value: Boolean): Self = StObject.set(x, "showMeridian", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMeridianUndefined: Self = StObject.set(x, "showMeridian", js.undefined)
    }
  }
}
