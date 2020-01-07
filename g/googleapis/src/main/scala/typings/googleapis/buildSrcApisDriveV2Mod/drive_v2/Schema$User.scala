package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import typings.googleapis.Anon_Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a Drive user.
  */
@js.native
trait Schema$User extends js.Object {
  /**
    * A plain text displayable name for this user.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The email address of the user.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * Whether this user is the same as the authenticated user for whom the
    * request was made.
    */
  var isAuthenticatedUser: js.UndefOr[Boolean] = js.native
  /**
    * This is always drive#user.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The user&#39;s ID as visible in the permissions collection.
    */
  var permissionId: js.UndefOr[String] = js.native
  /**
    * The user&#39;s profile picture.
    */
  var picture: js.UndefOr[Anon_Url] = js.native
}

object Schema$User {
  @scala.inline
  def apply(
    displayName: String = null,
    emailAddress: String = null,
    isAuthenticatedUser: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    permissionId: String = null,
    picture: Anon_Url = null
  ): Schema$User = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(isAuthenticatedUser)) __obj.updateDynamic("isAuthenticatedUser")(isAuthenticatedUser.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId.asInstanceOf[js.Any])
    if (picture != null) __obj.updateDynamic("picture")(picture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$User]
  }
}

