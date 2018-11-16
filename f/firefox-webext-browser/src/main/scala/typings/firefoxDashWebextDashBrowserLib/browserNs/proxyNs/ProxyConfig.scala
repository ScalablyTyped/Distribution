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

