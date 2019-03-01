package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndexNode extends js.Object {
  var index: scala.Double
  var node: firefoxDashWebextDashBrowserLib.browserNs.bookmarksNs.BookmarkTreeNode
  var parentId: java.lang.String
}

object Anon_IndexNode {
  @scala.inline
  def apply(
    index: scala.Double,
    node: firefoxDashWebextDashBrowserLib.browserNs.bookmarksNs.BookmarkTreeNode,
    parentId: java.lang.String
  ): Anon_IndexNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("parentId")(parentId)
    __obj.asInstanceOf[Anon_IndexNode]
  }
}

