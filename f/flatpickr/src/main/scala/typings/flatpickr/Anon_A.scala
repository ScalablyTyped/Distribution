package typings.flatpickr

import typings.flatpickr.distTypesLocaleMod.Locale
import typings.flatpickr.distTypesOptionsMod.DateOption
import typings.flatpickr.distTypesOptionsMod.Options
import typings.flatpickr.distTypesOptionsMod.ParsedOptions
import typings.std.Date
import typings.std.Element
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_A extends js.Object {
  var __hideNextMonthArrow: Boolean = js.native
  var __hidePrevMonthArrow: Boolean = js.native
  var _handlers: js.Array[Anon_E] = js.native
  var _initialDate: Date = js.native
  var _selectedDateObj: js.UndefOr[Date] = js.native
  var _showTimeInput: Boolean = js.native
  var config: ParsedOptions = js.native
  var currentMonth: Double = js.native
  var currentYear: Double = js.native
  var isMobile: Boolean = js.native
  var isOpen: Boolean = js.native
  var l10n: Locale = js.native
  var latestSelectedDateObj: js.UndefOr[Date] = js.native
  var loadedPlugins: js.Array[String] = js.native
  var maxDateHasTime: Boolean = js.native
  var maxRangeDate: js.UndefOr[Date] = js.native
  var minDateHasTime: Boolean = js.native
  var minRangeDate: js.UndefOr[Date] = js.native
  var now: Date = js.native
  var selectedDates: js.Array[Date] = js.native
  var showTimeInput: Boolean = js.native
  var utils: Anon_GetDaysInMonth = js.native
  def _bind[E /* <: Element */](element: E, event: String, handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def _bind[E /* <: Element */](element: E, event: js.Array[String], handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def _bind[E /* <: Element */](element: js.Array[E], event: String, handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def _bind[E /* <: Element */](
    element: js.Array[E],
    event: js.Array[String],
    handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def _createElement[E /* <: HTMLElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any,
    className: String
  ): E = js.native
  def _createElement[E /* <: HTMLElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any,
    className: String,
    content: String
  ): E = js.native
  def _debouncedChange(): Unit = js.native
  def _positionCalendar(): Unit = js.native
  def _positionCalendar(customPositionElement: HTMLElement): Unit = js.native
  def _setHoursFromDate(date: Date): Unit = js.native
  def changeMonth(value: Double): Unit = js.native
  def changeMonth(value: Double, isOffset: Boolean): Unit = js.native
  def changeMonth(value: Double, isOffset: Boolean, fromKeyboard: Boolean): Unit = js.native
  def changeYear(year: Double): Unit = js.native
  def clear(): Unit = js.native
  def clear(emitChangeEvent: Boolean): Unit = js.native
  def clear(emitChangeEvent: Boolean, toInitial: Boolean): Unit = js.native
  def close(): Unit = js.native
  def destroy(): Unit = js.native
  def formatDate(dateObj: Date, frmt: String): String = js.native
  def isEnabled(date: DateOption): Boolean = js.native
  def isEnabled(date: DateOption, timeless: Boolean): Boolean = js.native
  def jumpToDate(): Unit = js.native
  def jumpToDate(date: DateOption): Unit = js.native
  def jumpToDate(date: DateOption, triggerChange: Boolean): Unit = js.native
  def open(): Unit = js.native
  def open(e: FocusEvent): Unit = js.native
  def open(e: FocusEvent, positionElement: HTMLElement): Unit = js.native
  def open(e: MouseEvent): Unit = js.native
  def open(e: MouseEvent, positionElement: HTMLElement): Unit = js.native
  def pad(num: String): String = js.native
  def pad(num: Double): String = js.native
  def parseDate(date: String): js.UndefOr[Date] = js.native
  def parseDate(date: String, givenFormat: String): js.UndefOr[Date] = js.native
  def parseDate(date: String, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
  def parseDate(date: Double): js.UndefOr[Date] = js.native
  def parseDate(date: Double, givenFormat: String): js.UndefOr[Date] = js.native
  def parseDate(date: Double, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
  def parseDate(date: Date): js.UndefOr[Date] = js.native
  def parseDate(date: Date, givenFormat: String): js.UndefOr[Date] = js.native
  def parseDate(date: Date, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
  def redraw(): Unit = js.native
  def set(
    option: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof flatpickr.flatpickr/dist/types/options.Options ]:? flatpickr.flatpickr/dist/types/options.Options[k]}
    */ typings.flatpickr.flatpickrStrings.Anon_A with Options
  ): Unit = js.native
  def set(
    option: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof flatpickr.flatpickr/dist/types/options.Options ]:? flatpickr.flatpickr/dist/types/options.Options[k]}
    */ typings.flatpickr.flatpickrStrings.Anon_A with Options,
    value: js.Any
  ): Unit = js.native
  def set(option: String): Unit = js.native
  def set(option: String, value: js.Any): Unit = js.native
  def setDate(date: js.Array[DateOption]): Unit = js.native
  def setDate(date: js.Array[DateOption], triggerChange: Boolean): Unit = js.native
  def setDate(date: js.Array[DateOption], triggerChange: Boolean, format: String): Unit = js.native
  def setDate(date: DateOption): Unit = js.native
  def setDate(date: DateOption, triggerChange: Boolean): Unit = js.native
  def setDate(date: DateOption, triggerChange: Boolean, format: String): Unit = js.native
  def toggle(): Unit = js.native
}

