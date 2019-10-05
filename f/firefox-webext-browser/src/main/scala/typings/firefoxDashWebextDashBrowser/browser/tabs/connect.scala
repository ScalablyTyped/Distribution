package typings.firefoxDashWebextDashBrowser.browser.tabs

import typings.firefoxDashWebextDashBrowser.Anon_FrameIdName
import typings.firefoxDashWebextDashBrowser.browser.runtime.Port
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.connect")
@js.native
object connect extends js.Object {
  /**
    * Connects to the content script(s) in the specified tab. The `runtime.onConnect` event is fired in each content
    * script running in the specified tab for the current extension. For more details, see Content Script Messaging.
    * @returns A port that can be used to communicate with the content scripts running in the specified tab. The
    *     port's `runtime.Port` event is fired if the tab closes or does not exist.
    */
  def apply(tabId: Double): Port = js.native
  def apply(tabId: Double, connectInfo: Anon_FrameIdName): Port = js.native
}

