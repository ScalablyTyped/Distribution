package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxCustomBatchRequestEntry extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var accountTax: js.UndefOr[AccountTax] = js.undefined
  var batchId: js.UndefOr[Double] = js.undefined
  var merchantId: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
}

object AccounttaxCustomBatchRequestEntry {
  @scala.inline
  def apply(
    accountId: String = null,
    accountTax: AccountTax = null,
    batchId: Int | Double = null,
    merchantId: String = null,
    method: String = null
  ): AccounttaxCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (accountTax != null) __obj.updateDynamic("accountTax")(accountTax)
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[AccounttaxCustomBatchRequestEntry]
  }
}

