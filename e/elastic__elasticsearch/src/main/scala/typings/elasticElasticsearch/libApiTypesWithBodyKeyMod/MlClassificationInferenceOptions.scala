package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlClassificationInferenceOptions extends StObject {
  
  var num_top_classes: js.UndefOr[integer] = js.undefined
  
  var num_top_feature_importance_values: js.UndefOr[integer] = js.undefined
  
  var prediction_field_type: js.UndefOr[String] = js.undefined
  
  var results_field: js.UndefOr[String] = js.undefined
  
  var top_classes_results_field: js.UndefOr[String] = js.undefined
}
object MlClassificationInferenceOptions {
  
  inline def apply(): MlClassificationInferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlClassificationInferenceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlClassificationInferenceOptions] (val x: Self) extends AnyVal {
    
    inline def setNum_top_classes(value: integer): Self = StObject.set(x, "num_top_classes", value.asInstanceOf[js.Any])
    
    inline def setNum_top_classesUndefined: Self = StObject.set(x, "num_top_classes", js.undefined)
    
    inline def setNum_top_feature_importance_values(value: integer): Self = StObject.set(x, "num_top_feature_importance_values", value.asInstanceOf[js.Any])
    
    inline def setNum_top_feature_importance_valuesUndefined: Self = StObject.set(x, "num_top_feature_importance_values", js.undefined)
    
    inline def setPrediction_field_type(value: String): Self = StObject.set(x, "prediction_field_type", value.asInstanceOf[js.Any])
    
    inline def setPrediction_field_typeUndefined: Self = StObject.set(x, "prediction_field_type", js.undefined)
    
    inline def setResults_field(value: String): Self = StObject.set(x, "results_field", value.asInstanceOf[js.Any])
    
    inline def setResults_fieldUndefined: Self = StObject.set(x, "results_field", js.undefined)
    
    inline def setTop_classes_results_field(value: String): Self = StObject.set(x, "top_classes_results_field", value.asInstanceOf[js.Any])
    
    inline def setTop_classes_results_fieldUndefined: Self = StObject.set(x, "top_classes_results_field", js.undefined)
  }
}
