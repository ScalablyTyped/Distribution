package typings.engineIo.mod

import org.scalablytyped.runtime.StringDictionary
import typings.engineIo.engineIoStrings.connection
import typings.engineIo.engineIoStrings.drain
import typings.engineIo.engineIoStrings.flush
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The main server/manager. Inherits from EventEmitter.
  */
@JSImport("engine.io", "Server")
@js.native
/**
  * Initializes the server
  */
class Server () extends EventEmitter {
  def this(opts: ServerOptions) = this()
  
  /**
    * Attach this Server instance to an http.Server
    * Captures upgrade requests for a http.Server. In other words, makes a regular http.Server WebSocket-compatible.
    */
  def attach(http: typings.node.httpMod.Server): this.type = js.native
  def attach(http: typings.node.httpMod.Server, opts: AttachOptions): this.type = js.native
  
  /**
    * hash of connected clients by id.
    */
  var clients: StringDictionary[Socket] = js.native
  
  /**
    * number of connected clients.
    */
  var clientsCount: Double = js.native
  
  /**
    * Closes all clients
    */
  def close(): this.type = js.native
  
  /**
    * Generate a socket id.
    * Overwrite this method to generate your custom socket id.
    */
  def generateId(req: IncomingMessage): String = js.native
  
  /**
    * Called internally when a Engine request is intercepted.
    */
  def handleRequest(req: IncomingMessage, res: ServerResponse): this.type = js.native
  
  /**
    * Called internally when a Engine ws upgrade is intercepted.
    */
  def handleUpgrade(req: IncomingMessage, socket: typings.node.netMod.Socket, head: Buffer): this.type = js.native
  
  val httpServer: js.UndefOr[typings.node.httpMod.Server] = js.native
  
  /**
    * Fired when a new connection is established.
    */
  @JSName("on")
  def on_connection(ev: connection, fn: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("on")
  def on_drain(ev: drain, fn: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("on")
  def on_flush(ev: flush, fn: js.Function2[/* socket */ Socket, /* buffer */ js.Array[Packet], Unit]): this.type = js.native
}
