package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetSearch extends js.Object {
  /* search functions */
  /** Gets a list of search engines. */
  def get(): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.searchNs.SearchEngine]]
  /** Perform a search. */
  def search(searchProperties: Anon_Engine): js.Promise[_]
}

