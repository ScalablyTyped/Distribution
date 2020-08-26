package typings.googleapis.bloggerV2Mod.bloggerV2

import typings.googleapis.anon.Image
import typings.googleapis.anon.TotalItems
import typings.googleapis.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPost extends js.Object {
  /**
    * The author of this Post.
    */
  var author: js.UndefOr[Image] = js.native
  /**
    * Data about the blog containing this Post.
    */
  var blog: js.UndefOr[`0`] = js.native
  /**
    * The content of the Post. May contain HTML markup.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The identifier of this Post.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of this entity. Always blogger#post
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The list of labels this Post was tagged with.
    */
  var labels: js.UndefOr[js.Array[String]] = js.native
  /**
    * RFC 3339 date-time when this Post was published.
    */
  var published: js.UndefOr[String] = js.native
  /**
    * The container of comments on this Post.
    */
  var replies: js.UndefOr[TotalItems] = js.native
  /**
    * The API REST URL to fetch this resource from.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The title of the Post.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * RFC 3339 date-time when this Post was last updated.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * The URL where this Post is displayed.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaPost {
  @scala.inline
  def apply(): SchemaPost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPost]
  }
  @scala.inline
  implicit class SchemaPostOps[Self <: SchemaPost] (val x: Self) extends AnyVal {
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
    def setAuthor(value: Image): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setBlog(value: `0`): Self = this.set("blog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlog: Self = this.set("blog", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: String*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setPublished(value: String): Self = this.set("published", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished: Self = this.set("published", js.undefined)
    @scala.inline
    def setReplies(value: TotalItems): Self = this.set("replies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplies: Self = this.set("replies", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

