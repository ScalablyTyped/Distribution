package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelEnsemble extends StObject {
  
  var aggregate_output: js.UndefOr[MlPutTrainedModelAggregateOutput] = js.undefined
  
  var classification_labels: js.UndefOr[js.Array[String]] = js.undefined
  
  var feature_names: js.UndefOr[js.Array[String]] = js.undefined
  
  var target_type: js.UndefOr[String] = js.undefined
  
  var trained_models: js.Array[MlPutTrainedModelTrainedModel]
}
object MlPutTrainedModelEnsemble {
  
  inline def apply(trained_models: js.Array[MlPutTrainedModelTrainedModel]): MlPutTrainedModelEnsemble = {
    val __obj = js.Dynamic.literal(trained_models = trained_models.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModelEnsemble]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlPutTrainedModelEnsemble] (val x: Self) extends AnyVal {
    
    inline def setAggregate_output(value: MlPutTrainedModelAggregateOutput): Self = StObject.set(x, "aggregate_output", value.asInstanceOf[js.Any])
    
    inline def setAggregate_outputUndefined: Self = StObject.set(x, "aggregate_output", js.undefined)
    
    inline def setClassification_labels(value: js.Array[String]): Self = StObject.set(x, "classification_labels", value.asInstanceOf[js.Any])
    
    inline def setClassification_labelsUndefined: Self = StObject.set(x, "classification_labels", js.undefined)
    
    inline def setClassification_labelsVarargs(value: String*): Self = StObject.set(x, "classification_labels", js.Array(value*))
    
    inline def setFeature_names(value: js.Array[String]): Self = StObject.set(x, "feature_names", value.asInstanceOf[js.Any])
    
    inline def setFeature_namesUndefined: Self = StObject.set(x, "feature_names", js.undefined)
    
    inline def setFeature_namesVarargs(value: String*): Self = StObject.set(x, "feature_names", js.Array(value*))
    
    inline def setTarget_type(value: String): Self = StObject.set(x, "target_type", value.asInstanceOf[js.Any])
    
    inline def setTarget_typeUndefined: Self = StObject.set(x, "target_type", js.undefined)
    
    inline def setTrained_models(value: js.Array[MlPutTrainedModelTrainedModel]): Self = StObject.set(x, "trained_models", value.asInstanceOf[js.Any])
    
    inline def setTrained_modelsVarargs(value: MlPutTrainedModelTrainedModel*): Self = StObject.set(x, "trained_models", js.Array(value*))
  }
}
