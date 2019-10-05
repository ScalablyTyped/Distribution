package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentReply extends js.Object {
  var author: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.User] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var createdDate: js.UndefOr[String] = js.undefined
  var deleted: js.UndefOr[Boolean] = js.undefined
  var htmlContent: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var modifiedDate: js.UndefOr[String] = js.undefined
  var replyId: js.UndefOr[String] = js.undefined
  var verb: js.UndefOr[String] = js.undefined
}

object CommentReply {
  @scala.inline
  def apply(
    author: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.User = null,
    content: String = null,
    createdDate: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    htmlContent: String = null,
    kind: String = null,
    modifiedDate: String = null,
    replyId: String = null,
    verb: String = null
  ): CommentReply = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (content != null) __obj.updateDynamic("content")(content)
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (htmlContent != null) __obj.updateDynamic("htmlContent")(htmlContent)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (modifiedDate != null) __obj.updateDynamic("modifiedDate")(modifiedDate)
    if (replyId != null) __obj.updateDynamic("replyId")(replyId)
    if (verb != null) __obj.updateDynamic("verb")(verb)
    __obj.asInstanceOf[CommentReply]
  }
}

