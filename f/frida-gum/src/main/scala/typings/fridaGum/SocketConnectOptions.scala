package typings.fridaGum

import typings.fridaGum.fridaGumStrings.ipv4
import typings.fridaGum.fridaGumStrings.ipv6
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
  def TcpConnectOptions(
    port: Double,
    family: ipv4 | ipv6 = null,
    host: String = null,
    tls: js.UndefOr[Boolean] = js.undefined
  ): SocketConnectOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketConnectOptions]
  }
  @scala.inline
  def UnixConnectOptions(family: unix, path: String, tls: js.UndefOr[Boolean] = js.undefined, `type`: UnixSocketType = null): SocketConnectOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketConnectOptions]
  }
}

