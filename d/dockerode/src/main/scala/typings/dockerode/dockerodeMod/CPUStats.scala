package typings.dockerode.dockerodeMod

import typings.dockerode.Anon_Percpuusage
import typings.dockerode.Anon_Periods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPUStats extends js.Object {
  var cpu_usage: Anon_Percpuusage
  var online_cpus: Double
  var system_cpu_usage: Double
  var throttling_data: Anon_Periods
}

object CPUStats {
  @scala.inline
  def apply(
    cpu_usage: Anon_Percpuusage,
    online_cpus: Double,
    system_cpu_usage: Double,
    throttling_data: Anon_Periods
  ): CPUStats = {
    val __obj = js.Dynamic.literal(cpu_usage = cpu_usage, online_cpus = online_cpus, system_cpu_usage = system_cpu_usage, throttling_data = throttling_data)
  
    __obj.asInstanceOf[CPUStats]
  }
}

