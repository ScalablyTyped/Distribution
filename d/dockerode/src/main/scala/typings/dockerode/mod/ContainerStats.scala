package typings.dockerode.mod

import typings.dockerode.anon.Current
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerStats extends js.Object {
  var cpu_stats: CPUStats = js.native
  var memory_stats: MemoryStats = js.native
  var networks: NetworkStats = js.native
  var pid_stats: Current = js.native
  var precpu_stats: CPUStats = js.native
  var read: String = js.native
}

object ContainerStats {
  @scala.inline
  def apply(
    cpu_stats: CPUStats,
    memory_stats: MemoryStats,
    networks: NetworkStats,
    pid_stats: Current,
    precpu_stats: CPUStats,
    read: String
  ): ContainerStats = {
    val __obj = js.Dynamic.literal(cpu_stats = cpu_stats.asInstanceOf[js.Any], memory_stats = memory_stats.asInstanceOf[js.Any], networks = networks.asInstanceOf[js.Any], pid_stats = pid_stats.asInstanceOf[js.Any], precpu_stats = precpu_stats.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStats]
  }
  @scala.inline
  implicit class ContainerStatsOps[Self <: ContainerStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCpu_stats(value: CPUStats): Self = this.set("cpu_stats", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemory_stats(value: MemoryStats): Self = this.set("memory_stats", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworks(value: NetworkStats): Self = this.set("networks", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid_stats(value: Current): Self = this.set("pid_stats", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrecpu_stats(value: CPUStats): Self = this.set("precpu_stats", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: String): Self = this.set("read", value.asInstanceOf[js.Any])
  }
  
}

