package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxCustomBatchRequestEntry extends js.Object {
  /** The ID of the account for which to get/update account tax settings. */
  var accountId: js.UndefOr[String] = js.undefined
  /** The account tax settings to update. Only defined if the method is update. */
  var accountTax: js.UndefOr[AccountTax] = js.undefined
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.undefined
  /** The ID of the managing account. */
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
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (accountTax != null) __obj.updateDynamic("accountTax")(accountTax.asInstanceOf[js.Any])
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccounttaxCustomBatchRequestEntry]
  }
}

