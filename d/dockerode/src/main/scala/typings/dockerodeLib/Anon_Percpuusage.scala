package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Percpuusage extends js.Object {
  var percpu_usage: js.Array[scala.Double]
  var total_usage: scala.Double
  var usage_in_kernelmode: scala.Double
  var usage_in_usermode: scala.Double
}

object Anon_Percpuusage {
  @scala.inline
  def apply(
    percpu_usage: js.Array[scala.Double],
    total_usage: scala.Double,
    usage_in_kernelmode: scala.Double,
    usage_in_usermode: scala.Double
  ): Anon_Percpuusage = {
    val __obj = js.Dynamic.literal(percpu_usage = percpu_usage, total_usage = total_usage, usage_in_kernelmode = usage_in_kernelmode, usage_in_usermode = usage_in_usermode)
  
    __obj.asInstanceOf[Anon_Percpuusage]
  }
}

