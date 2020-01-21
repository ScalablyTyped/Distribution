package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsCustomBatchRequestEntry extends js.Object {
  var account: js.UndefOr[Account] = js.undefined
  var accountId: js.UndefOr[String] = js.undefined
  var batchId: js.UndefOr[Double] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var linkRequest: js.UndefOr[AccountsCustomBatchRequestEntryLinkRequest] = js.undefined
  var merchantId: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var overwrite: js.UndefOr[Boolean] = js.undefined
}

object AccountsCustomBatchRequestEntry {
  @scala.inline
  def apply(
    account: Account = null,
    accountId: String = null,
    batchId: Int | Double = null,
    force: js.UndefOr[Boolean] = js.undefined,
    linkRequest: AccountsCustomBatchRequestEntryLinkRequest = null,
    merchantId: String = null,
    method: String = null,
    overwrite: js.UndefOr[Boolean] = js.undefined
  ): AccountsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (linkRequest != null) __obj.updateDynamic("linkRequest")(linkRequest.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsCustomBatchRequestEntry]
  }
}

