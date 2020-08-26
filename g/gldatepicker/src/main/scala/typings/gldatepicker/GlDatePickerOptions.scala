package typings.gldatepicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlDatePickerOptions extends js.Object {
  var allowMonthSelect: js.UndefOr[Boolean] = js.native
  var allowYearSelect: js.UndefOr[Boolean] = js.native
  var borderSize: js.UndefOr[Double] = js.native
  var calendarOffset: js.UndefOr[GlDatePickerOffset] = js.native
  var cssName: js.UndefOr[String] = js.native
  var dowNames: js.UndefOr[js.Array[String]] = js.native
  var dowOffset: js.UndefOr[Double] = js.native
  var hideOnClick: js.UndefOr[Boolean] = js.native
  var monthNames: js.UndefOr[js.Array[String]] = js.native
  var nextArrow: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[
    js.Function4[/* inputElement */ JQuery, /* cell */ JQuery, /* date */ Date, /* data */ js.Any, Unit]
  ] = js.native
  var onHide: js.UndefOr[js.Function1[/* calendar */ JQuery, Unit]] = js.native
  var onHover: js.UndefOr[
    js.Function4[/* inputElement */ JQuery, /* cell */ JQuery, /* date */ Date, /* data */ js.Any, Unit]
  ] = js.native
  var onShow: js.UndefOr[js.Function1[/* calendar */ JQuery, Unit]] = js.native
  var prevArrow: js.UndefOr[String] = js.native
  var selectableDOW: js.UndefOr[js.Array[Double]] = js.native
  var selectableDateRange: js.UndefOr[js.Array[GlDatePickerDateRange]] = js.native
  var selectableDates: js.UndefOr[js.Array[GlDatePickerDate]] = js.native
  var selectableMonths: js.UndefOr[js.Array[Double]] = js.native
  var selectableYears: js.UndefOr[js.Array[Double]] = js.native
  var selectedDate: js.UndefOr[Date] = js.native
  var showAlways: js.UndefOr[Boolean] = js.native
  var specialDates: js.UndefOr[js.Array[GlDatePickerSpecialDate]] = js.native
  var todayDate: js.UndefOr[Date] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object GlDatePickerOptions {
  @scala.inline
  def apply(): GlDatePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlDatePickerOptions]
  }
  @scala.inline
  implicit class GlDatePickerOptionsOps[Self <: GlDatePickerOptions] (val x: Self) extends AnyVal {
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
    def setAllowMonthSelect(value: Boolean): Self = this.set("allowMonthSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMonthSelect: Self = this.set("allowMonthSelect", js.undefined)
    @scala.inline
    def setAllowYearSelect(value: Boolean): Self = this.set("allowYearSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowYearSelect: Self = this.set("allowYearSelect", js.undefined)
    @scala.inline
    def setBorderSize(value: Double): Self = this.set("borderSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderSize: Self = this.set("borderSize", js.undefined)
    @scala.inline
    def setCalendarOffset(value: GlDatePickerOffset): Self = this.set("calendarOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarOffset: Self = this.set("calendarOffset", js.undefined)
    @scala.inline
    def setCssName(value: String): Self = this.set("cssName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssName: Self = this.set("cssName", js.undefined)
    @scala.inline
    def setDowNamesVarargs(value: String*): Self = this.set("dowNames", js.Array(value :_*))
    @scala.inline
    def setDowNames(value: js.Array[String]): Self = this.set("dowNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDowNames: Self = this.set("dowNames", js.undefined)
    @scala.inline
    def setDowOffset(value: Double): Self = this.set("dowOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDowOffset: Self = this.set("dowOffset", js.undefined)
    @scala.inline
    def setHideOnClick(value: Boolean): Self = this.set("hideOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideOnClick: Self = this.set("hideOnClick", js.undefined)
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = this.set("monthNames", js.Array(value :_*))
    @scala.inline
    def setMonthNames(value: js.Array[String]): Self = this.set("monthNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthNames: Self = this.set("monthNames", js.undefined)
    @scala.inline
    def setNextArrow(value: String): Self = this.set("nextArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextArrow: Self = this.set("nextArrow", js.undefined)
    @scala.inline
    def setOnClick(value: (/* inputElement */ JQuery, /* cell */ JQuery, /* date */ Date, /* data */ js.Any) => Unit): Self = this.set("onClick", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnHide(value: /* calendar */ JQuery => Unit): Self = this.set("onHide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnHover(value: (/* inputElement */ JQuery, /* cell */ JQuery, /* date */ Date, /* data */ js.Any) => Unit): Self = this.set("onHover", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnHover: Self = this.set("onHover", js.undefined)
    @scala.inline
    def setOnShow(value: /* calendar */ JQuery => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setPrevArrow(value: String): Self = this.set("prevArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevArrow: Self = this.set("prevArrow", js.undefined)
    @scala.inline
    def setSelectableDOWVarargs(value: Double*): Self = this.set("selectableDOW", js.Array(value :_*))
    @scala.inline
    def setSelectableDOW(value: js.Array[Double]): Self = this.set("selectableDOW", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectableDOW: Self = this.set("selectableDOW", js.undefined)
    @scala.inline
    def setSelectableDateRangeVarargs(value: GlDatePickerDateRange*): Self = this.set("selectableDateRange", js.Array(value :_*))
    @scala.inline
    def setSelectableDateRange(value: js.Array[GlDatePickerDateRange]): Self = this.set("selectableDateRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectableDateRange: Self = this.set("selectableDateRange", js.undefined)
    @scala.inline
    def setSelectableDatesVarargs(value: GlDatePickerDate*): Self = this.set("selectableDates", js.Array(value :_*))
    @scala.inline
    def setSelectableDates(value: js.Array[GlDatePickerDate]): Self = this.set("selectableDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectableDates: Self = this.set("selectableDates", js.undefined)
    @scala.inline
    def setSelectableMonthsVarargs(value: Double*): Self = this.set("selectableMonths", js.Array(value :_*))
    @scala.inline
    def setSelectableMonths(value: js.Array[Double]): Self = this.set("selectableMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectableMonths: Self = this.set("selectableMonths", js.undefined)
    @scala.inline
    def setSelectableYearsVarargs(value: Double*): Self = this.set("selectableYears", js.Array(value :_*))
    @scala.inline
    def setSelectableYears(value: js.Array[Double]): Self = this.set("selectableYears", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectableYears: Self = this.set("selectableYears", js.undefined)
    @scala.inline
    def setSelectedDate(value: Date): Self = this.set("selectedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedDate: Self = this.set("selectedDate", js.undefined)
    @scala.inline
    def setShowAlways(value: Boolean): Self = this.set("showAlways", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAlways: Self = this.set("showAlways", js.undefined)
    @scala.inline
    def setSpecialDatesVarargs(value: GlDatePickerSpecialDate*): Self = this.set("specialDates", js.Array(value :_*))
    @scala.inline
    def setSpecialDates(value: js.Array[GlDatePickerSpecialDate]): Self = this.set("specialDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecialDates: Self = this.set("specialDates", js.undefined)
    @scala.inline
    def setTodayDate(value: Date): Self = this.set("todayDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTodayDate: Self = this.set("todayDate", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

