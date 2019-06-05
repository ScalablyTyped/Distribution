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
  var time_24hr: scala.Boolean
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
    ordinal: scala.Double => java.lang.String,
    rangeSeparator: java.lang.String,
    scrollTitle: java.lang.String,
    time_24hr: scala.Boolean,
    toggleTitle: java.lang.String,
    weekAbbreviation: java.lang.String,
    weekdays: flatpickrLib.Anon_Longhand,
    yearAriaLabel: java.lang.String
  ): Locale = {
    val __obj = js.Dynamic.literal(amPM = amPM, daysInMonth = daysInMonth, firstDayOfWeek = firstDayOfWeek, months = months, ordinal = js.Any.fromFunction1(ordinal), rangeSeparator = rangeSeparator, scrollTitle = scrollTitle, time_24hr = time_24hr, toggleTitle = toggleTitle, weekAbbreviation = weekAbbreviation, weekdays = weekdays, yearAriaLabel = yearAriaLabel)
  
    __obj.asInstanceOf[Locale]
  }
}

