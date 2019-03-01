package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerSettings extends js.Object {
  var calendarWeeks: js.UndefOr[scala.Boolean] = js.undefined
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var disableDates: js.UndefOr[js.Array[_] | js.Function] = js.undefined
  var disableDaysOfWeek: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var footer: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var header: js.UndefOr[scala.Boolean] = js.undefined
  var icons: js.UndefOr[DatePickerIcons] = js.undefined
  var iconsLibrary: js.UndefOr[java.lang.String] = js.undefined
  var keyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var maxDate: js.UndefOr[stdLib.Date | java.lang.String | js.Function] = js.undefined
  var minDate: js.UndefOr[stdLib.Date | java.lang.String | js.Function] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var select: js.UndefOr[js.Function2[/* e */ js.Any, /* type */ java.lang.String, _]] = js.undefined
  var selectOtherMonths: js.UndefOr[scala.Boolean] = js.undefined
  var showOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  var showOtherMonths: js.UndefOr[scala.Boolean] = js.undefined
  var showRightIcon: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var uiLibrary: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  var weekStartDay: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object DatePickerSettings {
  @scala.inline
  def apply(
    calendarWeeks: js.UndefOr[scala.Boolean] = js.undefined,
    change: js.Function1[/* e */ js.Any, _] = null,
    close: js.Function1[/* e */ js.Any, _] = null,
    disableDates: js.Array[_] | js.Function = null,
    disableDaysOfWeek: js.Array[scala.Double] = null,
    footer: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    header: js.UndefOr[scala.Boolean] = js.undefined,
    icons: DatePickerIcons = null,
    iconsLibrary: java.lang.String = null,
    keyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    locale: java.lang.String = null,
    maxDate: stdLib.Date | java.lang.String | js.Function = null,
    minDate: stdLib.Date | java.lang.String | js.Function = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    open: js.Function1[/* e */ js.Any, _] = null,
    select: js.Function2[/* e */ js.Any, /* type */ java.lang.String, _] = null,
    selectOtherMonths: js.UndefOr[scala.Boolean] = js.undefined,
    showOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    showOtherMonths: js.UndefOr[scala.Boolean] = js.undefined,
    showRightIcon: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null,
    uiLibrary: java.lang.String = null,
    value: java.lang.String = null,
    weekStartDay: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): DatePickerSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(calendarWeeks)) __obj.updateDynamic("calendarWeeks")(calendarWeeks)
    if (change != null) __obj.updateDynamic("change")(change)
    if (close != null) __obj.updateDynamic("close")(close)
    if (disableDates != null) __obj.updateDynamic("disableDates")(disableDates.asInstanceOf[js.Any])
    if (disableDaysOfWeek != null) __obj.updateDynamic("disableDaysOfWeek")(disableDaysOfWeek)
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (iconsLibrary != null) __obj.updateDynamic("iconsLibrary")(iconsLibrary)
    if (!js.isUndefined(keyboardNavigation)) __obj.updateDynamic("keyboardNavigation")(keyboardNavigation)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (open != null) __obj.updateDynamic("open")(open)
    if (select != null) __obj.updateDynamic("select")(select)
    if (!js.isUndefined(selectOtherMonths)) __obj.updateDynamic("selectOtherMonths")(selectOtherMonths)
    if (!js.isUndefined(showOnFocus)) __obj.updateDynamic("showOnFocus")(showOnFocus)
    if (!js.isUndefined(showOtherMonths)) __obj.updateDynamic("showOtherMonths")(showOtherMonths)
    if (!js.isUndefined(showRightIcon)) __obj.updateDynamic("showRightIcon")(showRightIcon)
    if (size != null) __obj.updateDynamic("size")(size)
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary)
    if (value != null) __obj.updateDynamic("value")(value)
    if (weekStartDay != null) __obj.updateDynamic("weekStartDay")(weekStartDay.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerSettings]
  }
}

