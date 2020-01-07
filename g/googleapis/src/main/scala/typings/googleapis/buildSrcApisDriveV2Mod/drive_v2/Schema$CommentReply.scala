package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A comment on a file in Google Drive.
  */
@js.native
trait Schema$CommentReply extends js.Object {
  /**
    * The user who wrote this reply.
    */
  var author: js.UndefOr[Schema$User] = js.native
  /**
    * The plain text content used to create this reply. This is not HTML safe
    * and should only be used as a starting point to make edits to a
    * reply&#39;s content. This field is required on inserts if no verb is
    * specified (resolve/reopen).
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The date when this reply was first created.
    */
  var createdDate: js.UndefOr[String] = js.native
  /**
    * Whether this reply has been deleted. If a reply has been deleted the
    * content will be cleared and this will only represent a reply that once
    * existed.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * HTML formatted content for this reply.
    */
  var htmlContent: js.UndefOr[String] = js.native
  /**
    * This is always drive#commentReply.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The date when this reply was last modified.
    */
  var modifiedDate: js.UndefOr[String] = js.native
  /**
    * The ID of the reply.
    */
  var replyId: js.UndefOr[String] = js.native
  /**
    * The action this reply performed to the parent comment. When creating a
    * new reply this is the action to be perform to the parent comment.
    * Possible values are:   - &quot;resolve&quot; - To resolve a comment.  -
    * &quot;reopen&quot; - To reopen (un-resolve) a comment.
    */
  var verb: js.UndefOr[String] = js.native
}

object Schema$CommentReply {
  @scala.inline
  def apply(
    author: Schema$User = null,
    content: String = null,
    createdDate: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    htmlContent: String = null,
    kind: String = null,
    modifiedDate: String = null,
    replyId: String = null,
    verb: String = null
  ): Schema$CommentReply = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (htmlContent != null) __obj.updateDynamic("htmlContent")(htmlContent.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (modifiedDate != null) __obj.updateDynamic("modifiedDate")(modifiedDate.asInstanceOf[js.Any])
    if (replyId != null) __obj.updateDynamic("replyId")(replyId.asInstanceOf[js.Any])
    if (verb != null) __obj.updateDynamic("verb")(verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CommentReply]
  }
}

