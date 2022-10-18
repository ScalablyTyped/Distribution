package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityInvalidateTokenResponse extends StObject {
  
  var error_count: long
  
  var error_details: js.UndefOr[js.Array[ErrorCause]] = js.undefined
  
  var invalidated_tokens: long
  
  var previously_invalidated_tokens: long
}
object SecurityInvalidateTokenResponse {
  
  inline def apply(error_count: long, invalidated_tokens: long, previously_invalidated_tokens: long): SecurityInvalidateTokenResponse = {
    val __obj = js.Dynamic.literal(error_count = error_count.asInstanceOf[js.Any], invalidated_tokens = invalidated_tokens.asInstanceOf[js.Any], previously_invalidated_tokens = previously_invalidated_tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityInvalidateTokenResponse]
  }
  
  extension [Self <: SecurityInvalidateTokenResponse](x: Self) {
    
    inline def setError_count(value: long): Self = StObject.set(x, "error_count", value.asInstanceOf[js.Any])
    
    inline def setError_details(value: js.Array[ErrorCause]): Self = StObject.set(x, "error_details", value.asInstanceOf[js.Any])
    
    inline def setError_detailsUndefined: Self = StObject.set(x, "error_details", js.undefined)
    
    inline def setError_detailsVarargs(value: ErrorCause*): Self = StObject.set(x, "error_details", js.Array(value*))
    
    inline def setInvalidated_tokens(value: long): Self = StObject.set(x, "invalidated_tokens", value.asInstanceOf[js.Any])
    
    inline def setPreviously_invalidated_tokens(value: long): Self = StObject.set(x, "previously_invalidated_tokens", value.asInstanceOf[js.Any])
  }
}
