package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCookiesRequest extends StObject {
  
  /**
    * Cookies to be set.
    */
  var cookies: js.Array[CookieParam]
}
object SetCookiesRequest {
  
  inline def apply(cookies: js.Array[CookieParam]): SetCookiesRequest = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCookiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetCookiesRequest] (val x: Self) extends AnyVal {
    
    inline def setCookies(value: js.Array[CookieParam]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesVarargs(value: CookieParam*): Self = StObject.set(x, "cookies", js.Array(value*))
  }
}
