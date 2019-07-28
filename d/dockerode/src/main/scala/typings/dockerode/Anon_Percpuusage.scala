package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Percpuusage extends js.Object {
  var percpu_usage: js.Array[Double]
  var total_usage: Double
  var usage_in_kernelmode: Double
  var usage_in_usermode: Double
}

object Anon_Percpuusage {
  @scala.inline
  def apply(
    percpu_usage: js.Array[Double],
    total_usage: Double,
    usage_in_kernelmode: Double,
    usage_in_usermode: Double
  ): Anon_Percpuusage = {
    val __obj = js.Dynamic.literal(percpu_usage = percpu_usage, total_usage = total_usage, usage_in_kernelmode = usage_in_kernelmode, usage_in_usermode = usage_in_usermode)
  
    __obj.asInstanceOf[Anon_Percpuusage]
  }
}

