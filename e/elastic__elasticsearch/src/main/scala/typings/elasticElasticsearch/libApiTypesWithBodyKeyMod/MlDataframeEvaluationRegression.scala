package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeEvaluationRegression extends StObject {
  
  var actual_field: Field
  
  var metrics: js.UndefOr[MlDataframeEvaluationRegressionMetrics] = js.undefined
  
  var predicted_field: Field
}
object MlDataframeEvaluationRegression {
  
  inline def apply(actual_field: Field, predicted_field: Field): MlDataframeEvaluationRegression = {
    val __obj = js.Dynamic.literal(actual_field = actual_field.asInstanceOf[js.Any], predicted_field = predicted_field.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeEvaluationRegression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDataframeEvaluationRegression] (val x: Self) extends AnyVal {
    
    inline def setActual_field(value: Field): Self = StObject.set(x, "actual_field", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: MlDataframeEvaluationRegressionMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setPredicted_field(value: Field): Self = StObject.set(x, "predicted_field", value.asInstanceOf[js.Any])
  }
}
