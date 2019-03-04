package typings
package freedomLib.freedomNs.TcpSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectInfo extends js.Object {
  var host: java.lang.String
  var port: scala.Double
  var socket: scala.Double
}

object ConnectInfo {
  @scala.inline
  def apply(host: java.lang.String, port: scala.Double, socket: scala.Double): ConnectInfo = {
    val __obj = js.Dynamic.literal(host = host, port = port, socket = socket)
  
    __obj.asInstanceOf[ConnectInfo]
  }
}

