package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteBrowserCommandRequest extends StObject {
  
  var commandId: BrowserCommandId
}
object ExecuteBrowserCommandRequest {
  
  inline def apply(commandId: BrowserCommandId): ExecuteBrowserCommandRequest = {
    val __obj = js.Dynamic.literal(commandId = commandId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteBrowserCommandRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteBrowserCommandRequest] (val x: Self) extends AnyVal {
    
    inline def setCommandId(value: BrowserCommandId): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
  }
}
