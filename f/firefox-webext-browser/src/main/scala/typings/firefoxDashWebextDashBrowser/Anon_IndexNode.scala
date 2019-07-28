package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.bookmarksNs.BookmarkTreeNode
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
    val __obj = js.Dynamic.literal(index = index, node = node, parentId = parentId)
  
    __obj.asInstanceOf[Anon_IndexNode]
  }
}

