package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsIndexingPressureMemory extends StObject {
  
  var current: ClusterStatsIndexingPressureMemorySummary
  
  var limit_in_bytes: long
  
  var total: ClusterStatsIndexingPressureMemorySummary
}
object ClusterStatsIndexingPressureMemory {
  
  inline def apply(
    current: ClusterStatsIndexingPressureMemorySummary,
    limit_in_bytes: long,
    total: ClusterStatsIndexingPressureMemorySummary
  ): ClusterStatsIndexingPressureMemory = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], limit_in_bytes = limit_in_bytes.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsIndexingPressureMemory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStatsIndexingPressureMemory] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: ClusterStatsIndexingPressureMemorySummary): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setLimit_in_bytes(value: long): Self = StObject.set(x, "limit_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: ClusterStatsIndexingPressureMemorySummary): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
