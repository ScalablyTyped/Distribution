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
  
  @scala.inline
  def apply(browserContextId: BrowserContextID): CreateBrowserContextResponse = {
    val __obj = js.Dynamic.literal(browserContextId = browserContextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBrowserContextResponse]
  }
  
  @scala.inline
  implicit class CreateBrowserContextResponseMutableBuilder[Self <: CreateBrowserContextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
  }
}
