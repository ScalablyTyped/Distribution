package typings.gapiDotClientDotDrive.gapi.client.drive

import typings.gapiDotClientDotDrive.Anon_MimeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  /** A region of the document represented as a JSON string. See anchor documentation for details on how to define and interpret anchor properties. */
  var anchor: js.UndefOr[String] = js.undefined
  /** The user who created the comment. */
  var author: js.UndefOr[User] = js.undefined
  /** The plain text content of the comment. This field is used for setting the content, while htmlContent should be displayed. */
  var content: js.UndefOr[String] = js.undefined
  /** The time at which the comment was created (RFC 3339 date-time). */
  var createdTime: js.UndefOr[String] = js.undefined
  /** Whether the comment has been deleted. A deleted comment has no content. */
  var deleted: js.UndefOr[Boolean] = js.undefined
  /** The content of the comment with HTML formatting. */
  var htmlContent: js.UndefOr[String] = js.undefined
  /** The ID of the comment. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#comment". */
  var kind: js.UndefOr[String] = js.undefined
  /** The last time the comment or any of its replies was modified (RFC 3339 date-time). */
  var modifiedTime: js.UndefOr[String] = js.undefined
  /**
    * The file content to which the comment refers, typically within the anchor region. For a text file, for example, this would be the text at the location
    * of the comment.
    */
  var quotedFileContent: js.UndefOr[Anon_MimeType] = js.undefined
  /** The full list of replies to the comment in chronological order. */
  var replies: js.UndefOr[js.Array[Reply]] = js.undefined
  /** Whether the comment has been resolved by one of its replies. */
  var resolved: js.UndefOr[Boolean] = js.undefined
}

object Comment {
  @scala.inline
  def apply(
    anchor: String = null,
    author: User = null,
    content: String = null,
    createdTime: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    htmlContent: String = null,
    id: String = null,
    kind: String = null,
    modifiedTime: String = null,
    quotedFileContent: Anon_MimeType = null,
    replies: js.Array[Reply] = null,
    resolved: js.UndefOr[Boolean] = js.undefined
  ): Comment = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (author != null) __obj.updateDynamic("author")(author)
    if (content != null) __obj.updateDynamic("content")(content)
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (htmlContent != null) __obj.updateDynamic("htmlContent")(htmlContent)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (modifiedTime != null) __obj.updateDynamic("modifiedTime")(modifiedTime)
    if (quotedFileContent != null) __obj.updateDynamic("quotedFileContent")(quotedFileContent)
    if (replies != null) __obj.updateDynamic("replies")(replies)
    if (!js.isUndefined(resolved)) __obj.updateDynamic("resolved")(resolved)
    __obj.asInstanceOf[Comment]
  }
}

