package typings.dockerode.mod

import typings.dockerode.AnonPercpuusage
import typings.dockerode.AnonPeriods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPUStats extends js.Object {
  var cpu_usage: AnonPercpuusage
  var online_cpus: Double
  var system_cpu_usage: Double
  var throttling_data: AnonPeriods
}

object CPUStats {
  @scala.inline
  def apply(
    cpu_usage: AnonPercpuusage,
    online_cpus: Double,
    system_cpu_usage: Double,
    throttling_data: AnonPeriods
  ): CPUStats = {
    val __obj = js.Dynamic.literal(cpu_usage = cpu_usage.asInstanceOf[js.Any], online_cpus = online_cpus.asInstanceOf[js.Any], system_cpu_usage = system_cpu_usage.asInstanceOf[js.Any], throttling_data = throttling_data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CPUStats]
  }
}

