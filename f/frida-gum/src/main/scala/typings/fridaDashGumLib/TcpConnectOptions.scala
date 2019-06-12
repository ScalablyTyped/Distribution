package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpConnectOptions extends SocketConnectOptions {
  /**
    * Address family. Omit to determine based on the host specified.
    */
  var family: js.UndefOr[
    fridaDashGumLib.fridaDashGumLibStrings.ipv4 | fridaDashGumLib.fridaDashGumLibStrings.ipv6
  ] = js.undefined
  /**
    * Host or IP address to connect to. Defaults to `localhost`.
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * IP port to connect to.
    */
  var port: scala.Double
  /**
    * Whether to create a TLS connection. Defaults to `false`.
    */
  var tls: js.UndefOr[scala.Boolean] = js.undefined
}

object TcpConnectOptions {
  @scala.inline
  def apply(
    port: scala.Double,
    family: fridaDashGumLib.fridaDashGumLibStrings.ipv4 | fridaDashGumLib.fridaDashGumLibStrings.ipv6 = null,
    host: java.lang.String = null,
    tls: js.UndefOr[scala.Boolean] = js.undefined
  ): TcpConnectOptions = {
    val __obj = js.Dynamic.literal(port = port)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls)
    __obj.asInstanceOf[TcpConnectOptions]
  }
}

