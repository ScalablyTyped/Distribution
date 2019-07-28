package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsCustomBatchRequestEntry extends js.Object {
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.undefined
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  /** The product to insert. Only required if the method is insert. */
  var product: js.UndefOr[Product] = js.undefined
  /** The ID of the product to get or delete. Only defined if the method is get or delete. */
  var productId: js.UndefOr[String] = js.undefined
}

object ProductsCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    merchantId: String = null,
    method: String = null,
    product: Product = null,
    productId: String = null
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

