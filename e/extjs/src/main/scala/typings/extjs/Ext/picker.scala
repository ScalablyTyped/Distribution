package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object picker {
  
  trait IColor
    extends StObject
       with IComponent {
    
    /** [Config Option] (Boolean) */
    var allowReselect: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Clears any selection and sets the value to null  */
    var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var clickEvent: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Property] (String[]) */
    var colors: js.UndefOr[Array] = js.undefined
    
    /** [Method] Get the currently selected color value
      * @returns String value The selected value. Null if nothing is selected.
      */
    var getValue: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Config Option] (Function) */
    var handler: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var itemCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Template method called when this Component s DOM structure is created  */
    @JSName("onRender")
    var onRender_IColor: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var scope: js.UndefOr[Any] = js.undefined
    
    /** [Method] Selects the specified color in the picker fires the select event
      * @param color String A valid 6-digit color hex code (# will be stripped if included)
      * @param suppressEvent Boolean True to stop the select event from firing.
      */
    var select: js.UndefOr[
        js.Function2[
          /* color */ js.UndefOr[java.lang.String], 
          /* suppressEvent */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.undefined
    
    /** [Config Option] (String) */
    var selectedCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var value: js.UndefOr[java.lang.String] = js.undefined
  }
  object IColor {
    
    inline def apply(): IColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColor] (val x: Self) extends AnyVal {
      
      inline def setAllowReselect(value: Boolean): Self = StObject.set(x, "allowReselect", value.asInstanceOf[js.Any])
      
      inline def setAllowReselectUndefined: Self = StObject.set(x, "allowReselect", js.undefined)
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setClickEvent(value: java.lang.String): Self = StObject.set(x, "clickEvent", value.asInstanceOf[js.Any])
      
      inline def setClickEventUndefined: Self = StObject.set(x, "clickEvent", js.undefined)
      
      inline def setColors(value: Array): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setGetValue(value: () => java.lang.String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      inline def setHandler(value: Any): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setItemCls(value: java.lang.String): Self = StObject.set(x, "itemCls", value.asInstanceOf[js.Any])
      
      inline def setItemClsUndefined: Self = StObject.set(x, "itemCls", js.undefined)
      
      inline def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
      
      inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSelect(value: (/* color */ js.UndefOr[java.lang.String], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectedCls(value: java.lang.String): Self = StObject.set(x, "selectedCls", value.asInstanceOf[js.Any])
      
      inline def setSelectedClsUndefined: Self = StObject.set(x, "selectedCls", js.undefined)
      
      inline def setValue(value: java.lang.String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait IDate
    extends StObject
       with IComponent {
    
    /** [Config Option] (String) */
    var ariaTitle: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var ariaTitleDateFormat: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String[]) */
    var dayNames: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (Boolean) */
    var disableAnim: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var disabledCellCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String[]) */
    var disabledDates: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (RegExp) */
    var disabledDatesRE: js.UndefOr[js.RegExp] = js.undefined
    
    /** [Config Option] (String) */
    var disabledDatesText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Number[]) */
    var disabledDays: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (String) */
    var disabledDaysText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var focusOnShow: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var format: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Gets a single character to represent the day of the week
      * @param value Object
      * @returns String The character
      */
    var getDayInitial: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], java.lang.String]] = js.undefined
    
    /** [Method] Gets the current selected value of the date field
      * @returns Date The selected date
      */
    var getValue: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Config Option] (Function) */
    var handler: js.UndefOr[Any] = js.undefined
    
    /** [Method] Hides the month picker if it s visible
      * @param animate Boolean Indicates whether to animate this action. If the animate parameter is not specified, the behavior will use disableAnim to determine whether to animate or not.
      * @returns Ext.picker.Date this
      */
    var hideMonthPicker: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], this.type]] = js.undefined
    
    /** [Config Option] (Object) */
    var keyNavConfig: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var longDayFormat: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Date) */
    var maxDate: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var maxText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Date) */
    var minDate: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var minText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String[]) */
    var monthNames: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (String) */
    var monthYearFormat: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var monthYearText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var nextText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var prevText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Object) */
    var scope: js.UndefOr[Any] = js.undefined
    
    /** [Method] Sets the current value to today
      * @returns Ext.picker.Date this
      */
    var selectToday: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Config Option] (String) */
    var selectedCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Replaces any existing disabled dates with new values and refreshes the DatePicker
      * @param disabledDates String[]/RegExp An array of date strings (see the disabledDates config for details on supported values), or a JavaScript regular expression used to disable a pattern of dates.
      * @returns Ext.picker.Date this
      */
    var setDisabledDates: js.UndefOr[js.Function1[/* disabledDates */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Replaces any existing disabled days by index 0 6 with new values and refreshes the DatePicker
      * @param disabledDays Number[] An array of disabled day indexes. See the disabledDays config for details on supported values.
      * @returns Ext.picker.Date this
      */
    var setDisabledDays: js.UndefOr[js.Function1[/* disabledDays */ js.UndefOr[Array], this.type]] = js.undefined
    
    /** [Method] Replaces any existing maxDate with the new value and refreshes the DatePicker
      * @param value Date The maximum date that can be selected
      * @returns Ext.picker.Date this
      */
    var setMaxDate: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Replaces any existing minDate with the new value and refreshes the DatePicker
      * @param value Date The minimum date that can be selected
      * @returns Ext.picker.Date this
      */
    var setMinDate: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Sets the value of the date field
      * @param value Date The date to set
      * @returns Ext.picker.Date this
      */
    var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Show the month picker
      * @param animate Boolean Indicates whether to animate this action. If the animate parameter is not specified, the behavior will use disableAnim to determine whether to animate or not.
      * @returns Ext.picker.Date this
      */
    var showMonthPicker: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], this.type]] = js.undefined
    
    /** [Method] Show the next month
      * @param e Object
      * @returns Ext.picker.Date this
      */
    var showNextMonth: js.UndefOr[js.Function1[/* e */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Show the next year
      * @returns Ext.picker.Date this
      */
    var showNextYear: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Show the previous month
      * @param e Object
      * @returns Ext.picker.Date this
      */
    var showPrevMonth: js.UndefOr[js.Function1[/* e */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Show the previous year
      * @returns Ext.picker.Date this
      */
    var showPrevYear: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var showToday: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var startDay: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String) */
    var todayText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var todayTip: js.UndefOr[java.lang.String] = js.undefined
  }
  object IDate {
    
    inline def apply(): typings.extjs.Ext.picker.IDate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.picker.IDate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.extjs.Ext.picker.IDate] (val x: Self) extends AnyVal {
      
      inline def setAriaTitle(value: java.lang.String): Self = StObject.set(x, "ariaTitle", value.asInstanceOf[js.Any])
      
      inline def setAriaTitleDateFormat(value: java.lang.String): Self = StObject.set(x, "ariaTitleDateFormat", value.asInstanceOf[js.Any])
      
      inline def setAriaTitleDateFormatUndefined: Self = StObject.set(x, "ariaTitleDateFormat", js.undefined)
      
      inline def setAriaTitleUndefined: Self = StObject.set(x, "ariaTitle", js.undefined)
      
      inline def setDayNames(value: Array): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
      
      inline def setDayNamesUndefined: Self = StObject.set(x, "dayNames", js.undefined)
      
      inline def setDisableAnim(value: Boolean): Self = StObject.set(x, "disableAnim", value.asInstanceOf[js.Any])
      
      inline def setDisableAnimUndefined: Self = StObject.set(x, "disableAnim", js.undefined)
      
      inline def setDisabledCellCls(value: java.lang.String): Self = StObject.set(x, "disabledCellCls", value.asInstanceOf[js.Any])
      
      inline def setDisabledCellClsUndefined: Self = StObject.set(x, "disabledCellCls", js.undefined)
      
      inline def setDisabledDates(value: Array): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      inline def setDisabledDatesRE(value: js.RegExp): Self = StObject.set(x, "disabledDatesRE", value.asInstanceOf[js.Any])
      
      inline def setDisabledDatesREUndefined: Self = StObject.set(x, "disabledDatesRE", js.undefined)
      
      inline def setDisabledDatesText(value: java.lang.String): Self = StObject.set(x, "disabledDatesText", value.asInstanceOf[js.Any])
      
      inline def setDisabledDatesTextUndefined: Self = StObject.set(x, "disabledDatesText", js.undefined)
      
      inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      inline def setDisabledDays(value: Array): Self = StObject.set(x, "disabledDays", value.asInstanceOf[js.Any])
      
      inline def setDisabledDaysText(value: java.lang.String): Self = StObject.set(x, "disabledDaysText", value.asInstanceOf[js.Any])
      
      inline def setDisabledDaysTextUndefined: Self = StObject.set(x, "disabledDaysText", js.undefined)
      
      inline def setDisabledDaysUndefined: Self = StObject.set(x, "disabledDays", js.undefined)
      
      inline def setFocusOnShow(value: Boolean): Self = StObject.set(x, "focusOnShow", value.asInstanceOf[js.Any])
      
      inline def setFocusOnShowUndefined: Self = StObject.set(x, "focusOnShow", js.undefined)
      
      inline def setFormat(value: java.lang.String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGetDayInitial(value: /* value */ js.UndefOr[Any] => java.lang.String): Self = StObject.set(x, "getDayInitial", js.Any.fromFunction1(value))
      
      inline def setGetDayInitialUndefined: Self = StObject.set(x, "getDayInitial", js.undefined)
      
      inline def setGetValue(value: () => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      inline def setHandler(value: Any): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setHideMonthPicker(value: /* animate */ js.UndefOr[Boolean] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "hideMonthPicker", js.Any.fromFunction1(value))
      
      inline def setHideMonthPickerUndefined: Self = StObject.set(x, "hideMonthPicker", js.undefined)
      
      inline def setKeyNavConfig(value: Any): Self = StObject.set(x, "keyNavConfig", value.asInstanceOf[js.Any])
      
      inline def setKeyNavConfigUndefined: Self = StObject.set(x, "keyNavConfig", js.undefined)
      
      inline def setLongDayFormat(value: java.lang.String): Self = StObject.set(x, "longDayFormat", value.asInstanceOf[js.Any])
      
      inline def setLongDayFormatUndefined: Self = StObject.set(x, "longDayFormat", js.undefined)
      
      inline def setMaxDate(value: Any): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxText(value: java.lang.String): Self = StObject.set(x, "maxText", value.asInstanceOf[js.Any])
      
      inline def setMaxTextUndefined: Self = StObject.set(x, "maxText", js.undefined)
      
      inline def setMinDate(value: Any): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinText(value: java.lang.String): Self = StObject.set(x, "minText", value.asInstanceOf[js.Any])
      
      inline def setMinTextUndefined: Self = StObject.set(x, "minText", js.undefined)
      
      inline def setMonthNames(value: Array): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      inline def setMonthNamesUndefined: Self = StObject.set(x, "monthNames", js.undefined)
      
      inline def setMonthYearFormat(value: java.lang.String): Self = StObject.set(x, "monthYearFormat", value.asInstanceOf[js.Any])
      
      inline def setMonthYearFormatUndefined: Self = StObject.set(x, "monthYearFormat", js.undefined)
      
      inline def setMonthYearText(value: java.lang.String): Self = StObject.set(x, "monthYearText", value.asInstanceOf[js.Any])
      
      inline def setMonthYearTextUndefined: Self = StObject.set(x, "monthYearText", js.undefined)
      
      inline def setNextText(value: java.lang.String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
      
      inline def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
      
      inline def setPrevText(value: java.lang.String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
      
      inline def setPrevTextUndefined: Self = StObject.set(x, "prevText", js.undefined)
      
      inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSelectToday(value: () => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "selectToday", js.Any.fromFunction0(value))
      
      inline def setSelectTodayUndefined: Self = StObject.set(x, "selectToday", js.undefined)
      
      inline def setSelectedCls(value: java.lang.String): Self = StObject.set(x, "selectedCls", value.asInstanceOf[js.Any])
      
      inline def setSelectedClsUndefined: Self = StObject.set(x, "selectedCls", js.undefined)
      
      inline def setSetDisabledDates(value: /* disabledDates */ js.UndefOr[Any] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "setDisabledDates", js.Any.fromFunction1(value))
      
      inline def setSetDisabledDatesUndefined: Self = StObject.set(x, "setDisabledDates", js.undefined)
      
      inline def setSetDisabledDays(value: /* disabledDays */ js.UndefOr[Array] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "setDisabledDays", js.Any.fromFunction1(value))
      
      inline def setSetDisabledDaysUndefined: Self = StObject.set(x, "setDisabledDays", js.undefined)
      
      inline def setSetMaxDate(value: /* value */ js.UndefOr[Any] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "setMaxDate", js.Any.fromFunction1(value))
      
      inline def setSetMaxDateUndefined: Self = StObject.set(x, "setMaxDate", js.undefined)
      
      inline def setSetMinDate(value: /* value */ js.UndefOr[Any] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "setMinDate", js.Any.fromFunction1(value))
      
      inline def setSetMinDateUndefined: Self = StObject.set(x, "setMinDate", js.undefined)
      
      inline def setSetValue(value: /* value */ js.UndefOr[Any] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
      
      inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      
      inline def setShowMonthPicker(value: /* animate */ js.UndefOr[Boolean] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "showMonthPicker", js.Any.fromFunction1(value))
      
      inline def setShowMonthPickerUndefined: Self = StObject.set(x, "showMonthPicker", js.undefined)
      
      inline def setShowNextMonth(value: /* e */ js.UndefOr[Any] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "showNextMonth", js.Any.fromFunction1(value))
      
      inline def setShowNextMonthUndefined: Self = StObject.set(x, "showNextMonth", js.undefined)
      
      inline def setShowNextYear(value: () => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "showNextYear", js.Any.fromFunction0(value))
      
      inline def setShowNextYearUndefined: Self = StObject.set(x, "showNextYear", js.undefined)
      
      inline def setShowPrevMonth(value: /* e */ js.UndefOr[Any] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "showPrevMonth", js.Any.fromFunction1(value))
      
      inline def setShowPrevMonthUndefined: Self = StObject.set(x, "showPrevMonth", js.undefined)
      
      inline def setShowPrevYear(value: () => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "showPrevYear", js.Any.fromFunction0(value))
      
      inline def setShowPrevYearUndefined: Self = StObject.set(x, "showPrevYear", js.undefined)
      
      inline def setShowToday(value: Boolean): Self = StObject.set(x, "showToday", value.asInstanceOf[js.Any])
      
      inline def setShowTodayUndefined: Self = StObject.set(x, "showToday", js.undefined)
      
      inline def setStartDay(value: Double): Self = StObject.set(x, "startDay", value.asInstanceOf[js.Any])
      
      inline def setStartDayUndefined: Self = StObject.set(x, "startDay", js.undefined)
      
      inline def setTodayText(value: java.lang.String): Self = StObject.set(x, "todayText", value.asInstanceOf[js.Any])
      
      inline def setTodayTextUndefined: Self = StObject.set(x, "todayText", js.undefined)
      
      inline def setTodayTip(value: java.lang.String): Self = StObject.set(x, "todayTip", value.asInstanceOf[js.Any])
      
      inline def setTodayTipUndefined: Self = StObject.set(x, "todayTip", js.undefined)
    }
  }
  
  trait IMonth
    extends StObject
       with IComponent {
    
    /** [Method] Modify the year display by passing an offset
      * @param offset Number The offset to move by.
      */
    var adjustYear: js.UndefOr[js.Function1[/* offset */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var cancelText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Gets the selected value
      * @returns Number[] The selected value
      */
    var getValue: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Checks whether the picker has a selection
      * @returns Boolean Returns true if both a month and year have been selected
      */
    var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Config Option] (String) */
    var okText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var selectedCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Set the value for the picker
      * @param value Date/Number[] The value to set. It can be a Date object, where the month/year will be extracted, or it can be an array, with the month as the first index and the year as the second.
      * @returns Ext.picker.Month this
      */
    var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var showButtons: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Date/Number[]) */
    var value: js.UndefOr[Any] = js.undefined
  }
  object IMonth {
    
    inline def apply(): IMonth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMonth]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMonth] (val x: Self) extends AnyVal {
      
      inline def setAdjustYear(value: /* offset */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "adjustYear", js.Any.fromFunction1(value))
      
      inline def setAdjustYearUndefined: Self = StObject.set(x, "adjustYear", js.undefined)
      
      inline def setCancelText(value: java.lang.String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setGetValue(value: () => Array): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      inline def setHasSelection(value: () => Boolean): Self = StObject.set(x, "hasSelection", js.Any.fromFunction0(value))
      
      inline def setHasSelectionUndefined: Self = StObject.set(x, "hasSelection", js.undefined)
      
      inline def setOkText(value: java.lang.String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      inline def setSelectedCls(value: java.lang.String): Self = StObject.set(x, "selectedCls", value.asInstanceOf[js.Any])
      
      inline def setSelectedClsUndefined: Self = StObject.set(x, "selectedCls", js.undefined)
      
      inline def setSetValue(value: /* value */ js.UndefOr[Any] => IMonth): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
      
      inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      
      inline def setShowButtons(value: Boolean): Self = StObject.set(x, "showButtons", value.asInstanceOf[js.Any])
      
      inline def setShowButtonsUndefined: Self = StObject.set(x, "showButtons", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ITime
    extends StObject
       with typings.extjs.Ext.view.IBoundList {
    
    /** [Method] Focuses a node in the view
      * @param rec Object
      */
    @JSName("focusNode")
    var focusNode_ITime: js.UndefOr[js.Function1[/* rec */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var format: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Number) */
    var increment: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Date) */
    var maxValue: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Date) */
    var minValue: js.UndefOr[Any] = js.undefined
    
    /** [Method] Set the maxValue and update the list of available times
      * @param value Date
      */
    var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Set the minValue and update the list of available times
      * @param value Date
      */
    var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Update the list of available times in the list to be constrained within the minValue and maxValue  */
    var updateList: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ITime {
    
    inline def apply(): ITime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITime] (val x: Self) extends AnyVal {
      
      inline def setFocusNode(value: /* rec */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "focusNode", js.Any.fromFunction1(value))
      
      inline def setFocusNodeUndefined: Self = StObject.set(x, "focusNode", js.undefined)
      
      inline def setFormat(value: java.lang.String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
      
      inline def setMaxValue(value: Any): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMinValue(value: Any): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setSetMaxValue(value: /* value */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setMaxValue", js.Any.fromFunction1(value))
      
      inline def setSetMaxValueUndefined: Self = StObject.set(x, "setMaxValue", js.undefined)
      
      inline def setSetMinValue(value: /* value */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setMinValue", js.Any.fromFunction1(value))
      
      inline def setSetMinValueUndefined: Self = StObject.set(x, "setMinValue", js.undefined)
      
      inline def setUpdateList(value: () => Unit): Self = StObject.set(x, "updateList", js.Any.fromFunction0(value))
      
      inline def setUpdateListUndefined: Self = StObject.set(x, "updateList", js.undefined)
    }
  }
}
