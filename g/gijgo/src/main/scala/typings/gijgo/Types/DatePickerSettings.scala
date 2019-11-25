package typings.gijgo.Types

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerSettings extends js.Object {
  var calendarWeeks: js.UndefOr[Boolean] = js.undefined
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var disableDates: js.UndefOr[js.Array[_] | js.Function] = js.undefined
  var disableDaysOfWeek: js.UndefOr[js.Array[Double]] = js.undefined
  var footer: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[DatePickerIcons] = js.undefined
  var iconsLibrary: js.UndefOr[String] = js.undefined
  var keyboardNavigation: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var maxDate: js.UndefOr[Date | String | js.Function] = js.undefined
  var minDate: js.UndefOr[Date | String | js.Function] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var select: js.UndefOr[js.Function2[/* e */ js.Any, /* type */ String, _]] = js.undefined
  var selectOtherMonths: js.UndefOr[Boolean] = js.undefined
  var showOnFocus: js.UndefOr[Boolean] = js.undefined
  var showOtherMonths: js.UndefOr[Boolean] = js.undefined
  var showRightIcon: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var uiLibrary: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var weekStartDay: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DatePickerSettings {
  @scala.inline
  def apply(
    calendarWeeks: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ js.Any => _ = null,
    close: /* e */ js.Any => _ = null,
    disableDates: js.Array[_] | js.Function = null,
    disableDaysOfWeek: js.Array[Double] = null,
    footer: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    header: js.UndefOr[Boolean] = js.undefined,
    icons: DatePickerIcons = null,
    iconsLibrary: String = null,
    keyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    maxDate: Date | String | js.Function = null,
    minDate: Date | String | js.Function = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    open: /* e */ js.Any => _ = null,
    select: (/* e */ js.Any, /* type */ String) => _ = null,
    selectOtherMonths: js.UndefOr[Boolean] = js.undefined,
    showOnFocus: js.UndefOr[Boolean] = js.undefined,
    showOtherMonths: js.UndefOr[Boolean] = js.undefined,
    showRightIcon: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    uiLibrary: String = null,
    value: String = null,
    weekStartDay: Int | Double = null,
    width: Int | Double = null
  ): DatePickerSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(calendarWeeks)) __obj.updateDynamic("calendarWeeks")(calendarWeeks.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (disableDates != null) __obj.updateDynamic("disableDates")(disableDates.asInstanceOf[js.Any])
    if (disableDaysOfWeek != null) __obj.updateDynamic("disableDaysOfWeek")(disableDaysOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (iconsLibrary != null) __obj.updateDynamic("iconsLibrary")(iconsLibrary.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardNavigation)) __obj.updateDynamic("keyboardNavigation")(keyboardNavigation.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2(select))
    if (!js.isUndefined(selectOtherMonths)) __obj.updateDynamic("selectOtherMonths")(selectOtherMonths.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnFocus)) __obj.updateDynamic("showOnFocus")(showOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(showOtherMonths)) __obj.updateDynamic("showOtherMonths")(showOtherMonths.asInstanceOf[js.Any])
    if (!js.isUndefined(showRightIcon)) __obj.updateDynamic("showRightIcon")(showRightIcon.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (weekStartDay != null) __obj.updateDynamic("weekStartDay")(weekStartDay.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerSettings]
  }
}

