package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClientBlogger.AnonDisplayName
import typings.gapiClientBlogger.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  /** The author of this Comment. */
  var author: js.UndefOr[AnonDisplayName] = js.undefined
  /** Data about the blog containing this comment. */
  var blog: js.UndefOr[AnonId] = js.undefined
  /** The actual content of the comment. May include HTML markup. */
  var content: js.UndefOr[String] = js.undefined
  /** The identifier for this resource. */
  var id: js.UndefOr[String] = js.undefined
  /** Data about the comment this is in reply to. */
  var inReplyTo: js.UndefOr[AnonId] = js.undefined
  /** The kind of this entry. Always blogger#comment */
  var kind: js.UndefOr[String] = js.undefined
  /** Data about the post containing this comment. */
  var post: js.UndefOr[AnonId] = js.undefined
  /** RFC 3339 date-time when this comment was published. */
  var published: js.UndefOr[String] = js.undefined
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** The status of the comment (only populated for admin users) */
  var status: js.UndefOr[String] = js.undefined
  /** RFC 3339 date-time when this comment was last updated. */
  var updated: js.UndefOr[String] = js.undefined
}

object Comment {
  @scala.inline
  def apply(
    author: AnonDisplayName = null,
    blog: AnonId = null,
    content: String = null,
    id: String = null,
    inReplyTo: AnonId = null,
    kind: String = null,
    post: AnonId = null,
    published: String = null,
    selfLink: String = null,
    status: String = null,
    updated: String = null
  ): Comment = {
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
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

