package typings.firefoxDashWebextDashBrowser.browser.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.bookmarks.create")
@js.native
object create extends js.Object {
  /**
    * Creates a bookmark or folder under the specified parentId. If url is NULL or missing, it will be a folder.
    */
  def apply(bookmark: CreateDetails): js.Promise[js.UndefOr[BookmarkTreeNode]] = js.native
}

