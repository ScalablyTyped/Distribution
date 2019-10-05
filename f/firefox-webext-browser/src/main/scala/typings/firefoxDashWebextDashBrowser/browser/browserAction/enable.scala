package typings.firefoxDashWebextDashBrowser.browser.browserAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.browserAction.enable")
@js.native
object enable extends js.Object {
  /**
    * Enables the browser action for a tab. By default, browser actions are enabled.
    * @param [tabId] The id of the tab for which you want to modify the browser action.
    */
  def apply(): js.Promise[Unit] = js.native
  def apply(tabId: Double): js.Promise[Unit] = js.native
}

