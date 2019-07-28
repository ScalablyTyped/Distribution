package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermission extends js.Object {
  var availability: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var permissionGroupId: js.UndefOr[String] = js.undefined
}

object UserRolePermission {
  @scala.inline
  def apply(
    availability: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    permissionGroupId: String = null
  ): UserRolePermission = {
    val __obj = js.Dynamic.literal()
    if (availability != null) __obj.updateDynamic("availability")(availability)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (permissionGroupId != null) __obj.updateDynamic("permissionGroupId")(permissionGroupId)
    __obj.asInstanceOf[UserRolePermission]
  }
}

