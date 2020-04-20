package typings.freedom.freedom.TcpSocket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectInfo extends js.Object {
  var host: String
  var port: Double
  var socket: Double
}

object ConnectInfo {
  @scala.inline
  def apply(host: String, port: Double, socket: Double): ConnectInfo = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectInfo]
  }
}

