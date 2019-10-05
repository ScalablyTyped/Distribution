package typings.firefoxDashWebextDashBrowser.browser.bookmarks

import typings.firefoxDashWebextDashBrowser.Anon_Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.bookmarks.search")
@js.native
object search extends js.Object {
  /**
    * Searches for BookmarkTreeNodes matching the given query. Queries specified with an object produce
    * BookmarkTreeNodes matching all specified properties.
    * @param query Either a string of words and quoted phrases that are matched against bookmark URLs and titles, or
    *     an object. If an object, the properties `query`, `url`, and `title` may be specified and bookmarks matching
    *     all specified properties will be produced.
    */
  def apply(query: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  def apply(query: Anon_Query): js.Promise[js.Array[BookmarkTreeNode]] = js.native
}

