package typings.gapiDotClientDotDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reply extends js.Object {
  /**
    * The action the reply performed to the parent comment. Valid values are:
    * - resolve
    * - reopen
    */
  var action: js.UndefOr[String] = js.undefined
  /** The user who created the reply. */
  var author: js.UndefOr[User] = js.undefined
  /**
    * The plain text content of the reply. This field is used for setting the content, while htmlContent should be displayed. This is required on creates if
    * no action is specified.
    */
  var content: js.UndefOr[String] = js.undefined
  /** The time at which the reply was created (RFC 3339 date-time). */
  var createdTime: js.UndefOr[String] = js.undefined
  /** Whether the reply has been deleted. A deleted reply has no content. */
  var deleted: js.UndefOr[Boolean] = js.undefined
  /** The content of the reply with HTML formatting. */
  var htmlContent: js.UndefOr[String] = js.undefined
  /** The ID of the reply. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#reply". */
  var kind: js.UndefOr[String] = js.undefined
  /** The last time the reply was modified (RFC 3339 date-time). */
  var modifiedTime: js.UndefOr[String] = js.undefined
}

object Reply {
  @scala.inline
  def apply(
    action: String = null,
    author: User = null,
    content: String = null,
    createdTime: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    htmlContent: String = null,
    id: String = null,
    kind: String = null,
    modifiedTime: String = null
  ): Reply = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (htmlContent != null) __obj.updateDynamic("htmlContent")(htmlContent.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (modifiedTime != null) __obj.updateDynamic("modifiedTime")(modifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reply]
  }
}

