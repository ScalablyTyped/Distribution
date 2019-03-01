package typings
package globalDashTunnelDashNgLib.globalDashTunnelDashNgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var connect: js.UndefOr[
    globalDashTunnelDashNgLib.globalDashTunnelDashNgLibStrings.neither | globalDashTunnelDashNgLib.globalDashTunnelDashNgLibStrings.https | globalDashTunnelDashNgLib.globalDashTunnelDashNgLibStrings.both
  ] = js.undefined
  var host: java.lang.String
  var originHttpsOptions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var port: scala.Double
  var protocol: js.UndefOr[
    globalDashTunnelDashNgLib.globalDashTunnelDashNgLibStrings.`http:` | globalDashTunnelDashNgLib.globalDashTunnelDashNgLibStrings.`https:`
  ] = js.undefined
  var proxyAuth: js.UndefOr[java.lang.String] = js.undefined
  var proxyHttpsOptions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var sockets: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    host: java.lang.String,
    port: scala.Double,
    connect: globalDashTunnelDashNgLib.globalDashTunnelDashNgLibStrings.neither | globalDashTunnelDashNgLib.globalDashTunnelDashNgLibStrings.https | globalDashTunnelDashNgLib.globalDashTunnelDashNgLibStrings.both = null,
    originHttpsOptions: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    protocol: globalDashTunnelDashNgLib.globalDashTunnelDashNgLibStrings.`http:` | globalDashTunnelDashNgLib.globalDashTunnelDashNgLibStrings.`https:` = null,
    proxyAuth: java.lang.String = null,
    proxyHttpsOptions: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    sockets: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("port")(port)
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (originHttpsOptions != null) __obj.updateDynamic("originHttpsOptions")(originHttpsOptions)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (proxyAuth != null) __obj.updateDynamic("proxyAuth")(proxyAuth)
    if (proxyHttpsOptions != null) __obj.updateDynamic("proxyHttpsOptions")(proxyHttpsOptions)
    if (sockets != null) __obj.updateDynamic("sockets")(sockets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

