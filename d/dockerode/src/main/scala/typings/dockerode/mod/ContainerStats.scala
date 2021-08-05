package typings.dockerode.mod

import typings.dockerode.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerStats extends StObject {
  
  var cpu_stats: CPUStats
  
  var memory_stats: MemoryStats
  
  var networks: NetworkStats
  
  var pid_stats: Current
  
  var precpu_stats: CPUStats
  
  var read: String
}
object ContainerStats {
  
  inline def apply(
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
  
  extension [Self <: ContainerStats](x: Self) {
    
    inline def setCpu_stats(value: CPUStats): Self = StObject.set(x, "cpu_stats", value.asInstanceOf[js.Any])
    
    inline def setMemory_stats(value: MemoryStats): Self = StObject.set(x, "memory_stats", value.asInstanceOf[js.Any])
    
    inline def setNetworks(value: NetworkStats): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    inline def setPid_stats(value: Current): Self = StObject.set(x, "pid_stats", value.asInstanceOf[js.Any])
    
    inline def setPrecpu_stats(value: CPUStats): Self = StObject.set(x, "precpu_stats", value.asInstanceOf[js.Any])
    
    inline def setRead(value: String): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
  }
}
