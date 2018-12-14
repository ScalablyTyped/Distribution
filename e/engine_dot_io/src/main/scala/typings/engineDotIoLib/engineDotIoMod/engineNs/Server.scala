package typings
package engineDotIoLib.engineDotIoMod.engineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The main server/manager. Inherits from EventEmitter.
	 */
@js.native
trait Server
  extends nodeLib.eventsMod.EventEmitter {
  /**
  		 * hash of connected clients by id.
  		 */
  var clients: org.scalablytyped.runtime.StringDictionary[Socket] = js.native
  /**
  		 * number of connected clients.
  		 */
  var clientsCount: scala.Double = js.native
  val httpServer: js.UndefOr[nodeLib.httpMod.Server] = js.native
  /**
  		 * Attach this Server instance to an http.Server
  		 * Captures upgrade requests for a http.Server. In other words, makes a regular http.Server WebSocket-compatible.
  		 */
  def attach(http: nodeLib.httpMod.Server): this.type = js.native
  /**
  		 * Attach this Server instance to an http.Server
  		 * Captures upgrade requests for a http.Server. In other words, makes a regular http.Server WebSocket-compatible.
  		 */
  def attach(http: nodeLib.httpMod.Server, opts: AttachOptions): this.type = js.native
  /**
  		 * Closes all clients
  		 */
  def close(): this.type = js.native
  /**
  		 * Generate a socket id.
  		 * Overwrite this method to generate your custom socket id.
  		 */
  def generateId(req: nodeLib.httpMod.IncomingMessage): java.lang.String = js.native
  /**
  		 * Called internally when a Engine request is intercepted.
  		 */
  def handleRequest(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): this.type = js.native
  /**
  		 * Called internally when a Engine ws upgrade is intercepted.
  		 */
  def handleUpgrade(req: nodeLib.httpMod.IncomingMessage, socket: nodeLib.netMod.Socket, head: nodeLib.Buffer): this.type = js.native
  /**
  		 * Fired when a new connection is established.
  		 */
  @JSName("on")
  def on_connection(
    ev: engineDotIoLib.engineDotIoLibStrings.connection,
    fn: js.Function1[/* socket */ Socket, scala.Unit]
  ): this.type = js.native
  /**
  		 * Fired when a new connection is established.
  		 */
  @JSName("on")
  def on_drain(ev: engineDotIoLib.engineDotIoLibStrings.drain, fn: js.Function1[/* socket */ Socket, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_flush(
    ev: engineDotIoLib.engineDotIoLibStrings.flush,
    fn: js.Function2[/* socket */ Socket, /* buffer */ js.Array[Packet], scala.Unit]
  ): this.type = js.native
}

