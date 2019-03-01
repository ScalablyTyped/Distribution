package typings
package gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TierRate extends js.Object {
  /**
    * Usage is priced at this rate only after this amount.
    * Example: start_usage_amount of 10 indicates that the usage will be priced
    * at the unit_price after the first 10 usage_units.
    */
  var startUsageAmount: js.UndefOr[scala.Double] = js.undefined
  /**
    * The price per unit of usage.
    * Example: unit_price of amount $10 indicates that each unit will cost $10.
    */
  var unitPrice: js.UndefOr[Money] = js.undefined
}

object TierRate {
  @scala.inline
  def apply(startUsageAmount: scala.Int | scala.Double = null, unitPrice: Money = null): TierRate = {
    val __obj = js.Dynamic.literal()
    if (startUsageAmount != null) __obj.updateDynamic("startUsageAmount")(startUsageAmount.asInstanceOf[js.Any])
    if (unitPrice != null) __obj.updateDynamic("unitPrice")(unitPrice)
    __obj.asInstanceOf[TierRate]
  }
}

