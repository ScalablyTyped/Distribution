package typings.firefoxDashWebextDashBrowser.browser.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.bookmarks.getRecent")
@js.native
object getRecent extends js.Object {
  /**
    * Retrieves the recently added bookmarks.
    * @param numberOfItems The maximum number of items to return.
    */
  def apply(numberOfItems: Double): js.Promise[js.Array[BookmarkTreeNode]] = js.native
}

