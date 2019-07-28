package typings.gapiDotClientDotAppsactivity.gapiNs.clientNs.appsactivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  /** The name of the user or group the permission applies to. */
  var name: js.UndefOr[String] = js.undefined
  /** The ID for this permission. Corresponds to the Drive API's permission ID returned as part of the Drive Permissions resource. */
  var permissionId: js.UndefOr[String] = js.undefined
  /** Indicates the Google Drive permissions role. The role determines a user's ability to read, write, or comment on the file. */
  var role: js.UndefOr[String] = js.undefined
  /** Indicates how widely permissions are granted. */
  var `type`: js.UndefOr[String] = js.undefined
  /** The user's information if the type is USER. */
  var user: js.UndefOr[User] = js.undefined
  /** Whether the permission requires a link to the file. */
  var withLink: js.UndefOr[Boolean] = js.undefined
}

object Permission {
  @scala.inline
  def apply(
    name: String = null,
    permissionId: String = null,
    role: String = null,
    `type`: String = null,
    user: User = null,
    withLink: js.UndefOr[Boolean] = js.undefined
  ): Permission = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId)
    if (role != null) __obj.updateDynamic("role")(role)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (user != null) __obj.updateDynamic("user")(user)
    if (!js.isUndefined(withLink)) __obj.updateDynamic("withLink")(withLink)
    __obj.asInstanceOf[Permission]
  }
}

