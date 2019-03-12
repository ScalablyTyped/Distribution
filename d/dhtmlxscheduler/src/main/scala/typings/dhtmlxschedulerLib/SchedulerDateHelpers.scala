package typings
package dhtmlxschedulerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerDateHelpers extends js.Object {
  def add(origin: stdLib.Date, count: scala.Double, unit: java.lang.String): stdLib.Date
  def convert_to_utc(origin: stdLib.Date): stdLib.Date
  def copy(origin: stdLib.Date): stdLib.Date
  def date_part(origin: stdLib.Date): stdLib.Date
  def date_to_str(format: java.lang.String): js.Any
  def day_start(origin: stdLib.Date): stdLib.Date
  def getISOWeek(origin: stdLib.Date): scala.Double
  def getUTCISOWeek(origin: stdLib.Date): scala.Double
  def month_start(origin: stdLib.Date): stdLib.Date
  def str_to_date(format: java.lang.String): js.Any
  def time_part(origin: stdLib.Date): stdLib.Date
  def to_fixed(value: scala.Double): java.lang.String
  def week_start(origin: stdLib.Date): stdLib.Date
  def year_start(origin: stdLib.Date): stdLib.Date
}

object SchedulerDateHelpers {
  @scala.inline
  def apply(
    add: (stdLib.Date, scala.Double, java.lang.String) => stdLib.Date,
    convert_to_utc: stdLib.Date => stdLib.Date,
    copy: stdLib.Date => stdLib.Date,
    date_part: stdLib.Date => stdLib.Date,
    date_to_str: java.lang.String => js.Any,
    day_start: stdLib.Date => stdLib.Date,
    getISOWeek: stdLib.Date => scala.Double,
    getUTCISOWeek: stdLib.Date => scala.Double,
    month_start: stdLib.Date => stdLib.Date,
    str_to_date: java.lang.String => js.Any,
    time_part: stdLib.Date => stdLib.Date,
    to_fixed: scala.Double => java.lang.String,
    week_start: stdLib.Date => stdLib.Date,
    year_start: stdLib.Date => stdLib.Date
  ): SchedulerDateHelpers = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), convert_to_utc = js.Any.fromFunction1(convert_to_utc), copy = js.Any.fromFunction1(copy), date_part = js.Any.fromFunction1(date_part), date_to_str = js.Any.fromFunction1(date_to_str), day_start = js.Any.fromFunction1(day_start), getISOWeek = js.Any.fromFunction1(getISOWeek), getUTCISOWeek = js.Any.fromFunction1(getUTCISOWeek), month_start = js.Any.fromFunction1(month_start), str_to_date = js.Any.fromFunction1(str_to_date), time_part = js.Any.fromFunction1(time_part), to_fixed = js.Any.fromFunction1(to_fixed), week_start = js.Any.fromFunction1(week_start), year_start = js.Any.fromFunction1(year_start))
  
    __obj.asInstanceOf[SchedulerDateHelpers]
  }
}

