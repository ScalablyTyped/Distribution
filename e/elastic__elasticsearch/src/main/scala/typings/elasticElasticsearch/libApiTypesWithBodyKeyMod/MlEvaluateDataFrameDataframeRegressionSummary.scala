package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEvaluateDataFrameDataframeRegressionSummary extends StObject {
  
  var huber: js.UndefOr[MlEvaluateDataFrameDataframeEvaluationValue] = js.undefined
  
  var mse: js.UndefOr[MlEvaluateDataFrameDataframeEvaluationValue] = js.undefined
  
  var msle: js.UndefOr[MlEvaluateDataFrameDataframeEvaluationValue] = js.undefined
  
  var r_squared: js.UndefOr[MlEvaluateDataFrameDataframeEvaluationValue] = js.undefined
}
object MlEvaluateDataFrameDataframeRegressionSummary {
  
  inline def apply(): MlEvaluateDataFrameDataframeRegressionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlEvaluateDataFrameDataframeRegressionSummary]
  }
  
  extension [Self <: MlEvaluateDataFrameDataframeRegressionSummary](x: Self) {
    
    inline def setHuber(value: MlEvaluateDataFrameDataframeEvaluationValue): Self = StObject.set(x, "huber", value.asInstanceOf[js.Any])
    
    inline def setHuberUndefined: Self = StObject.set(x, "huber", js.undefined)
    
    inline def setMse(value: MlEvaluateDataFrameDataframeEvaluationValue): Self = StObject.set(x, "mse", value.asInstanceOf[js.Any])
    
    inline def setMseUndefined: Self = StObject.set(x, "mse", js.undefined)
    
    inline def setMsle(value: MlEvaluateDataFrameDataframeEvaluationValue): Self = StObject.set(x, "msle", value.asInstanceOf[js.Any])
    
    inline def setMsleUndefined: Self = StObject.set(x, "msle", js.undefined)
    
    inline def setR_squared(value: MlEvaluateDataFrameDataframeEvaluationValue): Self = StObject.set(x, "r_squared", value.asInstanceOf[js.Any])
    
    inline def setR_squaredUndefined: Self = StObject.set(x, "r_squared", js.undefined)
  }
}
