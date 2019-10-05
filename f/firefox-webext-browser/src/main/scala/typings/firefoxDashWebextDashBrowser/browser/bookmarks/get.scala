package typings.firefoxDashWebextDashBrowser.browser.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.bookmarks.get")
@js.native
object get extends js.Object {
  /* bookmarks functions */
  /**
    * Retrieves the specified BookmarkTreeNode(s).
    * @param idOrIdList A single string-valued id, or an array of string-valued ids
    */
  def apply(idOrIdList: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  def apply(idOrIdList: js.Array[String]): js.Promise[js.Array[BookmarkTreeNode]] = js.native
}

