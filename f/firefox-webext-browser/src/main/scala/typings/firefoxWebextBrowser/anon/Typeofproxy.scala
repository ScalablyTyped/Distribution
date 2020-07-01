package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.proxy.ProxyOnRequestEvent
import typings.firefoxWebextBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofproxy extends js.Object {
  /** Notifies about errors caused by the invalid use of the proxy API. */
  val onError: WebExtEvent[js.Function1[/* error */ typings.std.Error, Unit]]
  /* proxy events */
  /** Fired when proxy data is needed for a request. */
  val onRequest: ProxyOnRequestEvent[js.Function1[/* details */ CookieStoreId, Unit]]
  /* proxy properties */
  /** Configures proxy settings. This setting's value is an object of type ProxyConfig. */
  val settings: Setting
}

object Typeofproxy {
  @scala.inline
  def apply(
    onError: WebExtEvent[js.Function1[/* error */ typings.std.Error, Unit]],
    onRequest: ProxyOnRequestEvent[js.Function1[/* details */ CookieStoreId, Unit]],
    settings: Setting
  ): Typeofproxy = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], onRequest = onRequest.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofproxy]
  }
}

