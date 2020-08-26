package typings.gapiClientBlogger.gapi.client.blogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlogList extends js.Object {
  /** Admin level list of blog per-user information */
  var blogUserInfos: js.UndefOr[js.Array[BlogUserInfo]] = js.native
  /** The list of Blogs this user has Authorship or Admin rights over. */
  var items: js.UndefOr[js.Array[Blog]] = js.native
  /** The kind of this entity. Always blogger#blogList */
  var kind: js.UndefOr[String] = js.native
}

object BlogList {
  @scala.inline
  def apply(): BlogList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlogList]
  }
  @scala.inline
  implicit class BlogListOps[Self <: BlogList] (val x: Self) extends AnyVal {
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
    def setBlogUserInfosVarargs(value: BlogUserInfo*): Self = this.set("blogUserInfos", js.Array(value :_*))
    @scala.inline
    def setBlogUserInfos(value: js.Array[BlogUserInfo]): Self = this.set("blogUserInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlogUserInfos: Self = this.set("blogUserInfos", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Blog*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Blog]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

