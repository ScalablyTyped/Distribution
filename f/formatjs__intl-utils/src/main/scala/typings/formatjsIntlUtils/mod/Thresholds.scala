package typings.formatjsIntlUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'second' | 'minute' | 'hour' | 'day', number> */
@js.native
trait Thresholds extends js.Object {
  var day: Double = js.native
  var hour: Double = js.native
  var minute: Double = js.native
  var second: Double = js.native
}

object Thresholds {
  @scala.inline
  def apply(day: Double, hour: Double, minute: Double, second: Double): Thresholds = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thresholds]
  }
  @scala.inline
  implicit class ThresholdsOps[Self <: Thresholds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinute(value: Double): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecond(value: Double): Self = this.set("second", value.asInstanceOf[js.Any])
  }
  
}

