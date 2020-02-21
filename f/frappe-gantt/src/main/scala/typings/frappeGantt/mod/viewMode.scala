package typings.frappeGantt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.frappeGantt.frappeGanttStrings.`Quarter Day`
  - typings.frappeGantt.frappeGanttStrings.`Half Day`
  - typings.frappeGantt.frappeGanttStrings.Day
  - typings.frappeGantt.frappeGanttStrings.Week
  - typings.frappeGantt.frappeGanttStrings.Month
*/
trait viewMode extends js.Object

object viewMode {
  @scala.inline
  def Day: typings.frappeGantt.frappeGanttStrings.Day = this.cast("Day")
  @scala.inline
  def `Half Day`: typings.frappeGantt.frappeGanttStrings.`Half Day` = this.cast("Half Day")
  @scala.inline
  def Month: typings.frappeGantt.frappeGanttStrings.Month = this.cast("Month")
  @scala.inline
  def `Quarter Day`: typings.frappeGantt.frappeGanttStrings.`Quarter Day` = this.cast("Quarter Day")
  @scala.inline
  def Week: typings.frappeGantt.frappeGanttStrings.Week = this.cast("Week")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

