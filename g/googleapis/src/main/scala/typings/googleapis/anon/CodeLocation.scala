package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeLocation extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object CodeLocation {
  
  inline def apply(): CodeLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeLocation]
  }
  
  extension [Self <: CodeLocation](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
