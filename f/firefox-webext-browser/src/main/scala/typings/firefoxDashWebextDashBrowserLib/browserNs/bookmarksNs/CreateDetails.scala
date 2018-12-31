package typings
package firefoxDashWebextDashBrowserLib.browserNs.bookmarksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object passed to the create() function. */
trait CreateDetails extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Defaults to the Other Bookmarks folder. */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates the type of BookmarkTreeNode to create, which can be one of bookmark, folder or separator. */
  var `type`: js.UndefOr[BookmarkTreeNodeType] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

