package typings.gapiDotClientDotManufacturers.gapi.client.manufacturers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProductsResponse extends js.Object {
  /** The token for the retrieval of the next page of product statuses. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** List of the products. */
  var products: js.UndefOr[js.Array[Product]] = js.undefined
}

object ListProductsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, products: js.Array[Product] = null): ListProductsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProductsResponse]
  }
}

