package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DealTermsRubiconNonGuaranteedTerms extends js.Object {
  /** Optional price for Rubicon priority access in the auction. */
  var priorityPrice: js.UndefOr[Price] = js.undefined
  /** Optional price for Rubicon standard access in the auction. */
  var standardPrice: js.UndefOr[Price] = js.undefined
}

object DealTermsRubiconNonGuaranteedTerms {
  @scala.inline
  def apply(priorityPrice: Price = null, standardPrice: Price = null): DealTermsRubiconNonGuaranteedTerms = {
    val __obj = js.Dynamic.literal()
    if (priorityPrice != null) __obj.updateDynamic("priorityPrice")(priorityPrice)
    if (standardPrice != null) __obj.updateDynamic("standardPrice")(standardPrice)
    __obj.asInstanceOf[DealTermsRubiconNonGuaranteedTerms]
  }
}

