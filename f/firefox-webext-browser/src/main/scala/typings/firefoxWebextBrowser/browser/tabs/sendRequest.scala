package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.sendRequest")
@js.native
object sendRequest extends js.Object {
  /**
    * Sends a single request to the content script(s) in the specified tab, with an optional callback to run when a
    * response is sent back. The `extension.onRequest` event is fired in each content script running in the specified
    * tab for the current extension.
    * @deprecated Please use `runtime.sendMessage`.
    */
  def apply(tabId: Double, request: js.Any): Unit = js.native
  def apply(tabId: Double, request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
}

