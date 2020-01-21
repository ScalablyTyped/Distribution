package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPercpuusage extends js.Object {
  var percpu_usage: js.Array[Double]
  var total_usage: Double
  var usage_in_kernelmode: Double
  var usage_in_usermode: Double
}

object AnonPercpuusage {
  @scala.inline
  def apply(
    percpu_usage: js.Array[Double],
    total_usage: Double,
    usage_in_kernelmode: Double,
    usage_in_usermode: Double
  ): AnonPercpuusage = {
    val __obj = js.Dynamic.literal(percpu_usage = percpu_usage.asInstanceOf[js.Any], total_usage = total_usage.asInstanceOf[js.Any], usage_in_kernelmode = usage_in_kernelmode.asInstanceOf[js.Any], usage_in_usermode = usage_in_usermode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPercpuusage]
  }
}

