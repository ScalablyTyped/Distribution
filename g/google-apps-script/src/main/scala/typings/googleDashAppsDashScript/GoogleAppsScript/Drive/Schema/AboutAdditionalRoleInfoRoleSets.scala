package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutAdditionalRoleInfoRoleSets extends js.Object {
  var additionalRoles: js.UndefOr[js.Array[String]] = js.undefined
  var primaryRole: js.UndefOr[String] = js.undefined
}

object AboutAdditionalRoleInfoRoleSets {
  @scala.inline
  def apply(additionalRoles: js.Array[String] = null, primaryRole: String = null): AboutAdditionalRoleInfoRoleSets = {
    val __obj = js.Dynamic.literal()
    if (additionalRoles != null) __obj.updateDynamic("additionalRoles")(additionalRoles)
    if (primaryRole != null) __obj.updateDynamic("primaryRole")(primaryRole)
    __obj.asInstanceOf[AboutAdditionalRoleInfoRoleSets]
  }
}

