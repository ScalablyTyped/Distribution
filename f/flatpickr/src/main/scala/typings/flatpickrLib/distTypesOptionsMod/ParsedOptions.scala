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

