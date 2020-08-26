package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveToNewOwnersRoot extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** A plain text custom message to include in the notification email. */
  var emailMessage: js.UndefOr[String] = js.native
  /**
    * Set to true to opt in to API behavior that aims for all items to have exactly one parent. This parameter only takes effect if the item is not in a
    * shared drive. See moveToNewOwnersRoot for details.
    */
  var enforceSingleParent: js.UndefOr[Boolean] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** The ID of the file or shared drive. */
  var fileId: String = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /**
    * This parameter only takes effect if the item is not in a shared drive and the request is attempting to transfer the ownership of the item. When set to
    * true, the item is moved to the new owner's My Drive root folder and all prior parents removed. If set to false, when enforceSingleParent=true, parents
    * are not changed. If set to false, when enforceSingleParent=false, existing parents are not changed; however, the file will be added to the new owner's
    * My Drive root folder, unless it is already in the new owner's My Drive.
    */
  var moveToNewOwnersRoot: js.UndefOr[Boolean] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * Whether to send a notification email when sharing to users or groups. This defaults to true for users and groups, and is not allowed for other
    * requests. It must not be disabled for ownership transfers.
    */
  var sendNotificationEmail: js.UndefOr[Boolean] = js.native
  /** Whether the requesting application supports both My Drives and shared drives. */
  var supportsAllDrives: js.UndefOr[Boolean] = js.native
  /** Deprecated use supportsAllDrives instead. */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * Whether to transfer ownership to the specified user and downgrade the current owner to a writer. This parameter is required as an acknowledgement of
    * the side effect.
    */
  var transferOwnership: js.UndefOr[Boolean] = js.native
  /**
    * Issue the request as a domain administrator; if set to true, then the requester will be granted access if the file ID parameter refers to a shared
    * drive and the requester is an administrator of the domain to which the shared drive belongs.
    */
  var useDomainAdminAccess: js.UndefOr[Boolean] = js.native
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
}

object MoveToNewOwnersRoot {
  @scala.inline
  def apply(fileId: String): MoveToNewOwnersRoot = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveToNewOwnersRoot]
  }
  @scala.inline
  implicit class MoveToNewOwnersRootOps[Self <: MoveToNewOwnersRoot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setEmailMessage(value: String): Self = this.set("emailMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailMessage: Self = this.set("emailMessage", js.undefined)
    @scala.inline
    def setEnforceSingleParent(value: Boolean): Self = this.set("enforceSingleParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnforceSingleParent: Self = this.set("enforceSingleParent", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMoveToNewOwnersRoot(value: Boolean): Self = this.set("moveToNewOwnersRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveToNewOwnersRoot: Self = this.set("moveToNewOwnersRoot", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setSendNotificationEmail(value: Boolean): Self = this.set("sendNotificationEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendNotificationEmail: Self = this.set("sendNotificationEmail", js.undefined)
    @scala.inline
    def setSupportsAllDrives(value: Boolean): Self = this.set("supportsAllDrives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsAllDrives: Self = this.set("supportsAllDrives", js.undefined)
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = this.set("supportsTeamDrives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsTeamDrives: Self = this.set("supportsTeamDrives", js.undefined)
    @scala.inline
    def setTransferOwnership(value: Boolean): Self = this.set("transferOwnership", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferOwnership: Self = this.set("transferOwnership", js.undefined)
    @scala.inline
    def setUseDomainAdminAccess(value: Boolean): Self = this.set("useDomainAdminAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseDomainAdminAccess: Self = this.set("useDomainAdminAccess", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

