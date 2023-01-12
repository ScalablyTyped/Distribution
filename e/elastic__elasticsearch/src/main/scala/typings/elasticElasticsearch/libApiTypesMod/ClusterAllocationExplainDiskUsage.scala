package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterAllocationExplainDiskUsage extends StObject {
  
  var free_bytes: long
  
  var free_disk_percent: double
  
  var path: String
  
  var total_bytes: long
  
  var used_bytes: long
  
  var used_disk_percent: double
}
object ClusterAllocationExplainDiskUsage {
  
  inline def apply(
    free_bytes: long,
    free_disk_percent: double,
    path: String,
    total_bytes: long,
    used_bytes: long,
    used_disk_percent: double
  ): ClusterAllocationExplainDiskUsage = {
    val __obj = js.Dynamic.literal(free_bytes = free_bytes.asInstanceOf[js.Any], free_disk_percent = free_disk_percent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], total_bytes = total_bytes.asInstanceOf[js.Any], used_bytes = used_bytes.asInstanceOf[js.Any], used_disk_percent = used_disk_percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterAllocationExplainDiskUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterAllocationExplainDiskUsage] (val x: Self) extends AnyVal {
    
    inline def setFree_bytes(value: long): Self = StObject.set(x, "free_bytes", value.asInstanceOf[js.Any])
    
    inline def setFree_disk_percent(value: double): Self = StObject.set(x, "free_disk_percent", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setTotal_bytes(value: long): Self = StObject.set(x, "total_bytes", value.asInstanceOf[js.Any])
    
    inline def setUsed_bytes(value: long): Self = StObject.set(x, "used_bytes", value.asInstanceOf[js.Any])
    
    inline def setUsed_disk_percent(value: double): Self = StObject.set(x, "used_disk_percent", value.asInstanceOf[js.Any])
  }
}
