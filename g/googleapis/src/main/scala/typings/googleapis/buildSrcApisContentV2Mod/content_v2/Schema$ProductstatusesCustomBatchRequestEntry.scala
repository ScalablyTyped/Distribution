package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch productstatuses request.
  */
@js.native
trait Schema$ProductstatusesCustomBatchRequestEntry extends js.Object {
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * If set, only issues for the specified destinations are returned,
    * otherwise only issues for the Shopping destination.
    */
  var destinations: js.UndefOr[js.Array[String]] = js.native
  var includeAttributes: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  /**
    * The ID of the product whose status to get.
    */
  var productId: js.UndefOr[String] = js.native
}

object Schema$ProductstatusesCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    destinations: js.Array[String] = null,
    includeAttributes: js.UndefOr[Boolean] = js.undefined,
    merchantId: String = null,
    method: String = null,
    productId: String = null
  ): Schema$ProductstatusesCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (destinations != null) __obj.updateDynamic("destinations")(destinations.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAttributes)) __obj.updateDynamic("includeAttributes")(includeAttributes.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductstatusesCustomBatchRequestEntry]
  }
}

