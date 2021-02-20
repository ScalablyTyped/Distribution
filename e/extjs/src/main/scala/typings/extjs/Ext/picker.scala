package typings.extjs.Ext

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object picker {
  
  @js.native
  trait IColor extends IComponent {
    
    /** [Config Option] (Boolean) */
    var allowReselect: js.UndefOr[Boolean] = js.native
    
    /** [Method] Clears any selection and sets the value to null  */
    var clear: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (String) */
    var clickEvent: js.UndefOr[java.lang.String] = js.native
    
    /** [Property] (String[]) */
    var colors: js.UndefOr[Array] = js.native
    
    /** [Method] Get the currently selected color value
      * @returns String value The selected value. Null if nothing is selected.
      */
    var getValue: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Config Option] (Function) */
    var handler: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var itemCls: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Template method called when this Component s DOM structure is created  */
    @JSName("onRender")
    var onRender_IColor: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (Object) */
    var scope: js.UndefOr[js.Any] = js.native
    
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
      ] = js.native
    
    /** [Config Option] (String) */
    var selectedCls: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var value: js.UndefOr[java.lang.String] = js.native
  }
  object IColor {
    
    @scala.inline
    def apply(): IColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColor]
    }
    
    @scala.inline
    implicit class IColorMutableBuilder[Self <: IColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowReselect(value: Boolean): Self = StObject.set(x, "allowReselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowReselectUndefined: Self = StObject.set(x, "allowReselect", js.undefined)
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setClickEvent(value: java.lang.String): Self = StObject.set(x, "clickEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickEventUndefined: Self = StObject.set(x, "clickEvent", js.undefined)
      
      @scala.inline
      def setColors(value: Array): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setGetValue(value: () => java.lang.String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      @scala.inline
      def setHandler(value: js.Any): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setItemCls(value: java.lang.String): Self = StObject.set(x, "itemCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemClsUndefined: Self = StObject.set(x, "itemCls", js.undefined)
      
      @scala.inline
      def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      @scala.inline
      def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSelect(value: (/* color */ js.UndefOr[java.lang.String], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setSelectedCls(value: java.lang.String): Self = StObject.set(x, "selectedCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedClsUndefined: Self = StObject.set(x, "selectedCls", js.undefined)
      
      @scala.inline
      def setValue(value: java.lang.String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait IDate extends IComponent {
    
    /** [Config Option] (String) */
    var ariaTitle: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var ariaTitleDateFormat: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String[]) */
    var dayNames: js.UndefOr[Array] = js.native
    
    /** [Config Option] (Boolean) */
    var disableAnim: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var disabledCellCls: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String[]) */
    var disabledDates: js.UndefOr[Array] = js.native
    
    /** [Config Option] (RegExp) */
    var disabledDatesRE: js.UndefOr[RegExp] = js.native
    
    /** [Config Option] (String) */
    var disabledDatesText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Number[]) */
    var disabledDays: js.UndefOr[Array] = js.native
    
    /** [Config Option] (String) */
    var disabledDaysText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Boolean) */
    var focusOnShow: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var format: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Gets a single character to represent the day of the week
      * @param value Object
      * @returns String The character
      */
    var getDayInitial: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], java.lang.String]] = js.native
    
    /** [Method] Gets the current selected value of the date field
      * @returns Date The selected date
      */
    var getValue: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Config Option] (Function) */
    var handler: js.UndefOr[js.Any] = js.native
    
    /** [Method] Hides the month picker if it s visible
      * @param animate Boolean Indicates whether to animate this action. If the animate parameter is not specified, the behavior will use disableAnim to determine whether to animate or not.
      * @returns Ext.picker.Date this
      */
    var hideMonthPicker: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], this.type]] = js.native
    
    /** [Config Option] (Object) */
    var keyNavConfig: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var longDayFormat: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Date) */
    var maxDate: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var maxText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Date) */
    var minDate: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var minText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String[]) */
    var monthNames: js.UndefOr[Array] = js.native
    
    /** [Config Option] (String) */
    var monthYearFormat: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var monthYearText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var nextText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var prevText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Object) */
    var scope: js.UndefOr[js.Any] = js.native
    
    /** [Method] Sets the current value to today
      * @returns Ext.picker.Date this
      */
    var selectToday: js.UndefOr[js.Function0[this.type]] = js.native
    
    /** [Config Option] (String) */
    var selectedCls: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Replaces any existing disabled dates with new values and refreshes the DatePicker
      * @param disabledDates String[]/RegExp An array of date strings (see the disabledDates config for details on supported values), or a JavaScript regular expression used to disable a pattern of dates.
      * @returns Ext.picker.Date this
      */
    var setDisabledDates: js.UndefOr[js.Function1[/* disabledDates */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Replaces any existing disabled days by index 0 6 with new values and refreshes the DatePicker
      * @param disabledDays Number[] An array of disabled day indexes. See the disabledDays config for details on supported values.
      * @returns Ext.picker.Date this
      */
    var setDisabledDays: js.UndefOr[js.Function1[/* disabledDays */ js.UndefOr[Array], this.type]] = js.native
    
    /** [Method] Replaces any existing maxDate with the new value and refreshes the DatePicker
      * @param value Date The maximum date that can be selected
      * @returns Ext.picker.Date this
      */
    var setMaxDate: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Replaces any existing minDate with the new value and refreshes the DatePicker
      * @param value Date The minimum date that can be selected
      * @returns Ext.picker.Date this
      */
    var setMinDate: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Sets the value of the date field
      * @param value Date The date to set
      * @returns Ext.picker.Date this
      */
    var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Show the month picker
      * @param animate Boolean Indicates whether to animate this action. If the animate parameter is not specified, the behavior will use disableAnim to determine whether to animate or not.
      * @returns Ext.picker.Date this
      */
    var showMonthPicker: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], this.type]] = js.native
    
    /** [Method] Show the next month
      * @param e Object
      * @returns Ext.picker.Date this
      */
    var showNextMonth: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Show the next year
      * @returns Ext.picker.Date this
      */
    var showNextYear: js.UndefOr[js.Function0[this.type]] = js.native
    
    /** [Method] Show the previous month
      * @param e Object
      * @returns Ext.picker.Date this
      */
    var showPrevMonth: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Show the previous year
      * @returns Ext.picker.Date this
      */
    var showPrevYear: js.UndefOr[js.Function0[this.type]] = js.native
    
    /** [Config Option] (Boolean) */
    var showToday: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Number) */
    var startDay: js.UndefOr[Double] = js.native
    
    /** [Config Option] (String) */
    var todayText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var todayTip: js.UndefOr[java.lang.String] = js.native
  }
  object IDate {
    
    @scala.inline
    def apply(): typings.extjs.Ext.picker.IDate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.picker.IDate]
    }
    
    @scala.inline
    implicit class IDateMutableBuilder[Self <: typings.extjs.Ext.picker.IDate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaTitle(value: java.lang.String): Self = StObject.set(x, "ariaTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaTitleDateFormat(value: java.lang.String): Self = StObject.set(x, "ariaTitleDateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaTitleDateFormatUndefined: Self = StObject.set(x, "ariaTitleDateFormat", js.undefined)
      
      @scala.inline
      def setAriaTitleUndefined: Self = StObject.set(x, "ariaTitle", js.undefined)
      
      @scala.inline
      def setDayNames(value: Array): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayNamesUndefined: Self = StObject.set(x, "dayNames", js.undefined)
      
      @scala.inline
      def setDisableAnim(value: Boolean): Self = StObject.set(x, "disableAnim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAnimUndefined: Self = StObject.set(x, "disableAnim", js.undefined)
      
      @scala.inline
      def setDisabledCellCls(value: java.lang.String): Self = StObject.set(x, "disabledCellCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledCellClsUndefined: Self = StObject.set(x, "disabledCellCls", js.undefined)
      
      @scala.inline
      def setDisabledDates(value: Array): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDatesRE(value: RegExp): Self = StObject.set(x, "disabledDatesRE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDatesREUndefined: Self = StObject.set(x, "disabledDatesRE", js.undefined)
      
      @scala.inline
      def setDisabledDatesText(value: java.lang.String): Self = StObject.set(x, "disabledDatesText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDatesTextUndefined: Self = StObject.set(x, "disabledDatesText", js.undefined)
      
      @scala.inline
      def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      @scala.inline
      def setDisabledDays(value: Array): Self = StObject.set(x, "disabledDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDaysText(value: java.lang.String): Self = StObject.set(x, "disabledDaysText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDaysTextUndefined: Self = StObject.set(x, "disabledDaysText", js.undefined)
      
      @scala.inline
      def setDisabledDaysUndefined: Self = StObject.set(x, "disabledDays", js.undefined)
      
      @scala.inline
      def setFocusOnShow(value: Boolean): Self = StObject.set(x, "focusOnShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOnShowUndefined: Self = StObject.set(x, "focusOnShow", js.undefined)
      
      @scala.inline
      def setFormat(value: java.lang.String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGetDayInitial(value: /* value */ js.UndefOr[js.Any] => java.lang.String): Self = StObject.set(x, "getDayInitial", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDayInitialUndefined: Self = StObject.set(x, "getDayInitial", js.undefined)
      
      @scala.inline
      def setGetValue(value: () => _): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      @scala.inline
      def setHandler(value: js.Any): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setHideMonthPicker(value: /* animate */ js.UndefOr[Boolean] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "hideMonthPicker", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHideMonthPickerUndefined: Self = StObject.set(x, "hideMonthPicker", js.undefined)
      
      @scala.inline
      def setKeyNavConfig(value: js.Any): Self = StObject.set(x, "keyNavConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNavConfigUndefined: Self = StObject.set(x, "keyNavConfig", js.undefined)
      
      @scala.inline
      def setLongDayFormat(value: java.lang.String): Self = StObject.set(x, "longDayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongDayFormatUndefined: Self = StObject.set(x, "longDayFormat", js.undefined)
      
      @scala.inline
      def setMaxDate(value: js.Any): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMaxText(value: java.lang.String): Self = StObject.set(x, "maxText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTextUndefined: Self = StObject.set(x, "maxText", js.undefined)
      
      @scala.inline
      def setMinDate(value: js.Any): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMinText(value: java.lang.String): Self = StObject.set(x, "minText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinTextUndefined: Self = StObject.set(x, "minText", js.undefined)
      
      @scala.inline
      def setMonthNames(value: Array): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthNamesUndefined: Self = StObject.set(x, "monthNames", js.undefined)
      
      @scala.inline
      def setMonthYearFormat(value: java.lang.String): Self = StObject.set(x, "monthYearFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthYearFormatUndefined: Self = StObject.set(x, "monthYearFormat", js.undefined)
      
      @scala.inline
      def setMonthYearText(value: java.lang.String): Self = StObject.set(x, "monthYearText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthYearTextUndefined: Self = StObject.set(x, "monthYearText", js.undefined)
      
      @scala.inline
      def setNextText(value: java.lang.String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
      
      @scala.inline
      def setPrevText(value: java.lang.String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevTextUndefined: Self = StObject.set(x, "prevText", js.undefined)
      
      @scala.inline
      def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSelectToday(value: () => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "selectToday", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSelectTodayUndefined: Self = StObject.set(x, "selectToday", js.undefined)
      
      @scala.inline
      def setSelectedCls(value: java.lang.String): Self = StObject.set(x, "selectedCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedClsUndefined: Self = StObject.set(x, "selectedCls", js.undefined)
      
      @scala.inline
      def setSetDisabledDates(value: /* disabledDates */ js.UndefOr[js.Any] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "setDisabledDates", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDisabledDatesUndefined: Self = StObject.set(x, "setDisabledDates", js.undefined)
      
      @scala.inline
      def setSetDisabledDays(value: /* disabledDays */ js.UndefOr[Array] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "setDisabledDays", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDisabledDaysUndefined: Self = StObject.set(x, "setDisabledDays", js.undefined)
      
      @scala.inline
      def setSetMaxDate(value: /* value */ js.UndefOr[js.Any] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "setMaxDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMaxDateUndefined: Self = StObject.set(x, "setMaxDate", js.undefined)
      
      @scala.inline
      def setSetMinDate(value: /* value */ js.UndefOr[js.Any] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "setMinDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinDateUndefined: Self = StObject.set(x, "setMinDate", js.undefined)
      
      @scala.inline
      def setSetValue(value: /* value */ js.UndefOr[js.Any] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      
      @scala.inline
      def setShowMonthPicker(value: /* animate */ js.UndefOr[Boolean] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "showMonthPicker", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowMonthPickerUndefined: Self = StObject.set(x, "showMonthPicker", js.undefined)
      
      @scala.inline
      def setShowNextMonth(value: /* e */ js.UndefOr[js.Any] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "showNextMonth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowNextMonthUndefined: Self = StObject.set(x, "showNextMonth", js.undefined)
      
      @scala.inline
      def setShowNextYear(value: () => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "showNextYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowNextYearUndefined: Self = StObject.set(x, "showNextYear", js.undefined)
      
      @scala.inline
      def setShowPrevMonth(value: /* e */ js.UndefOr[js.Any] => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "showPrevMonth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowPrevMonthUndefined: Self = StObject.set(x, "showPrevMonth", js.undefined)
      
      @scala.inline
      def setShowPrevYear(value: () => typings.extjs.Ext.picker.IDate): Self = StObject.set(x, "showPrevYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowPrevYearUndefined: Self = StObject.set(x, "showPrevYear", js.undefined)
      
      @scala.inline
      def setShowToday(value: Boolean): Self = StObject.set(x, "showToday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTodayUndefined: Self = StObject.set(x, "showToday", js.undefined)
      
      @scala.inline
      def setStartDay(value: Double): Self = StObject.set(x, "startDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDayUndefined: Self = StObject.set(x, "startDay", js.undefined)
      
      @scala.inline
      def setTodayText(value: java.lang.String): Self = StObject.set(x, "todayText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayTextUndefined: Self = StObject.set(x, "todayText", js.undefined)
      
      @scala.inline
      def setTodayTip(value: java.lang.String): Self = StObject.set(x, "todayTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayTipUndefined: Self = StObject.set(x, "todayTip", js.undefined)
    }
  }
  
  @js.native
  trait IMonth extends IComponent {
    
    /** [Method] Modify the year display by passing an offset
      * @param offset Number The offset to move by.
      */
    var adjustYear: js.UndefOr[js.Function1[/* offset */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Config Option] (String) */
    var cancelText: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Gets the selected value
      * @returns Number[] The selected value
      */
    var getValue: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] Checks whether the picker has a selection
      * @returns Boolean Returns true if both a month and year have been selected
      */
    var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Config Option] (String) */
    var okText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var selectedCls: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Set the value for the picker
      * @param value Date/Number[] The value to set. It can be a Date object, where the month/year will be extracted, or it can be an array, with the month as the first index and the year as the second.
      * @returns Ext.picker.Month this
      */
    var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Config Option] (Boolean) */
    var showButtons: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Date/Number[]) */
    var value: js.UndefOr[js.Any] = js.native
  }
  object IMonth {
    
    @scala.inline
    def apply(): IMonth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMonth]
    }
    
    @scala.inline
    implicit class IMonthMutableBuilder[Self <: IMonth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustYear(value: /* offset */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "adjustYear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAdjustYearUndefined: Self = StObject.set(x, "adjustYear", js.undefined)
      
      @scala.inline
      def setCancelText(value: java.lang.String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      @scala.inline
      def setGetValue(value: () => Array): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      @scala.inline
      def setHasSelection(value: () => Boolean): Self = StObject.set(x, "hasSelection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasSelectionUndefined: Self = StObject.set(x, "hasSelection", js.undefined)
      
      @scala.inline
      def setOkText(value: java.lang.String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      @scala.inline
      def setSelectedCls(value: java.lang.String): Self = StObject.set(x, "selectedCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedClsUndefined: Self = StObject.set(x, "selectedCls", js.undefined)
      
      @scala.inline
      def setSetValue(value: /* value */ js.UndefOr[js.Any] => IMonth): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      
      @scala.inline
      def setShowButtons(value: Boolean): Self = StObject.set(x, "showButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowButtonsUndefined: Self = StObject.set(x, "showButtons", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ITime
    extends typings.extjs.Ext.view.IBoundList {
    
    /** [Method] Focuses a node in the view
      * @param rec Object
      */
    @JSName("focusNode")
    var focusNode_ITime: js.UndefOr[js.Function1[/* rec */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Config Option] (String) */
    var format: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Number) */
    var increment: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Date) */
    var maxValue: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Date) */
    var minValue: js.UndefOr[js.Any] = js.native
    
    /** [Method] Set the maxValue and update the list of available times
      * @param value Date
      */
    var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Set the minValue and update the list of available times
      * @param value Date
      */
    var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Update the list of available times in the list to be constrained within the minValue and maxValue  */
    var updateList: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object ITime {
    
    @scala.inline
    def apply(): ITime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITime]
    }
    
    @scala.inline
    implicit class ITimeMutableBuilder[Self <: ITime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusNode(value: /* rec */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "focusNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusNodeUndefined: Self = StObject.set(x, "focusNode", js.undefined)
      
      @scala.inline
      def setFormat(value: java.lang.String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
      
      @scala.inline
      def setMaxValue(value: js.Any): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      @scala.inline
      def setMinValue(value: js.Any): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      @scala.inline
      def setSetMaxValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMaxValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMaxValueUndefined: Self = StObject.set(x, "setMaxValue", js.undefined)
      
      @scala.inline
      def setSetMinValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMinValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinValueUndefined: Self = StObject.set(x, "setMinValue", js.undefined)
      
      @scala.inline
      def setUpdateList(value: () => Unit): Self = StObject.set(x, "updateList", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdateListUndefined: Self = StObject.set(x, "updateList", js.undefined)
    }
  }
}
