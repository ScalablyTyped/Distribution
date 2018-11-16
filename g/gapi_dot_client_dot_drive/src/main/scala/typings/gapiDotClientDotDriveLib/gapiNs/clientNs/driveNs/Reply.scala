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

