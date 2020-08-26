package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DealTermsRubiconNonGuaranteedTerms extends js.Object {
  /** Optional price for Rubicon priority access in the auction. */
  var priorityPrice: js.UndefOr[Price] = js.native
  /** Optional price for Rubicon standard access in the auction. */
  var standardPrice: js.UndefOr[Price] = js.native
}

object DealTermsRubiconNonGuaranteedTerms {
  @scala.inline
  def apply(): DealTermsRubiconNonGuaranteedTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTermsRubiconNonGuaranteedTerms]
  }
  @scala.inline
  implicit class DealTermsRubiconNonGuaranteedTermsOps[Self <: DealTermsRubiconNonGuaranteedTerms] (val x: Self) extends AnyVal {
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
    def setPriorityPrice(value: Price): Self = this.set("priorityPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriorityPrice: Self = this.set("priorityPrice", js.undefined)
    @scala.inline
    def setStandardPrice(value: Price): Self = this.set("standardPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardPrice: Self = this.set("standardPrice", js.undefined)
  }
  
}

