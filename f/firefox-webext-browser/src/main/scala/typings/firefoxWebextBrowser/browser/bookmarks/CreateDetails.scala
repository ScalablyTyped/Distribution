package typings.firefoxWebextBrowser.browser.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object passed to the create() function. */
@js.native
trait CreateDetails extends js.Object {
  var index: js.UndefOr[Double] = js.native
  /** Defaults to the Other Bookmarks folder. */
  var parentId: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  /** Indicates the type of BookmarkTreeNode to create, which can be one of bookmark, folder or separator. */
  var `type`: js.UndefOr[BookmarkTreeNodeType] = js.native
  var url: js.UndefOr[String] = js.native
}

object CreateDetails {
  @scala.inline
  def apply(): CreateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDetails]
  }
  @scala.inline
  implicit class CreateDetailsOps[Self <: CreateDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: BookmarkTreeNodeType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

