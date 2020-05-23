package typings.firefoxWebextBrowser.browser.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object passed to the create() function. */
trait CreateDetails extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  /** Defaults to the Other Bookmarks folder. */
  var parentId: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  /** Indicates the type of BookmarkTreeNode to create, which can be one of bookmark, folder or separator. */
  var `type`: js.UndefOr[BookmarkTreeNodeType] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object CreateDetails {
  @scala.inline
  def apply(
    index: js.UndefOr[Double] = js.undefined,
    parentId: String = null,
    title: String = null,
    `type`: BookmarkTreeNodeType = null,
    url: String = null
  ): CreateDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDetails]
  }
}

