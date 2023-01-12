package typings.devtoolsProtocol.mod.Protocol.Storage

import typings.devtoolsProtocol.mod.Protocol.Browser.BrowserContextID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearCookiesRequest extends StObject {
  
  /**
    * Browser context to use when called on the browser endpoint.
    */
  var browserContextId: js.UndefOr[BrowserContextID] = js.undefined
}
object ClearCookiesRequest {
  
  inline def apply(): ClearCookiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearCookiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearCookiesRequest] (val x: Self) extends AnyVal {
    
    inline def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
    
    inline def setBrowserContextIdUndefined: Self = StObject.set(x, "browserContextId", js.undefined)
  }
}
