package typings.firefoxDashWebextDashBrowser.browser.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.sessions.forgetClosedTab")
@js.native
object forgetClosedTab extends js.Object {
  /* sessions functions */
  /**
    * Forget a recently closed tab.
    * @param windowId The windowId of the window to which the recently closed tab to be forgotten belongs.
    * @param sessionId The sessionId (closedId) of the recently closed tab to be forgotten.
    */
  def apply(windowId: Double, sessionId: String): js.Promise[Unit] = js.native
}

