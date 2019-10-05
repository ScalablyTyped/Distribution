package typings.firefoxDashWebextDashBrowser.browser.tabs

import typings.firefoxDashWebextDashBrowser.Anon_ActiveAttention
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.query")
@js.native
object query extends js.Object {
  /** Gets all tabs that have the specified properties, or all tabs if no properties are specified. */
  def apply(queryInfo: Anon_ActiveAttention): js.Promise[js.Array[Tab]] = js.native
}

