package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DealTermsNonGuaranteedFixedPriceTerms extends js.Object {
  /** Fixed price for the specified buyer. */
  var fixedPrices: js.UndefOr[js.Array[PricePerBuyer]] = js.native
}

object DealTermsNonGuaranteedFixedPriceTerms {
  @scala.inline
  def apply(): DealTermsNonGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTermsNonGuaranteedFixedPriceTerms]
  }
  @scala.inline
  implicit class DealTermsNonGuaranteedFixedPriceTermsOps[Self <: DealTermsNonGuaranteedFixedPriceTerms] (val x: Self) extends AnyVal {
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
    def setFixedPricesVarargs(value: PricePerBuyer*): Self = this.set("fixedPrices", js.Array(value :_*))
    @scala.inline
    def setFixedPrices(value: js.Array[PricePerBuyer]): Self = this.set("fixedPrices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedPrices: Self = this.set("fixedPrices", js.undefined)
  }
  
}

