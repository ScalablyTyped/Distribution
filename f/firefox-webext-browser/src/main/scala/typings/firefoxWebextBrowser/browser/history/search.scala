package typings.firefoxWebextBrowser.browser.history

import typings.firefoxWebextBrowser.AnonEndTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.history.search")
@js.native
object search extends js.Object {
  /* history functions */
  /** Searches the history for the last visit time of each page matching the query. */
  def apply(query: AnonEndTime): js.Promise[js.Array[HistoryItem]] = js.native
}

