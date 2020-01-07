package typings.googleapis.buildSrcApisDriveV3Mod.drive_v3

import typings.googleapis.Anon_MimeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A comment on a file.
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
    * The user who created the comment.
    */
  var author: js.UndefOr[Schema$User] = js.native
  /**
    * The plain text content of the comment. This field is used for setting the
    * content, while htmlContent should be displayed.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The time at which the comment was created (RFC 3339 date-time).
    */
  var createdTime: js.UndefOr[String] = js.native
  /**
    * Whether the comment has been deleted. A deleted comment has no content.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * The content of the comment with HTML formatting.
    */
  var htmlContent: js.UndefOr[String] = js.native
  /**
    * The ID of the comment.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#comment&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The last time the comment or any of its replies was modified (RFC 3339
    * date-time).
    */
  var modifiedTime: js.UndefOr[String] = js.native
  /**
    * The file content to which the comment refers, typically within the anchor
    * region. For a text file, for example, this would be the text at the
    * location of the comment.
    */
  var quotedFileContent: js.UndefOr[Anon_MimeType] = js.native
  /**
    * The full list of replies to the comment in chronological order.
    */
  var replies: js.UndefOr[js.Array[Schema$Reply]] = js.native
  /**
    * Whether the comment has been resolved by one of its replies.
    */
  var resolved: js.UndefOr[Boolean] = js.native
}

object Schema$Comment {
  @scala.inline
  def apply(
    anchor: String = null,
    author: Schema$User = null,
    content: String = null,
    createdTime: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    htmlContent: String = null,
    id: String = null,
    kind: String = null,
    modifiedTime: String = null,
    quotedFileContent: Anon_MimeType = null,
    replies: js.Array[Schema$Reply] = null,
    resolved: js.UndefOr[Boolean] = js.undefined
  ): Schema$Comment = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (htmlContent != null) __obj.updateDynamic("htmlContent")(htmlContent.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (modifiedTime != null) __obj.updateDynamic("modifiedTime")(modifiedTime.asInstanceOf[js.Any])
    if (quotedFileContent != null) __obj.updateDynamic("quotedFileContent")(quotedFileContent.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (!js.isUndefined(resolved)) __obj.updateDynamic("resolved")(resolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Comment]
  }
}

