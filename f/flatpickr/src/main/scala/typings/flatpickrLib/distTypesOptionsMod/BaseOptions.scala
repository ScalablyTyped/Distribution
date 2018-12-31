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

