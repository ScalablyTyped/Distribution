package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOffersResponse extends js.Object {
  /** The returned list of products. */
  var products: js.UndefOr[js.Array[Product]] = js.undefined
}

object GetOffersResponse {
  @scala.inline
  def apply(products: js.Array[Product] = null): GetOffersResponse = {
    val __obj = js.Dynamic.literal()
    if (products != null) __obj.updateDynamic("products")(products)
    __obj.asInstanceOf[GetOffersResponse]
  }
}

