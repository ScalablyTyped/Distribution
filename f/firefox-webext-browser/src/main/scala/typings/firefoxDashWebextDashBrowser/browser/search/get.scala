package typings.firefoxDashWebextDashBrowser.browser.search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.search.get")
@js.native
object get extends js.Object {
  /* search functions */
  /** Gets a list of search engines. */
  def apply(): js.Promise[js.Array[SearchEngine]] = js.native
}

