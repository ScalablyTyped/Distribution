package typings.firefoxDashWebextDashBrowser.browser.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.proxy.registerProxyScript")
@js.native
object registerProxyScript extends js.Object {
  /**
    * Registers the proxy script for the extension. This is an alias for proxy.register.
    * @deprecated proxy.registerProxyScript has been deprecated and will be removed in Firefox 71.
    */
  def apply(url: String): js.Promise[_] = js.native
}

