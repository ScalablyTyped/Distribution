package typings
package flatpickrLib.distTypesLocaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLocale extends js.Object {
  var amPM: js.UndefOr[js.Tuple2[java.lang.String, java.lang.String]] = js.undefined
  var daysInMonth: js.UndefOr[
    js.Tuple12[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double
    ]
  ] = js.undefined
  var firstDayOfWeek: js.UndefOr[scala.Double] = js.undefined
  var hourAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  var minuteAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  var months: flatpickrLib.Anon_LonghandShorthand
  var ordinal: js.UndefOr[js.Function1[/* nth */ scala.Double, java.lang.String]] = js.undefined
  var rangeSeparator: js.UndefOr[java.lang.String] = js.undefined
  var scrollTitle: js.UndefOr[java.lang.String] = js.undefined
  var time_24hr: js.UndefOr[scala.Boolean] = js.undefined
  var toggleTitle: js.UndefOr[java.lang.String] = js.undefined
  var weekAbbreviation: js.UndefOr[java.lang.String] = js.undefined
  var weekdays: flatpickrLib.Anon_Longhand
  var yearAriaLabel: js.UndefOr[java.lang.String] = js.undefined
}

object CustomLocale {
  @scala.inline
  def apply(
    months: flatpickrLib.Anon_LonghandShorthand,
    weekdays: flatpickrLib.Anon_Longhand,
    amPM: js.Tuple2[java.lang.String, java.lang.String] = null,
    daysInMonth: js.Tuple12[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double
    ] = null,
    firstDayOfWeek: scala.Int | scala.Double = null,
    hourAriaLabel: java.lang.String = null,
    minuteAriaLabel: java.lang.String = null,
    ordinal: /* nth */ scala.Double => java.lang.String = null,
    rangeSeparator: java.lang.String = null,
    scrollTitle: java.lang.String = null,
    time_24hr: js.UndefOr[scala.Boolean] = js.undefined,
    toggleTitle: java.lang.String = null,
    weekAbbreviation: java.lang.String = null,
    yearAriaLabel: java.lang.String = null
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

