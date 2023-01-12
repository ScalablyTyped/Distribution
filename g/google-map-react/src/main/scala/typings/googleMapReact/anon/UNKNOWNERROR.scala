package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UNKNOWNERROR extends StObject {
  
  var OK: String
  
  var UNKNOWN_ERROR: String
  
  var ZERO_RESULTS: String
}
object UNKNOWNERROR {
  
  inline def apply(OK: String, UNKNOWN_ERROR: String, ZERO_RESULTS: String): UNKNOWNERROR = {
    val __obj = js.Dynamic.literal(OK = OK.asInstanceOf[js.Any], UNKNOWN_ERROR = UNKNOWN_ERROR.asInstanceOf[js.Any], ZERO_RESULTS = ZERO_RESULTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[UNKNOWNERROR]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UNKNOWNERROR] (val x: Self) extends AnyVal {
    
    inline def setOK(value: String): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
    
    inline def setUNKNOWN_ERROR(value: String): Self = StObject.set(x, "UNKNOWN_ERROR", value.asInstanceOf[js.Any])
    
    inline def setZERO_RESULTS(value: String): Self = StObject.set(x, "ZERO_RESULTS", value.asInstanceOf[js.Any])
  }
}
