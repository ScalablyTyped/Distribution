package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TCP and UNIX sockets.
  */
@JSGlobal("Socket")
@js.native
object SocketNs extends js.Object {
  /**
    * Connects to a TCP or UNIX server.
    */
  def connect(options: fridaDashGumLib.SocketConnectOptions): js.Promise[fridaDashGumLib.SocketConnection] = js.native
  /**
    * Opens a TCP or UNIX listening socket.
    *
    * Defaults to listening on both IPv4 and IPv6, if supported, and binding on all interfaces on a randomly
    * selected port.
    */
  def listen(): js.Promise[fridaDashGumLib.SocketListener] = js.native
  def listen(options: fridaDashGumLib.SocketListenOptions): js.Promise[fridaDashGumLib.SocketListener] = js.native
  /**
    * Inspects the OS socket `handle` and returns its local address, or `null` if invalid or unknown.
    */
  def localAddress(handle: scala.Double): fridaDashGumLib.SocketEndpointAddress | scala.Null = js.native
  /**
    * Inspects the OS socket `handle` and returns its peer address, or `null` if invalid or unknown.
    */
  def peerAddress(handle: scala.Double): fridaDashGumLib.SocketEndpointAddress | scala.Null = js.native
  /**
    * Inspects the OS socket `handle` and returns its type, or `null` if invalid or unknown.
    */
  def `type`(handle: scala.Double): fridaDashGumLib.SocketType | scala.Null = js.native
}

