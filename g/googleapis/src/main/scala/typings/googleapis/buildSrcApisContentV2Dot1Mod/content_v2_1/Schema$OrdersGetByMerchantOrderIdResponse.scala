package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersGetByMerchantOrderIdResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersGetByMerchantOrderIdResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The requested order.
    */
  var order: js.UndefOr[Schema$Order] = js.native
}

object Schema$OrdersGetByMerchantOrderIdResponse {
  @scala.inline
  def apply(kind: String = null, order: Schema$Order = null): Schema$OrdersGetByMerchantOrderIdResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersGetByMerchantOrderIdResponse]
  }
}

