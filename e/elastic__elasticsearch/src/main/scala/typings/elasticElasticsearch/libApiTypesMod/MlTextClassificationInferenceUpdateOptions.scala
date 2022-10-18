package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTextClassificationInferenceUpdateOptions extends StObject {
  
  var classification_labels: js.UndefOr[js.Array[String]] = js.undefined
  
  var num_top_classes: js.UndefOr[integer] = js.undefined
  
  var results_field: js.UndefOr[String] = js.undefined
  
  var tokenization: js.UndefOr[MlNlpTokenizationUpdateOptions] = js.undefined
}
object MlTextClassificationInferenceUpdateOptions {
  
  inline def apply(): MlTextClassificationInferenceUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlTextClassificationInferenceUpdateOptions]
  }
  
  extension [Self <: MlTextClassificationInferenceUpdateOptions](x: Self) {
    
    inline def setClassification_labels(value: js.Array[String]): Self = StObject.set(x, "classification_labels", value.asInstanceOf[js.Any])
    
    inline def setClassification_labelsUndefined: Self = StObject.set(x, "classification_labels", js.undefined)
    
    inline def setClassification_labelsVarargs(value: String*): Self = StObject.set(x, "classification_labels", js.Array(value*))
    
    inline def setNum_top_classes(value: integer): Self = StObject.set(x, "num_top_classes", value.asInstanceOf[js.Any])
    
    inline def setNum_top_classesUndefined: Self = StObject.set(x, "num_top_classes", js.undefined)
    
    inline def setResults_field(value: String): Self = StObject.set(x, "results_field", value.asInstanceOf[js.Any])
    
    inline def setResults_fieldUndefined: Self = StObject.set(x, "results_field", js.undefined)
    
    inline def setTokenization(value: MlNlpTokenizationUpdateOptions): Self = StObject.set(x, "tokenization", value.asInstanceOf[js.Any])
    
    inline def setTokenizationUndefined: Self = StObject.set(x, "tokenization", js.undefined)
  }
}
