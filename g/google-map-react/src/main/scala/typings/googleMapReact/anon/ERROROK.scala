package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ERROROK extends StObject {
  
  var ERROR: String
  
  var OK: String
}
object ERROROK {
  
  inline def apply(ERROR: String, OK: String): ERROROK = {
    val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any])
    __obj.asInstanceOf[ERROROK]
  }
  
  extension [Self <: ERROROK](x: Self) {
    
    inline def setERROR(value: String): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setOK(value: String): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
  }
}
