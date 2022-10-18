package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeEvaluationRegressionMetrics extends StObject {
  
  var huber: js.UndefOr[MlDataframeEvaluationRegressionMetricsHuber] = js.undefined
  
  var mse: js.UndefOr[Record[String, Any]] = js.undefined
  
  var msle: js.UndefOr[MlDataframeEvaluationRegressionMetricsMsle] = js.undefined
  
  var r_squared: js.UndefOr[Record[String, Any]] = js.undefined
}
object MlDataframeEvaluationRegressionMetrics {
  
  inline def apply(): MlDataframeEvaluationRegressionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDataframeEvaluationRegressionMetrics]
  }
  
  extension [Self <: MlDataframeEvaluationRegressionMetrics](x: Self) {
    
    inline def setHuber(value: MlDataframeEvaluationRegressionMetricsHuber): Self = StObject.set(x, "huber", value.asInstanceOf[js.Any])
    
    inline def setHuberUndefined: Self = StObject.set(x, "huber", js.undefined)
    
    inline def setMse(value: Record[String, Any]): Self = StObject.set(x, "mse", value.asInstanceOf[js.Any])
    
    inline def setMseUndefined: Self = StObject.set(x, "mse", js.undefined)
    
    inline def setMsle(value: MlDataframeEvaluationRegressionMetricsMsle): Self = StObject.set(x, "msle", value.asInstanceOf[js.Any])
    
    inline def setMsleUndefined: Self = StObject.set(x, "msle", js.undefined)
    
    inline def setR_squared(value: Record[String, Any]): Self = StObject.set(x, "r_squared", value.asInstanceOf[js.Any])
    
    inline def setR_squaredUndefined: Self = StObject.set(x, "r_squared", js.undefined)
  }
}
