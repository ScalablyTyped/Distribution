package typings.devtoolsProtocol.mod.Protocol.Target

import typings.devtoolsProtocol.mod.Protocol.Browser.BrowserContextID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisposeBrowserContextRequest extends StObject {
  
  var browserContextId: BrowserContextID = js.native
}
object DisposeBrowserContextRequest {
  
  @scala.inline
  def apply(browserContextId: BrowserContextID): DisposeBrowserContextRequest = {
    val __obj = js.Dynamic.literal(browserContextId = browserContextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisposeBrowserContextRequest]
  }
  
  @scala.inline
  implicit class DisposeBrowserContextRequestMutableBuilder[Self <: DisposeBrowserContextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
  }
}
