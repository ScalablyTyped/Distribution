package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesDataPathStats extends StObject {
  
  var available: js.UndefOr[String] = js.undefined
  
  var available_in_bytes: js.UndefOr[long] = js.undefined
  
  var disk_queue: js.UndefOr[String] = js.undefined
  
  var disk_read_size: js.UndefOr[String] = js.undefined
  
  var disk_read_size_in_bytes: js.UndefOr[long] = js.undefined
  
  var disk_reads: js.UndefOr[long] = js.undefined
  
  var disk_write_size: js.UndefOr[String] = js.undefined
  
  var disk_write_size_in_bytes: js.UndefOr[long] = js.undefined
  
  var disk_writes: js.UndefOr[long] = js.undefined
  
  var free: js.UndefOr[String] = js.undefined
  
  var free_in_bytes: js.UndefOr[long] = js.undefined
  
  var mount: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var total: js.UndefOr[String] = js.undefined
  
  var total_in_bytes: js.UndefOr[long] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object NodesDataPathStats {
  
  inline def apply(): NodesDataPathStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesDataPathStats]
  }
  
  extension [Self <: NodesDataPathStats](x: Self) {
    
    inline def setAvailable(value: String): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    inline def setAvailable_in_bytes(value: long): Self = StObject.set(x, "available_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setAvailable_in_bytesUndefined: Self = StObject.set(x, "available_in_bytes", js.undefined)
    
    inline def setDisk_queue(value: String): Self = StObject.set(x, "disk_queue", value.asInstanceOf[js.Any])
    
    inline def setDisk_queueUndefined: Self = StObject.set(x, "disk_queue", js.undefined)
    
    inline def setDisk_read_size(value: String): Self = StObject.set(x, "disk_read_size", value.asInstanceOf[js.Any])
    
    inline def setDisk_read_sizeUndefined: Self = StObject.set(x, "disk_read_size", js.undefined)
    
    inline def setDisk_read_size_in_bytes(value: long): Self = StObject.set(x, "disk_read_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setDisk_read_size_in_bytesUndefined: Self = StObject.set(x, "disk_read_size_in_bytes", js.undefined)
    
    inline def setDisk_reads(value: long): Self = StObject.set(x, "disk_reads", value.asInstanceOf[js.Any])
    
    inline def setDisk_readsUndefined: Self = StObject.set(x, "disk_reads", js.undefined)
    
    inline def setDisk_write_size(value: String): Self = StObject.set(x, "disk_write_size", value.asInstanceOf[js.Any])
    
    inline def setDisk_write_sizeUndefined: Self = StObject.set(x, "disk_write_size", js.undefined)
    
    inline def setDisk_write_size_in_bytes(value: long): Self = StObject.set(x, "disk_write_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setDisk_write_size_in_bytesUndefined: Self = StObject.set(x, "disk_write_size_in_bytes", js.undefined)
    
    inline def setDisk_writes(value: long): Self = StObject.set(x, "disk_writes", value.asInstanceOf[js.Any])
    
    inline def setDisk_writesUndefined: Self = StObject.set(x, "disk_writes", js.undefined)
    
    inline def setFree(value: String): Self = StObject.set(x, "free", value.asInstanceOf[js.Any])
    
    inline def setFreeUndefined: Self = StObject.set(x, "free", js.undefined)
    
    inline def setFree_in_bytes(value: long): Self = StObject.set(x, "free_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setFree_in_bytesUndefined: Self = StObject.set(x, "free_in_bytes", js.undefined)
    
    inline def setMount(value: String): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
    
    inline def setMountUndefined: Self = StObject.set(x, "mount", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setTotal_in_bytes(value: long): Self = StObject.set(x, "total_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setTotal_in_bytesUndefined: Self = StObject.set(x, "total_in_bytes", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
