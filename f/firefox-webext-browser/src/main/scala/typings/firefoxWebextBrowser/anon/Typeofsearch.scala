package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.search.SearchEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsearch extends js.Object {
  /* search functions */
  /** Gets a list of search engines. */
  def get(): js.Promise[js.Array[SearchEngine]] = js.native
  /** Perform a search. */
  def search(searchProperties: Engine): js.Promise[_] = js.native
}

object Typeofsearch {
  @scala.inline
  def apply(get: () => js.Promise[js.Array[SearchEngine]], search: Engine => js.Promise[_]): Typeofsearch = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[Typeofsearch]
  }
  @scala.inline
  implicit class TypeofsearchOps[Self <: Typeofsearch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: () => js.Promise[js.Array[SearchEngine]]): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def setSearch(value: Engine => js.Promise[_]): Self = this.set("search", js.Any.fromFunction1(value))
  }
  
}

