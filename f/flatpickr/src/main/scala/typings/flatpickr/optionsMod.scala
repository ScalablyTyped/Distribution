package typings.flatpickr

import typings.flatpickr.flatpickrStrings.above
import typings.flatpickr.flatpickrStrings.auto
import typings.flatpickr.flatpickrStrings.below
import typings.flatpickr.flatpickrStrings.dropdown
import typings.flatpickr.flatpickrStrings.multiple
import typings.flatpickr.flatpickrStrings.range
import typings.flatpickr.flatpickrStrings.single
import typings.flatpickr.flatpickrStrings.static
import typings.flatpickr.flatpickrStrings.time
import typings.flatpickr.globalsMod.global.Date
import typings.flatpickr.globalsMod.global.HTMLElement
import typings.flatpickr.instanceMod.Instance
import typings.flatpickr.localeMod.CustomLocale
import typings.flatpickr.localeMod.Locale
import typings.flatpickr.localeMod.key
import typings.std.Element
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @JSImport("flatpickr/dist/types/options", "HOOKS")
  @js.native
  val HOOKS: js.Array[HookKey] = js.native
  
  @JSImport("flatpickr/dist/types/options", "defaults")
  @js.native
  val defaults: ParsedOptions = js.native
  
  trait BaseOptions extends StObject {
    
    var allowInput: Boolean
    
    var allowInvalidPreload: Boolean
    
    var altFormat: String
    
    var altInput: Boolean
    
    var altInputClass: String
    
    var animate: Boolean
    
    var appendTo: HTMLElement
    
    var ariaDateFormat: String
    
    var autoFillDefaultTime: Boolean
    
    var clickOpens: Boolean
    
    var closeOnSelect: Boolean
    
    var conjunction: String
    
    var dateFormat: String
    
    var defaultDate: DateOption | js.Array[DateOption]
    
    var defaultHour: Double
    
    var defaultMinute: Double
    
    var defaultSeconds: Double
    
    var disable: js.Array[DateLimit[DateOption]]
    
    var disableMobile: Boolean
    
    var enable: js.Array[DateLimit[DateOption]]
    
    var enableSeconds: Boolean
    
    var enableTime: Boolean
    
    def errorHandler(e: Error): Unit
    
    def formatDate(date: Date, format: String, locale: Locale): String
    
    def getWeek(date: Date): String | Double
    
    var hourIncrement: Double
    
    var ignoredFocusElements: js.Array[HTMLElement]
    
    var `inline`: Boolean
    
    var locale: key | CustomLocale
    
    var maxDate: DateOption
    
    var maxTime: DateOption
    
    var minDate: DateOption
    
    var minTime: DateOption
    
    var minuteIncrement: Double
    
    var mode: single | multiple | range | time
    
    var monthSelectorType: dropdown | static
    
    var nextArrow: String
    
    var noCalendar: Boolean
    
    var now: js.UndefOr[DateOption] = js.undefined
    
    var onChange: Hook | js.Array[Hook]
    
    var onClose: Hook | js.Array[Hook]
    
    var onDayCreate: Hook | js.Array[Hook]
    
    var onDestroy: Hook | js.Array[Hook]
    
    var onKeyDown: Hook | js.Array[Hook]
    
    var onMonthChange: Hook | js.Array[Hook]
    
    var onOpen: Hook | js.Array[Hook]
    
    var onParseConfig: Hook | js.Array[Hook]
    
    var onPreCalendarPosition: Hook | js.Array[Hook]
    
    var onReady: Hook | js.Array[Hook]
    
    var onValueUpdate: Hook | js.Array[Hook]
    
    var onYearChange: Hook | js.Array[Hook]
    
    def parseDate(date: String, format: String): Date
    
    var plugins: js.Array[Plugin[js.Object]]
    
    var position: auto | above | below
    
    var positionElement: Element
    
    var prevArrow: String
    
    var shorthandCurrentMonth: Boolean
    
    var showMonths: js.UndefOr[Double] = js.undefined
    
    var static: Boolean
    
    var time_24hr: Boolean
    
    var weekNumbers: Boolean
    
    var wrap: Boolean
  }
  object BaseOptions {
    
    @scala.inline
    def apply(
      allowInput: Boolean,
      allowInvalidPreload: Boolean,
      altFormat: String,
      altInput: Boolean,
      altInputClass: String,
      animate: Boolean,
      appendTo: HTMLElement,
      ariaDateFormat: String,
      autoFillDefaultTime: Boolean,
      clickOpens: Boolean,
      closeOnSelect: Boolean,
      conjunction: String,
      dateFormat: String,
      defaultDate: DateOption | js.Array[DateOption],
      defaultHour: Double,
      defaultMinute: Double,
      defaultSeconds: Double,
      disable: js.Array[DateLimit[DateOption]],
      disableMobile: Boolean,
      enable: js.Array[DateLimit[DateOption]],
      enableSeconds: Boolean,
      enableTime: Boolean,
      errorHandler: Error => Unit,
      formatDate: (Date, String, Locale) => String,
      getWeek: Date => String | Double,
      hourIncrement: Double,
      ignoredFocusElements: js.Array[HTMLElement],
      `inline`: Boolean,
      locale: key | CustomLocale,
      maxDate: DateOption,
      maxTime: DateOption,
      minDate: DateOption,
      minTime: DateOption,
      minuteIncrement: Double,
      mode: single | multiple | range | time,
      monthSelectorType: dropdown | static,
      nextArrow: String,
      noCalendar: Boolean,
      onChange: Hook | js.Array[Hook],
      onClose: Hook | js.Array[Hook],
      onDayCreate: Hook | js.Array[Hook],
      onDestroy: Hook | js.Array[Hook],
      onKeyDown: Hook | js.Array[Hook],
      onMonthChange: Hook | js.Array[Hook],
      onOpen: Hook | js.Array[Hook],
      onParseConfig: Hook | js.Array[Hook],
      onPreCalendarPosition: Hook | js.Array[Hook],
      onReady: Hook | js.Array[Hook],
      onValueUpdate: Hook | js.Array[Hook],
      onYearChange: Hook | js.Array[Hook],
      parseDate: (String, String) => Date,
      plugins: js.Array[Plugin[js.Object]],
      position: auto | above | below,
      positionElement: Element,
      prevArrow: String,
      shorthandCurrentMonth: Boolean,
      static: Boolean,
      time_24hr: Boolean,
      weekNumbers: Boolean,
      wrap: Boolean
    ): BaseOptions = {
      val __obj = js.Dynamic.literal(allowInput = allowInput.asInstanceOf[js.Any], allowInvalidPreload = allowInvalidPreload.asInstanceOf[js.Any], altFormat = altFormat.asInstanceOf[js.Any], altInput = altInput.asInstanceOf[js.Any], altInputClass = altInputClass.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], appendTo = appendTo.asInstanceOf[js.Any], ariaDateFormat = ariaDateFormat.asInstanceOf[js.Any], autoFillDefaultTime = autoFillDefaultTime.asInstanceOf[js.Any], clickOpens = clickOpens.asInstanceOf[js.Any], closeOnSelect = closeOnSelect.asInstanceOf[js.Any], conjunction = conjunction.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], defaultDate = defaultDate.asInstanceOf[js.Any], defaultHour = defaultHour.asInstanceOf[js.Any], defaultMinute = defaultMinute.asInstanceOf[js.Any], defaultSeconds = defaultSeconds.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], disableMobile = disableMobile.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], enableSeconds = enableSeconds.asInstanceOf[js.Any], enableTime = enableTime.asInstanceOf[js.Any], errorHandler = js.Any.fromFunction1(errorHandler), formatDate = js.Any.fromFunction3(formatDate), getWeek = js.Any.fromFunction1(getWeek), hourIncrement = hourIncrement.asInstanceOf[js.Any], ignoredFocusElements = ignoredFocusElements.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], maxTime = maxTime.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any], minuteIncrement = minuteIncrement.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], monthSelectorType = monthSelectorType.asInstanceOf[js.Any], nextArrow = nextArrow.asInstanceOf[js.Any], noCalendar = noCalendar.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any], onDayCreate = onDayCreate.asInstanceOf[js.Any], onDestroy = onDestroy.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onMonthChange = onMonthChange.asInstanceOf[js.Any], onOpen = onOpen.asInstanceOf[js.Any], onParseConfig = onParseConfig.asInstanceOf[js.Any], onPreCalendarPosition = onPreCalendarPosition.asInstanceOf[js.Any], onReady = onReady.asInstanceOf[js.Any], onValueUpdate = onValueUpdate.asInstanceOf[js.Any], onYearChange = onYearChange.asInstanceOf[js.Any], parseDate = js.Any.fromFunction2(parseDate), plugins = plugins.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positionElement = positionElement.asInstanceOf[js.Any], prevArrow = prevArrow.asInstanceOf[js.Any], shorthandCurrentMonth = shorthandCurrentMonth.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], time_24hr = time_24hr.asInstanceOf[js.Any], weekNumbers = weekNumbers.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseOptions]
    }
    
    @scala.inline
    implicit class BaseOptionsMutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowInput(value: Boolean): Self = StObject.set(x, "allowInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowInvalidPreload(value: Boolean): Self = StObject.set(x, "allowInvalidPreload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltFormat(value: String): Self = StObject.set(x, "altFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltInput(value: Boolean): Self = StObject.set(x, "altInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltInputClass(value: String): Self = StObject.set(x, "altInputClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendTo(value: HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaDateFormat(value: String): Self = StObject.set(x, "ariaDateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFillDefaultTime(value: Boolean): Self = StObject.set(x, "autoFillDefaultTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickOpens(value: Boolean): Self = StObject.set(x, "clickOpens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConjunction(value: String): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDate(value: DateOption | js.Array[DateOption]): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDateVarargs(value: DateOption*): Self = StObject.set(x, "defaultDate", js.Array(value :_*))
      
      @scala.inline
      def setDefaultHour(value: Double): Self = StObject.set(x, "defaultHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMinute(value: Double): Self = StObject.set(x, "defaultMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSeconds(value: Double): Self = StObject.set(x, "defaultSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable(value: js.Array[DateLimit[DateOption]]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableMobile(value: Boolean): Self = StObject.set(x, "disableMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableVarargs(value: DateLimit[DateOption]*): Self = StObject.set(x, "disable", js.Array(value :_*))
      
      @scala.inline
      def setEnable(value: js.Array[DateLimit[DateOption]]): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSeconds(value: Boolean): Self = StObject.set(x, "enableSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTime(value: Boolean): Self = StObject.set(x, "enableTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableVarargs(value: DateLimit[DateOption]*): Self = StObject.set(x, "enable", js.Array(value :_*))
      
      @scala.inline
      def setErrorHandler(value: Error => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatDate(value: (Date, String, Locale) => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetWeek(value: Date => String | Double): Self = StObject.set(x, "getWeek", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHourIncrement(value: Double): Self = StObject.set(x, "hourIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredFocusElements(value: js.Array[HTMLElement]): Self = StObject.set(x, "ignoredFocusElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredFocusElementsVarargs(value: HTMLElement*): Self = StObject.set(x, "ignoredFocusElements", js.Array(value :_*))
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: key | CustomLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDate(value: DateOption): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTime(value: DateOption): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDate(value: DateOption): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinTime(value: DateOption): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteIncrement(value: Double): Self = StObject.set(x, "minuteIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: single | multiple | range | time): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthSelectorType(value: dropdown | static): Self = StObject.set(x, "monthSelectorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextArrow(value: String): Self = StObject.set(x, "nextArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCalendar(value: Boolean): Self = StObject.set(x, "noCalendar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNow(value: DateOption): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      @scala.inline
      def setOnChange(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnChangeVarargs(value: Hook*): Self = StObject.set(x, "onChange", js.Array(value :_*))
      
      @scala.inline
      def setOnClose(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCloseFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onClose", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnCloseVarargs(value: Hook*): Self = StObject.set(x, "onClose", js.Array(value :_*))
      
      @scala.inline
      def setOnDayCreate(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onDayCreate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDayCreateFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onDayCreate", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnDayCreateVarargs(value: Hook*): Self = StObject.set(x, "onDayCreate", js.Array(value :_*))
      
      @scala.inline
      def setOnDestroy(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDestroyFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onDestroy", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnDestroyVarargs(value: Hook*): Self = StObject.set(x, "onDestroy", js.Array(value :_*))
      
      @scala.inline
      def setOnKeyDown(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyDownFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnKeyDownVarargs(value: Hook*): Self = StObject.set(x, "onKeyDown", js.Array(value :_*))
      
      @scala.inline
      def setOnMonthChange(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onMonthChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMonthChangeFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnMonthChangeVarargs(value: Hook*): Self = StObject.set(x, "onMonthChange", js.Array(value :_*))
      
      @scala.inline
      def setOnOpen(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOpenFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onOpen", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnOpenVarargs(value: Hook*): Self = StObject.set(x, "onOpen", js.Array(value :_*))
      
      @scala.inline
      def setOnParseConfig(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onParseConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnParseConfigFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onParseConfig", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnParseConfigVarargs(value: Hook*): Self = StObject.set(x, "onParseConfig", js.Array(value :_*))
      
      @scala.inline
      def setOnPreCalendarPosition(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onPreCalendarPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPreCalendarPositionFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onPreCalendarPosition", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnPreCalendarPositionVarargs(value: Hook*): Self = StObject.set(x, "onPreCalendarPosition", js.Array(value :_*))
      
      @scala.inline
      def setOnReady(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnReadyFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onReady", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnReadyVarargs(value: Hook*): Self = StObject.set(x, "onReady", js.Array(value :_*))
      
      @scala.inline
      def setOnValueUpdate(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onValueUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnValueUpdateFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onValueUpdate", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnValueUpdateVarargs(value: Hook*): Self = StObject.set(x, "onValueUpdate", js.Array(value :_*))
      
      @scala.inline
      def setOnYearChange(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onYearChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnYearChangeFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onYearChange", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnYearChangeVarargs(value: Hook*): Self = StObject.set(x, "onYearChange", js.Array(value :_*))
      
      @scala.inline
      def setParseDate(value: (String, String) => Date): Self = StObject.set(x, "parseDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlugins(value: js.Array[Plugin[js.Object]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsVarargs(value: Plugin[js.Object]*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setPosition(value: auto | above | below): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionElement(value: Element): Self = StObject.set(x, "positionElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevArrow(value: String): Self = StObject.set(x, "prevArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShorthandCurrentMonth(value: Boolean): Self = StObject.set(x, "shorthandCurrentMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMonths(value: Double): Self = StObject.set(x, "showMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMonthsUndefined: Self = StObject.set(x, "showMonths", js.undefined)
      
      @scala.inline
      def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime_24hr(value: Boolean): Self = StObject.set(x, "time_24hr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekNumbers(value: Boolean): Self = StObject.set(x, "weekNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    }
  }
  
  type DateLimit[D] = D | DateRangeLimit[D] | (js.Function1[/* date */ Date, Boolean])
  
  type DateOption = Date | String | Double
  
  trait DateRangeLimit[D] extends StObject {
    
    var from: D
    
    var to: D
  }
  object DateRangeLimit {
    
    @scala.inline
    def apply[D](from: D, to: D): DateRangeLimit[D] = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateRangeLimit[D]]
    }
    
    @scala.inline
    implicit class DateRangeLimitMutableBuilder[Self <: DateRangeLimit[?], D] (val x: Self & DateRangeLimit[D]) extends AnyVal {
      
      @scala.inline
      def setFrom(value: D): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: D): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  type Hook = js.Function4[
    /* dates */ js.Array[Date], 
    /* currentDateString */ String, 
    /* self */ Instance, 
    /* data */ js.UndefOr[js.Any], 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.flatpickr.flatpickrStrings.onChange
    - typings.flatpickr.flatpickrStrings.onClose
    - typings.flatpickr.flatpickrStrings.onDayCreate
    - typings.flatpickr.flatpickrStrings.onDestroy
    - typings.flatpickr.flatpickrStrings.onKeyDown
    - typings.flatpickr.flatpickrStrings.onMonthChange
    - typings.flatpickr.flatpickrStrings.onOpen
    - typings.flatpickr.flatpickrStrings.onParseConfig
    - typings.flatpickr.flatpickrStrings.onReady
    - typings.flatpickr.flatpickrStrings.onValueUpdate
    - typings.flatpickr.flatpickrStrings.onYearChange
    - typings.flatpickr.flatpickrStrings.onPreCalendarPosition
  */
  trait HookKey extends StObject
  object HookKey {
    
    @scala.inline
    def onChange: typings.flatpickr.flatpickrStrings.onChange = "onChange".asInstanceOf[typings.flatpickr.flatpickrStrings.onChange]
    
    @scala.inline
    def onClose: typings.flatpickr.flatpickrStrings.onClose = "onClose".asInstanceOf[typings.flatpickr.flatpickrStrings.onClose]
    
    @scala.inline
    def onDayCreate: typings.flatpickr.flatpickrStrings.onDayCreate = "onDayCreate".asInstanceOf[typings.flatpickr.flatpickrStrings.onDayCreate]
    
    @scala.inline
    def onDestroy: typings.flatpickr.flatpickrStrings.onDestroy = "onDestroy".asInstanceOf[typings.flatpickr.flatpickrStrings.onDestroy]
    
    @scala.inline
    def onKeyDown: typings.flatpickr.flatpickrStrings.onKeyDown = "onKeyDown".asInstanceOf[typings.flatpickr.flatpickrStrings.onKeyDown]
    
    @scala.inline
    def onMonthChange: typings.flatpickr.flatpickrStrings.onMonthChange = "onMonthChange".asInstanceOf[typings.flatpickr.flatpickrStrings.onMonthChange]
    
    @scala.inline
    def onOpen: typings.flatpickr.flatpickrStrings.onOpen = "onOpen".asInstanceOf[typings.flatpickr.flatpickrStrings.onOpen]
    
    @scala.inline
    def onParseConfig: typings.flatpickr.flatpickrStrings.onParseConfig = "onParseConfig".asInstanceOf[typings.flatpickr.flatpickrStrings.onParseConfig]
    
    @scala.inline
    def onPreCalendarPosition: typings.flatpickr.flatpickrStrings.onPreCalendarPosition = "onPreCalendarPosition".asInstanceOf[typings.flatpickr.flatpickrStrings.onPreCalendarPosition]
    
    @scala.inline
    def onReady: typings.flatpickr.flatpickrStrings.onReady = "onReady".asInstanceOf[typings.flatpickr.flatpickrStrings.onReady]
    
    @scala.inline
    def onValueUpdate: typings.flatpickr.flatpickrStrings.onValueUpdate = "onValueUpdate".asInstanceOf[typings.flatpickr.flatpickrStrings.onValueUpdate]
    
    @scala.inline
    def onYearChange: typings.flatpickr.flatpickrStrings.onYearChange = "onYearChange".asInstanceOf[typings.flatpickr.flatpickrStrings.onYearChange]
  }
  
  /* Inlined std.Partial<flatpickr.flatpickr/dist/types/options.BaseOptions> */
  trait Options extends StObject {
    
    var allowInput: js.UndefOr[Boolean] = js.undefined
    
    var allowInvalidPreload: js.UndefOr[Boolean] = js.undefined
    
    var altFormat: js.UndefOr[String] = js.undefined
    
    var altInput: js.UndefOr[Boolean] = js.undefined
    
    var altInputClass: js.UndefOr[String] = js.undefined
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var appendTo: js.UndefOr[HTMLElement] = js.undefined
    
    var ariaDateFormat: js.UndefOr[String] = js.undefined
    
    var autoFillDefaultTime: js.UndefOr[Boolean] = js.undefined
    
    var clickOpens: js.UndefOr[Boolean] = js.undefined
    
    var closeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var conjunction: js.UndefOr[String] = js.undefined
    
    var dateFormat: js.UndefOr[String] = js.undefined
    
    var defaultDate: js.UndefOr[DateOption | js.Array[DateOption]] = js.undefined
    
    var defaultHour: js.UndefOr[Double] = js.undefined
    
    var defaultMinute: js.UndefOr[Double] = js.undefined
    
    var defaultSeconds: js.UndefOr[Double] = js.undefined
    
    var disable: js.UndefOr[js.Array[DateLimit[DateOption]]] = js.undefined
    
    var disableMobile: js.UndefOr[Boolean] = js.undefined
    
    var enable: js.UndefOr[js.Array[DateLimit[DateOption]]] = js.undefined
    
    var enableSeconds: js.UndefOr[Boolean] = js.undefined
    
    var enableTime: js.UndefOr[Boolean] = js.undefined
    
    var errorHandler: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.undefined
    
    var formatDate: js.UndefOr[js.Function3[/* date */ Date, /* format */ String, /* locale */ Locale, String]] = js.undefined
    
    var getWeek: js.UndefOr[js.Function1[/* date */ Date, String | Double]] = js.undefined
    
    var hourIncrement: js.UndefOr[Double] = js.undefined
    
    var ignoredFocusElements: js.UndefOr[js.Array[HTMLElement]] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[key | CustomLocale] = js.undefined
    
    var maxDate: js.UndefOr[DateOption] = js.undefined
    
    var maxTime: js.UndefOr[DateOption] = js.undefined
    
    var minDate: js.UndefOr[DateOption] = js.undefined
    
    var minTime: js.UndefOr[DateOption] = js.undefined
    
    var minuteIncrement: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[single | multiple | range | time] = js.undefined
    
    var monthSelectorType: js.UndefOr[dropdown | static] = js.undefined
    
    var nextArrow: js.UndefOr[String] = js.undefined
    
    var noCalendar: js.UndefOr[Boolean] = js.undefined
    
    var now: js.UndefOr[DateOption] = js.undefined
    
    var onChange: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var onClose: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var onDayCreate: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var onDestroy: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var onKeyDown: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var onMonthChange: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var onOpen: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var onParseConfig: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var onPreCalendarPosition: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var onReady: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var onValueUpdate: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var onYearChange: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
    
    var parseDate: js.UndefOr[js.Function2[/* date */ String, /* format */ String, Date]] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Plugin[js.Object]]] = js.undefined
    
    var position: js.UndefOr[auto | above | below] = js.undefined
    
    var positionElement: js.UndefOr[Element] = js.undefined
    
    var prevArrow: js.UndefOr[String] = js.undefined
    
    var shorthandCurrentMonth: js.UndefOr[Boolean] = js.undefined
    
    var showMonths: js.UndefOr[Double] = js.undefined
    
    var static: js.UndefOr[Boolean] = js.undefined
    
    var time_24hr: js.UndefOr[Boolean] = js.undefined
    
    var weekNumbers: js.UndefOr[Boolean] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
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
      def setDefaultDate(value: DateOption | js.Array[DateOption]): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      @scala.inline
      def setDefaultDateVarargs(value: DateOption*): Self = StObject.set(x, "defaultDate", js.Array(value :_*))
      
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
      def setDisable(value: js.Array[DateLimit[DateOption]]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableMobile(value: Boolean): Self = StObject.set(x, "disableMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableMobileUndefined: Self = StObject.set(x, "disableMobile", js.undefined)
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setDisableVarargs(value: DateLimit[DateOption]*): Self = StObject.set(x, "disable", js.Array(value :_*))
      
      @scala.inline
      def setEnable(value: js.Array[DateLimit[DateOption]]): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
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
      def setEnableVarargs(value: DateLimit[DateOption]*): Self = StObject.set(x, "enable", js.Array(value :_*))
      
      @scala.inline
      def setErrorHandler(value: /* e */ Error => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      @scala.inline
      def setFormatDate(value: (/* date */ Date, /* format */ String, /* locale */ Locale) => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction3(value))
      
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
      def setLocale(value: key | CustomLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxDate(value: DateOption): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMaxTime(value: DateOption): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      @scala.inline
      def setMinDate(value: DateOption): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMinTime(value: DateOption): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
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
      def setNow(value: DateOption): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      @scala.inline
      def setOnChange(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnChangeVarargs(value: Hook*): Self = StObject.set(x, "onChange", js.Array(value :_*))
      
      @scala.inline
      def setOnClose(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCloseFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onClose", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnCloseVarargs(value: Hook*): Self = StObject.set(x, "onClose", js.Array(value :_*))
      
      @scala.inline
      def setOnDayCreate(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onDayCreate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDayCreateFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onDayCreate", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnDayCreateUndefined: Self = StObject.set(x, "onDayCreate", js.undefined)
      
      @scala.inline
      def setOnDayCreateVarargs(value: Hook*): Self = StObject.set(x, "onDayCreate", js.Array(value :_*))
      
      @scala.inline
      def setOnDestroy(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDestroyFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onDestroy", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
      
      @scala.inline
      def setOnDestroyVarargs(value: Hook*): Self = StObject.set(x, "onDestroy", js.Array(value :_*))
      
      @scala.inline
      def setOnKeyDown(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyDownFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyDownVarargs(value: Hook*): Self = StObject.set(x, "onKeyDown", js.Array(value :_*))
      
      @scala.inline
      def setOnMonthChange(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onMonthChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMonthChangeFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      @scala.inline
      def setOnMonthChangeVarargs(value: Hook*): Self = StObject.set(x, "onMonthChange", js.Array(value :_*))
      
      @scala.inline
      def setOnOpen(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOpenFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onOpen", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOnOpenVarargs(value: Hook*): Self = StObject.set(x, "onOpen", js.Array(value :_*))
      
      @scala.inline
      def setOnParseConfig(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onParseConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnParseConfigFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onParseConfig", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnParseConfigUndefined: Self = StObject.set(x, "onParseConfig", js.undefined)
      
      @scala.inline
      def setOnParseConfigVarargs(value: Hook*): Self = StObject.set(x, "onParseConfig", js.Array(value :_*))
      
      @scala.inline
      def setOnPreCalendarPosition(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onPreCalendarPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPreCalendarPositionFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onPreCalendarPosition", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnPreCalendarPositionUndefined: Self = StObject.set(x, "onPreCalendarPosition", js.undefined)
      
      @scala.inline
      def setOnPreCalendarPositionVarargs(value: Hook*): Self = StObject.set(x, "onPreCalendarPosition", js.Array(value :_*))
      
      @scala.inline
      def setOnReady(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnReadyFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onReady", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      @scala.inline
      def setOnReadyVarargs(value: Hook*): Self = StObject.set(x, "onReady", js.Array(value :_*))
      
      @scala.inline
      def setOnValueUpdate(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onValueUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnValueUpdateFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onValueUpdate", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnValueUpdateUndefined: Self = StObject.set(x, "onValueUpdate", js.undefined)
      
      @scala.inline
      def setOnValueUpdateVarargs(value: Hook*): Self = StObject.set(x, "onValueUpdate", js.Array(value :_*))
      
      @scala.inline
      def setOnYearChange(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onYearChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnYearChangeFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onYearChange", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnYearChangeUndefined: Self = StObject.set(x, "onYearChange", js.undefined)
      
      @scala.inline
      def setOnYearChangeVarargs(value: Hook*): Self = StObject.set(x, "onYearChange", js.Array(value :_*))
      
      @scala.inline
      def setParseDate(value: (/* date */ String, /* format */ String) => Date): Self = StObject.set(x, "parseDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParseDateUndefined: Self = StObject.set(x, "parseDate", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[Plugin[js.Object]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: Plugin[js.Object]*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
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
  
  trait ParsedOptions extends StObject {
    
    var _disable: js.Array[DateLimit[Date]]
    
    var _enable: js.Array[DateLimit[Date]]
    
    var _maxDate: js.UndefOr[Date] = js.undefined
    
    var _maxTime: js.UndefOr[Date] = js.undefined
    
    var _minDate: js.UndefOr[Date] = js.undefined
    
    var _minTime: js.UndefOr[Date] = js.undefined
    
    var allowInput: Boolean
    
    var allowInvalidPreload: Boolean
    
    var altFormat: String
    
    var altInput: Boolean
    
    var altInputClass: String
    
    var animate: Boolean
    
    var appendTo: js.UndefOr[HTMLElement] = js.undefined
    
    var ariaDateFormat: String
    
    var autoFillDefaultTime: Boolean
    
    var clickOpens: Boolean
    
    var closeOnSelect: Boolean
    
    var conjunction: String
    
    var dateFormat: String
    
    var defaultDate: js.UndefOr[Date | js.Array[Date]] = js.undefined
    
    var defaultHour: Double
    
    var defaultMinute: Double
    
    var defaultSeconds: Double
    
    var disable: js.Array[DateLimit[Date]]
    
    var disableMobile: Boolean
    
    var enable: js.Array[DateLimit[Date]]
    
    var enableSeconds: Boolean
    
    var enableTime: Boolean
    
    def errorHandler(err: Error): Unit
    
    var formatDate: js.UndefOr[js.Function3[/* date */ Date, /* format */ String, /* locale */ Locale, String]] = js.undefined
    
    def getWeek(date: Date): String | Double
    
    var hourIncrement: Double
    
    var ignoredFocusElements: js.Array[HTMLElement]
    
    var `inline`: Boolean
    
    var locale: key | CustomLocale
    
    var maxDate: js.UndefOr[Date] = js.undefined
    
    var maxTime: js.UndefOr[Date] = js.undefined
    
    var minDate: js.UndefOr[Date] = js.undefined
    
    var minTime: js.UndefOr[Date] = js.undefined
    
    var minuteIncrement: Double
    
    var mode: single | multiple | range | time
    
    var monthSelectorType: String
    
    var nextArrow: String
    
    var noCalendar: Boolean
    
    var now: Date
    
    var onChange: js.Array[Hook]
    
    var onClose: js.Array[Hook]
    
    var onDayCreate: js.Array[Hook]
    
    var onDestroy: js.Array[Hook]
    
    var onKeyDown: js.Array[Hook]
    
    var onMonthChange: js.Array[Hook]
    
    var onOpen: js.Array[Hook]
    
    var onParseConfig: js.Array[Hook]
    
    var onPreCalendarPosition: js.Array[Hook]
    
    var onReady: js.Array[Hook]
    
    var onValueUpdate: js.Array[Hook]
    
    var onYearChange: js.Array[Hook]
    
    var parseDate: js.UndefOr[js.Function2[/* date */ String, /* format */ String, Date]] = js.undefined
    
    var plugins: js.Array[Plugin[js.Object]]
    
    var position: auto | above | below
    
    var positionElement: js.UndefOr[HTMLElement] = js.undefined
    
    var prevArrow: String
    
    var shorthandCurrentMonth: Boolean
    
    var showMonths: Double
    
    var static: Boolean
    
    var time_24hr: Boolean
    
    var weekNumbers: Boolean
    
    var wrap: Boolean
  }
  object ParsedOptions {
    
    @scala.inline
    def apply(
      _disable: js.Array[DateLimit[Date]],
      _enable: js.Array[DateLimit[Date]],
      allowInput: Boolean,
      allowInvalidPreload: Boolean,
      altFormat: String,
      altInput: Boolean,
      altInputClass: String,
      animate: Boolean,
      ariaDateFormat: String,
      autoFillDefaultTime: Boolean,
      clickOpens: Boolean,
      closeOnSelect: Boolean,
      conjunction: String,
      dateFormat: String,
      defaultHour: Double,
      defaultMinute: Double,
      defaultSeconds: Double,
      disable: js.Array[DateLimit[Date]],
      disableMobile: Boolean,
      enable: js.Array[DateLimit[Date]],
      enableSeconds: Boolean,
      enableTime: Boolean,
      errorHandler: Error => Unit,
      getWeek: Date => String | Double,
      hourIncrement: Double,
      ignoredFocusElements: js.Array[HTMLElement],
      `inline`: Boolean,
      locale: key | CustomLocale,
      minuteIncrement: Double,
      mode: single | multiple | range | time,
      monthSelectorType: String,
      nextArrow: String,
      noCalendar: Boolean,
      now: Date,
      onChange: js.Array[Hook],
      onClose: js.Array[Hook],
      onDayCreate: js.Array[Hook],
      onDestroy: js.Array[Hook],
      onKeyDown: js.Array[Hook],
      onMonthChange: js.Array[Hook],
      onOpen: js.Array[Hook],
      onParseConfig: js.Array[Hook],
      onPreCalendarPosition: js.Array[Hook],
      onReady: js.Array[Hook],
      onValueUpdate: js.Array[Hook],
      onYearChange: js.Array[Hook],
      plugins: js.Array[Plugin[js.Object]],
      position: auto | above | below,
      prevArrow: String,
      shorthandCurrentMonth: Boolean,
      showMonths: Double,
      static: Boolean,
      time_24hr: Boolean,
      weekNumbers: Boolean,
      wrap: Boolean
    ): ParsedOptions = {
      val __obj = js.Dynamic.literal(_disable = _disable.asInstanceOf[js.Any], _enable = _enable.asInstanceOf[js.Any], allowInput = allowInput.asInstanceOf[js.Any], allowInvalidPreload = allowInvalidPreload.asInstanceOf[js.Any], altFormat = altFormat.asInstanceOf[js.Any], altInput = altInput.asInstanceOf[js.Any], altInputClass = altInputClass.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], ariaDateFormat = ariaDateFormat.asInstanceOf[js.Any], autoFillDefaultTime = autoFillDefaultTime.asInstanceOf[js.Any], clickOpens = clickOpens.asInstanceOf[js.Any], closeOnSelect = closeOnSelect.asInstanceOf[js.Any], conjunction = conjunction.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], defaultHour = defaultHour.asInstanceOf[js.Any], defaultMinute = defaultMinute.asInstanceOf[js.Any], defaultSeconds = defaultSeconds.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], disableMobile = disableMobile.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], enableSeconds = enableSeconds.asInstanceOf[js.Any], enableTime = enableTime.asInstanceOf[js.Any], errorHandler = js.Any.fromFunction1(errorHandler), getWeek = js.Any.fromFunction1(getWeek), hourIncrement = hourIncrement.asInstanceOf[js.Any], ignoredFocusElements = ignoredFocusElements.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minuteIncrement = minuteIncrement.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], monthSelectorType = monthSelectorType.asInstanceOf[js.Any], nextArrow = nextArrow.asInstanceOf[js.Any], noCalendar = noCalendar.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any], onDayCreate = onDayCreate.asInstanceOf[js.Any], onDestroy = onDestroy.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onMonthChange = onMonthChange.asInstanceOf[js.Any], onOpen = onOpen.asInstanceOf[js.Any], onParseConfig = onParseConfig.asInstanceOf[js.Any], onPreCalendarPosition = onPreCalendarPosition.asInstanceOf[js.Any], onReady = onReady.asInstanceOf[js.Any], onValueUpdate = onValueUpdate.asInstanceOf[js.Any], onYearChange = onYearChange.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], prevArrow = prevArrow.asInstanceOf[js.Any], shorthandCurrentMonth = shorthandCurrentMonth.asInstanceOf[js.Any], showMonths = showMonths.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], time_24hr = time_24hr.asInstanceOf[js.Any], weekNumbers = weekNumbers.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedOptions]
    }
    
    @scala.inline
    implicit class ParsedOptionsMutableBuilder[Self <: ParsedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowInput(value: Boolean): Self = StObject.set(x, "allowInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowInvalidPreload(value: Boolean): Self = StObject.set(x, "allowInvalidPreload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltFormat(value: String): Self = StObject.set(x, "altFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltInput(value: Boolean): Self = StObject.set(x, "altInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltInputClass(value: String): Self = StObject.set(x, "altInputClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendTo(value: HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setAriaDateFormat(value: String): Self = StObject.set(x, "ariaDateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFillDefaultTime(value: Boolean): Self = StObject.set(x, "autoFillDefaultTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickOpens(value: Boolean): Self = StObject.set(x, "clickOpens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConjunction(value: String): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDate(value: Date | js.Array[Date]): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      @scala.inline
      def setDefaultDateVarargs(value: Date*): Self = StObject.set(x, "defaultDate", js.Array(value :_*))
      
      @scala.inline
      def setDefaultHour(value: Double): Self = StObject.set(x, "defaultHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMinute(value: Double): Self = StObject.set(x, "defaultMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSeconds(value: Double): Self = StObject.set(x, "defaultSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable(value: js.Array[DateLimit[Date]]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableMobile(value: Boolean): Self = StObject.set(x, "disableMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableVarargs(value: DateLimit[Date]*): Self = StObject.set(x, "disable", js.Array(value :_*))
      
      @scala.inline
      def setEnable(value: js.Array[DateLimit[Date]]): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSeconds(value: Boolean): Self = StObject.set(x, "enableSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTime(value: Boolean): Self = StObject.set(x, "enableTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableVarargs(value: DateLimit[Date]*): Self = StObject.set(x, "enable", js.Array(value :_*))
      
      @scala.inline
      def setErrorHandler(value: Error => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatDate(value: (/* date */ Date, /* format */ String, /* locale */ Locale) => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatDateUndefined: Self = StObject.set(x, "formatDate", js.undefined)
      
      @scala.inline
      def setGetWeek(value: Date => String | Double): Self = StObject.set(x, "getWeek", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHourIncrement(value: Double): Self = StObject.set(x, "hourIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredFocusElements(value: js.Array[HTMLElement]): Self = StObject.set(x, "ignoredFocusElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredFocusElementsVarargs(value: HTMLElement*): Self = StObject.set(x, "ignoredFocusElements", js.Array(value :_*))
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: key | CustomLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMaxTime(value: Date): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      @scala.inline
      def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMinTime(value: Date): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      @scala.inline
      def setMinuteIncrement(value: Double): Self = StObject.set(x, "minuteIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: single | multiple | range | time): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthSelectorType(value: String): Self = StObject.set(x, "monthSelectorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextArrow(value: String): Self = StObject.set(x, "nextArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCalendar(value: Boolean): Self = StObject.set(x, "noCalendar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNow(value: Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: js.Array[Hook]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeVarargs(value: Hook*): Self = StObject.set(x, "onChange", js.Array(value :_*))
      
      @scala.inline
      def setOnClose(value: js.Array[Hook]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCloseVarargs(value: Hook*): Self = StObject.set(x, "onClose", js.Array(value :_*))
      
      @scala.inline
      def setOnDayCreate(value: js.Array[Hook]): Self = StObject.set(x, "onDayCreate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDayCreateVarargs(value: Hook*): Self = StObject.set(x, "onDayCreate", js.Array(value :_*))
      
      @scala.inline
      def setOnDestroy(value: js.Array[Hook]): Self = StObject.set(x, "onDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDestroyVarargs(value: Hook*): Self = StObject.set(x, "onDestroy", js.Array(value :_*))
      
      @scala.inline
      def setOnKeyDown(value: js.Array[Hook]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyDownVarargs(value: Hook*): Self = StObject.set(x, "onKeyDown", js.Array(value :_*))
      
      @scala.inline
      def setOnMonthChange(value: js.Array[Hook]): Self = StObject.set(x, "onMonthChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMonthChangeVarargs(value: Hook*): Self = StObject.set(x, "onMonthChange", js.Array(value :_*))
      
      @scala.inline
      def setOnOpen(value: js.Array[Hook]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOpenVarargs(value: Hook*): Self = StObject.set(x, "onOpen", js.Array(value :_*))
      
      @scala.inline
      def setOnParseConfig(value: js.Array[Hook]): Self = StObject.set(x, "onParseConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnParseConfigVarargs(value: Hook*): Self = StObject.set(x, "onParseConfig", js.Array(value :_*))
      
      @scala.inline
      def setOnPreCalendarPosition(value: js.Array[Hook]): Self = StObject.set(x, "onPreCalendarPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPreCalendarPositionVarargs(value: Hook*): Self = StObject.set(x, "onPreCalendarPosition", js.Array(value :_*))
      
      @scala.inline
      def setOnReady(value: js.Array[Hook]): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnReadyVarargs(value: Hook*): Self = StObject.set(x, "onReady", js.Array(value :_*))
      
      @scala.inline
      def setOnValueUpdate(value: js.Array[Hook]): Self = StObject.set(x, "onValueUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnValueUpdateVarargs(value: Hook*): Self = StObject.set(x, "onValueUpdate", js.Array(value :_*))
      
      @scala.inline
      def setOnYearChange(value: js.Array[Hook]): Self = StObject.set(x, "onYearChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnYearChangeVarargs(value: Hook*): Self = StObject.set(x, "onYearChange", js.Array(value :_*))
      
      @scala.inline
      def setParseDate(value: (/* date */ String, /* format */ String) => Date): Self = StObject.set(x, "parseDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParseDateUndefined: Self = StObject.set(x, "parseDate", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[Plugin[js.Object]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsVarargs(value: Plugin[js.Object]*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setPosition(value: auto | above | below): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionElement(value: HTMLElement): Self = StObject.set(x, "positionElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionElementUndefined: Self = StObject.set(x, "positionElement", js.undefined)
      
      @scala.inline
      def setPrevArrow(value: String): Self = StObject.set(x, "prevArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShorthandCurrentMonth(value: Boolean): Self = StObject.set(x, "shorthandCurrentMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMonths(value: Double): Self = StObject.set(x, "showMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime_24hr(value: Boolean): Self = StObject.set(x, "time_24hr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekNumbers(value: Boolean): Self = StObject.set(x, "weekNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_disable(value: js.Array[DateLimit[Date]]): Self = StObject.set(x, "_disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_disableVarargs(value: DateLimit[Date]*): Self = StObject.set(x, "_disable", js.Array(value :_*))
      
      @scala.inline
      def set_enable(value: js.Array[DateLimit[Date]]): Self = StObject.set(x, "_enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_enableVarargs(value: DateLimit[Date]*): Self = StObject.set(x, "_enable", js.Array(value :_*))
      
      @scala.inline
      def set_maxDate(value: Date): Self = StObject.set(x, "_maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_maxDateUndefined: Self = StObject.set(x, "_maxDate", js.undefined)
      
      @scala.inline
      def set_maxTime(value: Date): Self = StObject.set(x, "_maxTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_maxTimeUndefined: Self = StObject.set(x, "_maxTime", js.undefined)
      
      @scala.inline
      def set_minDate(value: Date): Self = StObject.set(x, "_minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_minDateUndefined: Self = StObject.set(x, "_minDate", js.undefined)
      
      @scala.inline
      def set_minTime(value: Date): Self = StObject.set(x, "_minTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_minTimeUndefined: Self = StObject.set(x, "_minTime", js.undefined)
    }
  }
  
  type Plugin[E] = js.Function1[/* fp */ Instance & E, Options]
}
