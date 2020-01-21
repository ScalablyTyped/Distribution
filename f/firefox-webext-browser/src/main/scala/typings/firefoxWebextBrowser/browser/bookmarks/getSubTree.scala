package typings.firefoxWebextBrowser.browser.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.bookmarks.getSubTree")
@js.native
object getSubTree extends js.Object {
  /**
    * Retrieves part of the Bookmarks hierarchy, starting at the specified node.
    * @param id The ID of the root of the subtree to retrieve.
    */
  def apply(id: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
}

