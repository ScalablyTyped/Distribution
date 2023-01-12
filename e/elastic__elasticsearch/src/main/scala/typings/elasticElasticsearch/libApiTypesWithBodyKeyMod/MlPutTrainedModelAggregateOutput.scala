package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelAggregateOutput extends StObject {
  
  var exponent: js.UndefOr[MlPutTrainedModelWeights] = js.undefined
  
  var logistic_regression: js.UndefOr[MlPutTrainedModelWeights] = js.undefined
  
  var weighted_mode: js.UndefOr[MlPutTrainedModelWeights] = js.undefined
  
  var weighted_sum: js.UndefOr[MlPutTrainedModelWeights] = js.undefined
}
object MlPutTrainedModelAggregateOutput {
  
  inline def apply(): MlPutTrainedModelAggregateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlPutTrainedModelAggregateOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlPutTrainedModelAggregateOutput] (val x: Self) extends AnyVal {
    
    inline def setExponent(value: MlPutTrainedModelWeights): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    inline def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
    
    inline def setLogistic_regression(value: MlPutTrainedModelWeights): Self = StObject.set(x, "logistic_regression", value.asInstanceOf[js.Any])
    
    inline def setLogistic_regressionUndefined: Self = StObject.set(x, "logistic_regression", js.undefined)
    
    inline def setWeighted_mode(value: MlPutTrainedModelWeights): Self = StObject.set(x, "weighted_mode", value.asInstanceOf[js.Any])
    
    inline def setWeighted_modeUndefined: Self = StObject.set(x, "weighted_mode", js.undefined)
    
    inline def setWeighted_sum(value: MlPutTrainedModelWeights): Self = StObject.set(x, "weighted_sum", value.asInstanceOf[js.Any])
    
    inline def setWeighted_sumUndefined: Self = StObject.set(x, "weighted_sum", js.undefined)
  }
}
