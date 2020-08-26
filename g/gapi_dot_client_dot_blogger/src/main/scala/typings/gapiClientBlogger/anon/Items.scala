package typings.gapiClientBlogger.anon

import typings.gapiClientBlogger.gapi.client.blogger.Post
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Items extends js.Object {
  /** The List of Posts for this Blog. */
  var items: js.UndefOr[js.Array[Post]] = js.native
  /** The URL of the container for posts in this blog. */
  var selfLink: js.UndefOr[String] = js.native
  /** The count of posts in this blog. */
  var totalItems: js.UndefOr[Double] = js.native
}

object Items {
  @scala.inline
  def apply(): Items = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Items]
  }
  @scala.inline
  implicit class ItemsOps[Self <: Items] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Post*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Post]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setTotalItems(value: Double): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalItems: Self = this.set("totalItems", js.undefined)
  }
  
}

