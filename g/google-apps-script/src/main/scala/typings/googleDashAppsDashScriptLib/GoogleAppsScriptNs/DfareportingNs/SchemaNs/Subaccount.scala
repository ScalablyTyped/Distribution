package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subaccount extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var availablePermissionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Subaccount {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    availablePermissionIds: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null
  ): Subaccount = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (availablePermissionIds != null) __obj.updateDynamic("availablePermissionIds")(availablePermissionIds)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Subaccount]
  }
}

