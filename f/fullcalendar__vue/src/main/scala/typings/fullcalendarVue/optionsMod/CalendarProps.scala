package typings.fullcalendarVue.optionsMod

import typings.fullcalendarVue.anon.AllDay
import typings.fullcalendarVue.fullcalendarVueStrings.ISO
import typings.fullcalendarVue.fullcalendarVueStrings.auto
import typings.fullcalendarVue.fullcalendarVueStrings.day
import typings.fullcalendarVue.fullcalendarVueStrings.local
import typings.fullcalendarVue.fullcalendarVueStrings.parent
import typings.fullcalendarVue.fullcalendarVueStrings.popover
import typings.fullcalendarVue.fullcalendarVueStrings.timeGridDay
import typings.fullcalendarVue.fullcalendarVueStrings.timeGridWeek
import typings.fullcalendarVue.fullcalendarVueStrings.week
import typings.std.Date
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarProps extends js.Object {
  var allDayDefault: js.UndefOr[Boolean] = js.undefined
  var allDayHtml: js.UndefOr[String] = js.undefined
  var allDayMaintainDuration: js.UndefOr[Boolean] = js.undefined
  var allDaySlot: js.UndefOr[Boolean] = js.undefined
  var allDayText: js.UndefOr[String] = js.undefined
  var aspectRatio: js.UndefOr[Double] = js.undefined
  var bootstrapFontAwesome: js.UndefOr[BootstrapFontAwesome | Boolean] = js.undefined
  var businessHours: js.UndefOr[js.Any] = js.undefined
  var buttonIcons: js.UndefOr[ButtonIcons | Boolean] = js.undefined
  // compound OptionsInput...
  var buttonText: js.UndefOr[js.Any] = js.undefined
  var cmdFormatter: js.UndefOr[String] = js.undefined
  var columnHeader: js.UndefOr[Boolean] = js.undefined
  var columnHeaderFormat: js.UndefOr[FormatterInput] = js.undefined
  var columnHeaderHtml: js.UndefOr[String | (js.Function1[/* date */ DateInput, String])] = js.undefined
  var columnHeaderText: js.UndefOr[String | (js.Function1[/* date */ DateInput, String])] = js.undefined
  var contentHeight: js.UndefOr[Double | auto | js.Function0[Double]] = js.undefined
  var customButtons: js.UndefOr[CustomButtons] = js.undefined
  var dateAlignment: js.UndefOr[String] = js.undefined
  var dateIncrement: js.UndefOr[DurationInput] = js.undefined
  var datesAboveResources: js.UndefOr[js.Any] = js.undefined
  var datesDestroy: js.UndefOr[js.Any] = js.undefined
  // used to be emissions but are now props...
  var datesRender: js.UndefOr[js.Any] = js.undefined
  var dayCount: js.UndefOr[Double] = js.undefined
  var dayPopoverFormat: js.UndefOr[FormatterInput] = js.undefined
  var dayRender: js.UndefOr[js.Any] = js.undefined
  var defaultAllDayEventDuration: js.UndefOr[DurationInput] = js.undefined
  var defaultDate: js.UndefOr[DateInput] = js.undefined
  var defaultRangeSeparator: js.UndefOr[String] = js.undefined
  var defaultTimedEventDuration: js.UndefOr[DurationInput] = js.undefined
  var defaultView: js.UndefOr[String] = js.undefined
  var dir: js.UndefOr[direction] = js.undefined
  var displayEventEnd: js.UndefOr[Boolean] = js.undefined
  var displayEventTime: js.UndefOr[Boolean] = js.undefined
  var dragRevertDuration: js.UndefOr[Double] = js.undefined
  var dragScroll: js.UndefOr[Boolean] = js.undefined
  var dropAccept: js.UndefOr[String | (js.Function1[/* draggable */ js.Any, Boolean])] = js.undefined
  var droppable: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[DurationInput] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var endParam: js.UndefOr[String] = js.undefined
  var eventAllow: js.UndefOr[AllowFunc] = js.undefined
  var eventBackgroundColor: js.UndefOr[String] = js.undefined
  var eventBorderColor: js.UndefOr[String] = js.undefined
  var eventClassName: js.UndefOr[js.Array[String] | String] = js.undefined
  var eventClassNames: js.UndefOr[js.Array[String] | String] = js.undefined
  var eventColor: js.UndefOr[String] = js.undefined
  var eventConstraint: js.UndefOr[js.Any] = js.undefined
  var eventDataTransform: js.UndefOr[js.Any] = js.undefined
  var eventDestroy: js.UndefOr[js.Any] = js.undefined
  var eventDragMinDistance: js.UndefOr[Double] = js.undefined
  var eventDurationEditable: js.UndefOr[Boolean] = js.undefined
  var eventLimit: js.UndefOr[Boolean | Double] = js.undefined
  var eventLimitClick: js.UndefOr[
    popover | week | day | timeGridWeek | timeGridDay | String | (js.Function1[/* arg */ AllDay, Unit])
  ] = js.undefined
  var eventLimitText: js.UndefOr[String | (js.Function1[/* eventCnt */ Double, String])] = js.undefined
  var eventLongPressDelay: js.UndefOr[Double] = js.undefined
  var eventOrder: js.UndefOr[String | (js.Array[(js.Function2[/* a */ _, /* b */ _, Double]) | String])] = js.undefined
  var eventOverlap: js.UndefOr[Boolean | OverlapFunc] = js.undefined
  var eventRender: js.UndefOr[js.Any] = js.undefined
  var eventResizableFromStart: js.UndefOr[Boolean] = js.undefined
  var eventSourceFailure: js.UndefOr[js.Any] = js.undefined
  var eventSourceSuccess: js.UndefOr[js.Any] = js.undefined
  var eventSources: js.UndefOr[js.Array[_]] = js.undefined
  var eventStartEditable: js.UndefOr[Boolean] = js.undefined
  var eventTextColor: js.UndefOr[String] = js.undefined
  var eventTimeFormat: js.UndefOr[FormatterInput] = js.undefined
  var events: js.UndefOr[js.Any] = js.undefined
  var filterResourcesWithEvents: js.UndefOr[js.Any] = js.undefined
  var firstDay: js.UndefOr[Double] = js.undefined
  var fixedWeekCount: js.UndefOr[Boolean] = js.undefined
  var footer: js.UndefOr[ToolbarInput | Boolean] = js.undefined
  var forceEventDuration: js.UndefOr[Boolean] = js.undefined
  var googleCalendarApiKey: js.UndefOr[js.Any] = js.undefined
  var handleWindowResize: js.UndefOr[Boolean] = js.undefined
  var header: js.UndefOr[ToolbarInput | Boolean] = js.undefined
  var height: js.UndefOr[Double | auto | parent | js.Function0[Double]] = js.undefined
  var hiddenDays: js.UndefOr[js.Array[Double]] = js.undefined
  var lazyFetching: js.UndefOr[Boolean] = js.undefined
  var listDayAltFormat: js.UndefOr[FormatterInput | Boolean] = js.undefined
  var listDayFormat: js.UndefOr[FormatterInput | Boolean] = js.undefined
  var locale: js.UndefOr[LocaleSingularArg] = js.undefined
  var locales: js.UndefOr[js.Array[RawLocale]] = js.undefined
  var longPressDelay: js.UndefOr[Double] = js.undefined
  var maxTime: js.UndefOr[DurationInput] = js.undefined
  var minTime: js.UndefOr[DurationInput] = js.undefined
  var navLinkDayClick: js.UndefOr[String | (js.Function2[/* date */ Date, /* jsEvent */ Event, Unit])] = js.undefined
  var navLinkWeekClick: js.UndefOr[String | (js.Function2[/* weekStart */ js.Any, /* jsEvent */ Event, Unit])] = js.undefined
  var navLinks: js.UndefOr[Boolean] = js.undefined
  var nextDayThreshold: js.UndefOr[DurationInput] = js.undefined
  var noEventsMessage: js.UndefOr[String] = js.undefined
  var now: js.UndefOr[DateInput | js.Function0[DateInput]] = js.undefined
  var nowIndicator: js.UndefOr[Boolean] = js.undefined
  var plugins: js.UndefOr[js.Any] = js.undefined
  var progressiveEventRendering: js.UndefOr[Boolean] = js.undefined
  var refetchResourcesOnNavigate: js.UndefOr[js.Any] = js.undefined
  var rerenderDelay: js.UndefOr[Double | Null] = js.undefined
  var resourceAreaWidth: js.UndefOr[js.Any] = js.undefined
  var resourceColumns: js.UndefOr[js.Any] = js.undefined
  var resourceGroupField: js.UndefOr[js.Any] = js.undefined
  var resourceGroupText: js.UndefOr[js.Any] = js.undefined
  var resourceLabelText: js.UndefOr[js.Any] = js.undefined
  var resourceOrder: js.UndefOr[js.Any] = js.undefined
  var resourceRender: js.UndefOr[js.Any] = js.undefined
  var resourceText: js.UndefOr[js.Any] = js.undefined
  var resources: js.UndefOr[js.Any] = js.undefined
  var resourcesInitiallyExpanded: js.UndefOr[js.Any] = js.undefined
  // scheduler...
  var schedulerLicenseKey: js.UndefOr[js.Any] = js.undefined
  var scrollTime: js.UndefOr[DurationInput] = js.undefined
  var selectAllow: js.UndefOr[AllowFunc] = js.undefined
  var selectConstraint: js.UndefOr[js.Any] = js.undefined
  var selectLongPressDelay: js.UndefOr[Double] = js.undefined
  var selectMinDistance: js.UndefOr[Double] = js.undefined
  var selectMirror: js.UndefOr[Boolean] = js.undefined
  var selectOverlap: js.UndefOr[Boolean | OverlapFunc] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var showNonCurrentDates: js.UndefOr[Boolean] = js.undefined
  var slotDuration: js.UndefOr[DurationInput] = js.undefined
  var slotEventOverlap: js.UndefOr[Boolean] = js.undefined
  var slotLabelFormat: js.UndefOr[FormatterInput] = js.undefined
  var slotLabelInterval: js.UndefOr[DurationInput] = js.undefined
  var slotWidth: js.UndefOr[js.Any] = js.undefined
  var snapDuration: js.UndefOr[DurationInput] = js.undefined
  var startParam: js.UndefOr[String] = js.undefined
  var themeSystem: js.UndefOr[String] = js.undefined
  var timeGridEventMinHeight: js.UndefOr[Double] = js.undefined
  var timeZone: js.UndefOr[String | Boolean] = js.undefined
  var timeZoneParam: js.UndefOr[String] = js.undefined
  var titleFormat: js.UndefOr[FormatterInput] = js.undefined
  var titleRangeSeparator: js.UndefOr[String] = js.undefined
  var unselectAuto: js.UndefOr[Boolean] = js.undefined
  var unselectCancel: js.UndefOr[String] = js.undefined
  var validRange: js.UndefOr[DateRangeInput] = js.undefined
  var viewSkeletonDestroy: js.UndefOr[js.Any] = js.undefined
  var viewSkeletonRender: js.UndefOr[js.Any] = js.undefined
  var views: js.UndefOr[js.Any] = js.undefined
  var visibleRange: js.UndefOr[(js.Function1[/* currentDate */ Date, DateRangeInput]) | DateRangeInput] = js.undefined
  var weekLabel: js.UndefOr[String] = js.undefined
  var weekNumberCalculation: js.UndefOr[local | ISO | (js.Function1[/* m */ Date, Double])] = js.undefined
  var weekNumbers: js.UndefOr[Boolean] = js.undefined
  var weekNumbersWithinDays: js.UndefOr[Boolean] = js.undefined
  var weekends: js.UndefOr[Boolean] = js.undefined
  var windowResizeDelay: js.UndefOr[Double] = js.undefined
}

object CalendarProps {
  @scala.inline
  def apply(
    allDayDefault: js.UndefOr[Boolean] = js.undefined,
    allDayHtml: String = null,
    allDayMaintainDuration: js.UndefOr[Boolean] = js.undefined,
    allDaySlot: js.UndefOr[Boolean] = js.undefined,
    allDayText: String = null,
    aspectRatio: js.UndefOr[Double] = js.undefined,
    bootstrapFontAwesome: BootstrapFontAwesome | Boolean = null,
    businessHours: js.Any = null,
    buttonIcons: ButtonIcons | Boolean = null,
    buttonText: js.Any = null,
    cmdFormatter: String = null,
    columnHeader: js.UndefOr[Boolean] = js.undefined,
    columnHeaderFormat: FormatterInput = null,
    columnHeaderHtml: String | (js.Function1[/* date */ DateInput, String]) = null,
    columnHeaderText: String | (js.Function1[/* date */ DateInput, String]) = null,
    contentHeight: Double | auto | js.Function0[Double] = null,
    customButtons: CustomButtons = null,
    dateAlignment: String = null,
    dateIncrement: DurationInput = null,
    datesAboveResources: js.Any = null,
    datesDestroy: js.Any = null,
    datesRender: js.Any = null,
    dayCount: js.UndefOr[Double] = js.undefined,
    dayPopoverFormat: FormatterInput = null,
    dayRender: js.Any = null,
    defaultAllDayEventDuration: DurationInput = null,
    defaultDate: DateInput = null,
    defaultRangeSeparator: String = null,
    defaultTimedEventDuration: DurationInput = null,
    defaultView: String = null,
    dir: direction = null,
    displayEventEnd: js.UndefOr[Boolean] = js.undefined,
    displayEventTime: js.UndefOr[Boolean] = js.undefined,
    dragRevertDuration: js.UndefOr[Double] = js.undefined,
    dragScroll: js.UndefOr[Boolean] = js.undefined,
    dropAccept: String | (js.Function1[/* draggable */ js.Any, Boolean]) = null,
    droppable: js.UndefOr[Boolean] = js.undefined,
    duration: DurationInput = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    endParam: String = null,
    eventAllow: (/* span */ js.Any, /* movingEvent */ js.Any) => Boolean = null,
    eventBackgroundColor: String = null,
    eventBorderColor: String = null,
    eventClassName: js.Array[String] | String = null,
    eventClassNames: js.Array[String] | String = null,
    eventColor: String = null,
    eventConstraint: js.Any = null,
    eventDataTransform: js.Any = null,
    eventDestroy: js.Any = null,
    eventDragMinDistance: js.UndefOr[Double] = js.undefined,
    eventDurationEditable: js.UndefOr[Boolean] = js.undefined,
    eventLimit: Boolean | Double = null,
    eventLimitClick: popover | week | day | timeGridWeek | timeGridDay | String | (js.Function1[/* arg */ AllDay, Unit]) = null,
    eventLimitText: String | (js.Function1[/* eventCnt */ Double, String]) = null,
    eventLongPressDelay: js.UndefOr[Double] = js.undefined,
    eventOrder: String | (js.Array[(js.Function2[/* a */ _, /* b */ _, Double]) | String]) = null,
    eventOverlap: Boolean | OverlapFunc = null,
    eventRender: js.Any = null,
    eventResizableFromStart: js.UndefOr[Boolean] = js.undefined,
    eventSourceFailure: js.Any = null,
    eventSourceSuccess: js.Any = null,
    eventSources: js.Array[_] = null,
    eventStartEditable: js.UndefOr[Boolean] = js.undefined,
    eventTextColor: String = null,
    eventTimeFormat: FormatterInput = null,
    events: js.Any = null,
    filterResourcesWithEvents: js.Any = null,
    firstDay: js.UndefOr[Double] = js.undefined,
    fixedWeekCount: js.UndefOr[Boolean] = js.undefined,
    footer: ToolbarInput | Boolean = null,
    forceEventDuration: js.UndefOr[Boolean] = js.undefined,
    googleCalendarApiKey: js.Any = null,
    handleWindowResize: js.UndefOr[Boolean] = js.undefined,
    header: ToolbarInput | Boolean = null,
    height: Double | auto | parent | js.Function0[Double] = null,
    hiddenDays: js.Array[Double] = null,
    lazyFetching: js.UndefOr[Boolean] = js.undefined,
    listDayAltFormat: FormatterInput | Boolean = null,
    listDayFormat: FormatterInput | Boolean = null,
    locale: LocaleSingularArg = null,
    locales: js.Array[RawLocale] = null,
    longPressDelay: js.UndefOr[Double] = js.undefined,
    maxTime: DurationInput = null,
    minTime: DurationInput = null,
    navLinkDayClick: String | (js.Function2[/* date */ Date, /* jsEvent */ Event, Unit]) = null,
    navLinkWeekClick: String | (js.Function2[/* weekStart */ js.Any, /* jsEvent */ Event, Unit]) = null,
    navLinks: js.UndefOr[Boolean] = js.undefined,
    nextDayThreshold: DurationInput = null,
    noEventsMessage: String = null,
    now: DateInput | js.Function0[DateInput] = null,
    nowIndicator: js.UndefOr[Boolean] = js.undefined,
    plugins: js.Any = null,
    progressiveEventRendering: js.UndefOr[Boolean] = js.undefined,
    refetchResourcesOnNavigate: js.Any = null,
    rerenderDelay: js.UndefOr[Null | Double] = js.undefined,
    resourceAreaWidth: js.Any = null,
    resourceColumns: js.Any = null,
    resourceGroupField: js.Any = null,
    resourceGroupText: js.Any = null,
    resourceLabelText: js.Any = null,
    resourceOrder: js.Any = null,
    resourceRender: js.Any = null,
    resourceText: js.Any = null,
    resources: js.Any = null,
    resourcesInitiallyExpanded: js.Any = null,
    schedulerLicenseKey: js.Any = null,
    scrollTime: DurationInput = null,
    selectAllow: (/* span */ js.Any, /* movingEvent */ js.Any) => Boolean = null,
    selectConstraint: js.Any = null,
    selectLongPressDelay: js.UndefOr[Double] = js.undefined,
    selectMinDistance: js.UndefOr[Double] = js.undefined,
    selectMirror: js.UndefOr[Boolean] = js.undefined,
    selectOverlap: Boolean | OverlapFunc = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    showNonCurrentDates: js.UndefOr[Boolean] = js.undefined,
    slotDuration: DurationInput = null,
    slotEventOverlap: js.UndefOr[Boolean] = js.undefined,
    slotLabelFormat: FormatterInput = null,
    slotLabelInterval: DurationInput = null,
    slotWidth: js.Any = null,
    snapDuration: DurationInput = null,
    startParam: String = null,
    themeSystem: String = null,
    timeGridEventMinHeight: js.UndefOr[Double] = js.undefined,
    timeZone: String | Boolean = null,
    timeZoneParam: String = null,
    titleFormat: FormatterInput = null,
    titleRangeSeparator: String = null,
    unselectAuto: js.UndefOr[Boolean] = js.undefined,
    unselectCancel: String = null,
    validRange: DateRangeInput = null,
    viewSkeletonDestroy: js.Any = null,
    viewSkeletonRender: js.Any = null,
    views: js.Any = null,
    visibleRange: (js.Function1[/* currentDate */ Date, DateRangeInput]) | DateRangeInput = null,
    weekLabel: String = null,
    weekNumberCalculation: local | ISO | (js.Function1[/* m */ Date, Double]) = null,
    weekNumbers: js.UndefOr[Boolean] = js.undefined,
    weekNumbersWithinDays: js.UndefOr[Boolean] = js.undefined,
    weekends: js.UndefOr[Boolean] = js.undefined,
    windowResizeDelay: js.UndefOr[Double] = js.undefined
  ): CalendarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allDayDefault)) __obj.updateDynamic("allDayDefault")(allDayDefault.get.asInstanceOf[js.Any])
    if (allDayHtml != null) __obj.updateDynamic("allDayHtml")(allDayHtml.asInstanceOf[js.Any])
    if (!js.isUndefined(allDayMaintainDuration)) __obj.updateDynamic("allDayMaintainDuration")(allDayMaintainDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allDaySlot)) __obj.updateDynamic("allDaySlot")(allDaySlot.get.asInstanceOf[js.Any])
    if (allDayText != null) __obj.updateDynamic("allDayText")(allDayText.asInstanceOf[js.Any])
    if (!js.isUndefined(aspectRatio)) __obj.updateDynamic("aspectRatio")(aspectRatio.get.asInstanceOf[js.Any])
    if (bootstrapFontAwesome != null) __obj.updateDynamic("bootstrapFontAwesome")(bootstrapFontAwesome.asInstanceOf[js.Any])
    if (businessHours != null) __obj.updateDynamic("businessHours")(businessHours.asInstanceOf[js.Any])
    if (buttonIcons != null) __obj.updateDynamic("buttonIcons")(buttonIcons.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (cmdFormatter != null) __obj.updateDynamic("cmdFormatter")(cmdFormatter.asInstanceOf[js.Any])
    if (!js.isUndefined(columnHeader)) __obj.updateDynamic("columnHeader")(columnHeader.get.asInstanceOf[js.Any])
    if (columnHeaderFormat != null) __obj.updateDynamic("columnHeaderFormat")(columnHeaderFormat.asInstanceOf[js.Any])
    if (columnHeaderHtml != null) __obj.updateDynamic("columnHeaderHtml")(columnHeaderHtml.asInstanceOf[js.Any])
    if (columnHeaderText != null) __obj.updateDynamic("columnHeaderText")(columnHeaderText.asInstanceOf[js.Any])
    if (contentHeight != null) __obj.updateDynamic("contentHeight")(contentHeight.asInstanceOf[js.Any])
    if (customButtons != null) __obj.updateDynamic("customButtons")(customButtons.asInstanceOf[js.Any])
    if (dateAlignment != null) __obj.updateDynamic("dateAlignment")(dateAlignment.asInstanceOf[js.Any])
    if (dateIncrement != null) __obj.updateDynamic("dateIncrement")(dateIncrement.asInstanceOf[js.Any])
    if (datesAboveResources != null) __obj.updateDynamic("datesAboveResources")(datesAboveResources.asInstanceOf[js.Any])
    if (datesDestroy != null) __obj.updateDynamic("datesDestroy")(datesDestroy.asInstanceOf[js.Any])
    if (datesRender != null) __obj.updateDynamic("datesRender")(datesRender.asInstanceOf[js.Any])
    if (!js.isUndefined(dayCount)) __obj.updateDynamic("dayCount")(dayCount.get.asInstanceOf[js.Any])
    if (dayPopoverFormat != null) __obj.updateDynamic("dayPopoverFormat")(dayPopoverFormat.asInstanceOf[js.Any])
    if (dayRender != null) __obj.updateDynamic("dayRender")(dayRender.asInstanceOf[js.Any])
    if (defaultAllDayEventDuration != null) __obj.updateDynamic("defaultAllDayEventDuration")(defaultAllDayEventDuration.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (defaultRangeSeparator != null) __obj.updateDynamic("defaultRangeSeparator")(defaultRangeSeparator.asInstanceOf[js.Any])
    if (defaultTimedEventDuration != null) __obj.updateDynamic("defaultTimedEventDuration")(defaultTimedEventDuration.asInstanceOf[js.Any])
    if (defaultView != null) __obj.updateDynamic("defaultView")(defaultView.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(displayEventEnd)) __obj.updateDynamic("displayEventEnd")(displayEventEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayEventTime)) __obj.updateDynamic("displayEventTime")(displayEventTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dragRevertDuration)) __obj.updateDynamic("dragRevertDuration")(dragRevertDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dragScroll)) __obj.updateDynamic("dragScroll")(dragScroll.get.asInstanceOf[js.Any])
    if (dropAccept != null) __obj.updateDynamic("dropAccept")(dropAccept.asInstanceOf[js.Any])
    if (!js.isUndefined(droppable)) __obj.updateDynamic("droppable")(droppable.get.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    if (endParam != null) __obj.updateDynamic("endParam")(endParam.asInstanceOf[js.Any])
    if (eventAllow != null) __obj.updateDynamic("eventAllow")(js.Any.fromFunction2(eventAllow))
    if (eventBackgroundColor != null) __obj.updateDynamic("eventBackgroundColor")(eventBackgroundColor.asInstanceOf[js.Any])
    if (eventBorderColor != null) __obj.updateDynamic("eventBorderColor")(eventBorderColor.asInstanceOf[js.Any])
    if (eventClassName != null) __obj.updateDynamic("eventClassName")(eventClassName.asInstanceOf[js.Any])
    if (eventClassNames != null) __obj.updateDynamic("eventClassNames")(eventClassNames.asInstanceOf[js.Any])
    if (eventColor != null) __obj.updateDynamic("eventColor")(eventColor.asInstanceOf[js.Any])
    if (eventConstraint != null) __obj.updateDynamic("eventConstraint")(eventConstraint.asInstanceOf[js.Any])
    if (eventDataTransform != null) __obj.updateDynamic("eventDataTransform")(eventDataTransform.asInstanceOf[js.Any])
    if (eventDestroy != null) __obj.updateDynamic("eventDestroy")(eventDestroy.asInstanceOf[js.Any])
    if (!js.isUndefined(eventDragMinDistance)) __obj.updateDynamic("eventDragMinDistance")(eventDragMinDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(eventDurationEditable)) __obj.updateDynamic("eventDurationEditable")(eventDurationEditable.get.asInstanceOf[js.Any])
    if (eventLimit != null) __obj.updateDynamic("eventLimit")(eventLimit.asInstanceOf[js.Any])
    if (eventLimitClick != null) __obj.updateDynamic("eventLimitClick")(eventLimitClick.asInstanceOf[js.Any])
    if (eventLimitText != null) __obj.updateDynamic("eventLimitText")(eventLimitText.asInstanceOf[js.Any])
    if (!js.isUndefined(eventLongPressDelay)) __obj.updateDynamic("eventLongPressDelay")(eventLongPressDelay.get.asInstanceOf[js.Any])
    if (eventOrder != null) __obj.updateDynamic("eventOrder")(eventOrder.asInstanceOf[js.Any])
    if (eventOverlap != null) __obj.updateDynamic("eventOverlap")(eventOverlap.asInstanceOf[js.Any])
    if (eventRender != null) __obj.updateDynamic("eventRender")(eventRender.asInstanceOf[js.Any])
    if (!js.isUndefined(eventResizableFromStart)) __obj.updateDynamic("eventResizableFromStart")(eventResizableFromStart.get.asInstanceOf[js.Any])
    if (eventSourceFailure != null) __obj.updateDynamic("eventSourceFailure")(eventSourceFailure.asInstanceOf[js.Any])
    if (eventSourceSuccess != null) __obj.updateDynamic("eventSourceSuccess")(eventSourceSuccess.asInstanceOf[js.Any])
    if (eventSources != null) __obj.updateDynamic("eventSources")(eventSources.asInstanceOf[js.Any])
    if (!js.isUndefined(eventStartEditable)) __obj.updateDynamic("eventStartEditable")(eventStartEditable.get.asInstanceOf[js.Any])
    if (eventTextColor != null) __obj.updateDynamic("eventTextColor")(eventTextColor.asInstanceOf[js.Any])
    if (eventTimeFormat != null) __obj.updateDynamic("eventTimeFormat")(eventTimeFormat.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (filterResourcesWithEvents != null) __obj.updateDynamic("filterResourcesWithEvents")(filterResourcesWithEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(firstDay)) __obj.updateDynamic("firstDay")(firstDay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWeekCount)) __obj.updateDynamic("fixedWeekCount")(fixedWeekCount.get.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(forceEventDuration)) __obj.updateDynamic("forceEventDuration")(forceEventDuration.get.asInstanceOf[js.Any])
    if (googleCalendarApiKey != null) __obj.updateDynamic("googleCalendarApiKey")(googleCalendarApiKey.asInstanceOf[js.Any])
    if (!js.isUndefined(handleWindowResize)) __obj.updateDynamic("handleWindowResize")(handleWindowResize.get.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hiddenDays != null) __obj.updateDynamic("hiddenDays")(hiddenDays.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyFetching)) __obj.updateDynamic("lazyFetching")(lazyFetching.get.asInstanceOf[js.Any])
    if (listDayAltFormat != null) __obj.updateDynamic("listDayAltFormat")(listDayAltFormat.asInstanceOf[js.Any])
    if (listDayFormat != null) __obj.updateDynamic("listDayFormat")(listDayFormat.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (!js.isUndefined(longPressDelay)) __obj.updateDynamic("longPressDelay")(longPressDelay.get.asInstanceOf[js.Any])
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    if (navLinkDayClick != null) __obj.updateDynamic("navLinkDayClick")(navLinkDayClick.asInstanceOf[js.Any])
    if (navLinkWeekClick != null) __obj.updateDynamic("navLinkWeekClick")(navLinkWeekClick.asInstanceOf[js.Any])
    if (!js.isUndefined(navLinks)) __obj.updateDynamic("navLinks")(navLinks.get.asInstanceOf[js.Any])
    if (nextDayThreshold != null) __obj.updateDynamic("nextDayThreshold")(nextDayThreshold.asInstanceOf[js.Any])
    if (noEventsMessage != null) __obj.updateDynamic("noEventsMessage")(noEventsMessage.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (!js.isUndefined(nowIndicator)) __obj.updateDynamic("nowIndicator")(nowIndicator.get.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(progressiveEventRendering)) __obj.updateDynamic("progressiveEventRendering")(progressiveEventRendering.get.asInstanceOf[js.Any])
    if (refetchResourcesOnNavigate != null) __obj.updateDynamic("refetchResourcesOnNavigate")(refetchResourcesOnNavigate.asInstanceOf[js.Any])
    if (!js.isUndefined(rerenderDelay)) __obj.updateDynamic("rerenderDelay")(rerenderDelay.asInstanceOf[js.Any])
    if (resourceAreaWidth != null) __obj.updateDynamic("resourceAreaWidth")(resourceAreaWidth.asInstanceOf[js.Any])
    if (resourceColumns != null) __obj.updateDynamic("resourceColumns")(resourceColumns.asInstanceOf[js.Any])
    if (resourceGroupField != null) __obj.updateDynamic("resourceGroupField")(resourceGroupField.asInstanceOf[js.Any])
    if (resourceGroupText != null) __obj.updateDynamic("resourceGroupText")(resourceGroupText.asInstanceOf[js.Any])
    if (resourceLabelText != null) __obj.updateDynamic("resourceLabelText")(resourceLabelText.asInstanceOf[js.Any])
    if (resourceOrder != null) __obj.updateDynamic("resourceOrder")(resourceOrder.asInstanceOf[js.Any])
    if (resourceRender != null) __obj.updateDynamic("resourceRender")(resourceRender.asInstanceOf[js.Any])
    if (resourceText != null) __obj.updateDynamic("resourceText")(resourceText.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (resourcesInitiallyExpanded != null) __obj.updateDynamic("resourcesInitiallyExpanded")(resourcesInitiallyExpanded.asInstanceOf[js.Any])
    if (schedulerLicenseKey != null) __obj.updateDynamic("schedulerLicenseKey")(schedulerLicenseKey.asInstanceOf[js.Any])
    if (scrollTime != null) __obj.updateDynamic("scrollTime")(scrollTime.asInstanceOf[js.Any])
    if (selectAllow != null) __obj.updateDynamic("selectAllow")(js.Any.fromFunction2(selectAllow))
    if (selectConstraint != null) __obj.updateDynamic("selectConstraint")(selectConstraint.asInstanceOf[js.Any])
    if (!js.isUndefined(selectLongPressDelay)) __obj.updateDynamic("selectLongPressDelay")(selectLongPressDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectMinDistance)) __obj.updateDynamic("selectMinDistance")(selectMinDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectMirror)) __obj.updateDynamic("selectMirror")(selectMirror.get.asInstanceOf[js.Any])
    if (selectOverlap != null) __obj.updateDynamic("selectOverlap")(selectOverlap.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showNonCurrentDates)) __obj.updateDynamic("showNonCurrentDates")(showNonCurrentDates.get.asInstanceOf[js.Any])
    if (slotDuration != null) __obj.updateDynamic("slotDuration")(slotDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(slotEventOverlap)) __obj.updateDynamic("slotEventOverlap")(slotEventOverlap.get.asInstanceOf[js.Any])
    if (slotLabelFormat != null) __obj.updateDynamic("slotLabelFormat")(slotLabelFormat.asInstanceOf[js.Any])
    if (slotLabelInterval != null) __obj.updateDynamic("slotLabelInterval")(slotLabelInterval.asInstanceOf[js.Any])
    if (slotWidth != null) __obj.updateDynamic("slotWidth")(slotWidth.asInstanceOf[js.Any])
    if (snapDuration != null) __obj.updateDynamic("snapDuration")(snapDuration.asInstanceOf[js.Any])
    if (startParam != null) __obj.updateDynamic("startParam")(startParam.asInstanceOf[js.Any])
    if (themeSystem != null) __obj.updateDynamic("themeSystem")(themeSystem.asInstanceOf[js.Any])
    if (!js.isUndefined(timeGridEventMinHeight)) __obj.updateDynamic("timeGridEventMinHeight")(timeGridEventMinHeight.get.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (timeZoneParam != null) __obj.updateDynamic("timeZoneParam")(timeZoneParam.asInstanceOf[js.Any])
    if (titleFormat != null) __obj.updateDynamic("titleFormat")(titleFormat.asInstanceOf[js.Any])
    if (titleRangeSeparator != null) __obj.updateDynamic("titleRangeSeparator")(titleRangeSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectAuto)) __obj.updateDynamic("unselectAuto")(unselectAuto.get.asInstanceOf[js.Any])
    if (unselectCancel != null) __obj.updateDynamic("unselectCancel")(unselectCancel.asInstanceOf[js.Any])
    if (validRange != null) __obj.updateDynamic("validRange")(validRange.asInstanceOf[js.Any])
    if (viewSkeletonDestroy != null) __obj.updateDynamic("viewSkeletonDestroy")(viewSkeletonDestroy.asInstanceOf[js.Any])
    if (viewSkeletonRender != null) __obj.updateDynamic("viewSkeletonRender")(viewSkeletonRender.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    if (visibleRange != null) __obj.updateDynamic("visibleRange")(visibleRange.asInstanceOf[js.Any])
    if (weekLabel != null) __obj.updateDynamic("weekLabel")(weekLabel.asInstanceOf[js.Any])
    if (weekNumberCalculation != null) __obj.updateDynamic("weekNumberCalculation")(weekNumberCalculation.asInstanceOf[js.Any])
    if (!js.isUndefined(weekNumbers)) __obj.updateDynamic("weekNumbers")(weekNumbers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weekNumbersWithinDays)) __obj.updateDynamic("weekNumbersWithinDays")(weekNumbersWithinDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weekends)) __obj.updateDynamic("weekends")(weekends.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowResizeDelay)) __obj.updateDynamic("windowResizeDelay")(windowResizeDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps]
  }
}

