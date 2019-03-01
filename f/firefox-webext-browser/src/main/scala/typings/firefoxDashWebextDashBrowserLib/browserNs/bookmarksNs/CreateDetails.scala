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

object CreateDetails {
  @scala.inline
  def apply(
    index: scala.Int | scala.Double = null,
    parentId: java.lang.String = null,
    title: java.lang.String = null,
    `type`: BookmarkTreeNodeType = null,
    url: java.lang.String = null
  ): CreateDetails = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CreateDetails]
  }
}

