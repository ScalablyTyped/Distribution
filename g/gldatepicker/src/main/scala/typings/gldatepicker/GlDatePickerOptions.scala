package typings.gldatepicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlDatePickerOptions extends js.Object {
  var allowMonthSelect: js.UndefOr[Boolean] = js.undefined
  var allowYearSelect: js.UndefOr[Boolean] = js.undefined
  var borderSize: js.UndefOr[Double] = js.undefined
  var calendarOffset: js.UndefOr[GlDatePickerOffset] = js.undefined
  var cssName: js.UndefOr[String] = js.undefined
  var dowNames: js.UndefOr[js.Array[String]] = js.undefined
  var dowOffset: js.UndefOr[Double] = js.undefined
  var hideOnClick: js.UndefOr[Boolean] = js.undefined
  var monthNames: js.UndefOr[js.Array[String]] = js.undefined
  var nextArrow: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[
    js.Function4[/* inputElement */ JQuery, /* cell */ JQuery, /* date */ Date, /* data */ js.Any, Unit]
  ] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* calendar */ JQuery, Unit]] = js.undefined
  var onHover: js.UndefOr[
    js.Function4[/* inputElement */ JQuery, /* cell */ JQuery, /* date */ Date, /* data */ js.Any, Unit]
  ] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* calendar */ JQuery, Unit]] = js.undefined
  var prevArrow: js.UndefOr[String] = js.undefined
  var selectableDOW: js.UndefOr[js.Array[Double]] = js.undefined
  var selectableDateRange: js.UndefOr[js.Array[GlDatePickerDateRange]] = js.undefined
  var selectableDates: js.UndefOr[js.Array[GlDatePickerDate]] = js.undefined
  var selectableMonths: js.UndefOr[js.Array[Double]] = js.undefined
  var selectableYears: js.UndefOr[js.Array[Double]] = js.undefined
  var selectedDate: js.UndefOr[Date] = js.undefined
  var showAlways: js.UndefOr[Boolean] = js.undefined
  var specialDates: js.UndefOr[js.Array[GlDatePickerSpecialDate]] = js.undefined
  var todayDate: js.UndefOr[Date] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object GlDatePickerOptions {
  @scala.inline
  def apply(
    allowMonthSelect: js.UndefOr[Boolean] = js.undefined,
    allowYearSelect: js.UndefOr[Boolean] = js.undefined,
    borderSize: js.UndefOr[Double] = js.undefined,
    calendarOffset: GlDatePickerOffset = null,
    cssName: String = null,
    dowNames: js.Array[String] = null,
    dowOffset: js.UndefOr[Double] = js.undefined,
    hideOnClick: js.UndefOr[Boolean] = js.undefined,
    monthNames: js.Array[String] = null,
    nextArrow: String = null,
    onClick: (/* inputElement */ JQuery, /* cell */ JQuery, /* date */ Date, /* data */ js.Any) => Unit = null,
    onHide: /* calendar */ JQuery => Unit = null,
    onHover: (/* inputElement */ JQuery, /* cell */ JQuery, /* date */ Date, /* data */ js.Any) => Unit = null,
    onShow: /* calendar */ JQuery => Unit = null,
    prevArrow: String = null,
    selectableDOW: js.Array[Double] = null,
    selectableDateRange: js.Array[GlDatePickerDateRange] = null,
    selectableDates: js.Array[GlDatePickerDate] = null,
    selectableMonths: js.Array[Double] = null,
    selectableYears: js.Array[Double] = null,
    selectedDate: Date = null,
    showAlways: js.UndefOr[Boolean] = js.undefined,
    specialDates: js.Array[GlDatePickerSpecialDate] = null,
    todayDate: Date = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): GlDatePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMonthSelect)) __obj.updateDynamic("allowMonthSelect")(allowMonthSelect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowYearSelect)) __obj.updateDynamic("allowYearSelect")(allowYearSelect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderSize)) __obj.updateDynamic("borderSize")(borderSize.get.asInstanceOf[js.Any])
    if (calendarOffset != null) __obj.updateDynamic("calendarOffset")(calendarOffset.asInstanceOf[js.Any])
    if (cssName != null) __obj.updateDynamic("cssName")(cssName.asInstanceOf[js.Any])
    if (dowNames != null) __obj.updateDynamic("dowNames")(dowNames.asInstanceOf[js.Any])
    if (!js.isUndefined(dowOffset)) __obj.updateDynamic("dowOffset")(dowOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnClick)) __obj.updateDynamic("hideOnClick")(hideOnClick.get.asInstanceOf[js.Any])
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames.asInstanceOf[js.Any])
    if (nextArrow != null) __obj.updateDynamic("nextArrow")(nextArrow.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction4(onClick))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction4(onHover))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (prevArrow != null) __obj.updateDynamic("prevArrow")(prevArrow.asInstanceOf[js.Any])
    if (selectableDOW != null) __obj.updateDynamic("selectableDOW")(selectableDOW.asInstanceOf[js.Any])
    if (selectableDateRange != null) __obj.updateDynamic("selectableDateRange")(selectableDateRange.asInstanceOf[js.Any])
    if (selectableDates != null) __obj.updateDynamic("selectableDates")(selectableDates.asInstanceOf[js.Any])
    if (selectableMonths != null) __obj.updateDynamic("selectableMonths")(selectableMonths.asInstanceOf[js.Any])
    if (selectableYears != null) __obj.updateDynamic("selectableYears")(selectableYears.asInstanceOf[js.Any])
    if (selectedDate != null) __obj.updateDynamic("selectedDate")(selectedDate.asInstanceOf[js.Any])
    if (!js.isUndefined(showAlways)) __obj.updateDynamic("showAlways")(showAlways.get.asInstanceOf[js.Any])
    if (specialDates != null) __obj.updateDynamic("specialDates")(specialDates.asInstanceOf[js.Any])
    if (todayDate != null) __obj.updateDynamic("todayDate")(todayDate.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlDatePickerOptions]
  }
}

