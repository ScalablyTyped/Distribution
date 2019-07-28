package typings.globalDashTunnelDashNg.globalDashTunnelDashNgMod

import org.scalablytyped.runtime.StringDictionary
import typings.globalDashTunnelDashNg.globalDashTunnelDashNgStrings.`http:`
import typings.globalDashTunnelDashNg.globalDashTunnelDashNgStrings.`https:`
import typings.globalDashTunnelDashNg.globalDashTunnelDashNgStrings.both
import typings.globalDashTunnelDashNg.globalDashTunnelDashNgStrings.https
import typings.globalDashTunnelDashNg.globalDashTunnelDashNgStrings.neither
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var connect: js.UndefOr[neither | https | both] = js.undefined
  var host: String
  var originHttpsOptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var port: Double
  var protocol: js.UndefOr[`http:` | `https:`] = js.undefined
  var proxyAuth: js.UndefOr[String] = js.undefined
  var proxyHttpsOptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var sockets: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    host: String,
    port: Double,
    connect: neither | https | both = null,
    originHttpsOptions: StringDictionary[js.Any] = null,
    protocol: `http:` | `https:` = null,
    proxyAuth: String = null,
    proxyHttpsOptions: StringDictionary[js.Any] = null,
    sockets: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(host = host, port = port)
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (originHttpsOptions != null) __obj.updateDynamic("originHttpsOptions")(originHttpsOptions)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (proxyAuth != null) __obj.updateDynamic("proxyAuth")(proxyAuth)
    if (proxyHttpsOptions != null) __obj.updateDynamic("proxyHttpsOptions")(proxyHttpsOptions)
    if (sockets != null) __obj.updateDynamic("sockets")(sockets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

