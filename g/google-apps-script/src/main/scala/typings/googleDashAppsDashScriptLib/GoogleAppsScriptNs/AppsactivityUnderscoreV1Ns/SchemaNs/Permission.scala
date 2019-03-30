package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AppsactivityUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var permissionId: js.UndefOr[java.lang.String] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var user: js.UndefOr[User] = js.undefined
  var withLink: js.UndefOr[scala.Boolean] = js.undefined
}

object Permission {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    permissionId: java.lang.String = null,
    role: java.lang.String = null,
    `type`: java.lang.String = null,
    user: User = null,
    withLink: js.UndefOr[scala.Boolean] = js.undefined
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

