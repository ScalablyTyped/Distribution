package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermission extends js.Object {
  var accountProfiles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var level: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var permissionGroupId: js.UndefOr[java.lang.String] = js.undefined
}

object AccountPermission {
  @scala.inline
  def apply(
    accountProfiles: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    level: java.lang.String = null,
    name: java.lang.String = null,
    permissionGroupId: java.lang.String = null
  ): AccountPermission = {
    val __obj = js.Dynamic.literal()
    if (accountProfiles != null) __obj.updateDynamic("accountProfiles")(accountProfiles)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (level != null) __obj.updateDynamic("level")(level)
    if (name != null) __obj.updateDynamic("name")(name)
    if (permissionGroupId != null) __obj.updateDynamic("permissionGroupId")(permissionGroupId)
    __obj.asInstanceOf[AccountPermission]
  }
}

