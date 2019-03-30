package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountstatusesCustomBatchRequestEntry extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var destinations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
}

object AccountstatusesCustomBatchRequestEntry {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    batchId: scala.Int | scala.Double = null,
    destinations: js.Array[java.lang.String] = null,
    merchantId: java.lang.String = null,
    method: java.lang.String = null
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

