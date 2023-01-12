package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeEvaluationOutlierDetection extends StObject {
  
  var actual_field: Field
  
  var metrics: js.UndefOr[MlDataframeEvaluationOutlierDetectionMetrics] = js.undefined
  
  var predicted_probability_field: Field
}
object MlDataframeEvaluationOutlierDetection {
  
  inline def apply(actual_field: Field, predicted_probability_field: Field): MlDataframeEvaluationOutlierDetection = {
    val __obj = js.Dynamic.literal(actual_field = actual_field.asInstanceOf[js.Any], predicted_probability_field = predicted_probability_field.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeEvaluationOutlierDetection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDataframeEvaluationOutlierDetection] (val x: Self) extends AnyVal {
    
    inline def setActual_field(value: Field): Self = StObject.set(x, "actual_field", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: MlDataframeEvaluationOutlierDetectionMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setPredicted_probability_field(value: Field): Self = StObject.set(x, "predicted_probability_field", value.asInstanceOf[js.Any])
  }
}
