package typings.devtoolsProtocol.mod.Protocol.Target

import typings.devtoolsProtocol.mod.Protocol.Browser.BrowserContextID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBrowserContextsResponse extends StObject {
  
  /**
    * An array of browser context ids.
    */
  var browserContextIds: js.Array[BrowserContextID]
}
object GetBrowserContextsResponse {
  
  inline def apply(browserContextIds: js.Array[BrowserContextID]): GetBrowserContextsResponse = {
    val __obj = js.Dynamic.literal(browserContextIds = browserContextIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBrowserContextsResponse]
  }
  
  extension [Self <: GetBrowserContextsResponse](x: Self) {
    
    inline def setBrowserContextIds(value: js.Array[BrowserContextID]): Self = StObject.set(x, "browserContextIds", value.asInstanceOf[js.Any])
    
    inline def setBrowserContextIdsVarargs(value: BrowserContextID*): Self = StObject.set(x, "browserContextIds", js.Array(value :_*))
  }
}
