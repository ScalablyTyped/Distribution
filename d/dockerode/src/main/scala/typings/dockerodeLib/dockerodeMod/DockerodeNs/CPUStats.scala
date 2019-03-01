package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPUStats extends js.Object {
  var cpu_usage: dockerodeLib.Anon_Percpuusage
  var online_cpus: scala.Double
  var system_cpu_usage: scala.Double
  var throttling_data: dockerodeLib.Anon_Periods
}

object CPUStats {
  @scala.inline
  def apply(
    cpu_usage: dockerodeLib.Anon_Percpuusage,
    online_cpus: scala.Double,
    system_cpu_usage: scala.Double,
    throttling_data: dockerodeLib.Anon_Periods
  ): CPUStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cpu_usage")(cpu_usage)
    __obj.updateDynamic("online_cpus")(online_cpus)
    __obj.updateDynamic("system_cpu_usage")(system_cpu_usage)
    __obj.updateDynamic("throttling_data")(throttling_data)
    __obj.asInstanceOf[CPUStats]
  }
}

