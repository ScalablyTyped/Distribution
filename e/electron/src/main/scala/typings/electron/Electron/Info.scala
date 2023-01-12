package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Info extends StObject {
  
  /**
    * Content Security Policy for the isolated world.
    */
  var csp: js.UndefOr[String] = js.undefined
  
  /**
    * Name for isolated world. Useful in devtools.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Security origin for the isolated world.
    */
  var securityOrigin: js.UndefOr[String] = js.undefined
}
object Info {
  
  inline def apply(): Info = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Info]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
    
    inline def setCsp(value: String): Self = StObject.set(x, "csp", value.asInstanceOf[js.Any])
    
    inline def setCspUndefined: Self = StObject.set(x, "csp", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
    
    inline def setSecurityOriginUndefined: Self = StObject.set(x, "securityOrigin", js.undefined)
  }
}
