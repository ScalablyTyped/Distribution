package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Periods extends js.Object {
  var periods: Double
  var throttled_periods: Double
  var throttled_time: Double
}

object Anon_Periods {
  @scala.inline
  def apply(periods: Double, throttled_periods: Double, throttled_time: Double): Anon_Periods = {
    val __obj = js.Dynamic.literal(periods = periods, throttled_periods = throttled_periods, throttled_time = throttled_time)
  
    __obj.asInstanceOf[Anon_Periods]
  }
}

