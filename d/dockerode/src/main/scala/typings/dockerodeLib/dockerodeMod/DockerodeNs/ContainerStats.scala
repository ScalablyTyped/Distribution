package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerStats extends js.Object {
  var cpu_stats: CPUStats
  var memory_stats: MemoryStats
  var networks: NetworkStats
  var pid_stats: dockerodeLib.Anon_Current
  var precpu_stats: CPUStats
  var read: java.lang.String
}

object ContainerStats {
  @scala.inline
  def apply(
    cpu_stats: CPUStats,
    memory_stats: MemoryStats,
    networks: NetworkStats,
    pid_stats: dockerodeLib.Anon_Current,
    precpu_stats: CPUStats,
    read: java.lang.String
  ): ContainerStats = {
    val __obj = js.Dynamic.literal(cpu_stats = cpu_stats, memory_stats = memory_stats, networks = networks, pid_stats = pid_stats, precpu_stats = precpu_stats, read = read)
  
    __obj.asInstanceOf[ContainerStats]
  }
}

