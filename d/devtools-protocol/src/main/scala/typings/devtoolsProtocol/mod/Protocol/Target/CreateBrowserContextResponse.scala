package typings.devtoolsProtocol.mod.Protocol.Target

import typings.devtoolsProtocol.mod.Protocol.Browser.BrowserContextID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBrowserContextResponse extends StObject {
  
  /**
    * The id of the context created.
    */
  var browserContextId: BrowserContextID
}
object CreateBrowserContextResponse {
  
  inline def apply(browserContextId: BrowserContextID): CreateBrowserContextResponse = {
    val __obj = js.Dynamic.literal(browserContextId = browserContextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBrowserContextResponse]
  }
  
  extension [Self <: CreateBrowserContextResponse](x: Self) {
    
    inline def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
  }
}
