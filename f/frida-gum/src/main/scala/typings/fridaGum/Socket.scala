package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TCP and UNIX sockets.
  */
@JSGlobal("Socket")
@js.native
object Socket extends js.Object {
  /**
    * Connects to a TCP or UNIX server.
    */
  def connect(options: SocketConnectOptions): js.Promise[SocketConnection] = js.native
  /**
    * Opens a TCP or UNIX listening socket.
    *
    * Defaults to listening on both IPv4 and IPv6, if supported, and binding on all interfaces on a randomly
    * selected port.
    */
  def listen(): js.Promise[SocketListener] = js.native
  def listen(options: SocketListenOptions): js.Promise[SocketListener] = js.native
  /**
    * Inspects the OS socket `handle` and returns its local address, or `null` if invalid or unknown.
    */
  def localAddress(handle: Double): SocketEndpointAddress | Null = js.native
  /**
    * Inspects the OS socket `handle` and returns its peer address, or `null` if invalid or unknown.
    */
  def peerAddress(handle: Double): SocketEndpointAddress | Null = js.native
  /**
    * Inspects the OS socket `handle` and returns its type, or `null` if invalid or unknown.
    */
  def `type`(handle: Double): SocketType | Null = js.native
}

