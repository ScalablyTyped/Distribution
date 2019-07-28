package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Day extends js.Object {
  var day: String
  var month: String
  var next: String
  var nextYear: String
  var prev: String
  var prevYear: String
  var today: String
  var week: String
  var year: String
}

object Anon_Day {
  @scala.inline
  def apply(
    day: String,
    month: String,
    next: String,
    nextYear: String,
    prev: String,
    prevYear: String,
    today: String,
    week: String,
    year: String
  ): Anon_Day = {
    val __obj = js.Dynamic.literal(day = day, month = month, next = next, nextYear = nextYear, prev = prev, prevYear = prevYear, today = today, week = week, year = year)
  
    __obj.asInstanceOf[Anon_Day]
  }
}

