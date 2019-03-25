package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleRolePrivileges extends js.Object {
  var privilegeName: js.UndefOr[java.lang.String] = js.undefined
  var serviceId: js.UndefOr[java.lang.String] = js.undefined
}

object RoleRolePrivileges {
  @scala.inline
  def apply(privilegeName: java.lang.String = null, serviceId: java.lang.String = null): RoleRolePrivileges = {
    val __obj = js.Dynamic.literal()
    if (privilegeName != null) __obj.updateDynamic("privilegeName")(privilegeName)
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId)
    __obj.asInstanceOf[RoleRolePrivileges]
  }
}

