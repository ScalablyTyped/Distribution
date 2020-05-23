package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.anon.CookieStoreId
import typings.firefoxWebextBrowser.browser.proxy.ProxyOnRequestEvent
import typings.firefoxWebextBrowser.browser.types.Setting
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use the browser.proxy API to register proxy scripts in Firefox. Proxy scripts in Firefox are proxy auto-config files
  * with extra contextual information and support for additional return types.
  *
  * Permissions: `proxy`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.proxy")
@js.native
object proxy extends js.Object {
  /** Notifies about errors caused by the invalid use of the proxy API. */
  val onError: WebExtEvent[js.Function1[/* error */ Error, Unit]] = js.native
  /**
    * Please use `proxy.onError`.
    * @deprecated proxy.onProxyError has been deprecated and will be removed in Firefox 71\. Use proxy.onError instead.
    */
  val onProxyError: WebExtEvent[js.Function1[/* error */ Error, Unit]] = js.native
  /* proxy events */
  /** Fired when proxy data is needed for a request. */
  val onRequest: ProxyOnRequestEvent[js.Function1[/* details */ CookieStoreId, Unit]] = js.native
  /* proxy properties */
  /** Configures proxy settings. This setting's value is an object of type ProxyConfig. */
  val settings: Setting = js.native
  /* proxy functions */
  /**
    * Registers the proxy script for the extension.
    * @deprecated proxy.register has been deprecated and will be removed in Firefox 71.
    */
  def register(url: String): js.Promise[Unit] = js.native
  /**
    * Registers the proxy script for the extension. This is an alias for proxy.register.
    * @deprecated proxy.registerProxyScript has been deprecated and will be removed in Firefox 71.
    */
  def registerProxyScript(url: String): js.Promise[_] = js.native
  /**
    * Unregisters the proxy script for the extension.
    * @deprecated proxy.unregister has been deprecated and will be removed in Firefox 71.
    */
  def unregister(): js.Promise[Unit] = js.native
}

