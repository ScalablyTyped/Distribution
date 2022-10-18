package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTextEmbeddingInferenceUpdateOptions extends StObject {
  
  var results_field: js.UndefOr[String] = js.undefined
  
  var tokenization: js.UndefOr[MlNlpTokenizationUpdateOptions] = js.undefined
}
object MlTextEmbeddingInferenceUpdateOptions {
  
  inline def apply(): MlTextEmbeddingInferenceUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlTextEmbeddingInferenceUpdateOptions]
  }
  
  extension [Self <: MlTextEmbeddingInferenceUpdateOptions](x: Self) {
    
    inline def setResults_field(value: String): Self = StObject.set(x, "results_field", value.asInstanceOf[js.Any])
    
    inline def setResults_fieldUndefined: Self = StObject.set(x, "results_field", js.undefined)
    
    inline def setTokenization(value: MlNlpTokenizationUpdateOptions): Self = StObject.set(x, "tokenization", value.asInstanceOf[js.Any])
    
    inline def setTokenizationUndefined: Self = StObject.set(x, "tokenization", js.undefined)
  }
}
