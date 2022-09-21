package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OK extends StObject {
  
  var INVALID_REQUEST: String
  
  var OK: String
  
  var OVER_QUERY_LIMIT: String
  
  var REQUEST_DENIED: String
  
  var UNKNOWN_ERROR: String
  
  var yz: String
}
object OK {
  
  inline def apply(
    INVALID_REQUEST: String,
    OK: String,
    OVER_QUERY_LIMIT: String,
    REQUEST_DENIED: String,
    UNKNOWN_ERROR: String,
    yz: String
  ): OK = {
    val __obj = js.Dynamic.literal(INVALID_REQUEST = INVALID_REQUEST.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any], OVER_QUERY_LIMIT = OVER_QUERY_LIMIT.asInstanceOf[js.Any], REQUEST_DENIED = REQUEST_DENIED.asInstanceOf[js.Any], UNKNOWN_ERROR = UNKNOWN_ERROR.asInstanceOf[js.Any], yz = yz.asInstanceOf[js.Any])
    __obj.asInstanceOf[OK]
  }
  
  extension [Self <: OK](x: Self) {
    
    inline def setINVALID_REQUEST(value: String): Self = StObject.set(x, "INVALID_REQUEST", value.asInstanceOf[js.Any])
    
    inline def setOK(value: String): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
    
    inline def setOVER_QUERY_LIMIT(value: String): Self = StObject.set(x, "OVER_QUERY_LIMIT", value.asInstanceOf[js.Any])
    
    inline def setREQUEST_DENIED(value: String): Self = StObject.set(x, "REQUEST_DENIED", value.asInstanceOf[js.Any])
    
    inline def setUNKNOWN_ERROR(value: String): Self = StObject.set(x, "UNKNOWN_ERROR", value.asInstanceOf[js.Any])
    
    inline def setYz(value: String): Self = StObject.set(x, "yz", value.asInstanceOf[js.Any])
  }
}
