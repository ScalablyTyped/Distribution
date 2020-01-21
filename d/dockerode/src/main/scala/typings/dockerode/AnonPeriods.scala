package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPeriods extends js.Object {
  var periods: Double
  var throttled_periods: Double
  var throttled_time: Double
}

object AnonPeriods {
  @scala.inline
  def apply(periods: Double, throttled_periods: Double, throttled_time: Double): AnonPeriods = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any], throttled_periods = throttled_periods.asInstanceOf[js.Any], throttled_time = throttled_time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPeriods]
  }
}

