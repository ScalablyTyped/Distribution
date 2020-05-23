package typings.dockerode.mod

import typings.dockerode.anon.Percpuusage
import typings.dockerode.anon.Periods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPUStats extends js.Object {
  var cpu_usage: Percpuusage
  var online_cpus: Double
  var system_cpu_usage: Double
  var throttling_data: Periods
}

object CPUStats {
  @scala.inline
  def apply(cpu_usage: Percpuusage, online_cpus: Double, system_cpu_usage: Double, throttling_data: Periods): CPUStats = {
    val __obj = js.Dynamic.literal(cpu_usage = cpu_usage.asInstanceOf[js.Any], online_cpus = online_cpus.asInstanceOf[js.Any], system_cpu_usage = system_cpu_usage.asInstanceOf[js.Any], throttling_data = throttling_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUStats]
  }
}

