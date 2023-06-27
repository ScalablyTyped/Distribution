package typings.ejWebAll.ej

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRangePicker
  extends StObject
     with Widget_ {
  
  /** Add the preset ranges to DateRangePicker popup.
    * @param {string} Display name
    * @param {any[]} StartDate and endDate of range.
    * @returns {void}
    */
  def addRanges(label: String, range: js.Array[Any]): Unit = js.native
  
  /** Clears the all ranges selections in DateRangePicker popup
    * @returns {void}
    */
  def clearRanges(): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Disables the DateRangePicker control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Enable the DateRangePicker control, if it is in disabled state.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Returns the startDate and endDate values in the selected ranges in the DateRangePicker control.
    * @returns {any}
    */
  def getSelectedRange(): Any = js.native
  
  @JSName("model")
  var model_DateRangePicker: Model = js.native
  
  /** Close the DateRangePicker popup, if it is in opened state.
    * @returns {void}
    */
  def popupHide(): Unit = js.native
  
  /** Opens the DateRangePicker popup.
    * @returns {void}
    */
  def popupShow(): Unit = js.native
  
  /** set the preset ranges to DateRangePicker popup.
    * @returns {void}
    */
  def setRange(): Unit = js.native
}
object DateRangePicker {
  
  trait BeforeCloseEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the DateRangePicker popup.
      */
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns the event parameters from DateRangePicker.
      */
    var events: js.UndefOr[Any] = js.undefined
    
    /** returns the DateRangePicker model
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeCloseEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait BeforeOpenEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the DateRangePicker popup.
      */
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns the event parameters from DateRangePicker.
      */
    var events: js.UndefOr[Any] = js.undefined
    
    /** returns the DateRangePicker model.
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeOpenEventArgs] (val x: Self) extends AnyVal {
      
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
    
    /** returns the endDate of the DateRangePicker popup.
      */
    var endDate: js.UndefOr[Any] = js.undefined
    
    /** returns the DateRangePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the startDate of DateRangePicker.
      */
    var startDate: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the DateRangePicker input value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ChangeEventArgs {
    
    inline def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setEndDate(value: Any): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setStartDate(value: Any): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
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
    
    /** returns the DateRangePicker popup.
      */
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns the DateRangePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CloseEventArgs {
    
    inline def apply(): CloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseEventArgs] (val x: Self) extends AnyVal {
      
      inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** returns the DateRangePicker model.
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
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
    
    /** returns the DateRangePicker model.
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Fires when the DateRangePicker values get changed.
      */
    var Change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
    
    /** Used to allow or restrict the editing in DateRangePicker input field directly. By setting false to this API, You can only pick the date ranges from DateRangePicker popup.
      * @default {true}
      */
    var allowEdit: js.UndefOr[Boolean] = js.undefined
    
    /** Fires before closing the DateRangePicker popup.
      */
    var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.undefined
    
    /** Fires before opening the DateRangePicker popup.
      */
    var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.undefined
    
    /** Sets the specified text value to the available buttons (Reset, Cancel, Apply) in the DateRangePicker popup.
      * @default {{ reset: Reset, cancel: Cancel, apply: Apply}}
      */
    var buttonText: js.UndefOr[Any] = js.undefined
    
    /** Fires when DateRangePicker popup is closed.
      */
    var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
    
    /** Fires when the DateRangePicker is created successfully.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Sets the root CSS class for DateRangePicker theme, which is used to customize.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Formats the date value of the DateRangePicker in to the specified date format. If this API is not specified, dateFormat will be set based on the current culture of DateRangePicker.
      * @default {MM/dd/yyyy}
      */
    var dateFormat: js.UndefOr[String] = js.undefined
    
    /** Fires when the DateRangePicker is destroyed successfully.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Sustain the entire widget model of DateRangePicker even after form post or browser refresh
      * @default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** Allows to embed the Timepicker align with the calendars in the page, two timepicker will be render, for selecting start and end date.
      * @default {false}
      */
    var enableTimePicker: js.UndefOr[Boolean] = js.undefined
    
    /** Enable or disable the DateRangePicker control.
      * @default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the end date of the date ranges.
      * @default {null}
      */
    var endDate: js.UndefOr[String | js.Date] = js.undefined
    
    /** Specifies the height of the DateRangePicker input.
      * @default {28px}
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /** Change the DateRangePicker calendar and date format based on given culture.
      * @default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Specifies the maximum date in the calendar that the user can select as a startDate or endDate.
      * @default {new Date(2099, 11, 31)}
      */
    var maxDate: js.UndefOr[String | js.Date] = js.undefined
    
    /** Specifies the minimum date in the calendar that the user can select as a startDate or endDate.
      * @default {new Date(1900, 00, 01)}
      */
    var minDate: js.UndefOr[String | js.Date] = js.undefined
    
    /** Fires when DateRangePicker popup is opened.
      */
    var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
    
    /** Used to add the preset ranges. Added ranges using this, will show in popup in right side for easy selection of different preset ranges.
      * @default {null}
      */
    var ranges: js.UndefOr[Any] = js.undefined
    
    /** Fires when a date ranges is selected from the DateRangePicker popup.
      */
    var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.undefined
    
    /** Used to separate the two date strings of the value in the DateRangePicker popup.
      * @default {-}
      */
    var separator: js.UndefOr[String] = js.undefined
    
    /** Shows/hides the date icon button at right side of textbox, which is used to open or close the DateRangePicker calendar popup.
      * @default {true}
      */
    var showPopupButton: js.UndefOr[Boolean] = js.undefined
    
    /** DateRangePicker input and popup is displayed with rounded corner when this property is set to true.
      * @default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the start date of the date ranges
      * @default {null}
      */
    var startDate: js.UndefOr[String | js.Date] = js.undefined
    
    /** Formats the date value of the DateRangePicker in to the specified time format. If this API is not specified, timeFormat will be set based on the current culture of DateRangePicker.
      * @default {HH:mm tt}
      */
    var timeFormat: js.UndefOr[String] = js.undefined
    
    /** Separated two date values in string format to sets the date ranges in calendars.
      * @default {null}
      */
    var value: js.UndefOr[String] = js.undefined
    
    /** Specifies the water mark text to be displayed in input text.
      * @default {Select Range}
      */
    var watermarkText: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of the DateRangePicker input text.
      * @default {160px}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.DateRangePicker.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.DateRangePicker.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.DateRangePicker.Model] (val x: Self) extends AnyVal {
      
      inline def setAllowEdit(value: Boolean): Self = StObject.set(x, "allowEdit", value.asInstanceOf[js.Any])
      
      inline def setAllowEditUndefined: Self = StObject.set(x, "allowEdit", js.undefined)
      
      inline def setBeforeClose(value: /* e */ BeforeCloseEventArgs => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
      
      inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      inline def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setButtonText(value: Any): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "Change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "Change", js.undefined)
      
      inline def setClose(value: /* e */ CloseEventArgs => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      inline def setEnableTimePicker(value: Boolean): Self = StObject.set(x, "enableTimePicker", value.asInstanceOf[js.Any])
      
      inline def setEnableTimePickerUndefined: Self = StObject.set(x, "enableTimePicker", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setEndDate(value: String | js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: String | js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: String | js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setRanges(value: Any): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setSelect(value: /* e */ SelectEventArgs => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setShowPopupButton(value: Boolean): Self = StObject.set(x, "showPopupButton", value.asInstanceOf[js.Any])
      
      inline def setShowPopupButtonUndefined: Self = StObject.set(x, "showPopupButton", js.undefined)
      
      inline def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      inline def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      inline def setStartDate(value: String | js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
      
      inline def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWatermarkText(value: String): Self = StObject.set(x, "watermarkText", value.asInstanceOf[js.Any])
      
      inline def setWatermarkTextUndefined: Self = StObject.set(x, "watermarkText", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait OpenEventArgs extends StObject {
    
    /** returns the current date object.
      */
    var date: js.UndefOr[Any] = js.undefined
    
    /** returns the DateRangePicker popup.
      */
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns the DateRangePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OpenEventArgs {
    
    inline def apply(): OpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenEventArgs] (val x: Self) extends AnyVal {
      
      inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SelectEventArgs extends StObject {
    
    /** returns the current date value.
      */
    var endDate: js.UndefOr[Any] = js.undefined
    
    /** returns the DateRangePicker model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the selected date object.
      */
    var startDate: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SelectEventArgs {
    
    inline def apply(): SelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectEventArgs] (val x: Self) extends AnyVal {
      
      inline def setEndDate(value: Any): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setStartDate(value: Any): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
