package typings
package gldatepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlDatePickerOptions extends js.Object {
  var allowMonthSelect: js.UndefOr[scala.Boolean] = js.undefined
  var allowYearSelect: js.UndefOr[scala.Boolean] = js.undefined
  var borderSize: js.UndefOr[scala.Double] = js.undefined
  var calendarOffset: js.UndefOr[GlDatePickerOffset] = js.undefined
  var cssName: js.UndefOr[java.lang.String] = js.undefined
  var dowNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var dowOffset: js.UndefOr[scala.Double] = js.undefined
  var hideOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var monthNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var nextArrow: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[
    js.Function4[
      /* inputElement */ JQuery, 
      /* cell */ JQuery, 
      /* date */ stdLib.Date, 
      /* data */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* calendar */ JQuery, scala.Unit]] = js.undefined
  var onHover: js.UndefOr[
    js.Function4[
      /* inputElement */ JQuery, 
      /* cell */ JQuery, 
      /* date */ stdLib.Date, 
      /* data */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* calendar */ JQuery, scala.Unit]] = js.undefined
  var prevArrow: js.UndefOr[java.lang.String] = js.undefined
  var selectableDOW: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var selectableDateRange: js.UndefOr[js.Array[GlDatePickerDateRange]] = js.undefined
  var selectableDates: js.UndefOr[js.Array[GlDatePickerDate]] = js.undefined
  var selectableMonths: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var selectableYears: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var selectedDate: js.UndefOr[stdLib.Date] = js.undefined
  var showAlways: js.UndefOr[scala.Boolean] = js.undefined
  var specialDates: js.UndefOr[js.Array[GlDatePickerSpecialDate]] = js.undefined
  var todayDate: js.UndefOr[stdLib.Date] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object GlDatePickerOptions {
  @scala.inline
  def apply(
    allowMonthSelect: js.UndefOr[scala.Boolean] = js.undefined,
    allowYearSelect: js.UndefOr[scala.Boolean] = js.undefined,
    borderSize: scala.Int | scala.Double = null,
    calendarOffset: GlDatePickerOffset = null,
    cssName: java.lang.String = null,
    dowNames: js.Array[java.lang.String] = null,
    dowOffset: scala.Int | scala.Double = null,
    hideOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    monthNames: js.Array[java.lang.String] = null,
    nextArrow: java.lang.String = null,
    onClick: js.Function4[
      /* inputElement */ JQuery, 
      /* cell */ JQuery, 
      /* date */ stdLib.Date, 
      /* data */ js.Any, 
      scala.Unit
    ] = null,
    onHide: js.Function1[/* calendar */ JQuery, scala.Unit] = null,
    onHover: js.Function4[
      /* inputElement */ JQuery, 
      /* cell */ JQuery, 
      /* date */ stdLib.Date, 
      /* data */ js.Any, 
      scala.Unit
    ] = null,
    onShow: js.Function1[/* calendar */ JQuery, scala.Unit] = null,
    prevArrow: java.lang.String = null,
    selectableDOW: js.Array[scala.Double] = null,
    selectableDateRange: js.Array[GlDatePickerDateRange] = null,
    selectableDates: js.Array[GlDatePickerDate] = null,
    selectableMonths: js.Array[scala.Double] = null,
    selectableYears: js.Array[scala.Double] = null,
    selectedDate: stdLib.Date = null,
    showAlways: js.UndefOr[scala.Boolean] = js.undefined,
    specialDates: js.Array[GlDatePickerSpecialDate] = null,
    todayDate: stdLib.Date = null,
    zIndex: scala.Int | scala.Double = null
  ): GlDatePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMonthSelect)) __obj.updateDynamic("allowMonthSelect")(allowMonthSelect)
    if (!js.isUndefined(allowYearSelect)) __obj.updateDynamic("allowYearSelect")(allowYearSelect)
    if (borderSize != null) __obj.updateDynamic("borderSize")(borderSize.asInstanceOf[js.Any])
    if (calendarOffset != null) __obj.updateDynamic("calendarOffset")(calendarOffset)
    if (cssName != null) __obj.updateDynamic("cssName")(cssName)
    if (dowNames != null) __obj.updateDynamic("dowNames")(dowNames)
    if (dowOffset != null) __obj.updateDynamic("dowOffset")(dowOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnClick)) __obj.updateDynamic("hideOnClick")(hideOnClick)
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames)
    if (nextArrow != null) __obj.updateDynamic("nextArrow")(nextArrow)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onHover != null) __obj.updateDynamic("onHover")(onHover)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (prevArrow != null) __obj.updateDynamic("prevArrow")(prevArrow)
    if (selectableDOW != null) __obj.updateDynamic("selectableDOW")(selectableDOW)
    if (selectableDateRange != null) __obj.updateDynamic("selectableDateRange")(selectableDateRange)
    if (selectableDates != null) __obj.updateDynamic("selectableDates")(selectableDates)
    if (selectableMonths != null) __obj.updateDynamic("selectableMonths")(selectableMonths)
    if (selectableYears != null) __obj.updateDynamic("selectableYears")(selectableYears)
    if (selectedDate != null) __obj.updateDynamic("selectedDate")(selectedDate)
    if (!js.isUndefined(showAlways)) __obj.updateDynamic("showAlways")(showAlways)
    if (specialDates != null) __obj.updateDynamic("specialDates")(specialDates)
    if (todayDate != null) __obj.updateDynamic("todayDate")(todayDate)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlDatePickerOptions]
  }
}

