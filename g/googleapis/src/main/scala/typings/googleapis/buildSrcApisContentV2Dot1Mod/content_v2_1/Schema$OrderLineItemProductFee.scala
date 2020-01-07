package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderLineItemProductFee extends js.Object {
  /**
    * Amount of the fee.
    */
  var amount: js.UndefOr[Schema$Price] = js.native
  /**
    * Name of the fee.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$OrderLineItemProductFee {
  @scala.inline
  def apply(amount: Schema$Price = null, name: String = null): Schema$OrderLineItemProductFee = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderLineItemProductFee]
  }
}

