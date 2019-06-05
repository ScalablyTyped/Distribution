package typings
package flatpickrLib.distTypesInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Elements extends js.Object {
  var _hideNextMonthArrow: scala.Boolean
  var _hidePrevMonthArrow: scala.Boolean
  var _input: stdLib.HTMLInputElement
  var _positionElement: stdLib.HTMLElement
  var altInput: js.UndefOr[stdLib.HTMLInputElement] = js.undefined
  var amPM: js.UndefOr[stdLib.HTMLSpanElement] = js.undefined
  var calendarContainer: stdLib.HTMLDivElement
  var currentMonthElement: stdLib.HTMLSpanElement
  var currentYearElement: stdLib.HTMLInputElement
  var days: stdLib.HTMLDivElement
  var daysContainer: js.UndefOr[stdLib.HTMLDivElement] = js.undefined
  var element: stdLib.HTMLElement
  var hourElement: js.UndefOr[stdLib.HTMLInputElement] = js.undefined
  var innerContainer: js.UndefOr[stdLib.HTMLDivElement] = js.undefined
  var input: stdLib.HTMLInputElement
  var minuteElement: js.UndefOr[stdLib.HTMLInputElement] = js.undefined
  var mobileFormatStr: js.UndefOr[java.lang.String] = js.undefined
  var mobileInput: js.UndefOr[stdLib.HTMLInputElement] = js.undefined
  var monthElements: js.Array[stdLib.HTMLSpanElement]
  var monthNav: stdLib.HTMLDivElement
  var monthsDropdownContainer: stdLib.HTMLSelectElement
  var nextMonthNav: stdLib.HTMLElement
  var pluginElements: js.Array[stdLib.Node]
  var prevMonthNav: stdLib.HTMLElement
  var rContainer: js.UndefOr[stdLib.HTMLDivElement] = js.undefined
  var secondElement: js.UndefOr[stdLib.HTMLInputElement] = js.undefined
  var selectedDateElem: js.UndefOr[DayElement] = js.undefined
  var timeContainer: js.UndefOr[stdLib.HTMLDivElement] = js.undefined
  var todayDateElem: js.UndefOr[DayElement] = js.undefined
  var weekNumbers: js.UndefOr[stdLib.HTMLDivElement] = js.undefined
  var weekWrapper: js.UndefOr[stdLib.HTMLDivElement] = js.undefined
  var weekdayContainer: stdLib.HTMLDivElement
  var yearElements: js.Array[stdLib.HTMLInputElement]
}

object Elements {
  @scala.inline
  def apply(
    _hideNextMonthArrow: scala.Boolean,
    _hidePrevMonthArrow: scala.Boolean,
    _input: stdLib.HTMLInputElement,
    _positionElement: stdLib.HTMLElement,
    calendarContainer: stdLib.HTMLDivElement,
    currentMonthElement: stdLib.HTMLSpanElement,
    currentYearElement: stdLib.HTMLInputElement,
    days: stdLib.HTMLDivElement,
    element: stdLib.HTMLElement,
    input: stdLib.HTMLInputElement,
    monthElements: js.Array[stdLib.HTMLSpanElement],
    monthNav: stdLib.HTMLDivElement,
    monthsDropdownContainer: stdLib.HTMLSelectElement,
    nextMonthNav: stdLib.HTMLElement,
    pluginElements: js.Array[stdLib.Node],
    prevMonthNav: stdLib.HTMLElement,
    weekdayContainer: stdLib.HTMLDivElement,
    yearElements: js.Array[stdLib.HTMLInputElement],
    altInput: stdLib.HTMLInputElement = null,
    amPM: stdLib.HTMLSpanElement = null,
    daysContainer: stdLib.HTMLDivElement = null,
    hourElement: stdLib.HTMLInputElement = null,
    innerContainer: stdLib.HTMLDivElement = null,
    minuteElement: stdLib.HTMLInputElement = null,
    mobileFormatStr: java.lang.String = null,
    mobileInput: stdLib.HTMLInputElement = null,
    rContainer: stdLib.HTMLDivElement = null,
    secondElement: stdLib.HTMLInputElement = null,
    selectedDateElem: DayElement = null,
    timeContainer: stdLib.HTMLDivElement = null,
    todayDateElem: DayElement = null,
    weekNumbers: stdLib.HTMLDivElement = null,
    weekWrapper: stdLib.HTMLDivElement = null
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

