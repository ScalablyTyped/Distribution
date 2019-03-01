package typings
package firefoxDashWebextDashBrowserLib.browserNs.proxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* proxy types */
/** An object which describes proxy settings. */
trait ProxyConfig extends js.Object {
  /** A URL to use to configure the proxy. */
  var autoConfigUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Do not prompt for authentication if password is saved. */
  var autoLogin: js.UndefOr[scala.Boolean] = js.undefined
  /** The address of the ftp proxy, can include a port. */
  var ftp: js.UndefOr[java.lang.String] = js.undefined
  /** The address of the http proxy, can include a port. */
  var http: js.UndefOr[java.lang.String] = js.undefined
  /** Use the http proxy server for all protocols. */
  var httpProxyAll: js.UndefOr[scala.Boolean] = js.undefined
  /** A list of hosts which should not be proxied. */
  var passthrough: js.UndefOr[java.lang.String] = js.undefined
  /** Proxy DNS when using SOCKS v5. */
  var proxyDNS: js.UndefOr[scala.Boolean] = js.undefined
  /** The type of proxy to use. */
  var proxyType: js.UndefOr[_ProxyConfigProxyType] = js.undefined
  /** The address of the socks proxy, can include a port. */
  var socks: js.UndefOr[java.lang.String] = js.undefined
  /** The version of the socks proxy. */
  var socksVersion: js.UndefOr[scala.Double] = js.undefined
  /** The address of the ssl proxy, can include a port. */
  var ssl: js.UndefOr[java.lang.String] = js.undefined
}

object ProxyConfig {
  @scala.inline
  def apply(
    autoConfigUrl: java.lang.String = null,
    autoLogin: js.UndefOr[scala.Boolean] = js.undefined,
    ftp: java.lang.String = null,
    http: java.lang.String = null,
    httpProxyAll: js.UndefOr[scala.Boolean] = js.undefined,
    passthrough: java.lang.String = null,
    proxyDNS: js.UndefOr[scala.Boolean] = js.undefined,
    proxyType: _ProxyConfigProxyType = null,
    socks: java.lang.String = null,
    socksVersion: scala.Int | scala.Double = null,
    ssl: java.lang.String = null
  ): ProxyConfig = {
    val __obj = js.Dynamic.literal()
    if (autoConfigUrl != null) __obj.updateDynamic("autoConfigUrl")(autoConfigUrl)
    if (!js.isUndefined(autoLogin)) __obj.updateDynamic("autoLogin")(autoLogin)
    if (ftp != null) __obj.updateDynamic("ftp")(ftp)
    if (http != null) __obj.updateDynamic("http")(http)
    if (!js.isUndefined(httpProxyAll)) __obj.updateDynamic("httpProxyAll")(httpProxyAll)
    if (passthrough != null) __obj.updateDynamic("passthrough")(passthrough)
    if (!js.isUndefined(proxyDNS)) __obj.updateDynamic("proxyDNS")(proxyDNS)
    if (proxyType != null) __obj.updateDynamic("proxyType")(proxyType)
    if (socks != null) __obj.updateDynamic("socks")(socks)
    if (socksVersion != null) __obj.updateDynamic("socksVersion")(socksVersion.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    __obj.asInstanceOf[ProxyConfig]
  }
}

