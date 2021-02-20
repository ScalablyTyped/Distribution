package typings.flatpickr

import org.scalablytyped.runtime.Shortcut
import typings.flatpickr.anon.GetDaysInMonth
import typings.flatpickr.anon.kinkeyofOptionsOptionsk
import typings.flatpickr.flatpickrStrings.above
import typings.flatpickr.flatpickrStrings.auto
import typings.flatpickr.flatpickrStrings.below
import typings.flatpickr.flatpickrStrings.dropdown
import typings.flatpickr.flatpickrStrings.multiple
import typings.flatpickr.flatpickrStrings.range
import typings.flatpickr.flatpickrStrings.single
import typings.flatpickr.flatpickrStrings.static
import typings.flatpickr.flatpickrStrings.time
import typings.flatpickr.formattingMod.Formats_
import typings.flatpickr.formattingMod.RevFormat_
import typings.flatpickr.formattingMod.TokenRegex_
import typings.flatpickr.globalsMod.global.Date
import typings.flatpickr.globalsMod.global.HTMLElement
import typings.flatpickr.instanceMod.DayElement
import typings.flatpickr.instanceMod.FlatpickrFn
import typings.flatpickr.localeMod.key
import typings.flatpickr.optionsMod.DateOption
import typings.flatpickr.optionsMod.ParsedOptions
import typings.std.Element
import typings.std.Error
import typings.std.FocusEvent
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.HTMLSpanElement
import typings.std.MouseEvent
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    @JSImport("flatpickr", JSImport.Default)
    @js.native
    val ^ : FlatpickrFn = js.native
    
    type _To = FlatpickrFn
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: FlatpickrFn = ^
  }
  
  object flatpickr {
    
    type CustomLocale = typings.flatpickr.localeMod.CustomLocale
    
    /* Inlined flatpickr.flatpickr/dist/types/instance.Instance */
    @js.native
    trait Instance extends StObject {
      
      var __hideNextMonthArrow: Boolean = js.native
      
      var __hidePrevMonthArrow: Boolean = js.native
      
      def _bind[E /* <: Element */](element: E, event: String, handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): Unit = js.native
      def _bind[E /* <: Element */](element: E, event: js.Array[String], handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): Unit = js.native
      def _bind[E /* <: Element */](element: js.Array[E], event: String, handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): Unit = js.native
      def _bind[E /* <: Element */](
        element: js.Array[E],
        event: js.Array[String],
        handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
      ): Unit = js.native
      
      def _createElement[E /* <: HTMLElement */](
        tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any,
        className: String
      ): E = js.native
      def _createElement[E /* <: HTMLElement */](
        tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any,
        className: String,
        content: String
      ): E = js.native
      
      def _debouncedChange(): Unit = js.native
      
      var _handlers: js.Array[typings.flatpickr.anon.Element] = js.native
      
      var _hideNextMonthArrow: Boolean = js.native
      
      var _hidePrevMonthArrow: Boolean = js.native
      
      var _initialDate: Date = js.native
      
      var _input: HTMLInputElement = js.native
      
      def _positionCalendar(): Unit = js.native
      def _positionCalendar(customPositionElement: HTMLElement): Unit = js.native
      
      var _positionElement: HTMLElement = js.native
      
      var _selectedDateObj: js.UndefOr[Date] = js.native
      
      def _setHoursFromDate(date: Date): Unit = js.native
      
      var altInput: js.UndefOr[HTMLInputElement] = js.native
      
      var amPM: js.UndefOr[HTMLSpanElement] = js.native
      
      var calendarContainer: HTMLDivElement = js.native
      
      def changeMonth(value: Double): Unit = js.native
      def changeMonth(value: Double, isOffset: js.UndefOr[scala.Nothing], fromKeyboard: Boolean): Unit = js.native
      def changeMonth(value: Double, isOffset: Boolean): Unit = js.native
      def changeMonth(value: Double, isOffset: Boolean, fromKeyboard: Boolean): Unit = js.native
      
      def changeYear(year: Double): Unit = js.native
      
      def clear(): Unit = js.native
      def clear(emitChangeEvent: js.UndefOr[scala.Nothing], toInitial: Boolean): Unit = js.native
      def clear(emitChangeEvent: Boolean): Unit = js.native
      def clear(emitChangeEvent: Boolean, toInitial: Boolean): Unit = js.native
      
      def close(): Unit = js.native
      
      var config: ParsedOptions = js.native
      
      var currentMonth: Double = js.native
      
      var currentMonthElement: HTMLSpanElement = js.native
      
      var currentYear: Double = js.native
      
      var currentYearElement: HTMLInputElement = js.native
      
      var days: HTMLDivElement = js.native
      
      var daysContainer: js.UndefOr[HTMLDivElement] = js.native
      
      def destroy(): Unit = js.native
      
      var element: HTMLElement = js.native
      
      def formatDate(dateObj: Date, frmt: String): String = js.native
      
      var formats: Formats_ = js.native
      
      var hourElement: js.UndefOr[HTMLInputElement] = js.native
      
      var innerContainer: js.UndefOr[HTMLDivElement] = js.native
      
      var input: HTMLInputElement = js.native
      
      def isEnabled(date: DateOption): Boolean = js.native
      def isEnabled(date: DateOption, timeless: Boolean): Boolean = js.native
      
      var isMobile: Boolean = js.native
      
      var isOpen: Boolean = js.native
      
      def jumpToDate(): Unit = js.native
      def jumpToDate(date: js.UndefOr[DateOption], triggerChange: Boolean): Unit = js.native
      def jumpToDate(date: DateOption): Unit = js.native
      
      var l10n: typings.flatpickr.localeMod.Locale = js.native
      
      var latestSelectedDateObj: js.UndefOr[Date] = js.native
      
      var loadedPlugins: js.Array[String] = js.native
      
      var maxDateHasTime: Boolean = js.native
      
      var maxRangeDate: js.UndefOr[Date] = js.native
      
      var minDateHasTime: Boolean = js.native
      
      var minRangeDate: js.UndefOr[Date] = js.native
      
      var minuteElement: js.UndefOr[HTMLInputElement] = js.native
      
      var mobileFormatStr: js.UndefOr[String] = js.native
      
      var mobileInput: js.UndefOr[HTMLInputElement] = js.native
      
      var monthElements: js.Array[HTMLSpanElement] = js.native
      
      var monthNav: HTMLDivElement = js.native
      
      var monthsDropdownContainer: HTMLSelectElement = js.native
      
      var nextMonthNav: HTMLElement = js.native
      
      var now: Date = js.native
      
      def open(): Unit = js.native
      def open(e: js.UndefOr[scala.Nothing], positionElement: HTMLElement): Unit = js.native
      def open(e: FocusEvent): Unit = js.native
      def open(e: FocusEvent, positionElement: HTMLElement): Unit = js.native
      def open(e: MouseEvent): Unit = js.native
      def open(e: MouseEvent, positionElement: HTMLElement): Unit = js.native
      
      def pad(num: String): String = js.native
      def pad(num: Double): String = js.native
      
      def parseDate(date: String): js.UndefOr[Date] = js.native
      def parseDate(date: String, givenFormat: js.UndefOr[scala.Nothing], timeless: Boolean): js.UndefOr[Date] = js.native
      def parseDate(date: String, givenFormat: String): js.UndefOr[Date] = js.native
      def parseDate(date: String, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
      def parseDate(date: Double): js.UndefOr[Date] = js.native
      def parseDate(date: Double, givenFormat: js.UndefOr[scala.Nothing], timeless: Boolean): js.UndefOr[Date] = js.native
      def parseDate(date: Double, givenFormat: String): js.UndefOr[Date] = js.native
      def parseDate(date: Double, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
      def parseDate(date: Date): js.UndefOr[Date] = js.native
      def parseDate(date: Date, givenFormat: js.UndefOr[scala.Nothing], timeless: Boolean): js.UndefOr[Date] = js.native
      def parseDate(date: Date, givenFormat: String): js.UndefOr[Date] = js.native
      def parseDate(date: Date, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
      
      var pluginElements: js.Array[Node] = js.native
      
      var prevMonthNav: HTMLElement = js.native
      
      var rContainer: js.UndefOr[HTMLDivElement] = js.native
      
      def redraw(): Unit = js.native
      
      var revFormat: RevFormat_ = js.native
      
      var secondElement: js.UndefOr[HTMLInputElement] = js.native
      
      var selectedDateElem: js.UndefOr[DayElement] = js.native
      
      var selectedDates: js.Array[Date] = js.native
      
      def set(option: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 62 */ js.Any): Unit = js.native
      def set(
        option: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 62 */ js.Any,
        value: js.Any
      ): Unit = js.native
      def set(option: kinkeyofOptionsOptionsk): Unit = js.native
      def set(option: kinkeyofOptionsOptionsk, value: js.Any): Unit = js.native
      
      def setDate(date: js.Array[DateOption]): Unit = js.native
      def setDate(date: js.Array[DateOption], triggerChange: js.UndefOr[scala.Nothing], format: String): Unit = js.native
      def setDate(date: js.Array[DateOption], triggerChange: Boolean): Unit = js.native
      def setDate(date: js.Array[DateOption], triggerChange: Boolean, format: String): Unit = js.native
      def setDate(date: DateOption): Unit = js.native
      def setDate(date: DateOption, triggerChange: js.UndefOr[scala.Nothing], format: String): Unit = js.native
      def setDate(date: DateOption, triggerChange: Boolean): Unit = js.native
      def setDate(date: DateOption, triggerChange: Boolean, format: String): Unit = js.native
      
      var timeContainer: js.UndefOr[HTMLDivElement] = js.native
      
      var todayDateElem: js.UndefOr[DayElement] = js.native
      
      def toggle(): Unit = js.native
      
      var tokenRegex: TokenRegex_ = js.native
      
      var utils: GetDaysInMonth = js.native
      
      var weekNumbers: js.UndefOr[HTMLDivElement] = js.native
      
      var weekWrapper: js.UndefOr[HTMLDivElement] = js.native
      
      var weekdayContainer: HTMLDivElement = js.native
      
      var yearElements: js.Array[HTMLInputElement] = js.native
    }
    
    type Locale = typings.flatpickr.localeMod.Locale
    
    object Options {
      
      type DateLimit = typings.flatpickr.optionsMod.DateLimit[typings.flatpickr.optionsMod.DateOption]
      
      type DateOption = typings.flatpickr.optionsMod.DateOption
      
      type DateRangeLimit = typings.flatpickr.optionsMod.DateRangeLimit[typings.flatpickr.optionsMod.DateOption]
      
      type Hook = typings.flatpickr.optionsMod.Hook
      
      type HookKey = typings.flatpickr.optionsMod.HookKey
      
      type LocaleKey = key
      
      /* Inlined flatpickr.flatpickr/dist/types/options.Options */
      @js.native
      trait Options extends StObject {
        
        var allowInput: js.UndefOr[Boolean] = js.native
        
        var allowInvalidPreload: js.UndefOr[Boolean] = js.native
        
        var altFormat: js.UndefOr[String] = js.native
        
        var altInput: js.UndefOr[Boolean] = js.native
        
        var altInputClass: js.UndefOr[String] = js.native
        
        var animate: js.UndefOr[Boolean] = js.native
        
        var appendTo: js.UndefOr[HTMLElement] = js.native
        
        var ariaDateFormat: js.UndefOr[String] = js.native
        
        var autoFillDefaultTime: js.UndefOr[Boolean] = js.native
        
        var clickOpens: js.UndefOr[Boolean] = js.native
        
        var closeOnSelect: js.UndefOr[Boolean] = js.native
        
        var conjunction: js.UndefOr[String] = js.native
        
        var dateFormat: js.UndefOr[String] = js.native
        
        var defaultDate: js.UndefOr[
                typings.flatpickr.optionsMod.DateOption | js.Array[typings.flatpickr.optionsMod.DateOption]
              ] = js.native
        
        var defaultHour: js.UndefOr[Double] = js.native
        
        var defaultMinute: js.UndefOr[Double] = js.native
        
        var defaultSeconds: js.UndefOr[Double] = js.native
        
        var disable: js.UndefOr[
                js.Array[typings.flatpickr.optionsMod.DateLimit[typings.flatpickr.optionsMod.DateOption]]
              ] = js.native
        
        var disableMobile: js.UndefOr[Boolean] = js.native
        
        var enable: js.UndefOr[
                js.Array[typings.flatpickr.optionsMod.DateLimit[typings.flatpickr.optionsMod.DateOption]]
              ] = js.native
        
        var enableSeconds: js.UndefOr[Boolean] = js.native
        
        var enableTime: js.UndefOr[Boolean] = js.native
        
        var errorHandler: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.native
        
        var formatDate: js.UndefOr[
                js.Function3[
                  /* date */ Date, 
                  /* format */ String, 
                  /* locale */ typings.flatpickr.localeMod.Locale, 
                  String
                ]
              ] = js.native
        
        var getWeek: js.UndefOr[js.Function1[/* date */ Date, String | Double]] = js.native
        
        var hourIncrement: js.UndefOr[Double] = js.native
        
        var ignoredFocusElements: js.UndefOr[js.Array[HTMLElement]] = js.native
        
        var `inline`: js.UndefOr[Boolean] = js.native
        
        var locale: js.UndefOr[key | typings.flatpickr.localeMod.CustomLocale] = js.native
        
        var maxDate: js.UndefOr[typings.flatpickr.optionsMod.DateOption] = js.native
        
        var maxTime: js.UndefOr[typings.flatpickr.optionsMod.DateOption] = js.native
        
        var minDate: js.UndefOr[typings.flatpickr.optionsMod.DateOption] = js.native
        
        var minTime: js.UndefOr[typings.flatpickr.optionsMod.DateOption] = js.native
        
        var minuteIncrement: js.UndefOr[Double] = js.native
        
        var mode: js.UndefOr[single | multiple | range | time] = js.native
        
        var monthSelectorType: js.UndefOr[dropdown | static] = js.native
        
        var nextArrow: js.UndefOr[String] = js.native
        
        var noCalendar: js.UndefOr[Boolean] = js.native
        
        var now: js.UndefOr[typings.flatpickr.optionsMod.DateOption] = js.native
        
        var onChange: js.UndefOr[typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]] = js.native
        
        var onClose: js.UndefOr[typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]] = js.native
        
        var onDayCreate: js.UndefOr[typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]] = js.native
        
        var onDestroy: js.UndefOr[typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]] = js.native
        
        var onKeyDown: js.UndefOr[typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]] = js.native
        
        var onMonthChange: js.UndefOr[typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]] = js.native
        
        var onOpen: js.UndefOr[typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]] = js.native
        
        var onParseConfig: js.UndefOr[typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]] = js.native
        
        var onPreCalendarPosition: js.UndefOr[typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]] = js.native
        
        var onReady: js.UndefOr[typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]] = js.native
        
        var onValueUpdate: js.UndefOr[typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]] = js.native
        
        var onYearChange: js.UndefOr[typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]] = js.native
        
        var parseDate: js.UndefOr[js.Function2[/* date */ String, /* format */ String, Date]] = js.native
        
        var plugins: js.UndefOr[js.Array[typings.flatpickr.optionsMod.Plugin[js.Object]]] = js.native
        
        var position: js.UndefOr[auto | above | below] = js.native
        
        var positionElement: js.UndefOr[Element] = js.native
        
        var prevArrow: js.UndefOr[String] = js.native
        
        var shorthandCurrentMonth: js.UndefOr[Boolean] = js.native
        
        var showMonths: js.UndefOr[Double] = js.native
        
        var static: js.UndefOr[Boolean] = js.native
        
        var time_24hr: js.UndefOr[Boolean] = js.native
        
        var weekNumbers: js.UndefOr[Boolean] = js.native
        
        var wrap: js.UndefOr[Boolean] = js.native
      }
      object Options {
        
        @scala.inline
        def apply(): typings.flatpickr.mod.flatpickr.Options.Options = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.flatpickr.mod.flatpickr.Options.Options]
        }
        
        @scala.inline
        implicit class OptionsMutableBuilder[Self <: typings.flatpickr.mod.flatpickr.Options.Options] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAllowInput(value: Boolean): Self = StObject.set(x, "allowInput", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAllowInputUndefined: Self = StObject.set(x, "allowInput", js.undefined)
          
          @scala.inline
          def setAllowInvalidPreload(value: Boolean): Self = StObject.set(x, "allowInvalidPreload", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAllowInvalidPreloadUndefined: Self = StObject.set(x, "allowInvalidPreload", js.undefined)
          
          @scala.inline
          def setAltFormat(value: String): Self = StObject.set(x, "altFormat", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAltFormatUndefined: Self = StObject.set(x, "altFormat", js.undefined)
          
          @scala.inline
          def setAltInput(value: Boolean): Self = StObject.set(x, "altInput", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAltInputClass(value: String): Self = StObject.set(x, "altInputClass", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAltInputClassUndefined: Self = StObject.set(x, "altInputClass", js.undefined)
          
          @scala.inline
          def setAltInputUndefined: Self = StObject.set(x, "altInput", js.undefined)
          
          @scala.inline
          def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
          
          @scala.inline
          def setAppendTo(value: HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
          
          @scala.inline
          def setAriaDateFormat(value: String): Self = StObject.set(x, "ariaDateFormat", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAriaDateFormatUndefined: Self = StObject.set(x, "ariaDateFormat", js.undefined)
          
          @scala.inline
          def setAutoFillDefaultTime(value: Boolean): Self = StObject.set(x, "autoFillDefaultTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAutoFillDefaultTimeUndefined: Self = StObject.set(x, "autoFillDefaultTime", js.undefined)
          
          @scala.inline
          def setClickOpens(value: Boolean): Self = StObject.set(x, "clickOpens", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClickOpensUndefined: Self = StObject.set(x, "clickOpens", js.undefined)
          
          @scala.inline
          def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
          
          @scala.inline
          def setConjunction(value: String): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setConjunctionUndefined: Self = StObject.set(x, "conjunction", js.undefined)
          
          @scala.inline
          def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
          
          @scala.inline
          def setDefaultDate(value: typings.flatpickr.optionsMod.DateOption | js.Array[typings.flatpickr.optionsMod.DateOption]): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
          
          @scala.inline
          def setDefaultDateVarargs(value: typings.flatpickr.optionsMod.DateOption*): Self = StObject.set(x, "defaultDate", js.Array(value :_*))
          
          @scala.inline
          def setDefaultHour(value: Double): Self = StObject.set(x, "defaultHour", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDefaultHourUndefined: Self = StObject.set(x, "defaultHour", js.undefined)
          
          @scala.inline
          def setDefaultMinute(value: Double): Self = StObject.set(x, "defaultMinute", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDefaultMinuteUndefined: Self = StObject.set(x, "defaultMinute", js.undefined)
          
          @scala.inline
          def setDefaultSeconds(value: Double): Self = StObject.set(x, "defaultSeconds", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDefaultSecondsUndefined: Self = StObject.set(x, "defaultSeconds", js.undefined)
          
          @scala.inline
          def setDisable(value: js.Array[typings.flatpickr.optionsMod.DateLimit[typings.flatpickr.optionsMod.DateOption]]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisableMobile(value: Boolean): Self = StObject.set(x, "disableMobile", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisableMobileUndefined: Self = StObject.set(x, "disableMobile", js.undefined)
          
          @scala.inline
          def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
          
          @scala.inline
          def setDisableVarargs(value: typings.flatpickr.optionsMod.DateLimit[typings.flatpickr.optionsMod.DateOption]*): Self = StObject.set(x, "disable", js.Array(value :_*))
          
          @scala.inline
          def setEnable(value: js.Array[typings.flatpickr.optionsMod.DateLimit[typings.flatpickr.optionsMod.DateOption]]): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEnableSeconds(value: Boolean): Self = StObject.set(x, "enableSeconds", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEnableSecondsUndefined: Self = StObject.set(x, "enableSeconds", js.undefined)
          
          @scala.inline
          def setEnableTime(value: Boolean): Self = StObject.set(x, "enableTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEnableTimeUndefined: Self = StObject.set(x, "enableTime", js.undefined)
          
          @scala.inline
          def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
          
          @scala.inline
          def setEnableVarargs(value: typings.flatpickr.optionsMod.DateLimit[typings.flatpickr.optionsMod.DateOption]*): Self = StObject.set(x, "enable", js.Array(value :_*))
          
          @scala.inline
          def setErrorHandler(value: /* e */ Error => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
          
          @scala.inline
          def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
          
          @scala.inline
          def setFormatDate(
            value: (/* date */ Date, /* format */ String, /* locale */ typings.flatpickr.localeMod.Locale) => String
          ): Self = StObject.set(x, "formatDate", js.Any.fromFunction3(value))
          
          @scala.inline
          def setFormatDateUndefined: Self = StObject.set(x, "formatDate", js.undefined)
          
          @scala.inline
          def setGetWeek(value: /* date */ Date => String | Double): Self = StObject.set(x, "getWeek", js.Any.fromFunction1(value))
          
          @scala.inline
          def setGetWeekUndefined: Self = StObject.set(x, "getWeek", js.undefined)
          
          @scala.inline
          def setHourIncrement(value: Double): Self = StObject.set(x, "hourIncrement", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHourIncrementUndefined: Self = StObject.set(x, "hourIncrement", js.undefined)
          
          @scala.inline
          def setIgnoredFocusElements(value: js.Array[HTMLElement]): Self = StObject.set(x, "ignoredFocusElements", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIgnoredFocusElementsUndefined: Self = StObject.set(x, "ignoredFocusElements", js.undefined)
          
          @scala.inline
          def setIgnoredFocusElementsVarargs(value: HTMLElement*): Self = StObject.set(x, "ignoredFocusElements", js.Array(value :_*))
          
          @scala.inline
          def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
          
          @scala.inline
          def setLocale(value: key | typings.flatpickr.localeMod.CustomLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
          
          @scala.inline
          def setMaxDate(value: typings.flatpickr.optionsMod.DateOption): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
          
          @scala.inline
          def setMaxTime(value: typings.flatpickr.optionsMod.DateOption): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
          
          @scala.inline
          def setMinDate(value: typings.flatpickr.optionsMod.DateOption): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
          
          @scala.inline
          def setMinTime(value: typings.flatpickr.optionsMod.DateOption): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
          
          @scala.inline
          def setMinuteIncrement(value: Double): Self = StObject.set(x, "minuteIncrement", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinuteIncrementUndefined: Self = StObject.set(x, "minuteIncrement", js.undefined)
          
          @scala.inline
          def setMode(value: single | multiple | range | time): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
          
          @scala.inline
          def setMonthSelectorType(value: dropdown | static): Self = StObject.set(x, "monthSelectorType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMonthSelectorTypeUndefined: Self = StObject.set(x, "monthSelectorType", js.undefined)
          
          @scala.inline
          def setNextArrow(value: String): Self = StObject.set(x, "nextArrow", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNextArrowUndefined: Self = StObject.set(x, "nextArrow", js.undefined)
          
          @scala.inline
          def setNoCalendar(value: Boolean): Self = StObject.set(x, "noCalendar", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNoCalendarUndefined: Self = StObject.set(x, "noCalendar", js.undefined)
          
          @scala.inline
          def setNow(value: typings.flatpickr.optionsMod.DateOption): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
          
          @scala.inline
          def setOnChange(value: typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnChangeFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.instanceMod.Instance, /* data */ js.UndefOr[js.Any]) => Unit
          ): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
          
          @scala.inline
          def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
          
          @scala.inline
          def setOnChangeVarargs(value: typings.flatpickr.optionsMod.Hook*): Self = StObject.set(x, "onChange", js.Array(value :_*))
          
          @scala.inline
          def setOnClose(value: typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnCloseFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.instanceMod.Instance, /* data */ js.UndefOr[js.Any]) => Unit
          ): Self = StObject.set(x, "onClose", js.Any.fromFunction4(value))
          
          @scala.inline
          def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
          
          @scala.inline
          def setOnCloseVarargs(value: typings.flatpickr.optionsMod.Hook*): Self = StObject.set(x, "onClose", js.Array(value :_*))
          
          @scala.inline
          def setOnDayCreate(value: typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]): Self = StObject.set(x, "onDayCreate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnDayCreateFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.instanceMod.Instance, /* data */ js.UndefOr[js.Any]) => Unit
          ): Self = StObject.set(x, "onDayCreate", js.Any.fromFunction4(value))
          
          @scala.inline
          def setOnDayCreateUndefined: Self = StObject.set(x, "onDayCreate", js.undefined)
          
          @scala.inline
          def setOnDayCreateVarargs(value: typings.flatpickr.optionsMod.Hook*): Self = StObject.set(x, "onDayCreate", js.Array(value :_*))
          
          @scala.inline
          def setOnDestroy(value: typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]): Self = StObject.set(x, "onDestroy", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnDestroyFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.instanceMod.Instance, /* data */ js.UndefOr[js.Any]) => Unit
          ): Self = StObject.set(x, "onDestroy", js.Any.fromFunction4(value))
          
          @scala.inline
          def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
          
          @scala.inline
          def setOnDestroyVarargs(value: typings.flatpickr.optionsMod.Hook*): Self = StObject.set(x, "onDestroy", js.Array(value :_*))
          
          @scala.inline
          def setOnKeyDown(value: typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnKeyDownFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.instanceMod.Instance, /* data */ js.UndefOr[js.Any]) => Unit
          ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction4(value))
          
          @scala.inline
          def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
          
          @scala.inline
          def setOnKeyDownVarargs(value: typings.flatpickr.optionsMod.Hook*): Self = StObject.set(x, "onKeyDown", js.Array(value :_*))
          
          @scala.inline
          def setOnMonthChange(value: typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]): Self = StObject.set(x, "onMonthChange", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnMonthChangeFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.instanceMod.Instance, /* data */ js.UndefOr[js.Any]) => Unit
          ): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction4(value))
          
          @scala.inline
          def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
          
          @scala.inline
          def setOnMonthChangeVarargs(value: typings.flatpickr.optionsMod.Hook*): Self = StObject.set(x, "onMonthChange", js.Array(value :_*))
          
          @scala.inline
          def setOnOpen(value: typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnOpenFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.instanceMod.Instance, /* data */ js.UndefOr[js.Any]) => Unit
          ): Self = StObject.set(x, "onOpen", js.Any.fromFunction4(value))
          
          @scala.inline
          def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
          
          @scala.inline
          def setOnOpenVarargs(value: typings.flatpickr.optionsMod.Hook*): Self = StObject.set(x, "onOpen", js.Array(value :_*))
          
          @scala.inline
          def setOnParseConfig(value: typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]): Self = StObject.set(x, "onParseConfig", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnParseConfigFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.instanceMod.Instance, /* data */ js.UndefOr[js.Any]) => Unit
          ): Self = StObject.set(x, "onParseConfig", js.Any.fromFunction4(value))
          
          @scala.inline
          def setOnParseConfigUndefined: Self = StObject.set(x, "onParseConfig", js.undefined)
          
          @scala.inline
          def setOnParseConfigVarargs(value: typings.flatpickr.optionsMod.Hook*): Self = StObject.set(x, "onParseConfig", js.Array(value :_*))
          
          @scala.inline
          def setOnPreCalendarPosition(value: typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]): Self = StObject.set(x, "onPreCalendarPosition", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnPreCalendarPositionFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.instanceMod.Instance, /* data */ js.UndefOr[js.Any]) => Unit
          ): Self = StObject.set(x, "onPreCalendarPosition", js.Any.fromFunction4(value))
          
          @scala.inline
          def setOnPreCalendarPositionUndefined: Self = StObject.set(x, "onPreCalendarPosition", js.undefined)
          
          @scala.inline
          def setOnPreCalendarPositionVarargs(value: typings.flatpickr.optionsMod.Hook*): Self = StObject.set(x, "onPreCalendarPosition", js.Array(value :_*))
          
          @scala.inline
          def setOnReady(value: typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnReadyFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.instanceMod.Instance, /* data */ js.UndefOr[js.Any]) => Unit
          ): Self = StObject.set(x, "onReady", js.Any.fromFunction4(value))
          
          @scala.inline
          def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
          
          @scala.inline
          def setOnReadyVarargs(value: typings.flatpickr.optionsMod.Hook*): Self = StObject.set(x, "onReady", js.Array(value :_*))
          
          @scala.inline
          def setOnValueUpdate(value: typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]): Self = StObject.set(x, "onValueUpdate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnValueUpdateFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.instanceMod.Instance, /* data */ js.UndefOr[js.Any]) => Unit
          ): Self = StObject.set(x, "onValueUpdate", js.Any.fromFunction4(value))
          
          @scala.inline
          def setOnValueUpdateUndefined: Self = StObject.set(x, "onValueUpdate", js.undefined)
          
          @scala.inline
          def setOnValueUpdateVarargs(value: typings.flatpickr.optionsMod.Hook*): Self = StObject.set(x, "onValueUpdate", js.Array(value :_*))
          
          @scala.inline
          def setOnYearChange(value: typings.flatpickr.optionsMod.Hook | js.Array[typings.flatpickr.optionsMod.Hook]): Self = StObject.set(x, "onYearChange", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnYearChangeFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.instanceMod.Instance, /* data */ js.UndefOr[js.Any]) => Unit
          ): Self = StObject.set(x, "onYearChange", js.Any.fromFunction4(value))
          
          @scala.inline
          def setOnYearChangeUndefined: Self = StObject.set(x, "onYearChange", js.undefined)
          
          @scala.inline
          def setOnYearChangeVarargs(value: typings.flatpickr.optionsMod.Hook*): Self = StObject.set(x, "onYearChange", js.Array(value :_*))
          
          @scala.inline
          def setParseDate(value: (/* date */ String, /* format */ String) => Date): Self = StObject.set(x, "parseDate", js.Any.fromFunction2(value))
          
          @scala.inline
          def setParseDateUndefined: Self = StObject.set(x, "parseDate", js.undefined)
          
          @scala.inline
          def setPlugins(value: js.Array[typings.flatpickr.optionsMod.Plugin[js.Object]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
          
          @scala.inline
          def setPluginsVarargs(value: typings.flatpickr.optionsMod.Plugin[js.Object]*): Self = StObject.set(x, "plugins", js.Array(value :_*))
          
          @scala.inline
          def setPosition(value: auto | above | below): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPositionElement(value: Element): Self = StObject.set(x, "positionElement", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPositionElementUndefined: Self = StObject.set(x, "positionElement", js.undefined)
          
          @scala.inline
          def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
          
          @scala.inline
          def setPrevArrow(value: String): Self = StObject.set(x, "prevArrow", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPrevArrowUndefined: Self = StObject.set(x, "prevArrow", js.undefined)
          
          @scala.inline
          def setShorthandCurrentMonth(value: Boolean): Self = StObject.set(x, "shorthandCurrentMonth", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setShorthandCurrentMonthUndefined: Self = StObject.set(x, "shorthandCurrentMonth", js.undefined)
          
          @scala.inline
          def setShowMonths(value: Double): Self = StObject.set(x, "showMonths", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setShowMonthsUndefined: Self = StObject.set(x, "showMonths", js.undefined)
          
          @scala.inline
          def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
          
          @scala.inline
          def setTime_24hr(value: Boolean): Self = StObject.set(x, "time_24hr", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTime_24hrUndefined: Self = StObject.set(x, "time_24hr", js.undefined)
          
          @scala.inline
          def setWeekNumbers(value: Boolean): Self = StObject.set(x, "weekNumbers", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWeekNumbersUndefined: Self = StObject.set(x, "weekNumbers", js.undefined)
          
          @scala.inline
          def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
        }
      }
      
      type ParsedOptions = typings.flatpickr.optionsMod.ParsedOptions
      
      type Plugin = typings.flatpickr.optionsMod.Plugin[js.Object]
    }
  }
}
