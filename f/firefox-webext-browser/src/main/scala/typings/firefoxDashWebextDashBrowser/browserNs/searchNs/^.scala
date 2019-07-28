package typings.firefoxDashWebextDashBrowser.browserNs.searchNs

import typings.firefoxDashWebextDashBrowser.Anon_Engine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.search")
@js.native
object ^ extends js.Object {
  /* search functions */
  /** Gets a list of search engines. */
  def get(): js.Promise[js.Array[SearchEngine]] = js.native
  /** Perform a search. */
  def search(searchProperties: Anon_Engine): js.Promise[_] = js.native
}

