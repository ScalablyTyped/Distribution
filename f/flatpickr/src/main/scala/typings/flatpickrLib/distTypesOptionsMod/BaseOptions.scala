package typings
package flatpickrLib.distTypesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  var allowInput: scala.Boolean
  var altFormat: java.lang.String
  var altInput: scala.Boolean
  var altInputClass: java.lang.String
  var animate: scala.Boolean
  var appendTo: stdLib.HTMLElement
  var ariaDateFormat: java.lang.String
  var clickOpens: scala.Boolean
  var closeOnSelect: scala.Boolean
  var conjunction: java.lang.String
  var dateFormat: java.lang.String
  var defaultDate: DateOption | js.Array[DateOption]
  var defaultHour: scala.Double
  var defaultMinute: scala.Double
  var defaultSeconds: scala.Double
  var disable: js.Array[DateLimit[DateOption]]
  var disableMobile: scala.Boolean
  var enable: js.Array[DateLimit[DateOption]]
  var enableSeconds: scala.Boolean
  var enableTime: scala.Boolean
  var hourIncrement: scala.Double
  var ignoredFocusElements: js.Array[stdLib.HTMLElement]
  var `inline`: scala.Boolean
  var locale: flatpickrLib.distTypesLocaleMod.key | flatpickrLib.distTypesLocaleMod.CustomLocale
  var maxDate: DateOption
  var maxTime: DateOption
  var minDate: DateOption
  var minTime: DateOption
  var minuteIncrement: scala.Double
  var mode: flatpickrLib.flatpickrLibStrings.single | flatpickrLib.flatpickrLibStrings.multiple | flatpickrLib.flatpickrLibStrings.range | flatpickrLib.flatpickrLibStrings.time
  var nextArrow: java.lang.String
  var noCalendar: scala.Boolean
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
  var position: flatpickrLib.flatpickrLibStrings.auto | flatpickrLib.flatpickrLibStrings.above | flatpickrLib.flatpickrLibStrings.below
  var positionElement: stdLib.Element
  var prevArrow: java.lang.String
  var shorthandCurrentMonth: scala.Boolean
  var showMonths: js.UndefOr[scala.Double] = js.undefined
  var static: scala.Boolean
  var time_24hr: scala.Boolean
  var weekNumbers: scala.Boolean
  var wrap: scala.Boolean
  def errorHandler(e: stdLib.Error): scala.Unit
  def formatDate(date: stdLib.Date, format: java.lang.String, locale: flatpickrLib.distTypesLocaleMod.Locale): java.lang.String
  def getWeek(date: stdLib.Date): java.lang.String | scala.Double
  def parseDate(date: java.lang.String, format: java.lang.String): stdLib.Date
}

object BaseOptions {
  @scala.inline
  def apply(
    allowInput: scala.Boolean,
    altFormat: java.lang.String,
    altInput: scala.Boolean,
    altInputClass: java.lang.String,
    animate: scala.Boolean,
    appendTo: stdLib.HTMLElement,
    ariaDateFormat: java.lang.String,
    clickOpens: scala.Boolean,
    closeOnSelect: scala.Boolean,
    conjunction: java.lang.String,
    dateFormat: java.lang.String,
    defaultDate: DateOption | js.Array[DateOption],
    defaultHour: scala.Double,
    defaultMinute: scala.Double,
    defaultSeconds: scala.Double,
    disable: js.Array[DateLimit[DateOption]],
    disableMobile: scala.Boolean,
    enable: js.Array[DateLimit[DateOption]],
    enableSeconds: scala.Boolean,
    enableTime: scala.Boolean,
    errorHandler: stdLib.Error => scala.Unit,
    formatDate: (stdLib.Date, java.lang.String, flatpickrLib.distTypesLocaleMod.Locale) => java.lang.String,
    getWeek: stdLib.Date => java.lang.String | scala.Double,
    hourIncrement: scala.Double,
    ignoredFocusElements: js.Array[stdLib.HTMLElement],
    `inline`: scala.Boolean,
    locale: flatpickrLib.distTypesLocaleMod.key | flatpickrLib.distTypesLocaleMod.CustomLocale,
    maxDate: DateOption,
    maxTime: DateOption,
    minDate: DateOption,
    minTime: DateOption,
    minuteIncrement: scala.Double,
    mode: flatpickrLib.flatpickrLibStrings.single | flatpickrLib.flatpickrLibStrings.multiple | flatpickrLib.flatpickrLibStrings.range | flatpickrLib.flatpickrLibStrings.time,
    nextArrow: java.lang.String,
    noCalendar: scala.Boolean,
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
    parseDate: (java.lang.String, java.lang.String) => stdLib.Date,
    plugins: js.Array[Plugin[js.Object]],
    position: flatpickrLib.flatpickrLibStrings.auto | flatpickrLib.flatpickrLibStrings.above | flatpickrLib.flatpickrLibStrings.below,
    positionElement: stdLib.Element,
    prevArrow: java.lang.String,
    shorthandCurrentMonth: scala.Boolean,
    static: scala.Boolean,
    time_24hr: scala.Boolean,
    weekNumbers: scala.Boolean,
    wrap: scala.Boolean,
    now: DateOption = null,
    showMonths: scala.Int | scala.Double = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal(allowInput = allowInput, altFormat = altFormat, altInput = altInput, altInputClass = altInputClass, animate = animate, appendTo = appendTo, ariaDateFormat = ariaDateFormat, clickOpens = clickOpens, closeOnSelect = closeOnSelect, conjunction = conjunction, dateFormat = dateFormat, defaultDate = defaultDate.asInstanceOf[js.Any], defaultHour = defaultHour, defaultMinute = defaultMinute, defaultSeconds = defaultSeconds, disable = disable, disableMobile = disableMobile, enable = enable, enableSeconds = enableSeconds, enableTime = enableTime, errorHandler = js.Any.fromFunction1(errorHandler), formatDate = js.Any.fromFunction3(formatDate), getWeek = js.Any.fromFunction1(getWeek), hourIncrement = hourIncrement, ignoredFocusElements = ignoredFocusElements, locale = locale.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], maxTime = maxTime.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any], minuteIncrement = minuteIncrement, mode = mode.asInstanceOf[js.Any], nextArrow = nextArrow, noCalendar = noCalendar, onChange = onChange.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any], onDayCreate = onDayCreate.asInstanceOf[js.Any], onDestroy = onDestroy.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onMonthChange = onMonthChange.asInstanceOf[js.Any], onOpen = onOpen.asInstanceOf[js.Any], onParseConfig = onParseConfig.asInstanceOf[js.Any], onPreCalendarPosition = onPreCalendarPosition.asInstanceOf[js.Any], onReady = onReady.asInstanceOf[js.Any], onValueUpdate = onValueUpdate.asInstanceOf[js.Any], onYearChange = onYearChange.asInstanceOf[js.Any], parseDate = js.Any.fromFunction2(parseDate), plugins = plugins, position = position.asInstanceOf[js.Any], positionElement = positionElement, prevArrow = prevArrow, shorthandCurrentMonth = shorthandCurrentMonth, static = static, time_24hr = time_24hr, weekNumbers = weekNumbers, wrap = wrap)
    __obj.updateDynamic("inline")(`inline`)
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (showMonths != null) __obj.updateDynamic("showMonths")(showMonths.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

