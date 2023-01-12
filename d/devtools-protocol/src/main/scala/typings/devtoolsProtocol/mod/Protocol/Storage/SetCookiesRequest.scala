package typings.devtoolsProtocol.mod.Protocol.Storage

import typings.devtoolsProtocol.mod.Protocol.Browser.BrowserContextID
import typings.devtoolsProtocol.mod.Protocol.Network.CookieParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCookiesRequest extends StObject {
  
  /**
    * Browser context to use when called on the browser endpoint.
    */
  var browserContextId: js.UndefOr[BrowserContextID] = js.undefined
  
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
    
    inline def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
    
    inline def setBrowserContextIdUndefined: Self = StObject.set(x, "browserContextId", js.undefined)
    
    inline def setCookies(value: js.Array[CookieParam]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesVarargs(value: CookieParam*): Self = StObject.set(x, "cookies", js.Array(value*))
  }
}
