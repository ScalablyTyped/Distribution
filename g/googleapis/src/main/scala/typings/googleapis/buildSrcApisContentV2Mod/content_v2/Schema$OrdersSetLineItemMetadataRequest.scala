package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersSetLineItemMetadataRequest extends js.Object {
  var annotations: js.UndefOr[js.Array[Schema$OrderMerchantProvidedAnnotation]] = js.native
  /**
    * The ID of the line item to set metadata. Either lineItemId or productId
    * is required.
    */
  var lineItemId: js.UndefOr[String] = js.native
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * The ID of the product to set metadata. This is the REST ID used in the
    * products service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String] = js.native
}

object Schema$OrdersSetLineItemMetadataRequest {
  @scala.inline
  def apply(
    annotations: js.Array[Schema$OrderMerchantProvidedAnnotation] = null,
    lineItemId: String = null,
    operationId: String = null,
    productId: String = null
  ): Schema$OrdersSetLineItemMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersSetLineItemMetadataRequest]
  }
}

