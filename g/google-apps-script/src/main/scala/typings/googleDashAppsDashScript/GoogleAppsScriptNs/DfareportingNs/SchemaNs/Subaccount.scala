package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subaccount extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var availablePermissionIds: js.UndefOr[js.Array[String]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Subaccount {
  @scala.inline
  def apply(
    accountId: String = null,
    availablePermissionIds: js.Array[String] = null,
    id: String = null,
    kind: String = null,
    name: String = null
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

