package typings.dockerode.mod

import typings.dockerode.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerStats extends StObject {
  
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
  implicit class ContainerStatsMutableBuilder[Self <: ContainerStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpu_stats(value: CPUStats): Self = StObject.set(x, "cpu_stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemory_stats(value: MemoryStats): Self = StObject.set(x, "memory_stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworks(value: NetworkStats): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid_stats(value: Current): Self = StObject.set(x, "pid_stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecpu_stats(value: CPUStats): Self = StObject.set(x, "precpu_stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: String): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
  }
}
