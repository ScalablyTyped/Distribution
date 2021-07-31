package typings.flatpickr

import typings.flatpickr.anon.GetDaysInMonth
import typings.flatpickr.anon.PartialParsedOptions
import typings.flatpickr.anon.kinkeyCustomLocaledefault
import typings.flatpickr.anon.kinkeyofOptionsOptionsk
import typings.flatpickr.formattingMod.Formats_
import typings.flatpickr.formattingMod.RevFormat_
import typings.flatpickr.formattingMod.TokenRegex_
import typings.flatpickr.globalsMod.global.Date
import typings.flatpickr.globalsMod.global.HTMLElement
import typings.flatpickr.localeMod.CustomLocale
import typings.flatpickr.localeMod.Locale
import typings.flatpickr.optionsMod.DateOption
import typings.flatpickr.optionsMod.Options
import typings.flatpickr.optionsMod.ParsedOptions
import typings.std.AddEventListenerOptions
import typings.std.ArrayLike
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.FocusEvent
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.HTMLSpanElement
import typings.std.MouseEvent
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceMod {
  
  @js.native
  trait DayElement
    extends StObject
       with HTMLSpanElement {
    
    @JSName("$i")
    var $i: Double = js.native
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var dateObj: Date = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
  
  trait Elements extends StObject {
    
    var _hideNextMonthArrow: Boolean
    
    var _hidePrevMonthArrow: Boolean
    
    var _input: HTMLInputElement
    
    var _positionElement: HTMLElement
    
    var altInput: js.UndefOr[HTMLInputElement] = js.undefined
    
    var amPM: js.UndefOr[HTMLSpanElement] = js.undefined
    
    var calendarContainer: HTMLDivElement
    
    var currentMonthElement: HTMLSpanElement
    
    var currentYearElement: HTMLInputElement
    
    var days: HTMLDivElement
    
    var daysContainer: js.UndefOr[HTMLDivElement] = js.undefined
    
    var element: HTMLElement
    
    var hourElement: js.UndefOr[HTMLInputElement] = js.undefined
    
    var innerContainer: js.UndefOr[HTMLDivElement] = js.undefined
    
    var input: HTMLInputElement
    
    var minuteElement: js.UndefOr[HTMLInputElement] = js.undefined
    
    var mobileFormatStr: js.UndefOr[String] = js.undefined
    
    var mobileInput: js.UndefOr[HTMLInputElement] = js.undefined
    
    var monthElements: js.Array[HTMLSpanElement]
    
    var monthNav: HTMLDivElement
    
    var monthsDropdownContainer: HTMLSelectElement
    
    var nextMonthNav: HTMLElement
    
    var pluginElements: js.Array[Node]
    
    var prevMonthNav: HTMLElement
    
    var rContainer: js.UndefOr[HTMLDivElement] = js.undefined
    
    var secondElement: js.UndefOr[HTMLInputElement] = js.undefined
    
    var selectedDateElem: js.UndefOr[DayElement] = js.undefined
    
    var timeContainer: js.UndefOr[HTMLDivElement] = js.undefined
    
    var todayDateElem: js.UndefOr[DayElement] = js.undefined
    
    var weekNumbers: js.UndefOr[HTMLDivElement] = js.undefined
    
    var weekWrapper: js.UndefOr[HTMLDivElement] = js.undefined
    
    var weekdayContainer: HTMLDivElement
    
    var yearElements: js.Array[HTMLInputElement]
  }
  object Elements {
    
    @scala.inline
    def apply(
      _hideNextMonthArrow: Boolean,
      _hidePrevMonthArrow: Boolean,
      _input: HTMLInputElement,
      _positionElement: HTMLElement,
      calendarContainer: HTMLDivElement,
      currentMonthElement: HTMLSpanElement,
      currentYearElement: HTMLInputElement,
      days: HTMLDivElement,
      element: HTMLElement,
      input: HTMLInputElement,
      monthElements: js.Array[HTMLSpanElement],
      monthNav: HTMLDivElement,
      monthsDropdownContainer: HTMLSelectElement,
      nextMonthNav: HTMLElement,
      pluginElements: js.Array[Node],
      prevMonthNav: HTMLElement,
      weekdayContainer: HTMLDivElement,
      yearElements: js.Array[HTMLInputElement]
    ): Elements = {
      val __obj = js.Dynamic.literal(_hideNextMonthArrow = _hideNextMonthArrow.asInstanceOf[js.Any], _hidePrevMonthArrow = _hidePrevMonthArrow.asInstanceOf[js.Any], _input = _input.asInstanceOf[js.Any], _positionElement = _positionElement.asInstanceOf[js.Any], calendarContainer = calendarContainer.asInstanceOf[js.Any], currentMonthElement = currentMonthElement.asInstanceOf[js.Any], currentYearElement = currentYearElement.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], monthElements = monthElements.asInstanceOf[js.Any], monthNav = monthNav.asInstanceOf[js.Any], monthsDropdownContainer = monthsDropdownContainer.asInstanceOf[js.Any], nextMonthNav = nextMonthNav.asInstanceOf[js.Any], pluginElements = pluginElements.asInstanceOf[js.Any], prevMonthNav = prevMonthNav.asInstanceOf[js.Any], weekdayContainer = weekdayContainer.asInstanceOf[js.Any], yearElements = yearElements.asInstanceOf[js.Any])
      __obj.asInstanceOf[Elements]
    }
    
    @scala.inline
    implicit class ElementsMutableBuilder[Self <: Elements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltInput(value: HTMLInputElement): Self = StObject.set(x, "altInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltInputUndefined: Self = StObject.set(x, "altInput", js.undefined)
      
      @scala.inline
      def setAmPM(value: HTMLSpanElement): Self = StObject.set(x, "amPM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmPMUndefined: Self = StObject.set(x, "amPM", js.undefined)
      
      @scala.inline
      def setCalendarContainer(value: HTMLDivElement): Self = StObject.set(x, "calendarContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentMonthElement(value: HTMLSpanElement): Self = StObject.set(x, "currentMonthElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentYearElement(value: HTMLInputElement): Self = StObject.set(x, "currentYearElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDays(value: HTMLDivElement): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysContainer(value: HTMLDivElement): Self = StObject.set(x, "daysContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysContainerUndefined: Self = StObject.set(x, "daysContainer", js.undefined)
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourElement(value: HTMLInputElement): Self = StObject.set(x, "hourElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourElementUndefined: Self = StObject.set(x, "hourElement", js.undefined)
      
      @scala.inline
      def setInnerContainer(value: HTMLDivElement): Self = StObject.set(x, "innerContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerContainerUndefined: Self = StObject.set(x, "innerContainer", js.undefined)
      
      @scala.inline
      def setInput(value: HTMLInputElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteElement(value: HTMLInputElement): Self = StObject.set(x, "minuteElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteElementUndefined: Self = StObject.set(x, "minuteElement", js.undefined)
      
      @scala.inline
      def setMobileFormatStr(value: String): Self = StObject.set(x, "mobileFormatStr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobileFormatStrUndefined: Self = StObject.set(x, "mobileFormatStr", js.undefined)
      
      @scala.inline
      def setMobileInput(value: HTMLInputElement): Self = StObject.set(x, "mobileInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobileInputUndefined: Self = StObject.set(x, "mobileInput", js.undefined)
      
      @scala.inline
      def setMonthElements(value: js.Array[HTMLSpanElement]): Self = StObject.set(x, "monthElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthElementsVarargs(value: HTMLSpanElement*): Self = StObject.set(x, "monthElements", js.Array(value :_*))
      
      @scala.inline
      def setMonthNav(value: HTMLDivElement): Self = StObject.set(x, "monthNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsDropdownContainer(value: HTMLSelectElement): Self = StObject.set(x, "monthsDropdownContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMonthNav(value: HTMLElement): Self = StObject.set(x, "nextMonthNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginElements(value: js.Array[Node]): Self = StObject.set(x, "pluginElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginElementsVarargs(value: Node*): Self = StObject.set(x, "pluginElements", js.Array(value :_*))
      
      @scala.inline
      def setPrevMonthNav(value: HTMLElement): Self = StObject.set(x, "prevMonthNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRContainer(value: HTMLDivElement): Self = StObject.set(x, "rContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRContainerUndefined: Self = StObject.set(x, "rContainer", js.undefined)
      
      @scala.inline
      def setSecondElement(value: HTMLInputElement): Self = StObject.set(x, "secondElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondElementUndefined: Self = StObject.set(x, "secondElement", js.undefined)
      
      @scala.inline
      def setSelectedDateElem(value: DayElement): Self = StObject.set(x, "selectedDateElem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDateElemUndefined: Self = StObject.set(x, "selectedDateElem", js.undefined)
      
      @scala.inline
      def setTimeContainer(value: HTMLDivElement): Self = StObject.set(x, "timeContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeContainerUndefined: Self = StObject.set(x, "timeContainer", js.undefined)
      
      @scala.inline
      def setTodayDateElem(value: DayElement): Self = StObject.set(x, "todayDateElem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayDateElemUndefined: Self = StObject.set(x, "todayDateElem", js.undefined)
      
      @scala.inline
      def setWeekNumbers(value: HTMLDivElement): Self = StObject.set(x, "weekNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekNumbersUndefined: Self = StObject.set(x, "weekNumbers", js.undefined)
      
      @scala.inline
      def setWeekWrapper(value: HTMLDivElement): Self = StObject.set(x, "weekWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekWrapperUndefined: Self = StObject.set(x, "weekWrapper", js.undefined)
      
      @scala.inline
      def setWeekdayContainer(value: HTMLDivElement): Self = StObject.set(x, "weekdayContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearElements(value: js.Array[HTMLInputElement]): Self = StObject.set(x, "yearElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearElementsVarargs(value: HTMLInputElement*): Self = StObject.set(x, "yearElements", js.Array(value :_*))
      
      @scala.inline
      def set_hideNextMonthArrow(value: Boolean): Self = StObject.set(x, "_hideNextMonthArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_hidePrevMonthArrow(value: Boolean): Self = StObject.set(x, "_hidePrevMonthArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_input(value: HTMLInputElement): Self = StObject.set(x, "_input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_positionElement(value: HTMLElement): Self = StObject.set(x, "_positionElement", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FlatpickrFn extends StObject {
    
    def apply(selector: String): Instance | js.Array[Instance] = js.native
    def apply(selector: String, config: Options): Instance | js.Array[Instance] = js.native
    def apply(selector: ArrayLike[Node]): js.Array[Instance] = js.native
    def apply(selector: ArrayLike[Node], config: Options): js.Array[Instance] = js.native
    def apply(selector: Node): Instance = js.native
    def apply(selector: Node, config: Options): Instance = js.native
    
    def compareDates(date1: Date, date2: Date): Double = js.native
    def compareDates(date1: Date, date2: Date, timeless: Boolean): Double = js.native
    
    var defaultConfig: PartialParsedOptions = js.native
    
    def formatDate(date: Date, format: String): String = js.native
    
    var l10ns: kinkeyCustomLocaledefault = js.native
    
    def localize(l10n: CustomLocale): Unit = js.native
    
    def parseDate(date: DateOption): js.UndefOr[Date] = js.native
    def parseDate(date: DateOption, format: String): js.UndefOr[Date] = js.native
    def parseDate(date: DateOption, format: String, timeless: Boolean): js.UndefOr[Date] = js.native
    def parseDate(date: DateOption, format: Unit, timeless: Boolean): js.UndefOr[Date] = js.native
    
    def setDefaults(config: Options): Unit = js.native
  }
  
  trait Formatting extends StObject {
    
    var formats: Formats_
    
    var revFormat: RevFormat_
    
    var tokenRegex: TokenRegex_
  }
  object Formatting {
    
    @scala.inline
    def apply(formats: Formats_, revFormat: RevFormat_, tokenRegex: TokenRegex_): Formatting = {
      val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], revFormat = revFormat.asInstanceOf[js.Any], tokenRegex = tokenRegex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Formatting]
    }
    
    @scala.inline
    implicit class FormattingMutableBuilder[Self <: Formatting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormats(value: Formats_): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevFormat(value: RevFormat_): Self = StObject.set(x, "revFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenRegex(value: TokenRegex_): Self = StObject.set(x, "tokenRegex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instance
    extends StObject
       with Elements
       with Formatting {
    
    var __hideNextMonthArrow: Boolean = js.native
    
    var __hidePrevMonthArrow: Boolean = js.native
    
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
    
    var _handlers: js.Array[typings.flatpickr.anon.Element] = js.native
    
    var _initialDate: Date = js.native
    
    def _positionCalendar(): Unit = js.native
    def _positionCalendar(customPositionElement: HTMLElement): Unit = js.native
    
    var _selectedDateObj: js.UndefOr[Date] = js.native
    
    def _setHoursFromDate(date: Date): Unit = js.native
    
    def changeMonth(value: Double): Unit = js.native
    def changeMonth(value: Double, isOffset: Boolean): Unit = js.native
    def changeMonth(value: Double, isOffset: Boolean, fromKeyboard: Boolean): Unit = js.native
    def changeMonth(value: Double, isOffset: Unit, fromKeyboard: Boolean): Unit = js.native
    
    def changeYear(year: Double): Unit = js.native
    
    def clear(): Unit = js.native
    def clear(emitChangeEvent: Boolean): Unit = js.native
    def clear(emitChangeEvent: Boolean, toInitial: Boolean): Unit = js.native
    def clear(emitChangeEvent: Unit, toInitial: Boolean): Unit = js.native
    
    def close(): Unit = js.native
    
    var config: ParsedOptions = js.native
    
    var currentMonth: Double = js.native
    
    var currentYear: Double = js.native
    
    def destroy(): Unit = js.native
    
    def formatDate(dateObj: Date, frmt: String): String = js.native
    
    def isEnabled(date: DateOption): Boolean = js.native
    def isEnabled(date: DateOption, timeless: Boolean): Boolean = js.native
    
    var isMobile: Boolean = js.native
    
    var isOpen: Boolean = js.native
    
    def jumpToDate(): Unit = js.native
    def jumpToDate(date: Unit, triggerChange: Boolean): Unit = js.native
    def jumpToDate(date: DateOption): Unit = js.native
    def jumpToDate(date: DateOption, triggerChange: Boolean): Unit = js.native
    
    var l10n: Locale = js.native
    
    var latestSelectedDateObj: js.UndefOr[Date] = js.native
    
    var loadedPlugins: js.Array[String] = js.native
    
    var maxDateHasTime: Boolean = js.native
    
    var maxRangeDate: js.UndefOr[Date] = js.native
    
    var minDateHasTime: Boolean = js.native
    
    var minRangeDate: js.UndefOr[Date] = js.native
    
    var now: Date = js.native
    
    def open(): Unit = js.native
    def open(e: Unit, positionElement: HTMLElement): Unit = js.native
    def open(e: FocusEvent): Unit = js.native
    def open(e: FocusEvent, positionElement: HTMLElement): Unit = js.native
    def open(e: MouseEvent): Unit = js.native
    def open(e: MouseEvent, positionElement: HTMLElement): Unit = js.native
    
    def pad(num: String): String = js.native
    def pad(num: Double): String = js.native
    
    def parseDate(date: String): js.UndefOr[Date] = js.native
    def parseDate(date: String, givenFormat: String): js.UndefOr[Date] = js.native
    def parseDate(date: String, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
    def parseDate(date: String, givenFormat: Unit, timeless: Boolean): js.UndefOr[Date] = js.native
    def parseDate(date: Double): js.UndefOr[Date] = js.native
    def parseDate(date: Double, givenFormat: String): js.UndefOr[Date] = js.native
    def parseDate(date: Double, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
    def parseDate(date: Double, givenFormat: Unit, timeless: Boolean): js.UndefOr[Date] = js.native
    def parseDate(date: Date): js.UndefOr[Date] = js.native
    def parseDate(date: Date, givenFormat: String): js.UndefOr[Date] = js.native
    def parseDate(date: Date, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
    def parseDate(date: Date, givenFormat: Unit, timeless: Boolean): js.UndefOr[Date] = js.native
    
    def redraw(): Unit = js.native
    
    var selectedDates: js.Array[Date] = js.native
    
    def set(option: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 62 */ js.Any): Unit = js.native
    def set(
      option: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 62 */ js.Any,
      value: js.Any
    ): Unit = js.native
    def set(option: kinkeyofOptionsOptionsk): Unit = js.native
    def set(option: kinkeyofOptionsOptionsk, value: js.Any): Unit = js.native
    
    def setDate(date: js.Array[DateOption]): Unit = js.native
    def setDate(date: js.Array[DateOption], triggerChange: Boolean): Unit = js.native
    def setDate(date: js.Array[DateOption], triggerChange: Boolean, format: String): Unit = js.native
    def setDate(date: js.Array[DateOption], triggerChange: Unit, format: String): Unit = js.native
    def setDate(date: DateOption): Unit = js.native
    def setDate(date: DateOption, triggerChange: Boolean): Unit = js.native
    def setDate(date: DateOption, triggerChange: Boolean, format: String): Unit = js.native
    def setDate(date: DateOption, triggerChange: Unit, format: String): Unit = js.native
    
    def toggle(): Unit = js.native
    
    var utils: GetDaysInMonth = js.native
  }
}
