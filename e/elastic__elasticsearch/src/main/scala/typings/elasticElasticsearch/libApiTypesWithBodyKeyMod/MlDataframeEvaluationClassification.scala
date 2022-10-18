package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeEvaluationClassification extends StObject {
  
  var actual_field: Field
  
  var metrics: js.UndefOr[MlDataframeEvaluationClassificationMetrics] = js.undefined
  
  var predicted_field: js.UndefOr[Field] = js.undefined
  
  var top_classes_field: js.UndefOr[Field] = js.undefined
}
object MlDataframeEvaluationClassification {
  
  inline def apply(actual_field: Field): MlDataframeEvaluationClassification = {
    val __obj = js.Dynamic.literal(actual_field = actual_field.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeEvaluationClassification]
  }
  
  extension [Self <: MlDataframeEvaluationClassification](x: Self) {
    
    inline def setActual_field(value: Field): Self = StObject.set(x, "actual_field", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: MlDataframeEvaluationClassificationMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setPredicted_field(value: Field): Self = StObject.set(x, "predicted_field", value.asInstanceOf[js.Any])
    
    inline def setPredicted_fieldUndefined: Self = StObject.set(x, "predicted_field", js.undefined)
    
    inline def setTop_classes_field(value: Field): Self = StObject.set(x, "top_classes_field", value.asInstanceOf[js.Any])
    
    inline def setTop_classes_fieldUndefined: Self = StObject.set(x, "top_classes_field", js.undefined)
  }
}
