package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesValidateQueryResponse extends StObject {
  
  var _shards: js.UndefOr[ShardStatistics] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var explanations: js.UndefOr[js.Array[IndicesValidateQueryIndicesValidationExplanation]] = js.undefined
  
  var valid: Boolean
}
object IndicesValidateQueryResponse {
  
  inline def apply(valid: Boolean): IndicesValidateQueryResponse = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesValidateQueryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesValidateQueryResponse] (val x: Self) extends AnyVal {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExplanations(value: js.Array[IndicesValidateQueryIndicesValidationExplanation]): Self = StObject.set(x, "explanations", value.asInstanceOf[js.Any])
    
    inline def setExplanationsUndefined: Self = StObject.set(x, "explanations", js.undefined)
    
    inline def setExplanationsVarargs(value: IndicesValidateQueryIndicesValidationExplanation*): Self = StObject.set(x, "explanations", js.Array(value*))
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def set_shards(value: ShardStatistics): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
    
    inline def set_shardsUndefined: Self = StObject.set(x, "_shards", js.undefined)
  }
}
