package typings
package firefoxDashWebextDashBrowserLib.browserNs.proxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.proxy")
@js.native
object proxyNsMembers extends js.Object {
  /** Notifies about proxy script errors. */
  val onError: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function1[/* error */ js.Object, scala.Unit]] = js.native
  /** Please use `proxy.onError`. */
  val onProxyError: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function1[/* error */ js.Object, scala.Unit]] = js.native
  /* proxy events */
  /** Fired when proxy data is needed for a request. */
  val onRequest: _ProxyOnRequestEvent[
    js.Function1[/* details */ firefoxDashWebextDashBrowserLib.Anon_MethodIpFrameId, scala.Unit]
  ] = js.native
  /* proxy properties */
  /** Configures proxy settings. This setting's value is an object of type ProxyConfig. */
  val settings: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting = js.native
  /* proxy functions */
  /** Registers the proxy script for the extension. */
  def register(url: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
       * Registers the proxy script for the extension.
       * @deprecated Please use `proxy.register`
       */
  def registerProxyScript(url: java.lang.String): js.Promise[_] = js.native
  /** Unregisters the proxy script for the extension. */
  def unregister(): js.Promise[scala.Unit] = js.native
}

