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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  type AllowFunc = js.Function2[/* span */ js.Any, /* movingEvent */ js.Any, Boolean]
  
  @js.native
  trait BootstrapFontAwesome extends StObject {
    
    var close: js.UndefOr[String] = js.native
    
    var next: js.UndefOr[String] = js.native
    
    var nextYear: js.UndefOr[String] = js.native
    
    var prev: js.UndefOr[String] = js.native
    
    var prevYear: js.UndefOr[String] = js.native
  }
  object BootstrapFontAwesome {
    
    @scala.inline
    def apply(): BootstrapFontAwesome = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BootstrapFontAwesome]
    }
    
    @scala.inline
    implicit class BootstrapFontAwesomeMutableBuilder[Self <: BootstrapFontAwesome] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setNextYear(value: String): Self = StObject.set(x, "nextYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextYearUndefined: Self = StObject.set(x, "nextYear", js.undefined)
      
      @scala.inline
      def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      @scala.inline
      def setPrevYear(value: String): Self = StObject.set(x, "prevYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevYearUndefined: Self = StObject.set(x, "prevYear", js.undefined)
    }
  }
  
  @js.native
  trait ButtonIcons extends StObject {
    
    var next: js.UndefOr[String] = js.native
    
    var nextYear: js.UndefOr[String] = js.native
    
    var prev: js.UndefOr[String] = js.native
    
    var prevYear: js.UndefOr[String] = js.native
  }
  object ButtonIcons {
    
    @scala.inline
    def apply(): ButtonIcons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonIcons]
    }
    
    @scala.inline
    implicit class ButtonIconsMutableBuilder[Self <: ButtonIcons] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setNextYear(value: String): Self = StObject.set(x, "nextYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextYearUndefined: Self = StObject.set(x, "nextYear", js.undefined)
      
      @scala.inline
      def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      @scala.inline
      def setPrevYear(value: String): Self = StObject.set(x, "prevYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevYearUndefined: Self = StObject.set(x, "prevYear", js.undefined)
    }
  }
  
  @js.native
  trait CalendarProps extends StObject {
    
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
    implicit class CalendarPropsMutableBuilder[Self <: CalendarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllDayDefault(value: Boolean): Self = StObject.set(x, "allDayDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllDayDefaultUndefined: Self = StObject.set(x, "allDayDefault", js.undefined)
      
      @scala.inline
      def setAllDayHtml(value: String): Self = StObject.set(x, "allDayHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllDayHtmlUndefined: Self = StObject.set(x, "allDayHtml", js.undefined)
      
      @scala.inline
      def setAllDayMaintainDuration(value: Boolean): Self = StObject.set(x, "allDayMaintainDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllDayMaintainDurationUndefined: Self = StObject.set(x, "allDayMaintainDuration", js.undefined)
      
      @scala.inline
      def setAllDaySlot(value: Boolean): Self = StObject.set(x, "allDaySlot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllDaySlotUndefined: Self = StObject.set(x, "allDaySlot", js.undefined)
      
      @scala.inline
      def setAllDayText(value: String): Self = StObject.set(x, "allDayText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllDayTextUndefined: Self = StObject.set(x, "allDayText", js.undefined)
      
      @scala.inline
      def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      @scala.inline
      def setBootstrapFontAwesome(value: BootstrapFontAwesome | Boolean): Self = StObject.set(x, "bootstrapFontAwesome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrapFontAwesomeUndefined: Self = StObject.set(x, "bootstrapFontAwesome", js.undefined)
      
      @scala.inline
      def setBusinessHours(value: js.Any): Self = StObject.set(x, "businessHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusinessHoursUndefined: Self = StObject.set(x, "businessHours", js.undefined)
      
      @scala.inline
      def setButtonIcons(value: ButtonIcons | Boolean): Self = StObject.set(x, "buttonIcons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonIconsUndefined: Self = StObject.set(x, "buttonIcons", js.undefined)
      
      @scala.inline
      def setButtonText(value: js.Any): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      @scala.inline
      def setCmdFormatter(value: String): Self = StObject.set(x, "cmdFormatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCmdFormatterUndefined: Self = StObject.set(x, "cmdFormatter", js.undefined)
      
      @scala.inline
      def setColumnHeader(value: Boolean): Self = StObject.set(x, "columnHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnHeaderFormat(value: FormatterInput): Self = StObject.set(x, "columnHeaderFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnHeaderFormatFunction1(value: /* arg */ js.Any => String): Self = StObject.set(x, "columnHeaderFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnHeaderFormatUndefined: Self = StObject.set(x, "columnHeaderFormat", js.undefined)
      
      @scala.inline
      def setColumnHeaderHtml(value: String | (js.Function1[/* date */ DateInput, String])): Self = StObject.set(x, "columnHeaderHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnHeaderHtmlFunction1(value: /* date */ DateInput => String): Self = StObject.set(x, "columnHeaderHtml", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnHeaderHtmlUndefined: Self = StObject.set(x, "columnHeaderHtml", js.undefined)
      
      @scala.inline
      def setColumnHeaderText(value: String | (js.Function1[/* date */ DateInput, String])): Self = StObject.set(x, "columnHeaderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnHeaderTextFunction1(value: /* date */ DateInput => String): Self = StObject.set(x, "columnHeaderText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnHeaderTextUndefined: Self = StObject.set(x, "columnHeaderText", js.undefined)
      
      @scala.inline
      def setColumnHeaderUndefined: Self = StObject.set(x, "columnHeader", js.undefined)
      
      @scala.inline
      def setContentHeight(value: Double | auto | js.Function0[Double]): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentHeightFunction0(value: () => Double): Self = StObject.set(x, "contentHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContentHeightUndefined: Self = StObject.set(x, "contentHeight", js.undefined)
      
      @scala.inline
      def setCustomButtons(value: CustomButtons): Self = StObject.set(x, "customButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomButtonsUndefined: Self = StObject.set(x, "customButtons", js.undefined)
      
      @scala.inline
      def setDateAlignment(value: String): Self = StObject.set(x, "dateAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateAlignmentUndefined: Self = StObject.set(x, "dateAlignment", js.undefined)
      
      @scala.inline
      def setDateIncrement(value: DurationInput): Self = StObject.set(x, "dateIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateIncrementUndefined: Self = StObject.set(x, "dateIncrement", js.undefined)
      
      @scala.inline
      def setDatesAboveResources(value: js.Any): Self = StObject.set(x, "datesAboveResources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatesAboveResourcesUndefined: Self = StObject.set(x, "datesAboveResources", js.undefined)
      
      @scala.inline
      def setDatesDestroy(value: js.Any): Self = StObject.set(x, "datesDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatesDestroyUndefined: Self = StObject.set(x, "datesDestroy", js.undefined)
      
      @scala.inline
      def setDatesRender(value: js.Any): Self = StObject.set(x, "datesRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatesRenderUndefined: Self = StObject.set(x, "datesRender", js.undefined)
      
      @scala.inline
      def setDayCount(value: Double): Self = StObject.set(x, "dayCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayCountUndefined: Self = StObject.set(x, "dayCount", js.undefined)
      
      @scala.inline
      def setDayPopoverFormat(value: FormatterInput): Self = StObject.set(x, "dayPopoverFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayPopoverFormatFunction1(value: /* arg */ js.Any => String): Self = StObject.set(x, "dayPopoverFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDayPopoverFormatUndefined: Self = StObject.set(x, "dayPopoverFormat", js.undefined)
      
      @scala.inline
      def setDayRender(value: js.Any): Self = StObject.set(x, "dayRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayRenderUndefined: Self = StObject.set(x, "dayRender", js.undefined)
      
      @scala.inline
      def setDefaultAllDayEventDuration(value: DurationInput): Self = StObject.set(x, "defaultAllDayEventDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultAllDayEventDurationUndefined: Self = StObject.set(x, "defaultAllDayEventDuration", js.undefined)
      
      @scala.inline
      def setDefaultDate(value: DateInput): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      @scala.inline
      def setDefaultDateVarargs(value: Double*): Self = StObject.set(x, "defaultDate", js.Array(value :_*))
      
      @scala.inline
      def setDefaultRangeSeparator(value: String): Self = StObject.set(x, "defaultRangeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRangeSeparatorUndefined: Self = StObject.set(x, "defaultRangeSeparator", js.undefined)
      
      @scala.inline
      def setDefaultTimedEventDuration(value: DurationInput): Self = StObject.set(x, "defaultTimedEventDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTimedEventDurationUndefined: Self = StObject.set(x, "defaultTimedEventDuration", js.undefined)
      
      @scala.inline
      def setDefaultView(value: String): Self = StObject.set(x, "defaultView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultViewUndefined: Self = StObject.set(x, "defaultView", js.undefined)
      
      @scala.inline
      def setDir(value: direction): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDisplayEventEnd(value: Boolean): Self = StObject.set(x, "displayEventEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayEventEndUndefined: Self = StObject.set(x, "displayEventEnd", js.undefined)
      
      @scala.inline
      def setDisplayEventTime(value: Boolean): Self = StObject.set(x, "displayEventTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayEventTimeUndefined: Self = StObject.set(x, "displayEventTime", js.undefined)
      
      @scala.inline
      def setDragRevertDuration(value: Double): Self = StObject.set(x, "dragRevertDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragRevertDurationUndefined: Self = StObject.set(x, "dragRevertDuration", js.undefined)
      
      @scala.inline
      def setDragScroll(value: Boolean): Self = StObject.set(x, "dragScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragScrollUndefined: Self = StObject.set(x, "dragScroll", js.undefined)
      
      @scala.inline
      def setDropAccept(value: String | (js.Function1[/* draggable */ js.Any, Boolean])): Self = StObject.set(x, "dropAccept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropAcceptFunction1(value: /* draggable */ js.Any => Boolean): Self = StObject.set(x, "dropAccept", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDropAcceptUndefined: Self = StObject.set(x, "dropAccept", js.undefined)
      
      @scala.inline
      def setDroppable(value: Boolean): Self = StObject.set(x, "droppable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDroppableUndefined: Self = StObject.set(x, "droppable", js.undefined)
      
      @scala.inline
      def setDuration(value: DurationInput): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setEndParam(value: String): Self = StObject.set(x, "endParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndParamUndefined: Self = StObject.set(x, "endParam", js.undefined)
      
      @scala.inline
      def setEventAllow(value: (/* span */ js.Any, /* movingEvent */ js.Any) => Boolean): Self = StObject.set(x, "eventAllow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEventAllowUndefined: Self = StObject.set(x, "eventAllow", js.undefined)
      
      @scala.inline
      def setEventBackgroundColor(value: String): Self = StObject.set(x, "eventBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventBackgroundColorUndefined: Self = StObject.set(x, "eventBackgroundColor", js.undefined)
      
      @scala.inline
      def setEventBorderColor(value: String): Self = StObject.set(x, "eventBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventBorderColorUndefined: Self = StObject.set(x, "eventBorderColor", js.undefined)
      
      @scala.inline
      def setEventClassName(value: js.Array[String] | String): Self = StObject.set(x, "eventClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventClassNameUndefined: Self = StObject.set(x, "eventClassName", js.undefined)
      
      @scala.inline
      def setEventClassNameVarargs(value: String*): Self = StObject.set(x, "eventClassName", js.Array(value :_*))
      
      @scala.inline
      def setEventClassNames(value: js.Array[String] | String): Self = StObject.set(x, "eventClassNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventClassNamesUndefined: Self = StObject.set(x, "eventClassNames", js.undefined)
      
      @scala.inline
      def setEventClassNamesVarargs(value: String*): Self = StObject.set(x, "eventClassNames", js.Array(value :_*))
      
      @scala.inline
      def setEventColor(value: String): Self = StObject.set(x, "eventColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventColorUndefined: Self = StObject.set(x, "eventColor", js.undefined)
      
      @scala.inline
      def setEventConstraint(value: js.Any): Self = StObject.set(x, "eventConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventConstraintUndefined: Self = StObject.set(x, "eventConstraint", js.undefined)
      
      @scala.inline
      def setEventDataTransform(value: js.Any): Self = StObject.set(x, "eventDataTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventDataTransformUndefined: Self = StObject.set(x, "eventDataTransform", js.undefined)
      
      @scala.inline
      def setEventDestroy(value: js.Any): Self = StObject.set(x, "eventDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventDestroyUndefined: Self = StObject.set(x, "eventDestroy", js.undefined)
      
      @scala.inline
      def setEventDragMinDistance(value: Double): Self = StObject.set(x, "eventDragMinDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventDragMinDistanceUndefined: Self = StObject.set(x, "eventDragMinDistance", js.undefined)
      
      @scala.inline
      def setEventDurationEditable(value: Boolean): Self = StObject.set(x, "eventDurationEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventDurationEditableUndefined: Self = StObject.set(x, "eventDurationEditable", js.undefined)
      
      @scala.inline
      def setEventLimit(value: Boolean | Double): Self = StObject.set(x, "eventLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventLimitClick(
        value: popover | week | day | timeGridWeek | timeGridDay | String | (js.Function1[/* arg */ AllDay, Unit])
      ): Self = StObject.set(x, "eventLimitClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventLimitClickFunction1(value: /* arg */ AllDay => Unit): Self = StObject.set(x, "eventLimitClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEventLimitClickUndefined: Self = StObject.set(x, "eventLimitClick", js.undefined)
      
      @scala.inline
      def setEventLimitText(value: String | (js.Function1[/* eventCnt */ Double, String])): Self = StObject.set(x, "eventLimitText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventLimitTextFunction1(value: /* eventCnt */ Double => String): Self = StObject.set(x, "eventLimitText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEventLimitTextUndefined: Self = StObject.set(x, "eventLimitText", js.undefined)
      
      @scala.inline
      def setEventLimitUndefined: Self = StObject.set(x, "eventLimit", js.undefined)
      
      @scala.inline
      def setEventLongPressDelay(value: Double): Self = StObject.set(x, "eventLongPressDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventLongPressDelayUndefined: Self = StObject.set(x, "eventLongPressDelay", js.undefined)
      
      @scala.inline
      def setEventOrder(value: String | (js.Array[(js.Function2[/* a */ _, /* b */ _, Double]) | String])): Self = StObject.set(x, "eventOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventOrderUndefined: Self = StObject.set(x, "eventOrder", js.undefined)
      
      @scala.inline
      def setEventOrderVarargs(value: ((js.Function2[js.Any, js.Any, Double]) | String)*): Self = StObject.set(x, "eventOrder", js.Array(value :_*))
      
      @scala.inline
      def setEventOverlap(value: Boolean | OverlapFunc): Self = StObject.set(x, "eventOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventOverlapFunction2(value: (/* stillEvent */ js.Any, /* movingEvent */ js.Any) => Boolean): Self = StObject.set(x, "eventOverlap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEventOverlapUndefined: Self = StObject.set(x, "eventOverlap", js.undefined)
      
      @scala.inline
      def setEventRender(value: js.Any): Self = StObject.set(x, "eventRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventRenderUndefined: Self = StObject.set(x, "eventRender", js.undefined)
      
      @scala.inline
      def setEventResizableFromStart(value: Boolean): Self = StObject.set(x, "eventResizableFromStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventResizableFromStartUndefined: Self = StObject.set(x, "eventResizableFromStart", js.undefined)
      
      @scala.inline
      def setEventSourceFailure(value: js.Any): Self = StObject.set(x, "eventSourceFailure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSourceFailureUndefined: Self = StObject.set(x, "eventSourceFailure", js.undefined)
      
      @scala.inline
      def setEventSourceSuccess(value: js.Any): Self = StObject.set(x, "eventSourceSuccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSourceSuccessUndefined: Self = StObject.set(x, "eventSourceSuccess", js.undefined)
      
      @scala.inline
      def setEventSources(value: js.Array[_]): Self = StObject.set(x, "eventSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSourcesUndefined: Self = StObject.set(x, "eventSources", js.undefined)
      
      @scala.inline
      def setEventSourcesVarargs(value: js.Any*): Self = StObject.set(x, "eventSources", js.Array(value :_*))
      
      @scala.inline
      def setEventStartEditable(value: Boolean): Self = StObject.set(x, "eventStartEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventStartEditableUndefined: Self = StObject.set(x, "eventStartEditable", js.undefined)
      
      @scala.inline
      def setEventTextColor(value: String): Self = StObject.set(x, "eventTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTextColorUndefined: Self = StObject.set(x, "eventTextColor", js.undefined)
      
      @scala.inline
      def setEventTimeFormat(value: FormatterInput): Self = StObject.set(x, "eventTimeFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTimeFormatFunction1(value: /* arg */ js.Any => String): Self = StObject.set(x, "eventTimeFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEventTimeFormatUndefined: Self = StObject.set(x, "eventTimeFormat", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setFilterResourcesWithEvents(value: js.Any): Self = StObject.set(x, "filterResourcesWithEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterResourcesWithEventsUndefined: Self = StObject.set(x, "filterResourcesWithEvents", js.undefined)
      
      @scala.inline
      def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
      
      @scala.inline
      def setFixedWeekCount(value: Boolean): Self = StObject.set(x, "fixedWeekCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedWeekCountUndefined: Self = StObject.set(x, "fixedWeekCount", js.undefined)
      
      @scala.inline
      def setFooter(value: ToolbarInput | Boolean): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setForceEventDuration(value: Boolean): Self = StObject.set(x, "forceEventDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceEventDurationUndefined: Self = StObject.set(x, "forceEventDuration", js.undefined)
      
      @scala.inline
      def setGoogleCalendarApiKey(value: js.Any): Self = StObject.set(x, "googleCalendarApiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoogleCalendarApiKeyUndefined: Self = StObject.set(x, "googleCalendarApiKey", js.undefined)
      
      @scala.inline
      def setHandleWindowResize(value: Boolean): Self = StObject.set(x, "handleWindowResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleWindowResizeUndefined: Self = StObject.set(x, "handleWindowResize", js.undefined)
      
      @scala.inline
      def setHeader(value: ToolbarInput | Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | auto | parent | js.Function0[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightFunction0(value: () => Double): Self = StObject.set(x, "height", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHiddenDays(value: js.Array[Double]): Self = StObject.set(x, "hiddenDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenDaysUndefined: Self = StObject.set(x, "hiddenDays", js.undefined)
      
      @scala.inline
      def setHiddenDaysVarargs(value: Double*): Self = StObject.set(x, "hiddenDays", js.Array(value :_*))
      
      @scala.inline
      def setLazyFetching(value: Boolean): Self = StObject.set(x, "lazyFetching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyFetchingUndefined: Self = StObject.set(x, "lazyFetching", js.undefined)
      
      @scala.inline
      def setListDayAltFormat(value: FormatterInput | Boolean): Self = StObject.set(x, "listDayAltFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListDayAltFormatFunction1(value: /* arg */ js.Any => String): Self = StObject.set(x, "listDayAltFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListDayAltFormatUndefined: Self = StObject.set(x, "listDayAltFormat", js.undefined)
      
      @scala.inline
      def setListDayFormat(value: FormatterInput | Boolean): Self = StObject.set(x, "listDayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListDayFormatFunction1(value: /* arg */ js.Any => String): Self = StObject.set(x, "listDayFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListDayFormatUndefined: Self = StObject.set(x, "listDayFormat", js.undefined)
      
      @scala.inline
      def setLocale(value: LocaleSingularArg): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLocaleVarargs(value: String*): Self = StObject.set(x, "locale", js.Array(value :_*))
      
      @scala.inline
      def setLocales(value: js.Array[RawLocale]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      @scala.inline
      def setLocalesVarargs(value: RawLocale*): Self = StObject.set(x, "locales", js.Array(value :_*))
      
      @scala.inline
      def setLongPressDelay(value: Double): Self = StObject.set(x, "longPressDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongPressDelayUndefined: Self = StObject.set(x, "longPressDelay", js.undefined)
      
      @scala.inline
      def setMaxTime(value: DurationInput): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      @scala.inline
      def setMinTime(value: DurationInput): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      @scala.inline
      def setNavLinkDayClick(value: String | (js.Function2[/* date */ Date, /* jsEvent */ Event, Unit])): Self = StObject.set(x, "navLinkDayClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavLinkDayClickFunction2(value: (/* date */ Date, /* jsEvent */ Event) => Unit): Self = StObject.set(x, "navLinkDayClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNavLinkDayClickUndefined: Self = StObject.set(x, "navLinkDayClick", js.undefined)
      
      @scala.inline
      def setNavLinkWeekClick(value: String | (js.Function2[/* weekStart */ js.Any, /* jsEvent */ Event, Unit])): Self = StObject.set(x, "navLinkWeekClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavLinkWeekClickFunction2(value: (/* weekStart */ js.Any, /* jsEvent */ Event) => Unit): Self = StObject.set(x, "navLinkWeekClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNavLinkWeekClickUndefined: Self = StObject.set(x, "navLinkWeekClick", js.undefined)
      
      @scala.inline
      def setNavLinks(value: Boolean): Self = StObject.set(x, "navLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavLinksUndefined: Self = StObject.set(x, "navLinks", js.undefined)
      
      @scala.inline
      def setNextDayThreshold(value: DurationInput): Self = StObject.set(x, "nextDayThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextDayThresholdUndefined: Self = StObject.set(x, "nextDayThreshold", js.undefined)
      
      @scala.inline
      def setNoEventsMessage(value: String): Self = StObject.set(x, "noEventsMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoEventsMessageUndefined: Self = StObject.set(x, "noEventsMessage", js.undefined)
      
      @scala.inline
      def setNow(value: DateInput | js.Function0[DateInput]): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNowFunction0(value: () => DateInput): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNowIndicator(value: Boolean): Self = StObject.set(x, "nowIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNowIndicatorUndefined: Self = StObject.set(x, "nowIndicator", js.undefined)
      
      @scala.inline
      def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      @scala.inline
      def setNowVarargs(value: Double*): Self = StObject.set(x, "now", js.Array(value :_*))
      
      @scala.inline
      def setPlugins(value: js.Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setProgressiveEventRendering(value: Boolean): Self = StObject.set(x, "progressiveEventRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressiveEventRenderingUndefined: Self = StObject.set(x, "progressiveEventRendering", js.undefined)
      
      @scala.inline
      def setRefetchResourcesOnNavigate(value: js.Any): Self = StObject.set(x, "refetchResourcesOnNavigate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefetchResourcesOnNavigateUndefined: Self = StObject.set(x, "refetchResourcesOnNavigate", js.undefined)
      
      @scala.inline
      def setRerenderDelay(value: Double): Self = StObject.set(x, "rerenderDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRerenderDelayNull: Self = StObject.set(x, "rerenderDelay", null)
      
      @scala.inline
      def setRerenderDelayUndefined: Self = StObject.set(x, "rerenderDelay", js.undefined)
      
      @scala.inline
      def setResourceAreaWidth(value: js.Any): Self = StObject.set(x, "resourceAreaWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceAreaWidthUndefined: Self = StObject.set(x, "resourceAreaWidth", js.undefined)
      
      @scala.inline
      def setResourceColumns(value: js.Any): Self = StObject.set(x, "resourceColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceColumnsUndefined: Self = StObject.set(x, "resourceColumns", js.undefined)
      
      @scala.inline
      def setResourceGroupField(value: js.Any): Self = StObject.set(x, "resourceGroupField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceGroupFieldUndefined: Self = StObject.set(x, "resourceGroupField", js.undefined)
      
      @scala.inline
      def setResourceGroupText(value: js.Any): Self = StObject.set(x, "resourceGroupText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceGroupTextUndefined: Self = StObject.set(x, "resourceGroupText", js.undefined)
      
      @scala.inline
      def setResourceLabelText(value: js.Any): Self = StObject.set(x, "resourceLabelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceLabelTextUndefined: Self = StObject.set(x, "resourceLabelText", js.undefined)
      
      @scala.inline
      def setResourceOrder(value: js.Any): Self = StObject.set(x, "resourceOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceOrderUndefined: Self = StObject.set(x, "resourceOrder", js.undefined)
      
      @scala.inline
      def setResourceRender(value: js.Any): Self = StObject.set(x, "resourceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceRenderUndefined: Self = StObject.set(x, "resourceRender", js.undefined)
      
      @scala.inline
      def setResourceText(value: js.Any): Self = StObject.set(x, "resourceText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTextUndefined: Self = StObject.set(x, "resourceText", js.undefined)
      
      @scala.inline
      def setResources(value: js.Any): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesInitiallyExpanded(value: js.Any): Self = StObject.set(x, "resourcesInitiallyExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesInitiallyExpandedUndefined: Self = StObject.set(x, "resourcesInitiallyExpanded", js.undefined)
      
      @scala.inline
      def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      @scala.inline
      def setSchedulerLicenseKey(value: js.Any): Self = StObject.set(x, "schedulerLicenseKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchedulerLicenseKeyUndefined: Self = StObject.set(x, "schedulerLicenseKey", js.undefined)
      
      @scala.inline
      def setScrollTime(value: DurationInput): Self = StObject.set(x, "scrollTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTimeUndefined: Self = StObject.set(x, "scrollTime", js.undefined)
      
      @scala.inline
      def setSelectAllow(value: (/* span */ js.Any, /* movingEvent */ js.Any) => Boolean): Self = StObject.set(x, "selectAllow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelectAllowUndefined: Self = StObject.set(x, "selectAllow", js.undefined)
      
      @scala.inline
      def setSelectConstraint(value: js.Any): Self = StObject.set(x, "selectConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectConstraintUndefined: Self = StObject.set(x, "selectConstraint", js.undefined)
      
      @scala.inline
      def setSelectLongPressDelay(value: Double): Self = StObject.set(x, "selectLongPressDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectLongPressDelayUndefined: Self = StObject.set(x, "selectLongPressDelay", js.undefined)
      
      @scala.inline
      def setSelectMinDistance(value: Double): Self = StObject.set(x, "selectMinDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectMinDistanceUndefined: Self = StObject.set(x, "selectMinDistance", js.undefined)
      
      @scala.inline
      def setSelectMirror(value: Boolean): Self = StObject.set(x, "selectMirror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectMirrorUndefined: Self = StObject.set(x, "selectMirror", js.undefined)
      
      @scala.inline
      def setSelectOverlap(value: Boolean | OverlapFunc): Self = StObject.set(x, "selectOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectOverlapFunction2(value: (/* stillEvent */ js.Any, /* movingEvent */ js.Any) => Boolean): Self = StObject.set(x, "selectOverlap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelectOverlapUndefined: Self = StObject.set(x, "selectOverlap", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setShowNonCurrentDates(value: Boolean): Self = StObject.set(x, "showNonCurrentDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNonCurrentDatesUndefined: Self = StObject.set(x, "showNonCurrentDates", js.undefined)
      
      @scala.inline
      def setSlotDuration(value: DurationInput): Self = StObject.set(x, "slotDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotDurationUndefined: Self = StObject.set(x, "slotDuration", js.undefined)
      
      @scala.inline
      def setSlotEventOverlap(value: Boolean): Self = StObject.set(x, "slotEventOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotEventOverlapUndefined: Self = StObject.set(x, "slotEventOverlap", js.undefined)
      
      @scala.inline
      def setSlotLabelFormat(value: FormatterInput): Self = StObject.set(x, "slotLabelFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotLabelFormatFunction1(value: /* arg */ js.Any => String): Self = StObject.set(x, "slotLabelFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlotLabelFormatUndefined: Self = StObject.set(x, "slotLabelFormat", js.undefined)
      
      @scala.inline
      def setSlotLabelInterval(value: DurationInput): Self = StObject.set(x, "slotLabelInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotLabelIntervalUndefined: Self = StObject.set(x, "slotLabelInterval", js.undefined)
      
      @scala.inline
      def setSlotWidth(value: js.Any): Self = StObject.set(x, "slotWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotWidthUndefined: Self = StObject.set(x, "slotWidth", js.undefined)
      
      @scala.inline
      def setSnapDuration(value: DurationInput): Self = StObject.set(x, "snapDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapDurationUndefined: Self = StObject.set(x, "snapDuration", js.undefined)
      
      @scala.inline
      def setStartParam(value: String): Self = StObject.set(x, "startParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartParamUndefined: Self = StObject.set(x, "startParam", js.undefined)
      
      @scala.inline
      def setThemeSystem(value: String): Self = StObject.set(x, "themeSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeSystemUndefined: Self = StObject.set(x, "themeSystem", js.undefined)
      
      @scala.inline
      def setTimeGridEventMinHeight(value: Double): Self = StObject.set(x, "timeGridEventMinHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeGridEventMinHeightUndefined: Self = StObject.set(x, "timeGridEventMinHeight", js.undefined)
      
      @scala.inline
      def setTimeZone(value: String | Boolean): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneParam(value: String): Self = StObject.set(x, "timeZoneParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneParamUndefined: Self = StObject.set(x, "timeZoneParam", js.undefined)
      
      @scala.inline
      def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      
      @scala.inline
      def setTitleFormat(value: FormatterInput): Self = StObject.set(x, "titleFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFormatFunction1(value: /* arg */ js.Any => String): Self = StObject.set(x, "titleFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleFormatUndefined: Self = StObject.set(x, "titleFormat", js.undefined)
      
      @scala.inline
      def setTitleRangeSeparator(value: String): Self = StObject.set(x, "titleRangeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleRangeSeparatorUndefined: Self = StObject.set(x, "titleRangeSeparator", js.undefined)
      
      @scala.inline
      def setUnselectAuto(value: Boolean): Self = StObject.set(x, "unselectAuto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectAutoUndefined: Self = StObject.set(x, "unselectAuto", js.undefined)
      
      @scala.inline
      def setUnselectCancel(value: String): Self = StObject.set(x, "unselectCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectCancelUndefined: Self = StObject.set(x, "unselectCancel", js.undefined)
      
      @scala.inline
      def setValidRange(value: DateRangeInput): Self = StObject.set(x, "validRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidRangeUndefined: Self = StObject.set(x, "validRange", js.undefined)
      
      @scala.inline
      def setViewSkeletonDestroy(value: js.Any): Self = StObject.set(x, "viewSkeletonDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewSkeletonDestroyUndefined: Self = StObject.set(x, "viewSkeletonDestroy", js.undefined)
      
      @scala.inline
      def setViewSkeletonRender(value: js.Any): Self = StObject.set(x, "viewSkeletonRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewSkeletonRenderUndefined: Self = StObject.set(x, "viewSkeletonRender", js.undefined)
      
      @scala.inline
      def setViews(value: js.Any): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
      
      @scala.inline
      def setVisibleRange(value: (js.Function1[/* currentDate */ Date, DateRangeInput]) | DateRangeInput): Self = StObject.set(x, "visibleRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleRangeFunction1(value: /* currentDate */ Date => DateRangeInput): Self = StObject.set(x, "visibleRange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisibleRangeUndefined: Self = StObject.set(x, "visibleRange", js.undefined)
      
      @scala.inline
      def setWeekLabel(value: String): Self = StObject.set(x, "weekLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekLabelUndefined: Self = StObject.set(x, "weekLabel", js.undefined)
      
      @scala.inline
      def setWeekNumberCalculation(value: local | ISO | (js.Function1[/* m */ Date, Double])): Self = StObject.set(x, "weekNumberCalculation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekNumberCalculationFunction1(value: /* m */ Date => Double): Self = StObject.set(x, "weekNumberCalculation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWeekNumberCalculationUndefined: Self = StObject.set(x, "weekNumberCalculation", js.undefined)
      
      @scala.inline
      def setWeekNumbers(value: Boolean): Self = StObject.set(x, "weekNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekNumbersUndefined: Self = StObject.set(x, "weekNumbers", js.undefined)
      
      @scala.inline
      def setWeekNumbersWithinDays(value: Boolean): Self = StObject.set(x, "weekNumbersWithinDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekNumbersWithinDaysUndefined: Self = StObject.set(x, "weekNumbersWithinDays", js.undefined)
      
      @scala.inline
      def setWeekends(value: Boolean): Self = StObject.set(x, "weekends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekendsUndefined: Self = StObject.set(x, "weekends", js.undefined)
      
      @scala.inline
      def setWindowResizeDelay(value: Double): Self = StObject.set(x, "windowResizeDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowResizeDelayUndefined: Self = StObject.set(x, "windowResizeDelay", js.undefined)
    }
  }
  
  @js.native
  trait CustomButton extends StObject {
    
    var bootstrapFontAwesome: js.UndefOr[js.Any] = js.native
    
    var click: js.UndefOr[js.Function0[_]] = js.native
    
    var icon: js.UndefOr[js.Any] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object CustomButton {
    
    @scala.inline
    def apply(): CustomButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomButton]
    }
    
    @scala.inline
    implicit class CustomButtonMutableBuilder[Self <: CustomButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBootstrapFontAwesome(value: js.Any): Self = StObject.set(x, "bootstrapFontAwesome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrapFontAwesomeUndefined: Self = StObject.set(x, "bootstrapFontAwesome", js.undefined)
      
      @scala.inline
      def setClick(value: () => _): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setIcon(value: js.Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type CustomButtons = StringDictionary[CustomButton]
  
  type DateInput = Date | String | Double | js.Array[Double]
  
  @js.native
  trait DateRangeInput extends StObject {
    
    var end: js.UndefOr[DateInput] = js.native
    
    var start: js.UndefOr[DateInput] = js.native
  }
  object DateRangeInput {
    
    @scala.inline
    def apply(): DateRangeInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateRangeInput]
    }
    
    @scala.inline
    implicit class DateRangeInputMutableBuilder[Self <: DateRangeInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: DateInput): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setEndVarargs(value: Double*): Self = StObject.set(x, "end", js.Array(value :_*))
      
      @scala.inline
      def setStart(value: DateInput): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStartVarargs(value: Double*): Self = StObject.set(x, "start", js.Array(value :_*))
    }
  }
  
  type DurationInput = DurationObjectInput | String | Double
  
  @js.native
  trait DurationObjectInput extends StObject {
    
    var day: js.UndefOr[Double] = js.native
    
    var days: js.UndefOr[Double] = js.native
    
    var hour: js.UndefOr[Double] = js.native
    
    var hours: js.UndefOr[Double] = js.native
    
    var millisecond: js.UndefOr[Double] = js.native
    
    var milliseconds: js.UndefOr[Double] = js.native
    
    var minute: js.UndefOr[Double] = js.native
    
    var minutes: js.UndefOr[Double] = js.native
    
    var month: js.UndefOr[Double] = js.native
    
    var months: js.UndefOr[Double] = js.native
    
    var ms: js.UndefOr[Double] = js.native
    
    var second: js.UndefOr[Double] = js.native
    
    var seconds: js.UndefOr[Double] = js.native
    
    var week: js.UndefOr[Double] = js.native
    
    var weeks: js.UndefOr[Double] = js.native
    
    var year: js.UndefOr[Double] = js.native
    
    var years: js.UndefOr[Double] = js.native
  }
  object DurationObjectInput {
    
    @scala.inline
    def apply(): DurationObjectInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DurationObjectInput]
    }
    
    @scala.inline
    implicit class DurationObjectInputMutableBuilder[Self <: DurationObjectInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      @scala.inline
      def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      @scala.inline
      def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      @scala.inline
      def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      @scala.inline
      def setMillisecond(value: Double): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillisecondUndefined: Self = StObject.set(x, "millisecond", js.undefined)
      
      @scala.inline
      def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
      
      @scala.inline
      def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      @scala.inline
      def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      @scala.inline
      def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      @scala.inline
      def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
      
      @scala.inline
      def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      @scala.inline
      def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      
      @scala.inline
      def setWeek(value: Double): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
      
      @scala.inline
      def setWeeks(value: Double): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeeksUndefined: Self = StObject.set(x, "weeks", js.undefined)
      
      @scala.inline
      def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
      
      @scala.inline
      def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
    }
  }
  
  type FormatterInput = js.Object | String | FuncFormatterFunc
  
  type FuncFormatterFunc = js.Function1[/* arg */ js.Any, String]
  
  type LocaleCodeArg = String | js.Array[String]
  
  type LocaleSingularArg = LocaleCodeArg | RawLocale
  
  type OverlapFunc = js.Function2[/* stillEvent */ js.Any, /* movingEvent */ js.Any, Boolean]
  
  @js.native
  trait RawLocale
    extends /* otherProp */ StringDictionary[js.Any] {
    
    var code: String = js.native
  }
  object RawLocale {
    
    @scala.inline
    def apply(code: String): RawLocale = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawLocale]
    }
    
    @scala.inline
    implicit class RawLocaleMutableBuilder[Self <: RawLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToolbarInput extends StObject {
    
    var center: String = js.native
    
    var left: String = js.native
    
    var right: String = js.native
  }
  object ToolbarInput {
    
    @scala.inline
    def apply(center: String, left: String, right: String): ToolbarInput = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarInput]
    }
    
    @scala.inline
    implicit class ToolbarInputMutableBuilder[Self <: ToolbarInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(value: String): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fullcalendarVue.fullcalendarVueStrings.ltr
    - typings.fullcalendarVue.fullcalendarVueStrings.rtl
  */
  trait direction extends StObject
  object direction {
    
    @scala.inline
    def ltr: typings.fullcalendarVue.fullcalendarVueStrings.ltr = "ltr".asInstanceOf[typings.fullcalendarVue.fullcalendarVueStrings.ltr]
    
    @scala.inline
    def rtl: typings.fullcalendarVue.fullcalendarVueStrings.rtl = "rtl".asInstanceOf[typings.fullcalendarVue.fullcalendarVueStrings.rtl]
  }
}
