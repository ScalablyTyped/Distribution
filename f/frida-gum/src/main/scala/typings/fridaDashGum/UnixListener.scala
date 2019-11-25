package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnixListener
  extends BaseListener
     with SocketListener {
  /**
    * Path being listened on.
    */
  var path: String
}

object UnixListener {
  @scala.inline
  def apply(accept: () => js.Promise[SocketConnection], close: () => js.Promise[Unit], path: String): UnixListener = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), close = js.Any.fromFunction0(close), path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnixListener]
  }
}

