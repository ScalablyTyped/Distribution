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
import typings.flatpickr.optionsMod.DateLimit
import typings.flatpickr.optionsMod.DateOption
import typings.flatpickr.optionsMod.Hook
import typings.flatpickr.optionsMod.ParsedOptions
import typings.flatpickr.optionsMod.Plugin
import typings.std.Error
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Capture extends StObject {
    
    var capture: js.UndefOr[Boolean] = js.native
  }
  object Capture {
    
    @scala.inline
    def apply(): Capture = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Capture]
    }
    
    @scala.inline
    implicit class CaptureMutableBuilder[Self <: Capture] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    }
  }
  
  @js.native
  trait Config extends StObject {
    
    var config: js.UndefOr[ParsedOptions] = js.native
    
    var l10n: js.UndefOr[Locale] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: ParsedOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setL10n(value: Locale): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL10nUndefined: Self = StObject.set(x, "l10n", js.undefined)
    }
  }
  
  @js.native
  trait Element extends StObject {
    
    var element: typings.std.Element = js.native
    
    var event: String = js.native
    
    def handler(): Unit = js.native
    def handler(e: Event): Unit = js.native
    
    var options: js.UndefOr[Capture] = js.native
  }
  
  @js.native
  trait GetDaysInMonth extends StObject {
    
    def getDaysInMonth(): Double = js.native
    def getDaysInMonth(month: js.UndefOr[scala.Nothing], year: Double): Double = js.native
    def getDaysInMonth(month: Double): Double = js.native
    def getDaysInMonth(month: Double, year: Double): Double = js.native
  }
  
  @js.native
  trait Longhand extends StObject {
    
    var longhand: js.Tuple7[String, String, String, String, String, String, String] = js.native
    
    var shorthand: js.Tuple7[String, String, String, String, String, String, String] = js.native
  }
  object Longhand {
    
    @scala.inline
    def apply(
      longhand: js.Tuple7[String, String, String, String, String, String, String],
      shorthand: js.Tuple7[String, String, String, String, String, String, String]
    ): Longhand = {
      val __obj = js.Dynamic.literal(longhand = longhand.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any])
      __obj.asInstanceOf[Longhand]
    }
    
    @scala.inline
    implicit class LonghandMutableBuilder[Self <: Longhand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLonghand(value: js.Tuple7[String, String, String, String, String, String, String]): Self = StObject.set(x, "longhand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShorthand(value: js.Tuple7[String, String, String, String, String, String, String]): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<flatpickr.flatpickr/dist/plugins/monthSelect.Config> */
  @js.native
  trait PartialConfig extends StObject {
    
    var altFormat: js.UndefOr[String] = js.native
    
    var dateFormat: js.UndefOr[String] = js.native
    
    var shorthand: js.UndefOr[Boolean] = js.native
    
    var theme: js.UndefOr[String] = js.native
  }
  object PartialConfig {
    
    @scala.inline
    def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    @scala.inline
    implicit class PartialConfigMutableBuilder[Self <: PartialConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltFormat(value: String): Self = StObject.set(x, "altFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltFormatUndefined: Self = StObject.set(x, "altFormat", js.undefined)
      
      @scala.inline
      def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      @scala.inline
      def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShorthandUndefined: Self = StObject.set(x, "shorthand", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Inlined std.Partial<flatpickr.flatpickr/dist/types/options.ParsedOptions> */
  @js.native
  trait PartialParsedOptions extends StObject {
    
    var _disable: js.UndefOr[js.Array[DateLimit[Date]]] = js.native
    
    var _enable: js.UndefOr[js.Array[DateLimit[Date]]] = js.native
    
    var _maxDate: js.UndefOr[Date] = js.native
    
    var _maxTime: js.UndefOr[Date] = js.native
    
    var _minDate: js.UndefOr[Date] = js.native
    
    var _minTime: js.UndefOr[Date] = js.native
    
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
    
    var defaultDate: js.UndefOr[Date | js.Array[Date]] = js.native
    
    var defaultHour: js.UndefOr[Double] = js.native
    
    var defaultMinute: js.UndefOr[Double] = js.native
    
    var defaultSeconds: js.UndefOr[Double] = js.native
    
    var disable: js.UndefOr[js.Array[DateLimit[Date]]] = js.native
    
    var disableMobile: js.UndefOr[Boolean] = js.native
    
    var enable: js.UndefOr[js.Array[DateLimit[Date]]] = js.native
    
    var enableSeconds: js.UndefOr[Boolean] = js.native
    
    var enableTime: js.UndefOr[Boolean] = js.native
    
    var errorHandler: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
    
    var formatDate: js.UndefOr[js.Function3[/* date */ Date, /* format */ String, /* locale */ Locale, String]] = js.native
    
    var getWeek: js.UndefOr[js.Function1[/* date */ Date, String | Double]] = js.native
    
    var hourIncrement: js.UndefOr[Double] = js.native
    
    var ignoredFocusElements: js.UndefOr[js.Array[HTMLElement]] = js.native
    
    var `inline`: js.UndefOr[Boolean] = js.native
    
    var locale: js.UndefOr[key | CustomLocale] = js.native
    
    var maxDate: js.UndefOr[Date] = js.native
    
    var maxTime: js.UndefOr[Date] = js.native
    
    var minDate: js.UndefOr[Date] = js.native
    
    var minTime: js.UndefOr[Date] = js.native
    
    var minuteIncrement: js.UndefOr[Double] = js.native
    
    var mode: js.UndefOr[single | multiple | range | time] = js.native
    
    var monthSelectorType: js.UndefOr[String] = js.native
    
    var nextArrow: js.UndefOr[String] = js.native
    
    var noCalendar: js.UndefOr[Boolean] = js.native
    
    var now: js.UndefOr[Date] = js.native
    
    var onChange: js.UndefOr[js.Array[Hook]] = js.native
    
    var onClose: js.UndefOr[js.Array[Hook]] = js.native
    
    var onDayCreate: js.UndefOr[js.Array[Hook]] = js.native
    
    var onDestroy: js.UndefOr[js.Array[Hook]] = js.native
    
    var onKeyDown: js.UndefOr[js.Array[Hook]] = js.native
    
    var onMonthChange: js.UndefOr[js.Array[Hook]] = js.native
    
    var onOpen: js.UndefOr[js.Array[Hook]] = js.native
    
    var onParseConfig: js.UndefOr[js.Array[Hook]] = js.native
    
    var onPreCalendarPosition: js.UndefOr[js.Array[Hook]] = js.native
    
    var onReady: js.UndefOr[js.Array[Hook]] = js.native
    
    var onValueUpdate: js.UndefOr[js.Array[Hook]] = js.native
    
    var onYearChange: js.UndefOr[js.Array[Hook]] = js.native
    
    var parseDate: js.UndefOr[js.Function2[/* date */ String, /* format */ String, Date]] = js.native
    
    var plugins: js.UndefOr[js.Array[Plugin[js.Object]]] = js.native
    
    var position: js.UndefOr[auto | above | below] = js.native
    
    var positionElement: js.UndefOr[HTMLElement] = js.native
    
    var prevArrow: js.UndefOr[String] = js.native
    
    var shorthandCurrentMonth: js.UndefOr[Boolean] = js.native
    
    var showMonths: js.UndefOr[Double] = js.native
    
    var static: js.UndefOr[Boolean] = js.native
    
    var time_24hr: js.UndefOr[Boolean] = js.native
    
    var weekNumbers: js.UndefOr[Boolean] = js.native
    
    var wrap: js.UndefOr[Boolean] = js.native
  }
  object PartialParsedOptions {
    
    @scala.inline
    def apply(): PartialParsedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialParsedOptions]
    }
    
    @scala.inline
    implicit class PartialParsedOptionsMutableBuilder[Self <: PartialParsedOptions] (val x: Self) extends AnyVal {
      
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
      def setDefaultDate(value: Date | js.Array[Date]): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      @scala.inline
      def setDefaultDateVarargs(value: Date*): Self = StObject.set(x, "defaultDate", js.Array(value :_*))
      
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
      def setDisable(value: js.Array[DateLimit[Date]]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableMobile(value: Boolean): Self = StObject.set(x, "disableMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableMobileUndefined: Self = StObject.set(x, "disableMobile", js.undefined)
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setDisableVarargs(value: DateLimit[Date]*): Self = StObject.set(x, "disable", js.Array(value :_*))
      
      @scala.inline
      def setEnable(value: js.Array[DateLimit[Date]]): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
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
      def setEnableVarargs(value: DateLimit[Date]*): Self = StObject.set(x, "enable", js.Array(value :_*))
      
      @scala.inline
      def setErrorHandler(value: /* err */ Error => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
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
      def setMinuteIncrementUndefined: Self = StObject.set(x, "minuteIncrement", js.undefined)
      
      @scala.inline
      def setMode(value: single | multiple | range | time): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMonthSelectorType(value: String): Self = StObject.set(x, "monthSelectorType", value.asInstanceOf[js.Any])
      
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
      def setNow(value: Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      @scala.inline
      def setOnChange(value: js.Array[Hook]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnChangeVarargs(value: Hook*): Self = StObject.set(x, "onChange", js.Array(value :_*))
      
      @scala.inline
      def setOnClose(value: js.Array[Hook]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnCloseVarargs(value: Hook*): Self = StObject.set(x, "onClose", js.Array(value :_*))
      
      @scala.inline
      def setOnDayCreate(value: js.Array[Hook]): Self = StObject.set(x, "onDayCreate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDayCreateUndefined: Self = StObject.set(x, "onDayCreate", js.undefined)
      
      @scala.inline
      def setOnDayCreateVarargs(value: Hook*): Self = StObject.set(x, "onDayCreate", js.Array(value :_*))
      
      @scala.inline
      def setOnDestroy(value: js.Array[Hook]): Self = StObject.set(x, "onDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
      
      @scala.inline
      def setOnDestroyVarargs(value: Hook*): Self = StObject.set(x, "onDestroy", js.Array(value :_*))
      
      @scala.inline
      def setOnKeyDown(value: js.Array[Hook]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyDownVarargs(value: Hook*): Self = StObject.set(x, "onKeyDown", js.Array(value :_*))
      
      @scala.inline
      def setOnMonthChange(value: js.Array[Hook]): Self = StObject.set(x, "onMonthChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      @scala.inline
      def setOnMonthChangeVarargs(value: Hook*): Self = StObject.set(x, "onMonthChange", js.Array(value :_*))
      
      @scala.inline
      def setOnOpen(value: js.Array[Hook]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOnOpenVarargs(value: Hook*): Self = StObject.set(x, "onOpen", js.Array(value :_*))
      
      @scala.inline
      def setOnParseConfig(value: js.Array[Hook]): Self = StObject.set(x, "onParseConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnParseConfigUndefined: Self = StObject.set(x, "onParseConfig", js.undefined)
      
      @scala.inline
      def setOnParseConfigVarargs(value: Hook*): Self = StObject.set(x, "onParseConfig", js.Array(value :_*))
      
      @scala.inline
      def setOnPreCalendarPosition(value: js.Array[Hook]): Self = StObject.set(x, "onPreCalendarPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPreCalendarPositionUndefined: Self = StObject.set(x, "onPreCalendarPosition", js.undefined)
      
      @scala.inline
      def setOnPreCalendarPositionVarargs(value: Hook*): Self = StObject.set(x, "onPreCalendarPosition", js.Array(value :_*))
      
      @scala.inline
      def setOnReady(value: js.Array[Hook]): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      @scala.inline
      def setOnReadyVarargs(value: Hook*): Self = StObject.set(x, "onReady", js.Array(value :_*))
      
      @scala.inline
      def setOnValueUpdate(value: js.Array[Hook]): Self = StObject.set(x, "onValueUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnValueUpdateUndefined: Self = StObject.set(x, "onValueUpdate", js.undefined)
      
      @scala.inline
      def setOnValueUpdateVarargs(value: Hook*): Self = StObject.set(x, "onValueUpdate", js.Array(value :_*))
      
      @scala.inline
      def setOnYearChange(value: js.Array[Hook]): Self = StObject.set(x, "onYearChange", value.asInstanceOf[js.Any])
      
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
      def setPositionElement(value: HTMLElement): Self = StObject.set(x, "positionElement", value.asInstanceOf[js.Any])
      
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
      
      @scala.inline
      def set_disable(value: js.Array[DateLimit[Date]]): Self = StObject.set(x, "_disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_disableUndefined: Self = StObject.set(x, "_disable", js.undefined)
      
      @scala.inline
      def set_disableVarargs(value: DateLimit[Date]*): Self = StObject.set(x, "_disable", js.Array(value :_*))
      
      @scala.inline
      def set_enable(value: js.Array[DateLimit[Date]]): Self = StObject.set(x, "_enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_enableUndefined: Self = StObject.set(x, "_enable", js.undefined)
      
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
  
  @js.native
  trait Shorthand extends StObject {
    
    var longhand: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
    
    var shorthand: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
  }
  object Shorthand {
    
    @scala.inline
    def apply(
      longhand: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String],
      shorthand: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
    ): Shorthand = {
      val __obj = js.Dynamic.literal(longhand = longhand.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shorthand]
    }
    
    @scala.inline
    implicit class ShorthandMutableBuilder[Self <: Shorthand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLonghand(
        value: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
      ): Self = StObject.set(x, "longhand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShorthand(
        value: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
      ): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ k in flatpickr.flatpickr/dist/types/locale.key ]:? flatpickr.flatpickr/dist/types/locale.CustomLocale} & {  default :flatpickr.flatpickr/dist/types/locale.Locale} */
  @js.native
  trait kinkeyCustomLocaledefault extends StObject {
    
    var default: js.UndefOr[CustomLocale] with Locale = js.native
    
    var ar: js.UndefOr[CustomLocale] = js.native
    
    var at: js.UndefOr[CustomLocale] = js.native
    
    var az: js.UndefOr[CustomLocale] = js.native
    
    var be: js.UndefOr[CustomLocale] = js.native
    
    var bg: js.UndefOr[CustomLocale] = js.native
    
    var bn: js.UndefOr[CustomLocale] = js.native
    
    var bs: js.UndefOr[CustomLocale] = js.native
    
    var ca: js.UndefOr[CustomLocale] = js.native
    
    var cat: js.UndefOr[CustomLocale] = js.native
    
    var cs: js.UndefOr[CustomLocale] = js.native
    
    var cy: js.UndefOr[CustomLocale] = js.native
    
    var da: js.UndefOr[CustomLocale] = js.native
    
    var de: js.UndefOr[CustomLocale] = js.native
    
    var en: js.UndefOr[CustomLocale] = js.native
    
    var eo: js.UndefOr[CustomLocale] = js.native
    
    var es: js.UndefOr[CustomLocale] = js.native
    
    var et: js.UndefOr[CustomLocale] = js.native
    
    var fa: js.UndefOr[CustomLocale] = js.native
    
    var fi: js.UndefOr[CustomLocale] = js.native
    
    var fo: js.UndefOr[CustomLocale] = js.native
    
    var fr: js.UndefOr[CustomLocale] = js.native
    
    var gr: js.UndefOr[CustomLocale] = js.native
    
    var he: js.UndefOr[CustomLocale] = js.native
    
    var hi: js.UndefOr[CustomLocale] = js.native
    
    var hr: js.UndefOr[CustomLocale] = js.native
    
    var hu: js.UndefOr[CustomLocale] = js.native
    
    var id: js.UndefOr[CustomLocale] = js.native
    
    var is: js.UndefOr[CustomLocale] = js.native
    
    var it: js.UndefOr[CustomLocale] = js.native
    
    var ja: js.UndefOr[CustomLocale] = js.native
    
    var ka: js.UndefOr[CustomLocale] = js.native
    
    var km: js.UndefOr[CustomLocale] = js.native
    
    var ko: js.UndefOr[CustomLocale] = js.native
    
    var kz: js.UndefOr[CustomLocale] = js.native
    
    var lt: js.UndefOr[CustomLocale] = js.native
    
    var lv: js.UndefOr[CustomLocale] = js.native
    
    var mk: js.UndefOr[CustomLocale] = js.native
    
    var mn: js.UndefOr[CustomLocale] = js.native
    
    var ms: js.UndefOr[CustomLocale] = js.native
    
    var my: js.UndefOr[CustomLocale] = js.native
    
    var nl: js.UndefOr[CustomLocale] = js.native
    
    var no: js.UndefOr[CustomLocale] = js.native
    
    var pa: js.UndefOr[CustomLocale] = js.native
    
    var pl: js.UndefOr[CustomLocale] = js.native
    
    var pt: js.UndefOr[CustomLocale] = js.native
    
    var ro: js.UndefOr[CustomLocale] = js.native
    
    var ru: js.UndefOr[CustomLocale] = js.native
    
    var si: js.UndefOr[CustomLocale] = js.native
    
    var sk: js.UndefOr[CustomLocale] = js.native
    
    var sl: js.UndefOr[CustomLocale] = js.native
    
    var sq: js.UndefOr[CustomLocale] = js.native
    
    var sr: js.UndefOr[CustomLocale] = js.native
    
    var sv: js.UndefOr[CustomLocale] = js.native
    
    var th: js.UndefOr[CustomLocale] = js.native
    
    var tr: js.UndefOr[CustomLocale] = js.native
    
    var uk: js.UndefOr[CustomLocale] = js.native
    
    var uz: js.UndefOr[CustomLocale] = js.native
    
    var uz_latn: js.UndefOr[CustomLocale] = js.native
    
    var vn: js.UndefOr[CustomLocale] = js.native
    
    var zh: js.UndefOr[CustomLocale] = js.native
    
    var zh_tw: js.UndefOr[CustomLocale] = js.native
  }
  object kinkeyCustomLocaledefault {
    
    @scala.inline
    def apply(default: js.UndefOr[CustomLocale] with Locale): kinkeyCustomLocaledefault = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[kinkeyCustomLocaledefault]
    }
    
    @scala.inline
    implicit class kinkeyCustomLocaledefaultMutableBuilder[Self <: kinkeyCustomLocaledefault] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAr(value: CustomLocale): Self = StObject.set(x, "ar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArUndefined: Self = StObject.set(x, "ar", js.undefined)
      
      @scala.inline
      def setAt(value: CustomLocale): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      @scala.inline
      def setAz(value: CustomLocale): Self = StObject.set(x, "az", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAzUndefined: Self = StObject.set(x, "az", js.undefined)
      
      @scala.inline
      def setBe(value: CustomLocale): Self = StObject.set(x, "be", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeUndefined: Self = StObject.set(x, "be", js.undefined)
      
      @scala.inline
      def setBg(value: CustomLocale): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      @scala.inline
      def setBn(value: CustomLocale): Self = StObject.set(x, "bn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBnUndefined: Self = StObject.set(x, "bn", js.undefined)
      
      @scala.inline
      def setBs(value: CustomLocale): Self = StObject.set(x, "bs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsUndefined: Self = StObject.set(x, "bs", js.undefined)
      
      @scala.inline
      def setCa(value: CustomLocale): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCat(value: CustomLocale): Self = StObject.set(x, "cat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatUndefined: Self = StObject.set(x, "cat", js.undefined)
      
      @scala.inline
      def setCs(value: CustomLocale): Self = StObject.set(x, "cs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsUndefined: Self = StObject.set(x, "cs", js.undefined)
      
      @scala.inline
      def setCy(value: CustomLocale): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      @scala.inline
      def setDa(value: CustomLocale): Self = StObject.set(x, "da", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaUndefined: Self = StObject.set(x, "da", js.undefined)
      
      @scala.inline
      def setDe(value: CustomLocale): Self = StObject.set(x, "de", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeUndefined: Self = StObject.set(x, "de", js.undefined)
      
      @scala.inline
      def setDefault(value: js.UndefOr[CustomLocale] with Locale): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEn(value: CustomLocale): Self = StObject.set(x, "en", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnUndefined: Self = StObject.set(x, "en", js.undefined)
      
      @scala.inline
      def setEo(value: CustomLocale): Self = StObject.set(x, "eo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEoUndefined: Self = StObject.set(x, "eo", js.undefined)
      
      @scala.inline
      def setEs(value: CustomLocale): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEsUndefined: Self = StObject.set(x, "es", js.undefined)
      
      @scala.inline
      def setEt(value: CustomLocale): Self = StObject.set(x, "et", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtUndefined: Self = StObject.set(x, "et", js.undefined)
      
      @scala.inline
      def setFa(value: CustomLocale): Self = StObject.set(x, "fa", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaUndefined: Self = StObject.set(x, "fa", js.undefined)
      
      @scala.inline
      def setFi(value: CustomLocale): Self = StObject.set(x, "fi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiUndefined: Self = StObject.set(x, "fi", js.undefined)
      
      @scala.inline
      def setFo(value: CustomLocale): Self = StObject.set(x, "fo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFoUndefined: Self = StObject.set(x, "fo", js.undefined)
      
      @scala.inline
      def setFr(value: CustomLocale): Self = StObject.set(x, "fr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrUndefined: Self = StObject.set(x, "fr", js.undefined)
      
      @scala.inline
      def setGr(value: CustomLocale): Self = StObject.set(x, "gr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrUndefined: Self = StObject.set(x, "gr", js.undefined)
      
      @scala.inline
      def setHe(value: CustomLocale): Self = StObject.set(x, "he", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeUndefined: Self = StObject.set(x, "he", js.undefined)
      
      @scala.inline
      def setHi(value: CustomLocale): Self = StObject.set(x, "hi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiUndefined: Self = StObject.set(x, "hi", js.undefined)
      
      @scala.inline
      def setHr(value: CustomLocale): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
      
      @scala.inline
      def setHu(value: CustomLocale): Self = StObject.set(x, "hu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHuUndefined: Self = StObject.set(x, "hu", js.undefined)
      
      @scala.inline
      def setId(value: CustomLocale): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIs(value: CustomLocale): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setIt(value: CustomLocale): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItUndefined: Self = StObject.set(x, "it", js.undefined)
      
      @scala.inline
      def setJa(value: CustomLocale): Self = StObject.set(x, "ja", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJaUndefined: Self = StObject.set(x, "ja", js.undefined)
      
      @scala.inline
      def setKa(value: CustomLocale): Self = StObject.set(x, "ka", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKaUndefined: Self = StObject.set(x, "ka", js.undefined)
      
      @scala.inline
      def setKm(value: CustomLocale): Self = StObject.set(x, "km", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmUndefined: Self = StObject.set(x, "km", js.undefined)
      
      @scala.inline
      def setKo(value: CustomLocale): Self = StObject.set(x, "ko", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKoUndefined: Self = StObject.set(x, "ko", js.undefined)
      
      @scala.inline
      def setKz(value: CustomLocale): Self = StObject.set(x, "kz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKzUndefined: Self = StObject.set(x, "kz", js.undefined)
      
      @scala.inline
      def setLt(value: CustomLocale): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
      
      @scala.inline
      def setLv(value: CustomLocale): Self = StObject.set(x, "lv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLvUndefined: Self = StObject.set(x, "lv", js.undefined)
      
      @scala.inline
      def setMk(value: CustomLocale): Self = StObject.set(x, "mk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMkUndefined: Self = StObject.set(x, "mk", js.undefined)
      
      @scala.inline
      def setMn(value: CustomLocale): Self = StObject.set(x, "mn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMnUndefined: Self = StObject.set(x, "mn", js.undefined)
      
      @scala.inline
      def setMs(value: CustomLocale): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
      
      @scala.inline
      def setMy(value: CustomLocale): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      @scala.inline
      def setNl(value: CustomLocale): Self = StObject.set(x, "nl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNlUndefined: Self = StObject.set(x, "nl", js.undefined)
      
      @scala.inline
      def setNo(value: CustomLocale): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoUndefined: Self = StObject.set(x, "no", js.undefined)
      
      @scala.inline
      def setPa(value: CustomLocale): Self = StObject.set(x, "pa", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaUndefined: Self = StObject.set(x, "pa", js.undefined)
      
      @scala.inline
      def setPl(value: CustomLocale): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      @scala.inline
      def setPt(value: CustomLocale): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      @scala.inline
      def setRo(value: CustomLocale): Self = StObject.set(x, "ro", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoUndefined: Self = StObject.set(x, "ro", js.undefined)
      
      @scala.inline
      def setRu(value: CustomLocale): Self = StObject.set(x, "ru", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuUndefined: Self = StObject.set(x, "ru", js.undefined)
      
      @scala.inline
      def setSi(value: CustomLocale): Self = StObject.set(x, "si", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiUndefined: Self = StObject.set(x, "si", js.undefined)
      
      @scala.inline
      def setSk(value: CustomLocale): Self = StObject.set(x, "sk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkUndefined: Self = StObject.set(x, "sk", js.undefined)
      
      @scala.inline
      def setSl(value: CustomLocale): Self = StObject.set(x, "sl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlUndefined: Self = StObject.set(x, "sl", js.undefined)
      
      @scala.inline
      def setSq(value: CustomLocale): Self = StObject.set(x, "sq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqUndefined: Self = StObject.set(x, "sq", js.undefined)
      
      @scala.inline
      def setSr(value: CustomLocale): Self = StObject.set(x, "sr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrUndefined: Self = StObject.set(x, "sr", js.undefined)
      
      @scala.inline
      def setSv(value: CustomLocale): Self = StObject.set(x, "sv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvUndefined: Self = StObject.set(x, "sv", js.undefined)
      
      @scala.inline
      def setTh(value: CustomLocale): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThUndefined: Self = StObject.set(x, "th", js.undefined)
      
      @scala.inline
      def setTr(value: CustomLocale): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
      
      @scala.inline
      def setUk(value: CustomLocale): Self = StObject.set(x, "uk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUkUndefined: Self = StObject.set(x, "uk", js.undefined)
      
      @scala.inline
      def setUz(value: CustomLocale): Self = StObject.set(x, "uz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUzUndefined: Self = StObject.set(x, "uz", js.undefined)
      
      @scala.inline
      def setUz_latn(value: CustomLocale): Self = StObject.set(x, "uz_latn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUz_latnUndefined: Self = StObject.set(x, "uz_latn", js.undefined)
      
      @scala.inline
      def setVn(value: CustomLocale): Self = StObject.set(x, "vn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVnUndefined: Self = StObject.set(x, "vn", js.undefined)
      
      @scala.inline
      def setZh(value: CustomLocale): Self = StObject.set(x, "zh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZhUndefined: Self = StObject.set(x, "zh", js.undefined)
      
      @scala.inline
      def setZh_tw(value: CustomLocale): Self = StObject.set(x, "zh_tw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZh_twUndefined: Self = StObject.set(x, "zh_tw", js.undefined)
    }
  }
  
  /* Inlined {[ k in keyof flatpickr.flatpickr/dist/types/options.Options ]:? flatpickr.flatpickr/dist/types/options.Options[k]} */
  @js.native
  trait kinkeyofOptionsOptionsk extends StObject {
    
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
    
    var defaultDate: js.UndefOr[DateOption | js.Array[DateOption]] = js.native
    
    var defaultHour: js.UndefOr[Double] = js.native
    
    var defaultMinute: js.UndefOr[Double] = js.native
    
    var defaultSeconds: js.UndefOr[Double] = js.native
    
    var disable: js.UndefOr[js.Array[DateLimit[DateOption]]] = js.native
    
    var disableMobile: js.UndefOr[Boolean] = js.native
    
    var enable: js.UndefOr[js.Array[DateLimit[DateOption]]] = js.native
    
    var enableSeconds: js.UndefOr[Boolean] = js.native
    
    var enableTime: js.UndefOr[Boolean] = js.native
    
    var errorHandler: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.native
    
    var formatDate: js.UndefOr[js.Function3[/* date */ Date, /* format */ String, /* locale */ Locale, String]] = js.native
    
    var getWeek: js.UndefOr[js.Function1[/* date */ Date, String | Double]] = js.native
    
    var hourIncrement: js.UndefOr[Double] = js.native
    
    var ignoredFocusElements: js.UndefOr[js.Array[HTMLElement]] = js.native
    
    var `inline`: js.UndefOr[Boolean] = js.native
    
    var locale: js.UndefOr[key | CustomLocale] = js.native
    
    var maxDate: js.UndefOr[DateOption] = js.native
    
    var maxTime: js.UndefOr[DateOption] = js.native
    
    var minDate: js.UndefOr[DateOption] = js.native
    
    var minTime: js.UndefOr[DateOption] = js.native
    
    var minuteIncrement: js.UndefOr[Double] = js.native
    
    var mode: js.UndefOr[single | multiple | range | time] = js.native
    
    var monthSelectorType: js.UndefOr[dropdown | static] = js.native
    
    var nextArrow: js.UndefOr[String] = js.native
    
    var noCalendar: js.UndefOr[Boolean] = js.native
    
    var now: js.UndefOr[DateOption] = js.native
    
    var onChange: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var onClose: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var onDayCreate: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var onDestroy: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var onKeyDown: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var onMonthChange: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var onOpen: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var onParseConfig: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var onPreCalendarPosition: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var onReady: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var onValueUpdate: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var onYearChange: js.UndefOr[Hook | js.Array[Hook]] = js.native
    
    var parseDate: js.UndefOr[js.Function2[/* date */ String, /* format */ String, Date]] = js.native
    
    var plugins: js.UndefOr[js.Array[Plugin[js.Object]]] = js.native
    
    var position: js.UndefOr[auto | above | below] = js.native
    
    var positionElement: js.UndefOr[typings.std.Element] = js.native
    
    var prevArrow: js.UndefOr[String] = js.native
    
    var shorthandCurrentMonth: js.UndefOr[Boolean] = js.native
    
    var showMonths: js.UndefOr[Double] = js.native
    
    var static: js.UndefOr[Boolean] = js.native
    
    var time_24hr: js.UndefOr[Boolean] = js.native
    
    var weekNumbers: js.UndefOr[Boolean] = js.native
    
    var wrap: js.UndefOr[Boolean] = js.native
  }
  object kinkeyofOptionsOptionsk {
    
    @scala.inline
    def apply(): kinkeyofOptionsOptionsk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[kinkeyofOptionsOptionsk]
    }
    
    @scala.inline
    implicit class kinkeyofOptionsOptionskMutableBuilder[Self <: kinkeyofOptionsOptionsk] (val x: Self) extends AnyVal {
      
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
      def setPositionElement(value: typings.std.Element): Self = StObject.set(x, "positionElement", value.asInstanceOf[js.Any])
      
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
}
