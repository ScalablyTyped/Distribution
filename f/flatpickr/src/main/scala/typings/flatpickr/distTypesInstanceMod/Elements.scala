package typings.flatpickr.distTypesInstanceMod

import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.HTMLSpanElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Elements extends js.Object {
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
    yearElements: js.Array[HTMLInputElement],
    altInput: HTMLInputElement = null,
    amPM: HTMLSpanElement = null,
    daysContainer: HTMLDivElement = null,
    hourElement: HTMLInputElement = null,
    innerContainer: HTMLDivElement = null,
    minuteElement: HTMLInputElement = null,
    mobileFormatStr: String = null,
    mobileInput: HTMLInputElement = null,
    rContainer: HTMLDivElement = null,
    secondElement: HTMLInputElement = null,
    selectedDateElem: DayElement = null,
    timeContainer: HTMLDivElement = null,
    todayDateElem: DayElement = null,
    weekNumbers: HTMLDivElement = null,
    weekWrapper: HTMLDivElement = null
  ): Elements = {
    val __obj = js.Dynamic.literal(_hideNextMonthArrow = _hideNextMonthArrow, _hidePrevMonthArrow = _hidePrevMonthArrow, _input = _input, _positionElement = _positionElement, calendarContainer = calendarContainer, currentMonthElement = currentMonthElement, currentYearElement = currentYearElement, days = days, element = element, input = input, monthElements = monthElements, monthNav = monthNav, monthsDropdownContainer = monthsDropdownContainer, nextMonthNav = nextMonthNav, pluginElements = pluginElements, prevMonthNav = prevMonthNav, weekdayContainer = weekdayContainer, yearElements = yearElements)
    if (altInput != null) __obj.updateDynamic("altInput")(altInput)
    if (amPM != null) __obj.updateDynamic("amPM")(amPM)
    if (daysContainer != null) __obj.updateDynamic("daysContainer")(daysContainer)
    if (hourElement != null) __obj.updateDynamic("hourElement")(hourElement)
    if (innerContainer != null) __obj.updateDynamic("innerContainer")(innerContainer)
    if (minuteElement != null) __obj.updateDynamic("minuteElement")(minuteElement)
    if (mobileFormatStr != null) __obj.updateDynamic("mobileFormatStr")(mobileFormatStr)
    if (mobileInput != null) __obj.updateDynamic("mobileInput")(mobileInput)
    if (rContainer != null) __obj.updateDynamic("rContainer")(rContainer)
    if (secondElement != null) __obj.updateDynamic("secondElement")(secondElement)
    if (selectedDateElem != null) __obj.updateDynamic("selectedDateElem")(selectedDateElem)
    if (timeContainer != null) __obj.updateDynamic("timeContainer")(timeContainer)
    if (todayDateElem != null) __obj.updateDynamic("todayDateElem")(todayDateElem)
    if (weekNumbers != null) __obj.updateDynamic("weekNumbers")(weekNumbers)
    if (weekWrapper != null) __obj.updateDynamic("weekWrapper")(weekWrapper)
    __obj.asInstanceOf[Elements]
  }
}

