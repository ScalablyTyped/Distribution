package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountstatusesCustomBatchRequestEntry extends js.Object {
  /** The ID of the (sub-)account whose status to get. */
  var accountId: js.UndefOr[String] = js.undefined
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.undefined
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[String] = js.undefined
  /** The method (get). */
  var method: js.UndefOr[String] = js.undefined
}

object AccountstatusesCustomBatchRequestEntry {
  @scala.inline
  def apply(
    accountId: String = null,
    batchId: js.UndefOr[Double] = js.undefined,
    merchantId: String = null,
    method: String = null
  ): AccountstatusesCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(batchId)) __obj.updateDynamic("batchId")(batchId.get.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountstatusesCustomBatchRequestEntry]
  }
}

