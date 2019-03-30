package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersGetByMerchantOrderIdResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var order: js.UndefOr[Order] = js.undefined
}

object OrdersGetByMerchantOrderIdResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, order: Order = null): OrdersGetByMerchantOrderIdResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[OrdersGetByMerchantOrderIdResponse]
  }
}

