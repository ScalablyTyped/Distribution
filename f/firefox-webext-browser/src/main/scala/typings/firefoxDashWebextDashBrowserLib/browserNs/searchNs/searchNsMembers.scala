package typings
package firefoxDashWebextDashBrowserLib.browserNs.searchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.search")
@js.native
object searchNsMembers extends js.Object {
  /* search functions */
  /** Gets a list of search engines. */
  def get(): js.Promise[js.Array[SearchEngine]] = js.native
  /** Perform a search. */
  def search(searchProperties: firefoxDashWebextDashBrowserLib.Anon_Engine): js.Promise[_] = js.native
}

