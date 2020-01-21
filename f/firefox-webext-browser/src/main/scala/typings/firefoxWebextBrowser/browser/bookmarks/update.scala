package typings.firefoxWebextBrowser.browser.bookmarks

import typings.firefoxWebextBrowser.AnonTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.bookmarks.update")
@js.native
object update extends js.Object {
  /**
    * Updates the properties of a bookmark or folder. Specify only the properties that you want to change; unspecified
    * properties will be left unchanged. **Note:** Currently, only 'title' and 'url' are supported.
    */
  def apply(id: String, changes: AnonTitle): js.Promise[BookmarkTreeNode] = js.native
}

