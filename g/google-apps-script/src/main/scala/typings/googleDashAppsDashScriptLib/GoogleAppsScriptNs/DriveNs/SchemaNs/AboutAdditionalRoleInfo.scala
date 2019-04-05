package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutAdditionalRoleInfo extends js.Object {
  var roleSets: js.UndefOr[js.Array[AboutAdditionalRoleInfoRoleSets]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AboutAdditionalRoleInfo {
  @scala.inline
  def apply(roleSets: js.Array[AboutAdditionalRoleInfoRoleSets] = null, `type`: java.lang.String = null): AboutAdditionalRoleInfo = {
    val __obj = js.Dynamic.literal()
    if (roleSets != null) __obj.updateDynamic("roleSets")(roleSets)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AboutAdditionalRoleInfo]
  }
}

