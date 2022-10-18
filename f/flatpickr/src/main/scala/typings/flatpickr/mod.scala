package typings.flatpickr

import org.scalablytyped.runtime.Shortcut
import typings.flatpickr.anon.PartialCustomLocale
import typings.flatpickr.distTypesGlobalsMod.global.Date
import typings.flatpickr.distTypesGlobalsMod.global.HTMLElement
import typings.flatpickr.distTypesInstanceMod.FlatpickrFn
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
    
    type CustomLocale = typings.flatpickr.distTypesLocaleMod.CustomLocale
    
    type Instance = typings.flatpickr.distTypesInstanceMod.Instance
    
    type Locale = typings.flatpickr.distTypesLocaleMod.Locale
    
    object Options {
      
      type DateLimit = typings.flatpickr.distTypesOptionsMod.DateLimit[typings.flatpickr.distTypesOptionsMod.DateOption]
      
      type DateOption = typings.flatpickr.distTypesOptionsMod.DateOption
      
      type DateRangeLimit = typings.flatpickr.distTypesOptionsMod.DateRangeLimit[typings.flatpickr.distTypesOptionsMod.DateOption]
      
      type Hook = typings.flatpickr.distTypesOptionsMod.Hook
      
      type HookKey = typings.flatpickr.distTypesOptionsMod.HookKey
      
      type LocaleKey = key
      
      /* Inlined flatpickr.flatpickr/dist/types/options.Options */
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
        
        var defaultDate: js.UndefOr[
                typings.flatpickr.distTypesOptionsMod.DateOption | js.Array[typings.flatpickr.distTypesOptionsMod.DateOption]
              ] = js.undefined
        
        var defaultHour: js.UndefOr[Double] = js.undefined
        
        var defaultMinute: js.UndefOr[Double] = js.undefined
        
        var defaultSeconds: js.UndefOr[Double] = js.undefined
        
        var disable: js.UndefOr[
                js.Array[
                  typings.flatpickr.distTypesOptionsMod.DateLimit[typings.flatpickr.distTypesOptionsMod.DateOption]
                ]
              ] = js.undefined
        
        var disableMobile: js.UndefOr[Boolean] = js.undefined
        
        var enable: js.UndefOr[
                js.Array[
                  typings.flatpickr.distTypesOptionsMod.DateLimit[typings.flatpickr.distTypesOptionsMod.DateOption]
                ]
              ] = js.undefined
        
        var enableSeconds: js.UndefOr[Boolean] = js.undefined
        
        var enableTime: js.UndefOr[Boolean] = js.undefined
        
        var errorHandler: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.undefined
        
        var formatDate: js.UndefOr[
                js.Function3[
                  /* date */ Date, 
                  /* format */ String, 
                  /* locale */ typings.flatpickr.distTypesLocaleMod.Locale, 
                  String
                ]
              ] = js.undefined
        
        var getWeek: js.UndefOr[js.Function1[/* date */ Date, String | Double]] = js.undefined
        
        var hourIncrement: js.UndefOr[Double] = js.undefined
        
        var ignoredFocusElements: js.UndefOr[js.Array[HTMLElement]] = js.undefined
        
        var `inline`: js.UndefOr[Boolean] = js.undefined
        
        var locale: js.UndefOr[key | PartialCustomLocale] = js.undefined
        
        var maxDate: js.UndefOr[typings.flatpickr.distTypesOptionsMod.DateOption] = js.undefined
        
        var maxTime: js.UndefOr[typings.flatpickr.distTypesOptionsMod.DateOption] = js.undefined
        
        var minDate: js.UndefOr[typings.flatpickr.distTypesOptionsMod.DateOption] = js.undefined
        
        var minTime: js.UndefOr[typings.flatpickr.distTypesOptionsMod.DateOption] = js.undefined
        
        var minuteIncrement: js.UndefOr[Double] = js.undefined
        
        var mode: js.UndefOr[single | multiple | range | time] = js.undefined
        
        var monthSelectorType: js.UndefOr[dropdown | static] = js.undefined
        
        var nextArrow: js.UndefOr[String] = js.undefined
        
        var noCalendar: js.UndefOr[Boolean] = js.undefined
        
        var now: js.UndefOr[typings.flatpickr.distTypesOptionsMod.DateOption] = js.undefined
        
        var onChange: js.UndefOr[
                typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
              ] = js.undefined
        
        var onClose: js.UndefOr[
                typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
              ] = js.undefined
        
        var onDayCreate: js.UndefOr[
                typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
              ] = js.undefined
        
        var onDestroy: js.UndefOr[
                typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
              ] = js.undefined
        
        var onKeyDown: js.UndefOr[
                typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
              ] = js.undefined
        
        var onMonthChange: js.UndefOr[
                typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
              ] = js.undefined
        
        var onOpen: js.UndefOr[
                typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
              ] = js.undefined
        
        var onParseConfig: js.UndefOr[
                typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
              ] = js.undefined
        
        var onPreCalendarPosition: js.UndefOr[
                typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
              ] = js.undefined
        
        var onReady: js.UndefOr[
                typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
              ] = js.undefined
        
        var onValueUpdate: js.UndefOr[
                typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
              ] = js.undefined
        
        var onYearChange: js.UndefOr[
                typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
              ] = js.undefined
        
        var parseDate: js.UndefOr[js.Function2[/* date */ String, /* format */ String, Date]] = js.undefined
        
        var plugins: js.UndefOr[js.Array[typings.flatpickr.distTypesOptionsMod.Plugin[js.Object]]] = js.undefined
        
        var position: js.UndefOr[
                auto | above | below | (`auto left`) | (`auto center`) | (`auto right`) | (`above left`) | (`above center`) | (`above right`) | (`below left`) | (`below center`) | (`below right`) | (js.Function2[
                  /* self */ typings.flatpickr.distTypesInstanceMod.Instance, 
                  /* customElement */ js.UndefOr[HTMLElement], 
                  Unit
                ])
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
        
        inline def apply(): typings.flatpickr.mod.flatpickr.Options.Options = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.flatpickr.mod.flatpickr.Options.Options]
        }
        
        extension [Self <: typings.flatpickr.mod.flatpickr.Options.Options](x: Self) {
          
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
          
          inline def setDefaultDate(
            value: typings.flatpickr.distTypesOptionsMod.DateOption | js.Array[typings.flatpickr.distTypesOptionsMod.DateOption]
          ): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
          
          inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
          
          inline def setDefaultDateVarargs(value: typings.flatpickr.distTypesOptionsMod.DateOption*): Self = StObject.set(x, "defaultDate", js.Array(value*))
          
          inline def setDefaultHour(value: Double): Self = StObject.set(x, "defaultHour", value.asInstanceOf[js.Any])
          
          inline def setDefaultHourUndefined: Self = StObject.set(x, "defaultHour", js.undefined)
          
          inline def setDefaultMinute(value: Double): Self = StObject.set(x, "defaultMinute", value.asInstanceOf[js.Any])
          
          inline def setDefaultMinuteUndefined: Self = StObject.set(x, "defaultMinute", js.undefined)
          
          inline def setDefaultSeconds(value: Double): Self = StObject.set(x, "defaultSeconds", value.asInstanceOf[js.Any])
          
          inline def setDefaultSecondsUndefined: Self = StObject.set(x, "defaultSeconds", js.undefined)
          
          inline def setDisable(
            value: js.Array[
                      typings.flatpickr.distTypesOptionsMod.DateLimit[typings.flatpickr.distTypesOptionsMod.DateOption]
                    ]
          ): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
          
          inline def setDisableMobile(value: Boolean): Self = StObject.set(x, "disableMobile", value.asInstanceOf[js.Any])
          
          inline def setDisableMobileUndefined: Self = StObject.set(x, "disableMobile", js.undefined)
          
          inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
          
          inline def setDisableVarargs(
            value: typings.flatpickr.distTypesOptionsMod.DateLimit[typings.flatpickr.distTypesOptionsMod.DateOption]*
          ): Self = StObject.set(x, "disable", js.Array(value*))
          
          inline def setEnable(
            value: js.Array[
                      typings.flatpickr.distTypesOptionsMod.DateLimit[typings.flatpickr.distTypesOptionsMod.DateOption]
                    ]
          ): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
          
          inline def setEnableSeconds(value: Boolean): Self = StObject.set(x, "enableSeconds", value.asInstanceOf[js.Any])
          
          inline def setEnableSecondsUndefined: Self = StObject.set(x, "enableSeconds", js.undefined)
          
          inline def setEnableTime(value: Boolean): Self = StObject.set(x, "enableTime", value.asInstanceOf[js.Any])
          
          inline def setEnableTimeUndefined: Self = StObject.set(x, "enableTime", js.undefined)
          
          inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
          
          inline def setEnableVarargs(
            value: typings.flatpickr.distTypesOptionsMod.DateLimit[typings.flatpickr.distTypesOptionsMod.DateOption]*
          ): Self = StObject.set(x, "enable", js.Array(value*))
          
          inline def setErrorHandler(value: /* e */ js.Error => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
          
          inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
          
          inline def setFormatDate(
            value: (/* date */ Date, /* format */ String, /* locale */ typings.flatpickr.distTypesLocaleMod.Locale) => String
          ): Self = StObject.set(x, "formatDate", js.Any.fromFunction3(value))
          
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
          
          inline def setMaxDate(value: typings.flatpickr.distTypesOptionsMod.DateOption): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
          
          inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
          
          inline def setMaxTime(value: typings.flatpickr.distTypesOptionsMod.DateOption): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
          
          inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
          
          inline def setMinDate(value: typings.flatpickr.distTypesOptionsMod.DateOption): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
          
          inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
          
          inline def setMinTime(value: typings.flatpickr.distTypesOptionsMod.DateOption): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
          
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
          
          inline def setNow(value: typings.flatpickr.distTypesOptionsMod.DateOption): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
          
          inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
          
          inline def setOnChange(
            value: typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
          ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
          
          inline def setOnChangeFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
          ): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
          
          inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
          
          inline def setOnChangeVarargs(value: typings.flatpickr.distTypesOptionsMod.Hook*): Self = StObject.set(x, "onChange", js.Array(value*))
          
          inline def setOnClose(
            value: typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
          ): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
          
          inline def setOnCloseFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
          ): Self = StObject.set(x, "onClose", js.Any.fromFunction4(value))
          
          inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
          
          inline def setOnCloseVarargs(value: typings.flatpickr.distTypesOptionsMod.Hook*): Self = StObject.set(x, "onClose", js.Array(value*))
          
          inline def setOnDayCreate(
            value: typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
          ): Self = StObject.set(x, "onDayCreate", value.asInstanceOf[js.Any])
          
          inline def setOnDayCreateFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
          ): Self = StObject.set(x, "onDayCreate", js.Any.fromFunction4(value))
          
          inline def setOnDayCreateUndefined: Self = StObject.set(x, "onDayCreate", js.undefined)
          
          inline def setOnDayCreateVarargs(value: typings.flatpickr.distTypesOptionsMod.Hook*): Self = StObject.set(x, "onDayCreate", js.Array(value*))
          
          inline def setOnDestroy(
            value: typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
          ): Self = StObject.set(x, "onDestroy", value.asInstanceOf[js.Any])
          
          inline def setOnDestroyFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
          ): Self = StObject.set(x, "onDestroy", js.Any.fromFunction4(value))
          
          inline def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
          
          inline def setOnDestroyVarargs(value: typings.flatpickr.distTypesOptionsMod.Hook*): Self = StObject.set(x, "onDestroy", js.Array(value*))
          
          inline def setOnKeyDown(
            value: typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
          ): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
          
          inline def setOnKeyDownFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
          ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction4(value))
          
          inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
          
          inline def setOnKeyDownVarargs(value: typings.flatpickr.distTypesOptionsMod.Hook*): Self = StObject.set(x, "onKeyDown", js.Array(value*))
          
          inline def setOnMonthChange(
            value: typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
          ): Self = StObject.set(x, "onMonthChange", value.asInstanceOf[js.Any])
          
          inline def setOnMonthChangeFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
          ): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction4(value))
          
          inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
          
          inline def setOnMonthChangeVarargs(value: typings.flatpickr.distTypesOptionsMod.Hook*): Self = StObject.set(x, "onMonthChange", js.Array(value*))
          
          inline def setOnOpen(
            value: typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
          ): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
          
          inline def setOnOpenFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
          ): Self = StObject.set(x, "onOpen", js.Any.fromFunction4(value))
          
          inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
          
          inline def setOnOpenVarargs(value: typings.flatpickr.distTypesOptionsMod.Hook*): Self = StObject.set(x, "onOpen", js.Array(value*))
          
          inline def setOnParseConfig(
            value: typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
          ): Self = StObject.set(x, "onParseConfig", value.asInstanceOf[js.Any])
          
          inline def setOnParseConfigFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
          ): Self = StObject.set(x, "onParseConfig", js.Any.fromFunction4(value))
          
          inline def setOnParseConfigUndefined: Self = StObject.set(x, "onParseConfig", js.undefined)
          
          inline def setOnParseConfigVarargs(value: typings.flatpickr.distTypesOptionsMod.Hook*): Self = StObject.set(x, "onParseConfig", js.Array(value*))
          
          inline def setOnPreCalendarPosition(
            value: typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
          ): Self = StObject.set(x, "onPreCalendarPosition", value.asInstanceOf[js.Any])
          
          inline def setOnPreCalendarPositionFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
          ): Self = StObject.set(x, "onPreCalendarPosition", js.Any.fromFunction4(value))
          
          inline def setOnPreCalendarPositionUndefined: Self = StObject.set(x, "onPreCalendarPosition", js.undefined)
          
          inline def setOnPreCalendarPositionVarargs(value: typings.flatpickr.distTypesOptionsMod.Hook*): Self = StObject.set(x, "onPreCalendarPosition", js.Array(value*))
          
          inline def setOnReady(
            value: typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
          ): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
          
          inline def setOnReadyFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
          ): Self = StObject.set(x, "onReady", js.Any.fromFunction4(value))
          
          inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
          
          inline def setOnReadyVarargs(value: typings.flatpickr.distTypesOptionsMod.Hook*): Self = StObject.set(x, "onReady", js.Array(value*))
          
          inline def setOnValueUpdate(
            value: typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
          ): Self = StObject.set(x, "onValueUpdate", value.asInstanceOf[js.Any])
          
          inline def setOnValueUpdateFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
          ): Self = StObject.set(x, "onValueUpdate", js.Any.fromFunction4(value))
          
          inline def setOnValueUpdateUndefined: Self = StObject.set(x, "onValueUpdate", js.undefined)
          
          inline def setOnValueUpdateVarargs(value: typings.flatpickr.distTypesOptionsMod.Hook*): Self = StObject.set(x, "onValueUpdate", js.Array(value*))
          
          inline def setOnYearChange(
            value: typings.flatpickr.distTypesOptionsMod.Hook | js.Array[typings.flatpickr.distTypesOptionsMod.Hook]
          ): Self = StObject.set(x, "onYearChange", value.asInstanceOf[js.Any])
          
          inline def setOnYearChangeFunction4(
            value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
          ): Self = StObject.set(x, "onYearChange", js.Any.fromFunction4(value))
          
          inline def setOnYearChangeUndefined: Self = StObject.set(x, "onYearChange", js.undefined)
          
          inline def setOnYearChangeVarargs(value: typings.flatpickr.distTypesOptionsMod.Hook*): Self = StObject.set(x, "onYearChange", js.Array(value*))
          
          inline def setParseDate(value: (/* date */ String, /* format */ String) => Date): Self = StObject.set(x, "parseDate", js.Any.fromFunction2(value))
          
          inline def setParseDateUndefined: Self = StObject.set(x, "parseDate", js.undefined)
          
          inline def setPlugins(value: js.Array[typings.flatpickr.distTypesOptionsMod.Plugin[js.Object]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
          
          inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
          
          inline def setPluginsVarargs(value: typings.flatpickr.distTypesOptionsMod.Plugin[js.Object]*): Self = StObject.set(x, "plugins", js.Array(value*))
          
          inline def setPosition(
            value: auto | above | below | (`auto left`) | (`auto center`) | (`auto right`) | (`above left`) | (`above center`) | (`above right`) | (`below left`) | (`below center`) | (`below right`) | (js.Function2[
                      /* self */ typings.flatpickr.distTypesInstanceMod.Instance, 
                      /* customElement */ js.UndefOr[HTMLElement], 
                      Unit
                    ])
          ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
          
          inline def setPositionElement(value: Element): Self = StObject.set(x, "positionElement", value.asInstanceOf[js.Any])
          
          inline def setPositionElementUndefined: Self = StObject.set(x, "positionElement", js.undefined)
          
          inline def setPositionFunction2(
            value: (/* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* customElement */ js.UndefOr[HTMLElement]) => Unit
          ): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
          
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
      
      type ParsedOptions = typings.flatpickr.distTypesOptionsMod.ParsedOptions
      
      type Plugin = typings.flatpickr.distTypesOptionsMod.Plugin[js.Object]
    }
  }
}
