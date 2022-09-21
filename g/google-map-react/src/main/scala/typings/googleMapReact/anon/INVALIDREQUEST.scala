package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INVALIDREQUEST extends StObject {
  
  var INVALID_REQUEST: String
  
  var MAX_WAYPOINTS_EXCEEDED: String
  
  var NOT_FOUND: String
  
  var OK: String
  
  var OVER_QUERY_LIMIT: String
  
  var REQUEST_DENIED: String
  
  var UNKNOWN_ERROR: String
  
  var ZERO_RESULTS: String
}
object INVALIDREQUEST {
  
  inline def apply(
    INVALID_REQUEST: String,
    MAX_WAYPOINTS_EXCEEDED: String,
    NOT_FOUND: String,
    OK: String,
    OVER_QUERY_LIMIT: String,
    REQUEST_DENIED: String,
    UNKNOWN_ERROR: String,
    ZERO_RESULTS: String
  ): INVALIDREQUEST = {
    val __obj = js.Dynamic.literal(INVALID_REQUEST = INVALID_REQUEST.asInstanceOf[js.Any], MAX_WAYPOINTS_EXCEEDED = MAX_WAYPOINTS_EXCEEDED.asInstanceOf[js.Any], NOT_FOUND = NOT_FOUND.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any], OVER_QUERY_LIMIT = OVER_QUERY_LIMIT.asInstanceOf[js.Any], REQUEST_DENIED = REQUEST_DENIED.asInstanceOf[js.Any], UNKNOWN_ERROR = UNKNOWN_ERROR.asInstanceOf[js.Any], ZERO_RESULTS = ZERO_RESULTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[INVALIDREQUEST]
  }
  
  extension [Self <: INVALIDREQUEST](x: Self) {
    
    inline def setINVALID_REQUEST(value: String): Self = StObject.set(x, "INVALID_REQUEST", value.asInstanceOf[js.Any])
    
    inline def setMAX_WAYPOINTS_EXCEEDED(value: String): Self = StObject.set(x, "MAX_WAYPOINTS_EXCEEDED", value.asInstanceOf[js.Any])
    
    inline def setNOT_FOUND(value: String): Self = StObject.set(x, "NOT_FOUND", value.asInstanceOf[js.Any])
    
    inline def setOK(value: String): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
    
    inline def setOVER_QUERY_LIMIT(value: String): Self = StObject.set(x, "OVER_QUERY_LIMIT", value.asInstanceOf[js.Any])
    
    inline def setREQUEST_DENIED(value: String): Self = StObject.set(x, "REQUEST_DENIED", value.asInstanceOf[js.Any])
    
    inline def setUNKNOWN_ERROR(value: String): Self = StObject.set(x, "UNKNOWN_ERROR", value.asInstanceOf[js.Any])
    
    inline def setZERO_RESULTS(value: String): Self = StObject.set(x, "ZERO_RESULTS", value.asInstanceOf[js.Any])
  }
}
