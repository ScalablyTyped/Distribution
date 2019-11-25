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
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextYear = nextYear.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], prevYear = prevYear.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Day]
  }
}

