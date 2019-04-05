package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountstatusesCustomBatchResponseEntry extends js.Object {
  var accountStatus: js.UndefOr[AccountStatus] = js.undefined
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var errors: js.UndefOr[Errors] = js.undefined
}

object AccountstatusesCustomBatchResponseEntry {
  @scala.inline
  def apply(
    accountStatus: AccountStatus = null,
    batchId: scala.Int | scala.Double = null,
    errors: Errors = null
  ): AccountstatusesCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (accountStatus != null) __obj.updateDynamic("accountStatus")(accountStatus)
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[AccountstatusesCustomBatchResponseEntry]
  }
}

