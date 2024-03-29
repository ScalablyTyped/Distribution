package typings.devtoolsProtocol.mod.Protocol.Target

import typings.devtoolsProtocol.mod.Protocol.Browser.BrowserContextID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisposeBrowserContextRequest extends StObject {
  
  var browserContextId: BrowserContextID
}
object DisposeBrowserContextRequest {
  
  inline def apply(browserContextId: BrowserContextID): DisposeBrowserContextRequest = {
    val __obj = js.Dynamic.literal(browserContextId = browserContextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisposeBrowserContextRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisposeBrowserContextRequest] (val x: Self) extends AnyVal {
    
    inline def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
  }
}
