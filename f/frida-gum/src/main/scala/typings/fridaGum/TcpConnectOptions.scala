package typings.fridaGum

import typings.fridaGum.fridaGumStrings.ipv4
import typings.fridaGum.fridaGumStrings.ipv6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpConnectOptions extends SocketConnectOptions {
  /**
    * Address family. Omit to determine based on the host specified.
    */
  var family: js.UndefOr[ipv4 | ipv6] = js.undefined
  /**
    * Host or IP address to connect to. Defaults to `localhost`.
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * IP port to connect to.
    */
  var port: Double
  /**
    * Whether to create a TLS connection. Defaults to `false`.
    */
  var tls: js.UndefOr[Boolean] = js.undefined
}

object TcpConnectOptions {
  @scala.inline
  def apply(
    port: Double,
    family: ipv4 | ipv6 = null,
    host: String = null,
    tls: js.UndefOr[Boolean] = js.undefined
  ): TcpConnectOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpConnectOptions]
  }
}

