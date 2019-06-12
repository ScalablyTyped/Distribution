package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpEndpointAddress extends SocketEndpointAddress {
  /**
    * IP address.
    */
  var ip: java.lang.String
  /**
    * Port.
    */
  var port: scala.Double
}

object TcpEndpointAddress {
  @scala.inline
  def apply(ip: java.lang.String, port: scala.Double): TcpEndpointAddress = {
    val __obj = js.Dynamic.literal(ip = ip, port = port)
  
    __obj.asInstanceOf[TcpEndpointAddress]
  }
}

