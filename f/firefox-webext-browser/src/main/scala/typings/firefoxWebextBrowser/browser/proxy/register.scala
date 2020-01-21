package typings.firefoxWebextBrowser.browser.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.proxy.register")
@js.native
object register extends js.Object {
  /* proxy functions */
  /**
    * Registers the proxy script for the extension.
    * @deprecated proxy.register has been deprecated and will be removed in Firefox 71.
    */
  def apply(url: String): js.Promise[Unit] = js.native
}

