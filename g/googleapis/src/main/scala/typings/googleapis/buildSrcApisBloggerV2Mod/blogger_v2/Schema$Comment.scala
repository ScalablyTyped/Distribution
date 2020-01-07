package typings.googleapis.buildSrcApisBloggerV2Mod.blogger_v2

import typings.googleapis.Anon_DisplayNameId
import typings.googleapis.Anon_IdString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Comment extends js.Object {
  /**
    * The author of this Comment.
    */
  var author: js.UndefOr[Anon_DisplayNameId] = js.native
  /**
    * Data about the blog containing this comment.
    */
  var blog: js.UndefOr[Anon_IdString] = js.native
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
  var inReplyTo: js.UndefOr[Anon_IdString] = js.native
  /**
    * The kind of this entry. Always blogger#comment
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Data about the post containing this comment.
    */
  var post: js.UndefOr[Anon_IdString] = js.native
  /**
    * RFC 3339 date-time when this comment was published.
    */
  var published: js.UndefOr[String] = js.native
  /**
    * The API REST URL to fetch this resource from.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * RFC 3339 date-time when this comment was last updated.
    */
  var updated: js.UndefOr[String] = js.native
}

object Schema$Comment {
  @scala.inline
  def apply(
    author: Anon_DisplayNameId = null,
    blog: Anon_IdString = null,
    content: String = null,
    id: String = null,
    inReplyTo: Anon_IdString = null,
    kind: String = null,
    post: Anon_IdString = null,
    published: String = null,
    selfLink: String = null,
    updated: String = null
  ): Schema$Comment = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (blog != null) __obj.updateDynamic("blog")(blog.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    if (published != null) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Comment]
  }
}

