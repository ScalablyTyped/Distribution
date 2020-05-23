package typings.gapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TierRate extends js.Object {
  /**
    * Usage is priced at this rate only after this amount.
    * Example: start_usage_amount of 10 indicates that the usage will be priced
    * at the unit_price after the first 10 usage_units.
    */
  var startUsageAmount: js.UndefOr[Double] = js.undefined
  /**
    * The price per unit of usage.
    * Example: unit_price of amount $10 indicates that each unit will cost $10.
    */
  var unitPrice: js.UndefOr[Money] = js.undefined
}

object TierRate {
  @scala.inline
  def apply(startUsageAmount: js.UndefOr[Double] = js.undefined, unitPrice: Money = null): TierRate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(startUsageAmount)) __obj.updateDynamic("startUsageAmount")(startUsageAmount.get.asInstanceOf[js.Any])
    if (unitPrice != null) __obj.updateDynamic("unitPrice")(unitPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[TierRate]
  }
}

