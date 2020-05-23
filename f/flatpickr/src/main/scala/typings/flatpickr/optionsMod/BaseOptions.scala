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
import typings.flatpickr.localeMod.CustomLocale
import typings.flatpickr.localeMod.Locale
import typings.flatpickr.localeMod.key
import typings.std.Element
import typings.std.Error
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
    showMonths: js.UndefOr[Double] = js.undefined
  ): BaseOptions = {
    val __obj = js.Dynamic.literal(allowInput = allowInput.asInstanceOf[js.Any], altFormat = altFormat.asInstanceOf[js.Any], altInput = altInput.asInstanceOf[js.Any], altInputClass = altInputClass.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], appendTo = appendTo.asInstanceOf[js.Any], ariaDateFormat = ariaDateFormat.asInstanceOf[js.Any], clickOpens = clickOpens.asInstanceOf[js.Any], closeOnSelect = closeOnSelect.asInstanceOf[js.Any], conjunction = conjunction.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], defaultDate = defaultDate.asInstanceOf[js.Any], defaultHour = defaultHour.asInstanceOf[js.Any], defaultMinute = defaultMinute.asInstanceOf[js.Any], defaultSeconds = defaultSeconds.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], disableMobile = disableMobile.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], enableSeconds = enableSeconds.asInstanceOf[js.Any], enableTime = enableTime.asInstanceOf[js.Any], errorHandler = js.Any.fromFunction1(errorHandler), formatDate = js.Any.fromFunction3(formatDate), getWeek = js.Any.fromFunction1(getWeek), hourIncrement = hourIncrement.asInstanceOf[js.Any], ignoredFocusElements = ignoredFocusElements.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], maxTime = maxTime.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any], minuteIncrement = minuteIncrement.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], monthSelectorType = monthSelectorType.asInstanceOf[js.Any], nextArrow = nextArrow.asInstanceOf[js.Any], noCalendar = noCalendar.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any], onDayCreate = onDayCreate.asInstanceOf[js.Any], onDestroy = onDestroy.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onMonthChange = onMonthChange.asInstanceOf[js.Any], onOpen = onOpen.asInstanceOf[js.Any], onParseConfig = onParseConfig.asInstanceOf[js.Any], onPreCalendarPosition = onPreCalendarPosition.asInstanceOf[js.Any], onReady = onReady.asInstanceOf[js.Any], onValueUpdate = onValueUpdate.asInstanceOf[js.Any], onYearChange = onYearChange.asInstanceOf[js.Any], parseDate = js.Any.fromFunction2(parseDate), plugins = plugins.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positionElement = positionElement.asInstanceOf[js.Any], prevArrow = prevArrow.asInstanceOf[js.Any], shorthandCurrentMonth = shorthandCurrentMonth.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], time_24hr = time_24hr.asInstanceOf[js.Any], weekNumbers = weekNumbers.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonths)) __obj.updateDynamic("showMonths")(showMonths.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

