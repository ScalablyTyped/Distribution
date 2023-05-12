package typings.ethers

import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderSocketMod.SocketProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersProviderWebsocketMod {
  
  @JSImport("ethers/types/providers/provider-websocket", "WebSocketProvider")
  @js.native
  open class WebSocketProvider protected () extends SocketProvider {
    def this(url: String) = this()
    def this(url: WebSocketCreator) = this()
    def this(url: WebSocketLike) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: WebSocketCreator, network: Networkish) = this()
    def this(url: WebSocketLike, network: Networkish) = this()
    
    def websocket: WebSocketLike = js.native
  }
  
  type WebSocketCreator = js.Function0[WebSocketLike]
  
  @js.native
  trait WebSocketLike extends StObject {
    
    def close(): Unit = js.native
    def close(code: Double): Unit = js.native
    def close(code: Double, reason: String): Unit = js.native
    def close(code: Unit, reason: String): Unit = js.native
    
    var onerror: Null | (js.Function1[/* repeated */ Any, Any]) = js.native
    
    var onmessage: Null | (js.Function1[/* repeated */ Any, Any]) = js.native
    
    var onopen: Null | (js.Function1[/* repeated */ Any, Any]) = js.native
    
    var readyState: Double = js.native
    
    def send(payload: Any): Unit = js.native
  }
}
