package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsCardinalityAggregation
  extends StObject
     with AggregationsMetricAggregationBase {
  
  var execution_hint: js.UndefOr[AggregationsCardinalityExecutionMode] = js.undefined
  
  var precision_threshold: js.UndefOr[integer] = js.undefined
  
  var rehash: js.UndefOr[Boolean] = js.undefined
}
object AggregationsCardinalityAggregation {
  
  inline def apply(): AggregationsCardinalityAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsCardinalityAggregation]
  }
  
  extension [Self <: AggregationsCardinalityAggregation](x: Self) {
    
    inline def setExecution_hint(value: AggregationsCardinalityExecutionMode): Self = StObject.set(x, "execution_hint", value.asInstanceOf[js.Any])
    
    inline def setExecution_hintUndefined: Self = StObject.set(x, "execution_hint", js.undefined)
    
    inline def setPrecision_threshold(value: integer): Self = StObject.set(x, "precision_threshold", value.asInstanceOf[js.Any])
    
    inline def setPrecision_thresholdUndefined: Self = StObject.set(x, "precision_threshold", js.undefined)
    
    inline def setRehash(value: Boolean): Self = StObject.set(x, "rehash", value.asInstanceOf[js.Any])
    
    inline def setRehashUndefined: Self = StObject.set(x, "rehash", js.undefined)
  }
}
