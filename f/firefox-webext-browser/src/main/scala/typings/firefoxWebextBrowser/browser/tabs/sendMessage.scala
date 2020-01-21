package typings.firefoxWebextBrowser.browser.tabs

import typings.firefoxWebextBrowser.AnonFrameIdNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.sendMessage")
@js.native
object sendMessage extends js.Object {
  /**
    * Sends a single message to the content script(s) in the specified tab, with an optional callback to run when a
    * response is sent back. The `runtime.onMessage` event is fired in each content script running in the specified
    * tab for the current extension.
    */
  def apply(tabId: Double, message: js.Any): js.Promise[_] = js.native
  def apply(tabId: Double, message: js.Any, options: AnonFrameIdNumber): js.Promise[_] = js.native
}

