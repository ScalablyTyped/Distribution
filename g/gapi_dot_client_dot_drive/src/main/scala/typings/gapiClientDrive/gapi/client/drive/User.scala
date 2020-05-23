package typings.gapiClientDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /** A plain text displayable name for this user. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The email address of the user. This may not be present in certain contexts if the user has not made their email address visible to the requester. */
  var emailAddress: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#user". */
  var kind: js.UndefOr[String] = js.undefined
  /** Whether this user is the requesting user. */
  var me: js.UndefOr[Boolean] = js.undefined
  /** The user's ID as visible in Permission resources. */
  var permissionId: js.UndefOr[String] = js.undefined
  /** A link to the user's profile photo, if available. */
  var photoLink: js.UndefOr[String] = js.undefined
}

object User {
  @scala.inline
  def apply(
    displayName: String = null,
    emailAddress: String = null,
    kind: String = null,
    me: js.UndefOr[Boolean] = js.undefined,
    permissionId: String = null,
    photoLink: String = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(me)) __obj.updateDynamic("me")(me.get.asInstanceOf[js.Any])
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId.asInstanceOf[js.Any])
    if (photoLink != null) __obj.updateDynamic("photoLink")(photoLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

