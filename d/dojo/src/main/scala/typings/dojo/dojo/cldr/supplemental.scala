package typings.dojo.dojo.cldr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/cldr/supplemental.html
  *
  * TODOC
  *
  */
@js.native
trait supplemental extends js.Object {
  /**
    * Returns a zero-based index for first day of the week
    * Returns a zero-based index for first day of the week, as used by the local (Gregorian) calendar.
    * e.g. Sunday (returns 0), or Monday (returns 1)
    *
    * @param locale               Optional
    */
  def getFirstDayOfWeek(): Double = js.native
  def getFirstDayOfWeek(locale: String): Double = js.native
  /**
    * Returns a hash containing the start and end days of the weekend
    * Returns a hash containing the start and end days of the weekend according to local custom using locale,
    * or by default in the user's locale.
    * e.g. {start:6, end:0}
    *
    * @param locale               Optional
    */
  def getWeekend(): js.Object = js.native
  def getWeekend(locale: String): js.Object = js.native
}

