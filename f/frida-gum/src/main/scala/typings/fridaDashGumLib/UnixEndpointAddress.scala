package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnixEndpointAddress extends SocketEndpointAddress {
  /**
    * UNIX socket path.
    */
  var path: java.lang.String
}

object UnixEndpointAddress {
  @scala.inline
  def apply(path: java.lang.String): UnixEndpointAddress = {
    val __obj = js.Dynamic.literal(path = path)
  
    __obj.asInstanceOf[UnixEndpointAddress]
  }
}

