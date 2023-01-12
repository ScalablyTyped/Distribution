package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOCUMENTNOTFOUND extends StObject {
  
  var DOCUMENT_NOT_FOUND: String
  
  var DOCUMENT_TOO_LARGE: String
  
  var FETCH_ERROR: String
  
  var INVALID_DOCUMENT: String
  
  var INVALID_REQUEST: String
  
  var LIMITS_EXCEEDED: String
  
  var OK: String
  
  var TIMED_OUT: String
  
  var UNKNOWN: String
}
object DOCUMENTNOTFOUND {
  
  inline def apply(
    DOCUMENT_NOT_FOUND: String,
    DOCUMENT_TOO_LARGE: String,
    FETCH_ERROR: String,
    INVALID_DOCUMENT: String,
    INVALID_REQUEST: String,
    LIMITS_EXCEEDED: String,
    OK: String,
    TIMED_OUT: String,
    UNKNOWN: String
  ): DOCUMENTNOTFOUND = {
    val __obj = js.Dynamic.literal(DOCUMENT_NOT_FOUND = DOCUMENT_NOT_FOUND.asInstanceOf[js.Any], DOCUMENT_TOO_LARGE = DOCUMENT_TOO_LARGE.asInstanceOf[js.Any], FETCH_ERROR = FETCH_ERROR.asInstanceOf[js.Any], INVALID_DOCUMENT = INVALID_DOCUMENT.asInstanceOf[js.Any], INVALID_REQUEST = INVALID_REQUEST.asInstanceOf[js.Any], LIMITS_EXCEEDED = LIMITS_EXCEEDED.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any], TIMED_OUT = TIMED_OUT.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOCUMENTNOTFOUND]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOCUMENTNOTFOUND] (val x: Self) extends AnyVal {
    
    inline def setDOCUMENT_NOT_FOUND(value: String): Self = StObject.set(x, "DOCUMENT_NOT_FOUND", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_TOO_LARGE(value: String): Self = StObject.set(x, "DOCUMENT_TOO_LARGE", value.asInstanceOf[js.Any])
    
    inline def setFETCH_ERROR(value: String): Self = StObject.set(x, "FETCH_ERROR", value.asInstanceOf[js.Any])
    
    inline def setINVALID_DOCUMENT(value: String): Self = StObject.set(x, "INVALID_DOCUMENT", value.asInstanceOf[js.Any])
    
    inline def setINVALID_REQUEST(value: String): Self = StObject.set(x, "INVALID_REQUEST", value.asInstanceOf[js.Any])
    
    inline def setLIMITS_EXCEEDED(value: String): Self = StObject.set(x, "LIMITS_EXCEEDED", value.asInstanceOf[js.Any])
    
    inline def setOK(value: String): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
    
    inline def setTIMED_OUT(value: String): Self = StObject.set(x, "TIMED_OUT", value.asInstanceOf[js.Any])
    
    inline def setUNKNOWN(value: String): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
  }
}
