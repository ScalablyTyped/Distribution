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

