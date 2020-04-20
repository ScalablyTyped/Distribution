package typings.dhtmlxscheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerLocaleDate extends js.Object {
  var day_full: js.Array[String]
  var day_short: js.Array[String]
  var month_full: js.Array[String]
  var month_short: js.Array[String]
}

object SchedulerLocaleDate {
  @scala.inline
  def apply(
    day_full: js.Array[String],
    day_short: js.Array[String],
    month_full: js.Array[String],
    month_short: js.Array[String]
  ): SchedulerLocaleDate = {
    val __obj = js.Dynamic.literal(day_full = day_full.asInstanceOf[js.Any], day_short = day_short.asInstanceOf[js.Any], month_full = month_full.asInstanceOf[js.Any], month_short = month_short.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerLocaleDate]
  }
}

