package typings.gapiDotClientDotAdexchangebuyer.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DealTermsNonGuaranteedFixedPriceTerms extends js.Object {
  /** Fixed price for the specified buyer. */
  var fixedPrices: js.UndefOr[js.Array[PricePerBuyer]] = js.undefined
}

object DealTermsNonGuaranteedFixedPriceTerms {
  @scala.inline
  def apply(fixedPrices: js.Array[PricePerBuyer] = null): DealTermsNonGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    if (fixedPrices != null) __obj.updateDynamic("fixedPrices")(fixedPrices)
    __obj.asInstanceOf[DealTermsNonGuaranteedFixedPriceTerms]
  }
}

