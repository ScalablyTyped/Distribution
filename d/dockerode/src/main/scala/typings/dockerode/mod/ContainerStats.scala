package typings.dockerode.mod

import typings.dockerode.AnonCurrent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerStats extends js.Object {
  var cpu_stats: CPUStats
  var memory_stats: MemoryStats
  var networks: NetworkStats
  var pid_stats: AnonCurrent
  var precpu_stats: CPUStats
  var read: String
}

object ContainerStats {
  @scala.inline
  def apply(
    cpu_stats: CPUStats,
    memory_stats: MemoryStats,
    networks: NetworkStats,
    pid_stats: AnonCurrent,
    precpu_stats: CPUStats,
    read: String
  ): ContainerStats = {
    val __obj = js.Dynamic.literal(cpu_stats = cpu_stats.asInstanceOf[js.Any], memory_stats = memory_stats.asInstanceOf[js.Any], networks = networks.asInstanceOf[js.Any], pid_stats = pid_stats.asInstanceOf[js.Any], precpu_stats = precpu_stats.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStats]
  }
}

