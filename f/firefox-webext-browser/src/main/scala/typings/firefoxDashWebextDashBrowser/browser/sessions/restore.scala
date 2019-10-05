package typings.firefoxDashWebextDashBrowser.browser.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.sessions.restore")
@js.native
object restore extends js.Object {
  /**
    * Reopens a `windows.Window` or `tabs.Tab`, with an optional callback to run when the entry has been restored.
    * @param [sessionId] The `windows.Window.sessionId`, or `tabs.Tab.sessionId` to restore. If this parameter is not
    *     specified, the most recently closed session is restored.
    */
  def apply(): js.Promise[Session] = js.native
  def apply(sessionId: String): js.Promise[Session] = js.native
  def apply(sessionId: String, callback: js.Function1[/* restoredSession */ Session, Unit]): js.Promise[Session] = js.native
}

