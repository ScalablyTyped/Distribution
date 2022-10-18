package typings.egg.anon

import org.scalablytyped.runtime.Instantiable0
import typings.eggCookies.mod.CookieError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofEggCookies extends StObject {
  
  var CookieError: Instantiable0[typings.eggCookies.mod.CookieError]
}
object TypeofEggCookies {
  
  inline def apply(CookieError: Instantiable0[CookieError]): TypeofEggCookies = {
    val __obj = js.Dynamic.literal(CookieError = CookieError.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofEggCookies]
  }
  
  extension [Self <: TypeofEggCookies](x: Self) {
    
    inline def setCookieError(value: Instantiable0[CookieError]): Self = StObject.set(x, "CookieError", value.asInstanceOf[js.Any])
  }
}
