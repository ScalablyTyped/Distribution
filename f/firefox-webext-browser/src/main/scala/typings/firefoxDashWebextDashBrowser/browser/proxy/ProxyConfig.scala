package typings.firefoxDashWebextDashBrowser.browser.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* proxy types */
/** An object which describes proxy settings. */
trait ProxyConfig extends js.Object {
  /** A URL to use to configure the proxy. */
  var autoConfigUrl: js.UndefOr[String] = js.undefined
  /** Do not prompt for authentication if password is saved. */
  var autoLogin: js.UndefOr[Boolean] = js.undefined
  /** The address of the ftp proxy, can include a port. */
  var ftp: js.UndefOr[String] = js.undefined
  /** The address of the http proxy, can include a port. */
  var http: js.UndefOr[String] = js.undefined
  /** Use the http proxy server for all protocols. */
  var httpProxyAll: js.UndefOr[Boolean] = js.undefined
  /** A list of hosts which should not be proxied. */
  var passthrough: js.UndefOr[String] = js.undefined
  /** Proxy DNS when using SOCKS v5. */
  var proxyDNS: js.UndefOr[Boolean] = js.undefined
  /** The type of proxy to use. */
  var proxyType: js.UndefOr[_ProxyConfigProxyType] = js.undefined
  /** The address of the socks proxy, can include a port. */
  var socks: js.UndefOr[String] = js.undefined
  /** The version of the socks proxy. */
  var socksVersion: js.UndefOr[Double] = js.undefined
  /** The address of the ssl proxy, can include a port. */
  var ssl: js.UndefOr[String] = js.undefined
}

object ProxyConfig {
  @scala.inline
  def apply(
    autoConfigUrl: String = null,
    autoLogin: js.UndefOr[Boolean] = js.undefined,
    ftp: String = null,
    http: String = null,
    httpProxyAll: js.UndefOr[Boolean] = js.undefined,
    passthrough: String = null,
    proxyDNS: js.UndefOr[Boolean] = js.undefined,
    proxyType: _ProxyConfigProxyType = null,
    socks: String = null,
    socksVersion: Int | Double = null,
    ssl: String = null
  ): ProxyConfig = {
    val __obj = js.Dynamic.literal()
    if (autoConfigUrl != null) __obj.updateDynamic("autoConfigUrl")(autoConfigUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLogin)) __obj.updateDynamic("autoLogin")(autoLogin.asInstanceOf[js.Any])
    if (ftp != null) __obj.updateDynamic("ftp")(ftp.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (!js.isUndefined(httpProxyAll)) __obj.updateDynamic("httpProxyAll")(httpProxyAll.asInstanceOf[js.Any])
    if (passthrough != null) __obj.updateDynamic("passthrough")(passthrough.asInstanceOf[js.Any])
    if (!js.isUndefined(proxyDNS)) __obj.updateDynamic("proxyDNS")(proxyDNS.asInstanceOf[js.Any])
    if (proxyType != null) __obj.updateDynamic("proxyType")(proxyType.asInstanceOf[js.Any])
    if (socks != null) __obj.updateDynamic("socks")(socks.asInstanceOf[js.Any])
    if (socksVersion != null) __obj.updateDynamic("socksVersion")(socksVersion.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfig]
  }
}

