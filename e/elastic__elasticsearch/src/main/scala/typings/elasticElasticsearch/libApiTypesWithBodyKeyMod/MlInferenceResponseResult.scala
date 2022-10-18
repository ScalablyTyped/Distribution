package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlInferenceResponseResult extends StObject {
  
  var entities: js.UndefOr[js.Array[MlTrainedModelEntities]] = js.undefined
  
  var feature_importance: js.UndefOr[js.Array[MlTrainedModelInferenceFeatureImportance]] = js.undefined
  
  var is_truncated: js.UndefOr[Boolean] = js.undefined
  
  var predicted_value: js.UndefOr[js.Array[MlPredictedValue]] = js.undefined
  
  var predicted_value_sequence: js.UndefOr[String] = js.undefined
  
  var prediction_probability: js.UndefOr[double] = js.undefined
  
  var prediction_score: js.UndefOr[double] = js.undefined
  
  var top_classes: js.UndefOr[js.Array[MlTopClassEntry]] = js.undefined
  
  var warning: js.UndefOr[String] = js.undefined
}
object MlInferenceResponseResult {
  
  inline def apply(): MlInferenceResponseResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlInferenceResponseResult]
  }
  
  extension [Self <: MlInferenceResponseResult](x: Self) {
    
    inline def setEntities(value: js.Array[MlTrainedModelEntities]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: MlTrainedModelEntities*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setFeature_importance(value: js.Array[MlTrainedModelInferenceFeatureImportance]): Self = StObject.set(x, "feature_importance", value.asInstanceOf[js.Any])
    
    inline def setFeature_importanceUndefined: Self = StObject.set(x, "feature_importance", js.undefined)
    
    inline def setFeature_importanceVarargs(value: MlTrainedModelInferenceFeatureImportance*): Self = StObject.set(x, "feature_importance", js.Array(value*))
    
    inline def setIs_truncated(value: Boolean): Self = StObject.set(x, "is_truncated", value.asInstanceOf[js.Any])
    
    inline def setIs_truncatedUndefined: Self = StObject.set(x, "is_truncated", js.undefined)
    
    inline def setPredicted_value(value: js.Array[MlPredictedValue]): Self = StObject.set(x, "predicted_value", value.asInstanceOf[js.Any])
    
    inline def setPredicted_valueUndefined: Self = StObject.set(x, "predicted_value", js.undefined)
    
    inline def setPredicted_valueVarargs(value: MlPredictedValue*): Self = StObject.set(x, "predicted_value", js.Array(value*))
    
    inline def setPredicted_value_sequence(value: String): Self = StObject.set(x, "predicted_value_sequence", value.asInstanceOf[js.Any])
    
    inline def setPredicted_value_sequenceUndefined: Self = StObject.set(x, "predicted_value_sequence", js.undefined)
    
    inline def setPrediction_probability(value: double): Self = StObject.set(x, "prediction_probability", value.asInstanceOf[js.Any])
    
    inline def setPrediction_probabilityUndefined: Self = StObject.set(x, "prediction_probability", js.undefined)
    
    inline def setPrediction_score(value: double): Self = StObject.set(x, "prediction_score", value.asInstanceOf[js.Any])
    
    inline def setPrediction_scoreUndefined: Self = StObject.set(x, "prediction_score", js.undefined)
    
    inline def setTop_classes(value: js.Array[MlTopClassEntry]): Self = StObject.set(x, "top_classes", value.asInstanceOf[js.Any])
    
    inline def setTop_classesUndefined: Self = StObject.set(x, "top_classes", js.undefined)
    
    inline def setTop_classesVarargs(value: MlTopClassEntry*): Self = StObject.set(x, "top_classes", js.Array(value*))
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
