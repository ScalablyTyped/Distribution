package typings.firefoxDashWebextDashBrowser.browserNs.proxyNs

import typings.firefoxDashWebextDashBrowser.Anon_DocumentUrl
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import typings.firefoxDashWebextDashBrowser.browserNs.typesNs.Setting
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.proxy")
@js.native
object ^ extends js.Object {
  /** Notifies about proxy script errors. */
  val onError: WebExtEvent[js.Function1[/* error */ Error, Unit]] = js.native
  /** Please use `proxy.onError`. */
  val onProxyError: WebExtEvent[js.Function1[/* error */ Error, Unit]] = js.native
  /* proxy events */
  /** Fired when proxy data is needed for a request. */
  val onRequest: _ProxyOnRequestEvent[js.Function1[/* details */ Anon_DocumentUrl, Unit]] = js.native
  /* proxy properties */
  /** Configures proxy settings. This setting's value is an object of type ProxyConfig. */
  val settings: Setting = js.native
  /* proxy functions */
  /** Registers the proxy script for the extension. */
  def register(url: String): js.Promise[Unit] = js.native
  /**
    * Registers the proxy script for the extension.
    * @deprecated Please use `proxy.register`
    */
  def registerProxyScript(url: String): js.Promise[_] = js.native
  /** Unregisters the proxy script for the extension. */
  def unregister(): js.Promise[Unit] = js.native
}

