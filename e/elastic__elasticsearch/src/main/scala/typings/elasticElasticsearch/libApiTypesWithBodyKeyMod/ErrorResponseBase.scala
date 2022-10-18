package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorResponseBase
  extends StObject
     with MsearchResponseItem[Any] {
  
  var error: ErrorCause
  
  var status: integer
}
object ErrorResponseBase {
  
  inline def apply(error: ErrorCause, status: integer): ErrorResponseBase = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResponseBase]
  }
  
  extension [Self <: ErrorResponseBase](x: Self) {
    
    inline def setError(value: ErrorCause): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: integer): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
