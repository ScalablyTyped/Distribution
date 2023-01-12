package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPassThroughInferenceOptions extends StObject {
  
  var results_field: js.UndefOr[String] = js.undefined
  
  var tokenization: js.UndefOr[MlTokenizationConfigContainer] = js.undefined
}
object MlPassThroughInferenceOptions {
  
  inline def apply(): MlPassThroughInferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlPassThroughInferenceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlPassThroughInferenceOptions] (val x: Self) extends AnyVal {
    
    inline def setResults_field(value: String): Self = StObject.set(x, "results_field", value.asInstanceOf[js.Any])
    
    inline def setResults_fieldUndefined: Self = StObject.set(x, "results_field", js.undefined)
    
    inline def setTokenization(value: MlTokenizationConfigContainer): Self = StObject.set(x, "tokenization", value.asInstanceOf[js.Any])
    
    inline def setTokenizationUndefined: Self = StObject.set(x, "tokenization", js.undefined)
  }
}
