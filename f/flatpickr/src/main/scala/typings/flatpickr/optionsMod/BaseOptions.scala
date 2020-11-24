package typings.flatpickr.optionsMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseOptions extends js.Object {
  
  var allowInput: Boolean = js.native
  
  var allowInvalidPreload: Boolean = js.native
  
  var altFormat: String = js.native
  
  var altInput: Boolean = js.native
  
  var altInputClass: String = js.native
  
  var animate: Boolean = js.native
  
  var appendTo: HTMLElement = js.native
  
  var ariaDateFormat: String = js.native
  
  var autoFillDefaultTime: Boolean = js.native
  
  var clickOpens: Boolean = js.native
  
  var closeOnSelect: Boolean = js.native
  
  var conjunction: String = js.native
  
  var dateFormat: String = js.native
  
  var defaultDate: DateOption | js.Array[DateOption] = js.native
  
  var defaultHour: Double = js.native
  
  var defaultMinute: Double = js.native
  
  var defaultSeconds: Double = js.native
  
  var disable: js.Array[DateLimit[DateOption]] = js.native
  
  var disableMobile: Boolean = js.native
  
  var enable: js.Array[DateLimit[DateOption]] = js.native
  
  var enableSeconds: Boolean = js.native
  
  var enableTime: Boolean = js.native
  
  def errorHandler(e: Error): Unit = js.native
  
  def formatDate(date: Date, format: String, locale: Locale): String = js.native
  
  def getWeek(date: Date): String | Double = js.native
  
  var hourIncrement: Double = js.native
  
  var ignoredFocusElements: js.Array[HTMLElement] = js.native
  
  var `inline`: Boolean = js.native
  
  var locale: key | CustomLocale = js.native
  
  var maxDate: DateOption = js.native
  
  var maxTime: DateOption = js.native
  
  var minDate: DateOption = js.native
  
  var minTime: DateOption = js.native
  
  var minuteIncrement: Double = js.native
  
  var mode: single | multiple | range | time = js.native
  
  var monthSelectorType: dropdown | static = js.native
  
  var nextArrow: String = js.native
  
  var noCalendar: Boolean = js.native
  
  var now: js.UndefOr[DateOption] = js.native
  
  var onChange: Hook | js.Array[Hook] = js.native
  
  var onClose: Hook | js.Array[Hook] = js.native
  
  var onDayCreate: Hook | js.Array[Hook] = js.native
  
  var onDestroy: Hook | js.Array[Hook] = js.native
  
  var onKeyDown: Hook | js.Array[Hook] = js.native
  
  var onMonthChange: Hook | js.Array[Hook] = js.native
  
  var onOpen: Hook | js.Array[Hook] = js.native
  
  var onParseConfig: Hook | js.Array[Hook] = js.native
  
  var onPreCalendarPosition: Hook | js.Array[Hook] = js.native
  
  var onReady: Hook | js.Array[Hook] = js.native
  
  var onValueUpdate: Hook | js.Array[Hook] = js.native
  
  var onYearChange: Hook | js.Array[Hook] = js.native
  
  def parseDate(date: String, format: String): Date = js.native
  
  var plugins: js.Array[Plugin[js.Object]] = js.native
  
  var position: auto | above | below = js.native
  
  var positionElement: Element = js.native
  
  var prevArrow: String = js.native
  
  var shorthandCurrentMonth: Boolean = js.native
  
  var showMonths: js.UndefOr[Double] = js.native
  
  var static: Boolean = js.native
  
  var time_24hr: Boolean = js.native
  
  var weekNumbers: Boolean = js.native
  
  var wrap: Boolean = js.native
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
  implicit class BaseOptionsOps[Self <: BaseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowInput(value: Boolean): Self = this.set("allowInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInvalidPreload(value: Boolean): Self = this.set("allowInvalidPreload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltFormat(value: String): Self = this.set("altFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltInput(value: Boolean): Self = this.set("altInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltInputClass(value: String): Self = this.set("altInputClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendTo(value: HTMLElement): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaDateFormat(value: String): Self = this.set("ariaDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFillDefaultTime(value: Boolean): Self = this.set("autoFillDefaultTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickOpens(value: Boolean): Self = this.set("clickOpens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnSelect(value: Boolean): Self = this.set("closeOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConjunction(value: String): Self = this.set("conjunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDateVarargs(value: DateOption*): Self = this.set("defaultDate", js.Array(value :_*))
    
    @scala.inline
    def setDefaultDate(value: DateOption | js.Array[DateOption]): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHour(value: Double): Self = this.set("defaultHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMinute(value: Double): Self = this.set("defaultMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSeconds(value: Double): Self = this.set("defaultSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableVarargs(value: DateLimit[DateOption]*): Self = this.set("disable", js.Array(value :_*))
    
    @scala.inline
    def setDisable(value: js.Array[DateLimit[DateOption]]): Self = this.set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMobile(value: Boolean): Self = this.set("disableMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableVarargs(value: DateLimit[DateOption]*): Self = this.set("enable", js.Array(value :_*))
    
    @scala.inline
    def setEnable(value: js.Array[DateLimit[DateOption]]): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSeconds(value: Boolean): Self = this.set("enableSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTime(value: Boolean): Self = this.set("enableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorHandler(value: Error => Unit): Self = this.set("errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatDate(value: (Date, String, Locale) => String): Self = this.set("formatDate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetWeek(value: Date => String | Double): Self = this.set("getWeek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHourIncrement(value: Double): Self = this.set("hourIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoredFocusElementsVarargs(value: HTMLElement*): Self = this.set("ignoredFocusElements", js.Array(value :_*))
    
    @scala.inline
    def setIgnoredFocusElements(value: js.Array[HTMLElement]): Self = this.set("ignoredFocusElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: key | CustomLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDate(value: DateOption): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTime(value: DateOption): Self = this.set("maxTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDate(value: DateOption): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTime(value: DateOption): Self = this.set("minTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteIncrement(value: Double): Self = this.set("minuteIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: single | multiple | range | time): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthSelectorType(value: dropdown | static): Self = this.set("monthSelectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextArrow(value: String): Self = this.set("nextArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoCalendar(value: Boolean): Self = this.set("noCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeVarargs(value: Hook*): Self = this.set("onChange", js.Array(value :_*))
    
    @scala.inline
    def setOnChangeFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnChange(value: Hook | js.Array[Hook]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseVarargs(value: Hook*): Self = this.set("onClose", js.Array(value :_*))
    
    @scala.inline
    def setOnCloseFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onClose", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnClose(value: Hook | js.Array[Hook]): Self = this.set("onClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDayCreateVarargs(value: Hook*): Self = this.set("onDayCreate", js.Array(value :_*))
    
    @scala.inline
    def setOnDayCreateFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onDayCreate", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnDayCreate(value: Hook | js.Array[Hook]): Self = this.set("onDayCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDestroyVarargs(value: Hook*): Self = this.set("onDestroy", js.Array(value :_*))
    
    @scala.inline
    def setOnDestroyFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onDestroy", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnDestroy(value: Hook | js.Array[Hook]): Self = this.set("onDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyDownVarargs(value: Hook*): Self = this.set("onKeyDown", js.Array(value :_*))
    
    @scala.inline
    def setOnKeyDownFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onKeyDown", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnKeyDown(value: Hook | js.Array[Hook]): Self = this.set("onKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMonthChangeVarargs(value: Hook*): Self = this.set("onMonthChange", js.Array(value :_*))
    
    @scala.inline
    def setOnMonthChangeFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onMonthChange", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnMonthChange(value: Hook | js.Array[Hook]): Self = this.set("onMonthChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOpenVarargs(value: Hook*): Self = this.set("onOpen", js.Array(value :_*))
    
    @scala.inline
    def setOnOpenFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onOpen", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnOpen(value: Hook | js.Array[Hook]): Self = this.set("onOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnParseConfigVarargs(value: Hook*): Self = this.set("onParseConfig", js.Array(value :_*))
    
    @scala.inline
    def setOnParseConfigFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onParseConfig", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnParseConfig(value: Hook | js.Array[Hook]): Self = this.set("onParseConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPreCalendarPositionVarargs(value: Hook*): Self = this.set("onPreCalendarPosition", js.Array(value :_*))
    
    @scala.inline
    def setOnPreCalendarPositionFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onPreCalendarPosition", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnPreCalendarPosition(value: Hook | js.Array[Hook]): Self = this.set("onPreCalendarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnReadyVarargs(value: Hook*): Self = this.set("onReady", js.Array(value :_*))
    
    @scala.inline
    def setOnReadyFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onReady", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnReady(value: Hook | js.Array[Hook]): Self = this.set("onReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnValueUpdateVarargs(value: Hook*): Self = this.set("onValueUpdate", js.Array(value :_*))
    
    @scala.inline
    def setOnValueUpdateFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onValueUpdate", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnValueUpdate(value: Hook | js.Array[Hook]): Self = this.set("onValueUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnYearChangeVarargs(value: Hook*): Self = this.set("onYearChange", js.Array(value :_*))
    
    @scala.inline
    def setOnYearChangeFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onYearChange", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnYearChange(value: Hook | js.Array[Hook]): Self = this.set("onYearChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseDate(value: (String, String) => Date): Self = this.set("parseDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPluginsVarargs(value: Plugin[js.Object]*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[Plugin[js.Object]]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: auto | above | below): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionElement(value: Element): Self = this.set("positionElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevArrow(value: String): Self = this.set("prevArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShorthandCurrentMonth(value: Boolean): Self = this.set("shorthandCurrentMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_24hr(value: Boolean): Self = this.set("time_24hr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekNumbers(value: Boolean): Self = this.set("weekNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNow(value: DateOption): Self = this.set("now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNow: Self = this.set("now", js.undefined)
    
    @scala.inline
    def setShowMonths(value: Double): Self = this.set("showMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMonths: Self = this.set("showMonths", js.undefined)
  }
}
