package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Listener created by `Socket.listen()`.
  */
/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.TcpListener
  - typings.fridaDashGum.UnixListener
*/
trait SocketListener extends js.Object

object SocketListener {
  @scala.inline
  def TcpListener(accept: () => js.Promise[SocketConnection], close: () => js.Promise[Unit], port: Double): SocketListener = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), close = js.Any.fromFunction0(close), port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SocketListener]
  }
  @scala.inline
  def UnixListener(accept: () => js.Promise[SocketConnection], close: () => js.Promise[Unit], path: String): SocketListener = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), close = js.Any.fromFunction0(close), path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SocketListener]
  }
}

