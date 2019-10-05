package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountstatusesCustomBatchRequestEntry extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var batchId: js.UndefOr[Double] = js.undefined
  var destinations: js.UndefOr[js.Array[String]] = js.undefined
  var merchantId: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
}

object AccountstatusesCustomBatchRequestEntry {
  @scala.inline
  def apply(
    accountId: String = null,
    batchId: Int | Double = null,
    destinations: js.Array[String] = null,
    merchantId: String = null,
    method: String = null
  ): AccountstatusesCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (destinations != null) __obj.updateDynamic("destinations")(destinations)
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[AccountstatusesCustomBatchRequestEntry]
  }
}

