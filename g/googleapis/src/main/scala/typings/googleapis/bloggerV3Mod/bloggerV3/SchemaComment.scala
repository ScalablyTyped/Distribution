package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleapis.anon.Image
import typings.googleapis.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaComment extends js.Object {
  /**
    * The author of this Comment.
    */
  var author: js.UndefOr[Image] = js.native
  /**
    * Data about the blog containing this comment.
    */
  var blog: js.UndefOr[`0`] = js.native
  /**
    * The actual content of the comment. May include HTML markup.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The identifier for this resource.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Data about the comment this is in reply to.
    */
  var inReplyTo: js.UndefOr[`0`] = js.native
  /**
    * The kind of this entry. Always blogger#comment
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Data about the post containing this comment.
    */
  var post: js.UndefOr[`0`] = js.native
  /**
    * RFC 3339 date-time when this comment was published.
    */
  var published: js.UndefOr[String] = js.native
  /**
    * The API REST URL to fetch this resource from.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The status of the comment (only populated for admin users)
    */
  var status: js.UndefOr[String] = js.native
  /**
    * RFC 3339 date-time when this comment was last updated.
    */
  var updated: js.UndefOr[String] = js.native
}

object SchemaComment {
  @scala.inline
  def apply(): SchemaComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComment]
  }
  @scala.inline
  implicit class SchemaCommentOps[Self <: SchemaComment] (val x: Self) extends AnyVal {
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
    def setInReplyTo(value: `0`): Self = this.set("inReplyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInReplyTo: Self = this.set("inReplyTo", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPost(value: `0`): Self = this.set("post", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    @scala.inline
    def setPublished(value: String): Self = this.set("published", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished: Self = this.set("published", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
  
}

