package typings.googleapis.bloggerV3Mod.bloggerV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCommentList extends js.Object {
  /**
    * Etag of the response.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The List of Comments for a Post.
    */
  var items: js.UndefOr[js.Array[SchemaComment]] = js.native
  /**
    * The kind of this entry. Always blogger#commentList
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to fetch the next page, if one exists.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Pagination token to fetch the previous page, if one exists.
    */
  var prevPageToken: js.UndefOr[String] = js.native
}

object SchemaCommentList {
  @scala.inline
  def apply(): SchemaCommentList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentList]
  }
  @scala.inline
  implicit class SchemaCommentListOps[Self <: SchemaCommentList] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setItemsVarargs(value: SchemaComment*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaComment]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setPrevPageToken(value: String): Self = this.set("prevPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevPageToken: Self = this.set("prevPageToken", js.undefined)
  }
  
}

