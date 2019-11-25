package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var anchor: js.UndefOr[String] = js.undefined
  var author: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.User] = js.undefined
  var commentId: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[CommentContext] = js.undefined
  var createdDate: js.UndefOr[String] = js.undefined
  var deleted: js.UndefOr[Boolean] = js.undefined
  var fileId: js.UndefOr[String] = js.undefined
  var fileTitle: js.UndefOr[String] = js.undefined
  var htmlContent: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var modifiedDate: js.UndefOr[String] = js.undefined
  var replies: js.UndefOr[js.Array[CommentReply]] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object Comment {
  @scala.inline
  def apply(
    anchor: String = null,
    author: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.User = null,
    commentId: String = null,
    content: String = null,
    context: CommentContext = null,
    createdDate: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    fileId: String = null,
    fileTitle: String = null,
    htmlContent: String = null,
    kind: String = null,
    modifiedDate: String = null,
    replies: js.Array[CommentReply] = null,
    selfLink: String = null,
    status: String = null
  ): Comment = {
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
    __obj.asInstanceOf[Comment]
  }
}

