package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.searchNs.SearchEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsearch extends js.Object {
  /* search functions */
  /** Gets a list of search engines. */
  def get(): js.Promise[js.Array[SearchEngine]]
  /** Perform a search. */
  def search(searchProperties: Anon_Engine): js.Promise[_]
}

object Typeofsearch {
  @scala.inline
  def apply(get: () => js.Promise[js.Array[SearchEngine]], search: Anon_Engine => js.Promise[_]): Typeofsearch = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[Typeofsearch]
  }
}

