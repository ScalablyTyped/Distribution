package typings.easyXapiSupertest

import typings.easyXapiSupertest.NodeJS.Timer
import typings.easyXapiSupertest.anon.Address
import typings.easyXapiSupertest.eventsMod.EventEmitter
import typings.easyXapiSupertest.netMod.Socket
import typings.easyXapiSupertest.streamMod.Readable
import typings.easyXapiSupertest.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("http", "Agent")
  @js.native
  class Agent () extends StObject {
    def this(opts: AgentOptions) = this()
    
    /**
    		 * Destroy any sockets that are currently in use by the agent.
    		 * It is usually not necessary to do this. However, if you are using an agent with KeepAlive enabled,
    		 * then it is best to explicitly shut down the agent when you know that it will no longer be used. Otherwise,
    		 * sockets may hang open for quite a long time before the server terminates them.
    		 */
    def destroy(): Unit = js.native
    
    var maxSockets: Double = js.native
    
    var requests: js.Any = js.native
    
    var sockets: js.Any = js.native
  }
  
  @JSImport("http", "METHODS")
  @js.native
  def METHODS: js.Array[String] = js.native
  @scala.inline
  def METHODS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METHODS")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def createClient(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")().asInstanceOf[js.Any]
  @scala.inline
  def createClient(port: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(port.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def createClient(port: Double, host: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createClient(port: Unit, host: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def createServer(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Server]
  @scala.inline
  def createServer(requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit]): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(requestListener.asInstanceOf[js.Any]).asInstanceOf[Server]
  
  @scala.inline
  def get(options: js.Any): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  @scala.inline
  def get(options: js.Any, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  
  @JSImport("http", "globalAgent")
  @js.native
  def globalAgent: Agent = js.native
  @scala.inline
  def globalAgent_=(x: Agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAgent")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def request(options: js.Any): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  @scala.inline
  def request(options: js.Any, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  
  trait AgentOptions extends StObject {
    
    /**
    		 * Keep sockets around in a pool to be used by other requests in the future. Default = false
    		 */
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    /**
    		 * When using HTTP KeepAlive, how often to send TCP KeepAlive packets over sockets being kept alive. Default = 1000.
    		 * Only relevant if keepAlive is set to true.
    		 */
    var keepAliveMsecs: js.UndefOr[Double] = js.undefined
    
    /**
    		 * Maximum number of sockets to leave open in a free state. Only relevant if keepAlive is set to true. Default = 256.
    		 */
    var maxFreeSockets: js.UndefOr[Double] = js.undefined
    
    /**
    		 * Maximum number of sockets to allow per host. Default for Node 0.10 is 5, default for Node 0.12 is Infinity
    		 */
    var maxSockets: js.UndefOr[Double] = js.undefined
  }
  object AgentOptions {
    
    @scala.inline
    def apply(): AgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgentOptions]
    }
    
    @scala.inline
    implicit class AgentOptionsMutableBuilder[Self <: AgentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveMsecs(value: Double): Self = StObject.set(x, "keepAliveMsecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveMsecsUndefined: Self = StObject.set(x, "keepAliveMsecs", js.undefined)
      
      @scala.inline
      def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      @scala.inline
      def setMaxFreeSockets(value: Double): Self = StObject.set(x, "maxFreeSockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFreeSocketsUndefined: Self = StObject.set(x, "maxFreeSockets", js.undefined)
      
      @scala.inline
      def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
    }
  }
  
  @js.native
  trait ClientRequest extends Writable {
    
    def abort(): Unit = js.native
    
    def end(data: js.Any): Unit = js.native
    def end(data: js.Any, encoding: String): Unit = js.native
    def end(data: Unit, encoding: String): Unit = js.native
    
    def setNoDelay(): Unit = js.native
    def setNoDelay(noDelay: Boolean): Unit = js.native
    
    def setSocketKeepAlive(): Unit = js.native
    def setSocketKeepAlive(enable: Boolean): Unit = js.native
    def setSocketKeepAlive(enable: Boolean, initialDelay: Double): Unit = js.native
    def setSocketKeepAlive(enable: Unit, initialDelay: Double): Unit = js.native
    
    def setTimeout(timeout: Double): Unit = js.native
    def setTimeout(timeout: Double, callback: js.Function): Unit = js.native
    
    def write(chunk: js.Any): Unit = js.native
    def write(chunk: js.Any, encoding: String): Unit = js.native
    def write(str: String, encoding: String, fd: String): Boolean = js.native
    def write(str: String, encoding: Unit, fd: String): Boolean = js.native
  }
  
  type ClientResponse = IncomingMessage
  
  @js.native
  trait IncomingMessage extends Readable {
    
    var headers: js.Any = js.native
    
    var httpVersion: String = js.native
    
    /**
      * Only valid for request obtained from http.Server.
      */
    var method: js.UndefOr[String] = js.native
    
    var rawHeaders: js.Array[String] = js.native
    
    var rawTrailers: js.Any = js.native
    
    def setTimeout(msecs: Double, callback: js.Function): Timer = js.native
    
    var socket: Socket = js.native
    
    /**
      * Only valid for response obtained from http.ClientRequest.
      */
    var statusCode: js.UndefOr[Double] = js.native
    
    /**
      * Only valid for response obtained from http.ClientRequest.
      */
    var statusMessage: js.UndefOr[String] = js.native
    
    var trailers: js.Any = js.native
    
    /**
      * Only valid for request obtained from http.Server.
      */
    var url: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait Server extends EventEmitter {
    
    def address(): Address = js.native
    
    def close(): Server = js.native
    def close(cb: js.Any): Server = js.native
    
    def listen(handle: js.Any): Server = js.native
    def listen(handle: js.Any, listeningListener: js.Function): Server = js.native
    def listen(path: String): Server = js.native
    def listen(path: String, callback: js.Function): Server = js.native
    def listen(port: Double): Server = js.native
    def listen(port: Double, hostname: String): Server = js.native
    def listen(port: Double, hostname: String, backlog: Double): Server = js.native
    def listen(port: Double, hostname: String, backlog: Double, callback: js.Function): Server = js.native
    def listen(port: Double, hostname: String, backlog: Unit, callback: js.Function): Server = js.native
    def listen(port: Double, hostname: String, callback: js.Function): Server = js.native
    def listen(port: Double, hostname: Unit, backlog: Double): Server = js.native
    def listen(port: Double, hostname: Unit, backlog: Double, callback: js.Function): Server = js.native
    def listen(port: Double, hostname: Unit, backlog: Unit, callback: js.Function): Server = js.native
    def listen(port: Double, hostname: Unit, callback: js.Function): Server = js.native
    
    var maxHeadersCount: Double = js.native
  }
  
  @js.native
  trait ServerRequest extends IncomingMessage {
    
    var connection: Socket = js.native
  }
  
  @js.native
  trait ServerResponse extends Writable {
    
    def addTrailers(headers: js.Any): Unit = js.native
    
    def end(data: js.Any): Unit = js.native
    def end(data: js.Any, encoding: String): Unit = js.native
    def end(data: Unit, encoding: String): Unit = js.native
    
    def getHeader(name: String): String = js.native
    
    def removeHeader(name: String): Unit = js.native
    
    var sendDate: Boolean = js.native
    
    def setHeader(name: String, value: String): Unit = js.native
    
    var statusCode: Double = js.native
    
    def write(chunk: js.Any): js.Any = js.native
    def write(chunk: js.Any, encoding: String): js.Any = js.native
    def write(str: String, encoding: String, fd: String): Boolean = js.native
    def write(str: String, encoding: Unit, fd: String): Boolean = js.native
    
    def writeContinue(): Unit = js.native
    
    def writeHead(statusCode: Double): Unit = js.native
    def writeHead(statusCode: Double, headers: js.Any): Unit = js.native
    def writeHead(statusCode: Double, reasonPhrase: String): Unit = js.native
    def writeHead(statusCode: Double, reasonPhrase: String, headers: js.Any): Unit = js.native
    def writeHead(statusCode: Double, reasonPhrase: Unit, headers: js.Any): Unit = js.native
  }
}
