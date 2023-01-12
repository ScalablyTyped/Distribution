package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlQuestionAnsweringInferenceOptions extends StObject {
  
  var max_answer_length: js.UndefOr[integer] = js.undefined
  
  var num_top_classes: js.UndefOr[integer] = js.undefined
  
  var results_field: js.UndefOr[String] = js.undefined
  
  var tokenization: js.UndefOr[MlTokenizationConfigContainer] = js.undefined
}
object MlQuestionAnsweringInferenceOptions {
  
  inline def apply(): MlQuestionAnsweringInferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlQuestionAnsweringInferenceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlQuestionAnsweringInferenceOptions] (val x: Self) extends AnyVal {
    
    inline def setMax_answer_length(value: integer): Self = StObject.set(x, "max_answer_length", value.asInstanceOf[js.Any])
    
    inline def setMax_answer_lengthUndefined: Self = StObject.set(x, "max_answer_length", js.undefined)
    
    inline def setNum_top_classes(value: integer): Self = StObject.set(x, "num_top_classes", value.asInstanceOf[js.Any])
    
    inline def setNum_top_classesUndefined: Self = StObject.set(x, "num_top_classes", js.undefined)
    
    inline def setResults_field(value: String): Self = StObject.set(x, "results_field", value.asInstanceOf[js.Any])
    
    inline def setResults_fieldUndefined: Self = StObject.set(x, "results_field", js.undefined)
    
    inline def setTokenization(value: MlTokenizationConfigContainer): Self = StObject.set(x, "tokenization", value.asInstanceOf[js.Any])
    
    inline def setTokenizationUndefined: Self = StObject.set(x, "tokenization", js.undefined)
  }
}
