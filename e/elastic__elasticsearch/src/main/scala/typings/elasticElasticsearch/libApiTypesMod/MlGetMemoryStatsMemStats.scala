package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetMemoryStatsMemStats extends StObject {
  
  var adjusted_total: js.UndefOr[ByteSize] = js.undefined
  
  var adjusted_total_in_bytes: integer
  
  var ml: MlGetMemoryStatsMemMlStats
  
  var total: js.UndefOr[ByteSize] = js.undefined
  
  var total_in_bytes: integer
}
object MlGetMemoryStatsMemStats {
  
  inline def apply(adjusted_total_in_bytes: integer, ml: MlGetMemoryStatsMemMlStats, total_in_bytes: integer): MlGetMemoryStatsMemStats = {
    val __obj = js.Dynamic.literal(adjusted_total_in_bytes = adjusted_total_in_bytes.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any], total_in_bytes = total_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetMemoryStatsMemStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetMemoryStatsMemStats] (val x: Self) extends AnyVal {
    
    inline def setAdjusted_total(value: ByteSize): Self = StObject.set(x, "adjusted_total", value.asInstanceOf[js.Any])
    
    inline def setAdjusted_totalUndefined: Self = StObject.set(x, "adjusted_total", js.undefined)
    
    inline def setAdjusted_total_in_bytes(value: integer): Self = StObject.set(x, "adjusted_total_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setMl(value: MlGetMemoryStatsMemMlStats): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: ByteSize): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setTotal_in_bytes(value: integer): Self = StObject.set(x, "total_in_bytes", value.asInstanceOf[js.Any])
  }
}
