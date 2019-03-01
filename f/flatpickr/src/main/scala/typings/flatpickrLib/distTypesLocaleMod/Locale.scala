package typings
package flatpickrLib.distTypesLocaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var amPM: js.Tuple2[java.lang.String, java.lang.String]
  var daysInMonth: js.Tuple12[
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
  var firstDayOfWeek: scala.Double
  var months: flatpickrLib.Anon_LonghandShorthand
  var rangeSeparator: java.lang.String
  var scrollTitle: java.lang.String
  var toggleTitle: java.lang.String
  var weekAbbreviation: java.lang.String
  var weekdays: flatpickrLib.Anon_Longhand
  var yearAriaLabel: java.lang.String
  def ordinal(nth: scala.Double): java.lang.String
}

object Locale {
  @scala.inline
  def apply(
    amPM: js.Tuple2[java.lang.String, java.lang.String],
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
    ],
    firstDayOfWeek: scala.Double,
    months: flatpickrLib.Anon_LonghandShorthand,
    ordinal: js.Function1[scala.Double, java.lang.String],
    rangeSeparator: java.lang.String,
    scrollTitle: java.lang.String,
    toggleTitle: java.lang.String,
    weekAbbreviation: java.lang.String,
    weekdays: flatpickrLib.Anon_Longhand,
    yearAriaLabel: java.lang.String
  ): Locale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amPM")(amPM)
    __obj.updateDynamic("daysInMonth")(daysInMonth)
    __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek)
    __obj.updateDynamic("months")(months)
    __obj.updateDynamic("ordinal")(ordinal)
    __obj.updateDynamic("rangeSeparator")(rangeSeparator)
    __obj.updateDynamic("scrollTitle")(scrollTitle)
    __obj.updateDynamic("toggleTitle")(toggleTitle)
    __obj.updateDynamic("weekAbbreviation")(weekAbbreviation)
    __obj.updateDynamic("weekdays")(weekdays)
    __obj.updateDynamic("yearAriaLabel")(yearAriaLabel)
    __obj.asInstanceOf[Locale]
  }
}

