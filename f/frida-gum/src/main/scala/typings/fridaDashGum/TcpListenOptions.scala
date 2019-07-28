package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.ipv4
import typings.fridaDashGum.fridaDashGumStrings.ipv6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpListenOptions
  extends BaseListenOptions
     with SocketListenOptions {
  /**
    * Address family. Omit to listen on both ipv4 and ipv6 – if supported by the OS.
    */
  var family: js.UndefOr[ipv4 | ipv6] = js.undefined
  /**
    * Host or IP address to listen on. Omit to listen on all interfaces.
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * Port to listen on. Omit to listen on a randomly selected port.
    */
  var port: js.UndefOr[Double] = js.undefined
}

object TcpListenOptions {
  @scala.inline
  def apply(
    backlog: Int | Double = null,
    family: ipv4 | ipv6 = null,
    host: String = null,
    port: Int | Double = null
  ): TcpListenOptions = {
    val __obj = js.Dynamic.literal()
    if (backlog != null) __obj.updateDynamic("backlog")(backlog.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpListenOptions]
  }
}

