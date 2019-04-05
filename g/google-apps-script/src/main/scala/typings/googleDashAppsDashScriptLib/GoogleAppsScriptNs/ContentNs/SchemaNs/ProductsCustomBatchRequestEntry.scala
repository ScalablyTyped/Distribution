package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsCustomBatchRequestEntry extends js.Object {
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var product: js.UndefOr[Product] = js.undefined
  var productId: js.UndefOr[java.lang.String] = js.undefined
}

object ProductsCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: scala.Int | scala.Double = null,
    merchantId: java.lang.String = null,
    method: java.lang.String = null,
    product: Product = null,
    productId: java.lang.String = null
  ): ProductsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (method != null) __obj.updateDynamic("method")(method)
    if (product != null) __obj.updateDynamic("product")(product)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    __obj.asInstanceOf[ProductsCustomBatchRequestEntry]
  }
}

