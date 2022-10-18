package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMovingAverageAggregationBase
  extends StObject
     with AggregationsPipelineAggregationBase {
  
  var minimize: js.UndefOr[Boolean] = js.undefined
  
  var predict: js.UndefOr[integer] = js.undefined
  
  var window: js.UndefOr[integer] = js.undefined
}
object AggregationsMovingAverageAggregationBase {
  
  inline def apply(): AggregationsMovingAverageAggregationBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsMovingAverageAggregationBase]
  }
  
  extension [Self <: AggregationsMovingAverageAggregationBase](x: Self) {
    
    inline def setMinimize(value: Boolean): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
    
    inline def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
    
    inline def setPredict(value: integer): Self = StObject.set(x, "predict", value.asInstanceOf[js.Any])
    
    inline def setPredictUndefined: Self = StObject.set(x, "predict", js.undefined)
    
    inline def setWindow(value: integer): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
