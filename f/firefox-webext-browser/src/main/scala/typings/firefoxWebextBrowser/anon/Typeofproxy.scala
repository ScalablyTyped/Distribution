package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.proxy.ProxyOnRequestEvent
import typings.firefoxWebextBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofproxy extends js.Object {
  /** Notifies about errors caused by the invalid use of the proxy API. */
  val onError: WebExtEvent[js.Function1[/* error */ typings.std.Error, Unit]] = js.native
  /* proxy events */
  /** Fired when proxy data is needed for a request. */
  val onRequest: ProxyOnRequestEvent[js.Function1[/* details */ CookieStoreId, Unit]] = js.native
  /* proxy properties */
  /** Configures proxy settings. This setting's value is an object of type ProxyConfig. */
  val settings: Setting = js.native
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
  @scala.inline
  implicit class TypeofproxyOps[Self <: Typeofproxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnError(value: WebExtEvent[js.Function1[/* error */ typings.std.Error, Unit]]): Self = this.set("onError", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRequest(value: ProxyOnRequestEvent[js.Function1[/* details */ CookieStoreId, Unit]]): Self = this.set("onRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: Setting): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
  
}

