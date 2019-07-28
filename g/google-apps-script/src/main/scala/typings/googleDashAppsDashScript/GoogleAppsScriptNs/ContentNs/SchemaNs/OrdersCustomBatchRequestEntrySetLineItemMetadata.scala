package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntrySetLineItemMetadata extends js.Object {
  var annotations: js.UndefOr[js.Array[OrderMerchantProvidedAnnotation]] = js.undefined
  var lineItemId: js.UndefOr[String] = js.undefined
  var productId: js.UndefOr[String] = js.undefined
}

object OrdersCustomBatchRequestEntrySetLineItemMetadata {
  @scala.inline
  def apply(
    annotations: js.Array[OrderMerchantProvidedAnnotation] = null,
    lineItemId: String = null,
    productId: String = null
  ): OrdersCustomBatchRequestEntrySetLineItemMetadata = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    __obj.asInstanceOf[OrdersCustomBatchRequestEntrySetLineItemMetadata]
  }
}

