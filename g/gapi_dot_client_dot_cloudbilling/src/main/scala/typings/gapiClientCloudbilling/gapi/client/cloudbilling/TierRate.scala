package typings.gapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TierRate extends js.Object {
  /**
    * Usage is priced at this rate only after this amount.
    * Example: start_usage_amount of 10 indicates that the usage will be priced
    * at the unit_price after the first 10 usage_units.
    */
  var startUsageAmount: js.UndefOr[Double] = js.native
  /**
    * The price per unit of usage.
    * Example: unit_price of amount $10 indicates that each unit will cost $10.
    */
  var unitPrice: js.UndefOr[Money] = js.native
}

object TierRate {
  @scala.inline
  def apply(): TierRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TierRate]
  }
  @scala.inline
  implicit class TierRateOps[Self <: TierRate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStartUsageAmount(value: Double): Self = this.set("startUsageAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartUsageAmount: Self = this.set("startUsageAmount", js.undefined)
    @scala.inline
    def setUnitPrice(value: Money): Self = this.set("unitPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitPrice: Self = this.set("unitPrice", js.undefined)
  }
  
}

