package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalyticsStatsMemoryUsage extends StObject {
  
  var memory_reestimate_bytes: js.UndefOr[long] = js.undefined
  
  var peak_usage_bytes: long
  
  var status: String
  
  var timestamp: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
}
object MlDataframeAnalyticsStatsMemoryUsage {
  
  inline def apply(peak_usage_bytes: long, status: String): MlDataframeAnalyticsStatsMemoryUsage = {
    val __obj = js.Dynamic.literal(peak_usage_bytes = peak_usage_bytes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalyticsStatsMemoryUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDataframeAnalyticsStatsMemoryUsage] (val x: Self) extends AnyVal {
    
    inline def setMemory_reestimate_bytes(value: long): Self = StObject.set(x, "memory_reestimate_bytes", value.asInstanceOf[js.Any])
    
    inline def setMemory_reestimate_bytesUndefined: Self = StObject.set(x, "memory_reestimate_bytes", js.undefined)
    
    inline def setPeak_usage_bytes(value: long): Self = StObject.set(x, "peak_usage_bytes", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: EpochTime[UnitMillis]): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
