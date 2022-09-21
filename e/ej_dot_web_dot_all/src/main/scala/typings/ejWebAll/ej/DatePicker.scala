package typings.ejWebAll.ej

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePicker
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** Disables the DatePicker control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Enable the DatePicker control, if it is in disabled state.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Returns the current date value in the DatePicker control.
    * @returns {string}
    */
  def getValue(): String = js.native
  
  /** Close the DatePicker popup, if it is in opened state.
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  @JSName("model")
  var model_DatePicker: Model = js.native
  
  /** sets the date value for the DatePicker.
    * @returns {string}
    */
  def setValue(): String = js.native
  
  /** Opens the DatePicker popup.
    * @returns {void}
    */
  def show(): Unit = js.native
}
object DatePicker {
  
  @js.native
  sealed trait Header extends StObject
  @JSGlobal("ej.DatePicker.Header")
  @js.native
  object Header extends StObject {
    
    ///sets  the Min format of day name (like su) in header format DatePicker
    @js.native
    sealed trait Min
      extends StObject
         with Header
    
    ///Removes day header in DatePicker
    @js.native
    sealed trait None
      extends StObject
         with Header
    
    ///sets  the short format of day name (like Sun) in header in DatePicker
    @js.native
    sealed trait Short
      extends StObject
         with Header
  }
  
  @js.native
  sealed trait HighlightSection extends StObject
  @JSGlobal("ej.DatePicker.HighlightSection")
  @js.native
  object HighlightSection extends StObject {
    
    ///Nothing will be highlighted, remove highlights from DatePicker popup calendar if already exists
    @js.native
    sealed trait None
      extends StObject
         with HighlightSection
    
    ///Highlight the week of the currently  selected date in DatePicker popup calendar
    @js.native
    sealed trait Week
      extends StObject
         with HighlightSection
    
    ///Highlight the workdays in a currently  selected date's week in DatePicker popup calendar
    @js.native
    sealed trait WorkDays
      extends StObject
         with HighlightSection
  }
  
  @js.native
  sealed trait Level extends StObject
  @JSGlobal("ej.DatePicker.Level")
  @js.native
  object Level extends StObject {
    
    ///allow  navigation upto Century level in  DatePicker
    @js.native
    sealed trait Century
      extends StObject
         with Level
    
    ///allow  navigation upto decade level in  DatePicker
    @js.native
    sealed trait Decade
      extends StObject
         with Level
    
    ///allow  navigation upto year level in  DatePicker
    @js.native
    sealed trait Year
      extends StObject
         with Level
  }
  
  trait BeforeCloseEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the DatePicker popup.
      */
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns the event parameters from DatePicker.
      */
    var events: js.UndefOr[Any] = js.undefined
    
    /** returns the DatePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeCloseEventArgs {
    
    inline def apply(): BeforeCloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeCloseEventArgs]
    }
    
    extension [Self <: BeforeCloseEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeDateCreateEventArgs extends StObject {
    
    /** returns the currently created date object.
      */
    var date: js.UndefOr[Any] = js.undefined
    
    /** returns the current DOM object of the date from the Calendar.
      */
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns the DatePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the currently created date as string type.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object BeforeDateCreateEventArgs {
    
    inline def apply(): BeforeDateCreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeDateCreateEventArgs]
    }
    
    extension [Self <: BeforeDateCreateEventArgs](x: Self) {
      
      inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait BeforeOpenEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the DatePicker popup.
      */
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns the event parameters from DatePicker.
      */
    var events: js.UndefOr[Any] = js.undefined
    
    /** returns the DatePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeOpenEventArgs {
    
    inline def apply(): BeforeOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeOpenEventArgs]
    }
    
    extension [Self <: BeforeOpenEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ChangeEventArgs extends StObject {
    
    /** returns the DatePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the previously selected value.
      */
    var prevDate: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the DatePicker input value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ChangeEventArgs {
    
    inline def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    extension [Self <: ChangeEventArgs](x: Self) {
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevDate(value: String): Self = StObject.set(x, "prevDate", value.asInstanceOf[js.Any])
      
      inline def setPrevDateUndefined: Self = StObject.set(x, "prevDate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CloseEventArgs extends StObject {
    
    /** returns the current date object.
      */
    var date: js.UndefOr[Any] = js.undefined
    
    /** returns the DatePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the previously selected value.
      */
    var prevDate: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the current date value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object CloseEventArgs {
    
    inline def apply(): CloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseEventArgs]
    }
    
    extension [Self <: CloseEventArgs](x: Self) {
      
      inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevDate(value: String): Self = StObject.set(x, "prevDate", value.asInstanceOf[js.Any])
      
      inline def setPrevDateUndefined: Self = StObject.set(x, "prevDate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** returns the DatePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    extension [Self <: CreateEventArgs](x: Self) {
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the DatePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    extension [Self <: DestroyEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    /** Specifies the CSS class to customize the date.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Specifies the specials dates
      */
    var date: js.UndefOr[String] = js.undefined
    
    /** Specifies the icon class to special dates.
      */
    var iconClass: js.UndefOr[String] = js.undefined
    
    /** Specifies the tooltip to special dates.
      */
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object Fields {
    
    inline def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait FocusInEventArgs extends StObject {
    
    /** returns the DatePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the currently selected date value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object FocusInEventArgs {
    
    inline def apply(): FocusInEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusInEventArgs]
    }
    
    extension [Self <: FocusInEventArgs](x: Self) {
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FocusOutEventArgs extends StObject {
    
    /** returns the DatePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the previously selected date value.
      */
    var prevDate: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the currently selected date value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object FocusOutEventArgs {
    
    inline def apply(): FocusOutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusOutEventArgs]
    }
    
    extension [Self <: FocusOutEventArgs](x: Self) {
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevDate(value: String): Self = StObject.set(x, "prevDate", value.asInstanceOf[js.Any])
      
      inline def setPrevDateUndefined: Self = StObject.set(x, "prevDate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
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
    var blackoutDates: js.UndefOr[Any] = js.undefined
    
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
    var htmlAttributes: js.UndefOr[Any] = js.undefined
    
    /** Change the DatePicker calendar and date format based on given culture.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Specifies the maximum date in the calendar that the user can select.
      * @Default {new Date(2099, 11, 31)}
      */
    var maxDate: js.UndefOr[String | js.Date] = js.undefined
    
    /** Specifies the minimum date in the calendar that the user can select.
      * @Default {new Date(1900, 00, 01)}
      */
    var minDate: js.UndefOr[String | js.Date] = js.undefined
    
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
    var specialDates: js.UndefOr[Any] = js.undefined
    
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
    var validationMessage: js.UndefOr[Any] = js.undefined
    
    /** Sets the jQuery validation custom rules to the DatePicker. see validation
      * @Default {null}
      */
    var validationRules: js.UndefOr[Any] = js.undefined
    
    /** sets or returns the current value of DatePicker
      * @Default {null}
      */
    var value: js.UndefOr[String | js.Date] = js.undefined
    
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
    
    inline def apply(): typings.ejWebAll.ej.DatePicker.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.DatePicker.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.DatePicker.Model](x: Self) {
      
      inline def setAllowDrillDown(value: Boolean): Self = StObject.set(x, "allowDrillDown", value.asInstanceOf[js.Any])
      
      inline def setAllowDrillDownUndefined: Self = StObject.set(x, "allowDrillDown", js.undefined)
      
      inline def setAllowEdit(value: Boolean): Self = StObject.set(x, "allowEdit", value.asInstanceOf[js.Any])
      
      inline def setAllowEditUndefined: Self = StObject.set(x, "allowEdit", js.undefined)
      
      inline def setBeforeClose(value: /* e */ BeforeCloseEventArgs => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
      
      inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      inline def setBeforeDateCreate(value: /* e */ BeforeDateCreateEventArgs => Unit): Self = StObject.set(x, "beforeDateCreate", js.Any.fromFunction1(value))
      
      inline def setBeforeDateCreateUndefined: Self = StObject.set(x, "beforeDateCreate", js.undefined)
      
      inline def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setBlackoutDates(value: Any): Self = StObject.set(x, "blackoutDates", value.asInstanceOf[js.Any])
      
      inline def setBlackoutDatesUndefined: Self = StObject.set(x, "blackoutDates", js.undefined)
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setClose(value: /* e */ CloseEventArgs => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDayHeaderFormat(value: String | Header): Self = StObject.set(x, "dayHeaderFormat", value.asInstanceOf[js.Any])
      
      inline def setDayHeaderFormatUndefined: Self = StObject.set(x, "dayHeaderFormat", js.undefined)
      
      inline def setDepthLevel(value: String | Level): Self = StObject.set(x, "depthLevel", value.asInstanceOf[js.Any])
      
      inline def setDepthLevelUndefined: Self = StObject.set(x, "depthLevel", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDisplayInline(value: Boolean): Self = StObject.set(x, "displayInline", value.asInstanceOf[js.Any])
      
      inline def setDisplayInlineUndefined: Self = StObject.set(x, "displayInline", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnableStrictMode(value: Boolean): Self = StObject.set(x, "enableStrictMode", value.asInstanceOf[js.Any])
      
      inline def setEnableStrictModeUndefined: Self = StObject.set(x, "enableStrictMode", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFocusIn(value: /* e */ FocusInEventArgs => Unit): Self = StObject.set(x, "focusIn", js.Any.fromFunction1(value))
      
      inline def setFocusInUndefined: Self = StObject.set(x, "focusIn", js.undefined)
      
      inline def setFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = StObject.set(x, "focusOut", js.Any.fromFunction1(value))
      
      inline def setFocusOutUndefined: Self = StObject.set(x, "focusOut", js.undefined)
      
      inline def setHeaderFormat(value: String): Self = StObject.set(x, "headerFormat", value.asInstanceOf[js.Any])
      
      inline def setHeaderFormatUndefined: Self = StObject.set(x, "headerFormat", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHighlightSection(value: String | HighlightSection): Self = StObject.set(x, "highlightSection", value.asInstanceOf[js.Any])
      
      inline def setHighlightSectionUndefined: Self = StObject.set(x, "highlightSection", js.undefined)
      
      inline def setHighlightWeekend(value: Boolean): Self = StObject.set(x, "highlightWeekend", value.asInstanceOf[js.Any])
      
      inline def setHighlightWeekendUndefined: Self = StObject.set(x, "highlightWeekend", js.undefined)
      
      inline def setHtmlAttributes(value: Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: String | js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: String | js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setNavigate(value: /* e */ NavigateEventArgs => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
      
      inline def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
      
      inline def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSelect(value: /* e */ SelectEventArgs => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setShowDisabledRange(value: Boolean): Self = StObject.set(x, "showDisabledRange", value.asInstanceOf[js.Any])
      
      inline def setShowDisabledRangeUndefined: Self = StObject.set(x, "showDisabledRange", js.undefined)
      
      inline def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
      
      inline def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
      
      inline def setShowOtherMonths(value: Boolean): Self = StObject.set(x, "showOtherMonths", value.asInstanceOf[js.Any])
      
      inline def setShowOtherMonthsUndefined: Self = StObject.set(x, "showOtherMonths", js.undefined)
      
      inline def setShowPopupButton(value: Boolean): Self = StObject.set(x, "showPopupButton", value.asInstanceOf[js.Any])
      
      inline def setShowPopupButtonUndefined: Self = StObject.set(x, "showPopupButton", js.undefined)
      
      inline def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      inline def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      inline def setSpecialDates(value: Any): Self = StObject.set(x, "specialDates", value.asInstanceOf[js.Any])
      
      inline def setSpecialDatesUndefined: Self = StObject.set(x, "specialDates", js.undefined)
      
      inline def setStartDay(value: Double): Self = StObject.set(x, "startDay", value.asInstanceOf[js.Any])
      
      inline def setStartDayUndefined: Self = StObject.set(x, "startDay", js.undefined)
      
      inline def setStartLevel(value: String | Level): Self = StObject.set(x, "startLevel", value.asInstanceOf[js.Any])
      
      inline def setStartLevelUndefined: Self = StObject.set(x, "startLevel", js.undefined)
      
      inline def setStepMonths(value: Double): Self = StObject.set(x, "stepMonths", value.asInstanceOf[js.Any])
      
      inline def setStepMonthsUndefined: Self = StObject.set(x, "stepMonths", js.undefined)
      
      inline def setTooltipFormat(value: String): Self = StObject.set(x, "tooltipFormat", value.asInstanceOf[js.Any])
      
      inline def setTooltipFormatUndefined: Self = StObject.set(x, "tooltipFormat", js.undefined)
      
      inline def setValidationMessage(value: Any): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
      
      inline def setValidationMessageUndefined: Self = StObject.set(x, "validationMessage", js.undefined)
      
      inline def setValidationRules(value: Any): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      inline def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      inline def setValue(value: String | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWatermarkText(value: String): Self = StObject.set(x, "watermarkText", value.asInstanceOf[js.Any])
      
      inline def setWatermarkTextUndefined: Self = StObject.set(x, "watermarkText", js.undefined)
      
      inline def setWeekNumber(value: Boolean): Self = StObject.set(x, "weekNumber", value.asInstanceOf[js.Any])
      
      inline def setWeekNumberUndefined: Self = StObject.set(x, "weekNumber", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait NavigateEventArgs extends StObject {
    
    /** returns the current date object.
      */
    var date: js.UndefOr[Any] = js.undefined
    
    /** returns the DatePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the previous view state of calendar.
      */
    var navigateFrom: js.UndefOr[String] = js.undefined
    
    /** returns the current view state of calendar.
      */
    var navigateTo: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the current date value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object NavigateEventArgs {
    
    inline def apply(): NavigateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigateEventArgs]
    }
    
    extension [Self <: NavigateEventArgs](x: Self) {
      
      inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setNavigateFrom(value: String): Self = StObject.set(x, "navigateFrom", value.asInstanceOf[js.Any])
      
      inline def setNavigateFromUndefined: Self = StObject.set(x, "navigateFrom", js.undefined)
      
      inline def setNavigateTo(value: String): Self = StObject.set(x, "navigateTo", value.asInstanceOf[js.Any])
      
      inline def setNavigateToUndefined: Self = StObject.set(x, "navigateTo", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait OpenEventArgs extends StObject {
    
    /** returns the current date object.
      */
    var date: js.UndefOr[Any] = js.undefined
    
    /** returns the DatePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the previously selected value.
      */
    var prevDate: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the current date value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object OpenEventArgs {
    
    inline def apply(): OpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenEventArgs]
    }
    
    extension [Self <: OpenEventArgs](x: Self) {
      
      inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevDate(value: String): Self = StObject.set(x, "prevDate", value.asInstanceOf[js.Any])
      
      inline def setPrevDateUndefined: Self = StObject.set(x, "prevDate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SelectEventArgs extends StObject {
    
    /** returns the selected date object.
      */
    var date: js.UndefOr[Any] = js.undefined
    
    /** returns whether the  currently selected date is special date or not.
      */
    var isSpecialDay: js.UndefOr[String] = js.undefined
    
    /** returns the DatePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the previously selected value.
      */
    var prevDate: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the current date value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object SelectEventArgs {
    
    inline def apply(): SelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectEventArgs]
    }
    
    extension [Self <: SelectEventArgs](x: Self) {
      
      inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setIsSpecialDay(value: String): Self = StObject.set(x, "isSpecialDay", value.asInstanceOf[js.Any])
      
      inline def setIsSpecialDayUndefined: Self = StObject.set(x, "isSpecialDay", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevDate(value: String): Self = StObject.set(x, "prevDate", value.asInstanceOf[js.Any])
      
      inline def setPrevDateUndefined: Self = StObject.set(x, "prevDate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
