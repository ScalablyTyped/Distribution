package typings.gapiClientBlogger.anon

import typings.gapiClientBlogger.gapi.client.blogger.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TotalItems extends js.Object {
  /** The List of Comments for this Post. */
  var items: js.UndefOr[js.Array[Comment]] = js.native
  /** The URL of the comments on this post. */
  var selfLink: js.UndefOr[String] = js.native
  /** The count of comments on this post. */
  var totalItems: js.UndefOr[String] = js.native
}

object TotalItems {
  @scala.inline
  def apply(): TotalItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotalItems]
  }
  @scala.inline
  implicit class TotalItemsOps[Self <: TotalItems] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Comment*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Comment]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setTotalItems(value: String): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalItems: Self = this.set("totalItems", js.undefined)
  }
  
}

