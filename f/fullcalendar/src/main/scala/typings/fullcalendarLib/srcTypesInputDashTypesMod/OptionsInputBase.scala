package typings
package fullcalendarLib.srcTypesInputDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsInputBase extends js.Object {
  var allDayDefault: js.UndefOr[scala.Boolean] = js.undefined
  var allDaySlot: js.UndefOr[scala.Boolean] = js.undefined
  var allDayText: js.UndefOr[java.lang.String] = js.undefined
  var aspectRatio: js.UndefOr[scala.Double] = js.undefined
  var bootstrapFontAwesome: js.UndefOr[scala.Boolean | ButtonIconsInput] = js.undefined
  var bootstrapGlyphicons: js.UndefOr[scala.Boolean | ButtonIconsInput] = js.undefined
  var businessHours: js.UndefOr[scala.Boolean | BusinessHoursInput | js.Array[BusinessHoursInput]] = js.undefined
  var buttonIcons: js.UndefOr[scala.Boolean | ButtonIconsInput] = js.undefined
  var columnHeader: js.UndefOr[scala.Boolean] = js.undefined
  var columnHeaderFormat: js.UndefOr[java.lang.String] = js.undefined
  var columnHeaderHtml: js.UndefOr[java.lang.String | (js.Function1[/* date */ MomentInput, java.lang.String])] = js.undefined
  var columnHeaderText: js.UndefOr[java.lang.String | (js.Function1[/* date */ MomentInput, java.lang.String])] = js.undefined
  var contentHeight: js.UndefOr[
    scala.Double | fullcalendarLib.fullcalendarLibStrings.auto | js.Function0[scala.Double]
  ] = js.undefined
  var customButtons: js.UndefOr[org.scalablytyped.runtime.StringDictionary[CustomButtonInput]] = js.undefined
  var dateAlignment: js.UndefOr[java.lang.String] = js.undefined
  var dateIncrement: js.UndefOr[DurationInput] = js.undefined
  var dayClick: js.UndefOr[
    js.Function4[
      /* date */ momentLib.momentMod.momentNs.Moment, 
      /* jsEvent */ stdLib.MouseEvent, 
      /* view */ fullcalendarLib.viewMod.default, 
      /* resourceObj */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var dayCount: js.UndefOr[scala.Double] = js.undefined
  var dayNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var dayNamesShort: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var dayPopoverFormat: js.UndefOr[java.lang.String] = js.undefined
  var dayRender: js.UndefOr[
    js.Function2[
      /* date */ momentLib.momentMod.momentNs.Moment, 
      /* cell */ fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery, 
      scala.Unit
    ]
  ] = js.undefined
  var defaultDate: js.UndefOr[MomentInput] = js.undefined
  var defaultView: js.UndefOr[java.lang.String] = js.undefined
  var displayEventEnd: js.UndefOr[scala.Boolean] = js.undefined
  var displayEventTime: js.UndefOr[scala.Boolean] = js.undefined
  var dragOpacity: js.UndefOr[scala.Double] = js.undefined
  var dragRevertDuration: js.UndefOr[scala.Double] = js.undefined
  var dragScroll: js.UndefOr[scala.Boolean] = js.undefined
  var drop: js.UndefOr[
    js.Function3[
      /* date */ momentLib.momentMod.momentNs.Moment, 
      /* jsEvent */ stdLib.MouseEvent, 
      /* ui */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var dropAccept: js.UndefOr[java.lang.String | (js.Function1[/* draggable */ js.Any, scala.Boolean])] = js.undefined
  var droppable: js.UndefOr[scala.Boolean] = js.undefined
  var duration: js.UndefOr[DurationInput] = js.undefined
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  var endParam: js.UndefOr[java.lang.String] = js.undefined
  var eventAfterAllRender: js.UndefOr[js.Function1[/* view */ fullcalendarLib.viewMod.default, scala.Unit]] = js.undefined
  var eventAfterRender: js.UndefOr[
    js.Function3[
      /* event */ EventObjectInput, 
      /* element */ fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery, 
      /* view */ fullcalendarLib.viewMod.default, 
      scala.Unit
    ]
  ] = js.undefined
  var eventAllow: js.UndefOr[
    js.Function2[/* dropInfo */ DropInfo, /* draggedEvent */ stdLib.Event, scala.Boolean]
  ] = js.undefined
  var eventBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var eventBorderColor: js.UndefOr[java.lang.String] = js.undefined
  var eventClick: js.UndefOr[
    js.Function3[
      /* event */ EventObjectInput, 
      /* jsEvent */ stdLib.MouseEvent, 
      /* view */ fullcalendarLib.viewMod.default, 
      scala.Boolean | scala.Unit
    ]
  ] = js.undefined
  var eventColor: js.UndefOr[java.lang.String] = js.undefined
  var eventConstraint: js.UndefOr[ConstraintInput] = js.undefined
  var eventDataTransform: js.UndefOr[js.Function1[/* eventData */ js.Any, EventObjectInput]] = js.undefined
  var eventDestroy: js.UndefOr[
    js.Function3[
      /* event */ EventObjectInput, 
      /* element */ fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery, 
      /* view */ fullcalendarLib.viewMod.default, 
      scala.Unit
    ]
  ] = js.undefined
  var eventDragStart: js.UndefOr[
    js.Function4[
      /* event */ EventObjectInput, 
      /* jsEvent */ stdLib.MouseEvent, 
      /* ui */ js.Any, 
      /* view */ fullcalendarLib.viewMod.default, 
      scala.Unit
    ]
  ] = js.undefined
  var eventDragStop: js.UndefOr[
    js.Function4[
      /* event */ EventObjectInput, 
      /* jsEvent */ stdLib.MouseEvent, 
      /* ui */ js.Any, 
      /* view */ fullcalendarLib.viewMod.default, 
      scala.Unit
    ]
  ] = js.undefined
  var eventDrop: js.UndefOr[
    js.Function6[
      /* event */ EventObjectInput, 
      /* delta */ momentLib.momentMod.momentNs.Duration, 
      /* revertFunc */ js.Function, 
      /* jsEvent */ stdLib.Event, 
      /* ui */ js.Any, 
      /* view */ fullcalendarLib.viewMod.default, 
      scala.Unit
    ]
  ] = js.undefined
  var eventDurationEditable: js.UndefOr[scala.Boolean] = js.undefined
  var eventLimit: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var eventLimitClick: js.UndefOr[
    fullcalendarLib.fullcalendarLibStrings.popover | fullcalendarLib.fullcalendarLibStrings.week | fullcalendarLib.fullcalendarLibStrings.day | java.lang.String | (js.Function2[/* cellinfo */ CellInfo, /* jsevent */ stdLib.Event, scala.Unit])
  ] = js.undefined
  var eventLimitText: js.UndefOr[java.lang.String | (js.Function1[/* eventCnt */ scala.Double, java.lang.String])] = js.undefined
  var eventLongPressDelay: js.UndefOr[scala.Double] = js.undefined
  var eventMouseout: js.UndefOr[
    js.Function3[
      /* event */ EventObjectInput, 
      /* jsEvent */ stdLib.MouseEvent, 
      /* view */ fullcalendarLib.viewMod.default, 
      scala.Unit
    ]
  ] = js.undefined
  var eventMouseover: js.UndefOr[
    js.Function3[
      /* event */ EventObjectInput, 
      /* jsEvent */ stdLib.MouseEvent, 
      /* view */ fullcalendarLib.viewMod.default, 
      scala.Unit
    ]
  ] = js.undefined
  var eventOrder: js.UndefOr[
    java.lang.String | (js.Array[
      (js.Function2[/* a */ EventObjectInput, /* b */ EventObjectInput, scala.Double]) | java.lang.String
    ])
  ] = js.undefined
  var eventOverlap: js.UndefOr[
    scala.Boolean | (js.Function2[/* stillEvent */ EventObjectInput, /* movingEvent */ EventObjectInput, scala.Boolean])
  ] = js.undefined
  var eventReceive: js.UndefOr[js.Function1[/* event */ EventObjectInput, scala.Unit]] = js.undefined
  var eventRender: js.UndefOr[
    js.Function3[
      /* event */ EventObjectInput, 
      /* element */ fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery, 
      /* view */ fullcalendarLib.viewMod.default, 
      scala.Unit
    ]
  ] = js.undefined
  var eventRenderWait: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var eventResize: js.UndefOr[
    js.Function6[
      /* event */ EventObjectInput, 
      /* delta */ momentLib.momentMod.momentNs.Duration, 
      /* revertFunc */ js.Function, 
      /* jsEvent */ stdLib.Event, 
      /* ui */ js.Any, 
      /* view */ fullcalendarLib.viewMod.default, 
      scala.Unit
    ]
  ] = js.undefined
  var eventResizeStart: js.UndefOr[
    js.Function4[
      /* event */ EventObjectInput, 
      /* jsEvent */ stdLib.MouseEvent, 
      /* ui */ js.Any, 
      /* view */ fullcalendarLib.viewMod.default, 
      scala.Unit
    ]
  ] = js.undefined
  var eventResizeStop: js.UndefOr[
    js.Function4[
      /* event */ EventObjectInput, 
      /* jsEvent */ stdLib.MouseEvent, 
      /* ui */ js.Any, 
      /* view */ fullcalendarLib.viewMod.default, 
      scala.Unit
    ]
  ] = js.undefined
  var eventSources: js.UndefOr[js.Array[EventSourceInput]] = js.undefined
  var eventStartEditable: js.UndefOr[scala.Boolean] = js.undefined
  var eventTextColor: js.UndefOr[java.lang.String] = js.undefined
  var events: js.UndefOr[EventSourceInput] = js.undefined
  var firstDay: js.UndefOr[scala.Double] = js.undefined
  var fixedWeekCount: js.UndefOr[scala.Boolean] = js.undefined
  var footer: js.UndefOr[scala.Boolean | ToolbarInput] = js.undefined
  var handleWindowResize: js.UndefOr[scala.Boolean] = js.undefined
  var header: js.UndefOr[scala.Boolean | ToolbarInput] = js.undefined
  var height: js.UndefOr[
    scala.Double | fullcalendarLib.fullcalendarLibStrings.auto | fullcalendarLib.fullcalendarLibStrings.parent | js.Function0[scala.Double]
  ] = js.undefined
  var hiddenDays: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var isRTL: js.UndefOr[scala.Boolean] = js.undefined
  var lazyFetching: js.UndefOr[scala.Boolean] = js.undefined
  var listDayAltFormat: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var listDayFormat: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var loading: js.UndefOr[
    js.Function2[
      /* isLoading */ scala.Boolean, 
      /* view */ fullcalendarLib.viewMod.default, 
      scala.Unit
    ]
  ] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var longPressDelay: js.UndefOr[scala.Double] = js.undefined
  var maxTime: js.UndefOr[DurationInput] = js.undefined
  var minTime: js.UndefOr[DurationInput] = js.undefined
  var monthNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var monthNamesShort: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var navLinkDayClick: js.UndefOr[
    java.lang.String | (js.Function2[
      /* date */ momentLib.momentMod.momentNs.Moment, 
      /* jsEvent */ stdLib.Event, 
      scala.Unit
    ])
  ] = js.undefined
  var navLinkWeekClick: js.UndefOr[
    java.lang.String | (js.Function2[/* weekStart */ js.Any, /* jsEvent */ stdLib.Event, scala.Unit])
  ] = js.undefined
  var navLinks: js.UndefOr[scala.Boolean] = js.undefined
  var nextDayThreshold: js.UndefOr[DurationInput] = js.undefined
  var noEventsMessage: js.UndefOr[java.lang.String] = js.undefined
  var now: js.UndefOr[MomentInput | js.Function0[MomentInput]] = js.undefined
  var nowIndicator: js.UndefOr[scala.Boolean] = js.undefined
  var scrollTime: js.UndefOr[DurationInput] = js.undefined
  var select: js.UndefOr[
    js.Function5[
      /* start */ momentLib.momentMod.momentNs.Moment, 
      /* end */ momentLib.momentMod.momentNs.Moment, 
      /* jsEvent */ stdLib.MouseEvent, 
      /* view */ fullcalendarLib.viewMod.default, 
      /* resource */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var selectConstraint: js.UndefOr[ConstraintInput] = js.undefined
  var selectHelper: js.UndefOr[scala.Boolean] = js.undefined
  var selectOverlap: js.UndefOr[scala.Boolean | (js.Function1[/* event */ EventObjectInput, scala.Boolean])] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var showNonCurrentDates: js.UndefOr[scala.Boolean] = js.undefined
  var slotDuration: js.UndefOr[DurationInput] = js.undefined
  var slotEventOverlap: js.UndefOr[scala.Boolean] = js.undefined
  var slotLabelFormat: js.UndefOr[java.lang.String] = js.undefined
  var slotLabelInterval: js.UndefOr[DurationInput] = js.undefined
  var snapDuration: js.UndefOr[DurationInput] = js.undefined
  var startParam: js.UndefOr[java.lang.String] = js.undefined
  var themeButtonIcons: js.UndefOr[scala.Boolean | ButtonIconsInput] = js.undefined
  var themeSystem: js.UndefOr[
    fullcalendarLib.fullcalendarLibStrings.standard | fullcalendarLib.fullcalendarLibStrings.bootstrap3 | fullcalendarLib.fullcalendarLibStrings.bootstrap4 | fullcalendarLib.fullcalendarLibStrings.`jquery-ui`
  ] = js.undefined
  var timeFormat: js.UndefOr[java.lang.String] = js.undefined
  var timezone: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var titleFormat: js.UndefOr[java.lang.String] = js.undefined
  var unselect: js.UndefOr[
    js.Function2[/* view */ fullcalendarLib.viewMod.default, /* jsEvent */ stdLib.Event, scala.Unit]
  ] = js.undefined
  var unselectAuto: js.UndefOr[scala.Boolean] = js.undefined
  var unselectCancel: js.UndefOr[java.lang.String] = js.undefined
  var validRange: js.UndefOr[RangeInput] = js.undefined
  var viewDestroy: js.UndefOr[
    js.Function2[
      /* view */ fullcalendarLib.viewMod.default, 
      /* element */ fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery, 
      scala.Unit
    ]
  ] = js.undefined
  var viewRender: js.UndefOr[
    js.Function2[
      /* view */ fullcalendarLib.viewMod.default, 
      /* element */ fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery, 
      scala.Unit
    ]
  ] = js.undefined
  var visibleRange: js.UndefOr[
    (js.Function1[/* currentDate */ momentLib.momentMod.momentNs.Moment, RangeInput]) | RangeInput
  ] = js.undefined
  var weekNumberCalculation: js.UndefOr[
    fullcalendarLib.fullcalendarLibStrings.local | fullcalendarLib.fullcalendarLibStrings.ISO | (js.Function1[/* m */ momentLib.momentMod.momentNs.Moment, scala.Double])
  ] = js.undefined
  var weekNumberTitle: js.UndefOr[java.lang.String] = js.undefined
  var weekNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var weekNumbersWithinDays: js.UndefOr[scala.Boolean] = js.undefined
  var weekends: js.UndefOr[scala.Boolean] = js.undefined
  var windowResize: js.UndefOr[js.Function1[/* view */ fullcalendarLib.viewMod.default, scala.Unit]] = js.undefined
  var windowResizeDelay: js.UndefOr[scala.Double] = js.undefined
}

