package typings.flatpickr.distTypesOptionsMod

import typings.flatpickr.distTypesLocaleMod.CustomLocale
import typings.flatpickr.distTypesLocaleMod.key
import typings.flatpickr.flatpickrStrings.above
import typings.flatpickr.flatpickrStrings.auto
import typings.flatpickr.flatpickrStrings.below
import typings.flatpickr.flatpickrStrings.multiple
import typings.flatpickr.flatpickrStrings.range
import typings.flatpickr.flatpickrStrings.single
import typings.flatpickr.flatpickrStrings.time
import typings.std.Date
import typings.std.Error
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedOptions extends js.Object {
  var _disable: js.Array[DateLimit[Date]]
  var _enable: js.Array[DateLimit[Date]]
  var _maxDate: js.UndefOr[Date] = js.undefined
  var _maxTime: js.UndefOr[Date] = js.undefined
  var _minDate: js.UndefOr[Date] = js.undefined
  var _minTime: js.UndefOr[Date] = js.undefined
  var allowInput: Boolean
  var altFormat: String
  var altInput: Boolean
  var altInputClass: String
  var animate: Boolean
  var appendTo: js.UndefOr[HTMLElement] = js.undefined
  var ariaDateFormat: String
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
  var formatDate: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: flatpickr.flatpickr/dist/types/options.Options['formatDate'] */ js.Any
  ] = js.undefined
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
  def errorHandler(err: Error): Unit
  def getWeek(date: Date): String | Double
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
    wrap: Boolean,
    _maxDate: Date = null,
    _maxTime: Date = null,
    _minDate: Date = null,
    _minTime: Date = null,
    appendTo: HTMLElement = null,
    defaultDate: Date | js.Array[Date] = null,
    formatDate: /* import warning: ImportType.apply Failed type conversion: flatpickr.flatpickr/dist/types/options.Options['formatDate'] */ js.Any = null,
    maxDate: Date = null,
    maxTime: Date = null,
    minDate: Date = null,
    minTime: Date = null,
    parseDate: (/* date */ String, /* format */ String) => Date = null,
    positionElement: HTMLElement = null
  ): ParsedOptions = {
    val __obj = js.Dynamic.literal(_disable = _disable, _enable = _enable, allowInput = allowInput, altFormat = altFormat, altInput = altInput, altInputClass = altInputClass, animate = animate, ariaDateFormat = ariaDateFormat, clickOpens = clickOpens, closeOnSelect = closeOnSelect, conjunction = conjunction, dateFormat = dateFormat, defaultHour = defaultHour, defaultMinute = defaultMinute, defaultSeconds = defaultSeconds, disable = disable, disableMobile = disableMobile, enable = enable, enableSeconds = enableSeconds, enableTime = enableTime, errorHandler = js.Any.fromFunction1(errorHandler), getWeek = js.Any.fromFunction1(getWeek), hourIncrement = hourIncrement, ignoredFocusElements = ignoredFocusElements, locale = locale.asInstanceOf[js.Any], minuteIncrement = minuteIncrement, mode = mode.asInstanceOf[js.Any], monthSelectorType = monthSelectorType, nextArrow = nextArrow, noCalendar = noCalendar, now = now, onChange = onChange, onClose = onClose, onDayCreate = onDayCreate, onDestroy = onDestroy, onKeyDown = onKeyDown, onMonthChange = onMonthChange, onOpen = onOpen, onParseConfig = onParseConfig, onPreCalendarPosition = onPreCalendarPosition, onReady = onReady, onValueUpdate = onValueUpdate, onYearChange = onYearChange, plugins = plugins, position = position.asInstanceOf[js.Any], prevArrow = prevArrow, shorthandCurrentMonth = shorthandCurrentMonth, showMonths = showMonths, static = static, time_24hr = time_24hr, weekNumbers = weekNumbers, wrap = wrap)
    __obj.updateDynamic("inline")(`inline`)
    if (_maxDate != null) __obj.updateDynamic("_maxDate")(_maxDate)
    if (_maxTime != null) __obj.updateDynamic("_maxTime")(_maxTime)
    if (_minDate != null) __obj.updateDynamic("_minDate")(_minDate)
    if (_minTime != null) __obj.updateDynamic("_minTime")(_minTime)
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (formatDate != null) __obj.updateDynamic("formatDate")(formatDate)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (minTime != null) __obj.updateDynamic("minTime")(minTime)
    if (parseDate != null) __obj.updateDynamic("parseDate")(js.Any.fromFunction2(parseDate))
    if (positionElement != null) __obj.updateDynamic("positionElement")(positionElement)
    __obj.asInstanceOf[ParsedOptions]
  }
}

