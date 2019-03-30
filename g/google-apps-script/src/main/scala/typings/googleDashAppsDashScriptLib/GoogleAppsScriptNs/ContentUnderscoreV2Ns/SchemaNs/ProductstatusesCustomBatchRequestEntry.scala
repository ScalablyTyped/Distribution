package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductstatusesCustomBatchRequestEntry extends js.Object {
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var destinations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var includeAttributes: js.UndefOr[scala.Boolean] = js.undefined
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var productId: js.UndefOr[java.lang.String] = js.undefined
}

object ProductstatusesCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: scala.Int | scala.Double = null,
    destinations: js.Array[java.lang.String] = null,
    includeAttributes: js.UndefOr[scala.Boolean] = js.undefined,
    merchantId: java.lang.String = null,
    method: java.lang.String = null,
    productId: java.lang.String = null
  ): ProductstatusesCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (destinations != null) __obj.updateDynamic("destinations")(destinations)
    if (!js.isUndefined(includeAttributes)) __obj.updateDynamic("includeAttributes")(includeAttributes)
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (method != null) __obj.updateDynamic("method")(method)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    __obj.asInstanceOf[ProductstatusesCustomBatchRequestEntry]
  }
}

