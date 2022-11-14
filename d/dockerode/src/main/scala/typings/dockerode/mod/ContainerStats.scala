package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerStats extends StObject {
  
  var blkio_stats: js.UndefOr[BlkioStats] = js.undefined
  
  var cpu_stats: CPUStats
  
  var memory_stats: MemoryStats
  
  var networks: NetworkStats
  
  var num_procs: Double
  
  var pids_stats: js.UndefOr[PidsStats] = js.undefined
  
  var precpu_stats: CPUStats
  
  var preread: String
  
  var read: String
  
  var storage_stats: js.UndefOr[StorageStats] = js.undefined
}
object ContainerStats {
  
  inline def apply(
    cpu_stats: CPUStats,
    memory_stats: MemoryStats,
    networks: NetworkStats,
    num_procs: Double,
    precpu_stats: CPUStats,
    preread: String,
    read: String
  ): ContainerStats = {
    val __obj = js.Dynamic.literal(cpu_stats = cpu_stats.asInstanceOf[js.Any], memory_stats = memory_stats.asInstanceOf[js.Any], networks = networks.asInstanceOf[js.Any], num_procs = num_procs.asInstanceOf[js.Any], precpu_stats = precpu_stats.asInstanceOf[js.Any], preread = preread.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStats]
  }
  
  extension [Self <: ContainerStats](x: Self) {
    
    inline def setBlkio_stats(value: BlkioStats): Self = StObject.set(x, "blkio_stats", value.asInstanceOf[js.Any])
    
    inline def setBlkio_statsUndefined: Self = StObject.set(x, "blkio_stats", js.undefined)
    
    inline def setCpu_stats(value: CPUStats): Self = StObject.set(x, "cpu_stats", value.asInstanceOf[js.Any])
    
    inline def setMemory_stats(value: MemoryStats): Self = StObject.set(x, "memory_stats", value.asInstanceOf[js.Any])
    
    inline def setNetworks(value: NetworkStats): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    inline def setNum_procs(value: Double): Self = StObject.set(x, "num_procs", value.asInstanceOf[js.Any])
    
    inline def setPids_stats(value: PidsStats): Self = StObject.set(x, "pids_stats", value.asInstanceOf[js.Any])
    
    inline def setPids_statsUndefined: Self = StObject.set(x, "pids_stats", js.undefined)
    
    inline def setPrecpu_stats(value: CPUStats): Self = StObject.set(x, "precpu_stats", value.asInstanceOf[js.Any])
    
    inline def setPreread(value: String): Self = StObject.set(x, "preread", value.asInstanceOf[js.Any])
    
    inline def setRead(value: String): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setStorage_stats(value: StorageStats): Self = StObject.set(x, "storage_stats", value.asInstanceOf[js.Any])
    
    inline def setStorage_statsUndefined: Self = StObject.set(x, "storage_stats", js.undefined)
  }
}
