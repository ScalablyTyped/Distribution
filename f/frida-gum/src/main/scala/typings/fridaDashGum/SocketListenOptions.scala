package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.ipv4
import typings.fridaDashGum.fridaDashGumStrings.ipv6
import typings.fridaDashGum.fridaDashGumStrings.unix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.TcpListenOptions
  - typings.fridaDashGum.UnixListenOptions
*/
trait SocketListenOptions extends js.Object

object SocketListenOptions {
  @scala.inline
  def TcpListenOptions(
    backlog: Int | Double = null,
    family: ipv4 | ipv6 = null,
    host: String = null,
    port: Int | Double = null
  ): SocketListenOptions = {
    val __obj = js.Dynamic.literal()
    if (backlog != null) __obj.updateDynamic("backlog")(backlog.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketListenOptions]
  }
  @scala.inline
  def UnixListenOptions(family: unix, path: String, backlog: Int | Double = null, `type`: UnixSocketType = null): SocketListenOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (backlog != null) __obj.updateDynamic("backlog")(backlog.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketListenOptions]
  }
}

