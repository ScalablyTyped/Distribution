package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlNerInferenceOptions extends StObject {
  
  var classification_labels: js.UndefOr[js.Array[String]] = js.undefined
  
  var results_field: js.UndefOr[String] = js.undefined
  
  var tokenization: js.UndefOr[MlTokenizationConfigContainer] = js.undefined
}
object MlNerInferenceOptions {
  
  inline def apply(): MlNerInferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlNerInferenceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlNerInferenceOptions] (val x: Self) extends AnyVal {
    
    inline def setClassification_labels(value: js.Array[String]): Self = StObject.set(x, "classification_labels", value.asInstanceOf[js.Any])
    
    inline def setClassification_labelsUndefined: Self = StObject.set(x, "classification_labels", js.undefined)
    
    inline def setClassification_labelsVarargs(value: String*): Self = StObject.set(x, "classification_labels", js.Array(value*))
    
    inline def setResults_field(value: String): Self = StObject.set(x, "results_field", value.asInstanceOf[js.Any])
    
    inline def setResults_fieldUndefined: Self = StObject.set(x, "results_field", js.undefined)
    
    inline def setTokenization(value: MlTokenizationConfigContainer): Self = StObject.set(x, "tokenization", value.asInstanceOf[js.Any])
    
    inline def setTokenizationUndefined: Self = StObject.set(x, "tokenization", js.undefined)
  }
}
