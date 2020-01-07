package typings.googleapis.buildSrcApisDriveV3Mod.drive_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarPermissionsDollarCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A plain text custom message to include in the notification email.
    */
  var emailMessage: js.UndefOr[String] = js.native
  /**
    * The ID of the file or Team Drive.
    */
  var fileId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Permission] = js.native
  /**
    * Whether to send a notification email when sharing to users or groups.
    * This defaults to true for users and groups, and is not allowed for other
    * requests. It must not be disabled for ownership transfers.
    */
  var sendNotificationEmail: js.UndefOr[Boolean] = js.native
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * Whether to transfer ownership to the specified user and downgrade the
    * current owner to a writer. This parameter is required as an
    * acknowledgement of the side effect.
    */
  var transferOwnership: js.UndefOr[Boolean] = js.native
  /**
    * Issue the request as a domain administrator; if set to true, then the
    * requester will be granted access if they are an administrator of the
    * domain to which the item belongs.
    */
  var useDomainAdminAccess: js.UndefOr[Boolean] = js.native
}

object ParamsDollarResourceDollarPermissionsDollarCreate {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    emailMessage: String = null,
    fields: String = null,
    fileId: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestBody: Schema$Permission = null,
    sendNotificationEmail: js.UndefOr[Boolean] = js.undefined,
    supportsTeamDrives: js.UndefOr[Boolean] = js.undefined,
    transferOwnership: js.UndefOr[Boolean] = js.undefined,
    useDomainAdminAccess: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): ParamsDollarResourceDollarPermissionsDollarCreate = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (emailMessage != null) __obj.updateDynamic("emailMessage")(emailMessage.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (!js.isUndefined(sendNotificationEmail)) __obj.updateDynamic("sendNotificationEmail")(sendNotificationEmail.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives.asInstanceOf[js.Any])
    if (!js.isUndefined(transferOwnership)) __obj.updateDynamic("transferOwnership")(transferOwnership.asInstanceOf[js.Any])
    if (!js.isUndefined(useDomainAdminAccess)) __obj.updateDynamic("useDomainAdminAccess")(useDomainAdminAccess.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarPermissionsDollarCreate]
  }
}

