package typings.fullcalendarVue

import org.scalablytyped.runtime.StringDictionary
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  type AllowFunc = js.Function2[/* span */ js.Any, /* movingEvent */ js.Any, Boolean]
  
  trait BootstrapFontAwesome extends StObject {
    
    var close: js.UndefOr[String] = js.undefined
    
    var next: js.UndefOr[String] = js.undefined
    
    var nextYear: js.UndefOr[String] = js.undefined
    
    var prev: js.UndefOr[String] = js.undefined
    
    var prevYear: js.UndefOr[String] = js.undefined
  }
  object BootstrapFontAwesome {
    
    inline def apply(): BootstrapFontAwesome = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BootstrapFontAwesome]
    }
    
    extension [Self <: BootstrapFontAwesome](x: Self) {
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setNextYear(value: String): Self = StObject.set(x, "nextYear", value.asInstanceOf[js.Any])
      
      inline def setNextYearUndefined: Self = StObject.set(x, "nextYear", js.undefined)
      
      inline def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      inline def setPrevYear(value: String): Self = StObject.set(x, "prevYear", value.asInstanceOf[js.Any])
      
      inline def setPrevYearUndefined: Self = StObject.set(x, "prevYear", js.undefined)
    }
  }
  
  trait ButtonIcons extends StObject {
    
    var next: js.UndefOr[String] = js.undefined
    
    var nextYear: js.UndefOr[String] = js.undefined
    
    var prev: js.UndefOr[String] = js.undefined
    
    var prevYear: js.UndefOr[String] = js.undefined
  }
  object ButtonIcons {
    
    inline def apply(): ButtonIcons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonIcons]
    }
    
    extension [Self <: ButtonIcons](x: Self) {
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setNextYear(value: String): Self = StObject.set(x, "nextYear", value.asInstanceOf[js.Any])
      
      inline def setNextYearUndefined: Self = StObject.set(x, "nextYear", js.undefined)
      
      inline def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      inline def setPrevYear(value: String): Self = StObject.set(x, "prevYear", value.asInstanceOf[js.Any])
      
      inline def setPrevYearUndefined: Self = StObject.set(x, "prevYear", js.undefined)
    }
  }
  
  trait CalendarProps extends StObject {
    
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
    
    var eventOrder: js.UndefOr[
        String | (js.Array[(js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) | String])
      ] = js.undefined
    
    var eventOverlap: js.UndefOr[Boolean | OverlapFunc] = js.undefined
    
    var eventRender: js.UndefOr[js.Any] = js.undefined
    
    var eventResizableFromStart: js.UndefOr[Boolean] = js.undefined
    
    var eventSourceFailure: js.UndefOr[js.Any] = js.undefined
    
    var eventSourceSuccess: js.UndefOr[js.Any] = js.undefined
    
    var eventSources: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    
    inline def apply(): CalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarProps]
    }
    
    extension [Self <: CalendarProps](x: Self) {
      
      inline def setAllDayDefault(value: Boolean): Self = StObject.set(x, "allDayDefault", value.asInstanceOf[js.Any])
      
      inline def setAllDayDefaultUndefined: Self = StObject.set(x, "allDayDefault", js.undefined)
      
      inline def setAllDayHtml(value: String): Self = StObject.set(x, "allDayHtml", value.asInstanceOf[js.Any])
      
      inline def setAllDayHtmlUndefined: Self = StObject.set(x, "allDayHtml", js.undefined)
      
      inline def setAllDayMaintainDuration(value: Boolean): Self = StObject.set(x, "allDayMaintainDuration", value.asInstanceOf[js.Any])
      
      inline def setAllDayMaintainDurationUndefined: Self = StObject.set(x, "allDayMaintainDuration", js.undefined)
      
      inline def setAllDaySlot(value: Boolean): Self = StObject.set(x, "allDaySlot", value.asInstanceOf[js.Any])
      
      inline def setAllDaySlotUndefined: Self = StObject.set(x, "allDaySlot", js.undefined)
      
      inline def setAllDayText(value: String): Self = StObject.set(x, "allDayText", value.asInstanceOf[js.Any])
      
      inline def setAllDayTextUndefined: Self = StObject.set(x, "allDayText", js.undefined)
      
      inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setBootstrapFontAwesome(value: BootstrapFontAwesome | Boolean): Self = StObject.set(x, "bootstrapFontAwesome", value.asInstanceOf[js.Any])
      
      inline def setBootstrapFontAwesomeUndefined: Self = StObject.set(x, "bootstrapFontAwesome", js.undefined)
      
      inline def setBusinessHours(value: js.Any): Self = StObject.set(x, "businessHours", value.asInstanceOf[js.Any])
      
      inline def setBusinessHoursUndefined: Self = StObject.set(x, "businessHours", js.undefined)
      
      inline def setButtonIcons(value: ButtonIcons | Boolean): Self = StObject.set(x, "buttonIcons", value.asInstanceOf[js.Any])
      
      inline def setButtonIconsUndefined: Self = StObject.set(x, "buttonIcons", js.undefined)
      
      inline def setButtonText(value: js.Any): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setCmdFormatter(value: String): Self = StObject.set(x, "cmdFormatter", value.asInstanceOf[js.Any])
      
      inline def setCmdFormatterUndefined: Self = StObject.set(x, "cmdFormatter", js.undefined)
      
      inline def setColumnHeader(value: Boolean): Self = StObject.set(x, "columnHeader", value.asInstanceOf[js.Any])
      
      inline def setColumnHeaderFormat(value: FormatterInput): Self = StObject.set(x, "columnHeaderFormat", value.asInstanceOf[js.Any])
      
      inline def setColumnHeaderFormatFunction1(value: /* arg */ js.Any => String): Self = StObject.set(x, "columnHeaderFormat", js.Any.fromFunction1(value))
      
      inline def setColumnHeaderFormatUndefined: Self = StObject.set(x, "columnHeaderFormat", js.undefined)
      
      inline def setColumnHeaderHtml(value: String | (js.Function1[/* date */ DateInput, String])): Self = StObject.set(x, "columnHeaderHtml", value.asInstanceOf[js.Any])
      
      inline def setColumnHeaderHtmlFunction1(value: /* date */ DateInput => String): Self = StObject.set(x, "columnHeaderHtml", js.Any.fromFunction1(value))
      
      inline def setColumnHeaderHtmlUndefined: Self = StObject.set(x, "columnHeaderHtml", js.undefined)
      
      inline def setColumnHeaderText(value: String | (js.Function1[/* date */ DateInput, String])): Self = StObject.set(x, "columnHeaderText", value.asInstanceOf[js.Any])
      
      inline def setColumnHeaderTextFunction1(value: /* date */ DateInput => String): Self = StObject.set(x, "columnHeaderText", js.Any.fromFunction1(value))
      
      inline def setColumnHeaderTextUndefined: Self = StObject.set(x, "columnHeaderText", js.undefined)
      
      inline def setColumnHeaderUndefined: Self = StObject.set(x, "columnHeader", js.undefined)
      
      inline def setContentHeight(value: Double | auto | js.Function0[Double]): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
      
      inline def setContentHeightFunction0(value: () => Double): Self = StObject.set(x, "contentHeight", js.Any.fromFunction0(value))
      
      inline def setContentHeightUndefined: Self = StObject.set(x, "contentHeight", js.undefined)
      
      inline def setCustomButtons(value: CustomButtons): Self = StObject.set(x, "customButtons", value.asInstanceOf[js.Any])
      
      inline def setCustomButtonsUndefined: Self = StObject.set(x, "customButtons", js.undefined)
      
      inline def setDateAlignment(value: String): Self = StObject.set(x, "dateAlignment", value.asInstanceOf[js.Any])
      
      inline def setDateAlignmentUndefined: Self = StObject.set(x, "dateAlignment", js.undefined)
      
      inline def setDateIncrement(value: DurationInput): Self = StObject.set(x, "dateIncrement", value.asInstanceOf[js.Any])
      
      inline def setDateIncrementUndefined: Self = StObject.set(x, "dateIncrement", js.undefined)
      
      inline def setDatesAboveResources(value: js.Any): Self = StObject.set(x, "datesAboveResources", value.asInstanceOf[js.Any])
      
      inline def setDatesAboveResourcesUndefined: Self = StObject.set(x, "datesAboveResources", js.undefined)
      
      inline def setDatesDestroy(value: js.Any): Self = StObject.set(x, "datesDestroy", value.asInstanceOf[js.Any])
      
      inline def setDatesDestroyUndefined: Self = StObject.set(x, "datesDestroy", js.undefined)
      
      inline def setDatesRender(value: js.Any): Self = StObject.set(x, "datesRender", value.asInstanceOf[js.Any])
      
      inline def setDatesRenderUndefined: Self = StObject.set(x, "datesRender", js.undefined)
      
      inline def setDayCount(value: Double): Self = StObject.set(x, "dayCount", value.asInstanceOf[js.Any])
      
      inline def setDayCountUndefined: Self = StObject.set(x, "dayCount", js.undefined)
      
      inline def setDayPopoverFormat(value: FormatterInput): Self = StObject.set(x, "dayPopoverFormat", value.asInstanceOf[js.Any])
      
      inline def setDayPopoverFormatFunction1(value: /* arg */ js.Any => String): Self = StObject.set(x, "dayPopoverFormat", js.Any.fromFunction1(value))
      
      inline def setDayPopoverFormatUndefined: Self = StObject.set(x, "dayPopoverFormat", js.undefined)
      
      inline def setDayRender(value: js.Any): Self = StObject.set(x, "dayRender", value.asInstanceOf[js.Any])
      
      inline def setDayRenderUndefined: Self = StObject.set(x, "dayRender", js.undefined)
      
      inline def setDefaultAllDayEventDuration(value: DurationInput): Self = StObject.set(x, "defaultAllDayEventDuration", value.asInstanceOf[js.Any])
      
      inline def setDefaultAllDayEventDurationUndefined: Self = StObject.set(x, "defaultAllDayEventDuration", js.undefined)
      
      inline def setDefaultDate(value: DateInput): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      inline def setDefaultDateVarargs(value: Double*): Self = StObject.set(x, "defaultDate", js.Array(value :_*))
      
      inline def setDefaultRangeSeparator(value: String): Self = StObject.set(x, "defaultRangeSeparator", value.asInstanceOf[js.Any])
      
      inline def setDefaultRangeSeparatorUndefined: Self = StObject.set(x, "defaultRangeSeparator", js.undefined)
      
      inline def setDefaultTimedEventDuration(value: DurationInput): Self = StObject.set(x, "defaultTimedEventDuration", value.asInstanceOf[js.Any])
      
      inline def setDefaultTimedEventDurationUndefined: Self = StObject.set(x, "defaultTimedEventDuration", js.undefined)
      
      inline def setDefaultView(value: String): Self = StObject.set(x, "defaultView", value.asInstanceOf[js.Any])
      
      inline def setDefaultViewUndefined: Self = StObject.set(x, "defaultView", js.undefined)
      
      inline def setDir(value: direction): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisplayEventEnd(value: Boolean): Self = StObject.set(x, "displayEventEnd", value.asInstanceOf[js.Any])
      
      inline def setDisplayEventEndUndefined: Self = StObject.set(x, "displayEventEnd", js.undefined)
      
      inline def setDisplayEventTime(value: Boolean): Self = StObject.set(x, "displayEventTime", value.asInstanceOf[js.Any])
      
      inline def setDisplayEventTimeUndefined: Self = StObject.set(x, "displayEventTime", js.undefined)
      
      inline def setDragRevertDuration(value: Double): Self = StObject.set(x, "dragRevertDuration", value.asInstanceOf[js.Any])
      
      inline def setDragRevertDurationUndefined: Self = StObject.set(x, "dragRevertDuration", js.undefined)
      
      inline def setDragScroll(value: Boolean): Self = StObject.set(x, "dragScroll", value.asInstanceOf[js.Any])
      
      inline def setDragScrollUndefined: Self = StObject.set(x, "dragScroll", js.undefined)
      
      inline def setDropAccept(value: String | (js.Function1[/* draggable */ js.Any, Boolean])): Self = StObject.set(x, "dropAccept", value.asInstanceOf[js.Any])
      
      inline def setDropAcceptFunction1(value: /* draggable */ js.Any => Boolean): Self = StObject.set(x, "dropAccept", js.Any.fromFunction1(value))
      
      inline def setDropAcceptUndefined: Self = StObject.set(x, "dropAccept", js.undefined)
      
      inline def setDroppable(value: Boolean): Self = StObject.set(x, "droppable", value.asInstanceOf[js.Any])
      
      inline def setDroppableUndefined: Self = StObject.set(x, "droppable", js.undefined)
      
      inline def setDuration(value: DurationInput): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEndParam(value: String): Self = StObject.set(x, "endParam", value.asInstanceOf[js.Any])
      
      inline def setEndParamUndefined: Self = StObject.set(x, "endParam", js.undefined)
      
      inline def setEventAllow(value: (/* span */ js.Any, /* movingEvent */ js.Any) => Boolean): Self = StObject.set(x, "eventAllow", js.Any.fromFunction2(value))
      
      inline def setEventAllowUndefined: Self = StObject.set(x, "eventAllow", js.undefined)
      
      inline def setEventBackgroundColor(value: String): Self = StObject.set(x, "eventBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setEventBackgroundColorUndefined: Self = StObject.set(x, "eventBackgroundColor", js.undefined)
      
      inline def setEventBorderColor(value: String): Self = StObject.set(x, "eventBorderColor", value.asInstanceOf[js.Any])
      
      inline def setEventBorderColorUndefined: Self = StObject.set(x, "eventBorderColor", js.undefined)
      
      inline def setEventClassName(value: js.Array[String] | String): Self = StObject.set(x, "eventClassName", value.asInstanceOf[js.Any])
      
      inline def setEventClassNameUndefined: Self = StObject.set(x, "eventClassName", js.undefined)
      
      inline def setEventClassNameVarargs(value: String*): Self = StObject.set(x, "eventClassName", js.Array(value :_*))
      
      inline def setEventClassNames(value: js.Array[String] | String): Self = StObject.set(x, "eventClassNames", value.asInstanceOf[js.Any])
      
      inline def setEventClassNamesUndefined: Self = StObject.set(x, "eventClassNames", js.undefined)
      
      inline def setEventClassNamesVarargs(value: String*): Self = StObject.set(x, "eventClassNames", js.Array(value :_*))
      
      inline def setEventColor(value: String): Self = StObject.set(x, "eventColor", value.asInstanceOf[js.Any])
      
      inline def setEventColorUndefined: Self = StObject.set(x, "eventColor", js.undefined)
      
      inline def setEventConstraint(value: js.Any): Self = StObject.set(x, "eventConstraint", value.asInstanceOf[js.Any])
      
      inline def setEventConstraintUndefined: Self = StObject.set(x, "eventConstraint", js.undefined)
      
      inline def setEventDataTransform(value: js.Any): Self = StObject.set(x, "eventDataTransform", value.asInstanceOf[js.Any])
      
      inline def setEventDataTransformUndefined: Self = StObject.set(x, "eventDataTransform", js.undefined)
      
      inline def setEventDestroy(value: js.Any): Self = StObject.set(x, "eventDestroy", value.asInstanceOf[js.Any])
      
      inline def setEventDestroyUndefined: Self = StObject.set(x, "eventDestroy", js.undefined)
      
      inline def setEventDragMinDistance(value: Double): Self = StObject.set(x, "eventDragMinDistance", value.asInstanceOf[js.Any])
      
      inline def setEventDragMinDistanceUndefined: Self = StObject.set(x, "eventDragMinDistance", js.undefined)
      
      inline def setEventDurationEditable(value: Boolean): Self = StObject.set(x, "eventDurationEditable", value.asInstanceOf[js.Any])
      
      inline def setEventDurationEditableUndefined: Self = StObject.set(x, "eventDurationEditable", js.undefined)
      
      inline def setEventLimit(value: Boolean | Double): Self = StObject.set(x, "eventLimit", value.asInstanceOf[js.Any])
      
      inline def setEventLimitClick(
        value: popover | week | day | timeGridWeek | timeGridDay | String | (js.Function1[/* arg */ AllDay, Unit])
      ): Self = StObject.set(x, "eventLimitClick", value.asInstanceOf[js.Any])
      
      inline def setEventLimitClickFunction1(value: /* arg */ AllDay => Unit): Self = StObject.set(x, "eventLimitClick", js.Any.fromFunction1(value))
      
      inline def setEventLimitClickUndefined: Self = StObject.set(x, "eventLimitClick", js.undefined)
      
      inline def setEventLimitText(value: String | (js.Function1[/* eventCnt */ Double, String])): Self = StObject.set(x, "eventLimitText", value.asInstanceOf[js.Any])
      
      inline def setEventLimitTextFunction1(value: /* eventCnt */ Double => String): Self = StObject.set(x, "eventLimitText", js.Any.fromFunction1(value))
      
      inline def setEventLimitTextUndefined: Self = StObject.set(x, "eventLimitText", js.undefined)
      
      inline def setEventLimitUndefined: Self = StObject.set(x, "eventLimit", js.undefined)
      
      inline def setEventLongPressDelay(value: Double): Self = StObject.set(x, "eventLongPressDelay", value.asInstanceOf[js.Any])
      
      inline def setEventLongPressDelayUndefined: Self = StObject.set(x, "eventLongPressDelay", js.undefined)
      
      inline def setEventOrder(value: String | (js.Array[(js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) | String])): Self = StObject.set(x, "eventOrder", value.asInstanceOf[js.Any])
      
      inline def setEventOrderUndefined: Self = StObject.set(x, "eventOrder", js.undefined)
      
      inline def setEventOrderVarargs(value: ((js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) | String)*): Self = StObject.set(x, "eventOrder", js.Array(value :_*))
      
      inline def setEventOverlap(value: Boolean | OverlapFunc): Self = StObject.set(x, "eventOverlap", value.asInstanceOf[js.Any])
      
      inline def setEventOverlapFunction2(value: (/* stillEvent */ js.Any, /* movingEvent */ js.Any) => Boolean): Self = StObject.set(x, "eventOverlap", js.Any.fromFunction2(value))
      
      inline def setEventOverlapUndefined: Self = StObject.set(x, "eventOverlap", js.undefined)
      
      inline def setEventRender(value: js.Any): Self = StObject.set(x, "eventRender", value.asInstanceOf[js.Any])
      
      inline def setEventRenderUndefined: Self = StObject.set(x, "eventRender", js.undefined)
      
      inline def setEventResizableFromStart(value: Boolean): Self = StObject.set(x, "eventResizableFromStart", value.asInstanceOf[js.Any])
      
      inline def setEventResizableFromStartUndefined: Self = StObject.set(x, "eventResizableFromStart", js.undefined)
      
      inline def setEventSourceFailure(value: js.Any): Self = StObject.set(x, "eventSourceFailure", value.asInstanceOf[js.Any])
      
      inline def setEventSourceFailureUndefined: Self = StObject.set(x, "eventSourceFailure", js.undefined)
      
      inline def setEventSourceSuccess(value: js.Any): Self = StObject.set(x, "eventSourceSuccess", value.asInstanceOf[js.Any])
      
      inline def setEventSourceSuccessUndefined: Self = StObject.set(x, "eventSourceSuccess", js.undefined)
      
      inline def setEventSources(value: js.Array[js.Any]): Self = StObject.set(x, "eventSources", value.asInstanceOf[js.Any])
      
      inline def setEventSourcesUndefined: Self = StObject.set(x, "eventSources", js.undefined)
      
      inline def setEventSourcesVarargs(value: js.Any*): Self = StObject.set(x, "eventSources", js.Array(value :_*))
      
      inline def setEventStartEditable(value: Boolean): Self = StObject.set(x, "eventStartEditable", value.asInstanceOf[js.Any])
      
      inline def setEventStartEditableUndefined: Self = StObject.set(x, "eventStartEditable", js.undefined)
      
      inline def setEventTextColor(value: String): Self = StObject.set(x, "eventTextColor", value.asInstanceOf[js.Any])
      
      inline def setEventTextColorUndefined: Self = StObject.set(x, "eventTextColor", js.undefined)
      
      inline def setEventTimeFormat(value: FormatterInput): Self = StObject.set(x, "eventTimeFormat", value.asInstanceOf[js.Any])
      
      inline def setEventTimeFormatFunction1(value: /* arg */ js.Any => String): Self = StObject.set(x, "eventTimeFormat", js.Any.fromFunction1(value))
      
      inline def setEventTimeFormatUndefined: Self = StObject.set(x, "eventTimeFormat", js.undefined)
      
      inline def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setFilterResourcesWithEvents(value: js.Any): Self = StObject.set(x, "filterResourcesWithEvents", value.asInstanceOf[js.Any])
      
      inline def setFilterResourcesWithEventsUndefined: Self = StObject.set(x, "filterResourcesWithEvents", js.undefined)
      
      inline def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
      
      inline def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
      
      inline def setFixedWeekCount(value: Boolean): Self = StObject.set(x, "fixedWeekCount", value.asInstanceOf[js.Any])
      
      inline def setFixedWeekCountUndefined: Self = StObject.set(x, "fixedWeekCount", js.undefined)
      
      inline def setFooter(value: ToolbarInput | Boolean): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setForceEventDuration(value: Boolean): Self = StObject.set(x, "forceEventDuration", value.asInstanceOf[js.Any])
      
      inline def setForceEventDurationUndefined: Self = StObject.set(x, "forceEventDuration", js.undefined)
      
      inline def setGoogleCalendarApiKey(value: js.Any): Self = StObject.set(x, "googleCalendarApiKey", value.asInstanceOf[js.Any])
      
      inline def setGoogleCalendarApiKeyUndefined: Self = StObject.set(x, "googleCalendarApiKey", js.undefined)
      
      inline def setHandleWindowResize(value: Boolean): Self = StObject.set(x, "handleWindowResize", value.asInstanceOf[js.Any])
      
      inline def setHandleWindowResizeUndefined: Self = StObject.set(x, "handleWindowResize", js.undefined)
      
      inline def setHeader(value: ToolbarInput | Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeight(value: Double | auto | parent | js.Function0[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightFunction0(value: () => Double): Self = StObject.set(x, "height", js.Any.fromFunction0(value))
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHiddenDays(value: js.Array[Double]): Self = StObject.set(x, "hiddenDays", value.asInstanceOf[js.Any])
      
      inline def setHiddenDaysUndefined: Self = StObject.set(x, "hiddenDays", js.undefined)
      
      inline def setHiddenDaysVarargs(value: Double*): Self = StObject.set(x, "hiddenDays", js.Array(value :_*))
      
      inline def setLazyFetching(value: Boolean): Self = StObject.set(x, "lazyFetching", value.asInstanceOf[js.Any])
      
      inline def setLazyFetchingUndefined: Self = StObject.set(x, "lazyFetching", js.undefined)
      
      inline def setListDayAltFormat(value: FormatterInput | Boolean): Self = StObject.set(x, "listDayAltFormat", value.asInstanceOf[js.Any])
      
      inline def setListDayAltFormatFunction1(value: /* arg */ js.Any => String): Self = StObject.set(x, "listDayAltFormat", js.Any.fromFunction1(value))
      
      inline def setListDayAltFormatUndefined: Self = StObject.set(x, "listDayAltFormat", js.undefined)
      
      inline def setListDayFormat(value: FormatterInput | Boolean): Self = StObject.set(x, "listDayFormat", value.asInstanceOf[js.Any])
      
      inline def setListDayFormatFunction1(value: /* arg */ js.Any => String): Self = StObject.set(x, "listDayFormat", js.Any.fromFunction1(value))
      
      inline def setListDayFormatUndefined: Self = StObject.set(x, "listDayFormat", js.undefined)
      
      inline def setLocale(value: LocaleSingularArg): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocaleVarargs(value: String*): Self = StObject.set(x, "locale", js.Array(value :_*))
      
      inline def setLocales(value: js.Array[RawLocale]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: RawLocale*): Self = StObject.set(x, "locales", js.Array(value :_*))
      
      inline def setLongPressDelay(value: Double): Self = StObject.set(x, "longPressDelay", value.asInstanceOf[js.Any])
      
      inline def setLongPressDelayUndefined: Self = StObject.set(x, "longPressDelay", js.undefined)
      
      inline def setMaxTime(value: DurationInput): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinTime(value: DurationInput): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setNavLinkDayClick(value: String | (js.Function2[/* date */ Date, /* jsEvent */ Event, Unit])): Self = StObject.set(x, "navLinkDayClick", value.asInstanceOf[js.Any])
      
      inline def setNavLinkDayClickFunction2(value: (/* date */ Date, /* jsEvent */ Event) => Unit): Self = StObject.set(x, "navLinkDayClick", js.Any.fromFunction2(value))
      
      inline def setNavLinkDayClickUndefined: Self = StObject.set(x, "navLinkDayClick", js.undefined)
      
      inline def setNavLinkWeekClick(value: String | (js.Function2[/* weekStart */ js.Any, /* jsEvent */ Event, Unit])): Self = StObject.set(x, "navLinkWeekClick", value.asInstanceOf[js.Any])
      
      inline def setNavLinkWeekClickFunction2(value: (/* weekStart */ js.Any, /* jsEvent */ Event) => Unit): Self = StObject.set(x, "navLinkWeekClick", js.Any.fromFunction2(value))
      
      inline def setNavLinkWeekClickUndefined: Self = StObject.set(x, "navLinkWeekClick", js.undefined)
      
      inline def setNavLinks(value: Boolean): Self = StObject.set(x, "navLinks", value.asInstanceOf[js.Any])
      
      inline def setNavLinksUndefined: Self = StObject.set(x, "navLinks", js.undefined)
      
      inline def setNextDayThreshold(value: DurationInput): Self = StObject.set(x, "nextDayThreshold", value.asInstanceOf[js.Any])
      
      inline def setNextDayThresholdUndefined: Self = StObject.set(x, "nextDayThreshold", js.undefined)
      
      inline def setNoEventsMessage(value: String): Self = StObject.set(x, "noEventsMessage", value.asInstanceOf[js.Any])
      
      inline def setNoEventsMessageUndefined: Self = StObject.set(x, "noEventsMessage", js.undefined)
      
      inline def setNow(value: DateInput | js.Function0[DateInput]): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowFunction0(value: () => DateInput): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
      
      inline def setNowIndicator(value: Boolean): Self = StObject.set(x, "nowIndicator", value.asInstanceOf[js.Any])
      
      inline def setNowIndicatorUndefined: Self = StObject.set(x, "nowIndicator", js.undefined)
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setNowVarargs(value: Double*): Self = StObject.set(x, "now", js.Array(value :_*))
      
      inline def setPlugins(value: js.Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setProgressiveEventRendering(value: Boolean): Self = StObject.set(x, "progressiveEventRendering", value.asInstanceOf[js.Any])
      
      inline def setProgressiveEventRenderingUndefined: Self = StObject.set(x, "progressiveEventRendering", js.undefined)
      
      inline def setRefetchResourcesOnNavigate(value: js.Any): Self = StObject.set(x, "refetchResourcesOnNavigate", value.asInstanceOf[js.Any])
      
      inline def setRefetchResourcesOnNavigateUndefined: Self = StObject.set(x, "refetchResourcesOnNavigate", js.undefined)
      
      inline def setRerenderDelay(value: Double): Self = StObject.set(x, "rerenderDelay", value.asInstanceOf[js.Any])
      
      inline def setRerenderDelayNull: Self = StObject.set(x, "rerenderDelay", null)
      
      inline def setRerenderDelayUndefined: Self = StObject.set(x, "rerenderDelay", js.undefined)
      
      inline def setResourceAreaWidth(value: js.Any): Self = StObject.set(x, "resourceAreaWidth", value.asInstanceOf[js.Any])
      
      inline def setResourceAreaWidthUndefined: Self = StObject.set(x, "resourceAreaWidth", js.undefined)
      
      inline def setResourceColumns(value: js.Any): Self = StObject.set(x, "resourceColumns", value.asInstanceOf[js.Any])
      
      inline def setResourceColumnsUndefined: Self = StObject.set(x, "resourceColumns", js.undefined)
      
      inline def setResourceGroupField(value: js.Any): Self = StObject.set(x, "resourceGroupField", value.asInstanceOf[js.Any])
      
      inline def setResourceGroupFieldUndefined: Self = StObject.set(x, "resourceGroupField", js.undefined)
      
      inline def setResourceGroupText(value: js.Any): Self = StObject.set(x, "resourceGroupText", value.asInstanceOf[js.Any])
      
      inline def setResourceGroupTextUndefined: Self = StObject.set(x, "resourceGroupText", js.undefined)
      
      inline def setResourceLabelText(value: js.Any): Self = StObject.set(x, "resourceLabelText", value.asInstanceOf[js.Any])
      
      inline def setResourceLabelTextUndefined: Self = StObject.set(x, "resourceLabelText", js.undefined)
      
      inline def setResourceOrder(value: js.Any): Self = StObject.set(x, "resourceOrder", value.asInstanceOf[js.Any])
      
      inline def setResourceOrderUndefined: Self = StObject.set(x, "resourceOrder", js.undefined)
      
      inline def setResourceRender(value: js.Any): Self = StObject.set(x, "resourceRender", value.asInstanceOf[js.Any])
      
      inline def setResourceRenderUndefined: Self = StObject.set(x, "resourceRender", js.undefined)
      
      inline def setResourceText(value: js.Any): Self = StObject.set(x, "resourceText", value.asInstanceOf[js.Any])
      
      inline def setResourceTextUndefined: Self = StObject.set(x, "resourceText", js.undefined)
      
      inline def setResources(value: js.Any): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesInitiallyExpanded(value: js.Any): Self = StObject.set(x, "resourcesInitiallyExpanded", value.asInstanceOf[js.Any])
      
      inline def setResourcesInitiallyExpandedUndefined: Self = StObject.set(x, "resourcesInitiallyExpanded", js.undefined)
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setSchedulerLicenseKey(value: js.Any): Self = StObject.set(x, "schedulerLicenseKey", value.asInstanceOf[js.Any])
      
      inline def setSchedulerLicenseKeyUndefined: Self = StObject.set(x, "schedulerLicenseKey", js.undefined)
      
      inline def setScrollTime(value: DurationInput): Self = StObject.set(x, "scrollTime", value.asInstanceOf[js.Any])
      
      inline def setScrollTimeUndefined: Self = StObject.set(x, "scrollTime", js.undefined)
      
      inline def setSelectAllow(value: (/* span */ js.Any, /* movingEvent */ js.Any) => Boolean): Self = StObject.set(x, "selectAllow", js.Any.fromFunction2(value))
      
      inline def setSelectAllowUndefined: Self = StObject.set(x, "selectAllow", js.undefined)
      
      inline def setSelectConstraint(value: js.Any): Self = StObject.set(x, "selectConstraint", value.asInstanceOf[js.Any])
      
      inline def setSelectConstraintUndefined: Self = StObject.set(x, "selectConstraint", js.undefined)
      
      inline def setSelectLongPressDelay(value: Double): Self = StObject.set(x, "selectLongPressDelay", value.asInstanceOf[js.Any])
      
      inline def setSelectLongPressDelayUndefined: Self = StObject.set(x, "selectLongPressDelay", js.undefined)
      
      inline def setSelectMinDistance(value: Double): Self = StObject.set(x, "selectMinDistance", value.asInstanceOf[js.Any])
      
      inline def setSelectMinDistanceUndefined: Self = StObject.set(x, "selectMinDistance", js.undefined)
      
      inline def setSelectMirror(value: Boolean): Self = StObject.set(x, "selectMirror", value.asInstanceOf[js.Any])
      
      inline def setSelectMirrorUndefined: Self = StObject.set(x, "selectMirror", js.undefined)
      
      inline def setSelectOverlap(value: Boolean | OverlapFunc): Self = StObject.set(x, "selectOverlap", value.asInstanceOf[js.Any])
      
      inline def setSelectOverlapFunction2(value: (/* stillEvent */ js.Any, /* movingEvent */ js.Any) => Boolean): Self = StObject.set(x, "selectOverlap", js.Any.fromFunction2(value))
      
      inline def setSelectOverlapUndefined: Self = StObject.set(x, "selectOverlap", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setShowNonCurrentDates(value: Boolean): Self = StObject.set(x, "showNonCurrentDates", value.asInstanceOf[js.Any])
      
      inline def setShowNonCurrentDatesUndefined: Self = StObject.set(x, "showNonCurrentDates", js.undefined)
      
      inline def setSlotDuration(value: DurationInput): Self = StObject.set(x, "slotDuration", value.asInstanceOf[js.Any])
      
      inline def setSlotDurationUndefined: Self = StObject.set(x, "slotDuration", js.undefined)
      
      inline def setSlotEventOverlap(value: Boolean): Self = StObject.set(x, "slotEventOverlap", value.asInstanceOf[js.Any])
      
      inline def setSlotEventOverlapUndefined: Self = StObject.set(x, "slotEventOverlap", js.undefined)
      
      inline def setSlotLabelFormat(value: FormatterInput): Self = StObject.set(x, "slotLabelFormat", value.asInstanceOf[js.Any])
      
      inline def setSlotLabelFormatFunction1(value: /* arg */ js.Any => String): Self = StObject.set(x, "slotLabelFormat", js.Any.fromFunction1(value))
      
      inline def setSlotLabelFormatUndefined: Self = StObject.set(x, "slotLabelFormat", js.undefined)
      
      inline def setSlotLabelInterval(value: DurationInput): Self = StObject.set(x, "slotLabelInterval", value.asInstanceOf[js.Any])
      
      inline def setSlotLabelIntervalUndefined: Self = StObject.set(x, "slotLabelInterval", js.undefined)
      
      inline def setSlotWidth(value: js.Any): Self = StObject.set(x, "slotWidth", value.asInstanceOf[js.Any])
      
      inline def setSlotWidthUndefined: Self = StObject.set(x, "slotWidth", js.undefined)
      
      inline def setSnapDuration(value: DurationInput): Self = StObject.set(x, "snapDuration", value.asInstanceOf[js.Any])
      
      inline def setSnapDurationUndefined: Self = StObject.set(x, "snapDuration", js.undefined)
      
      inline def setStartParam(value: String): Self = StObject.set(x, "startParam", value.asInstanceOf[js.Any])
      
      inline def setStartParamUndefined: Self = StObject.set(x, "startParam", js.undefined)
      
      inline def setThemeSystem(value: String): Self = StObject.set(x, "themeSystem", value.asInstanceOf[js.Any])
      
      inline def setThemeSystemUndefined: Self = StObject.set(x, "themeSystem", js.undefined)
      
      inline def setTimeGridEventMinHeight(value: Double): Self = StObject.set(x, "timeGridEventMinHeight", value.asInstanceOf[js.Any])
      
      inline def setTimeGridEventMinHeightUndefined: Self = StObject.set(x, "timeGridEventMinHeight", js.undefined)
      
      inline def setTimeZone(value: String | Boolean): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneParam(value: String): Self = StObject.set(x, "timeZoneParam", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneParamUndefined: Self = StObject.set(x, "timeZoneParam", js.undefined)
      
      inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      
      inline def setTitleFormat(value: FormatterInput): Self = StObject.set(x, "titleFormat", value.asInstanceOf[js.Any])
      
      inline def setTitleFormatFunction1(value: /* arg */ js.Any => String): Self = StObject.set(x, "titleFormat", js.Any.fromFunction1(value))
      
      inline def setTitleFormatUndefined: Self = StObject.set(x, "titleFormat", js.undefined)
      
      inline def setTitleRangeSeparator(value: String): Self = StObject.set(x, "titleRangeSeparator", value.asInstanceOf[js.Any])
      
      inline def setTitleRangeSeparatorUndefined: Self = StObject.set(x, "titleRangeSeparator", js.undefined)
      
      inline def setUnselectAuto(value: Boolean): Self = StObject.set(x, "unselectAuto", value.asInstanceOf[js.Any])
      
      inline def setUnselectAutoUndefined: Self = StObject.set(x, "unselectAuto", js.undefined)
      
      inline def setUnselectCancel(value: String): Self = StObject.set(x, "unselectCancel", value.asInstanceOf[js.Any])
      
      inline def setUnselectCancelUndefined: Self = StObject.set(x, "unselectCancel", js.undefined)
      
      inline def setValidRange(value: DateRangeInput): Self = StObject.set(x, "validRange", value.asInstanceOf[js.Any])
      
      inline def setValidRangeUndefined: Self = StObject.set(x, "validRange", js.undefined)
      
      inline def setViewSkeletonDestroy(value: js.Any): Self = StObject.set(x, "viewSkeletonDestroy", value.asInstanceOf[js.Any])
      
      inline def setViewSkeletonDestroyUndefined: Self = StObject.set(x, "viewSkeletonDestroy", js.undefined)
      
      inline def setViewSkeletonRender(value: js.Any): Self = StObject.set(x, "viewSkeletonRender", value.asInstanceOf[js.Any])
      
      inline def setViewSkeletonRenderUndefined: Self = StObject.set(x, "viewSkeletonRender", js.undefined)
      
      inline def setViews(value: js.Any): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
      
      inline def setVisibleRange(value: (js.Function1[/* currentDate */ Date, DateRangeInput]) | DateRangeInput): Self = StObject.set(x, "visibleRange", value.asInstanceOf[js.Any])
      
      inline def setVisibleRangeFunction1(value: /* currentDate */ Date => DateRangeInput): Self = StObject.set(x, "visibleRange", js.Any.fromFunction1(value))
      
      inline def setVisibleRangeUndefined: Self = StObject.set(x, "visibleRange", js.undefined)
      
      inline def setWeekLabel(value: String): Self = StObject.set(x, "weekLabel", value.asInstanceOf[js.Any])
      
      inline def setWeekLabelUndefined: Self = StObject.set(x, "weekLabel", js.undefined)
      
      inline def setWeekNumberCalculation(value: local | ISO | (js.Function1[/* m */ Date, Double])): Self = StObject.set(x, "weekNumberCalculation", value.asInstanceOf[js.Any])
      
      inline def setWeekNumberCalculationFunction1(value: /* m */ Date => Double): Self = StObject.set(x, "weekNumberCalculation", js.Any.fromFunction1(value))
      
      inline def setWeekNumberCalculationUndefined: Self = StObject.set(x, "weekNumberCalculation", js.undefined)
      
      inline def setWeekNumbers(value: Boolean): Self = StObject.set(x, "weekNumbers", value.asInstanceOf[js.Any])
      
      inline def setWeekNumbersUndefined: Self = StObject.set(x, "weekNumbers", js.undefined)
      
      inline def setWeekNumbersWithinDays(value: Boolean): Self = StObject.set(x, "weekNumbersWithinDays", value.asInstanceOf[js.Any])
      
      inline def setWeekNumbersWithinDaysUndefined: Self = StObject.set(x, "weekNumbersWithinDays", js.undefined)
      
      inline def setWeekends(value: Boolean): Self = StObject.set(x, "weekends", value.asInstanceOf[js.Any])
      
      inline def setWeekendsUndefined: Self = StObject.set(x, "weekends", js.undefined)
      
      inline def setWindowResizeDelay(value: Double): Self = StObject.set(x, "windowResizeDelay", value.asInstanceOf[js.Any])
      
      inline def setWindowResizeDelayUndefined: Self = StObject.set(x, "windowResizeDelay", js.undefined)
    }
  }
  
  trait CustomButton extends StObject {
    
    var bootstrapFontAwesome: js.UndefOr[js.Any] = js.undefined
    
    var click: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var icon: js.UndefOr[js.Any] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object CustomButton {
    
    inline def apply(): CustomButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomButton]
    }
    
    extension [Self <: CustomButton](x: Self) {
      
      inline def setBootstrapFontAwesome(value: js.Any): Self = StObject.set(x, "bootstrapFontAwesome", value.asInstanceOf[js.Any])
      
      inline def setBootstrapFontAwesomeUndefined: Self = StObject.set(x, "bootstrapFontAwesome", js.undefined)
      
      inline def setClick(value: () => js.Any): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setIcon(value: js.Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type CustomButtons = StringDictionary[CustomButton]
  
  type DateInput = Date | String | Double | js.Array[Double]
  
  trait DateRangeInput extends StObject {
    
    var end: js.UndefOr[DateInput] = js.undefined
    
    var start: js.UndefOr[DateInput] = js.undefined
  }
  object DateRangeInput {
    
    inline def apply(): DateRangeInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateRangeInput]
    }
    
    extension [Self <: DateRangeInput](x: Self) {
      
      inline def setEnd(value: DateInput): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndVarargs(value: Double*): Self = StObject.set(x, "end", js.Array(value :_*))
      
      inline def setStart(value: DateInput): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStartVarargs(value: Double*): Self = StObject.set(x, "start", js.Array(value :_*))
    }
  }
  
  type DurationInput = DurationObjectInput | String | Double
  
  trait DurationObjectInput extends StObject {
    
    var day: js.UndefOr[Double] = js.undefined
    
    var days: js.UndefOr[Double] = js.undefined
    
    var hour: js.UndefOr[Double] = js.undefined
    
    var hours: js.UndefOr[Double] = js.undefined
    
    var millisecond: js.UndefOr[Double] = js.undefined
    
    var milliseconds: js.UndefOr[Double] = js.undefined
    
    var minute: js.UndefOr[Double] = js.undefined
    
    var minutes: js.UndefOr[Double] = js.undefined
    
    var month: js.UndefOr[Double] = js.undefined
    
    var months: js.UndefOr[Double] = js.undefined
    
    var ms: js.UndefOr[Double] = js.undefined
    
    var second: js.UndefOr[Double] = js.undefined
    
    var seconds: js.UndefOr[Double] = js.undefined
    
    var week: js.UndefOr[Double] = js.undefined
    
    var weeks: js.UndefOr[Double] = js.undefined
    
    var year: js.UndefOr[Double] = js.undefined
    
    var years: js.UndefOr[Double] = js.undefined
  }
  object DurationObjectInput {
    
    inline def apply(): DurationObjectInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DurationObjectInput]
    }
    
    extension [Self <: DurationObjectInput](x: Self) {
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      inline def setMillisecond(value: Double): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
      
      inline def setMillisecondUndefined: Self = StObject.set(x, "millisecond", js.undefined)
      
      inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      inline def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
      
      inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      
      inline def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
      
      inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      
      inline def setWeek(value: Double): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
      
      inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
      
      inline def setWeeks(value: Double): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
      
      inline def setWeeksUndefined: Self = StObject.set(x, "weeks", js.undefined)
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
      
      inline def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
      
      inline def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
    }
  }
  
  type FormatterInput = js.Object | String | FuncFormatterFunc
  
  type FuncFormatterFunc = js.Function1[/* arg */ js.Any, String]
  
  type LocaleCodeArg = String | js.Array[String]
  
  type LocaleSingularArg = LocaleCodeArg | RawLocale
  
  type OverlapFunc = js.Function2[/* stillEvent */ js.Any, /* movingEvent */ js.Any, Boolean]
  
  trait RawLocale
    extends StObject
       with /* otherProp */ StringDictionary[js.Any] {
    
    var code: String
  }
  object RawLocale {
    
    inline def apply(code: String): RawLocale = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawLocale]
    }
    
    extension [Self <: RawLocale](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToolbarInput extends StObject {
    
    var center: String
    
    var left: String
    
    var right: String
  }
  object ToolbarInput {
    
    inline def apply(center: String, left: String, right: String): ToolbarInput = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarInput]
    }
    
    extension [Self <: ToolbarInput](x: Self) {
      
      inline def setCenter(value: String): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fullcalendarVue.fullcalendarVueStrings.ltr
    - typings.fullcalendarVue.fullcalendarVueStrings.rtl
  */
  trait direction extends StObject
  object direction {
    
    inline def ltr: typings.fullcalendarVue.fullcalendarVueStrings.ltr = "ltr".asInstanceOf[typings.fullcalendarVue.fullcalendarVueStrings.ltr]
    
    inline def rtl: typings.fullcalendarVue.fullcalendarVueStrings.rtl = "rtl".asInstanceOf[typings.fullcalendarVue.fullcalendarVueStrings.rtl]
  }
}
