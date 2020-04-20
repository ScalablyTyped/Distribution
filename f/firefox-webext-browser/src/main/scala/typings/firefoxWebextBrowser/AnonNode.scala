package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.bookmarks.BookmarkTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNode extends js.Object {
  var index: Double
  var node: BookmarkTreeNode
  var parentId: String
}

object AnonNode {
  @scala.inline
  def apply(index: Double, node: BookmarkTreeNode, parentId: String): AnonNode = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNode]
  }
}

