package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersUpdateMerchantOrderIdRequest extends js.Object {
  var merchantOrderId: js.UndefOr[java.lang.String] = js.undefined
  var operationId: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersUpdateMerchantOrderIdRequest {
  @scala.inline
  def apply(merchantOrderId: java.lang.String = null, operationId: java.lang.String = null): OrdersUpdateMerchantOrderIdRequest = {
    val __obj = js.Dynamic.literal()
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    __obj.asInstanceOf[OrdersUpdateMerchantOrderIdRequest]
  }
}

