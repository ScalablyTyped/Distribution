package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import typings.googleapis.Anon_TypeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A comment on a file in Google Drive.
  */
@js.native
trait Schema$Comment extends js.Object {
  /**
    * A region of the document represented as a JSON string. See anchor
    * documentation for details on how to define and interpret anchor
    * properties.
    */
  var anchor: js.UndefOr[String] = js.native
  /**
    * The user who wrote this comment.
    */
  var author: js.UndefOr[Schema$User] = js.native
  /**
    * The ID of the comment.
    */
  var commentId: js.UndefOr[String] = js.native
  /**
    * The plain text content used to create this comment. This is not HTML safe
    * and should only be used as a starting point to make edits to a
    * comment&#39;s content.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The context of the file which is being commented on.
    */
  var context: js.UndefOr[Anon_TypeValue] = js.native
  /**
    * The date when this comment was first created.
    */
  var createdDate: js.UndefOr[String] = js.native
  /**
    * Whether this comment has been deleted. If a comment has been deleted the
    * content will be cleared and this will only represent a comment that once
    * existed.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * The file which this comment is addressing.
    */
  var fileId: js.UndefOr[String] = js.native
  /**
    * The title of the file which this comment is addressing.
    */
  var fileTitle: js.UndefOr[String] = js.native
  /**
    * HTML formatted content for this comment.
    */
  var htmlContent: js.UndefOr[String] = js.native
  /**
    * This is always drive#comment.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The date when this comment or any of its replies were last modified.
    */
  var modifiedDate: js.UndefOr[String] = js.native
  /**
    * Replies to this post.
    */
  var replies: js.UndefOr[js.Array[Schema$CommentReply]] = js.native
  /**
    * A link back to this comment.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The status of this comment. Status can be changed by posting a reply to a
    * comment with the desired status.   - &quot;open&quot; - The comment is
    * still open.  - &quot;resolved&quot; - The comment has been resolved by
    * one of its replies.
    */
  var status: js.UndefOr[String] = js.native
}

object Schema$Comment {
  @scala.inline
  def apply(
    anchor: String = null,
    author: Schema$User = null,
    commentId: String = null,
    content: String = null,
    context: Anon_TypeValue = null,
    createdDate: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    fileId: String = null,
    fileTitle: String = null,
    htmlContent: String = null,
    kind: String = null,
    modifiedDate: String = null,
    replies: js.Array[Schema$CommentReply] = null,
    selfLink: String = null,
    status: String = null
  ): Schema$Comment = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (commentId != null) __obj.updateDynamic("commentId")(commentId.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (fileTitle != null) __obj.updateDynamic("fileTitle")(fileTitle.asInstanceOf[js.Any])
    if (htmlContent != null) __obj.updateDynamic("htmlContent")(htmlContent.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (modifiedDate != null) __obj.updateDynamic("modifiedDate")(modifiedDate.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Comment]
  }
}

