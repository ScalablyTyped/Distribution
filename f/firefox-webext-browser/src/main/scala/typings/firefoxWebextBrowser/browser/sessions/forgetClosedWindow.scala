package typings.firefoxWebextBrowser.browser.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.sessions.forgetClosedWindow")
@js.native
object forgetClosedWindow extends js.Object {
  /**
    * Forget a recently closed window.
    * @param sessionId The sessionId (closedId) of the recently closed window to be forgotten.
    */
  def apply(sessionId: String): js.Promise[Unit] = js.native
}

