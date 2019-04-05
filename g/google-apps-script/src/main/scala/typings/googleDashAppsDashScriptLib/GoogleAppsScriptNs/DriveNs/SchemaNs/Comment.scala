package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var anchor: js.UndefOr[java.lang.String] = js.undefined
  var author: js.UndefOr[User] = js.undefined
  var commentId: js.UndefOr[java.lang.String] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var context: js.UndefOr[CommentContext] = js.undefined
  var createdDate: js.UndefOr[java.lang.String] = js.undefined
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  var fileId: js.UndefOr[java.lang.String] = js.undefined
  var fileTitle: js.UndefOr[java.lang.String] = js.undefined
  var htmlContent: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var modifiedDate: js.UndefOr[java.lang.String] = js.undefined
  var replies: js.UndefOr[js.Array[CommentReply]] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object Comment {
  @scala.inline
  def apply(
    anchor: java.lang.String = null,
    author: User = null,
    commentId: java.lang.String = null,
    content: java.lang.String = null,
    context: CommentContext = null,
    createdDate: java.lang.String = null,
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    fileId: java.lang.String = null,
    fileTitle: java.lang.String = null,
    htmlContent: java.lang.String = null,
    kind: java.lang.String = null,
    modifiedDate: java.lang.String = null,
    replies: js.Array[CommentReply] = null,
    selfLink: java.lang.String = null,
    status: java.lang.String = null
  ): Comment = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (author != null) __obj.updateDynamic("author")(author)
    if (commentId != null) __obj.updateDynamic("commentId")(commentId)
    if (content != null) __obj.updateDynamic("content")(content)
    if (context != null) __obj.updateDynamic("context")(context)
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (fileId != null) __obj.updateDynamic("fileId")(fileId)
    if (fileTitle != null) __obj.updateDynamic("fileTitle")(fileTitle)
    if (htmlContent != null) __obj.updateDynamic("htmlContent")(htmlContent)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (modifiedDate != null) __obj.updateDynamic("modifiedDate")(modifiedDate)
    if (replies != null) __obj.updateDynamic("replies")(replies)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Comment]
  }
}

