package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Terms for Preferred Deals. Note that Preferred Deals cannot be created via
  * the API at this time, but can be returned in a get or list request.
  */
@js.native
trait Schema$NonGuaranteedFixedPriceTerms extends js.Object {
  /**
    * Fixed price for the specified buyer.
    */
  var fixedPrices: js.UndefOr[js.Array[Schema$PricePerBuyer]] = js.native
}

object Schema$NonGuaranteedFixedPriceTerms {
  @scala.inline
  def apply(fixedPrices: js.Array[Schema$PricePerBuyer] = null): Schema$NonGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    if (fixedPrices != null) __obj.updateDynamic("fixedPrices")(fixedPrices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NonGuaranteedFixedPriceTerms]
  }
}

