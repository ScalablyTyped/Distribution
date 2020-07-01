package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveToNewOwnersRoot extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** A plain text custom message to include in the notification email. */
  var emailMessage: js.UndefOr[String] = js.undefined
  /**
    * Set to true to opt in to API behavior that aims for all items to have exactly one parent. This parameter only takes effect if the item is not in a
    * shared drive. See moveToNewOwnersRoot for details.
    */
  var enforceSingleParent: js.UndefOr[Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** The ID of the file or shared drive. */
  var fileId: String
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * This parameter only takes effect if the item is not in a shared drive and the request is attempting to transfer the ownership of the item. When set to
    * true, the item is moved to the new owner's My Drive root folder and all prior parents removed. If set to false, when enforceSingleParent=true, parents
    * are not changed. If set to false, when enforceSingleParent=false, existing parents are not changed; however, the file will be added to the new owner's
    * My Drive root folder, unless it is already in the new owner's My Drive.
    */
  var moveToNewOwnersRoot: js.UndefOr[Boolean] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * Whether to send a notification email when sharing to users or groups. This defaults to true for users and groups, and is not allowed for other
    * requests. It must not be disabled for ownership transfers.
    */
  var sendNotificationEmail: js.UndefOr[Boolean] = js.undefined
  /** Whether the requesting application supports both My Drives and shared drives. */
  var supportsAllDrives: js.UndefOr[Boolean] = js.undefined
  /** Deprecated use supportsAllDrives instead. */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to transfer ownership to the specified user and downgrade the current owner to a writer. This parameter is required as an acknowledgement of
    * the side effect.
    */
  var transferOwnership: js.UndefOr[Boolean] = js.undefined
  /**
    * Issue the request as a domain administrator; if set to true, then the requester will be granted access if the file ID parameter refers to a shared
    * drive and the requester is an administrator of the domain to which the shared drive belongs.
    */
  var useDomainAdminAccess: js.UndefOr[Boolean] = js.undefined
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
}

object MoveToNewOwnersRoot {
  @scala.inline
  def apply(
    fileId: String,
    alt: String = null,
    emailMessage: String = null,
    enforceSingleParent: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    key: String = null,
    moveToNewOwnersRoot: js.UndefOr[Boolean] = js.undefined,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    sendNotificationEmail: js.UndefOr[Boolean] = js.undefined,
    supportsAllDrives: js.UndefOr[Boolean] = js.undefined,
    supportsTeamDrives: js.UndefOr[Boolean] = js.undefined,
    transferOwnership: js.UndefOr[Boolean] = js.undefined,
    useDomainAdminAccess: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): MoveToNewOwnersRoot = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (emailMessage != null) __obj.updateDynamic("emailMessage")(emailMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceSingleParent)) __obj.updateDynamic("enforceSingleParent")(enforceSingleParent.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(moveToNewOwnersRoot)) __obj.updateDynamic("moveToNewOwnersRoot")(moveToNewOwnersRoot.get.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(sendNotificationEmail)) __obj.updateDynamic("sendNotificationEmail")(sendNotificationEmail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsAllDrives)) __obj.updateDynamic("supportsAllDrives")(supportsAllDrives.get.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transferOwnership)) __obj.updateDynamic("transferOwnership")(transferOwnership.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useDomainAdminAccess)) __obj.updateDynamic("useDomainAdminAccess")(useDomainAdminAccess.get.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveToNewOwnersRoot]
  }
}

