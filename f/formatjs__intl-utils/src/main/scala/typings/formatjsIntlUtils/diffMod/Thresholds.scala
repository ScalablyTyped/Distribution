package typings.formatjsIntlUtils.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'second' | 'minute' | 'hour' | 'day', number> */
trait Thresholds extends js.Object {
  var day: Double
  var hour: Double
  var minute: Double
  var second: Double
}

object Thresholds {
  @scala.inline
  def apply(day: Double, hour: Double, minute: Double, second: Double): Thresholds = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thresholds]
  }
}

