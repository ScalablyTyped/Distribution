package typings.flatpickr

import typings.flatpickr.anon.PartialCustomLocale
import typings.flatpickr.distTypesGlobalsMod.global.Date
import typings.flatpickr.distTypesGlobalsMod.global.HTMLElement
import typings.flatpickr.distTypesInstanceMod.Instance
import typings.flatpickr.distTypesLocaleMod.CustomLocale
import typings.flatpickr.distTypesLocaleMod.Locale
import typings.flatpickr.distTypesLocaleMod.key
import typings.flatpickr.flatpickrStrings.`above center`
import typings.flatpickr.flatpickrStrings.`above left`
import typings.flatpickr.flatpickrStrings.`above right`
import typings.flatpickr.flatpickrStrings.`auto center`
import typings.flatpickr.flatpickrStrings.`auto left`
import typings.flatpickr.flatpickrStrings.`auto right`
import typings.flatpickr.flatpickrStrings.`below center`
import typings.flatpickr.flatpickrStrings.`below left`
import typings.flatpickr.flatpickrStrings.`below right`
import typings.flatpickr.flatpickrStrings.above
import typings.flatpickr.flatpickrStrings.auto
import typings.flatpickr.flatpickrStrings.below
import typings.flatpickr.flatpickrStrings.dropdown
import typings.flatpickr.flatpickrStrings.multiple
import typings.flatpickr.flatpickrStrings.range
import typings.flatpickr.flatpickrStrings.single
import typings.flatpickr.flatpickrStrings.static
import typings.flatpickr.flatpickrStrings.time
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOptionsMod {
  
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
    
    def errorHandler(e: js.Error): Unit
    
    def formatDate(date: Date, format: String, locale: Locale): String
    
    def getWeek(date: Date): String | Double
    
    var hourIncrement: Double
    
    var ignoredFocusElements: js.Array[HTMLElement]
    
    var `inline`: Boolean
    
    var locale: key | PartialCustomLocale
    
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
    
    var position: auto | above | below | (`auto left`) | (`auto center`) | (`auto right`) | (`above left`) | (`above center`) | (`above right`) | (`below left`) | (`below center`) | (`below right`) | (js.Function2[/* self */ Instance, /* customElement */ js.UndefOr[HTMLElement], Unit])
    
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
    
    inline def apply(
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
      errorHandler: js.Error => Unit,
      formatDate: (Date, String, Locale) => String,
      getWeek: Date => String | Double,
      hourIncrement: Double,
      ignoredFocusElements: js.Array[HTMLElement],
      `inline`: Boolean,
      locale: key | PartialCustomLocale,
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
      position: auto | above | below | (`auto left`) | (`auto center`) | (`auto right`) | (`above left`) | (`above center`) | (`above right`) | (`below left`) | (`below center`) | (`below right`) | (js.Function2[/* self */ Instance, /* customElement */ js.UndefOr[HTMLElement], Unit]),
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
    
    extension [Self <: BaseOptions](x: Self) {
      
      inline def setAllowInput(value: Boolean): Self = StObject.set(x, "allowInput", value.asInstanceOf[js.Any])
      
      inline def setAllowInvalidPreload(value: Boolean): Self = StObject.set(x, "allowInvalidPreload", value.asInstanceOf[js.Any])
      
      inline def setAltFormat(value: String): Self = StObject.set(x, "altFormat", value.asInstanceOf[js.Any])
      
      inline def setAltInput(value: Boolean): Self = StObject.set(x, "altInput", value.asInstanceOf[js.Any])
      
      inline def setAltInputClass(value: String): Self = StObject.set(x, "altInputClass", value.asInstanceOf[js.Any])
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAppendTo(value: HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAriaDateFormat(value: String): Self = StObject.set(x, "ariaDateFormat", value.asInstanceOf[js.Any])
      
      inline def setAutoFillDefaultTime(value: Boolean): Self = StObject.set(x, "autoFillDefaultTime", value.asInstanceOf[js.Any])
      
      inline def setClickOpens(value: Boolean): Self = StObject.set(x, "clickOpens", value.asInstanceOf[js.Any])
      
      inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setConjunction(value: String): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDefaultDate(value: DateOption | js.Array[DateOption]): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultDateVarargs(value: DateOption*): Self = StObject.set(x, "defaultDate", js.Array(value*))
      
      inline def setDefaultHour(value: Double): Self = StObject.set(x, "defaultHour", value.asInstanceOf[js.Any])
      
      inline def setDefaultMinute(value: Double): Self = StObject.set(x, "defaultMinute", value.asInstanceOf[js.Any])
      
      inline def setDefaultSeconds(value: Double): Self = StObject.set(x, "defaultSeconds", value.asInstanceOf[js.Any])
      
      inline def setDisable(value: js.Array[DateLimit[DateOption]]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableMobile(value: Boolean): Self = StObject.set(x, "disableMobile", value.asInstanceOf[js.Any])
      
      inline def setDisableVarargs(value: DateLimit[DateOption]*): Self = StObject.set(x, "disable", js.Array(value*))
      
      inline def setEnable(value: js.Array[DateLimit[DateOption]]): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableSeconds(value: Boolean): Self = StObject.set(x, "enableSeconds", value.asInstanceOf[js.Any])
      
      inline def setEnableTime(value: Boolean): Self = StObject.set(x, "enableTime", value.asInstanceOf[js.Any])
      
      inline def setEnableVarargs(value: DateLimit[DateOption]*): Self = StObject.set(x, "enable", js.Array(value*))
      
      inline def setErrorHandler(value: js.Error => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      inline def setFormatDate(value: (Date, String, Locale) => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction3(value))
      
      inline def setGetWeek(value: Date => String | Double): Self = StObject.set(x, "getWeek", js.Any.fromFunction1(value))
      
      inline def setHourIncrement(value: Double): Self = StObject.set(x, "hourIncrement", value.asInstanceOf[js.Any])
      
      inline def setIgnoredFocusElements(value: js.Array[HTMLElement]): Self = StObject.set(x, "ignoredFocusElements", value.asInstanceOf[js.Any])
      
      inline def setIgnoredFocusElementsVarargs(value: HTMLElement*): Self = StObject.set(x, "ignoredFocusElements", js.Array(value*))
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: key | PartialCustomLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMaxDate(value: DateOption): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxTime(value: DateOption): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMinDate(value: DateOption): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinTime(value: DateOption): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinuteIncrement(value: Double): Self = StObject.set(x, "minuteIncrement", value.asInstanceOf[js.Any])
      
      inline def setMode(value: single | multiple | range | time): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMonthSelectorType(value: dropdown | static): Self = StObject.set(x, "monthSelectorType", value.asInstanceOf[js.Any])
      
      inline def setNextArrow(value: String): Self = StObject.set(x, "nextArrow", value.asInstanceOf[js.Any])
      
      inline def setNoCalendar(value: Boolean): Self = StObject.set(x, "noCalendar", value.asInstanceOf[js.Any])
      
      inline def setNow(value: DateOption): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setOnChange(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
      
      inline def setOnChangeVarargs(value: Hook*): Self = StObject.set(x, "onChange", js.Array(value*))
      
      inline def setOnClose(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      inline def setOnCloseFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onClose", js.Any.fromFunction4(value))
      
      inline def setOnCloseVarargs(value: Hook*): Self = StObject.set(x, "onClose", js.Array(value*))
      
      inline def setOnDayCreate(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onDayCreate", value.asInstanceOf[js.Any])
      
      inline def setOnDayCreateFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onDayCreate", js.Any.fromFunction4(value))
      
      inline def setOnDayCreateVarargs(value: Hook*): Self = StObject.set(x, "onDayCreate", js.Array(value*))
      
      inline def setOnDestroy(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onDestroy", value.asInstanceOf[js.Any])
      
      inline def setOnDestroyFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onDestroy", js.Any.fromFunction4(value))
      
      inline def setOnDestroyVarargs(value: Hook*): Self = StObject.set(x, "onDestroy", js.Array(value*))
      
      inline def setOnKeyDown(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      inline def setOnKeyDownFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction4(value))
      
      inline def setOnKeyDownVarargs(value: Hook*): Self = StObject.set(x, "onKeyDown", js.Array(value*))
      
      inline def setOnMonthChange(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onMonthChange", value.asInstanceOf[js.Any])
      
      inline def setOnMonthChangeFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction4(value))
      
      inline def setOnMonthChangeVarargs(value: Hook*): Self = StObject.set(x, "onMonthChange", js.Array(value*))
      
      inline def setOnOpen(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
      
      inline def setOnOpenFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onOpen", js.Any.fromFunction4(value))
      
      inline def setOnOpenVarargs(value: Hook*): Self = StObject.set(x, "onOpen", js.Array(value*))
      
      inline def setOnParseConfig(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onParseConfig", value.asInstanceOf[js.Any])
      
      inline def setOnParseConfigFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onParseConfig", js.Any.fromFunction4(value))
      
      inline def setOnParseConfigVarargs(value: Hook*): Self = StObject.set(x, "onParseConfig", js.Array(value*))
      
      inline def setOnPreCalendarPosition(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onPreCalendarPosition", value.asInstanceOf[js.Any])
      
      inline def setOnPreCalendarPositionFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onPreCalendarPosition", js.Any.fromFunction4(value))
      
      inline def setOnPreCalendarPositionVarargs(value: Hook*): Self = StObject.set(x, "onPreCalendarPosition", js.Array(value*))
      
      inline def setOnReady(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
      
      inline def setOnReadyFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onReady", js.Any.fromFunction4(value))
      
      inline def setOnReadyVarargs(value: Hook*): Self = StObject.set(x, "onReady", js.Array(value*))
      
      inline def setOnValueUpdate(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onValueUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnValueUpdateFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onValueUpdate", js.Any.fromFunction4(value))
      
      inline def setOnValueUpdateVarargs(value: Hook*): Self = StObject.set(x, "onValueUpdate", js.Array(value*))
      
      inline def setOnYearChange(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onYearChange", value.asInstanceOf[js.Any])
      
      inline def setOnYearChangeFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onYearChange", js.Any.fromFunction4(value))
      
      inline def setOnYearChangeVarargs(value: Hook*): Self = StObject.set(x, "onYearChange", js.Array(value*))
      
      inline def setParseDate(value: (String, String) => Date): Self = StObject.set(x, "parseDate", js.Any.fromFunction2(value))
      
      inline def setPlugins(value: js.Array[Plugin[js.Object]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: Plugin[js.Object]*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPosition(
        value: auto | above | below | (`auto left`) | (`auto center`) | (`auto right`) | (`above left`) | (`above center`) | (`above right`) | (`below left`) | (`below center`) | (`below right`) | (js.Function2[/* self */ Instance, /* customElement */ js.UndefOr[HTMLElement], Unit])
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionElement(value: Element): Self = StObject.set(x, "positionElement", value.asInstanceOf[js.Any])
      
      inline def setPositionFunction2(value: (/* self */ Instance, /* customElement */ js.UndefOr[HTMLElement]) => Unit): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
      
      inline def setPrevArrow(value: String): Self = StObject.set(x, "prevArrow", value.asInstanceOf[js.Any])
      
      inline def setShorthandCurrentMonth(value: Boolean): Self = StObject.set(x, "shorthandCurrentMonth", value.asInstanceOf[js.Any])
      
      inline def setShowMonths(value: Double): Self = StObject.set(x, "showMonths", value.asInstanceOf[js.Any])
      
      inline def setShowMonthsUndefined: Self = StObject.set(x, "showMonths", js.undefined)
      
      inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setTime_24hr(value: Boolean): Self = StObject.set(x, "time_24hr", value.asInstanceOf[js.Any])
      
      inline def setWeekNumbers(value: Boolean): Self = StObject.set(x, "weekNumbers", value.asInstanceOf[js.Any])
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    }
  }
  
  type DateLimit[D] = D | DateRangeLimit[D] | (js.Function1[/* date */ Date, Boolean])
  
  type DateOption = Date | String | Double
  
  trait DateRangeLimit[D] extends StObject {
    
    var from: D
    
    var to: D
  }
  object DateRangeLimit {
    
    inline def apply[D](from: D, to: D): DateRangeLimit[D] = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateRangeLimit[D]]
    }
    
    extension [Self <: DateRangeLimit[?], D](x: Self & DateRangeLimit[D]) {
      
      inline def setFrom(value: D): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: D): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  type Hook = js.Function4[
    /* dates */ js.Array[Date], 
    /* currentDateString */ String, 
    /* self */ Instance, 
    /* data */ js.UndefOr[Any], 
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
    
    inline def onChange: typings.flatpickr.flatpickrStrings.onChange = "onChange".asInstanceOf[typings.flatpickr.flatpickrStrings.onChange]
    
    inline def onClose: typings.flatpickr.flatpickrStrings.onClose = "onClose".asInstanceOf[typings.flatpickr.flatpickrStrings.onClose]
    
    inline def onDayCreate: typings.flatpickr.flatpickrStrings.onDayCreate = "onDayCreate".asInstanceOf[typings.flatpickr.flatpickrStrings.onDayCreate]
    
    inline def onDestroy: typings.flatpickr.flatpickrStrings.onDestroy = "onDestroy".asInstanceOf[typings.flatpickr.flatpickrStrings.onDestroy]
    
    inline def onKeyDown: typings.flatpickr.flatpickrStrings.onKeyDown = "onKeyDown".asInstanceOf[typings.flatpickr.flatpickrStrings.onKeyDown]
    
    inline def onMonthChange: typings.flatpickr.flatpickrStrings.onMonthChange = "onMonthChange".asInstanceOf[typings.flatpickr.flatpickrStrings.onMonthChange]
    
    inline def onOpen: typings.flatpickr.flatpickrStrings.onOpen = "onOpen".asInstanceOf[typings.flatpickr.flatpickrStrings.onOpen]
    
    inline def onParseConfig: typings.flatpickr.flatpickrStrings.onParseConfig = "onParseConfig".asInstanceOf[typings.flatpickr.flatpickrStrings.onParseConfig]
    
    inline def onPreCalendarPosition: typings.flatpickr.flatpickrStrings.onPreCalendarPosition = "onPreCalendarPosition".asInstanceOf[typings.flatpickr.flatpickrStrings.onPreCalendarPosition]
    
    inline def onReady: typings.flatpickr.flatpickrStrings.onReady = "onReady".asInstanceOf[typings.flatpickr.flatpickrStrings.onReady]
    
    inline def onValueUpdate: typings.flatpickr.flatpickrStrings.onValueUpdate = "onValueUpdate".asInstanceOf[typings.flatpickr.flatpickrStrings.onValueUpdate]
    
    inline def onYearChange: typings.flatpickr.flatpickrStrings.onYearChange = "onYearChange".asInstanceOf[typings.flatpickr.flatpickrStrings.onYearChange]
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
    
    var errorHandler: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.undefined
    
    var formatDate: js.UndefOr[js.Function3[/* date */ Date, /* format */ String, /* locale */ Locale, String]] = js.undefined
    
    var getWeek: js.UndefOr[js.Function1[/* date */ Date, String | Double]] = js.undefined
    
    var hourIncrement: js.UndefOr[Double] = js.undefined
    
    var ignoredFocusElements: js.UndefOr[js.Array[HTMLElement]] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[key | PartialCustomLocale] = js.undefined
    
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
    
    var position: js.UndefOr[
        auto | above | below | (`auto left`) | (`auto center`) | (`auto right`) | (`above left`) | (`above center`) | (`above right`) | (`below left`) | (`below center`) | (`below right`) | (js.Function2[/* self */ Instance, /* customElement */ js.UndefOr[HTMLElement], Unit])
      ] = js.undefined
    
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowInput(value: Boolean): Self = StObject.set(x, "allowInput", value.asInstanceOf[js.Any])
      
      inline def setAllowInputUndefined: Self = StObject.set(x, "allowInput", js.undefined)
      
      inline def setAllowInvalidPreload(value: Boolean): Self = StObject.set(x, "allowInvalidPreload", value.asInstanceOf[js.Any])
      
      inline def setAllowInvalidPreloadUndefined: Self = StObject.set(x, "allowInvalidPreload", js.undefined)
      
      inline def setAltFormat(value: String): Self = StObject.set(x, "altFormat", value.asInstanceOf[js.Any])
      
      inline def setAltFormatUndefined: Self = StObject.set(x, "altFormat", js.undefined)
      
      inline def setAltInput(value: Boolean): Self = StObject.set(x, "altInput", value.asInstanceOf[js.Any])
      
      inline def setAltInputClass(value: String): Self = StObject.set(x, "altInputClass", value.asInstanceOf[js.Any])
      
      inline def setAltInputClassUndefined: Self = StObject.set(x, "altInputClass", js.undefined)
      
      inline def setAltInputUndefined: Self = StObject.set(x, "altInput", js.undefined)
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAppendTo(value: HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAriaDateFormat(value: String): Self = StObject.set(x, "ariaDateFormat", value.asInstanceOf[js.Any])
      
      inline def setAriaDateFormatUndefined: Self = StObject.set(x, "ariaDateFormat", js.undefined)
      
      inline def setAutoFillDefaultTime(value: Boolean): Self = StObject.set(x, "autoFillDefaultTime", value.asInstanceOf[js.Any])
      
      inline def setAutoFillDefaultTimeUndefined: Self = StObject.set(x, "autoFillDefaultTime", js.undefined)
      
      inline def setClickOpens(value: Boolean): Self = StObject.set(x, "clickOpens", value.asInstanceOf[js.Any])
      
      inline def setClickOpensUndefined: Self = StObject.set(x, "clickOpens", js.undefined)
      
      inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
      
      inline def setConjunction(value: String): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
      
      inline def setConjunctionUndefined: Self = StObject.set(x, "conjunction", js.undefined)
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDefaultDate(value: DateOption | js.Array[DateOption]): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      inline def setDefaultDateVarargs(value: DateOption*): Self = StObject.set(x, "defaultDate", js.Array(value*))
      
      inline def setDefaultHour(value: Double): Self = StObject.set(x, "defaultHour", value.asInstanceOf[js.Any])
      
      inline def setDefaultHourUndefined: Self = StObject.set(x, "defaultHour", js.undefined)
      
      inline def setDefaultMinute(value: Double): Self = StObject.set(x, "defaultMinute", value.asInstanceOf[js.Any])
      
      inline def setDefaultMinuteUndefined: Self = StObject.set(x, "defaultMinute", js.undefined)
      
      inline def setDefaultSeconds(value: Double): Self = StObject.set(x, "defaultSeconds", value.asInstanceOf[js.Any])
      
      inline def setDefaultSecondsUndefined: Self = StObject.set(x, "defaultSeconds", js.undefined)
      
      inline def setDisable(value: js.Array[DateLimit[DateOption]]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableMobile(value: Boolean): Self = StObject.set(x, "disableMobile", value.asInstanceOf[js.Any])
      
      inline def setDisableMobileUndefined: Self = StObject.set(x, "disableMobile", js.undefined)
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setDisableVarargs(value: DateLimit[DateOption]*): Self = StObject.set(x, "disable", js.Array(value*))
      
      inline def setEnable(value: js.Array[DateLimit[DateOption]]): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableSeconds(value: Boolean): Self = StObject.set(x, "enableSeconds", value.asInstanceOf[js.Any])
      
      inline def setEnableSecondsUndefined: Self = StObject.set(x, "enableSeconds", js.undefined)
      
      inline def setEnableTime(value: Boolean): Self = StObject.set(x, "enableTime", value.asInstanceOf[js.Any])
      
      inline def setEnableTimeUndefined: Self = StObject.set(x, "enableTime", js.undefined)
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setEnableVarargs(value: DateLimit[DateOption]*): Self = StObject.set(x, "enable", js.Array(value*))
      
      inline def setErrorHandler(value: /* e */ js.Error => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setFormatDate(value: (/* date */ Date, /* format */ String, /* locale */ Locale) => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction3(value))
      
      inline def setFormatDateUndefined: Self = StObject.set(x, "formatDate", js.undefined)
      
      inline def setGetWeek(value: /* date */ Date => String | Double): Self = StObject.set(x, "getWeek", js.Any.fromFunction1(value))
      
      inline def setGetWeekUndefined: Self = StObject.set(x, "getWeek", js.undefined)
      
      inline def setHourIncrement(value: Double): Self = StObject.set(x, "hourIncrement", value.asInstanceOf[js.Any])
      
      inline def setHourIncrementUndefined: Self = StObject.set(x, "hourIncrement", js.undefined)
      
      inline def setIgnoredFocusElements(value: js.Array[HTMLElement]): Self = StObject.set(x, "ignoredFocusElements", value.asInstanceOf[js.Any])
      
      inline def setIgnoredFocusElementsUndefined: Self = StObject.set(x, "ignoredFocusElements", js.undefined)
      
      inline def setIgnoredFocusElementsVarargs(value: HTMLElement*): Self = StObject.set(x, "ignoredFocusElements", js.Array(value*))
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setLocale(value: key | PartialCustomLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: DateOption): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxTime(value: DateOption): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinDate(value: DateOption): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinTime(value: DateOption): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setMinuteIncrement(value: Double): Self = StObject.set(x, "minuteIncrement", value.asInstanceOf[js.Any])
      
      inline def setMinuteIncrementUndefined: Self = StObject.set(x, "minuteIncrement", js.undefined)
      
      inline def setMode(value: single | multiple | range | time): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMonthSelectorType(value: dropdown | static): Self = StObject.set(x, "monthSelectorType", value.asInstanceOf[js.Any])
      
      inline def setMonthSelectorTypeUndefined: Self = StObject.set(x, "monthSelectorType", js.undefined)
      
      inline def setNextArrow(value: String): Self = StObject.set(x, "nextArrow", value.asInstanceOf[js.Any])
      
      inline def setNextArrowUndefined: Self = StObject.set(x, "nextArrow", js.undefined)
      
      inline def setNoCalendar(value: Boolean): Self = StObject.set(x, "noCalendar", value.asInstanceOf[js.Any])
      
      inline def setNoCalendarUndefined: Self = StObject.set(x, "noCalendar", js.undefined)
      
      inline def setNow(value: DateOption): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setOnChange(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnChangeVarargs(value: Hook*): Self = StObject.set(x, "onChange", js.Array(value*))
      
      inline def setOnClose(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      inline def setOnCloseFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onClose", js.Any.fromFunction4(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnCloseVarargs(value: Hook*): Self = StObject.set(x, "onClose", js.Array(value*))
      
      inline def setOnDayCreate(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onDayCreate", value.asInstanceOf[js.Any])
      
      inline def setOnDayCreateFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onDayCreate", js.Any.fromFunction4(value))
      
      inline def setOnDayCreateUndefined: Self = StObject.set(x, "onDayCreate", js.undefined)
      
      inline def setOnDayCreateVarargs(value: Hook*): Self = StObject.set(x, "onDayCreate", js.Array(value*))
      
      inline def setOnDestroy(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onDestroy", value.asInstanceOf[js.Any])
      
      inline def setOnDestroyFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onDestroy", js.Any.fromFunction4(value))
      
      inline def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
      
      inline def setOnDestroyVarargs(value: Hook*): Self = StObject.set(x, "onDestroy", js.Array(value*))
      
      inline def setOnKeyDown(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      inline def setOnKeyDownFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction4(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyDownVarargs(value: Hook*): Self = StObject.set(x, "onKeyDown", js.Array(value*))
      
      inline def setOnMonthChange(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onMonthChange", value.asInstanceOf[js.Any])
      
      inline def setOnMonthChangeFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction4(value))
      
      inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      inline def setOnMonthChangeVarargs(value: Hook*): Self = StObject.set(x, "onMonthChange", js.Array(value*))
      
      inline def setOnOpen(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
      
      inline def setOnOpenFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onOpen", js.Any.fromFunction4(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnOpenVarargs(value: Hook*): Self = StObject.set(x, "onOpen", js.Array(value*))
      
      inline def setOnParseConfig(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onParseConfig", value.asInstanceOf[js.Any])
      
      inline def setOnParseConfigFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onParseConfig", js.Any.fromFunction4(value))
      
      inline def setOnParseConfigUndefined: Self = StObject.set(x, "onParseConfig", js.undefined)
      
      inline def setOnParseConfigVarargs(value: Hook*): Self = StObject.set(x, "onParseConfig", js.Array(value*))
      
      inline def setOnPreCalendarPosition(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onPreCalendarPosition", value.asInstanceOf[js.Any])
      
      inline def setOnPreCalendarPositionFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onPreCalendarPosition", js.Any.fromFunction4(value))
      
      inline def setOnPreCalendarPositionUndefined: Self = StObject.set(x, "onPreCalendarPosition", js.undefined)
      
      inline def setOnPreCalendarPositionVarargs(value: Hook*): Self = StObject.set(x, "onPreCalendarPosition", js.Array(value*))
      
      inline def setOnReady(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
      
      inline def setOnReadyFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onReady", js.Any.fromFunction4(value))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOnReadyVarargs(value: Hook*): Self = StObject.set(x, "onReady", js.Array(value*))
      
      inline def setOnValueUpdate(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onValueUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnValueUpdateFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onValueUpdate", js.Any.fromFunction4(value))
      
      inline def setOnValueUpdateUndefined: Self = StObject.set(x, "onValueUpdate", js.undefined)
      
      inline def setOnValueUpdateVarargs(value: Hook*): Self = StObject.set(x, "onValueUpdate", js.Array(value*))
      
      inline def setOnYearChange(value: Hook | js.Array[Hook]): Self = StObject.set(x, "onYearChange", value.asInstanceOf[js.Any])
      
      inline def setOnYearChangeFunction4(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onYearChange", js.Any.fromFunction4(value))
      
      inline def setOnYearChangeUndefined: Self = StObject.set(x, "onYearChange", js.undefined)
      
      inline def setOnYearChangeVarargs(value: Hook*): Self = StObject.set(x, "onYearChange", js.Array(value*))
      
      inline def setParseDate(value: (/* date */ String, /* format */ String) => Date): Self = StObject.set(x, "parseDate", js.Any.fromFunction2(value))
      
      inline def setParseDateUndefined: Self = StObject.set(x, "parseDate", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin[js.Object]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Plugin[js.Object]*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPosition(
        value: auto | above | below | (`auto left`) | (`auto center`) | (`auto right`) | (`above left`) | (`above center`) | (`above right`) | (`below left`) | (`below center`) | (`below right`) | (js.Function2[/* self */ Instance, /* customElement */ js.UndefOr[HTMLElement], Unit])
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionElement(value: Element): Self = StObject.set(x, "positionElement", value.asInstanceOf[js.Any])
      
      inline def setPositionElementUndefined: Self = StObject.set(x, "positionElement", js.undefined)
      
      inline def setPositionFunction2(value: (/* self */ Instance, /* customElement */ js.UndefOr[HTMLElement]) => Unit): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPrevArrow(value: String): Self = StObject.set(x, "prevArrow", value.asInstanceOf[js.Any])
      
      inline def setPrevArrowUndefined: Self = StObject.set(x, "prevArrow", js.undefined)
      
      inline def setShorthandCurrentMonth(value: Boolean): Self = StObject.set(x, "shorthandCurrentMonth", value.asInstanceOf[js.Any])
      
      inline def setShorthandCurrentMonthUndefined: Self = StObject.set(x, "shorthandCurrentMonth", js.undefined)
      
      inline def setShowMonths(value: Double): Self = StObject.set(x, "showMonths", value.asInstanceOf[js.Any])
      
      inline def setShowMonthsUndefined: Self = StObject.set(x, "showMonths", js.undefined)
      
      inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
      
      inline def setTime_24hr(value: Boolean): Self = StObject.set(x, "time_24hr", value.asInstanceOf[js.Any])
      
      inline def setTime_24hrUndefined: Self = StObject.set(x, "time_24hr", js.undefined)
      
      inline def setWeekNumbers(value: Boolean): Self = StObject.set(x, "weekNumbers", value.asInstanceOf[js.Any])
      
      inline def setWeekNumbersUndefined: Self = StObject.set(x, "weekNumbers", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait ParsedOptions extends StObject {
    
    var _disable: js.Array[DateLimit[Date]]
    
    var _enable: js.UndefOr[js.Array[DateLimit[Date]]] = js.undefined
    
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
    
    var enable: js.UndefOr[js.Array[DateLimit[Date]]] = js.undefined
    
    var enableSeconds: Boolean
    
    var enableTime: Boolean
    
    def errorHandler(err: js.Error): Unit
    
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
    
    var position: auto | above | below | (`auto left`) | (`auto center`) | (`auto right`) | (`above left`) | (`above center`) | (`above right`) | (`below left`) | (`below center`) | (`below right`) | (js.Function2[/* self */ Instance, /* customElement */ js.UndefOr[HTMLElement], Unit])
    
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
    
    inline def apply(
      _disable: js.Array[DateLimit[Date]],
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
      enableSeconds: Boolean,
      enableTime: Boolean,
      errorHandler: js.Error => Unit,
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
      position: auto | above | below | (`auto left`) | (`auto center`) | (`auto right`) | (`above left`) | (`above center`) | (`above right`) | (`below left`) | (`below center`) | (`below right`) | (js.Function2[/* self */ Instance, /* customElement */ js.UndefOr[HTMLElement], Unit]),
      prevArrow: String,
      shorthandCurrentMonth: Boolean,
      showMonths: Double,
      static: Boolean,
      time_24hr: Boolean,
      weekNumbers: Boolean,
      wrap: Boolean
    ): ParsedOptions = {
      val __obj = js.Dynamic.literal(_disable = _disable.asInstanceOf[js.Any], allowInput = allowInput.asInstanceOf[js.Any], allowInvalidPreload = allowInvalidPreload.asInstanceOf[js.Any], altFormat = altFormat.asInstanceOf[js.Any], altInput = altInput.asInstanceOf[js.Any], altInputClass = altInputClass.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], ariaDateFormat = ariaDateFormat.asInstanceOf[js.Any], autoFillDefaultTime = autoFillDefaultTime.asInstanceOf[js.Any], clickOpens = clickOpens.asInstanceOf[js.Any], closeOnSelect = closeOnSelect.asInstanceOf[js.Any], conjunction = conjunction.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], defaultHour = defaultHour.asInstanceOf[js.Any], defaultMinute = defaultMinute.asInstanceOf[js.Any], defaultSeconds = defaultSeconds.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], disableMobile = disableMobile.asInstanceOf[js.Any], enableSeconds = enableSeconds.asInstanceOf[js.Any], enableTime = enableTime.asInstanceOf[js.Any], errorHandler = js.Any.fromFunction1(errorHandler), getWeek = js.Any.fromFunction1(getWeek), hourIncrement = hourIncrement.asInstanceOf[js.Any], ignoredFocusElements = ignoredFocusElements.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minuteIncrement = minuteIncrement.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], monthSelectorType = monthSelectorType.asInstanceOf[js.Any], nextArrow = nextArrow.asInstanceOf[js.Any], noCalendar = noCalendar.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any], onDayCreate = onDayCreate.asInstanceOf[js.Any], onDestroy = onDestroy.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onMonthChange = onMonthChange.asInstanceOf[js.Any], onOpen = onOpen.asInstanceOf[js.Any], onParseConfig = onParseConfig.asInstanceOf[js.Any], onPreCalendarPosition = onPreCalendarPosition.asInstanceOf[js.Any], onReady = onReady.asInstanceOf[js.Any], onValueUpdate = onValueUpdate.asInstanceOf[js.Any], onYearChange = onYearChange.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], prevArrow = prevArrow.asInstanceOf[js.Any], shorthandCurrentMonth = shorthandCurrentMonth.asInstanceOf[js.Any], showMonths = showMonths.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], time_24hr = time_24hr.asInstanceOf[js.Any], weekNumbers = weekNumbers.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedOptions]
    }
    
    extension [Self <: ParsedOptions](x: Self) {
      
      inline def setAllowInput(value: Boolean): Self = StObject.set(x, "allowInput", value.asInstanceOf[js.Any])
      
      inline def setAllowInvalidPreload(value: Boolean): Self = StObject.set(x, "allowInvalidPreload", value.asInstanceOf[js.Any])
      
      inline def setAltFormat(value: String): Self = StObject.set(x, "altFormat", value.asInstanceOf[js.Any])
      
      inline def setAltInput(value: Boolean): Self = StObject.set(x, "altInput", value.asInstanceOf[js.Any])
      
      inline def setAltInputClass(value: String): Self = StObject.set(x, "altInputClass", value.asInstanceOf[js.Any])
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAppendTo(value: HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAriaDateFormat(value: String): Self = StObject.set(x, "ariaDateFormat", value.asInstanceOf[js.Any])
      
      inline def setAutoFillDefaultTime(value: Boolean): Self = StObject.set(x, "autoFillDefaultTime", value.asInstanceOf[js.Any])
      
      inline def setClickOpens(value: Boolean): Self = StObject.set(x, "clickOpens", value.asInstanceOf[js.Any])
      
      inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setConjunction(value: String): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDefaultDate(value: Date | js.Array[Date]): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      inline def setDefaultDateVarargs(value: Date*): Self = StObject.set(x, "defaultDate", js.Array(value*))
      
      inline def setDefaultHour(value: Double): Self = StObject.set(x, "defaultHour", value.asInstanceOf[js.Any])
      
      inline def setDefaultMinute(value: Double): Self = StObject.set(x, "defaultMinute", value.asInstanceOf[js.Any])
      
      inline def setDefaultSeconds(value: Double): Self = StObject.set(x, "defaultSeconds", value.asInstanceOf[js.Any])
      
      inline def setDisable(value: js.Array[DateLimit[Date]]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableMobile(value: Boolean): Self = StObject.set(x, "disableMobile", value.asInstanceOf[js.Any])
      
      inline def setDisableVarargs(value: DateLimit[Date]*): Self = StObject.set(x, "disable", js.Array(value*))
      
      inline def setEnable(value: js.Array[DateLimit[Date]]): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableSeconds(value: Boolean): Self = StObject.set(x, "enableSeconds", value.asInstanceOf[js.Any])
      
      inline def setEnableTime(value: Boolean): Self = StObject.set(x, "enableTime", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setEnableVarargs(value: DateLimit[Date]*): Self = StObject.set(x, "enable", js.Array(value*))
      
      inline def setErrorHandler(value: js.Error => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      inline def setFormatDate(value: (/* date */ Date, /* format */ String, /* locale */ Locale) => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction3(value))
      
      inline def setFormatDateUndefined: Self = StObject.set(x, "formatDate", js.undefined)
      
      inline def setGetWeek(value: Date => String | Double): Self = StObject.set(x, "getWeek", js.Any.fromFunction1(value))
      
      inline def setHourIncrement(value: Double): Self = StObject.set(x, "hourIncrement", value.asInstanceOf[js.Any])
      
      inline def setIgnoredFocusElements(value: js.Array[HTMLElement]): Self = StObject.set(x, "ignoredFocusElements", value.asInstanceOf[js.Any])
      
      inline def setIgnoredFocusElementsVarargs(value: HTMLElement*): Self = StObject.set(x, "ignoredFocusElements", js.Array(value*))
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: key | CustomLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxTime(value: Date): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinTime(value: Date): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setMinuteIncrement(value: Double): Self = StObject.set(x, "minuteIncrement", value.asInstanceOf[js.Any])
      
      inline def setMode(value: single | multiple | range | time): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMonthSelectorType(value: String): Self = StObject.set(x, "monthSelectorType", value.asInstanceOf[js.Any])
      
      inline def setNextArrow(value: String): Self = StObject.set(x, "nextArrow", value.asInstanceOf[js.Any])
      
      inline def setNoCalendar(value: Boolean): Self = StObject.set(x, "noCalendar", value.asInstanceOf[js.Any])
      
      inline def setNow(value: Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: js.Array[Hook]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeVarargs(value: Hook*): Self = StObject.set(x, "onChange", js.Array(value*))
      
      inline def setOnClose(value: js.Array[Hook]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      inline def setOnCloseVarargs(value: Hook*): Self = StObject.set(x, "onClose", js.Array(value*))
      
      inline def setOnDayCreate(value: js.Array[Hook]): Self = StObject.set(x, "onDayCreate", value.asInstanceOf[js.Any])
      
      inline def setOnDayCreateVarargs(value: Hook*): Self = StObject.set(x, "onDayCreate", js.Array(value*))
      
      inline def setOnDestroy(value: js.Array[Hook]): Self = StObject.set(x, "onDestroy", value.asInstanceOf[js.Any])
      
      inline def setOnDestroyVarargs(value: Hook*): Self = StObject.set(x, "onDestroy", js.Array(value*))
      
      inline def setOnKeyDown(value: js.Array[Hook]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      inline def setOnKeyDownVarargs(value: Hook*): Self = StObject.set(x, "onKeyDown", js.Array(value*))
      
      inline def setOnMonthChange(value: js.Array[Hook]): Self = StObject.set(x, "onMonthChange", value.asInstanceOf[js.Any])
      
      inline def setOnMonthChangeVarargs(value: Hook*): Self = StObject.set(x, "onMonthChange", js.Array(value*))
      
      inline def setOnOpen(value: js.Array[Hook]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
      
      inline def setOnOpenVarargs(value: Hook*): Self = StObject.set(x, "onOpen", js.Array(value*))
      
      inline def setOnParseConfig(value: js.Array[Hook]): Self = StObject.set(x, "onParseConfig", value.asInstanceOf[js.Any])
      
      inline def setOnParseConfigVarargs(value: Hook*): Self = StObject.set(x, "onParseConfig", js.Array(value*))
      
      inline def setOnPreCalendarPosition(value: js.Array[Hook]): Self = StObject.set(x, "onPreCalendarPosition", value.asInstanceOf[js.Any])
      
      inline def setOnPreCalendarPositionVarargs(value: Hook*): Self = StObject.set(x, "onPreCalendarPosition", js.Array(value*))
      
      inline def setOnReady(value: js.Array[Hook]): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
      
      inline def setOnReadyVarargs(value: Hook*): Self = StObject.set(x, "onReady", js.Array(value*))
      
      inline def setOnValueUpdate(value: js.Array[Hook]): Self = StObject.set(x, "onValueUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnValueUpdateVarargs(value: Hook*): Self = StObject.set(x, "onValueUpdate", js.Array(value*))
      
      inline def setOnYearChange(value: js.Array[Hook]): Self = StObject.set(x, "onYearChange", value.asInstanceOf[js.Any])
      
      inline def setOnYearChangeVarargs(value: Hook*): Self = StObject.set(x, "onYearChange", js.Array(value*))
      
      inline def setParseDate(value: (/* date */ String, /* format */ String) => Date): Self = StObject.set(x, "parseDate", js.Any.fromFunction2(value))
      
      inline def setParseDateUndefined: Self = StObject.set(x, "parseDate", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin[js.Object]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: Plugin[js.Object]*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPosition(
        value: auto | above | below | (`auto left`) | (`auto center`) | (`auto right`) | (`above left`) | (`above center`) | (`above right`) | (`below left`) | (`below center`) | (`below right`) | (js.Function2[/* self */ Instance, /* customElement */ js.UndefOr[HTMLElement], Unit])
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionElement(value: HTMLElement): Self = StObject.set(x, "positionElement", value.asInstanceOf[js.Any])
      
      inline def setPositionElementUndefined: Self = StObject.set(x, "positionElement", js.undefined)
      
      inline def setPositionFunction2(value: (/* self */ Instance, /* customElement */ js.UndefOr[HTMLElement]) => Unit): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
      
      inline def setPrevArrow(value: String): Self = StObject.set(x, "prevArrow", value.asInstanceOf[js.Any])
      
      inline def setShorthandCurrentMonth(value: Boolean): Self = StObject.set(x, "shorthandCurrentMonth", value.asInstanceOf[js.Any])
      
      inline def setShowMonths(value: Double): Self = StObject.set(x, "showMonths", value.asInstanceOf[js.Any])
      
      inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setTime_24hr(value: Boolean): Self = StObject.set(x, "time_24hr", value.asInstanceOf[js.Any])
      
      inline def setWeekNumbers(value: Boolean): Self = StObject.set(x, "weekNumbers", value.asInstanceOf[js.Any])
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def set_disable(value: js.Array[DateLimit[Date]]): Self = StObject.set(x, "_disable", value.asInstanceOf[js.Any])
      
      inline def set_disableVarargs(value: DateLimit[Date]*): Self = StObject.set(x, "_disable", js.Array(value*))
      
      inline def set_enable(value: js.Array[DateLimit[Date]]): Self = StObject.set(x, "_enable", value.asInstanceOf[js.Any])
      
      inline def set_enableUndefined: Self = StObject.set(x, "_enable", js.undefined)
      
      inline def set_enableVarargs(value: DateLimit[Date]*): Self = StObject.set(x, "_enable", js.Array(value*))
      
      inline def set_maxDate(value: Date): Self = StObject.set(x, "_maxDate", value.asInstanceOf[js.Any])
      
      inline def set_maxDateUndefined: Self = StObject.set(x, "_maxDate", js.undefined)
      
      inline def set_maxTime(value: Date): Self = StObject.set(x, "_maxTime", value.asInstanceOf[js.Any])
      
      inline def set_maxTimeUndefined: Self = StObject.set(x, "_maxTime", js.undefined)
      
      inline def set_minDate(value: Date): Self = StObject.set(x, "_minDate", value.asInstanceOf[js.Any])
      
      inline def set_minDateUndefined: Self = StObject.set(x, "_minDate", js.undefined)
      
      inline def set_minTime(value: Date): Self = StObject.set(x, "_minTime", value.asInstanceOf[js.Any])
      
      inline def set_minTimeUndefined: Self = StObject.set(x, "_minTime", js.undefined)
    }
  }
  
  type Plugin[E] = js.Function1[/* fp */ Instance & E, Options]
}
