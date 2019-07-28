package typings.flatpickr.distTypesLocaleMod

import typings.flatpickr.Anon_Longhand
import typings.flatpickr.Anon_LonghandShorthand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLocale extends js.Object {
  var amPM: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var daysInMonth: js.UndefOr[
    js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
  ] = js.undefined
  var firstDayOfWeek: js.UndefOr[Double] = js.undefined
  var hourAriaLabel: js.UndefOr[String] = js.undefined
  var minuteAriaLabel: js.UndefOr[String] = js.undefined
  var months: Anon_LonghandShorthand
  var ordinal: js.UndefOr[js.Function1[/* nth */ Double, String]] = js.undefined
  var rangeSeparator: js.UndefOr[String] = js.undefined
  var scrollTitle: js.UndefOr[String] = js.undefined
  var time_24hr: js.UndefOr[Boolean] = js.undefined
  var toggleTitle: js.UndefOr[String] = js.undefined
  var weekAbbreviation: js.UndefOr[String] = js.undefined
  var weekdays: Anon_Longhand
  var yearAriaLabel: js.UndefOr[String] = js.undefined
}

object CustomLocale {
  @scala.inline
  def apply(
    months: Anon_LonghandShorthand,
    weekdays: Anon_Longhand,
    amPM: js.Tuple2[String, String] = null,
    daysInMonth: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double] = null,
    firstDayOfWeek: Int | Double = null,
    hourAriaLabel: String = null,
    minuteAriaLabel: String = null,
    ordinal: /* nth */ Double => String = null,
    rangeSeparator: String = null,
    scrollTitle: String = null,
    time_24hr: js.UndefOr[Boolean] = js.undefined,
    toggleTitle: String = null,
    weekAbbreviation: String = null,
    yearAriaLabel: String = null
  ): CustomLocale = {
    val __obj = js.Dynamic.literal(months = months, weekdays = weekdays)
    if (amPM != null) __obj.updateDynamic("amPM")(amPM)
    if (daysInMonth != null) __obj.updateDynamic("daysInMonth")(daysInMonth)
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (hourAriaLabel != null) __obj.updateDynamic("hourAriaLabel")(hourAriaLabel)
    if (minuteAriaLabel != null) __obj.updateDynamic("minuteAriaLabel")(minuteAriaLabel)
    if (ordinal != null) __obj.updateDynamic("ordinal")(js.Any.fromFunction1(ordinal))
    if (rangeSeparator != null) __obj.updateDynamic("rangeSeparator")(rangeSeparator)
    if (scrollTitle != null) __obj.updateDynamic("scrollTitle")(scrollTitle)
    if (!js.isUndefined(time_24hr)) __obj.updateDynamic("time_24hr")(time_24hr)
    if (toggleTitle != null) __obj.updateDynamic("toggleTitle")(toggleTitle)
    if (weekAbbreviation != null) __obj.updateDynamic("weekAbbreviation")(weekAbbreviation)
    if (yearAriaLabel != null) __obj.updateDynamic("yearAriaLabel")(yearAriaLabel)
    __obj.asInstanceOf[CustomLocale]
  }
}

