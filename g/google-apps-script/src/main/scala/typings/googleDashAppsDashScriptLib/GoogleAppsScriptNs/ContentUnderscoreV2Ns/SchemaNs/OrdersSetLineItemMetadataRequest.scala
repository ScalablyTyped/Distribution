package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersSetLineItemMetadataRequest extends js.Object {
  var annotations: js.UndefOr[js.Array[OrderMerchantProvidedAnnotation]] = js.undefined
  var lineItemId: js.UndefOr[java.lang.String] = js.undefined
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  var productId: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersSetLineItemMetadataRequest {
  @scala.inline
  def apply(
    annotations: js.Array[OrderMerchantProvidedAnnotation] = null,
    lineItemId: java.lang.String = null,
    operationId: java.lang.String = null,
    productId: java.lang.String = null
  ): OrdersSetLineItemMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    __obj.asInstanceOf[OrdersSetLineItemMetadataRequest]
  }
}

