package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityInvalidateApiKeyResponse extends StObject {
  
  var error_count: integer
  
  var error_details: js.UndefOr[js.Array[ErrorCause]] = js.undefined
  
  var invalidated_api_keys: js.Array[String]
  
  var previously_invalidated_api_keys: js.Array[String]
}
object SecurityInvalidateApiKeyResponse {
  
  inline def apply(
    error_count: integer,
    invalidated_api_keys: js.Array[String],
    previously_invalidated_api_keys: js.Array[String]
  ): SecurityInvalidateApiKeyResponse = {
    val __obj = js.Dynamic.literal(error_count = error_count.asInstanceOf[js.Any], invalidated_api_keys = invalidated_api_keys.asInstanceOf[js.Any], previously_invalidated_api_keys = previously_invalidated_api_keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityInvalidateApiKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityInvalidateApiKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setError_count(value: integer): Self = StObject.set(x, "error_count", value.asInstanceOf[js.Any])
    
    inline def setError_details(value: js.Array[ErrorCause]): Self = StObject.set(x, "error_details", value.asInstanceOf[js.Any])
    
    inline def setError_detailsUndefined: Self = StObject.set(x, "error_details", js.undefined)
    
    inline def setError_detailsVarargs(value: ErrorCause*): Self = StObject.set(x, "error_details", js.Array(value*))
    
    inline def setInvalidated_api_keys(value: js.Array[String]): Self = StObject.set(x, "invalidated_api_keys", value.asInstanceOf[js.Any])
    
    inline def setInvalidated_api_keysVarargs(value: String*): Self = StObject.set(x, "invalidated_api_keys", js.Array(value*))
    
    inline def setPreviously_invalidated_api_keys(value: js.Array[String]): Self = StObject.set(x, "previously_invalidated_api_keys", value.asInstanceOf[js.Any])
    
    inline def setPreviously_invalidated_api_keysVarargs(value: String*): Self = StObject.set(x, "previously_invalidated_api_keys", js.Array(value*))
  }
}
