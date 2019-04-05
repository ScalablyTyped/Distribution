package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsCustomBatchRequestEntry extends js.Object {
  var account: js.UndefOr[Account] = js.undefined
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var linkRequest: js.UndefOr[AccountsCustomBatchRequestEntryLinkRequest] = js.undefined
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
}

object AccountsCustomBatchRequestEntry {
  @scala.inline
  def apply(
    account: Account = null,
    accountId: java.lang.String = null,
    batchId: scala.Int | scala.Double = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    linkRequest: AccountsCustomBatchRequestEntryLinkRequest = null,
    merchantId: java.lang.String = null,
    method: java.lang.String = null,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined
  ): AccountsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account)
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (linkRequest != null) __obj.updateDynamic("linkRequest")(linkRequest)
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    __obj.asInstanceOf[AccountsCustomBatchRequestEntry]
  }
}

