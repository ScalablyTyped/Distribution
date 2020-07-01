package typings.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about the permissions and type of access allowed with
  * regards to a Google Drive object. This is a subset of the fields contained
  * in a corresponding Drive Permissions object.
  */
@js.native
trait SchemaPermission extends js.Object {
  /**
    * The name of the user or group the permission applies to.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID for this permission. Corresponds to the Drive API&#39;s permission
    * ID returned as part of the Drive Permissions resource.
    */
  var permissionId: js.UndefOr[String] = js.native
  /**
    * Indicates the Google Drive permissions role. The role determines a
    * user&#39;s ability to read, write, or comment on the file.
    */
  var role: js.UndefOr[String] = js.native
  /**
    * Indicates how widely permissions are granted.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The user&#39;s information if the type is USER.
    */
  var user: js.UndefOr[SchemaUser] = js.native
  /**
    * Whether the permission requires a link to the file.
    */
  var withLink: js.UndefOr[Boolean] = js.native
}

object SchemaPermission {
  @scala.inline
  def apply(
    name: String = null,
    permissionId: String = null,
    role: String = null,
    `type`: String = null,
    user: SchemaUser = null,
    withLink: js.UndefOr[Boolean] = js.undefined
  ): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (!js.isUndefined(withLink)) __obj.updateDynamic("withLink")(withLink.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPermission]
  }
}

