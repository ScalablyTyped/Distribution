package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Periods extends js.Object {
  var periods: Double = js.native
  var throttled_periods: Double = js.native
  var throttled_time: Double = js.native
}

object Periods {
  @scala.inline
  def apply(periods: Double, throttled_periods: Double, throttled_time: Double): Periods = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any], throttled_periods = throttled_periods.asInstanceOf[js.Any], throttled_time = throttled_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Periods]
  }
  @scala.inline
  implicit class PeriodsOps[Self <: Periods] (val x: Self) extends AnyVal {
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
    def setPeriods(value: Double): Self = this.set("periods", value.asInstanceOf[js.Any])
    @scala.inline
    def setThrottled_periods(value: Double): Self = this.set("throttled_periods", value.asInstanceOf[js.Any])
    @scala.inline
    def setThrottled_time(value: Double): Self = this.set("throttled_time", value.asInstanceOf[js.Any])
  }
  
}

