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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarProps extends js.Object {
  
  var allDayDefault: js.UndefOr[Boolean] = js.native
  
  var allDayHtml: js.UndefOr[String] = js.native
  
  var allDayMaintainDuration: js.UndefOr[Boolean] = js.native
  
  var allDaySlot: js.UndefOr[Boolean] = js.native
  
  var allDayText: js.UndefOr[String] = js.native
  
  var aspectRatio: js.UndefOr[Double] = js.native
  
  var bootstrapFontAwesome: js.UndefOr[BootstrapFontAwesome | Boolean] = js.native
  
  var businessHours: js.UndefOr[js.Any] = js.native
  
  var buttonIcons: js.UndefOr[ButtonIcons | Boolean] = js.native
  
  // compound OptionsInput...
  var buttonText: js.UndefOr[js.Any] = js.native
  
  var cmdFormatter: js.UndefOr[String] = js.native
  
  var columnHeader: js.UndefOr[Boolean] = js.native
  
  var columnHeaderFormat: js.UndefOr[FormatterInput] = js.native
  
  var columnHeaderHtml: js.UndefOr[String | (js.Function1[/* date */ DateInput, String])] = js.native
  
  var columnHeaderText: js.UndefOr[String | (js.Function1[/* date */ DateInput, String])] = js.native
  
  var contentHeight: js.UndefOr[Double | auto | js.Function0[Double]] = js.native
  
  var customButtons: js.UndefOr[CustomButtons] = js.native
  
  var dateAlignment: js.UndefOr[String] = js.native
  
  var dateIncrement: js.UndefOr[DurationInput] = js.native
  
  var datesAboveResources: js.UndefOr[js.Any] = js.native
  
  var datesDestroy: js.UndefOr[js.Any] = js.native
  
  // used to be emissions but are now props...
  var datesRender: js.UndefOr[js.Any] = js.native
  
  var dayCount: js.UndefOr[Double] = js.native
  
  var dayPopoverFormat: js.UndefOr[FormatterInput] = js.native
  
  var dayRender: js.UndefOr[js.Any] = js.native
  
  var defaultAllDayEventDuration: js.UndefOr[DurationInput] = js.native
  
  var defaultDate: js.UndefOr[DateInput] = js.native
  
  var defaultRangeSeparator: js.UndefOr[String] = js.native
  
  var defaultTimedEventDuration: js.UndefOr[DurationInput] = js.native
  
  var defaultView: js.UndefOr[String] = js.native
  
  var dir: js.UndefOr[direction] = js.native
  
  var displayEventEnd: js.UndefOr[Boolean] = js.native
  
  var displayEventTime: js.UndefOr[Boolean] = js.native
  
  var dragRevertDuration: js.UndefOr[Double] = js.native
  
  var dragScroll: js.UndefOr[Boolean] = js.native
  
  var dropAccept: js.UndefOr[String | (js.Function1[/* draggable */ js.Any, Boolean])] = js.native
  
  var droppable: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[DurationInput] = js.native
  
  var editable: js.UndefOr[Boolean] = js.native
  
  var endParam: js.UndefOr[String] = js.native
  
  var eventAllow: js.UndefOr[AllowFunc] = js.native
  
  var eventBackgroundColor: js.UndefOr[String] = js.native
  
  var eventBorderColor: js.UndefOr[String] = js.native
  
  var eventClassName: js.UndefOr[js.Array[String] | String] = js.native
  
  var eventClassNames: js.UndefOr[js.Array[String] | String] = js.native
  
  var eventColor: js.UndefOr[String] = js.native
  
  var eventConstraint: js.UndefOr[js.Any] = js.native
  
  var eventDataTransform: js.UndefOr[js.Any] = js.native
  
  var eventDestroy: js.UndefOr[js.Any] = js.native
  
  var eventDragMinDistance: js.UndefOr[Double] = js.native
  
  var eventDurationEditable: js.UndefOr[Boolean] = js.native
  
  var eventLimit: js.UndefOr[Boolean | Double] = js.native
  
  var eventLimitClick: js.UndefOr[
    popover | week | day | timeGridWeek | timeGridDay | String | (js.Function1[/* arg */ AllDay, Unit])
  ] = js.native
  
  var eventLimitText: js.UndefOr[String | (js.Function1[/* eventCnt */ Double, String])] = js.native
  
  var eventLongPressDelay: js.UndefOr[Double] = js.native
  
  var eventOrder: js.UndefOr[String | (js.Array[(js.Function2[/* a */ _, /* b */ _, Double]) | String])] = js.native
  
  var eventOverlap: js.UndefOr[Boolean | OverlapFunc] = js.native
  
  var eventRender: js.UndefOr[js.Any] = js.native
  
  var eventResizableFromStart: js.UndefOr[Boolean] = js.native
  
  var eventSourceFailure: js.UndefOr[js.Any] = js.native
  
  var eventSourceSuccess: js.UndefOr[js.Any] = js.native
  
  var eventSources: js.UndefOr[js.Array[_]] = js.native
  
  var eventStartEditable: js.UndefOr[Boolean] = js.native
  
  var eventTextColor: js.UndefOr[String] = js.native
  
  var eventTimeFormat: js.UndefOr[FormatterInput] = js.native
  
  var events: js.UndefOr[js.Any] = js.native
  
  var filterResourcesWithEvents: js.UndefOr[js.Any] = js.native
  
  var firstDay: js.UndefOr[Double] = js.native
  
  var fixedWeekCount: js.UndefOr[Boolean] = js.native
  
  var footer: js.UndefOr[ToolbarInput | Boolean] = js.native
  
  var forceEventDuration: js.UndefOr[Boolean] = js.native
  
  var googleCalendarApiKey: js.UndefOr[js.Any] = js.native
  
  var handleWindowResize: js.UndefOr[Boolean] = js.native
  
  var header: js.UndefOr[ToolbarInput | Boolean] = js.native
  
  var height: js.UndefOr[Double | auto | parent | js.Function0[Double]] = js.native
  
  var hiddenDays: js.UndefOr[js.Array[Double]] = js.native
  
  var lazyFetching: js.UndefOr[Boolean] = js.native
  
  var listDayAltFormat: js.UndefOr[FormatterInput | Boolean] = js.native
  
  var listDayFormat: js.UndefOr[FormatterInput | Boolean] = js.native
  
  var locale: js.UndefOr[LocaleSingularArg] = js.native
  
  var locales: js.UndefOr[js.Array[RawLocale]] = js.native
  
  var longPressDelay: js.UndefOr[Double] = js.native
  
  var maxTime: js.UndefOr[DurationInput] = js.native
  
  var minTime: js.UndefOr[DurationInput] = js.native
  
  var navLinkDayClick: js.UndefOr[String | (js.Function2[/* date */ Date, /* jsEvent */ Event, Unit])] = js.native
  
  var navLinkWeekClick: js.UndefOr[String | (js.Function2[/* weekStart */ js.Any, /* jsEvent */ Event, Unit])] = js.native
  
  var navLinks: js.UndefOr[Boolean] = js.native
  
  var nextDayThreshold: js.UndefOr[DurationInput] = js.native
  
  var noEventsMessage: js.UndefOr[String] = js.native
  
  var now: js.UndefOr[DateInput | js.Function0[DateInput]] = js.native
  
  var nowIndicator: js.UndefOr[Boolean] = js.native
  
  var plugins: js.UndefOr[js.Any] = js.native
  
  var progressiveEventRendering: js.UndefOr[Boolean] = js.native
  
  var refetchResourcesOnNavigate: js.UndefOr[js.Any] = js.native
  
  var rerenderDelay: js.UndefOr[Double | Null] = js.native
  
  var resourceAreaWidth: js.UndefOr[js.Any] = js.native
  
  var resourceColumns: js.UndefOr[js.Any] = js.native
  
  var resourceGroupField: js.UndefOr[js.Any] = js.native
  
  var resourceGroupText: js.UndefOr[js.Any] = js.native
  
  var resourceLabelText: js.UndefOr[js.Any] = js.native
  
  var resourceOrder: js.UndefOr[js.Any] = js.native
  
  var resourceRender: js.UndefOr[js.Any] = js.native
  
  var resourceText: js.UndefOr[js.Any] = js.native
  
  var resources: js.UndefOr[js.Any] = js.native
  
  var resourcesInitiallyExpanded: js.UndefOr[js.Any] = js.native
  
  // scheduler...
  var schedulerLicenseKey: js.UndefOr[js.Any] = js.native
  
  var scrollTime: js.UndefOr[DurationInput] = js.native
  
  var selectAllow: js.UndefOr[AllowFunc] = js.native
  
  var selectConstraint: js.UndefOr[js.Any] = js.native
  
  var selectLongPressDelay: js.UndefOr[Double] = js.native
  
  var selectMinDistance: js.UndefOr[Double] = js.native
  
  var selectMirror: js.UndefOr[Boolean] = js.native
  
  var selectOverlap: js.UndefOr[Boolean | OverlapFunc] = js.native
  
  var selectable: js.UndefOr[Boolean] = js.native
  
  var showNonCurrentDates: js.UndefOr[Boolean] = js.native
  
  var slotDuration: js.UndefOr[DurationInput] = js.native
  
  var slotEventOverlap: js.UndefOr[Boolean] = js.native
  
  var slotLabelFormat: js.UndefOr[FormatterInput] = js.native
  
  var slotLabelInterval: js.UndefOr[DurationInput] = js.native
  
  var slotWidth: js.UndefOr[js.Any] = js.native
  
  var snapDuration: js.UndefOr[DurationInput] = js.native
  
  var startParam: js.UndefOr[String] = js.native
  
  var themeSystem: js.UndefOr[String] = js.native
  
  var timeGridEventMinHeight: js.UndefOr[Double] = js.native
  
  var timeZone: js.UndefOr[String | Boolean] = js.native
  
  var timeZoneParam: js.UndefOr[String] = js.native
  
  var titleFormat: js.UndefOr[FormatterInput] = js.native
  
  var titleRangeSeparator: js.UndefOr[String] = js.native
  
  var unselectAuto: js.UndefOr[Boolean] = js.native
  
  var unselectCancel: js.UndefOr[String] = js.native
  
  var validRange: js.UndefOr[DateRangeInput] = js.native
  
  var viewSkeletonDestroy: js.UndefOr[js.Any] = js.native
  
  var viewSkeletonRender: js.UndefOr[js.Any] = js.native
  
  var views: js.UndefOr[js.Any] = js.native
  
  var visibleRange: js.UndefOr[(js.Function1[/* currentDate */ Date, DateRangeInput]) | DateRangeInput] = js.native
  
  var weekLabel: js.UndefOr[String] = js.native
  
  var weekNumberCalculation: js.UndefOr[local | ISO | (js.Function1[/* m */ Date, Double])] = js.native
  
  var weekNumbers: js.UndefOr[Boolean] = js.native
  
  var weekNumbersWithinDays: js.UndefOr[Boolean] = js.native
  
  var weekends: js.UndefOr[Boolean] = js.native
  
  var windowResizeDelay: js.UndefOr[Double] = js.native
}
object CalendarProps {
  
  @scala.inline
  def apply(): CalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarProps]
  }
  
  @scala.inline
  implicit class CalendarPropsOps[Self <: CalendarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllDayDefault(value: Boolean): Self = this.set("allDayDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllDayDefault: Self = this.set("allDayDefault", js.undefined)
    
    @scala.inline
    def setAllDayHtml(value: String): Self = this.set("allDayHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllDayHtml: Self = this.set("allDayHtml", js.undefined)
    
    @scala.inline
    def setAllDayMaintainDuration(value: Boolean): Self = this.set("allDayMaintainDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllDayMaintainDuration: Self = this.set("allDayMaintainDuration", js.undefined)
    
    @scala.inline
    def setAllDaySlot(value: Boolean): Self = this.set("allDaySlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllDaySlot: Self = this.set("allDaySlot", js.undefined)
    
    @scala.inline
    def setAllDayText(value: String): Self = this.set("allDayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllDayText: Self = this.set("allDayText", js.undefined)
    
    @scala.inline
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    
    @scala.inline
    def setBootstrapFontAwesome(value: BootstrapFontAwesome | Boolean): Self = this.set("bootstrapFontAwesome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrapFontAwesome: Self = this.set("bootstrapFontAwesome", js.undefined)
    
    @scala.inline
    def setBusinessHours(value: js.Any): Self = this.set("businessHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessHours: Self = this.set("businessHours", js.undefined)
    
    @scala.inline
    def setButtonIcons(value: ButtonIcons | Boolean): Self = this.set("buttonIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonIcons: Self = this.set("buttonIcons", js.undefined)
    
    @scala.inline
    def setButtonText(value: js.Any): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    
    @scala.inline
    def setCmdFormatter(value: String): Self = this.set("cmdFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmdFormatter: Self = this.set("cmdFormatter", js.undefined)
    
    @scala.inline
    def setColumnHeader(value: Boolean): Self = this.set("columnHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHeader: Self = this.set("columnHeader", js.undefined)
    
    @scala.inline
    def setColumnHeaderFormatFunction1(value: /* arg */ js.Any => String): Self = this.set("columnHeaderFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnHeaderFormat(value: FormatterInput): Self = this.set("columnHeaderFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHeaderFormat: Self = this.set("columnHeaderFormat", js.undefined)
    
    @scala.inline
    def setColumnHeaderHtmlFunction1(value: /* date */ DateInput => String): Self = this.set("columnHeaderHtml", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnHeaderHtml(value: String | (js.Function1[/* date */ DateInput, String])): Self = this.set("columnHeaderHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHeaderHtml: Self = this.set("columnHeaderHtml", js.undefined)
    
    @scala.inline
    def setColumnHeaderTextFunction1(value: /* date */ DateInput => String): Self = this.set("columnHeaderText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnHeaderText(value: String | (js.Function1[/* date */ DateInput, String])): Self = this.set("columnHeaderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHeaderText: Self = this.set("columnHeaderText", js.undefined)
    
    @scala.inline
    def setContentHeightFunction0(value: () => Double): Self = this.set("contentHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContentHeight(value: Double | auto | js.Function0[Double]): Self = this.set("contentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentHeight: Self = this.set("contentHeight", js.undefined)
    
    @scala.inline
    def setCustomButtons(value: CustomButtons): Self = this.set("customButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomButtons: Self = this.set("customButtons", js.undefined)
    
    @scala.inline
    def setDateAlignment(value: String): Self = this.set("dateAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateAlignment: Self = this.set("dateAlignment", js.undefined)
    
    @scala.inline
    def setDateIncrement(value: DurationInput): Self = this.set("dateIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateIncrement: Self = this.set("dateIncrement", js.undefined)
    
    @scala.inline
    def setDatesAboveResources(value: js.Any): Self = this.set("datesAboveResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatesAboveResources: Self = this.set("datesAboveResources", js.undefined)
    
    @scala.inline
    def setDatesDestroy(value: js.Any): Self = this.set("datesDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatesDestroy: Self = this.set("datesDestroy", js.undefined)
    
    @scala.inline
    def setDatesRender(value: js.Any): Self = this.set("datesRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatesRender: Self = this.set("datesRender", js.undefined)
    
    @scala.inline
    def setDayCount(value: Double): Self = this.set("dayCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayCount: Self = this.set("dayCount", js.undefined)
    
    @scala.inline
    def setDayPopoverFormatFunction1(value: /* arg */ js.Any => String): Self = this.set("dayPopoverFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDayPopoverFormat(value: FormatterInput): Self = this.set("dayPopoverFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayPopoverFormat: Self = this.set("dayPopoverFormat", js.undefined)
    
    @scala.inline
    def setDayRender(value: js.Any): Self = this.set("dayRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayRender: Self = this.set("dayRender", js.undefined)
    
    @scala.inline
    def setDefaultAllDayEventDuration(value: DurationInput): Self = this.set("defaultAllDayEventDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultAllDayEventDuration: Self = this.set("defaultAllDayEventDuration", js.undefined)
    
    @scala.inline
    def setDefaultDateVarargs(value: Double*): Self = this.set("defaultDate", js.Array(value :_*))
    
    @scala.inline
    def setDefaultDate(value: DateInput): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    
    @scala.inline
    def setDefaultRangeSeparator(value: String): Self = this.set("defaultRangeSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRangeSeparator: Self = this.set("defaultRangeSeparator", js.undefined)
    
    @scala.inline
    def setDefaultTimedEventDuration(value: DurationInput): Self = this.set("defaultTimedEventDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTimedEventDuration: Self = this.set("defaultTimedEventDuration", js.undefined)
    
    @scala.inline
    def setDefaultView(value: String): Self = this.set("defaultView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultView: Self = this.set("defaultView", js.undefined)
    
    @scala.inline
    def setDir(value: direction): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setDisplayEventEnd(value: Boolean): Self = this.set("displayEventEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayEventEnd: Self = this.set("displayEventEnd", js.undefined)
    
    @scala.inline
    def setDisplayEventTime(value: Boolean): Self = this.set("displayEventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayEventTime: Self = this.set("displayEventTime", js.undefined)
    
    @scala.inline
    def setDragRevertDuration(value: Double): Self = this.set("dragRevertDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragRevertDuration: Self = this.set("dragRevertDuration", js.undefined)
    
    @scala.inline
    def setDragScroll(value: Boolean): Self = this.set("dragScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragScroll: Self = this.set("dragScroll", js.undefined)
    
    @scala.inline
    def setDropAcceptFunction1(value: /* draggable */ js.Any => Boolean): Self = this.set("dropAccept", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropAccept(value: String | (js.Function1[/* draggable */ js.Any, Boolean])): Self = this.set("dropAccept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropAccept: Self = this.set("dropAccept", js.undefined)
    
    @scala.inline
    def setDroppable(value: Boolean): Self = this.set("droppable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDroppable: Self = this.set("droppable", js.undefined)
    
    @scala.inline
    def setDuration(value: DurationInput): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setEndParam(value: String): Self = this.set("endParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndParam: Self = this.set("endParam", js.undefined)
    
    @scala.inline
    def setEventAllow(value: (/* span */ js.Any, /* movingEvent */ js.Any) => Boolean): Self = this.set("eventAllow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEventAllow: Self = this.set("eventAllow", js.undefined)
    
    @scala.inline
    def setEventBackgroundColor(value: String): Self = this.set("eventBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventBackgroundColor: Self = this.set("eventBackgroundColor", js.undefined)
    
    @scala.inline
    def setEventBorderColor(value: String): Self = this.set("eventBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventBorderColor: Self = this.set("eventBorderColor", js.undefined)
    
    @scala.inline
    def setEventClassNameVarargs(value: String*): Self = this.set("eventClassName", js.Array(value :_*))
    
    @scala.inline
    def setEventClassName(value: js.Array[String] | String): Self = this.set("eventClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventClassName: Self = this.set("eventClassName", js.undefined)
    
    @scala.inline
    def setEventClassNamesVarargs(value: String*): Self = this.set("eventClassNames", js.Array(value :_*))
    
    @scala.inline
    def setEventClassNames(value: js.Array[String] | String): Self = this.set("eventClassNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventClassNames: Self = this.set("eventClassNames", js.undefined)
    
    @scala.inline
    def setEventColor(value: String): Self = this.set("eventColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventColor: Self = this.set("eventColor", js.undefined)
    
    @scala.inline
    def setEventConstraint(value: js.Any): Self = this.set("eventConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventConstraint: Self = this.set("eventConstraint", js.undefined)
    
    @scala.inline
    def setEventDataTransform(value: js.Any): Self = this.set("eventDataTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventDataTransform: Self = this.set("eventDataTransform", js.undefined)
    
    @scala.inline
    def setEventDestroy(value: js.Any): Self = this.set("eventDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventDestroy: Self = this.set("eventDestroy", js.undefined)
    
    @scala.inline
    def setEventDragMinDistance(value: Double): Self = this.set("eventDragMinDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventDragMinDistance: Self = this.set("eventDragMinDistance", js.undefined)
    
    @scala.inline
    def setEventDurationEditable(value: Boolean): Self = this.set("eventDurationEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventDurationEditable: Self = this.set("eventDurationEditable", js.undefined)
    
    @scala.inline
    def setEventLimit(value: Boolean | Double): Self = this.set("eventLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventLimit: Self = this.set("eventLimit", js.undefined)
    
    @scala.inline
    def setEventLimitClickFunction1(value: /* arg */ AllDay => Unit): Self = this.set("eventLimitClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEventLimitClick(
      value: popover | week | day | timeGridWeek | timeGridDay | String | (js.Function1[/* arg */ AllDay, Unit])
    ): Self = this.set("eventLimitClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventLimitClick: Self = this.set("eventLimitClick", js.undefined)
    
    @scala.inline
    def setEventLimitTextFunction1(value: /* eventCnt */ Double => String): Self = this.set("eventLimitText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEventLimitText(value: String | (js.Function1[/* eventCnt */ Double, String])): Self = this.set("eventLimitText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventLimitText: Self = this.set("eventLimitText", js.undefined)
    
    @scala.inline
    def setEventLongPressDelay(value: Double): Self = this.set("eventLongPressDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventLongPressDelay: Self = this.set("eventLongPressDelay", js.undefined)
    
    @scala.inline
    def setEventOrderVarargs(value: ((js.Function2[js.Any, js.Any, Double]) | String)*): Self = this.set("eventOrder", js.Array(value :_*))
    
    @scala.inline
    def setEventOrder(value: String | (js.Array[(js.Function2[/* a */ _, /* b */ _, Double]) | String])): Self = this.set("eventOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventOrder: Self = this.set("eventOrder", js.undefined)
    
    @scala.inline
    def setEventOverlapFunction2(value: (/* stillEvent */ js.Any, /* movingEvent */ js.Any) => Boolean): Self = this.set("eventOverlap", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEventOverlap(value: Boolean | OverlapFunc): Self = this.set("eventOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventOverlap: Self = this.set("eventOverlap", js.undefined)
    
    @scala.inline
    def setEventRender(value: js.Any): Self = this.set("eventRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventRender: Self = this.set("eventRender", js.undefined)
    
    @scala.inline
    def setEventResizableFromStart(value: Boolean): Self = this.set("eventResizableFromStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventResizableFromStart: Self = this.set("eventResizableFromStart", js.undefined)
    
    @scala.inline
    def setEventSourceFailure(value: js.Any): Self = this.set("eventSourceFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSourceFailure: Self = this.set("eventSourceFailure", js.undefined)
    
    @scala.inline
    def setEventSourceSuccess(value: js.Any): Self = this.set("eventSourceSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSourceSuccess: Self = this.set("eventSourceSuccess", js.undefined)
    
    @scala.inline
    def setEventSourcesVarargs(value: js.Any*): Self = this.set("eventSources", js.Array(value :_*))
    
    @scala.inline
    def setEventSources(value: js.Array[_]): Self = this.set("eventSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSources: Self = this.set("eventSources", js.undefined)
    
    @scala.inline
    def setEventStartEditable(value: Boolean): Self = this.set("eventStartEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventStartEditable: Self = this.set("eventStartEditable", js.undefined)
    
    @scala.inline
    def setEventTextColor(value: String): Self = this.set("eventTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTextColor: Self = this.set("eventTextColor", js.undefined)
    
    @scala.inline
    def setEventTimeFormatFunction1(value: /* arg */ js.Any => String): Self = this.set("eventTimeFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEventTimeFormat(value: FormatterInput): Self = this.set("eventTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTimeFormat: Self = this.set("eventTimeFormat", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Any): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setFilterResourcesWithEvents(value: js.Any): Self = this.set("filterResourcesWithEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterResourcesWithEvents: Self = this.set("filterResourcesWithEvents", js.undefined)
    
    @scala.inline
    def setFirstDay(value: Double): Self = this.set("firstDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDay: Self = this.set("firstDay", js.undefined)
    
    @scala.inline
    def setFixedWeekCount(value: Boolean): Self = this.set("fixedWeekCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedWeekCount: Self = this.set("fixedWeekCount", js.undefined)
    
    @scala.inline
    def setFooter(value: ToolbarInput | Boolean): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setForceEventDuration(value: Boolean): Self = this.set("forceEventDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceEventDuration: Self = this.set("forceEventDuration", js.undefined)
    
    @scala.inline
    def setGoogleCalendarApiKey(value: js.Any): Self = this.set("googleCalendarApiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleCalendarApiKey: Self = this.set("googleCalendarApiKey", js.undefined)
    
    @scala.inline
    def setHandleWindowResize(value: Boolean): Self = this.set("handleWindowResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleWindowResize: Self = this.set("handleWindowResize", js.undefined)
    
    @scala.inline
    def setHeader(value: ToolbarInput | Boolean): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeightFunction0(value: () => Double): Self = this.set("height", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeight(value: Double | auto | parent | js.Function0[Double]): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHiddenDaysVarargs(value: Double*): Self = this.set("hiddenDays", js.Array(value :_*))
    
    @scala.inline
    def setHiddenDays(value: js.Array[Double]): Self = this.set("hiddenDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenDays: Self = this.set("hiddenDays", js.undefined)
    
    @scala.inline
    def setLazyFetching(value: Boolean): Self = this.set("lazyFetching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazyFetching: Self = this.set("lazyFetching", js.undefined)
    
    @scala.inline
    def setListDayAltFormatFunction1(value: /* arg */ js.Any => String): Self = this.set("listDayAltFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListDayAltFormat(value: FormatterInput | Boolean): Self = this.set("listDayAltFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListDayAltFormat: Self = this.set("listDayAltFormat", js.undefined)
    
    @scala.inline
    def setListDayFormatFunction1(value: /* arg */ js.Any => String): Self = this.set("listDayFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListDayFormat(value: FormatterInput | Boolean): Self = this.set("listDayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListDayFormat: Self = this.set("listDayFormat", js.undefined)
    
    @scala.inline
    def setLocaleVarargs(value: String*): Self = this.set("locale", js.Array(value :_*))
    
    @scala.inline
    def setLocale(value: LocaleSingularArg): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocalesVarargs(value: RawLocale*): Self = this.set("locales", js.Array(value :_*))
    
    @scala.inline
    def setLocales(value: js.Array[RawLocale]): Self = this.set("locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
    
    @scala.inline
    def setLongPressDelay(value: Double): Self = this.set("longPressDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongPressDelay: Self = this.set("longPressDelay", js.undefined)
    
    @scala.inline
    def setMaxTime(value: DurationInput): Self = this.set("maxTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTime: Self = this.set("maxTime", js.undefined)
    
    @scala.inline
    def setMinTime(value: DurationInput): Self = this.set("minTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTime: Self = this.set("minTime", js.undefined)
    
    @scala.inline
    def setNavLinkDayClickFunction2(value: (/* date */ Date, /* jsEvent */ Event) => Unit): Self = this.set("navLinkDayClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNavLinkDayClick(value: String | (js.Function2[/* date */ Date, /* jsEvent */ Event, Unit])): Self = this.set("navLinkDayClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavLinkDayClick: Self = this.set("navLinkDayClick", js.undefined)
    
    @scala.inline
    def setNavLinkWeekClickFunction2(value: (/* weekStart */ js.Any, /* jsEvent */ Event) => Unit): Self = this.set("navLinkWeekClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNavLinkWeekClick(value: String | (js.Function2[/* weekStart */ js.Any, /* jsEvent */ Event, Unit])): Self = this.set("navLinkWeekClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavLinkWeekClick: Self = this.set("navLinkWeekClick", js.undefined)
    
    @scala.inline
    def setNavLinks(value: Boolean): Self = this.set("navLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavLinks: Self = this.set("navLinks", js.undefined)
    
    @scala.inline
    def setNextDayThreshold(value: DurationInput): Self = this.set("nextDayThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextDayThreshold: Self = this.set("nextDayThreshold", js.undefined)
    
    @scala.inline
    def setNoEventsMessage(value: String): Self = this.set("noEventsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoEventsMessage: Self = this.set("noEventsMessage", js.undefined)
    
    @scala.inline
    def setNowVarargs(value: Double*): Self = this.set("now", js.Array(value :_*))
    
    @scala.inline
    def setNowFunction0(value: () => DateInput): Self = this.set("now", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNow(value: DateInput | js.Function0[DateInput]): Self = this.set("now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNow: Self = this.set("now", js.undefined)
    
    @scala.inline
    def setNowIndicator(value: Boolean): Self = this.set("nowIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNowIndicator: Self = this.set("nowIndicator", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Any): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setProgressiveEventRendering(value: Boolean): Self = this.set("progressiveEventRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressiveEventRendering: Self = this.set("progressiveEventRendering", js.undefined)
    
    @scala.inline
    def setRefetchResourcesOnNavigate(value: js.Any): Self = this.set("refetchResourcesOnNavigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefetchResourcesOnNavigate: Self = this.set("refetchResourcesOnNavigate", js.undefined)
    
    @scala.inline
    def setRerenderDelay(value: Double): Self = this.set("rerenderDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRerenderDelay: Self = this.set("rerenderDelay", js.undefined)
    
    @scala.inline
    def setRerenderDelayNull: Self = this.set("rerenderDelay", null)
    
    @scala.inline
    def setResourceAreaWidth(value: js.Any): Self = this.set("resourceAreaWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAreaWidth: Self = this.set("resourceAreaWidth", js.undefined)
    
    @scala.inline
    def setResourceColumns(value: js.Any): Self = this.set("resourceColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceColumns: Self = this.set("resourceColumns", js.undefined)
    
    @scala.inline
    def setResourceGroupField(value: js.Any): Self = this.set("resourceGroupField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceGroupField: Self = this.set("resourceGroupField", js.undefined)
    
    @scala.inline
    def setResourceGroupText(value: js.Any): Self = this.set("resourceGroupText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceGroupText: Self = this.set("resourceGroupText", js.undefined)
    
    @scala.inline
    def setResourceLabelText(value: js.Any): Self = this.set("resourceLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceLabelText: Self = this.set("resourceLabelText", js.undefined)
    
    @scala.inline
    def setResourceOrder(value: js.Any): Self = this.set("resourceOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceOrder: Self = this.set("resourceOrder", js.undefined)
    
    @scala.inline
    def setResourceRender(value: js.Any): Self = this.set("resourceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceRender: Self = this.set("resourceRender", js.undefined)
    
    @scala.inline
    def setResourceText(value: js.Any): Self = this.set("resourceText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceText: Self = this.set("resourceText", js.undefined)
    
    @scala.inline
    def setResources(value: js.Any): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setResourcesInitiallyExpanded(value: js.Any): Self = this.set("resourcesInitiallyExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcesInitiallyExpanded: Self = this.set("resourcesInitiallyExpanded", js.undefined)
    
    @scala.inline
    def setSchedulerLicenseKey(value: js.Any): Self = this.set("schedulerLicenseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedulerLicenseKey: Self = this.set("schedulerLicenseKey", js.undefined)
    
    @scala.inline
    def setScrollTime(value: DurationInput): Self = this.set("scrollTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollTime: Self = this.set("scrollTime", js.undefined)
    
    @scala.inline
    def setSelectAllow(value: (/* span */ js.Any, /* movingEvent */ js.Any) => Boolean): Self = this.set("selectAllow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSelectAllow: Self = this.set("selectAllow", js.undefined)
    
    @scala.inline
    def setSelectConstraint(value: js.Any): Self = this.set("selectConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectConstraint: Self = this.set("selectConstraint", js.undefined)
    
    @scala.inline
    def setSelectLongPressDelay(value: Double): Self = this.set("selectLongPressDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectLongPressDelay: Self = this.set("selectLongPressDelay", js.undefined)
    
    @scala.inline
    def setSelectMinDistance(value: Double): Self = this.set("selectMinDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectMinDistance: Self = this.set("selectMinDistance", js.undefined)
    
    @scala.inline
    def setSelectMirror(value: Boolean): Self = this.set("selectMirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectMirror: Self = this.set("selectMirror", js.undefined)
    
    @scala.inline
    def setSelectOverlapFunction2(value: (/* stillEvent */ js.Any, /* movingEvent */ js.Any) => Boolean): Self = this.set("selectOverlap", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectOverlap(value: Boolean | OverlapFunc): Self = this.set("selectOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectOverlap: Self = this.set("selectOverlap", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setShowNonCurrentDates(value: Boolean): Self = this.set("showNonCurrentDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNonCurrentDates: Self = this.set("showNonCurrentDates", js.undefined)
    
    @scala.inline
    def setSlotDuration(value: DurationInput): Self = this.set("slotDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotDuration: Self = this.set("slotDuration", js.undefined)
    
    @scala.inline
    def setSlotEventOverlap(value: Boolean): Self = this.set("slotEventOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotEventOverlap: Self = this.set("slotEventOverlap", js.undefined)
    
    @scala.inline
    def setSlotLabelFormatFunction1(value: /* arg */ js.Any => String): Self = this.set("slotLabelFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSlotLabelFormat(value: FormatterInput): Self = this.set("slotLabelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotLabelFormat: Self = this.set("slotLabelFormat", js.undefined)
    
    @scala.inline
    def setSlotLabelInterval(value: DurationInput): Self = this.set("slotLabelInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotLabelInterval: Self = this.set("slotLabelInterval", js.undefined)
    
    @scala.inline
    def setSlotWidth(value: js.Any): Self = this.set("slotWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotWidth: Self = this.set("slotWidth", js.undefined)
    
    @scala.inline
    def setSnapDuration(value: DurationInput): Self = this.set("snapDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapDuration: Self = this.set("snapDuration", js.undefined)
    
    @scala.inline
    def setStartParam(value: String): Self = this.set("startParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartParam: Self = this.set("startParam", js.undefined)
    
    @scala.inline
    def setThemeSystem(value: String): Self = this.set("themeSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeSystem: Self = this.set("themeSystem", js.undefined)
    
    @scala.inline
    def setTimeGridEventMinHeight(value: Double): Self = this.set("timeGridEventMinHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeGridEventMinHeight: Self = this.set("timeGridEventMinHeight", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String | Boolean): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setTimeZoneParam(value: String): Self = this.set("timeZoneParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZoneParam: Self = this.set("timeZoneParam", js.undefined)
    
    @scala.inline
    def setTitleFormatFunction1(value: /* arg */ js.Any => String): Self = this.set("titleFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleFormat(value: FormatterInput): Self = this.set("titleFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFormat: Self = this.set("titleFormat", js.undefined)
    
    @scala.inline
    def setTitleRangeSeparator(value: String): Self = this.set("titleRangeSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleRangeSeparator: Self = this.set("titleRangeSeparator", js.undefined)
    
    @scala.inline
    def setUnselectAuto(value: Boolean): Self = this.set("unselectAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnselectAuto: Self = this.set("unselectAuto", js.undefined)
    
    @scala.inline
    def setUnselectCancel(value: String): Self = this.set("unselectCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnselectCancel: Self = this.set("unselectCancel", js.undefined)
    
    @scala.inline
    def setValidRange(value: DateRangeInput): Self = this.set("validRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidRange: Self = this.set("validRange", js.undefined)
    
    @scala.inline
    def setViewSkeletonDestroy(value: js.Any): Self = this.set("viewSkeletonDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewSkeletonDestroy: Self = this.set("viewSkeletonDestroy", js.undefined)
    
    @scala.inline
    def setViewSkeletonRender(value: js.Any): Self = this.set("viewSkeletonRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewSkeletonRender: Self = this.set("viewSkeletonRender", js.undefined)
    
    @scala.inline
    def setViews(value: js.Any): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
    
    @scala.inline
    def setVisibleRangeFunction1(value: /* currentDate */ Date => DateRangeInput): Self = this.set("visibleRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisibleRange(value: (js.Function1[/* currentDate */ Date, DateRangeInput]) | DateRangeInput): Self = this.set("visibleRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleRange: Self = this.set("visibleRange", js.undefined)
    
    @scala.inline
    def setWeekLabel(value: String): Self = this.set("weekLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekLabel: Self = this.set("weekLabel", js.undefined)
    
    @scala.inline
    def setWeekNumberCalculationFunction1(value: /* m */ Date => Double): Self = this.set("weekNumberCalculation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWeekNumberCalculation(value: local | ISO | (js.Function1[/* m */ Date, Double])): Self = this.set("weekNumberCalculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekNumberCalculation: Self = this.set("weekNumberCalculation", js.undefined)
    
    @scala.inline
    def setWeekNumbers(value: Boolean): Self = this.set("weekNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekNumbers: Self = this.set("weekNumbers", js.undefined)
    
    @scala.inline
    def setWeekNumbersWithinDays(value: Boolean): Self = this.set("weekNumbersWithinDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekNumbersWithinDays: Self = this.set("weekNumbersWithinDays", js.undefined)
    
    @scala.inline
    def setWeekends(value: Boolean): Self = this.set("weekends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekends: Self = this.set("weekends", js.undefined)
    
    @scala.inline
    def setWindowResizeDelay(value: Double): Self = this.set("windowResizeDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowResizeDelay: Self = this.set("windowResizeDelay", js.undefined)
  }
}
