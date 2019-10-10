package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.proxy._ProxyOnRequestEvent
import typings.firefoxDashWebextDashBrowser.browser.types.Setting
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofproxy extends js.Object {
  /** Notifies about errors caused by the invalid use of the proxy API. */
  val onError: WebExtEvent[js.Function1[/* error */ Error, Unit]]
  /**
    * Please use `proxy.onError`.
    * @deprecated proxy.onProxyError has been deprecated and will be removed in Firefox 71\. Use proxy.onError instead.
    */
  val onProxyError: WebExtEvent[js.Function1[/* error */ Error, Unit]]
  /* proxy events */
  /** Fired when proxy data is needed for a request. */
  val onRequest: _ProxyOnRequestEvent[js.Function1[/* details */ Anon_CookieStoreId, Unit]]
  /* proxy properties */
  /** Configures proxy settings. This setting's value is an object of type ProxyConfig. */
  val settings: Setting
  /* proxy functions */
  /**
    * Registers the proxy script for the extension.
    * @deprecated proxy.register has been deprecated and will be removed in Firefox 71.
    */
  def register(url: String): js.Promise[Unit]
  /**
    * Registers the proxy script for the extension. This is an alias for proxy.register.
    * @deprecated proxy.registerProxyScript has been deprecated and will be removed in Firefox 71.
    */
  def registerProxyScript(url: String): js.Promise[_]
  /**
    * Unregisters the proxy script for the extension.
    * @deprecated proxy.unregister has been deprecated and will be removed in Firefox 71.
    */
  def unregister(): js.Promise[Unit]
}

object Typeofproxy {
  @scala.inline
  def apply(
    onError: WebExtEvent[js.Function1[/* error */ Error, Unit]],
    onProxyError: WebExtEvent[js.Function1[/* error */ Error, Unit]],
    onRequest: _ProxyOnRequestEvent[js.Function1[/* details */ Anon_CookieStoreId, Unit]],
    register: String => js.Promise[Unit],
    registerProxyScript: String => js.Promise[_],
    settings: Setting,
    unregister: () => js.Promise[Unit]
  ): Typeofproxy = {
    val __obj = js.Dynamic.literal(onError = onError, onProxyError = onProxyError, onRequest = onRequest, register = js.Any.fromFunction1(register), registerProxyScript = js.Any.fromFunction1(registerProxyScript), settings = settings, unregister = js.Any.fromFunction0(unregister))
  
    __obj.asInstanceOf[Typeofproxy]
  }
}

