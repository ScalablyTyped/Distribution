package typings.flatpickr.anon

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
import typings.flatpickr.optionsMod.DateLimit
import typings.flatpickr.optionsMod.Hook
import typings.flatpickr.optionsMod.Plugin
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<flatpickr.flatpickr/dist/types/options.ParsedOptions> */
trait PartialParsedOptions extends js.Object {
  var _disable: js.UndefOr[js.Array[DateLimit[Date]]] = js.undefined
  var _enable: js.UndefOr[js.Array[DateLimit[Date]]] = js.undefined
  var _maxDate: js.UndefOr[Date] = js.undefined
  var _maxTime: js.UndefOr[Date] = js.undefined
  var _minDate: js.UndefOr[Date] = js.undefined
  var _minTime: js.UndefOr[Date] = js.undefined
  var allowInput: js.UndefOr[Boolean] = js.undefined
  var altFormat: js.UndefOr[String] = js.undefined
  var altInput: js.UndefOr[Boolean] = js.undefined
  var altInputClass: js.UndefOr[String] = js.undefined
  var animate: js.UndefOr[Boolean] = js.undefined
  var appendTo: js.UndefOr[HTMLElement] = js.undefined
  var ariaDateFormat: js.UndefOr[String] = js.undefined
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
  var errorHandler: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.undefined
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
  var position: js.UndefOr[auto | above | below] = js.undefined
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
  @scala.inline
  def apply(
    _disable: js.Array[DateLimit[Date]] = null,
    _enable: js.Array[DateLimit[Date]] = null,
    _maxDate: Date = null,
    _maxTime: Date = null,
    _minDate: Date = null,
    _minTime: Date = null,
    allowInput: js.UndefOr[Boolean] = js.undefined,
    altFormat: String = null,
    altInput: js.UndefOr[Boolean] = js.undefined,
    altInputClass: String = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    appendTo: HTMLElement = null,
    ariaDateFormat: String = null,
    clickOpens: js.UndefOr[Boolean] = js.undefined,
    closeOnSelect: js.UndefOr[Boolean] = js.undefined,
    conjunction: String = null,
    dateFormat: String = null,
    defaultDate: Date | js.Array[Date] = null,
    defaultHour: js.UndefOr[Double] = js.undefined,
    defaultMinute: js.UndefOr[Double] = js.undefined,
    defaultSeconds: js.UndefOr[Double] = js.undefined,
    disable: js.Array[DateLimit[Date]] = null,
    disableMobile: js.UndefOr[Boolean] = js.undefined,
    enable: js.Array[DateLimit[Date]] = null,
    enableSeconds: js.UndefOr[Boolean] = js.undefined,
    enableTime: js.UndefOr[Boolean] = js.undefined,
    errorHandler: /* err */ Error => Unit = null,
    formatDate: (/* date */ Date, /* format */ String, /* locale */ Locale) => String = null,
    getWeek: /* date */ Date => String | Double = null,
    hourIncrement: js.UndefOr[Double] = js.undefined,
    ignoredFocusElements: js.Array[HTMLElement] = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    locale: key | CustomLocale = null,
    maxDate: Date = null,
    maxTime: Date = null,
    minDate: Date = null,
    minTime: Date = null,
    minuteIncrement: js.UndefOr[Double] = js.undefined,
    mode: single | multiple | range | time = null,
    monthSelectorType: String = null,
    nextArrow: String = null,
    noCalendar: js.UndefOr[Boolean] = js.undefined,
    now: Date = null,
    onChange: js.Array[Hook] = null,
    onClose: js.Array[Hook] = null,
    onDayCreate: js.Array[Hook] = null,
    onDestroy: js.Array[Hook] = null,
    onKeyDown: js.Array[Hook] = null,
    onMonthChange: js.Array[Hook] = null,
    onOpen: js.Array[Hook] = null,
    onParseConfig: js.Array[Hook] = null,
    onPreCalendarPosition: js.Array[Hook] = null,
    onReady: js.Array[Hook] = null,
    onValueUpdate: js.Array[Hook] = null,
    onYearChange: js.Array[Hook] = null,
    parseDate: (/* date */ String, /* format */ String) => Date = null,
    plugins: js.Array[Plugin[js.Object]] = null,
    position: auto | above | below = null,
    positionElement: HTMLElement = null,
    prevArrow: String = null,
    shorthandCurrentMonth: js.UndefOr[Boolean] = js.undefined,
    showMonths: js.UndefOr[Double] = js.undefined,
    static: js.UndefOr[Boolean] = js.undefined,
    time_24hr: js.UndefOr[Boolean] = js.undefined,
    weekNumbers: js.UndefOr[Boolean] = js.undefined,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): PartialParsedOptions = {
    val __obj = js.Dynamic.literal()
    if (_disable != null) __obj.updateDynamic("_disable")(_disable.asInstanceOf[js.Any])
    if (_enable != null) __obj.updateDynamic("_enable")(_enable.asInstanceOf[js.Any])
    if (_maxDate != null) __obj.updateDynamic("_maxDate")(_maxDate.asInstanceOf[js.Any])
    if (_maxTime != null) __obj.updateDynamic("_maxTime")(_maxTime.asInstanceOf[js.Any])
    if (_minDate != null) __obj.updateDynamic("_minDate")(_minDate.asInstanceOf[js.Any])
    if (_minTime != null) __obj.updateDynamic("_minTime")(_minTime.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInput)) __obj.updateDynamic("allowInput")(allowInput.get.asInstanceOf[js.Any])
    if (altFormat != null) __obj.updateDynamic("altFormat")(altFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(altInput)) __obj.updateDynamic("altInput")(altInput.get.asInstanceOf[js.Any])
    if (altInputClass != null) __obj.updateDynamic("altInputClass")(altInputClass.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (ariaDateFormat != null) __obj.updateDynamic("ariaDateFormat")(ariaDateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(clickOpens)) __obj.updateDynamic("clickOpens")(clickOpens.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect.get.asInstanceOf[js.Any])
    if (conjunction != null) __obj.updateDynamic("conjunction")(conjunction.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultHour)) __obj.updateDynamic("defaultHour")(defaultHour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMinute)) __obj.updateDynamic("defaultMinute")(defaultMinute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultSeconds)) __obj.updateDynamic("defaultSeconds")(defaultSeconds.get.asInstanceOf[js.Any])
    if (disable != null) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMobile)) __obj.updateDynamic("disableMobile")(disableMobile.get.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSeconds)) __obj.updateDynamic("enableSeconds")(enableSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTime)) __obj.updateDynamic("enableTime")(enableTime.get.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction1(errorHandler))
    if (formatDate != null) __obj.updateDynamic("formatDate")(js.Any.fromFunction3(formatDate))
    if (getWeek != null) __obj.updateDynamic("getWeek")(js.Any.fromFunction1(getWeek))
    if (!js.isUndefined(hourIncrement)) __obj.updateDynamic("hourIncrement")(hourIncrement.get.asInstanceOf[js.Any])
    if (ignoredFocusElements != null) __obj.updateDynamic("ignoredFocusElements")(ignoredFocusElements.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    if (!js.isUndefined(minuteIncrement)) __obj.updateDynamic("minuteIncrement")(minuteIncrement.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthSelectorType != null) __obj.updateDynamic("monthSelectorType")(monthSelectorType.asInstanceOf[js.Any])
    if (nextArrow != null) __obj.updateDynamic("nextArrow")(nextArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(noCalendar)) __obj.updateDynamic("noCalendar")(noCalendar.get.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose.asInstanceOf[js.Any])
    if (onDayCreate != null) __obj.updateDynamic("onDayCreate")(onDayCreate.asInstanceOf[js.Any])
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(onDestroy.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown.asInstanceOf[js.Any])
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(onMonthChange.asInstanceOf[js.Any])
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen.asInstanceOf[js.Any])
    if (onParseConfig != null) __obj.updateDynamic("onParseConfig")(onParseConfig.asInstanceOf[js.Any])
    if (onPreCalendarPosition != null) __obj.updateDynamic("onPreCalendarPosition")(onPreCalendarPosition.asInstanceOf[js.Any])
    if (onReady != null) __obj.updateDynamic("onReady")(onReady.asInstanceOf[js.Any])
    if (onValueUpdate != null) __obj.updateDynamic("onValueUpdate")(onValueUpdate.asInstanceOf[js.Any])
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(onYearChange.asInstanceOf[js.Any])
    if (parseDate != null) __obj.updateDynamic("parseDate")(js.Any.fromFunction2(parseDate))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (positionElement != null) __obj.updateDynamic("positionElement")(positionElement.asInstanceOf[js.Any])
    if (prevArrow != null) __obj.updateDynamic("prevArrow")(prevArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(shorthandCurrentMonth)) __obj.updateDynamic("shorthandCurrentMonth")(shorthandCurrentMonth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonths)) __obj.updateDynamic("showMonths")(showMonths.get.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time_24hr)) __obj.updateDynamic("time_24hr")(time_24hr.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weekNumbers)) __obj.updateDynamic("weekNumbers")(weekNumbers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialParsedOptions]
  }
}

