package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DealTermsGuaranteedFixedPriceTermsBillingInfo extends js.Object {
  /**
    * The timestamp (in ms since epoch) when the original reservation price for
    * the deal was first converted to DFP currency. This is used to convert the
    * contracted price into buyer&#39;s currency without discrepancy.
    */
  var currencyConversionTimeMs: js.UndefOr[String] = js.native
  /**
    * The DFP line item id associated with this deal. For features like CPD,
    * buyers can retrieve the DFP line item for billing reconciliation.
    */
  var dfpLineItemId: js.UndefOr[String] = js.native
  /**
    * The original contracted quantity (# impressions) for this deal. To ensure
    * delivery, sometimes the publisher will book the deal with a impression
    * buffer, such that guaranteed_looks is greater than the contracted
    * quantity. However clients are billed using the original contracted
    * quantity.
    */
  var originalContractedQuantity: js.UndefOr[String] = js.native
  /**
    * The original reservation price for the deal, if the currency code is
    * different from the one used in negotiation.
    */
  var price: js.UndefOr[Schema$Price] = js.native
}

object Schema$DealTermsGuaranteedFixedPriceTermsBillingInfo {
  @scala.inline
  def apply(
    currencyConversionTimeMs: String = null,
    dfpLineItemId: String = null,
    originalContractedQuantity: String = null,
    price: Schema$Price = null
  ): Schema$DealTermsGuaranteedFixedPriceTermsBillingInfo = {
    val __obj = js.Dynamic.literal()
    if (currencyConversionTimeMs != null) __obj.updateDynamic("currencyConversionTimeMs")(currencyConversionTimeMs.asInstanceOf[js.Any])
    if (dfpLineItemId != null) __obj.updateDynamic("dfpLineItemId")(dfpLineItemId.asInstanceOf[js.Any])
    if (originalContractedQuantity != null) __obj.updateDynamic("originalContractedQuantity")(originalContractedQuantity.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DealTermsGuaranteedFixedPriceTermsBillingInfo]
  }
}

