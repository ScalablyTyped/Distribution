package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NOTFOUND extends StObject {
  
  var NOT_FOUND: String
  
  var OK: String
  
  var ZERO_RESULTS: String
}
object NOTFOUND {
  
  inline def apply(NOT_FOUND: String, OK: String, ZERO_RESULTS: String): NOTFOUND = {
    val __obj = js.Dynamic.literal(NOT_FOUND = NOT_FOUND.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any], ZERO_RESULTS = ZERO_RESULTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[NOTFOUND]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NOTFOUND] (val x: Self) extends AnyVal {
    
    inline def setNOT_FOUND(value: String): Self = StObject.set(x, "NOT_FOUND", value.asInstanceOf[js.Any])
    
    inline def setOK(value: String): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
    
    inline def setZERO_RESULTS(value: String): Self = StObject.set(x, "ZERO_RESULTS", value.asInstanceOf[js.Any])
  }
}
