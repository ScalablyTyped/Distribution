package typings.fridaGum

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
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TcpEndpointAddress]
  }
}

