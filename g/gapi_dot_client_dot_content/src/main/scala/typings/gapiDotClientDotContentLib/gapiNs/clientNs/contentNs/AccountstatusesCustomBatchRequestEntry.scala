package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountstatusesCustomBatchRequestEntry extends js.Object {
  /** The ID of the (sub-)account whose status to get. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  /** The method (get). */
  var method: js.UndefOr[java.lang.String] = js.undefined
}

object AccountstatusesCustomBatchRequestEntry {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    batchId: scala.Int | scala.Double = null,
    merchantId: java.lang.String = null,
    method: java.lang.String = null
  ): AccountstatusesCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[AccountstatusesCustomBatchRequestEntry]
  }
}

