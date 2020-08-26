package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The price rate indicating starting usage and its corresponding price.
  */
@js.native
trait SchemaTierRate extends js.Object {
  /**
    * Usage is priced at this rate only after this amount. Example:
    * start_usage_amount of 10 indicates that the usage will be priced at the
    * unit_price after the first 10 usage_units.
    */
  var startUsageAmount: js.UndefOr[Double] = js.native
  /**
    * The price per unit of usage. Example: unit_price of amount $10 indicates
    * that each unit will cost $10.
    */
  var unitPrice: js.UndefOr[SchemaMoney] = js.native
}

object SchemaTierRate {
  @scala.inline
  def apply(): SchemaTierRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTierRate]
  }
  @scala.inline
  implicit class SchemaTierRateOps[Self <: SchemaTierRate] (val x: Self) extends AnyVal {
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
    def setUnitPrice(value: SchemaMoney): Self = this.set("unitPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitPrice: Self = this.set("unitPrice", js.undefined)
  }
  
}

