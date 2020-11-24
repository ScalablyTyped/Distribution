package typings.ethersprojectProviders

import typings.node.httpMod.ClientRequestArgs
import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import typings.node.urlMod.URL_
import typings.ws.mod.ClientOptions
import typings.ws.mod.ServerOptions
import typings.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers/lib/ws", JSImport.Namespace)
@js.native
object wsMod extends js.Object {
  
  // WebSocket socket.
  @js.native
  class WebSocket protected () extends ^ {
    def this(address: String) = this()
    def this(address: URL_) = this()
    def this(address: String, options: ClientRequestArgs) = this()
    def this(address: String, options: ClientOptions) = this()
    def this(address: String, protocols: String) = this()
    def this(address: String, protocols: js.Array[String]) = this()
    def this(address: URL_, options: ClientRequestArgs) = this()
    def this(address: URL_, options: ClientOptions) = this()
    def this(address: URL_, protocols: String) = this()
    def this(address: URL_, protocols: js.Array[String]) = this()
    def this(address: String, protocols: js.UndefOr[scala.Nothing], options: ClientRequestArgs) = this()
    def this(address: String, protocols: js.UndefOr[scala.Nothing], options: ClientOptions) = this()
    def this(address: String, protocols: String, options: ClientRequestArgs) = this()
    def this(address: String, protocols: String, options: ClientOptions) = this()
    def this(address: String, protocols: js.Array[String], options: ClientRequestArgs) = this()
    def this(address: String, protocols: js.Array[String], options: ClientOptions) = this()
    def this(address: URL_, protocols: js.UndefOr[scala.Nothing], options: ClientRequestArgs) = this()
    def this(address: URL_, protocols: js.UndefOr[scala.Nothing], options: ClientOptions) = this()
    def this(address: URL_, protocols: String, options: ClientRequestArgs) = this()
    def this(address: URL_, protocols: String, options: ClientOptions) = this()
    def this(address: URL_, protocols: js.Array[String], options: ClientRequestArgs) = this()
    def this(address: URL_, protocols: js.Array[String], options: ClientOptions) = this()
  }
  /* static members */
  @js.native
  object WebSocket extends js.Object {
    
    var CLOSED: Double = js.native
    
    var CLOSING: Double = js.native
    
    var CONNECTING: Double = js.native
    
    var OPEN: Double = js.native
    
    // WebSocket stream
    def createWebSocketStream(websocket: typings.ws.mod.WebSocket): Duplex = js.native
    def createWebSocketStream(websocket: typings.ws.mod.WebSocket, options: DuplexOptions): Duplex = js.native
    
    // WebSocket Server
    @js.native
    class Server ()
      extends typings.ws.mod.Server {
      def this(options: ServerOptions) = this()
      def this(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]) = this()
      def this(options: ServerOptions, callback: js.Function0[Unit]) = this()
    }
  }
}
