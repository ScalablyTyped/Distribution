package typings.foundationDatepicker

import typings.foundationDatepicker.foundationDatepickerStrings.day
import typings.foundationDatepicker.foundationDatepickerStrings.decade
import typings.foundationDatepicker.foundationDatepickerStrings.hour
import typings.foundationDatepicker.foundationDatepickerStrings.month
import typings.foundationDatepicker.foundationDatepickerStrings.year
import typings.jquery.JQuery.Selector
import typings.jquery.JQuery.TypeOrArray
import typings.jquery.JQuery.htmlString
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FoundationDatepicker {
  
  trait Event
    extends StObject
       with typings.jquery.JQuery.Event {
    
    var date: js.Date
  }
  object Event {
    
    inline def apply(
      date: js.Date,
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      preventDefault: () => Unit,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      timeStamp: Double,
      `type`: String
    ): Event = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutOfRangeEvent
    extends StObject
       with Event {
    
    var endDate: js.Date
    
    var startDate: js.Date
  }
  object OutOfRangeEvent {
    
    inline def apply(
      date: js.Date,
      endDate: js.Date,
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      preventDefault: () => Unit,
      startDate: js.Date,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      timeStamp: Double,
      `type`: String
    ): OutOfRangeEvent = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), startDate = startDate.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutOfRangeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OutOfRangeEvent] (val x: Self) extends AnyVal {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    }
  }
  
  trait Settings extends StObject {
    
    var appendTo: js.UndefOr[
        Selector | htmlString | (TypeOrArray[Element | DocumentFragment]) | JQuery[HTMLElement]
      ] = js.undefined
    
    var autoShow: js.UndefOr[Boolean] = js.undefined
    
    var autoclose: js.UndefOr[Boolean] = js.undefined
    
    var calendarWeeks: js.UndefOr[Boolean] = js.undefined
    
    var closeButton: js.UndefOr[Boolean] = js.undefined
    
    var closeIcon: js.UndefOr[String] = js.undefined
    
    var datesDisabled: js.UndefOr[js.Array[String]] = js.undefined
    
    var daysOfWeekDisabled: js.UndefOr[js.Array[Double]] = js.undefined
    
    var disableDblClickSelection: js.UndefOr[Boolean] = js.undefined
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var faCSSprefix: js.UndefOr[String] = js.undefined
    
    var forceParse: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var initialDate: js.UndefOr[String] = js.undefined
    
    var keyboardNavigation: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var leftArrow: js.UndefOr[String] = js.undefined
    
    var maxView: js.UndefOr[decade | year | month | day | hour | Double] = js.undefined
    
    var minView: js.UndefOr[decade | year | month | day | hour | Double] = js.undefined
    
    var minuteStep: js.UndefOr[Double] = js.undefined
    
    var nonMilitaryTime: js.UndefOr[Boolean] = js.undefined
    
    var onRender: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.undefined
    
    var pickTime: js.UndefOr[Boolean] = js.undefined
    
    var rightArrow: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
    
    var startView: js.UndefOr[decade | year | month | day | hour | Double] = js.undefined
    
    var todayBtn: js.UndefOr[Boolean] = js.undefined
    
    var todayHighlight: js.UndefOr[Boolean] = js.undefined
    
    var weekStart: js.UndefOr[Double] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      inline def setAppendTo(value: Selector | htmlString | (TypeOrArray[Element | DocumentFragment]) | JQuery[HTMLElement]): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAppendToVarargs(value: (Element | DocumentFragment)*): Self = StObject.set(x, "appendTo", js.Array(value*))
      
      inline def setAutoShow(value: Boolean): Self = StObject.set(x, "autoShow", value.asInstanceOf[js.Any])
      
      inline def setAutoShowUndefined: Self = StObject.set(x, "autoShow", js.undefined)
      
      inline def setAutoclose(value: Boolean): Self = StObject.set(x, "autoclose", value.asInstanceOf[js.Any])
      
      inline def setAutocloseUndefined: Self = StObject.set(x, "autoclose", js.undefined)
      
      inline def setCalendarWeeks(value: Boolean): Self = StObject.set(x, "calendarWeeks", value.asInstanceOf[js.Any])
      
      inline def setCalendarWeeksUndefined: Self = StObject.set(x, "calendarWeeks", js.undefined)
      
      inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      inline def setCloseIcon(value: String): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setDatesDisabled(value: js.Array[String]): Self = StObject.set(x, "datesDisabled", value.asInstanceOf[js.Any])
      
      inline def setDatesDisabledUndefined: Self = StObject.set(x, "datesDisabled", js.undefined)
      
      inline def setDatesDisabledVarargs(value: String*): Self = StObject.set(x, "datesDisabled", js.Array(value*))
      
      inline def setDaysOfWeekDisabled(value: js.Array[Double]): Self = StObject.set(x, "daysOfWeekDisabled", value.asInstanceOf[js.Any])
      
      inline def setDaysOfWeekDisabledUndefined: Self = StObject.set(x, "daysOfWeekDisabled", js.undefined)
      
      inline def setDaysOfWeekDisabledVarargs(value: Double*): Self = StObject.set(x, "daysOfWeekDisabled", js.Array(value*))
      
      inline def setDisableDblClickSelection(value: Boolean): Self = StObject.set(x, "disableDblClickSelection", value.asInstanceOf[js.Any])
      
      inline def setDisableDblClickSelectionUndefined: Self = StObject.set(x, "disableDblClickSelection", js.undefined)
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setFaCSSprefix(value: String): Self = StObject.set(x, "faCSSprefix", value.asInstanceOf[js.Any])
      
      inline def setFaCSSprefixUndefined: Self = StObject.set(x, "faCSSprefix", js.undefined)
      
      inline def setForceParse(value: Boolean): Self = StObject.set(x, "forceParse", value.asInstanceOf[js.Any])
      
      inline def setForceParseUndefined: Self = StObject.set(x, "forceParse", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setInitialDate(value: String): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
      
      inline def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
      
      inline def setKeyboardNavigation(value: Boolean): Self = StObject.set(x, "keyboardNavigation", value.asInstanceOf[js.Any])
      
      inline def setKeyboardNavigationUndefined: Self = StObject.set(x, "keyboardNavigation", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLeftArrow(value: String): Self = StObject.set(x, "leftArrow", value.asInstanceOf[js.Any])
      
      inline def setLeftArrowUndefined: Self = StObject.set(x, "leftArrow", js.undefined)
      
      inline def setMaxView(value: decade | year | month | day | hour | Double): Self = StObject.set(x, "maxView", value.asInstanceOf[js.Any])
      
      inline def setMaxViewUndefined: Self = StObject.set(x, "maxView", js.undefined)
      
      inline def setMinView(value: decade | year | month | day | hour | Double): Self = StObject.set(x, "minView", value.asInstanceOf[js.Any])
      
      inline def setMinViewUndefined: Self = StObject.set(x, "minView", js.undefined)
      
      inline def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      inline def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      inline def setNonMilitaryTime(value: Boolean): Self = StObject.set(x, "nonMilitaryTime", value.asInstanceOf[js.Any])
      
      inline def setNonMilitaryTimeUndefined: Self = StObject.set(x, "nonMilitaryTime", js.undefined)
      
      inline def setOnRender(value: /* date */ js.Date => String): Self = StObject.set(x, "onRender", js.Any.fromFunction1(value))
      
      inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      inline def setPickTime(value: Boolean): Self = StObject.set(x, "pickTime", value.asInstanceOf[js.Any])
      
      inline def setPickTimeUndefined: Self = StObject.set(x, "pickTime", js.undefined)
      
      inline def setRightArrow(value: String): Self = StObject.set(x, "rightArrow", value.asInstanceOf[js.Any])
      
      inline def setRightArrowUndefined: Self = StObject.set(x, "rightArrow", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setStartView(value: decade | year | month | day | hour | Double): Self = StObject.set(x, "startView", value.asInstanceOf[js.Any])
      
      inline def setStartViewUndefined: Self = StObject.set(x, "startView", js.undefined)
      
      inline def setTodayBtn(value: Boolean): Self = StObject.set(x, "todayBtn", value.asInstanceOf[js.Any])
      
      inline def setTodayBtnUndefined: Self = StObject.set(x, "todayBtn", js.undefined)
      
      inline def setTodayHighlight(value: Boolean): Self = StObject.set(x, "todayHighlight", value.asInstanceOf[js.Any])
      
      inline def setTodayHighlightUndefined: Self = StObject.set(x, "todayHighlight", js.undefined)
      
      inline def setWeekStart(value: Double): Self = StObject.set(x, "weekStart", value.asInstanceOf[js.Any])
      
      inline def setWeekStartUndefined: Self = StObject.set(x, "weekStart", js.undefined)
    }
  }
}
