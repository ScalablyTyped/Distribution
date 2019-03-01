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
    add: js.Function3[stdLib.Date, scala.Double, java.lang.String, stdLib.Date],
    convert_to_utc: js.Function1[stdLib.Date, stdLib.Date],
    copy: js.Function1[stdLib.Date, stdLib.Date],
    date_part: js.Function1[stdLib.Date, stdLib.Date],
    date_to_str: js.Function1[java.lang.String, js.Any],
    day_start: js.Function1[stdLib.Date, stdLib.Date],
    getISOWeek: js.Function1[stdLib.Date, scala.Double],
    getUTCISOWeek: js.Function1[stdLib.Date, scala.Double],
    month_start: js.Function1[stdLib.Date, stdLib.Date],
    str_to_date: js.Function1[java.lang.String, js.Any],
    time_part: js.Function1[stdLib.Date, stdLib.Date],
    to_fixed: js.Function1[scala.Double, java.lang.String],
    week_start: js.Function1[stdLib.Date, stdLib.Date],
    year_start: js.Function1[stdLib.Date, stdLib.Date]
  ): SchedulerDateHelpers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("convert_to_utc")(convert_to_utc)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("date_part")(date_part)
    __obj.updateDynamic("date_to_str")(date_to_str)
    __obj.updateDynamic("day_start")(day_start)
    __obj.updateDynamic("getISOWeek")(getISOWeek)
    __obj.updateDynamic("getUTCISOWeek")(getUTCISOWeek)
    __obj.updateDynamic("month_start")(month_start)
    __obj.updateDynamic("str_to_date")(str_to_date)
    __obj.updateDynamic("time_part")(time_part)
    __obj.updateDynamic("to_fixed")(to_fixed)
    __obj.updateDynamic("week_start")(week_start)
    __obj.updateDynamic("year_start")(year_start)
    __obj.asInstanceOf[SchedulerDateHelpers]
  }
}

