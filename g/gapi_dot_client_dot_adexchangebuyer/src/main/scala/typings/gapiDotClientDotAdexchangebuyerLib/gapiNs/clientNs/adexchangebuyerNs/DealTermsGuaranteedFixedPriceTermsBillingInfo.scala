package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DealTermsGuaranteedFixedPriceTermsBillingInfo extends js.Object {
  /**
               * The timestamp (in ms since epoch) when the original reservation price for the deal was first converted to DFP currency. This is used to convert the
               * contracted price into buyer's currency without discrepancy.
               */
  var currencyConversionTimeMs: js.UndefOr[java.lang.String] = js.undefined
  /** The DFP line item id associated with this deal. For features like CPD, buyers can retrieve the DFP line item for billing reconciliation. */
  var dfpLineItemId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The original contracted quantity (# impressions) for this deal. To ensure delivery, sometimes the publisher will book the deal with a impression
               * buffer, such that guaranteed_looks is greater than the contracted quantity. However clients are billed using the original contracted quantity.
               */
  var originalContractedQuantity: js.UndefOr[java.lang.String] = js.undefined
  /** The original reservation price for the deal, if the currency code is different from the one used in negotiation. */
  var price: js.UndefOr[Price] = js.undefined
}

