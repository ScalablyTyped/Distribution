package typings
package dhtmlxganttLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GanttDateHelpers extends js.Object {
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

