package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsCustomBatchResponseEntry extends js.Object {
  var account: js.UndefOr[Account] = js.undefined
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var errors: js.UndefOr[Errors] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var linkStatus: js.UndefOr[java.lang.String] = js.undefined
}

object AccountsCustomBatchResponseEntry {
  @scala.inline
  def apply(
    account: Account = null,
    batchId: scala.Int | scala.Double = null,
    errors: Errors = null,
    kind: java.lang.String = null,
    linkStatus: java.lang.String = null
  ): AccountsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account)
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (linkStatus != null) __obj.updateDynamic("linkStatus")(linkStatus)
    __obj.asInstanceOf[AccountsCustomBatchResponseEntry]
  }
}

