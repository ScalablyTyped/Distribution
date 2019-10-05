package typings.firefoxDashWebextDashBrowser.browser.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.sessions.getRecentlyClosed")
@js.native
object getRecentlyClosed extends js.Object {
  /** Gets the list of recently closed tabs and/or windows. */
  def apply(callback: js.Function1[/* sessions */ js.Array[Session], Unit]): js.Promise[js.Array[Session]] = js.native
  /** Gets the list of recently closed tabs and/or windows. */
  def apply(filter: Filter, callback: js.Function1[/* sessions */ js.Array[Session], Unit]): js.Promise[js.Array[Session]] = js.native
}

