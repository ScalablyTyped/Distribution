package typings.dhtmlxscheduler

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerDateHelpers extends js.Object {
  def add(origin: Date, count: Double, unit: String): Date
  def convert_to_utc(origin: Date): Date
  def copy(origin: Date): Date
  def date_part(origin: Date): Date
  def date_to_str(format: String): js.Any
  def day_start(origin: Date): Date
  def getISOWeek(origin: Date): Double
  def getUTCISOWeek(origin: Date): Double
  def month_start(origin: Date): Date
  def str_to_date(format: String): js.Any
  def time_part(origin: Date): Date
  def to_fixed(value: Double): String
  def week_start(origin: Date): Date
  def year_start(origin: Date): Date
}

object SchedulerDateHelpers {
  @scala.inline
  def apply(
    add: (Date, Double, String) => Date,
    convert_to_utc: Date => Date,
    copy: Date => Date,
    date_part: Date => Date,
    date_to_str: String => js.Any,
    day_start: Date => Date,
    getISOWeek: Date => Double,
    getUTCISOWeek: Date => Double,
    month_start: Date => Date,
    str_to_date: String => js.Any,
    time_part: Date => Date,
    to_fixed: Double => String,
    week_start: Date => Date,
    year_start: Date => Date
  ): SchedulerDateHelpers = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), convert_to_utc = js.Any.fromFunction1(convert_to_utc), copy = js.Any.fromFunction1(copy), date_part = js.Any.fromFunction1(date_part), date_to_str = js.Any.fromFunction1(date_to_str), day_start = js.Any.fromFunction1(day_start), getISOWeek = js.Any.fromFunction1(getISOWeek), getUTCISOWeek = js.Any.fromFunction1(getUTCISOWeek), month_start = js.Any.fromFunction1(month_start), str_to_date = js.Any.fromFunction1(str_to_date), time_part = js.Any.fromFunction1(time_part), to_fixed = js.Any.fromFunction1(to_fixed), week_start = js.Any.fromFunction1(week_start), year_start = js.Any.fromFunction1(year_start))
  
    __obj.asInstanceOf[SchedulerDateHelpers]
  }
}

