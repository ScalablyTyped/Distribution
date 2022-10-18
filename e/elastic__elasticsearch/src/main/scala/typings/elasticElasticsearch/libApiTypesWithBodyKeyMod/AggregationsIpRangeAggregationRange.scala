package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsIpRangeAggregationRange extends StObject {
  
  var from: js.UndefOr[String | Null] = js.undefined
  
  var mask: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[String | Null] = js.undefined
}
object AggregationsIpRangeAggregationRange {
  
  inline def apply(): AggregationsIpRangeAggregationRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsIpRangeAggregationRange]
  }
  
  extension [Self <: AggregationsIpRangeAggregationRange](x: Self) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
