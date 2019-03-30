package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentReply extends js.Object {
  var author: js.UndefOr[User] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var createdDate: js.UndefOr[java.lang.String] = js.undefined
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  var htmlContent: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var modifiedDate: js.UndefOr[java.lang.String] = js.undefined
  var replyId: js.UndefOr[java.lang.String] = js.undefined
  var verb: js.UndefOr[java.lang.String] = js.undefined
}

object CommentReply {
  @scala.inline
  def apply(
    author: User = null,
    content: java.lang.String = null,
    createdDate: java.lang.String = null,
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    htmlContent: java.lang.String = null,
    kind: java.lang.String = null,
    modifiedDate: java.lang.String = null,
    replyId: java.lang.String = null,
    verb: java.lang.String = null
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

