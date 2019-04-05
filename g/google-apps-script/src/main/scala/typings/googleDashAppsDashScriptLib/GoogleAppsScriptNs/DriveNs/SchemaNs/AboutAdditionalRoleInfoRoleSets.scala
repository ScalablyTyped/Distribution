package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutAdditionalRoleInfoRoleSets extends js.Object {
  var additionalRoles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var primaryRole: js.UndefOr[java.lang.String] = js.undefined
}

object AboutAdditionalRoleInfoRoleSets {
  @scala.inline
  def apply(additionalRoles: js.Array[java.lang.String] = null, primaryRole: java.lang.String = null): AboutAdditionalRoleInfoRoleSets = {
    val __obj = js.Dynamic.literal()
    if (additionalRoles != null) __obj.updateDynamic("additionalRoles")(additionalRoles)
    if (primaryRole != null) __obj.updateDynamic("primaryRole")(primaryRole)
    __obj.asInstanceOf[AboutAdditionalRoleInfoRoleSets]
  }
}

