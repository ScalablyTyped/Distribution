package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ERROR extends StObject {
  
  var ERROR: String
  
  var INVALID_REQUEST: String
  
  var OK: String
  
  var OVER_QUERY_LIMIT: String
  
  var REQUEST_DENIED: String
  
  var UNKNOWN_ERROR: String
  
  var ZERO_RESULTS: String
}
object ERROR {
  
  inline def apply(
    ERROR: String,
    INVALID_REQUEST: String,
    OK: String,
    OVER_QUERY_LIMIT: String,
    REQUEST_DENIED: String,
    UNKNOWN_ERROR: String,
    ZERO_RESULTS: String
  ): ERROR = {
    val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], INVALID_REQUEST = INVALID_REQUEST.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any], OVER_QUERY_LIMIT = OVER_QUERY_LIMIT.asInstanceOf[js.Any], REQUEST_DENIED = REQUEST_DENIED.asInstanceOf[js.Any], UNKNOWN_ERROR = UNKNOWN_ERROR.asInstanceOf[js.Any], ZERO_RESULTS = ZERO_RESULTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ERROR]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ERROR] (val x: Self) extends AnyVal {
    
    inline def setERROR(value: String): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setINVALID_REQUEST(value: String): Self = StObject.set(x, "INVALID_REQUEST", value.asInstanceOf[js.Any])
    
    inline def setOK(value: String): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
    
    inline def setOVER_QUERY_LIMIT(value: String): Self = StObject.set(x, "OVER_QUERY_LIMIT", value.asInstanceOf[js.Any])
    
    inline def setREQUEST_DENIED(value: String): Self = StObject.set(x, "REQUEST_DENIED", value.asInstanceOf[js.Any])
    
    inline def setUNKNOWN_ERROR(value: String): Self = StObject.set(x, "UNKNOWN_ERROR", value.asInstanceOf[js.Any])
    
    inline def setZERO_RESULTS(value: String): Self = StObject.set(x, "ZERO_RESULTS", value.asInstanceOf[js.Any])
  }
}
