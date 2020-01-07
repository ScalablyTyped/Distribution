package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch products request.
  */
@js.native
trait Schema$ProductsCustomBatchRequestEntry extends js.Object {
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  /**
    * The product to insert. Only required if the method is insert.
    */
  var product: js.UndefOr[Schema$Product] = js.native
  /**
    * The ID of the product to get or delete. Only defined if the method is get
    * or delete.
    */
  var productId: js.UndefOr[String] = js.native
}

object Schema$ProductsCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    merchantId: String = null,
    method: String = null,
    product: Schema$Product = null,
    productId: String = null
  ): Schema$ProductsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductsCustomBatchRequestEntry]
  }
}

