package typings.devtoolsProtocol.mod.Protocol.Storage

import typings.devtoolsProtocol.mod.Protocol.Browser.BrowserContextID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCookiesRequest extends StObject {
  
  /**
    * Browser context to use when called on the browser endpoint.
    */
  var browserContextId: js.UndefOr[BrowserContextID] = js.native
}
object GetCookiesRequest {
  
  @scala.inline
  def apply(): GetCookiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCookiesRequest]
  }
  
  @scala.inline
  implicit class GetCookiesRequestMutableBuilder[Self <: GetCookiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserContextIdUndefined: Self = StObject.set(x, "browserContextId", js.undefined)
  }
}
