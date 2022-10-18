package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsOperatingSystemMemoryInfo extends StObject {
  
  var adjusted_total_in_bytes: js.UndefOr[long] = js.undefined
  
  var free_in_bytes: long
  
  var free_percent: integer
  
  var total_in_bytes: long
  
  var used_in_bytes: long
  
  var used_percent: integer
}
object ClusterStatsOperatingSystemMemoryInfo {
  
  inline def apply(
    free_in_bytes: long,
    free_percent: integer,
    total_in_bytes: long,
    used_in_bytes: long,
    used_percent: integer
  ): ClusterStatsOperatingSystemMemoryInfo = {
    val __obj = js.Dynamic.literal(free_in_bytes = free_in_bytes.asInstanceOf[js.Any], free_percent = free_percent.asInstanceOf[js.Any], total_in_bytes = total_in_bytes.asInstanceOf[js.Any], used_in_bytes = used_in_bytes.asInstanceOf[js.Any], used_percent = used_percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsOperatingSystemMemoryInfo]
  }
  
  extension [Self <: ClusterStatsOperatingSystemMemoryInfo](x: Self) {
    
    inline def setAdjusted_total_in_bytes(value: long): Self = StObject.set(x, "adjusted_total_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setAdjusted_total_in_bytesUndefined: Self = StObject.set(x, "adjusted_total_in_bytes", js.undefined)
    
    inline def setFree_in_bytes(value: long): Self = StObject.set(x, "free_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setFree_percent(value: integer): Self = StObject.set(x, "free_percent", value.asInstanceOf[js.Any])
    
    inline def setTotal_in_bytes(value: long): Self = StObject.set(x, "total_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setUsed_in_bytes(value: long): Self = StObject.set(x, "used_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setUsed_percent(value: integer): Self = StObject.set(x, "used_percent", value.asInstanceOf[js.Any])
  }
}
