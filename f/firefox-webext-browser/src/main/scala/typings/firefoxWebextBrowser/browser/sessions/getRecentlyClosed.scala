package typings.firefoxWebextBrowser.browser.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.sessions.getRecentlyClosed")
@js.native
object getRecentlyClosed extends js.Object {
  /** Gets the list of recently closed tabs and/or windows. */
  def apply(): js.Promise[js.Array[Session]] = js.native
  def apply(filter: Filter): js.Promise[js.Array[Session]] = js.native
}

