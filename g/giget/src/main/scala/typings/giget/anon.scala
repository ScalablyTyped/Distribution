package typings.giget

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Auth extends StObject {
    
    var auth: js.UndefOr[String] = js.undefined
  }
  object Auth {
    
    inline def apply(): Auth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Auth]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Auth] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    }
  }
}
