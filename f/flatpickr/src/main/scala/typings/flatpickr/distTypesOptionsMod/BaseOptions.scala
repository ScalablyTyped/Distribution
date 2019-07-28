package typings.flatpickr.distTypesOptionsMod

import typings.flatpickr.distTypesLocaleMod.CustomLocale
import typings.flatpickr.distTypesLocaleMod.Locale
import typings.flatpickr.distTypesLocaleMod.key
import typings.flatpickr.flatpickrStrings.above
import typings.flatpickr.flatpickrStrings.auto
import typings.flatpickr.flatpickrStrings.below
import typings.flatpickr.flatpickrStrings.dropdown
import typings.flatpickr.flatpickrStrings.multiple
import typings.flatpickr.flatpickrStrings.range
import typings.flatpickr.flatpickrStrings.single
import typings.flatpickr.flatpickrStrings.static
import typings.flatpickr.flatpickrStrings.time
import typings.std.Date
import typings.std.Element
import typings.std.Error
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  var allowInput: Boolean
  var altFormat: String
  var altInput: Boolean
  var altInputClass: String
  var animate: Boolean
  var appendTo: HTMLElement
  var ariaDateFormat: String
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
  def errorHandler(e: Error): Unit
  def formatDate(date: Date, format: String, locale: Locale): String
  def getWeek(date: Date): String | Double
  def parseDate(date: String, format: String): Date
}

object BaseOptions {
  @scala.inline
  def apply(
    allowInput: Boolean,
    altFormat: String,
    altInput: Boolean,
    altInputClass: String,
    animate: Boolean,
    appendTo: HTMLElement,
    ariaDateFormat: String,
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
    wrap: Boolean,
    now: DateOption = null,
    showMonths: Int | Double = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal(allowInput = allowInput, altFormat = altFormat, altInput = altInput, altInputClass = altInputClass, animate = animate, appendTo = appendTo, ariaDateFormat = ariaDateFormat, clickOpens = clickOpens, closeOnSelect = closeOnSelect, conjunction = conjunction, dateFormat = dateFormat, defaultDate = defaultDate.asInstanceOf[js.Any], defaultHour = defaultHour, defaultMinute = defaultMinute, defaultSeconds = defaultSeconds, disable = disable, disableMobile = disableMobile, enable = enable, enableSeconds = enableSeconds, enableTime = enableTime, errorHandler = js.Any.fromFunction1(errorHandler), formatDate = js.Any.fromFunction3(formatDate), getWeek = js.Any.fromFunction1(getWeek), hourIncrement = hourIncrement, ignoredFocusElements = ignoredFocusElements, locale = locale.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], maxTime = maxTime.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any], minuteIncrement = minuteIncrement, mode = mode.asInstanceOf[js.Any], monthSelectorType = monthSelectorType.asInstanceOf[js.Any], nextArrow = nextArrow, noCalendar = noCalendar, onChange = onChange.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any], onDayCreate = onDayCreate.asInstanceOf[js.Any], onDestroy = onDestroy.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onMonthChange = onMonthChange.asInstanceOf[js.Any], onOpen = onOpen.asInstanceOf[js.Any], onParseConfig = onParseConfig.asInstanceOf[js.Any], onPreCalendarPosition = onPreCalendarPosition.asInstanceOf[js.Any], onReady = onReady.asInstanceOf[js.Any], onValueUpdate = onValueUpdate.asInstanceOf[js.Any], onYearChange = onYearChange.asInstanceOf[js.Any], parseDate = js.Any.fromFunction2(parseDate), plugins = plugins, position = position.asInstanceOf[js.Any], positionElement = positionElement, prevArrow = prevArrow, shorthandCurrentMonth = shorthandCurrentMonth, static = static, time_24hr = time_24hr, weekNumbers = weekNumbers, wrap = wrap)
    __obj.updateDynamic("inline")(`inline`)
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (showMonths != null) __obj.updateDynamic("showMonths")(showMonths.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

