package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesValidateQueryIndicesValidationExplanation extends StObject {
  
  var error: js.UndefOr[String] = js.undefined
  
  var explanation: js.UndefOr[String] = js.undefined
  
  var index: IndexName
  
  var valid: Boolean
}
object IndicesValidateQueryIndicesValidationExplanation {
  
  inline def apply(index: IndexName, valid: Boolean): IndicesValidateQueryIndicesValidationExplanation = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesValidateQueryIndicesValidationExplanation]
  }
  
  extension [Self <: IndicesValidateQueryIndicesValidationExplanation](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
