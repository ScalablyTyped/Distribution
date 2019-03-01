package typings
package flatpickrLib.distTypesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedOptions extends js.Object {
  var _disable: js.Array[DateLimit[stdLib.Date]]
  var _enable: js.Array[DateLimit[stdLib.Date]]
  var _maxDate: js.UndefOr[stdLib.Date] = js.undefined
  var _maxTime: js.UndefOr[stdLib.Date] = js.undefined
  var _minDate: js.UndefOr[stdLib.Date] = js.undefined
  var _minTime: js.UndefOr[stdLib.Date] = js.undefined
  var allowInput: scala.Boolean
  var altFormat: java.lang.String
  var altInput: scala.Boolean
  var altInputClass: java.lang.String
  var animate: scala.Boolean
  var appendTo: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var ariaDateFormat: java.lang.String
  var clickOpens: scala.Boolean
  var closeOnSelect: scala.Boolean
  var conjunction: java.lang.String
  var dateFormat: java.lang.String
  var defaultDate: js.UndefOr[stdLib.Date | js.Array[stdLib.Date]] = js.undefined
  var defaultHour: scala.Double
  var defaultMinute: scala.Double
  var defaultSeconds: scala.Double
  var disable: js.Array[DateLimit[stdLib.Date]]
  var disableMobile: scala.Boolean
  var enable: js.Array[DateLimit[stdLib.Date]]
  var enableSeconds: scala.Boolean
  var enableTime: scala.Boolean
  var formatDate: js.UndefOr[js.Any] = js.undefined
  var hourIncrement: scala.Double
  var ignoredFocusElements: js.Array[stdLib.HTMLElement]
  var `inline`: scala.Boolean
  var locale: flatpickrLib.distTypesLocaleMod.key | flatpickrLib.distTypesLocaleMod.CustomLocale
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  var maxTime: js.UndefOr[stdLib.Date] = js.undefined
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  var minTime: js.UndefOr[stdLib.Date] = js.undefined
  var minuteIncrement: scala.Double
  var mode: flatpickrLib.flatpickrLibStrings.single | flatpickrLib.flatpickrLibStrings.multiple | flatpickrLib.flatpickrLibStrings.range | flatpickrLib.flatpickrLibStrings.time
  var nextArrow: java.lang.String
  var noCalendar: scala.Boolean
  var now: stdLib.Date
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
  var parseDate: js.UndefOr[
    js.Function2[/* date */ java.lang.String, /* format */ java.lang.String, stdLib.Date]
  ] = js.undefined
  var plugins: js.Array[Plugin[js.Object]]
  var position: flatpickrLib.flatpickrLibStrings.auto | flatpickrLib.flatpickrLibStrings.above | flatpickrLib.flatpickrLibStrings.below
  var positionElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var prevArrow: java.lang.String
  var shorthandCurrentMonth: scala.Boolean
  var showMonths: scala.Double
  var static: scala.Boolean
  var time_24hr: scala.Boolean
  var weekNumbers: scala.Boolean
  var wrap: scala.Boolean
  def errorHandler(err: stdLib.Error): scala.Unit
  def getWeek(date: stdLib.Date): java.lang.String | scala.Double
}

object ParsedOptions {
  @scala.inline
  def apply(
    _disable: js.Array[DateLimit[stdLib.Date]],
    _enable: js.Array[DateLimit[stdLib.Date]],
    allowInput: scala.Boolean,
    altFormat: java.lang.String,
    altInput: scala.Boolean,
    altInputClass: java.lang.String,
    animate: scala.Boolean,
    ariaDateFormat: java.lang.String,
    clickOpens: scala.Boolean,
    closeOnSelect: scala.Boolean,
    conjunction: java.lang.String,
    dateFormat: java.lang.String,
    defaultHour: scala.Double,
    defaultMinute: scala.Double,
    defaultSeconds: scala.Double,
    disable: js.Array[DateLimit[stdLib.Date]],
    disableMobile: scala.Boolean,
    enable: js.Array[DateLimit[stdLib.Date]],
    enableSeconds: scala.Boolean,
    enableTime: scala.Boolean,
    errorHandler: js.Function1[stdLib.Error, scala.Unit],
    getWeek: js.Function1[stdLib.Date, java.lang.String | scala.Double],
    hourIncrement: scala.Double,
    ignoredFocusElements: js.Array[stdLib.HTMLElement],
    `inline`: scala.Boolean,
    locale: flatpickrLib.distTypesLocaleMod.key | flatpickrLib.distTypesLocaleMod.CustomLocale,
    minuteIncrement: scala.Double,
    mode: flatpickrLib.flatpickrLibStrings.single | flatpickrLib.flatpickrLibStrings.multiple | flatpickrLib.flatpickrLibStrings.range | flatpickrLib.flatpickrLibStrings.time,
    nextArrow: java.lang.String,
    noCalendar: scala.Boolean,
    now: stdLib.Date,
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
    position: flatpickrLib.flatpickrLibStrings.auto | flatpickrLib.flatpickrLibStrings.above | flatpickrLib.flatpickrLibStrings.below,
    prevArrow: java.lang.String,
    shorthandCurrentMonth: scala.Boolean,
    showMonths: scala.Double,
    static: scala.Boolean,
    time_24hr: scala.Boolean,
    weekNumbers: scala.Boolean,
    wrap: scala.Boolean,
    _maxDate: stdLib.Date = null,
    _maxTime: stdLib.Date = null,
    _minDate: stdLib.Date = null,
    _minTime: stdLib.Date = null,
    appendTo: stdLib.HTMLElement = null,
    defaultDate: stdLib.Date | js.Array[stdLib.Date] = null,
    formatDate: js.Any = null,
    maxDate: stdLib.Date = null,
    maxTime: stdLib.Date = null,
    minDate: stdLib.Date = null,
    minTime: stdLib.Date = null,
    parseDate: js.Function2[/* date */ java.lang.String, /* format */ java.lang.String, stdLib.Date] = null,
    positionElement: stdLib.HTMLElement = null
  ): ParsedOptions = {
    val __obj = js.Dynamic.literal(`inline` = `inline`)
    __obj.updateDynamic("_disable")(_disable)
    __obj.updateDynamic("_enable")(_enable)
    __obj.updateDynamic("allowInput")(allowInput)
    __obj.updateDynamic("altFormat")(altFormat)
    __obj.updateDynamic("altInput")(altInput)
    __obj.updateDynamic("altInputClass")(altInputClass)
    __obj.updateDynamic("animate")(animate)
    __obj.updateDynamic("ariaDateFormat")(ariaDateFormat)
    __obj.updateDynamic("clickOpens")(clickOpens)
    __obj.updateDynamic("closeOnSelect")(closeOnSelect)
    __obj.updateDynamic("conjunction")(conjunction)
    __obj.updateDynamic("dateFormat")(dateFormat)
    __obj.updateDynamic("defaultHour")(defaultHour)
    __obj.updateDynamic("defaultMinute")(defaultMinute)
    __obj.updateDynamic("defaultSeconds")(defaultSeconds)
    __obj.updateDynamic("disable")(disable)
    __obj.updateDynamic("disableMobile")(disableMobile)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("enableSeconds")(enableSeconds)
    __obj.updateDynamic("enableTime")(enableTime)
    __obj.updateDynamic("errorHandler")(errorHandler)
    __obj.updateDynamic("getWeek")(getWeek)
    __obj.updateDynamic("hourIncrement")(hourIncrement)
    __obj.updateDynamic("ignoredFocusElements")(ignoredFocusElements)
    __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.updateDynamic("minuteIncrement")(minuteIncrement)
    __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.updateDynamic("nextArrow")(nextArrow)
    __obj.updateDynamic("noCalendar")(noCalendar)
    __obj.updateDynamic("now")(now)
    __obj.updateDynamic("onChange")(onChange)
    __obj.updateDynamic("onClose")(onClose)
    __obj.updateDynamic("onDayCreate")(onDayCreate)
    __obj.updateDynamic("onDestroy")(onDestroy)
    __obj.updateDynamic("onKeyDown")(onKeyDown)
    __obj.updateDynamic("onMonthChange")(onMonthChange)
    __obj.updateDynamic("onOpen")(onOpen)
    __obj.updateDynamic("onParseConfig")(onParseConfig)
    __obj.updateDynamic("onPreCalendarPosition")(onPreCalendarPosition)
    __obj.updateDynamic("onReady")(onReady)
    __obj.updateDynamic("onValueUpdate")(onValueUpdate)
    __obj.updateDynamic("onYearChange")(onYearChange)
    __obj.updateDynamic("plugins")(plugins)
    __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.updateDynamic("prevArrow")(prevArrow)
    __obj.updateDynamic("shorthandCurrentMonth")(shorthandCurrentMonth)
    __obj.updateDynamic("showMonths")(showMonths)
    __obj.updateDynamic("static")(static)
    __obj.updateDynamic("time_24hr")(time_24hr)
    __obj.updateDynamic("weekNumbers")(weekNumbers)
    __obj.updateDynamic("wrap")(wrap)
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
    if (parseDate != null) __obj.updateDynamic("parseDate")(parseDate)
    if (positionElement != null) __obj.updateDynamic("positionElement")(positionElement)
    __obj.asInstanceOf[ParsedOptions]
  }
}

