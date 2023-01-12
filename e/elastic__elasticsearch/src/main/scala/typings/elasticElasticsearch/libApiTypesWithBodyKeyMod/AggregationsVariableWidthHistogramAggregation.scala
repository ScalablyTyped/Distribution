package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsVariableWidthHistogramAggregation extends StObject {
  
  var buckets: js.UndefOr[integer] = js.undefined
  
  var field: js.UndefOr[Field] = js.undefined
  
  var initial_buffer: js.UndefOr[integer] = js.undefined
  
  var shard_size: js.UndefOr[integer] = js.undefined
}
object AggregationsVariableWidthHistogramAggregation {
  
  inline def apply(): AggregationsVariableWidthHistogramAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsVariableWidthHistogramAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsVariableWidthHistogramAggregation] (val x: Self) extends AnyVal {
    
    inline def setBuckets(value: integer): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setInitial_buffer(value: integer): Self = StObject.set(x, "initial_buffer", value.asInstanceOf[js.Any])
    
    inline def setInitial_bufferUndefined: Self = StObject.set(x, "initial_buffer", js.undefined)
    
    inline def setShard_size(value: integer): Self = StObject.set(x, "shard_size", value.asInstanceOf[js.Any])
    
    inline def setShard_sizeUndefined: Self = StObject.set(x, "shard_size", js.undefined)
  }
}
