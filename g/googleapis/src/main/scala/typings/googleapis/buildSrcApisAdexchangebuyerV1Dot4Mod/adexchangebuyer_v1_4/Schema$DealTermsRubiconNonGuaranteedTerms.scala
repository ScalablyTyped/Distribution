package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DealTermsRubiconNonGuaranteedTerms extends js.Object {
  /**
    * Optional price for Rubicon priority access in the auction.
    */
  var priorityPrice: js.UndefOr[Schema$Price] = js.native
  /**
    * Optional price for Rubicon standard access in the auction.
    */
  var standardPrice: js.UndefOr[Schema$Price] = js.native
}

object Schema$DealTermsRubiconNonGuaranteedTerms {
  @scala.inline
  def apply(priorityPrice: Schema$Price = null, standardPrice: Schema$Price = null): Schema$DealTermsRubiconNonGuaranteedTerms = {
    val __obj = js.Dynamic.literal()
    if (priorityPrice != null) __obj.updateDynamic("priorityPrice")(priorityPrice.asInstanceOf[js.Any])
    if (standardPrice != null) __obj.updateDynamic("standardPrice")(standardPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DealTermsRubiconNonGuaranteedTerms]
  }
}

