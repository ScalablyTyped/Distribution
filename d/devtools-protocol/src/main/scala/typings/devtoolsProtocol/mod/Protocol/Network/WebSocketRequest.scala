package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketRequest extends StObject {
  
  /**
    * HTTP request headers.
    */
  var headers: Headers = js.native
}
object WebSocketRequest {
  
  @scala.inline
  def apply(headers: Headers): WebSocketRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketRequest]
  }
  
  @scala.inline
  implicit class WebSocketRequestMutableBuilder[Self <: WebSocketRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
