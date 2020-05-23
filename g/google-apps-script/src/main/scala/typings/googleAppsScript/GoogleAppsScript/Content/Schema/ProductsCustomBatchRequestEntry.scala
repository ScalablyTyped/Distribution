package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsCustomBatchRequestEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.undefined
  var merchantId: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var product: js.UndefOr[Product] = js.undefined
  var productId: js.UndefOr[String] = js.undefined
}

object ProductsCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: js.UndefOr[Double] = js.undefined,
    merchantId: String = null,
    method: String = null,
    product: Product = null,
    productId: String = null
  ): ProductsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchId)) __obj.updateDynamic("batchId")(batchId.get.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductsCustomBatchRequestEntry]
  }
}

