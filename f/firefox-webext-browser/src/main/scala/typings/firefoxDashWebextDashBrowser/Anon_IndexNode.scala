package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.bookmarks.BookmarkTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndexNode extends js.Object {
  var index: Double
  var node: BookmarkTreeNode
  var parentId: String
}

object Anon_IndexNode {
  @scala.inline
  def apply(index: Double, node: BookmarkTreeNode, parentId: String): Anon_IndexNode = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IndexNode]
  }
}

