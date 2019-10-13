package typings.fullcalendar.srcTypesInputDashTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.fullcalendar.fullcalendarStrings.ISO
import typings.fullcalendar.fullcalendarStrings.`jquery-ui`
import typings.fullcalendar.fullcalendarStrings.auto
import typings.fullcalendar.fullcalendarStrings.bootstrap3
import typings.fullcalendar.fullcalendarStrings.bootstrap4
import typings.fullcalendar.fullcalendarStrings.day
import typings.fullcalendar.fullcalendarStrings.local
import typings.fullcalendar.fullcalendarStrings.parent
import typings.fullcalendar.fullcalendarStrings.popover
import typings.fullcalendar.fullcalendarStrings.standard
import typings.fullcalendar.fullcalendarStrings.week
import typings.fullcalendar.srcTypesJqueryDashHooksMod._Global_.JQuery
import typings.fullcalendar.viewMod.default
import typings.moment.momentMod.Duration
import typings.moment.momentMod.Moment
import typings.std.Event
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsInputBase extends js.Object {
  var allDayDefault: js.UndefOr[Boolean] = js.undefined
  var allDaySlot: js.UndefOr[Boolean] = js.undefined
  var allDayText: js.UndefOr[String] = js.undefined
  var aspectRatio: js.UndefOr[Double] = js.undefined
  var bootstrapFontAwesome: js.UndefOr[Boolean | ButtonIconsInput] = js.undefined
  var bootstrapGlyphicons: js.UndefOr[Boolean | ButtonIconsInput] = js.undefined
  var businessHours: js.UndefOr[Boolean | BusinessHoursInput | js.Array[BusinessHoursInput]] = js.undefined
  var buttonIcons: js.UndefOr[Boolean | ButtonIconsInput] = js.undefined
  var columnHeader: js.UndefOr[Boolean] = js.undefined
  var columnHeaderFormat: js.UndefOr[String] = js.undefined
  var columnHeaderHtml: js.UndefOr[String | (js.Function1[/* date */ MomentInput, String])] = js.undefined
  var columnHeaderText: js.UndefOr[String | (js.Function1[/* date */ MomentInput, String])] = js.undefined
  var contentHeight: js.UndefOr[Double | auto | js.Function0[Double]] = js.undefined
  var customButtons: js.UndefOr[StringDictionary[CustomButtonInput]] = js.undefined
  var dateAlignment: js.UndefOr[String] = js.undefined
  var dateIncrement: js.UndefOr[DurationInput] = js.undefined
  var dayClick: js.UndefOr[
    js.Function4[
      /* date */ Moment, 
      /* jsEvent */ MouseEvent, 
      /* view */ default, 
      /* resourceObj */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var dayCount: js.UndefOr[Double] = js.undefined
  var dayNames: js.UndefOr[js.Array[String]] = js.undefined
  var dayNamesShort: js.UndefOr[js.Array[String]] = js.undefined
  var dayPopoverFormat: js.UndefOr[String] = js.undefined
  var dayRender: js.UndefOr[js.Function2[/* date */ Moment, /* cell */ JQuery, Unit]] = js.undefined
  var defaultDate: js.UndefOr[MomentInput] = js.undefined
  var defaultView: js.UndefOr[String] = js.undefined
  var displayEventEnd: js.UndefOr[Boolean] = js.undefined
  var displayEventTime: js.UndefOr[Boolean] = js.undefined
  var dragOpacity: js.UndefOr[Double] = js.undefined
  var dragRevertDuration: js.UndefOr[Double] = js.undefined
  var dragScroll: js.UndefOr[Boolean] = js.undefined
  var drop: js.UndefOr[js.Function3[/* date */ Moment, /* jsEvent */ MouseEvent, /* ui */ js.Any, Unit]] = js.undefined
  var dropAccept: js.UndefOr[String | (js.Function1[/* draggable */ js.Any, Boolean])] = js.undefined
  var droppable: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[DurationInput] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var endParam: js.UndefOr[String] = js.undefined
  var eventAfterAllRender: js.UndefOr[js.Function1[/* view */ default, Unit]] = js.undefined
  var eventAfterRender: js.UndefOr[
    js.Function3[/* event */ EventObjectInput, /* element */ JQuery, /* view */ default, Unit]
  ] = js.undefined
  var eventAllow: js.UndefOr[
    js.Function2[/* dropInfo */ DropInfo, /* draggedEvent */ EventObjectInput, Boolean]
  ] = js.undefined
  var eventBackgroundColor: js.UndefOr[String] = js.undefined
  var eventBorderColor: js.UndefOr[String] = js.undefined
  var eventClick: js.UndefOr[
    js.Function3[
      /* event */ EventObjectInput, 
      /* jsEvent */ MouseEvent, 
      /* view */ default, 
      Boolean | Unit
    ]
  ] = js.undefined
  var eventColor: js.UndefOr[String] = js.undefined
  var eventConstraint: js.UndefOr[ConstraintInput] = js.undefined
  var eventDataTransform: js.UndefOr[js.Function1[/* eventData */ js.Any, EventObjectInput]] = js.undefined
  var eventDestroy: js.UndefOr[
    js.Function3[/* event */ EventObjectInput, /* element */ JQuery, /* view */ default, Unit]
  ] = js.undefined
  var eventDragStart: js.UndefOr[
    js.Function4[
      /* event */ EventObjectInput, 
      /* jsEvent */ MouseEvent, 
      /* ui */ js.Any, 
      /* view */ default, 
      Unit
    ]
  ] = js.undefined
  var eventDragStop: js.UndefOr[
    js.Function4[
      /* event */ EventObjectInput, 
      /* jsEvent */ MouseEvent, 
      /* ui */ js.Any, 
      /* view */ default, 
      Unit
    ]
  ] = js.undefined
  var eventDrop: js.UndefOr[
    js.Function6[
      /* event */ EventObjectInput, 
      /* delta */ Duration, 
      /* revertFunc */ js.Function, 
      /* jsEvent */ Event, 
      /* ui */ js.Any, 
      /* view */ default, 
      Unit
    ]
  ] = js.undefined
  var eventDurationEditable: js.UndefOr[Boolean] = js.undefined
  var eventLimit: js.UndefOr[Boolean | Double] = js.undefined
  var eventLimitClick: js.UndefOr[
    popover | week | day | String | (js.Function2[/* cellinfo */ CellInfo, /* jsevent */ Event, Unit])
  ] = js.undefined
  var eventLimitText: js.UndefOr[String | (js.Function1[/* eventCnt */ Double, String])] = js.undefined
  var eventLongPressDelay: js.UndefOr[Double] = js.undefined
  var eventMouseout: js.UndefOr[
    js.Function3[/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* view */ default, Unit]
  ] = js.undefined
  var eventMouseover: js.UndefOr[
    js.Function3[/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* view */ default, Unit]
  ] = js.undefined
  var eventOrder: js.UndefOr[
    String | (js.Array[
      (js.Function2[/* a */ EventObjectInput, /* b */ EventObjectInput, Double]) | String
    ])
  ] = js.undefined
  var eventOverlap: js.UndefOr[
    Boolean | (js.Function2[/* stillEvent */ EventObjectInput, /* movingEvent */ EventObjectInput, Boolean])
  ] = js.undefined
  var eventReceive: js.UndefOr[js.Function1[/* event */ EventObjectInput, Unit]] = js.undefined
  var eventRender: js.UndefOr[
    js.Function3[/* event */ EventObjectInput, /* element */ JQuery, /* view */ default, Unit]
  ] = js.undefined
  var eventRenderWait: js.UndefOr[Double | Null] = js.undefined
  var eventResize: js.UndefOr[
    js.Function6[
      /* event */ EventObjectInput, 
      /* delta */ Duration, 
      /* revertFunc */ js.Function, 
      /* jsEvent */ Event, 
      /* ui */ js.Any, 
      /* view */ default, 
      Unit
    ]
  ] = js.undefined
  var eventResizeStart: js.UndefOr[
    js.Function4[
      /* event */ EventObjectInput, 
      /* jsEvent */ MouseEvent, 
      /* ui */ js.Any, 
      /* view */ default, 
      Unit
    ]
  ] = js.undefined
  var eventResizeStop: js.UndefOr[
    js.Function4[
      /* event */ EventObjectInput, 
      /* jsEvent */ MouseEvent, 
      /* ui */ js.Any, 
      /* view */ default, 
      Unit
    ]
  ] = js.undefined
  var eventSources: js.UndefOr[js.Array[EventSourceInput]] = js.undefined
  var eventStartEditable: js.UndefOr[Boolean] = js.undefined
  var eventTextColor: js.UndefOr[String] = js.undefined
  var events: js.UndefOr[EventSourceInput] = js.undefined
  var firstDay: js.UndefOr[Double] = js.undefined
  var fixedWeekCount: js.UndefOr[Boolean] = js.undefined
  var footer: js.UndefOr[Boolean | ToolbarInput] = js.undefined
  var handleWindowResize: js.UndefOr[Boolean] = js.undefined
  var header: js.UndefOr[Boolean | ToolbarInput] = js.undefined
  var height: js.UndefOr[Double | auto | parent | js.Function0[Double]] = js.undefined
  var hiddenDays: js.UndefOr[js.Array[Double]] = js.undefined
  var isRTL: js.UndefOr[Boolean] = js.undefined
  var lazyFetching: js.UndefOr[Boolean] = js.undefined
  var listDayAltFormat: js.UndefOr[String | Boolean] = js.undefined
  var listDayFormat: js.UndefOr[String | Boolean] = js.undefined
  var loading: js.UndefOr[js.Function2[/* isLoading */ Boolean, /* view */ default, Unit]] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var longPressDelay: js.UndefOr[Double] = js.undefined
  var maxTime: js.UndefOr[DurationInput] = js.undefined
  var minTime: js.UndefOr[DurationInput] = js.undefined
  var monthNames: js.UndefOr[js.Array[String]] = js.undefined
  var monthNamesShort: js.UndefOr[js.Array[String]] = js.undefined
  var navLinkDayClick: js.UndefOr[String | (js.Function2[/* date */ Moment, /* jsEvent */ Event, Unit])] = js.undefined
  var navLinkWeekClick: js.UndefOr[String | (js.Function2[/* weekStart */ js.Any, /* jsEvent */ Event, Unit])] = js.undefined
  var navLinks: js.UndefOr[Boolean] = js.undefined
  var nextDayThreshold: js.UndefOr[DurationInput] = js.undefined
  var noEventsMessage: js.UndefOr[String] = js.undefined
  var now: js.UndefOr[MomentInput | js.Function0[MomentInput]] = js.undefined
  var nowIndicator: js.UndefOr[Boolean] = js.undefined
  var scrollTime: js.UndefOr[DurationInput] = js.undefined
  var select: js.UndefOr[
    js.Function5[
      /* start */ Moment, 
      /* end */ Moment, 
      /* jsEvent */ MouseEvent, 
      /* view */ default, 
      /* resource */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var selectAllow: js.UndefOr[js.Function1[/* selectInfo */ SelectInfo, Boolean]] = js.undefined
  var selectConstraint: js.UndefOr[ConstraintInput] = js.undefined
  var selectHelper: js.UndefOr[Boolean] = js.undefined
  var selectOverlap: js.UndefOr[Boolean | (js.Function1[/* event */ EventObjectInput, Boolean])] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var showNonCurrentDates: js.UndefOr[Boolean] = js.undefined
  var slotDuration: js.UndefOr[DurationInput] = js.undefined
  var slotEventOverlap: js.UndefOr[Boolean] = js.undefined
  var slotLabelFormat: js.UndefOr[String] = js.undefined
  var slotLabelInterval: js.UndefOr[DurationInput] = js.undefined
  var snapDuration: js.UndefOr[DurationInput] = js.undefined
  var startParam: js.UndefOr[String] = js.undefined
  var themeButtonIcons: js.UndefOr[Boolean | ButtonIconsInput] = js.undefined
  var themeSystem: js.UndefOr[standard | bootstrap3 | bootstrap4 | `jquery-ui`] = js.undefined
  var timeFormat: js.UndefOr[String] = js.undefined
  var timezone: js.UndefOr[String | Boolean] = js.undefined
  var titleFormat: js.UndefOr[String] = js.undefined
  var unselect: js.UndefOr[js.Function2[/* view */ default, /* jsEvent */ Event, Unit]] = js.undefined
  var unselectAuto: js.UndefOr[Boolean] = js.undefined
  var unselectCancel: js.UndefOr[String] = js.undefined
  var validRange: js.UndefOr[RangeInput] = js.undefined
  var viewDestroy: js.UndefOr[js.Function2[/* view */ default, /* element */ JQuery, Unit]] = js.undefined
  var viewRender: js.UndefOr[js.Function2[/* view */ default, /* element */ JQuery, Unit]] = js.undefined
  var visibleRange: js.UndefOr[(js.Function1[/* currentDate */ Moment, RangeInput]) | RangeInput] = js.undefined
  var weekNumberCalculation: js.UndefOr[local | ISO | (js.Function1[/* m */ Moment, Double])] = js.undefined
  var weekNumberTitle: js.UndefOr[String] = js.undefined
  var weekNumbers: js.UndefOr[Boolean] = js.undefined
  var weekNumbersWithinDays: js.UndefOr[Boolean] = js.undefined
  var weekends: js.UndefOr[Boolean] = js.undefined
  var windowResize: js.UndefOr[js.Function1[/* view */ default, Unit]] = js.undefined
  var windowResizeDelay: js.UndefOr[Double] = js.undefined
}

object OptionsInputBase {
  @scala.inline
  def apply(
    allDayDefault: js.UndefOr[Boolean] = js.undefined,
    allDaySlot: js.UndefOr[Boolean] = js.undefined,
    allDayText: String = null,
    aspectRatio: Int | Double = null,
    bootstrapFontAwesome: Boolean | ButtonIconsInput = null,
    bootstrapGlyphicons: Boolean | ButtonIconsInput = null,
    businessHours: Boolean | BusinessHoursInput | js.Array[BusinessHoursInput] = null,
    buttonIcons: Boolean | ButtonIconsInput = null,
    columnHeader: js.UndefOr[Boolean] = js.undefined,
    columnHeaderFormat: String = null,
    columnHeaderHtml: String | (js.Function1[/* date */ MomentInput, String]) = null,
    columnHeaderText: String | (js.Function1[/* date */ MomentInput, String]) = null,
    contentHeight: Double | auto | js.Function0[Double] = null,
    customButtons: StringDictionary[CustomButtonInput] = null,
    dateAlignment: String = null,
    dateIncrement: DurationInput = null,
    dayClick: (/* date */ Moment, /* jsEvent */ MouseEvent, /* view */ default, /* resourceObj */ js.UndefOr[js.Any]) => Unit = null,
    dayCount: Int | Double = null,
    dayNames: js.Array[String] = null,
    dayNamesShort: js.Array[String] = null,
    dayPopoverFormat: String = null,
    dayRender: (/* date */ Moment, /* cell */ JQuery) => Unit = null,
    defaultDate: MomentInput = null,
    defaultView: String = null,
    displayEventEnd: js.UndefOr[Boolean] = js.undefined,
    displayEventTime: js.UndefOr[Boolean] = js.undefined,
    dragOpacity: Int | Double = null,
    dragRevertDuration: Int | Double = null,
    dragScroll: js.UndefOr[Boolean] = js.undefined,
    drop: (/* date */ Moment, /* jsEvent */ MouseEvent, /* ui */ js.Any) => Unit = null,
    dropAccept: String | (js.Function1[/* draggable */ js.Any, Boolean]) = null,
    droppable: js.UndefOr[Boolean] = js.undefined,
    duration: DurationInput = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    endParam: String = null,
    eventAfterAllRender: /* view */ default => Unit = null,
    eventAfterRender: (/* event */ EventObjectInput, /* element */ JQuery, /* view */ default) => Unit = null,
    eventAllow: (/* dropInfo */ DropInfo, /* draggedEvent */ EventObjectInput) => Boolean = null,
    eventBackgroundColor: String = null,
    eventBorderColor: String = null,
    eventClick: (/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* view */ default) => Boolean | Unit = null,
    eventColor: String = null,
    eventConstraint: ConstraintInput = null,
    eventDataTransform: /* eventData */ js.Any => EventObjectInput = null,
    eventDestroy: (/* event */ EventObjectInput, /* element */ JQuery, /* view */ default) => Unit = null,
    eventDragStart: (/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* ui */ js.Any, /* view */ default) => Unit = null,
    eventDragStop: (/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* ui */ js.Any, /* view */ default) => Unit = null,
    eventDrop: (/* event */ EventObjectInput, /* delta */ Duration, /* revertFunc */ js.Function, /* jsEvent */ Event, /* ui */ js.Any, /* view */ default) => Unit = null,
    eventDurationEditable: js.UndefOr[Boolean] = js.undefined,
    eventLimit: Boolean | Double = null,
    eventLimitClick: popover | week | day | String | (js.Function2[/* cellinfo */ CellInfo, /* jsevent */ Event, Unit]) = null,
    eventLimitText: String | (js.Function1[/* eventCnt */ Double, String]) = null,
    eventLongPressDelay: Int | Double = null,
    eventMouseout: (/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* view */ default) => Unit = null,
    eventMouseover: (/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* view */ default) => Unit = null,
    eventOrder: String | (js.Array[
      (js.Function2[/* a */ EventObjectInput, /* b */ EventObjectInput, Double]) | String
    ]) = null,
    eventOverlap: Boolean | (js.Function2[/* stillEvent */ EventObjectInput, /* movingEvent */ EventObjectInput, Boolean]) = null,
    eventReceive: /* event */ EventObjectInput => Unit = null,
    eventRender: (/* event */ EventObjectInput, /* element */ JQuery, /* view */ default) => Unit = null,
    eventRenderWait: Int | Double = null,
    eventResize: (/* event */ EventObjectInput, /* delta */ Duration, /* revertFunc */ js.Function, /* jsEvent */ Event, /* ui */ js.Any, /* view */ default) => Unit = null,
    eventResizeStart: (/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* ui */ js.Any, /* view */ default) => Unit = null,
    eventResizeStop: (/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* ui */ js.Any, /* view */ default) => Unit = null,
    eventSources: js.Array[EventSourceInput] = null,
    eventStartEditable: js.UndefOr[Boolean] = js.undefined,
    eventTextColor: String = null,
    events: EventSourceInput = null,
    firstDay: Int | Double = null,
    fixedWeekCount: js.UndefOr[Boolean] = js.undefined,
    footer: Boolean | ToolbarInput = null,
    handleWindowResize: js.UndefOr[Boolean] = js.undefined,
    header: Boolean | ToolbarInput = null,
    height: Double | auto | parent | js.Function0[Double] = null,
    hiddenDays: js.Array[Double] = null,
    isRTL: js.UndefOr[Boolean] = js.undefined,
    lazyFetching: js.UndefOr[Boolean] = js.undefined,
    listDayAltFormat: String | Boolean = null,
    listDayFormat: String | Boolean = null,
    loading: (/* isLoading */ Boolean, /* view */ default) => Unit = null,
    locale: String = null,
    longPressDelay: Int | Double = null,
    maxTime: DurationInput = null,
    minTime: DurationInput = null,
    monthNames: js.Array[String] = null,
    monthNamesShort: js.Array[String] = null,
    navLinkDayClick: String | (js.Function2[/* date */ Moment, /* jsEvent */ Event, Unit]) = null,
    navLinkWeekClick: String | (js.Function2[/* weekStart */ js.Any, /* jsEvent */ Event, Unit]) = null,
    navLinks: js.UndefOr[Boolean] = js.undefined,
    nextDayThreshold: DurationInput = null,
    noEventsMessage: String = null,
    now: MomentInput | js.Function0[MomentInput] = null,
    nowIndicator: js.UndefOr[Boolean] = js.undefined,
    scrollTime: DurationInput = null,
    select: (/* start */ Moment, /* end */ Moment, /* jsEvent */ MouseEvent, /* view */ default, /* resource */ js.UndefOr[js.Any]) => Unit = null,
    selectAllow: /* selectInfo */ SelectInfo => Boolean = null,
    selectConstraint: ConstraintInput = null,
    selectHelper: js.UndefOr[Boolean] = js.undefined,
    selectOverlap: Boolean | (js.Function1[/* event */ EventObjectInput, Boolean]) = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    showNonCurrentDates: js.UndefOr[Boolean] = js.undefined,
    slotDuration: DurationInput = null,
    slotEventOverlap: js.UndefOr[Boolean] = js.undefined,
    slotLabelFormat: String = null,
    slotLabelInterval: DurationInput = null,
    snapDuration: DurationInput = null,
    startParam: String = null,
    themeButtonIcons: Boolean | ButtonIconsInput = null,
    themeSystem: standard | bootstrap3 | bootstrap4 | `jquery-ui` = null,
    timeFormat: String = null,
    timezone: String | Boolean = null,
    titleFormat: String = null,
    unselect: (/* view */ default, /* jsEvent */ Event) => Unit = null,
    unselectAuto: js.UndefOr[Boolean] = js.undefined,
    unselectCancel: String = null,
    validRange: RangeInput = null,
    viewDestroy: (/* view */ default, /* element */ JQuery) => Unit = null,
    viewRender: (/* view */ default, /* element */ JQuery) => Unit = null,
    visibleRange: (js.Function1[/* currentDate */ Moment, RangeInput]) | RangeInput = null,
    weekNumberCalculation: local | ISO | (js.Function1[/* m */ Moment, Double]) = null,
    weekNumberTitle: String = null,
    weekNumbers: js.UndefOr[Boolean] = js.undefined,
    weekNumbersWithinDays: js.UndefOr[Boolean] = js.undefined,
    weekends: js.UndefOr[Boolean] = js.undefined,
    windowResize: /* view */ default => Unit = null,
    windowResizeDelay: Int | Double = null
  ): OptionsInputBase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allDayDefault)) __obj.updateDynamic("allDayDefault")(allDayDefault)
    if (!js.isUndefined(allDaySlot)) __obj.updateDynamic("allDaySlot")(allDaySlot)
    if (allDayText != null) __obj.updateDynamic("allDayText")(allDayText)
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (bootstrapFontAwesome != null) __obj.updateDynamic("bootstrapFontAwesome")(bootstrapFontAwesome.asInstanceOf[js.Any])
    if (bootstrapGlyphicons != null) __obj.updateDynamic("bootstrapGlyphicons")(bootstrapGlyphicons.asInstanceOf[js.Any])
    if (businessHours != null) __obj.updateDynamic("businessHours")(businessHours.asInstanceOf[js.Any])
    if (buttonIcons != null) __obj.updateDynamic("buttonIcons")(buttonIcons.asInstanceOf[js.Any])
    if (!js.isUndefined(columnHeader)) __obj.updateDynamic("columnHeader")(columnHeader)
    if (columnHeaderFormat != null) __obj.updateDynamic("columnHeaderFormat")(columnHeaderFormat)
    if (columnHeaderHtml != null) __obj.updateDynamic("columnHeaderHtml")(columnHeaderHtml.asInstanceOf[js.Any])
    if (columnHeaderText != null) __obj.updateDynamic("columnHeaderText")(columnHeaderText.asInstanceOf[js.Any])
    if (contentHeight != null) __obj.updateDynamic("contentHeight")(contentHeight.asInstanceOf[js.Any])
    if (customButtons != null) __obj.updateDynamic("customButtons")(customButtons)
    if (dateAlignment != null) __obj.updateDynamic("dateAlignment")(dateAlignment)
    if (dateIncrement != null) __obj.updateDynamic("dateIncrement")(dateIncrement.asInstanceOf[js.Any])
    if (dayClick != null) __obj.updateDynamic("dayClick")(js.Any.fromFunction4(dayClick))
    if (dayCount != null) __obj.updateDynamic("dayCount")(dayCount.asInstanceOf[js.Any])
    if (dayNames != null) __obj.updateDynamic("dayNames")(dayNames)
    if (dayNamesShort != null) __obj.updateDynamic("dayNamesShort")(dayNamesShort)
    if (dayPopoverFormat != null) __obj.updateDynamic("dayPopoverFormat")(dayPopoverFormat)
    if (dayRender != null) __obj.updateDynamic("dayRender")(js.Any.fromFunction2(dayRender))
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (defaultView != null) __obj.updateDynamic("defaultView")(defaultView)
    if (!js.isUndefined(displayEventEnd)) __obj.updateDynamic("displayEventEnd")(displayEventEnd)
    if (!js.isUndefined(displayEventTime)) __obj.updateDynamic("displayEventTime")(displayEventTime)
    if (dragOpacity != null) __obj.updateDynamic("dragOpacity")(dragOpacity.asInstanceOf[js.Any])
    if (dragRevertDuration != null) __obj.updateDynamic("dragRevertDuration")(dragRevertDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(dragScroll)) __obj.updateDynamic("dragScroll")(dragScroll)
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction3(drop))
    if (dropAccept != null) __obj.updateDynamic("dropAccept")(dropAccept.asInstanceOf[js.Any])
    if (!js.isUndefined(droppable)) __obj.updateDynamic("droppable")(droppable)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (endParam != null) __obj.updateDynamic("endParam")(endParam)
    if (eventAfterAllRender != null) __obj.updateDynamic("eventAfterAllRender")(js.Any.fromFunction1(eventAfterAllRender))
    if (eventAfterRender != null) __obj.updateDynamic("eventAfterRender")(js.Any.fromFunction3(eventAfterRender))
    if (eventAllow != null) __obj.updateDynamic("eventAllow")(js.Any.fromFunction2(eventAllow))
    if (eventBackgroundColor != null) __obj.updateDynamic("eventBackgroundColor")(eventBackgroundColor)
    if (eventBorderColor != null) __obj.updateDynamic("eventBorderColor")(eventBorderColor)
    if (eventClick != null) __obj.updateDynamic("eventClick")(js.Any.fromFunction3(eventClick))
    if (eventColor != null) __obj.updateDynamic("eventColor")(eventColor)
    if (eventConstraint != null) __obj.updateDynamic("eventConstraint")(eventConstraint)
    if (eventDataTransform != null) __obj.updateDynamic("eventDataTransform")(js.Any.fromFunction1(eventDataTransform))
    if (eventDestroy != null) __obj.updateDynamic("eventDestroy")(js.Any.fromFunction3(eventDestroy))
    if (eventDragStart != null) __obj.updateDynamic("eventDragStart")(js.Any.fromFunction4(eventDragStart))
    if (eventDragStop != null) __obj.updateDynamic("eventDragStop")(js.Any.fromFunction4(eventDragStop))
    if (eventDrop != null) __obj.updateDynamic("eventDrop")(js.Any.fromFunction6(eventDrop))
    if (!js.isUndefined(eventDurationEditable)) __obj.updateDynamic("eventDurationEditable")(eventDurationEditable)
    if (eventLimit != null) __obj.updateDynamic("eventLimit")(eventLimit.asInstanceOf[js.Any])
    if (eventLimitClick != null) __obj.updateDynamic("eventLimitClick")(eventLimitClick.asInstanceOf[js.Any])
    if (eventLimitText != null) __obj.updateDynamic("eventLimitText")(eventLimitText.asInstanceOf[js.Any])
    if (eventLongPressDelay != null) __obj.updateDynamic("eventLongPressDelay")(eventLongPressDelay.asInstanceOf[js.Any])
    if (eventMouseout != null) __obj.updateDynamic("eventMouseout")(js.Any.fromFunction3(eventMouseout))
    if (eventMouseover != null) __obj.updateDynamic("eventMouseover")(js.Any.fromFunction3(eventMouseover))
    if (eventOrder != null) __obj.updateDynamic("eventOrder")(eventOrder.asInstanceOf[js.Any])
    if (eventOverlap != null) __obj.updateDynamic("eventOverlap")(eventOverlap.asInstanceOf[js.Any])
    if (eventReceive != null) __obj.updateDynamic("eventReceive")(js.Any.fromFunction1(eventReceive))
    if (eventRender != null) __obj.updateDynamic("eventRender")(js.Any.fromFunction3(eventRender))
    if (eventRenderWait != null) __obj.updateDynamic("eventRenderWait")(eventRenderWait.asInstanceOf[js.Any])
    if (eventResize != null) __obj.updateDynamic("eventResize")(js.Any.fromFunction6(eventResize))
    if (eventResizeStart != null) __obj.updateDynamic("eventResizeStart")(js.Any.fromFunction4(eventResizeStart))
    if (eventResizeStop != null) __obj.updateDynamic("eventResizeStop")(js.Any.fromFunction4(eventResizeStop))
    if (eventSources != null) __obj.updateDynamic("eventSources")(eventSources)
    if (!js.isUndefined(eventStartEditable)) __obj.updateDynamic("eventStartEditable")(eventStartEditable)
    if (eventTextColor != null) __obj.updateDynamic("eventTextColor")(eventTextColor)
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (firstDay != null) __obj.updateDynamic("firstDay")(firstDay.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWeekCount)) __obj.updateDynamic("fixedWeekCount")(fixedWeekCount)
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(handleWindowResize)) __obj.updateDynamic("handleWindowResize")(handleWindowResize)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hiddenDays != null) __obj.updateDynamic("hiddenDays")(hiddenDays)
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL)
    if (!js.isUndefined(lazyFetching)) __obj.updateDynamic("lazyFetching")(lazyFetching)
    if (listDayAltFormat != null) __obj.updateDynamic("listDayAltFormat")(listDayAltFormat.asInstanceOf[js.Any])
    if (listDayFormat != null) __obj.updateDynamic("listDayFormat")(listDayFormat.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(js.Any.fromFunction2(loading))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (longPressDelay != null) __obj.updateDynamic("longPressDelay")(longPressDelay.asInstanceOf[js.Any])
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames)
    if (monthNamesShort != null) __obj.updateDynamic("monthNamesShort")(monthNamesShort)
    if (navLinkDayClick != null) __obj.updateDynamic("navLinkDayClick")(navLinkDayClick.asInstanceOf[js.Any])
    if (navLinkWeekClick != null) __obj.updateDynamic("navLinkWeekClick")(navLinkWeekClick.asInstanceOf[js.Any])
    if (!js.isUndefined(navLinks)) __obj.updateDynamic("navLinks")(navLinks)
    if (nextDayThreshold != null) __obj.updateDynamic("nextDayThreshold")(nextDayThreshold.asInstanceOf[js.Any])
    if (noEventsMessage != null) __obj.updateDynamic("noEventsMessage")(noEventsMessage)
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (!js.isUndefined(nowIndicator)) __obj.updateDynamic("nowIndicator")(nowIndicator)
    if (scrollTime != null) __obj.updateDynamic("scrollTime")(scrollTime.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction5(select))
    if (selectAllow != null) __obj.updateDynamic("selectAllow")(js.Any.fromFunction1(selectAllow))
    if (selectConstraint != null) __obj.updateDynamic("selectConstraint")(selectConstraint)
    if (!js.isUndefined(selectHelper)) __obj.updateDynamic("selectHelper")(selectHelper)
    if (selectOverlap != null) __obj.updateDynamic("selectOverlap")(selectOverlap.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(showNonCurrentDates)) __obj.updateDynamic("showNonCurrentDates")(showNonCurrentDates)
    if (slotDuration != null) __obj.updateDynamic("slotDuration")(slotDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(slotEventOverlap)) __obj.updateDynamic("slotEventOverlap")(slotEventOverlap)
    if (slotLabelFormat != null) __obj.updateDynamic("slotLabelFormat")(slotLabelFormat)
    if (slotLabelInterval != null) __obj.updateDynamic("slotLabelInterval")(slotLabelInterval.asInstanceOf[js.Any])
    if (snapDuration != null) __obj.updateDynamic("snapDuration")(snapDuration.asInstanceOf[js.Any])
    if (startParam != null) __obj.updateDynamic("startParam")(startParam)
    if (themeButtonIcons != null) __obj.updateDynamic("themeButtonIcons")(themeButtonIcons.asInstanceOf[js.Any])
    if (themeSystem != null) __obj.updateDynamic("themeSystem")(themeSystem.asInstanceOf[js.Any])
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (titleFormat != null) __obj.updateDynamic("titleFormat")(titleFormat)
    if (unselect != null) __obj.updateDynamic("unselect")(js.Any.fromFunction2(unselect))
    if (!js.isUndefined(unselectAuto)) __obj.updateDynamic("unselectAuto")(unselectAuto)
    if (unselectCancel != null) __obj.updateDynamic("unselectCancel")(unselectCancel)
    if (validRange != null) __obj.updateDynamic("validRange")(validRange)
    if (viewDestroy != null) __obj.updateDynamic("viewDestroy")(js.Any.fromFunction2(viewDestroy))
    if (viewRender != null) __obj.updateDynamic("viewRender")(js.Any.fromFunction2(viewRender))
    if (visibleRange != null) __obj.updateDynamic("visibleRange")(visibleRange.asInstanceOf[js.Any])
    if (weekNumberCalculation != null) __obj.updateDynamic("weekNumberCalculation")(weekNumberCalculation.asInstanceOf[js.Any])
    if (weekNumberTitle != null) __obj.updateDynamic("weekNumberTitle")(weekNumberTitle)
    if (!js.isUndefined(weekNumbers)) __obj.updateDynamic("weekNumbers")(weekNumbers)
    if (!js.isUndefined(weekNumbersWithinDays)) __obj.updateDynamic("weekNumbersWithinDays")(weekNumbersWithinDays)
    if (!js.isUndefined(weekends)) __obj.updateDynamic("weekends")(weekends)
    if (windowResize != null) __obj.updateDynamic("windowResize")(js.Any.fromFunction1(windowResize))
    if (windowResizeDelay != null) __obj.updateDynamic("windowResizeDelay")(windowResizeDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsInputBase]
  }
}

