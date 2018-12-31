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

