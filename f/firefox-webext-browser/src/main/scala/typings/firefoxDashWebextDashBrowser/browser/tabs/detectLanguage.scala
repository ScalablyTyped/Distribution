package typings.firefoxDashWebextDashBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.detectLanguage")
@js.native
object detectLanguage extends js.Object {
  /**
    * Detects the primary language of the content in a tab.
    * @param [tabId] Defaults to the active tab of the current window.
    */
  def apply(): js.Promise[String] = js.native
  def apply(tabId: Double): js.Promise[String] = js.native
}

