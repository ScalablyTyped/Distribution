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
  
  @scala.inline
  def apply(browserContextIds: js.Array[BrowserContextID]): GetBrowserContextsResponse = {
    val __obj = js.Dynamic.literal(browserContextIds = browserContextIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBrowserContextsResponse]
  }
  
  @scala.inline
  implicit class GetBrowserContextsResponseMutableBuilder[Self <: GetBrowserContextsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowserContextIds(value: js.Array[BrowserContextID]): Self = StObject.set(x, "browserContextIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserContextIdsVarargs(value: BrowserContextID*): Self = StObject.set(x, "browserContextIds", js.Array(value :_*))
  }
}
