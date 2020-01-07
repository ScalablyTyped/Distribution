package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.googleapis.Anon_PrivilegeName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for role resource in Directory API.
  */
@js.native
trait Schema$Role extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Returns true if the role is a super admin role.
    */
  var isSuperAdminRole: js.UndefOr[Boolean] = js.native
  /**
    * Returns true if this is a pre-defined system role.
    */
  var isSystemRole: js.UndefOr[Boolean] = js.native
  /**
    * The type of the API resource. This is always admin#directory#role.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A short description of the role.
    */
  var roleDescription: js.UndefOr[String] = js.native
  /**
    * ID of the role.
    */
  var roleId: js.UndefOr[String] = js.native
  /**
    * Name of the role.
    */
  var roleName: js.UndefOr[String] = js.native
  /**
    * The set of privileges that are granted to this role.
    */
  var rolePrivileges: js.UndefOr[js.Array[Anon_PrivilegeName]] = js.native
}

object Schema$Role {
  @scala.inline
  def apply(
    etag: String = null,
    isSuperAdminRole: js.UndefOr[Boolean] = js.undefined,
    isSystemRole: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    roleDescription: String = null,
    roleId: String = null,
    roleName: String = null,
    rolePrivileges: js.Array[Anon_PrivilegeName] = null
  ): Schema$Role = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(isSuperAdminRole)) __obj.updateDynamic("isSuperAdminRole")(isSuperAdminRole.asInstanceOf[js.Any])
    if (!js.isUndefined(isSystemRole)) __obj.updateDynamic("isSystemRole")(isSystemRole.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (roleDescription != null) __obj.updateDynamic("roleDescription")(roleDescription.asInstanceOf[js.Any])
    if (roleId != null) __obj.updateDynamic("roleId")(roleId.asInstanceOf[js.Any])
    if (roleName != null) __obj.updateDynamic("roleName")(roleName.asInstanceOf[js.Any])
    if (rolePrivileges != null) __obj.updateDynamic("rolePrivileges")(rolePrivileges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Role]
  }
}

