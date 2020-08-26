package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DealTermsGuaranteedFixedPriceTermsBillingInfo extends js.Object {
  /**
    * The timestamp (in ms since epoch) when the original reservation price for the deal was first converted to DFP currency. This is used to convert the
    * contracted price into buyer's currency without discrepancy.
    */
  var currencyConversionTimeMs: js.UndefOr[String] = js.native
  /** The DFP line item id associated with this deal. For features like CPD, buyers can retrieve the DFP line item for billing reconciliation. */
  var dfpLineItemId: js.UndefOr[String] = js.native
  /**
    * The original contracted quantity (# impressions) for this deal. To ensure delivery, sometimes the publisher will book the deal with a impression
    * buffer, such that guaranteed_looks is greater than the contracted quantity. However clients are billed using the original contracted quantity.
    */
  var originalContractedQuantity: js.UndefOr[String] = js.native
  /** The original reservation price for the deal, if the currency code is different from the one used in negotiation. */
  var price: js.UndefOr[Price] = js.native
}

object DealTermsGuaranteedFixedPriceTermsBillingInfo {
  @scala.inline
  def apply(): DealTermsGuaranteedFixedPriceTermsBillingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTermsGuaranteedFixedPriceTermsBillingInfo]
  }
  @scala.inline
  implicit class DealTermsGuaranteedFixedPriceTermsBillingInfoOps[Self <: DealTermsGuaranteedFixedPriceTermsBillingInfo] (val x: Self) extends AnyVal {
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
    def setCurrencyConversionTimeMs(value: String): Self = this.set("currencyConversionTimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyConversionTimeMs: Self = this.set("currencyConversionTimeMs", js.undefined)
    @scala.inline
    def setDfpLineItemId(value: String): Self = this.set("dfpLineItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDfpLineItemId: Self = this.set("dfpLineItemId", js.undefined)
    @scala.inline
    def setOriginalContractedQuantity(value: String): Self = this.set("originalContractedQuantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalContractedQuantity: Self = this.set("originalContractedQuantity", js.undefined)
    @scala.inline
    def setPrice(value: Price): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
  }
  
}

