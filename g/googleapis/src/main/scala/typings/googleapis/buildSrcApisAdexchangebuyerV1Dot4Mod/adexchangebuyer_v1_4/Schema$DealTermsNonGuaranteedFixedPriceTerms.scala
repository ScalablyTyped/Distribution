package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DealTermsNonGuaranteedFixedPriceTerms extends js.Object {
  /**
    * Fixed price for the specified buyer.
    */
  var fixedPrices: js.UndefOr[js.Array[Schema$PricePerBuyer]] = js.native
}

object Schema$DealTermsNonGuaranteedFixedPriceTerms {
  @scala.inline
  def apply(fixedPrices: js.Array[Schema$PricePerBuyer] = null): Schema$DealTermsNonGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    if (fixedPrices != null) __obj.updateDynamic("fixedPrices")(fixedPrices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DealTermsNonGuaranteedFixedPriceTerms]
  }
}

