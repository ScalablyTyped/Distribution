package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  /** A region of the document represented as a JSON string. See anchor documentation for details on how to define and interpret anchor properties. */
  var anchor: js.UndefOr[java.lang.String] = js.undefined
  /** The user who created the comment. */
  var author: js.UndefOr[User] = js.undefined
  /** The plain text content of the comment. This field is used for setting the content, while htmlContent should be displayed. */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which the comment was created (RFC 3339 date-time). */
  var createdTime: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the comment has been deleted. A deleted comment has no content. */
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  /** The content of the comment with HTML formatting. */
  var htmlContent: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the comment. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#comment". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The last time the comment or any of its replies was modified (RFC 3339 date-time). */
  var modifiedTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The file content to which the comment refers, typically within the anchor region. For a text file, for example, this would be the text at the location
    * of the comment.
    */
  var quotedFileContent: js.UndefOr[gapiDotClientDotDriveLib.Anon_MimeType] = js.undefined
  /** The full list of replies to the comment in chronological order. */
  var replies: js.UndefOr[js.Array[Reply]] = js.undefined
  /** Whether the comment has been resolved by one of its replies. */
  var resolved: js.UndefOr[scala.Boolean] = js.undefined
}

