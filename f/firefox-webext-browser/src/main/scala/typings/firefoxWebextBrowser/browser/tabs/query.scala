package typings.firefoxWebextBrowser.browser.tabs

import typings.firefoxWebextBrowser.AnonAttention
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.query")
@js.native
object query extends js.Object {
  /** Gets all tabs that have the specified properties, or all tabs if no properties are specified. */
  def apply(queryInfo: AnonAttention): js.Promise[js.Array[Tab]] = js.native
}

