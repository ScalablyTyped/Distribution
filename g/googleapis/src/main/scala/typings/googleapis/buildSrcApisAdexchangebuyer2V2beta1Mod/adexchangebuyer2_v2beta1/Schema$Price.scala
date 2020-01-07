package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a price and a pricing type for a product / deal.
  */
@js.native
trait Schema$Price extends js.Object {
  /**
    * The actual price with currency specified.
    */
  var amount: js.UndefOr[Schema$Money] = js.native
  /**
    * The pricing type for the deal/product. (default: CPM)
    */
  var pricingType: js.UndefOr[String] = js.native
}

object Schema$Price {
  @scala.inline
  def apply(amount: Schema$Money = null, pricingType: String = null): Schema$Price = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (pricingType != null) __obj.updateDynamic("pricingType")(pricingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Price]
  }
}

