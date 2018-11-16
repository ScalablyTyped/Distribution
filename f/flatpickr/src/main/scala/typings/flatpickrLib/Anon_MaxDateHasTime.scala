package typings
package flatpickrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_MaxDateHasTime extends js.Object {
  var __hideNextMonthArrow: scala.Boolean
  var __hidePrevMonthArrow: scala.Boolean
  var _bind: js.Function3[
    /* element */ stdLib.Element | js.Array[stdLib.Element], 
    /* event */ java.lang.String | js.Array[java.lang.String], 
    /* handler */ js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  var _createElement: js.Function3[
    /* LimitUnionLength: was union type with length 115 */java.lang.String, 
    /* className */ java.lang.String, 
    /* content */ js.UndefOr[java.lang.String], 
    stdLib.HTMLElement
  ]
  var _debouncedChange: js.Function0[scala.Unit]
  var _handlers: js.Array[Anon_Event]
  var _positionCalendar: js.Function1[/* customPositionElement */ js.UndefOr[stdLib.HTMLElement], scala.Unit]
  var _selectedDateObj: js.UndefOr[stdLib.Date] = js.undefined
  var _setHoursFromDate: js.Function1[/* date */ stdLib.Date, scala.Unit]
  var _showTimeInput: scala.Boolean
  var changeMonth: js.Function3[
    /* value */ scala.Double, 
    /* is_offset */ js.UndefOr[scala.Boolean], 
    /* from_keyboard */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  var changeYear: js.Function1[/* year */ scala.Double, scala.Unit]
  var clear: js.Function1[/* emitChangeEvent */ js.UndefOr[scala.Boolean], scala.Unit]
  var close: js.Function0[scala.Unit]
  var config: flatpickrLib.distTypesOptionsMod.ParsedOptions
  var currentMonth: scala.Double
  var currentYear: scala.Double
  var destroy: js.Function0[scala.Unit]
  var formatDate: js.Function2[/* dateObj */ stdLib.Date, /* frmt */ java.lang.String, java.lang.String]
  var isEnabled: js.Function2[
    /* date */ flatpickrLib.distTypesOptionsMod.DateOption, 
    /* timeless */ js.UndefOr[scala.Boolean], 
    scala.Boolean
  ]
  var isMobile: scala.Boolean
  var isOpen: scala.Boolean
  var jumpToDate: js.Function1[/* date */ js.UndefOr[flatpickrLib.distTypesOptionsMod.DateOption], scala.Unit]
  var l10n: flatpickrLib.distTypesLocaleMod.Locale
  var latestSelectedDateObj: js.UndefOr[stdLib.Date] = js.undefined
  var maxDateHasTime: scala.Boolean
  var maxRangeDate: js.UndefOr[stdLib.Date] = js.undefined
  var minDateHasTime: scala.Boolean
  var minRangeDate: js.UndefOr[stdLib.Date] = js.undefined
  var now: stdLib.Date
  var open: js.Function2[
    /* e */ js.UndefOr[stdLib.FocusEvent | stdLib.MouseEvent], 
    /* positionElement */ js.UndefOr[stdLib.HTMLElement], 
    scala.Unit
  ]
  var pad: js.Function1[/* num */ java.lang.String | scala.Double, java.lang.String]
  var parseDate: js.Function3[
    /* date */ stdLib.Date | java.lang.String | scala.Double, 
    /* givenFormat */ js.UndefOr[java.lang.String], 
    /* timeless */ js.UndefOr[scala.Boolean], 
    js.UndefOr[stdLib.Date]
  ]
  var redraw: js.Function0[scala.Unit]
  var selectedDates: js.Array[stdLib.Date]
  var set: js.Function2[/* option */ java.lang.String, /* value */ js.UndefOr[js.Any], scala.Unit]
  var setDate: js.Function3[
    /* date */ flatpickrLib.distTypesOptionsMod.DateOption | js.Array[flatpickrLib.distTypesOptionsMod.DateOption], 
    /* triggerChange */ js.UndefOr[scala.Boolean], 
    /* format */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  var showTimeInput: scala.Boolean
  var toggle: js.Function0[scala.Unit]
  var utils: Anon_GetDaysInMonth
}

