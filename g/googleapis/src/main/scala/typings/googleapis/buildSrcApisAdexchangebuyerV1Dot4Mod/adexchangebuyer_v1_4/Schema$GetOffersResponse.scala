package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GetOffersResponse extends js.Object {
  /**
    * The returned list of products.
    */
  var products: js.UndefOr[js.Array[Schema$Product]] = js.native
}

object Schema$GetOffersResponse {
  @scala.inline
  def apply(products: js.Array[Schema$Product] = null): Schema$GetOffersResponse = {
    val __obj = js.Dynamic.literal()
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetOffersResponse]
  }
}

