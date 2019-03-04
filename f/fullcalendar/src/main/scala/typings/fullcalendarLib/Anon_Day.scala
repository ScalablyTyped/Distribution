package typings
package fullcalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Day extends js.Object {
  var day: java.lang.String
  var month: java.lang.String
  var next: java.lang.String
  var nextYear: java.lang.String
  var prev: java.lang.String
  var prevYear: java.lang.String
  var today: java.lang.String
  var week: java.lang.String
  var year: java.lang.String
}

object Anon_Day {
  @scala.inline
  def apply(
    day: java.lang.String,
    month: java.lang.String,
    next: java.lang.String,
    nextYear: java.lang.String,
    prev: java.lang.String,
    prevYear: java.lang.String,
    today: java.lang.String,
    week: java.lang.String,
    year: java.lang.String
  ): Anon_Day = {
    val __obj = js.Dynamic.literal(day = day, month = month, next = next, nextYear = nextYear, prev = prev, prevYear = prevYear, today = today, week = week, year = year)
  
    __obj.asInstanceOf[Anon_Day]
  }
}

