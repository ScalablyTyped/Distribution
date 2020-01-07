package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiaOnDisplayToOrderSettings extends js.Object {
  /**
    * Shipping cost and policy URL.
    */
  var shippingCostPolicyUrl: js.UndefOr[String] = js.native
  /**
    * The status of the ?On display to order? feature.
    */
  var status: js.UndefOr[String] = js.native
}

object Schema$LiaOnDisplayToOrderSettings {
  @scala.inline
  def apply(shippingCostPolicyUrl: String = null, status: String = null): Schema$LiaOnDisplayToOrderSettings = {
    val __obj = js.Dynamic.literal()
    if (shippingCostPolicyUrl != null) __obj.updateDynamic("shippingCostPolicyUrl")(shippingCostPolicyUrl.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiaOnDisplayToOrderSettings]
  }
}

