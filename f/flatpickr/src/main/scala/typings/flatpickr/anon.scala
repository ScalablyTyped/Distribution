package typings.flatpickr

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
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Capture extends StObject {
    
    var capture: js.UndefOr[Boolean] = js.undefined
    
    var once: js.UndefOr[Boolean] = js.undefined
    
    var passive: js.UndefOr[Boolean] = js.undefined
  }
  object Capture {
    
    inline def apply(): Capture = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Capture]
    }
    
    extension [Self <: Capture](x: Self) {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
    }
  }
  
  trait Config extends StObject {
    
    var config: js.UndefOr[ParsedOptions] = js.undefined
    
    var l10n: js.UndefOr[Locale] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setConfig(value: ParsedOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setL10n(value: Locale): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
      
      inline def setL10nUndefined: Self = StObject.set(x, "l10n", js.undefined)
    }
  }
  
  @js.native
  trait GetDaysInMonth extends StObject {
    
    def getDaysInMonth(): Double = js.native
    def getDaysInMonth(month: Double): Double = js.native
    def getDaysInMonth(month: Double, year: Double): Double = js.native
    def getDaysInMonth(month: Unit, year: Double): Double = js.native
  }
  
  trait Hours extends StObject {
    
    var hours: Double
    
    var minutes: Double
    
    var seconds: Double
  }
  object Hours {
    
    inline def apply(hours: Double, minutes: Double, seconds: Double): Hours = {
      val __obj = js.Dynamic.literal(hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hours]
    }
    
    extension [Self <: Hours](x: Self) {
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
  
  trait Longhand extends StObject {
    
    var longhand: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
    
    var shorthand: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
  }
  object Longhand {
    
    inline def apply(
      longhand: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String],
      shorthand: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
    ): Longhand = {
      val __obj = js.Dynamic.literal(longhand = longhand.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any])
      __obj.asInstanceOf[Longhand]
    }
    
    extension [Self <: Longhand](x: Self) {
      
      inline def setLonghand(
        value: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
      ): Self = StObject.set(x, "longhand", value.asInstanceOf[js.Any])
      
      inline def setShorthand(
        value: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
      ): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<flatpickr.flatpickr/dist/plugins/monthSelect.Config> */
  trait PartialConfig extends StObject {
    
    var _stubbedCurrentMonth: js.UndefOr[Double] = js.undefined
    
    var altFormat: js.UndefOr[String] = js.undefined
    
    var dateFormat: js.UndefOr[String] = js.undefined
    
    var shorthand: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
  }
  object PartialConfig {
    
    inline def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    extension [Self <: PartialConfig](x: Self) {
      
      inline def setAltFormat(value: String): Self = StObject.set(x, "altFormat", value.asInstanceOf[js.Any])
      
      inline def setAltFormatUndefined: Self = StObject.set(x, "altFormat", js.undefined)
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
      
      inline def setShorthandUndefined: Self = StObject.set(x, "shorthand", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def set_stubbedCurrentMonth(value: Double): Self = StObject.set(x, "_stubbedCurrentMonth", value.asInstanceOf[js.Any])
      
      inline def set_stubbedCurrentMonthUndefined: Self = StObject.set(x, "_stubbedCurrentMonth", js.undefined)
    }
  }
  
  /* Inlined std.Partial<flatpickr.flatpickr/dist/types/locale.CustomLocale> */
  trait PartialCustomLocale extends StObject {
    
    var amPM: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var daysInMonth: js.UndefOr[
        js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
      ] = js.undefined
    
    var firstDayOfWeek: js.UndefOr[Double] = js.undefined
    
    var hourAriaLabel: js.UndefOr[String] = js.undefined
    
    var minuteAriaLabel: js.UndefOr[String] = js.undefined
    
    var monthAriaLabel: js.UndefOr[String] = js.undefined
    
    var months: js.UndefOr[Longhand] = js.undefined
    
    var ordinal: js.UndefOr[js.Function1[/* nth */ Double, String]] = js.undefined
    
    var rangeSeparator: js.UndefOr[String] = js.undefined
    
    var scrollTitle: js.UndefOr[String] = js.undefined
    
    var time_24hr: js.UndefOr[Boolean] = js.undefined
    
    var toggleTitle: js.UndefOr[String] = js.undefined
    
    var weekAbbreviation: js.UndefOr[String] = js.undefined
    
    var weekdays: js.UndefOr[Shorthand] = js.undefined
    
    var yearAriaLabel: js.UndefOr[String] = js.undefined
  }
  object PartialCustomLocale {
    
    inline def apply(): PartialCustomLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCustomLocale]
    }
    
    extension [Self <: PartialCustomLocale](x: Self) {
      
      inline def setAmPM(value: js.Tuple2[String, String]): Self = StObject.set(x, "amPM", value.asInstanceOf[js.Any])
      
      inline def setAmPMUndefined: Self = StObject.set(x, "amPM", js.undefined)
      
      inline def setDaysInMonth(
        value: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
      ): Self = StObject.set(x, "daysInMonth", value.asInstanceOf[js.Any])
      
      inline def setDaysInMonthUndefined: Self = StObject.set(x, "daysInMonth", js.undefined)
      
      inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setHourAriaLabel(value: String): Self = StObject.set(x, "hourAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setHourAriaLabelUndefined: Self = StObject.set(x, "hourAriaLabel", js.undefined)
      
      inline def setMinuteAriaLabel(value: String): Self = StObject.set(x, "minuteAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMinuteAriaLabelUndefined: Self = StObject.set(x, "minuteAriaLabel", js.undefined)
      
      inline def setMonthAriaLabel(value: String): Self = StObject.set(x, "monthAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMonthAriaLabelUndefined: Self = StObject.set(x, "monthAriaLabel", js.undefined)
      
      inline def setMonths(value: Longhand): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setOrdinal(value: /* nth */ Double => String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
      
      inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
      
      inline def setRangeSeparator(value: String): Self = StObject.set(x, "rangeSeparator", value.asInstanceOf[js.Any])
      
      inline def setRangeSeparatorUndefined: Self = StObject.set(x, "rangeSeparator", js.undefined)
      
      inline def setScrollTitle(value: String): Self = StObject.set(x, "scrollTitle", value.asInstanceOf[js.Any])
      
      inline def setScrollTitleUndefined: Self = StObject.set(x, "scrollTitle", js.undefined)
      
      inline def setTime_24hr(value: Boolean): Self = StObject.set(x, "time_24hr", value.asInstanceOf[js.Any])
      
      inline def setTime_24hrUndefined: Self = StObject.set(x, "time_24hr", js.undefined)
      
      inline def setToggleTitle(value: String): Self = StObject.set(x, "toggleTitle", value.asInstanceOf[js.Any])
      
      inline def setToggleTitleUndefined: Self = StObject.set(x, "toggleTitle", js.undefined)
      
      inline def setWeekAbbreviation(value: String): Self = StObject.set(x, "weekAbbreviation", value.asInstanceOf[js.Any])
      
      inline def setWeekAbbreviationUndefined: Self = StObject.set(x, "weekAbbreviation", js.undefined)
      
      inline def setWeekdays(value: Shorthand): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysUndefined: Self = StObject.set(x, "weekdays", js.undefined)
      
      inline def setYearAriaLabel(value: String): Self = StObject.set(x, "yearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setYearAriaLabelUndefined: Self = StObject.set(x, "yearAriaLabel", js.undefined)
    }
  }
  
  /* Inlined std.Partial<flatpickr.flatpickr/dist/types/options.ParsedOptions> */
  trait PartialParsedOptions extends StObject {
    
    var _disable: js.UndefOr[js.Array[DateLimit[Date]]] = js.undefined
    
    var _enable: js.UndefOr[js.Array[DateLimit[Date]]] = js.undefined
    
    var _maxDate: js.UndefOr[Date] = js.undefined
    
    var _maxTime: js.UndefOr[Date] = js.undefined
    
    var _minDate: js.UndefOr[Date] = js.undefined
    
    var _minTime: js.UndefOr[Date] = js.undefined
    
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
    
    var defaultDate: js.UndefOr[Date | js.Array[Date]] = js.undefined
    
    var defaultHour: js.UndefOr[Double] = js.undefined
    
    var defaultMinute: js.UndefOr[Double] = js.undefined
    
    var defaultSeconds: js.UndefOr[Double] = js.undefined
    
    var disable: js.UndefOr[js.Array[DateLimit[Date]]] = js.undefined
    
    var disableMobile: js.UndefOr[Boolean] = js.undefined
    
    var enable: js.UndefOr[js.Array[DateLimit[Date]]] = js.undefined
    
    var enableSeconds: js.UndefOr[Boolean] = js.undefined
    
    var enableTime: js.UndefOr[Boolean] = js.undefined
    
    var errorHandler: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    var formatDate: js.UndefOr[js.Function3[/* date */ Date, /* format */ String, /* locale */ Locale, String]] = js.undefined
    
    var getWeek: js.UndefOr[js.Function1[/* date */ Date, String | Double]] = js.undefined
    
    var hourIncrement: js.UndefOr[Double] = js.undefined
    
    var ignoredFocusElements: js.UndefOr[js.Array[HTMLElement]] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[key | CustomLocale] = js.undefined
    
    var maxDate: js.UndefOr[Date] = js.undefined
    
    var maxTime: js.UndefOr[Date] = js.undefined
    
    var minDate: js.UndefOr[Date] = js.undefined
    
    var minTime: js.UndefOr[Date] = js.undefined
    
    var minuteIncrement: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[single | multiple | range | time] = js.undefined
    
    var monthSelectorType: js.UndefOr[String] = js.undefined
    
    var nextArrow: js.UndefOr[String] = js.undefined
    
    var noCalendar: js.UndefOr[Boolean] = js.undefined
    
    var now: js.UndefOr[Date] = js.undefined
    
    var onChange: js.UndefOr[js.Array[Hook]] = js.undefined
    
    var onClose: js.UndefOr[js.Array[Hook]] = js.undefined
    
    var onDayCreate: js.UndefOr[js.Array[Hook]] = js.undefined
    
    var onDestroy: js.UndefOr[js.Array[Hook]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Array[Hook]] = js.undefined
    
    var onMonthChange: js.UndefOr[js.Array[Hook]] = js.undefined
    
    var onOpen: js.UndefOr[js.Array[Hook]] = js.undefined
    
    var onParseConfig: js.UndefOr[js.Array[Hook]] = js.undefined
    
    var onPreCalendarPosition: js.UndefOr[js.Array[Hook]] = js.undefined
    
    var onReady: js.UndefOr[js.Array[Hook]] = js.undefined
    
    var onValueUpdate: js.UndefOr[js.Array[Hook]] = js.undefined
    
    var onYearChange: js.UndefOr[js.Array[Hook]] = js.undefined
    
    var parseDate: js.UndefOr[js.Function2[/* date */ String, /* format */ String, Date]] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Plugin[js.Object]]] = js.undefined
    
    var position: js.UndefOr[
        auto | above | below | (`auto left`) | (`auto center`) | (`auto right`) | (`above left`) | (`above center`) | (`above right`) | (`below left`) | (`below center`) | (`below right`) | (js.Function2[/* self */ Instance, /* customElement */ js.UndefOr[HTMLElement], Unit])
      ] = js.undefined
    
    var positionElement: js.UndefOr[HTMLElement] = js.undefined
    
    var prevArrow: js.UndefOr[String] = js.undefined
    
    var shorthandCurrentMonth: js.UndefOr[Boolean] = js.undefined
    
    var showMonths: js.UndefOr[Double] = js.undefined
    
    var static: js.UndefOr[Boolean] = js.undefined
    
    var time_24hr: js.UndefOr[Boolean] = js.undefined
    
    var weekNumbers: js.UndefOr[Boolean] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object PartialParsedOptions {
    
    inline def apply(): PartialParsedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialParsedOptions]
    }
    
    extension [Self <: PartialParsedOptions](x: Self) {
      
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
      
      inline def setDefaultDate(value: Date | js.Array[Date]): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      inline def setDefaultDateVarargs(value: Date*): Self = StObject.set(x, "defaultDate", js.Array(value*))
      
      inline def setDefaultHour(value: Double): Self = StObject.set(x, "defaultHour", value.asInstanceOf[js.Any])
      
      inline def setDefaultHourUndefined: Self = StObject.set(x, "defaultHour", js.undefined)
      
      inline def setDefaultMinute(value: Double): Self = StObject.set(x, "defaultMinute", value.asInstanceOf[js.Any])
      
      inline def setDefaultMinuteUndefined: Self = StObject.set(x, "defaultMinute", js.undefined)
      
      inline def setDefaultSeconds(value: Double): Self = StObject.set(x, "defaultSeconds", value.asInstanceOf[js.Any])
      
      inline def setDefaultSecondsUndefined: Self = StObject.set(x, "defaultSeconds", js.undefined)
      
      inline def setDisable(value: js.Array[DateLimit[Date]]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableMobile(value: Boolean): Self = StObject.set(x, "disableMobile", value.asInstanceOf[js.Any])
      
      inline def setDisableMobileUndefined: Self = StObject.set(x, "disableMobile", js.undefined)
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setDisableVarargs(value: DateLimit[Date]*): Self = StObject.set(x, "disable", js.Array(value*))
      
      inline def setEnable(value: js.Array[DateLimit[Date]]): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableSeconds(value: Boolean): Self = StObject.set(x, "enableSeconds", value.asInstanceOf[js.Any])
      
      inline def setEnableSecondsUndefined: Self = StObject.set(x, "enableSeconds", js.undefined)
      
      inline def setEnableTime(value: Boolean): Self = StObject.set(x, "enableTime", value.asInstanceOf[js.Any])
      
      inline def setEnableTimeUndefined: Self = StObject.set(x, "enableTime", js.undefined)
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setEnableVarargs(value: DateLimit[Date]*): Self = StObject.set(x, "enable", js.Array(value*))
      
      inline def setErrorHandler(value: /* err */ js.Error => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
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
      
      inline def setLocale(value: key | CustomLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxTime(value: Date): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinTime(value: Date): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setMinuteIncrement(value: Double): Self = StObject.set(x, "minuteIncrement", value.asInstanceOf[js.Any])
      
      inline def setMinuteIncrementUndefined: Self = StObject.set(x, "minuteIncrement", js.undefined)
      
      inline def setMode(value: single | multiple | range | time): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMonthSelectorType(value: String): Self = StObject.set(x, "monthSelectorType", value.asInstanceOf[js.Any])
      
      inline def setMonthSelectorTypeUndefined: Self = StObject.set(x, "monthSelectorType", js.undefined)
      
      inline def setNextArrow(value: String): Self = StObject.set(x, "nextArrow", value.asInstanceOf[js.Any])
      
      inline def setNextArrowUndefined: Self = StObject.set(x, "nextArrow", js.undefined)
      
      inline def setNoCalendar(value: Boolean): Self = StObject.set(x, "noCalendar", value.asInstanceOf[js.Any])
      
      inline def setNoCalendarUndefined: Self = StObject.set(x, "noCalendar", js.undefined)
      
      inline def setNow(value: Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setOnChange(value: js.Array[Hook]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnChangeVarargs(value: Hook*): Self = StObject.set(x, "onChange", js.Array(value*))
      
      inline def setOnClose(value: js.Array[Hook]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnCloseVarargs(value: Hook*): Self = StObject.set(x, "onClose", js.Array(value*))
      
      inline def setOnDayCreate(value: js.Array[Hook]): Self = StObject.set(x, "onDayCreate", value.asInstanceOf[js.Any])
      
      inline def setOnDayCreateUndefined: Self = StObject.set(x, "onDayCreate", js.undefined)
      
      inline def setOnDayCreateVarargs(value: Hook*): Self = StObject.set(x, "onDayCreate", js.Array(value*))
      
      inline def setOnDestroy(value: js.Array[Hook]): Self = StObject.set(x, "onDestroy", value.asInstanceOf[js.Any])
      
      inline def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
      
      inline def setOnDestroyVarargs(value: Hook*): Self = StObject.set(x, "onDestroy", js.Array(value*))
      
      inline def setOnKeyDown(value: js.Array[Hook]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyDownVarargs(value: Hook*): Self = StObject.set(x, "onKeyDown", js.Array(value*))
      
      inline def setOnMonthChange(value: js.Array[Hook]): Self = StObject.set(x, "onMonthChange", value.asInstanceOf[js.Any])
      
      inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      inline def setOnMonthChangeVarargs(value: Hook*): Self = StObject.set(x, "onMonthChange", js.Array(value*))
      
      inline def setOnOpen(value: js.Array[Hook]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnOpenVarargs(value: Hook*): Self = StObject.set(x, "onOpen", js.Array(value*))
      
      inline def setOnParseConfig(value: js.Array[Hook]): Self = StObject.set(x, "onParseConfig", value.asInstanceOf[js.Any])
      
      inline def setOnParseConfigUndefined: Self = StObject.set(x, "onParseConfig", js.undefined)
      
      inline def setOnParseConfigVarargs(value: Hook*): Self = StObject.set(x, "onParseConfig", js.Array(value*))
      
      inline def setOnPreCalendarPosition(value: js.Array[Hook]): Self = StObject.set(x, "onPreCalendarPosition", value.asInstanceOf[js.Any])
      
      inline def setOnPreCalendarPositionUndefined: Self = StObject.set(x, "onPreCalendarPosition", js.undefined)
      
      inline def setOnPreCalendarPositionVarargs(value: Hook*): Self = StObject.set(x, "onPreCalendarPosition", js.Array(value*))
      
      inline def setOnReady(value: js.Array[Hook]): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOnReadyVarargs(value: Hook*): Self = StObject.set(x, "onReady", js.Array(value*))
      
      inline def setOnValueUpdate(value: js.Array[Hook]): Self = StObject.set(x, "onValueUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnValueUpdateUndefined: Self = StObject.set(x, "onValueUpdate", js.undefined)
      
      inline def setOnValueUpdateVarargs(value: Hook*): Self = StObject.set(x, "onValueUpdate", js.Array(value*))
      
      inline def setOnYearChange(value: js.Array[Hook]): Self = StObject.set(x, "onYearChange", value.asInstanceOf[js.Any])
      
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
      
      inline def setPositionElement(value: HTMLElement): Self = StObject.set(x, "positionElement", value.asInstanceOf[js.Any])
      
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
      
      inline def set_disable(value: js.Array[DateLimit[Date]]): Self = StObject.set(x, "_disable", value.asInstanceOf[js.Any])
      
      inline def set_disableUndefined: Self = StObject.set(x, "_disable", js.undefined)
      
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
  
  trait Remove extends StObject {
    
    def remove(): Unit
  }
  object Remove {
    
    inline def apply(remove: () => Unit): Remove = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[Remove]
    }
    
    extension [Self <: Remove](x: Self) {
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
  
  trait Shorthand extends StObject {
    
    var longhand: js.Tuple7[String, String, String, String, String, String, String]
    
    var shorthand: js.Tuple7[String, String, String, String, String, String, String]
  }
  object Shorthand {
    
    inline def apply(
      longhand: js.Tuple7[String, String, String, String, String, String, String],
      shorthand: js.Tuple7[String, String, String, String, String, String, String]
    ): Shorthand = {
      val __obj = js.Dynamic.literal(longhand = longhand.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shorthand]
    }
    
    extension [Self <: Shorthand](x: Self) {
      
      inline def setLonghand(value: js.Tuple7[String, String, String, String, String, String, String]): Self = StObject.set(x, "longhand", value.asInstanceOf[js.Any])
      
      inline def setShorthand(value: js.Tuple7[String, String, String, String, String, String, String]): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ k in flatpickr.flatpickr/dist/types/locale.key ]:? flatpickr.flatpickr/dist/types/locale.CustomLocale} & {  default :flatpickr.flatpickr/dist/types/locale.Locale} */
  trait kinkeyCustomLocaledefault extends StObject {
    
    var default: js.UndefOr[CustomLocale] & Locale
    
    var ar: js.UndefOr[CustomLocale] = js.undefined
    
    var at: js.UndefOr[CustomLocale] = js.undefined
    
    var az: js.UndefOr[CustomLocale] = js.undefined
    
    var be: js.UndefOr[CustomLocale] = js.undefined
    
    var bg: js.UndefOr[CustomLocale] = js.undefined
    
    var bn: js.UndefOr[CustomLocale] = js.undefined
    
    var bs: js.UndefOr[CustomLocale] = js.undefined
    
    var ca: js.UndefOr[CustomLocale] = js.undefined
    
    var cat: js.UndefOr[CustomLocale] = js.undefined
    
    var ckb: js.UndefOr[CustomLocale] = js.undefined
    
    var cs: js.UndefOr[CustomLocale] = js.undefined
    
    var cy: js.UndefOr[CustomLocale] = js.undefined
    
    var da: js.UndefOr[CustomLocale] = js.undefined
    
    var de: js.UndefOr[CustomLocale] = js.undefined
    
    var en: js.UndefOr[CustomLocale] = js.undefined
    
    var eo: js.UndefOr[CustomLocale] = js.undefined
    
    var es: js.UndefOr[CustomLocale] = js.undefined
    
    var et: js.UndefOr[CustomLocale] = js.undefined
    
    var fa: js.UndefOr[CustomLocale] = js.undefined
    
    var fi: js.UndefOr[CustomLocale] = js.undefined
    
    var fo: js.UndefOr[CustomLocale] = js.undefined
    
    var fr: js.UndefOr[CustomLocale] = js.undefined
    
    var gr: js.UndefOr[CustomLocale] = js.undefined
    
    var he: js.UndefOr[CustomLocale] = js.undefined
    
    var hi: js.UndefOr[CustomLocale] = js.undefined
    
    var hr: js.UndefOr[CustomLocale] = js.undefined
    
    var hu: js.UndefOr[CustomLocale] = js.undefined
    
    var hy: js.UndefOr[CustomLocale] = js.undefined
    
    var id: js.UndefOr[CustomLocale] = js.undefined
    
    var is: js.UndefOr[CustomLocale] = js.undefined
    
    var it: js.UndefOr[CustomLocale] = js.undefined
    
    var ja: js.UndefOr[CustomLocale] = js.undefined
    
    var ka: js.UndefOr[CustomLocale] = js.undefined
    
    var km: js.UndefOr[CustomLocale] = js.undefined
    
    var ko: js.UndefOr[CustomLocale] = js.undefined
    
    var kz: js.UndefOr[CustomLocale] = js.undefined
    
    var lt: js.UndefOr[CustomLocale] = js.undefined
    
    var lv: js.UndefOr[CustomLocale] = js.undefined
    
    var mk: js.UndefOr[CustomLocale] = js.undefined
    
    var mn: js.UndefOr[CustomLocale] = js.undefined
    
    var ms: js.UndefOr[CustomLocale] = js.undefined
    
    var my: js.UndefOr[CustomLocale] = js.undefined
    
    var nl: js.UndefOr[CustomLocale] = js.undefined
    
    var nn: js.UndefOr[CustomLocale] = js.undefined
    
    var no: js.UndefOr[CustomLocale] = js.undefined
    
    var pa: js.UndefOr[CustomLocale] = js.undefined
    
    var pl: js.UndefOr[CustomLocale] = js.undefined
    
    var pt: js.UndefOr[CustomLocale] = js.undefined
    
    var ro: js.UndefOr[CustomLocale] = js.undefined
    
    var ru: js.UndefOr[CustomLocale] = js.undefined
    
    var si: js.UndefOr[CustomLocale] = js.undefined
    
    var sk: js.UndefOr[CustomLocale] = js.undefined
    
    var sl: js.UndefOr[CustomLocale] = js.undefined
    
    var sq: js.UndefOr[CustomLocale] = js.undefined
    
    var sr: js.UndefOr[CustomLocale] = js.undefined
    
    var sv: js.UndefOr[CustomLocale] = js.undefined
    
    var th: js.UndefOr[CustomLocale] = js.undefined
    
    var tr: js.UndefOr[CustomLocale] = js.undefined
    
    var uk: js.UndefOr[CustomLocale] = js.undefined
    
    var uz: js.UndefOr[CustomLocale] = js.undefined
    
    var uz_latn: js.UndefOr[CustomLocale] = js.undefined
    
    var vn: js.UndefOr[CustomLocale] = js.undefined
    
    var zh: js.UndefOr[CustomLocale] = js.undefined
    
    var zh_tw: js.UndefOr[CustomLocale] = js.undefined
  }
  object kinkeyCustomLocaledefault {
    
    inline def apply(default: js.UndefOr[CustomLocale] & Locale): kinkeyCustomLocaledefault = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[kinkeyCustomLocaledefault]
    }
    
    extension [Self <: kinkeyCustomLocaledefault](x: Self) {
      
      inline def setAr(value: CustomLocale): Self = StObject.set(x, "ar", value.asInstanceOf[js.Any])
      
      inline def setArUndefined: Self = StObject.set(x, "ar", js.undefined)
      
      inline def setAt(value: CustomLocale): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setAz(value: CustomLocale): Self = StObject.set(x, "az", value.asInstanceOf[js.Any])
      
      inline def setAzUndefined: Self = StObject.set(x, "az", js.undefined)
      
      inline def setBe(value: CustomLocale): Self = StObject.set(x, "be", value.asInstanceOf[js.Any])
      
      inline def setBeUndefined: Self = StObject.set(x, "be", js.undefined)
      
      inline def setBg(value: CustomLocale): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBn(value: CustomLocale): Self = StObject.set(x, "bn", value.asInstanceOf[js.Any])
      
      inline def setBnUndefined: Self = StObject.set(x, "bn", js.undefined)
      
      inline def setBs(value: CustomLocale): Self = StObject.set(x, "bs", value.asInstanceOf[js.Any])
      
      inline def setBsUndefined: Self = StObject.set(x, "bs", js.undefined)
      
      inline def setCa(value: CustomLocale): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCat(value: CustomLocale): Self = StObject.set(x, "cat", value.asInstanceOf[js.Any])
      
      inline def setCatUndefined: Self = StObject.set(x, "cat", js.undefined)
      
      inline def setCkb(value: CustomLocale): Self = StObject.set(x, "ckb", value.asInstanceOf[js.Any])
      
      inline def setCkbUndefined: Self = StObject.set(x, "ckb", js.undefined)
      
      inline def setCs(value: CustomLocale): Self = StObject.set(x, "cs", value.asInstanceOf[js.Any])
      
      inline def setCsUndefined: Self = StObject.set(x, "cs", js.undefined)
      
      inline def setCy(value: CustomLocale): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      inline def setDa(value: CustomLocale): Self = StObject.set(x, "da", value.asInstanceOf[js.Any])
      
      inline def setDaUndefined: Self = StObject.set(x, "da", js.undefined)
      
      inline def setDe(value: CustomLocale): Self = StObject.set(x, "de", value.asInstanceOf[js.Any])
      
      inline def setDeUndefined: Self = StObject.set(x, "de", js.undefined)
      
      inline def setDefault(value: js.UndefOr[CustomLocale] & Locale): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setEn(value: CustomLocale): Self = StObject.set(x, "en", value.asInstanceOf[js.Any])
      
      inline def setEnUndefined: Self = StObject.set(x, "en", js.undefined)
      
      inline def setEo(value: CustomLocale): Self = StObject.set(x, "eo", value.asInstanceOf[js.Any])
      
      inline def setEoUndefined: Self = StObject.set(x, "eo", js.undefined)
      
      inline def setEs(value: CustomLocale): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
      
      inline def setEsUndefined: Self = StObject.set(x, "es", js.undefined)
      
      inline def setEt(value: CustomLocale): Self = StObject.set(x, "et", value.asInstanceOf[js.Any])
      
      inline def setEtUndefined: Self = StObject.set(x, "et", js.undefined)
      
      inline def setFa(value: CustomLocale): Self = StObject.set(x, "fa", value.asInstanceOf[js.Any])
      
      inline def setFaUndefined: Self = StObject.set(x, "fa", js.undefined)
      
      inline def setFi(value: CustomLocale): Self = StObject.set(x, "fi", value.asInstanceOf[js.Any])
      
      inline def setFiUndefined: Self = StObject.set(x, "fi", js.undefined)
      
      inline def setFo(value: CustomLocale): Self = StObject.set(x, "fo", value.asInstanceOf[js.Any])
      
      inline def setFoUndefined: Self = StObject.set(x, "fo", js.undefined)
      
      inline def setFr(value: CustomLocale): Self = StObject.set(x, "fr", value.asInstanceOf[js.Any])
      
      inline def setFrUndefined: Self = StObject.set(x, "fr", js.undefined)
      
      inline def setGr(value: CustomLocale): Self = StObject.set(x, "gr", value.asInstanceOf[js.Any])
      
      inline def setGrUndefined: Self = StObject.set(x, "gr", js.undefined)
      
      inline def setHe(value: CustomLocale): Self = StObject.set(x, "he", value.asInstanceOf[js.Any])
      
      inline def setHeUndefined: Self = StObject.set(x, "he", js.undefined)
      
      inline def setHi(value: CustomLocale): Self = StObject.set(x, "hi", value.asInstanceOf[js.Any])
      
      inline def setHiUndefined: Self = StObject.set(x, "hi", js.undefined)
      
      inline def setHr(value: CustomLocale): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      inline def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
      
      inline def setHu(value: CustomLocale): Self = StObject.set(x, "hu", value.asInstanceOf[js.Any])
      
      inline def setHuUndefined: Self = StObject.set(x, "hu", js.undefined)
      
      inline def setHy(value: CustomLocale): Self = StObject.set(x, "hy", value.asInstanceOf[js.Any])
      
      inline def setHyUndefined: Self = StObject.set(x, "hy", js.undefined)
      
      inline def setId(value: CustomLocale): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIs(value: CustomLocale): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setIt(value: CustomLocale): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
      
      inline def setItUndefined: Self = StObject.set(x, "it", js.undefined)
      
      inline def setJa(value: CustomLocale): Self = StObject.set(x, "ja", value.asInstanceOf[js.Any])
      
      inline def setJaUndefined: Self = StObject.set(x, "ja", js.undefined)
      
      inline def setKa(value: CustomLocale): Self = StObject.set(x, "ka", value.asInstanceOf[js.Any])
      
      inline def setKaUndefined: Self = StObject.set(x, "ka", js.undefined)
      
      inline def setKm(value: CustomLocale): Self = StObject.set(x, "km", value.asInstanceOf[js.Any])
      
      inline def setKmUndefined: Self = StObject.set(x, "km", js.undefined)
      
      inline def setKo(value: CustomLocale): Self = StObject.set(x, "ko", value.asInstanceOf[js.Any])
      
      inline def setKoUndefined: Self = StObject.set(x, "ko", js.undefined)
      
      inline def setKz(value: CustomLocale): Self = StObject.set(x, "kz", value.asInstanceOf[js.Any])
      
      inline def setKzUndefined: Self = StObject.set(x, "kz", js.undefined)
      
      inline def setLt(value: CustomLocale): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
      
      inline def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
      
      inline def setLv(value: CustomLocale): Self = StObject.set(x, "lv", value.asInstanceOf[js.Any])
      
      inline def setLvUndefined: Self = StObject.set(x, "lv", js.undefined)
      
      inline def setMk(value: CustomLocale): Self = StObject.set(x, "mk", value.asInstanceOf[js.Any])
      
      inline def setMkUndefined: Self = StObject.set(x, "mk", js.undefined)
      
      inline def setMn(value: CustomLocale): Self = StObject.set(x, "mn", value.asInstanceOf[js.Any])
      
      inline def setMnUndefined: Self = StObject.set(x, "mn", js.undefined)
      
      inline def setMs(value: CustomLocale): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      
      inline def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
      
      inline def setMy(value: CustomLocale): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setNl(value: CustomLocale): Self = StObject.set(x, "nl", value.asInstanceOf[js.Any])
      
      inline def setNlUndefined: Self = StObject.set(x, "nl", js.undefined)
      
      inline def setNn(value: CustomLocale): Self = StObject.set(x, "nn", value.asInstanceOf[js.Any])
      
      inline def setNnUndefined: Self = StObject.set(x, "nn", js.undefined)
      
      inline def setNo(value: CustomLocale): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
      
      inline def setNoUndefined: Self = StObject.set(x, "no", js.undefined)
      
      inline def setPa(value: CustomLocale): Self = StObject.set(x, "pa", value.asInstanceOf[js.Any])
      
      inline def setPaUndefined: Self = StObject.set(x, "pa", js.undefined)
      
      inline def setPl(value: CustomLocale): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      inline def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      inline def setPt(value: CustomLocale): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      inline def setRo(value: CustomLocale): Self = StObject.set(x, "ro", value.asInstanceOf[js.Any])
      
      inline def setRoUndefined: Self = StObject.set(x, "ro", js.undefined)
      
      inline def setRu(value: CustomLocale): Self = StObject.set(x, "ru", value.asInstanceOf[js.Any])
      
      inline def setRuUndefined: Self = StObject.set(x, "ru", js.undefined)
      
      inline def setSi(value: CustomLocale): Self = StObject.set(x, "si", value.asInstanceOf[js.Any])
      
      inline def setSiUndefined: Self = StObject.set(x, "si", js.undefined)
      
      inline def setSk(value: CustomLocale): Self = StObject.set(x, "sk", value.asInstanceOf[js.Any])
      
      inline def setSkUndefined: Self = StObject.set(x, "sk", js.undefined)
      
      inline def setSl(value: CustomLocale): Self = StObject.set(x, "sl", value.asInstanceOf[js.Any])
      
      inline def setSlUndefined: Self = StObject.set(x, "sl", js.undefined)
      
      inline def setSq(value: CustomLocale): Self = StObject.set(x, "sq", value.asInstanceOf[js.Any])
      
      inline def setSqUndefined: Self = StObject.set(x, "sq", js.undefined)
      
      inline def setSr(value: CustomLocale): Self = StObject.set(x, "sr", value.asInstanceOf[js.Any])
      
      inline def setSrUndefined: Self = StObject.set(x, "sr", js.undefined)
      
      inline def setSv(value: CustomLocale): Self = StObject.set(x, "sv", value.asInstanceOf[js.Any])
      
      inline def setSvUndefined: Self = StObject.set(x, "sv", js.undefined)
      
      inline def setTh(value: CustomLocale): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
      
      inline def setThUndefined: Self = StObject.set(x, "th", js.undefined)
      
      inline def setTr(value: CustomLocale): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
      
      inline def setUk(value: CustomLocale): Self = StObject.set(x, "uk", value.asInstanceOf[js.Any])
      
      inline def setUkUndefined: Self = StObject.set(x, "uk", js.undefined)
      
      inline def setUz(value: CustomLocale): Self = StObject.set(x, "uz", value.asInstanceOf[js.Any])
      
      inline def setUzUndefined: Self = StObject.set(x, "uz", js.undefined)
      
      inline def setUz_latn(value: CustomLocale): Self = StObject.set(x, "uz_latn", value.asInstanceOf[js.Any])
      
      inline def setUz_latnUndefined: Self = StObject.set(x, "uz_latn", js.undefined)
      
      inline def setVn(value: CustomLocale): Self = StObject.set(x, "vn", value.asInstanceOf[js.Any])
      
      inline def setVnUndefined: Self = StObject.set(x, "vn", js.undefined)
      
      inline def setZh(value: CustomLocale): Self = StObject.set(x, "zh", value.asInstanceOf[js.Any])
      
      inline def setZhUndefined: Self = StObject.set(x, "zh", js.undefined)
      
      inline def setZh_tw(value: CustomLocale): Self = StObject.set(x, "zh_tw", value.asInstanceOf[js.Any])
      
      inline def setZh_twUndefined: Self = StObject.set(x, "zh_tw", js.undefined)
    }
  }
  
  /* Inlined {[ k in keyof flatpickr.flatpickr/dist/types/options.Options ]:? flatpickr.flatpickr/dist/types/options.Options[k]} */
  trait kinkeyofOptionsOptionsk extends StObject {
    
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
        auto | above | below | (`auto left`) | (`auto center`) | (`auto right`) | (`above left`) | (`above center`) | (`above right`) | (`below left`) | (`below center`) | (`below right`) | (js.Function2[/* self */ this.type, /* customElement */ js.UndefOr[HTMLElement], Unit])
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
  object kinkeyofOptionsOptionsk {
    
    inline def apply(): kinkeyofOptionsOptionsk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[kinkeyofOptionsOptionsk]
    }
    
    extension [Self <: kinkeyofOptionsOptionsk](x: Self) {
      
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
        value: auto | above | below | (`auto left`) | (`auto center`) | (`auto right`) | (`above left`) | (`above center`) | (`above right`) | (`below left`) | (`below center`) | (`below right`) | (js.Function2[kinkeyofOptionsOptionsk, /* customElement */ js.UndefOr[HTMLElement], Unit])
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionElement(value: Element): Self = StObject.set(x, "positionElement", value.asInstanceOf[js.Any])
      
      inline def setPositionElementUndefined: Self = StObject.set(x, "positionElement", js.undefined)
      
      inline def setPositionFunction2(value: (kinkeyofOptionsOptionsk, /* customElement */ js.UndefOr[HTMLElement]) => Unit): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
      
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
}
