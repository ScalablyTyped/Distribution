package typings.firefoxDashWebextDashBrowser.browser.history

import typings.firefoxDashWebextDashBrowser.Anon_EndTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.history.search")
@js.native
object search extends js.Object {
  /* history functions */
  /** Searches the history for the last visit time of each page matching the query. */
  def apply(query: Anon_EndTime): js.Promise[js.Array[HistoryItem]] = js.native
}

