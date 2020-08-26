package typings.flatpickr.optionsMod

import typings.flatpickr.flatpickrStrings.above
import typings.flatpickr.flatpickrStrings.auto
import typings.flatpickr.flatpickrStrings.below
import typings.flatpickr.flatpickrStrings.multiple
import typings.flatpickr.flatpickrStrings.range
import typings.flatpickr.flatpickrStrings.single
import typings.flatpickr.flatpickrStrings.time
import typings.flatpickr.globalsMod.global.Date
import typings.flatpickr.globalsMod.global.HTMLElement
import typings.flatpickr.localeMod.CustomLocale
import typings.flatpickr.localeMod.Locale
import typings.flatpickr.localeMod.key
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedOptions extends js.Object {
  var _disable: js.Array[DateLimit[Date]] = js.native
  var _enable: js.Array[DateLimit[Date]] = js.native
  var _maxDate: js.UndefOr[Date] = js.native
  var _maxTime: js.UndefOr[Date] = js.native
  var _minDate: js.UndefOr[Date] = js.native
  var _minTime: js.UndefOr[Date] = js.native
  var allowInput: Boolean = js.native
  var altFormat: String = js.native
  var altInput: Boolean = js.native
  var altInputClass: String = js.native
  var animate: Boolean = js.native
  var appendTo: js.UndefOr[HTMLElement] = js.native
  var ariaDateFormat: String = js.native
  var clickOpens: Boolean = js.native
  var closeOnSelect: Boolean = js.native
  var conjunction: String = js.native
  var dateFormat: String = js.native
  var defaultDate: js.UndefOr[Date | js.Array[Date]] = js.native
  var defaultHour: Double = js.native
  var defaultMinute: Double = js.native
  var defaultSeconds: Double = js.native
  var disable: js.Array[DateLimit[Date]] = js.native
  var disableMobile: Boolean = js.native
  var enable: js.Array[DateLimit[Date]] = js.native
  var enableSeconds: Boolean = js.native
  var enableTime: Boolean = js.native
  var formatDate: js.UndefOr[js.Function3[/* date */ Date, /* format */ String, /* locale */ Locale, String]] = js.native
  var hourIncrement: Double = js.native
  var ignoredFocusElements: js.Array[HTMLElement] = js.native
  var `inline`: Boolean = js.native
  var locale: key | CustomLocale = js.native
  var maxDate: js.UndefOr[Date] = js.native
  var maxTime: js.UndefOr[Date] = js.native
  var minDate: js.UndefOr[Date] = js.native
  var minTime: js.UndefOr[Date] = js.native
  var minuteIncrement: Double = js.native
  var mode: single | multiple | range | time = js.native
  var monthSelectorType: String = js.native
  var nextArrow: String = js.native
  var noCalendar: Boolean = js.native
  var now: Date = js.native
  var onChange: js.Array[Hook] = js.native
  var onClose: js.Array[Hook] = js.native
  var onDayCreate: js.Array[Hook] = js.native
  var onDestroy: js.Array[Hook] = js.native
  var onKeyDown: js.Array[Hook] = js.native
  var onMonthChange: js.Array[Hook] = js.native
  var onOpen: js.Array[Hook] = js.native
  var onParseConfig: js.Array[Hook] = js.native
  var onPreCalendarPosition: js.Array[Hook] = js.native
  var onReady: js.Array[Hook] = js.native
  var onValueUpdate: js.Array[Hook] = js.native
  var onYearChange: js.Array[Hook] = js.native
  var parseDate: js.UndefOr[js.Function2[/* date */ String, /* format */ String, Date]] = js.native
  var plugins: js.Array[Plugin[js.Object]] = js.native
  var position: auto | above | below = js.native
  var positionElement: js.UndefOr[HTMLElement] = js.native
  var prevArrow: String = js.native
  var shorthandCurrentMonth: Boolean = js.native
  var showMonths: Double = js.native
  var static: Boolean = js.native
  var time_24hr: Boolean = js.native
  var weekNumbers: Boolean = js.native
  var wrap: Boolean = js.native
  def errorHandler(err: Error): Unit = js.native
  def getWeek(date: Date): String | Double = js.native
}

object ParsedOptions {
  @scala.inline
  def apply(
    _disable: js.Array[DateLimit[Date]],
    _enable: js.Array[DateLimit[Date]],
    allowInput: Boolean,
    altFormat: String,
    altInput: Boolean,
    altInputClass: String,
    animate: Boolean,
    ariaDateFormat: String,
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
    val __obj = js.Dynamic.literal(_disable = _disable.asInstanceOf[js.Any], _enable = _enable.asInstanceOf[js.Any], allowInput = allowInput.asInstanceOf[js.Any], altFormat = altFormat.asInstanceOf[js.Any], altInput = altInput.asInstanceOf[js.Any], altInputClass = altInputClass.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], ariaDateFormat = ariaDateFormat.asInstanceOf[js.Any], clickOpens = clickOpens.asInstanceOf[js.Any], closeOnSelect = closeOnSelect.asInstanceOf[js.Any], conjunction = conjunction.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], defaultHour = defaultHour.asInstanceOf[js.Any], defaultMinute = defaultMinute.asInstanceOf[js.Any], defaultSeconds = defaultSeconds.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], disableMobile = disableMobile.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], enableSeconds = enableSeconds.asInstanceOf[js.Any], enableTime = enableTime.asInstanceOf[js.Any], errorHandler = js.Any.fromFunction1(errorHandler), getWeek = js.Any.fromFunction1(getWeek), hourIncrement = hourIncrement.asInstanceOf[js.Any], ignoredFocusElements = ignoredFocusElements.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minuteIncrement = minuteIncrement.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], monthSelectorType = monthSelectorType.asInstanceOf[js.Any], nextArrow = nextArrow.asInstanceOf[js.Any], noCalendar = noCalendar.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any], onDayCreate = onDayCreate.asInstanceOf[js.Any], onDestroy = onDestroy.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onMonthChange = onMonthChange.asInstanceOf[js.Any], onOpen = onOpen.asInstanceOf[js.Any], onParseConfig = onParseConfig.asInstanceOf[js.Any], onPreCalendarPosition = onPreCalendarPosition.asInstanceOf[js.Any], onReady = onReady.asInstanceOf[js.Any], onValueUpdate = onValueUpdate.asInstanceOf[js.Any], onYearChange = onYearChange.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], prevArrow = prevArrow.asInstanceOf[js.Any], shorthandCurrentMonth = shorthandCurrentMonth.asInstanceOf[js.Any], showMonths = showMonths.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], time_24hr = time_24hr.asInstanceOf[js.Any], weekNumbers = weekNumbers.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedOptions]
  }
  @scala.inline
  implicit class ParsedOptionsOps[Self <: ParsedOptions] (val x: Self) extends AnyVal {
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
    def set_disableVarargs(value: DateLimit[Date]*): Self = this.set("_disable", js.Array(value :_*))
    @scala.inline
    def set_disable(value: js.Array[DateLimit[Date]]): Self = this.set("_disable", value.asInstanceOf[js.Any])
    @scala.inline
    def set_enableVarargs(value: DateLimit[Date]*): Self = this.set("_enable", js.Array(value :_*))
    @scala.inline
    def set_enable(value: js.Array[DateLimit[Date]]): Self = this.set("_enable", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowInput(value: Boolean): Self = this.set("allowInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setAltFormat(value: String): Self = this.set("altFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setAltInput(value: Boolean): Self = this.set("altInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setAltInputClass(value: String): Self = this.set("altInputClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def setAriaDateFormat(value: String): Self = this.set("ariaDateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setClickOpens(value: Boolean): Self = this.set("clickOpens", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseOnSelect(value: Boolean): Self = this.set("closeOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def setConjunction(value: String): Self = this.set("conjunction", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultHour(value: Double): Self = this.set("defaultHour", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultMinute(value: Double): Self = this.set("defaultMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultSeconds(value: Double): Self = this.set("defaultSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableVarargs(value: DateLimit[Date]*): Self = this.set("disable", js.Array(value :_*))
    @scala.inline
    def setDisable(value: js.Array[DateLimit[Date]]): Self = this.set("disable", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableMobile(value: Boolean): Self = this.set("disableMobile", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableVarargs(value: DateLimit[Date]*): Self = this.set("enable", js.Array(value :_*))
    @scala.inline
    def setEnable(value: js.Array[DateLimit[Date]]): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableSeconds(value: Boolean): Self = this.set("enableSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableTime(value: Boolean): Self = this.set("enableTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorHandler(value: Error => Unit): Self = this.set("errorHandler", js.Any.fromFunction1(value))
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
    def setMinuteIncrement(value: Double): Self = this.set("minuteIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: single | multiple | range | time): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthSelectorType(value: String): Self = this.set("monthSelectorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextArrow(value: String): Self = this.set("nextArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoCalendar(value: Boolean): Self = this.set("noCalendar", value.asInstanceOf[js.Any])
    @scala.inline
    def setNow(value: Date): Self = this.set("now", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChangeVarargs(value: Hook*): Self = this.set("onChange", js.Array(value :_*))
    @scala.inline
    def setOnChange(value: js.Array[Hook]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCloseVarargs(value: Hook*): Self = this.set("onClose", js.Array(value :_*))
    @scala.inline
    def setOnClose(value: js.Array[Hook]): Self = this.set("onClose", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDayCreateVarargs(value: Hook*): Self = this.set("onDayCreate", js.Array(value :_*))
    @scala.inline
    def setOnDayCreate(value: js.Array[Hook]): Self = this.set("onDayCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDestroyVarargs(value: Hook*): Self = this.set("onDestroy", js.Array(value :_*))
    @scala.inline
    def setOnDestroy(value: js.Array[Hook]): Self = this.set("onDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnKeyDownVarargs(value: Hook*): Self = this.set("onKeyDown", js.Array(value :_*))
    @scala.inline
    def setOnKeyDown(value: js.Array[Hook]): Self = this.set("onKeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnMonthChangeVarargs(value: Hook*): Self = this.set("onMonthChange", js.Array(value :_*))
    @scala.inline
    def setOnMonthChange(value: js.Array[Hook]): Self = this.set("onMonthChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnOpenVarargs(value: Hook*): Self = this.set("onOpen", js.Array(value :_*))
    @scala.inline
    def setOnOpen(value: js.Array[Hook]): Self = this.set("onOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnParseConfigVarargs(value: Hook*): Self = this.set("onParseConfig", js.Array(value :_*))
    @scala.inline
    def setOnParseConfig(value: js.Array[Hook]): Self = this.set("onParseConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPreCalendarPositionVarargs(value: Hook*): Self = this.set("onPreCalendarPosition", js.Array(value :_*))
    @scala.inline
    def setOnPreCalendarPosition(value: js.Array[Hook]): Self = this.set("onPreCalendarPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnReadyVarargs(value: Hook*): Self = this.set("onReady", js.Array(value :_*))
    @scala.inline
    def setOnReady(value: js.Array[Hook]): Self = this.set("onReady", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnValueUpdateVarargs(value: Hook*): Self = this.set("onValueUpdate", js.Array(value :_*))
    @scala.inline
    def setOnValueUpdate(value: js.Array[Hook]): Self = this.set("onValueUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnYearChangeVarargs(value: Hook*): Self = this.set("onYearChange", js.Array(value :_*))
    @scala.inline
    def setOnYearChange(value: js.Array[Hook]): Self = this.set("onYearChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setPluginsVarargs(value: Plugin[js.Object]*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[Plugin[js.Object]]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: auto | above | below): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevArrow(value: String): Self = this.set("prevArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setShorthandCurrentMonth(value: Boolean): Self = this.set("shorthandCurrentMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowMonths(value: Double): Self = this.set("showMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime_24hr(value: Boolean): Self = this.set("time_24hr", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekNumbers(value: Boolean): Self = this.set("weekNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def set_maxDate(value: Date): Self = this.set("_maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_maxDate: Self = this.set("_maxDate", js.undefined)
    @scala.inline
    def set_maxTime(value: Date): Self = this.set("_maxTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_maxTime: Self = this.set("_maxTime", js.undefined)
    @scala.inline
    def set_minDate(value: Date): Self = this.set("_minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_minDate: Self = this.set("_minDate", js.undefined)
    @scala.inline
    def set_minTime(value: Date): Self = this.set("_minTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_minTime: Self = this.set("_minTime", js.undefined)
    @scala.inline
    def setAppendTo(value: HTMLElement): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    @scala.inline
    def setDefaultDateVarargs(value: Date*): Self = this.set("defaultDate", js.Array(value :_*))
    @scala.inline
    def setDefaultDate(value: Date | js.Array[Date]): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    @scala.inline
    def setFormatDate(value: (/* date */ Date, /* format */ String, /* locale */ Locale) => String): Self = this.set("formatDate", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFormatDate: Self = this.set("formatDate", js.undefined)
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMaxTime(value: Date): Self = this.set("maxTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTime: Self = this.set("maxTime", js.undefined)
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setMinTime(value: Date): Self = this.set("minTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTime: Self = this.set("minTime", js.undefined)
    @scala.inline
    def setParseDate(value: (/* date */ String, /* format */ String) => Date): Self = this.set("parseDate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteParseDate: Self = this.set("parseDate", js.undefined)
    @scala.inline
    def setPositionElement(value: HTMLElement): Self = this.set("positionElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionElement: Self = this.set("positionElement", js.undefined)
  }
  
}

