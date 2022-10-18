package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMetricAggregationBase extends StObject {
  
  var field: js.UndefOr[Field] = js.undefined
  
  var missing: js.UndefOr[AggregationsMissing] = js.undefined
  
  var script: js.UndefOr[Script] = js.undefined
}
object AggregationsMetricAggregationBase {
  
  inline def apply(): AggregationsMetricAggregationBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsMetricAggregationBase]
  }
  
  extension [Self <: AggregationsMetricAggregationBase](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMissing(value: AggregationsMissing): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
