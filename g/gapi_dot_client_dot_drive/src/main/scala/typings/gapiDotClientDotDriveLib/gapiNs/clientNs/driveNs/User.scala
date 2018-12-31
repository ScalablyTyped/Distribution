package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /** A plain text displayable name for this user. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The email address of the user. This may not be present in certain contexts if the user has not made their email address visible to the requester. */
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#user". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this user is the requesting user. */
  var me: js.UndefOr[scala.Boolean] = js.undefined
  /** The user's ID as visible in Permission resources. */
  var permissionId: js.UndefOr[java.lang.String] = js.undefined
  /** A link to the user's profile photo, if available. */
  var photoLink: js.UndefOr[java.lang.String] = js.undefined
}

