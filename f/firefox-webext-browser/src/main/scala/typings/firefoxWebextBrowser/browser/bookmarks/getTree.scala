package typings.firefoxWebextBrowser.browser.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.bookmarks.getTree")
@js.native
object getTree extends js.Object {
  /** Retrieves the entire Bookmarks hierarchy. */
  def apply(): js.Promise[js.Array[BookmarkTreeNode]] = js.native
}

