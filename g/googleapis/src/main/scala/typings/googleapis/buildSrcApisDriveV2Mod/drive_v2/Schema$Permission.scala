package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import typings.googleapis.Anon_AdditionalRolesInherited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A permission for a file.
  */
@js.native
trait Schema$Permission extends js.Object {
  /**
    * Additional roles for this user. Only commenter is currently allowed,
    * though more may be supported in the future.
    */
  var additionalRoles: js.UndefOr[js.Array[String]] = js.native
  /**
    * Deprecated.
    */
  var authKey: js.UndefOr[String] = js.native
  /**
    * Whether the account associated with this permission has been deleted.
    * This field only pertains to user and group permissions.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * The domain name of the entity this permission refers to. This is an
    * output-only field which is present when the permission type is user,
    * group or domain.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * The email address of the user or group this permission refers to. This is
    * an output-only field which is present when the permission type is user or
    * group.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * The ETag of the permission.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The time at which this permission will expire (RFC 3339 date-time).
    * Expiration dates have the following restrictions:   - They can only be
    * set on user and group permissions  - The date must be in the future  -
    * The date cannot be more than a year in the future  - The date can only be
    * set on drive.permissions.update or drive.permissions.patch requests
    */
  var expirationDate: js.UndefOr[String] = js.native
  /**
    * The ID of the user this permission refers to, and identical to the
    * permissionId in the About and Files resources. When making a
    * drive.permissions.insert request, exactly one of the id or value fields
    * must be specified unless the permission type is anyone, in which case
    * both id and value are ignored.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * This is always drive#permission.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name for this permission.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A link to the profile photo, if available.
    */
  var photoLink: js.UndefOr[String] = js.native
  /**
    * The primary role for this user. While new values may be supported in the
    * future, the following are currently allowed:   - owner  - organizer  -
    * fileOrganizer  - writer  - reader
    */
  var role: js.UndefOr[String] = js.native
  /**
    * A link back to this permission.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Details of whether the permissions on this Team Drive item are inherited
    * or directly on this item. This is an output-only field which is present
    * only for Team Drive items.
    */
  var teamDrivePermissionDetails: js.UndefOr[js.Array[Anon_AdditionalRolesInherited]] = js.native
  /**
    * The account type. Allowed values are:   - user  - group  - domain  -
    * anyone
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The email address or domain name for the entity. This is used during
    * inserts and is not populated in responses. When making a
    * drive.permissions.insert request, exactly one of the id or value fields
    * must be specified unless the permission type is anyone, in which case
    * both id and value are ignored.
    */
  var value: js.UndefOr[String] = js.native
  /**
    * Whether the link is required for this permission.
    */
  var withLink: js.UndefOr[Boolean] = js.native
}

object Schema$Permission {
  @scala.inline
  def apply(
    additionalRoles: js.Array[String] = null,
    authKey: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    domain: String = null,
    emailAddress: String = null,
    etag: String = null,
    expirationDate: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    photoLink: String = null,
    role: String = null,
    selfLink: String = null,
    teamDrivePermissionDetails: js.Array[Anon_AdditionalRolesInherited] = null,
    `type`: String = null,
    value: String = null,
    withLink: js.UndefOr[Boolean] = js.undefined
  ): Schema$Permission = {
    val __obj = js.Dynamic.literal()
    if (additionalRoles != null) __obj.updateDynamic("additionalRoles")(additionalRoles.asInstanceOf[js.Any])
    if (authKey != null) __obj.updateDynamic("authKey")(authKey.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (photoLink != null) __obj.updateDynamic("photoLink")(photoLink.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (teamDrivePermissionDetails != null) __obj.updateDynamic("teamDrivePermissionDetails")(teamDrivePermissionDetails.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(withLink)) __obj.updateDynamic("withLink")(withLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Permission]
  }
}

