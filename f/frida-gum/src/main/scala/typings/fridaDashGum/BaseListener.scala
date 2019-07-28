package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseListener extends js.Object {
  /**
    * Waits for the next client to connect.
    */
  def accept(): js.Promise[SocketConnection]
  /**
    * Closes the listener, releasing resources related to it. Once the listener is closed, all other operations
    * will fail. Closing a listener multiple times is allowed and will not result in an error.
    */
  def close(): js.Promise[Unit]
}

object BaseListener {
  @scala.inline
  def apply(accept: () => js.Promise[SocketConnection], close: () => js.Promise[Unit]): BaseListener = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), close = js.Any.fromFunction0(close))
  
    __obj.asInstanceOf[BaseListener]
  }
}

