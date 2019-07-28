package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpEndpointAddress extends SocketEndpointAddress {
  /**
    * IP address.
    */
  var ip: String
  /**
    * Port.
    */
  var port: Double
}

object TcpEndpointAddress {
  @scala.inline
  def apply(ip: String, port: Double): TcpEndpointAddress = {
    val __obj = js.Dynamic.literal(ip = ip, port = port)
  
    __obj.asInstanceOf[TcpEndpointAddress]
  }
}

