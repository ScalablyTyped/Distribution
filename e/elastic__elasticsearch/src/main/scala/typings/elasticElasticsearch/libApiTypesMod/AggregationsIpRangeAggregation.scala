package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsIpRangeAggregation
  extends StObject
     with AggregationsAggregation {
  
  var field: js.UndefOr[Field] = js.undefined
  
  var ranges: js.UndefOr[js.Array[AggregationsIpRangeAggregationRange]] = js.undefined
}
object AggregationsIpRangeAggregation {
  
  inline def apply(): AggregationsIpRangeAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsIpRangeAggregation]
  }
  
  extension [Self <: AggregationsIpRangeAggregation](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setRanges(value: js.Array[AggregationsIpRangeAggregationRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: AggregationsIpRangeAggregationRange*): Self = StObject.set(x, "ranges", js.Array(value*))
  }
}
