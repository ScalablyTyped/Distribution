package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reply extends js.Object {
  /**
    * The action the reply performed to the parent comment. Valid values are:
    * - resolve
    * - reopen
    */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** The user who created the reply. */
  var author: js.UndefOr[User] = js.undefined
  /**
    * The plain text content of the reply. This field is used for setting the content, while htmlContent should be displayed. This is required on creates if
    * no action is specified.
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which the reply was created (RFC 3339 date-time). */
  var createdTime: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the reply has been deleted. A deleted reply has no content. */
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  /** The content of the reply with HTML formatting. */
  var htmlContent: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the reply. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#reply". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The last time the reply was modified (RFC 3339 date-time). */
  var modifiedTime: js.UndefOr[java.lang.String] = js.undefined
}

object Reply {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    author: User = null,
    content: java.lang.String = null,
    createdTime: java.lang.String = null,
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    htmlContent: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    modifiedTime: java.lang.String = null
  ): Reply = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (author != null) __obj.updateDynamic("author")(author)
    if (content != null) __obj.updateDynamic("content")(content)
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (htmlContent != null) __obj.updateDynamic("htmlContent")(htmlContent)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (modifiedTime != null) __obj.updateDynamic("modifiedTime")(modifiedTime)
    __obj.asInstanceOf[Reply]
  }
}

