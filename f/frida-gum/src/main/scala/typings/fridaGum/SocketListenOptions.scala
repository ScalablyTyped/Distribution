package typings.fridaGum

import typings.fridaGum.fridaGumStrings.ipv4
import typings.fridaGum.fridaGumStrings.ipv6
import typings.fridaGum.fridaGumStrings.unix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.TcpListenOptions
  - typings.fridaGum.UnixListenOptions
*/
trait SocketListenOptions extends js.Object

object SocketListenOptions {
  @scala.inline
  def TcpListenOptions(
    backlog: js.UndefOr[Double] = js.undefined,
    family: ipv4 | ipv6 = null,
    host: String = null,
    port: js.UndefOr[Double] = js.undefined
  ): SocketListenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backlog)) __obj.updateDynamic("backlog")(backlog.get.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketListenOptions]
  }
  @scala.inline
  def UnixListenOptions(
    family: unix,
    path: String,
    backlog: js.UndefOr[Double] = js.undefined,
    `type`: UnixSocketType = null
  ): SocketListenOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(backlog)) __obj.updateDynamic("backlog")(backlog.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketListenOptions]
  }
}

