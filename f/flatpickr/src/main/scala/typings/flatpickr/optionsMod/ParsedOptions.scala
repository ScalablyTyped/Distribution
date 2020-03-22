package typings.flatpickr.optionsMod

import typings.flatpickr.flatpickrStrings.above
import typings.flatpickr.flatpickrStrings.auto
import typings.flatpickr.flatpickrStrings.below
import typings.flatpickr.flatpickrStrings.multiple
import typings.flatpickr.flatpickrStrings.range
import typings.flatpickr.flatpickrStrings.single
import typings.flatpickr.flatpickrStrings.time
import typings.flatpickr.globalsMod._Global_.Date
import typings.flatpickr.globalsMod._Global_.HTMLElement
import typings.flatpickr.localeMod.CustomLocale
import typings.flatpickr.localeMod.Locale
import typings.flatpickr.localeMod.key
import typings.std.Error
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
  var formatDate: js.UndefOr[js.Function3[/* date */ Date, /* format */ String, /* locale */ Locale, String]] = js.undefined
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
    formatDate: (/* date */ Date, /* format */ String, /* locale */ Locale) => String = null,
    maxDate: Date = null,
    maxTime: Date = null,
    minDate: Date = null,
    minTime: Date = null,
    parseDate: (/* date */ String, /* format */ String) => Date = null,
    positionElement: HTMLElement = null
  ): ParsedOptions = {
    val __obj = js.Dynamic.literal(_disable = _disable.asInstanceOf[js.Any], _enable = _enable.asInstanceOf[js.Any], allowInput = allowInput.asInstanceOf[js.Any], altFormat = altFormat.asInstanceOf[js.Any], altInput = altInput.asInstanceOf[js.Any], altInputClass = altInputClass.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], ariaDateFormat = ariaDateFormat.asInstanceOf[js.Any], clickOpens = clickOpens.asInstanceOf[js.Any], closeOnSelect = closeOnSelect.asInstanceOf[js.Any], conjunction = conjunction.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], defaultHour = defaultHour.asInstanceOf[js.Any], defaultMinute = defaultMinute.asInstanceOf[js.Any], defaultSeconds = defaultSeconds.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], disableMobile = disableMobile.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], enableSeconds = enableSeconds.asInstanceOf[js.Any], enableTime = enableTime.asInstanceOf[js.Any], errorHandler = js.Any.fromFunction1(errorHandler), getWeek = js.Any.fromFunction1(getWeek), hourIncrement = hourIncrement.asInstanceOf[js.Any], ignoredFocusElements = ignoredFocusElements.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minuteIncrement = minuteIncrement.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], monthSelectorType = monthSelectorType.asInstanceOf[js.Any], nextArrow = nextArrow.asInstanceOf[js.Any], noCalendar = noCalendar.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any], onDayCreate = onDayCreate.asInstanceOf[js.Any], onDestroy = onDestroy.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onMonthChange = onMonthChange.asInstanceOf[js.Any], onOpen = onOpen.asInstanceOf[js.Any], onParseConfig = onParseConfig.asInstanceOf[js.Any], onPreCalendarPosition = onPreCalendarPosition.asInstanceOf[js.Any], onReady = onReady.asInstanceOf[js.Any], onValueUpdate = onValueUpdate.asInstanceOf[js.Any], onYearChange = onYearChange.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], prevArrow = prevArrow.asInstanceOf[js.Any], shorthandCurrentMonth = shorthandCurrentMonth.asInstanceOf[js.Any], showMonths = showMonths.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], time_24hr = time_24hr.asInstanceOf[js.Any], weekNumbers = weekNumbers.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (_maxDate != null) __obj.updateDynamic("_maxDate")(_maxDate.asInstanceOf[js.Any])
    if (_maxTime != null) __obj.updateDynamic("_maxTime")(_maxTime.asInstanceOf[js.Any])
    if (_minDate != null) __obj.updateDynamic("_minDate")(_minDate.asInstanceOf[js.Any])
    if (_minTime != null) __obj.updateDynamic("_minTime")(_minTime.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (formatDate != null) __obj.updateDynamic("formatDate")(js.Any.fromFunction3(formatDate))
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    if (parseDate != null) __obj.updateDynamic("parseDate")(js.Any.fromFunction2(parseDate))
    if (positionElement != null) __obj.updateDynamic("positionElement")(positionElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedOptions]
  }
}

