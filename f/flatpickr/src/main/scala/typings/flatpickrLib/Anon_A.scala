package typings
package flatpickrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_A extends js.Object {
  var __hideNextMonthArrow: scala.Boolean = js.native
  var __hidePrevMonthArrow: scala.Boolean = js.native
  var _handlers: js.Array[Anon_E] = js.native
  var _selectedDateObj: js.UndefOr[stdLib.Date] = js.native
  var _showTimeInput: scala.Boolean = js.native
  var config: flatpickrLib.distTypesOptionsMod.ParsedOptions = js.native
  var currentMonth: scala.Double = js.native
  var currentYear: scala.Double = js.native
  var isMobile: scala.Boolean = js.native
  var isOpen: scala.Boolean = js.native
  var l10n: flatpickrLib.distTypesLocaleMod.Locale = js.native
  var latestSelectedDateObj: js.UndefOr[stdLib.Date] = js.native
  var maxDateHasTime: scala.Boolean = js.native
  var maxRangeDate: js.UndefOr[stdLib.Date] = js.native
  var minDateHasTime: scala.Boolean = js.native
  var minRangeDate: js.UndefOr[stdLib.Date] = js.native
  var now: stdLib.Date = js.native
  var selectedDates: js.Array[stdLib.Date] = js.native
  var showTimeInput: scala.Boolean = js.native
  var utils: Anon_GetDaysInMonth = js.native
  def _bind[E /* <: stdLib.Element */](element: E, event: java.lang.String, handler: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def _bind[E /* <: stdLib.Element */](
    element: E,
    event: js.Array[java.lang.String],
    handler: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def _bind[E /* <: stdLib.Element */](
    element: js.Array[E],
    event: java.lang.String,
    handler: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def _bind[E /* <: stdLib.Element */](
    element: js.Array[E],
    event: js.Array[java.lang.String],
    handler: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def _createElement[E /* <: stdLib.HTMLElement */](
    tag: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 115 */ java.lang.String,
    className: java.lang.String
  ): E = js.native
  def _createElement[E /* <: stdLib.HTMLElement */](
    tag: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 115 */ java.lang.String,
    className: java.lang.String,
    content: java.lang.String
  ): E = js.native
  def _debouncedChange(): scala.Unit = js.native
  def _positionCalendar(): scala.Unit = js.native
  def _positionCalendar(customPositionElement: stdLib.HTMLElement): scala.Unit = js.native
  def _setHoursFromDate(date: stdLib.Date): scala.Unit = js.native
  def changeMonth(value: scala.Double): scala.Unit = js.native
  def changeMonth(value: scala.Double, is_offset: scala.Boolean): scala.Unit = js.native
  def changeMonth(value: scala.Double, is_offset: scala.Boolean, from_keyboard: scala.Boolean): scala.Unit = js.native
  def changeYear(year: scala.Double): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def clear(emitChangeEvent: scala.Boolean): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def formatDate(dateObj: stdLib.Date, frmt: java.lang.String): java.lang.String = js.native
  def isEnabled(date: flatpickrLib.distTypesOptionsMod.DateOption): scala.Boolean = js.native
  def isEnabled(date: flatpickrLib.distTypesOptionsMod.DateOption, timeless: scala.Boolean): scala.Boolean = js.native
  def jumpToDate(): scala.Unit = js.native
  def jumpToDate(date: flatpickrLib.distTypesOptionsMod.DateOption): scala.Unit = js.native
  def open(): scala.Unit = js.native
  def open(e: stdLib.FocusEvent): scala.Unit = js.native
  def open(e: stdLib.FocusEvent, positionElement: stdLib.HTMLElement): scala.Unit = js.native
  def open(e: stdLib.MouseEvent): scala.Unit = js.native
  def open(e: stdLib.MouseEvent, positionElement: stdLib.HTMLElement): scala.Unit = js.native
  def pad(num: java.lang.String): java.lang.String = js.native
  def pad(num: scala.Double): java.lang.String = js.native
  def parseDate(date: java.lang.String): js.UndefOr[stdLib.Date] = js.native
  def parseDate(date: java.lang.String, givenFormat: java.lang.String): js.UndefOr[stdLib.Date] = js.native
  def parseDate(date: java.lang.String, givenFormat: java.lang.String, timeless: scala.Boolean): js.UndefOr[stdLib.Date] = js.native
  def parseDate(date: scala.Double): js.UndefOr[stdLib.Date] = js.native
  def parseDate(date: scala.Double, givenFormat: java.lang.String): js.UndefOr[stdLib.Date] = js.native
  def parseDate(date: scala.Double, givenFormat: java.lang.String, timeless: scala.Boolean): js.UndefOr[stdLib.Date] = js.native
  def parseDate(date: stdLib.Date): js.UndefOr[stdLib.Date] = js.native
  def parseDate(date: stdLib.Date, givenFormat: java.lang.String): js.UndefOr[stdLib.Date] = js.native
  def parseDate(date: stdLib.Date, givenFormat: java.lang.String, timeless: scala.Boolean): js.UndefOr[stdLib.Date] = js.native
  def redraw(): scala.Unit = js.native
  def set(option: java.lang.String): scala.Unit = js.native
  def set(option: java.lang.String, value: js.Any): scala.Unit = js.native
  def setDate(date: flatpickrLib.distTypesOptionsMod.DateOption): scala.Unit = js.native
  def setDate(date: flatpickrLib.distTypesOptionsMod.DateOption, triggerChange: scala.Boolean): scala.Unit = js.native
  def setDate(
    date: flatpickrLib.distTypesOptionsMod.DateOption,
    triggerChange: scala.Boolean,
    format: java.lang.String
  ): scala.Unit = js.native
  def setDate(date: js.Array[flatpickrLib.distTypesOptionsMod.DateOption]): scala.Unit = js.native
  def setDate(date: js.Array[flatpickrLib.distTypesOptionsMod.DateOption], triggerChange: scala.Boolean): scala.Unit = js.native
  def setDate(
    date: js.Array[flatpickrLib.distTypesOptionsMod.DateOption],
    triggerChange: scala.Boolean,
    format: java.lang.String
  ): scala.Unit = js.native
  def toggle(): scala.Unit = js.native
}

