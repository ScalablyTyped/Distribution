package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Periods extends js.Object {
  var periods: Double
  var throttled_periods: Double
  var throttled_time: Double
}

object Periods {
  @scala.inline
  def apply(periods: Double, throttled_periods: Double, throttled_time: Double): Periods = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any], throttled_periods = throttled_periods.asInstanceOf[js.Any], throttled_time = throttled_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Periods]
  }
}

