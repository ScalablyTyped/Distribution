package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Details extends js.Object {
  /** Notifies about proxy script errors. */
  val onError: WebExtEvent[js.Function1[/* error */ js.Object, scala.Unit]]
  /** Please use `proxy.onError`. */
  val onProxyError: WebExtEvent[js.Function1[/* error */ js.Object, scala.Unit]]
  /* proxy events */
  /** Fired when proxy data is needed for a request. */
  val onRequest: firefoxDashWebextDashBrowserLib.browserNs.proxyNs._ProxyOnRequestEvent[js.Function1[/* details */ Anon_DocumentUrl, scala.Unit]]
  /* proxy properties */
  /** Configures proxy settings. This setting's value is an object of type ProxyConfig. */
  val settings: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /* proxy functions */
  /** Registers the proxy script for the extension. */
  def register(url: java.lang.String): js.Promise[scala.Unit]
  /**
    * Registers the proxy script for the extension.
    * @deprecated Please use `proxy.register`
    */
  def registerProxyScript(url: java.lang.String): js.Promise[_]
  /** Unregisters the proxy script for the extension. */
  def unregister(): js.Promise[scala.Unit]
}

