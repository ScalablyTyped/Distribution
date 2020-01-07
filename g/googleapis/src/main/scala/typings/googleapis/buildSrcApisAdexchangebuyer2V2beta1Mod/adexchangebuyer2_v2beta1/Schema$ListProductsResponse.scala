package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing products visible to the buyer.
  */
@js.native
trait Schema$ListProductsResponse extends js.Object {
  /**
    * List pagination support.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of matching products at their head revision number.
    */
  var products: js.UndefOr[js.Array[Schema$Product]] = js.native
}

object Schema$ListProductsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, products: js.Array[Schema$Product] = null): Schema$ListProductsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListProductsResponse]
  }
}

