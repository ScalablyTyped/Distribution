package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsAggregationRange extends StObject {
  
  var from: js.UndefOr[double | String | Null] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[double | String | Null] = js.undefined
}
object AggregationsAggregationRange {
  
  inline def apply(): AggregationsAggregationRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsAggregationRange]
  }
  
  extension [Self <: AggregationsAggregationRange](x: Self) {
    
    inline def setFrom(value: double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setTo(value: double | String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
