package typings.firefoxWebextBrowser.browser.bookmarks

import typings.firefoxWebextBrowser.AnonIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.bookmarks.move")
@js.native
object move extends js.Object {
  /** Moves the specified BookmarkTreeNode to the provided location. */
  def apply(id: String, destination: AnonIndex): js.Promise[BookmarkTreeNode] = js.native
}

