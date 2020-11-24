package typings.flatpickr.instanceMod

import typings.flatpickr.globalsMod.global.HTMLElement
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.HTMLSpanElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Elements extends js.Object {
  
  var _hideNextMonthArrow: Boolean = js.native
  
  var _hidePrevMonthArrow: Boolean = js.native
  
  var _input: HTMLInputElement = js.native
  
  var _positionElement: HTMLElement = js.native
  
  var altInput: js.UndefOr[HTMLInputElement] = js.native
  
  var amPM: js.UndefOr[HTMLSpanElement] = js.native
  
  var calendarContainer: HTMLDivElement = js.native
  
  var currentMonthElement: HTMLSpanElement = js.native
  
  var currentYearElement: HTMLInputElement = js.native
  
  var days: HTMLDivElement = js.native
  
  var daysContainer: js.UndefOr[HTMLDivElement] = js.native
  
  var element: HTMLElement = js.native
  
  var hourElement: js.UndefOr[HTMLInputElement] = js.native
  
  var innerContainer: js.UndefOr[HTMLDivElement] = js.native
  
  var input: HTMLInputElement = js.native
  
  var minuteElement: js.UndefOr[HTMLInputElement] = js.native
  
  var mobileFormatStr: js.UndefOr[String] = js.native
  
  var mobileInput: js.UndefOr[HTMLInputElement] = js.native
  
  var monthElements: js.Array[HTMLSpanElement] = js.native
  
  var monthNav: HTMLDivElement = js.native
  
  var monthsDropdownContainer: HTMLSelectElement = js.native
  
  var nextMonthNav: HTMLElement = js.native
  
  var pluginElements: js.Array[Node] = js.native
  
  var prevMonthNav: HTMLElement = js.native
  
  var rContainer: js.UndefOr[HTMLDivElement] = js.native
  
  var secondElement: js.UndefOr[HTMLInputElement] = js.native
  
  var selectedDateElem: js.UndefOr[DayElement] = js.native
  
  var timeContainer: js.UndefOr[HTMLDivElement] = js.native
  
  var todayDateElem: js.UndefOr[DayElement] = js.native
  
  var weekNumbers: js.UndefOr[HTMLDivElement] = js.native
  
  var weekWrapper: js.UndefOr[HTMLDivElement] = js.native
  
  var weekdayContainer: HTMLDivElement = js.native
  
  var yearElements: js.Array[HTMLInputElement] = js.native
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
  implicit class ElementsOps[Self <: Elements] (val x: Self) extends AnyVal {
    
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
    def set_hideNextMonthArrow(value: Boolean): Self = this.set("_hideNextMonthArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_hidePrevMonthArrow(value: Boolean): Self = this.set("_hidePrevMonthArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_input(value: HTMLInputElement): Self = this.set("_input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_positionElement(value: HTMLElement): Self = this.set("_positionElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarContainer(value: HTMLDivElement): Self = this.set("calendarContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentMonthElement(value: HTMLSpanElement): Self = this.set("currentMonthElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentYearElement(value: HTMLInputElement): Self = this.set("currentYearElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDays(value: HTMLDivElement): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: HTMLInputElement): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthElementsVarargs(value: HTMLSpanElement*): Self = this.set("monthElements", js.Array(value :_*))
    
    @scala.inline
    def setMonthElements(value: js.Array[HTMLSpanElement]): Self = this.set("monthElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthNav(value: HTMLDivElement): Self = this.set("monthNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthsDropdownContainer(value: HTMLSelectElement): Self = this.set("monthsDropdownContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMonthNav(value: HTMLElement): Self = this.set("nextMonthNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginElementsVarargs(value: Node*): Self = this.set("pluginElements", js.Array(value :_*))
    
    @scala.inline
    def setPluginElements(value: js.Array[Node]): Self = this.set("pluginElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevMonthNav(value: HTMLElement): Self = this.set("prevMonthNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekdayContainer(value: HTMLDivElement): Self = this.set("weekdayContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearElementsVarargs(value: HTMLInputElement*): Self = this.set("yearElements", js.Array(value :_*))
    
    @scala.inline
    def setYearElements(value: js.Array[HTMLInputElement]): Self = this.set("yearElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltInput(value: HTMLInputElement): Self = this.set("altInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltInput: Self = this.set("altInput", js.undefined)
    
    @scala.inline
    def setAmPM(value: HTMLSpanElement): Self = this.set("amPM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmPM: Self = this.set("amPM", js.undefined)
    
    @scala.inline
    def setDaysContainer(value: HTMLDivElement): Self = this.set("daysContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysContainer: Self = this.set("daysContainer", js.undefined)
    
    @scala.inline
    def setHourElement(value: HTMLInputElement): Self = this.set("hourElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourElement: Self = this.set("hourElement", js.undefined)
    
    @scala.inline
    def setInnerContainer(value: HTMLDivElement): Self = this.set("innerContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerContainer: Self = this.set("innerContainer", js.undefined)
    
    @scala.inline
    def setMinuteElement(value: HTMLInputElement): Self = this.set("minuteElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteElement: Self = this.set("minuteElement", js.undefined)
    
    @scala.inline
    def setMobileFormatStr(value: String): Self = this.set("mobileFormatStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileFormatStr: Self = this.set("mobileFormatStr", js.undefined)
    
    @scala.inline
    def setMobileInput(value: HTMLInputElement): Self = this.set("mobileInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileInput: Self = this.set("mobileInput", js.undefined)
    
    @scala.inline
    def setRContainer(value: HTMLDivElement): Self = this.set("rContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRContainer: Self = this.set("rContainer", js.undefined)
    
    @scala.inline
    def setSecondElement(value: HTMLInputElement): Self = this.set("secondElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondElement: Self = this.set("secondElement", js.undefined)
    
    @scala.inline
    def setSelectedDateElem(value: DayElement): Self = this.set("selectedDateElem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedDateElem: Self = this.set("selectedDateElem", js.undefined)
    
    @scala.inline
    def setTimeContainer(value: HTMLDivElement): Self = this.set("timeContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeContainer: Self = this.set("timeContainer", js.undefined)
    
    @scala.inline
    def setTodayDateElem(value: DayElement): Self = this.set("todayDateElem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayDateElem: Self = this.set("todayDateElem", js.undefined)
    
    @scala.inline
    def setWeekNumbers(value: HTMLDivElement): Self = this.set("weekNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekNumbers: Self = this.set("weekNumbers", js.undefined)
    
    @scala.inline
    def setWeekWrapper(value: HTMLDivElement): Self = this.set("weekWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekWrapper: Self = this.set("weekWrapper", js.undefined)
  }
}
