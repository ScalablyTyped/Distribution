package typings.fridaGum

import typings.fridaGum.fridaGumStrings.unix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.TcpConnectOptions
  - typings.fridaGum.UnixConnectOptions
*/
trait SocketConnectOptions extends js.Object

object SocketConnectOptions {
  @scala.inline
  def TcpConnectOptions(port: Double): SocketConnectOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketConnectOptions]
  }
  @scala.inline
  def UnixConnectOptions(family: unix, path: String): SocketConnectOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketConnectOptions]
  }
}

