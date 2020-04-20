package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnixEndpointAddress extends SocketEndpointAddress {
  /**
    * UNIX socket path.
    */
  var path: String
}

object UnixEndpointAddress {
  @scala.inline
  def apply(path: String): UnixEndpointAddress = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixEndpointAddress]
  }
}

