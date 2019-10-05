package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductstatusesCustomBatchRequestEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.undefined
  var destinations: js.UndefOr[js.Array[String]] = js.undefined
  var includeAttributes: js.UndefOr[Boolean] = js.undefined
  var merchantId: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var productId: js.UndefOr[String] = js.undefined
}

object ProductstatusesCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    destinations: js.Array[String] = null,
    includeAttributes: js.UndefOr[Boolean] = js.undefined,
    merchantId: String = null,
    method: String = null,
    productId: String = null
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

