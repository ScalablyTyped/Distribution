package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpListenOptions
  extends BaseListenOptions
     with SocketListenOptions {
  /**
    * Address family. Omit to listen on both ipv4 and ipv6 – if supported by the OS.
    */
  var family: js.UndefOr[
    fridaDashGumLib.fridaDashGumLibStrings.ipv4 | fridaDashGumLib.fridaDashGumLibStrings.ipv6
  ] = js.undefined
  /**
    * Host or IP address to listen on. Omit to listen on all interfaces.
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Port to listen on. Omit to listen on a randomly selected port.
    */
  var port: js.UndefOr[scala.Double] = js.undefined
}

object TcpListenOptions {
  @scala.inline
  def apply(
    backlog: scala.Int | scala.Double = null,
    family: fridaDashGumLib.fridaDashGumLibStrings.ipv4 | fridaDashGumLib.fridaDashGumLibStrings.ipv6 = null,
    host: java.lang.String = null,
    port: scala.Int | scala.Double = null
  ): TcpListenOptions = {
    val __obj = js.Dynamic.literal()
    if (backlog != null) __obj.updateDynamic("backlog")(backlog.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpListenOptions]
  }
}

