package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClientDrive.anon.Inherited
import typings.gapiClientDrive.anon.InheritedFrom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  /** Whether the permission allows the file to be discovered through search. This is only applicable for permissions of type domain or anyone. */
  var allowFileDiscovery: js.UndefOr[Boolean] = js.undefined
  /** Whether the account associated with this permission has been deleted. This field only pertains to user and group permissions. */
  var deleted: js.UndefOr[Boolean] = js.undefined
  /**
    * The "pretty" name of the value of the permission. The following is a list of examples for each type of permission:
    * - user - User's full name, as defined for their Google account, such as "Joe Smith."
    * - group - Name of the Google Group, such as "The Company Administrators."
    * - domain - String domain name, such as "thecompany.com."
    * - anyone - No displayName is present.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /** The domain to which this permission refers. */
  var domain: js.UndefOr[String] = js.undefined
  /** The email address of the user or group to which this permission refers. */
  var emailAddress: js.UndefOr[String] = js.undefined
  /**
    * The time at which this permission will expire (RFC 3339 date-time). Expiration times have the following restrictions:
    * - They can only be set on user and group permissions
    * - The time must be in the future
    * - The time cannot be more than a year in the future
    */
  var expirationTime: js.UndefOr[String] = js.undefined
  /**
    * The ID of this permission. This is a unique identifier for the grantee, and is published in User resources as permissionId. IDs should be treated as
    * opaque values.
    */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#permission". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Details of whether the permissions on this shared drive item are inherited or directly on this item. This is an output-only field which is present only
    * for shared drive items.
    */
  var permissionDetails: js.UndefOr[js.Array[Inherited]] = js.undefined
  /** A link to the user's profile photo, if available. */
  var photoLink: js.UndefOr[String] = js.undefined
  /**
    * The role granted by this permission. While new values may be supported in the future, the following are currently allowed:
    * - owner
    * - organizer
    * - fileOrganizer
    * - writer
    * - commenter
    * - reader
    */
  var role: js.UndefOr[String] = js.undefined
  /** Deprecated - use permissionDetails instead. */
  var teamDrivePermissionDetails: js.UndefOr[js.Array[InheritedFrom]] = js.undefined
  /**
    * The type of the grantee. Valid values are:
    * - user
    * - group
    * - domain
    * - anyone  When creating a permission, if type is user or group, you must provide an emailAddress for the user or group. When type is domain, you must
    * provide a domain. There isn't extra information required for a anyone type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Permission {
  @scala.inline
  def apply(
    allowFileDiscovery: js.UndefOr[Boolean] = js.undefined,
    deleted: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    domain: String = null,
    emailAddress: String = null,
    expirationTime: String = null,
    id: String = null,
    kind: String = null,
    permissionDetails: js.Array[Inherited] = null,
    photoLink: String = null,
    role: String = null,
    teamDrivePermissionDetails: js.Array[InheritedFrom] = null,
    `type`: String = null
  ): Permission = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFileDiscovery)) __obj.updateDynamic("allowFileDiscovery")(allowFileDiscovery.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (permissionDetails != null) __obj.updateDynamic("permissionDetails")(permissionDetails.asInstanceOf[js.Any])
    if (photoLink != null) __obj.updateDynamic("photoLink")(photoLink.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (teamDrivePermissionDetails != null) __obj.updateDynamic("teamDrivePermissionDetails")(teamDrivePermissionDetails.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
}

