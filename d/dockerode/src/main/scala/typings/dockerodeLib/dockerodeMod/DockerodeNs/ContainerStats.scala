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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cpu_stats")(cpu_stats)
    __obj.updateDynamic("memory_stats")(memory_stats)
    __obj.updateDynamic("networks")(networks)
    __obj.updateDynamic("pid_stats")(pid_stats)
    __obj.updateDynamic("precpu_stats")(precpu_stats)
    __obj.updateDynamic("read")(read)
    __obj.asInstanceOf[ContainerStats]
  }
}

