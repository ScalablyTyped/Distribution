package typings.googleapis.bloggerV3Mod.bloggerV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBlogList extends js.Object {
  /**
    * Admin level list of blog per-user information
    */
  var blogUserInfos: js.UndefOr[js.Array[SchemaBlogUserInfo]] = js.native
  /**
    * The list of Blogs this user has Authorship or Admin rights over.
    */
  var items: js.UndefOr[js.Array[SchemaBlog]] = js.native
  /**
    * The kind of this entity. Always blogger#blogList
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBlogList {
  @scala.inline
  def apply(): SchemaBlogList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlogList]
  }
  @scala.inline
  implicit class SchemaBlogListOps[Self <: SchemaBlogList] (val x: Self) extends AnyVal {
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
    def setBlogUserInfosVarargs(value: SchemaBlogUserInfo*): Self = this.set("blogUserInfos", js.Array(value :_*))
    @scala.inline
    def setBlogUserInfos(value: js.Array[SchemaBlogUserInfo]): Self = this.set("blogUserInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlogUserInfos: Self = this.set("blogUserInfos", js.undefined)
    @scala.inline
    def setItemsVarargs(value: SchemaBlog*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaBlog]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

