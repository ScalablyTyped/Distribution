package typings
package gapiDotClientDotManufacturersLib.gapiNs.clientNs.manufacturersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProductsResponse extends js.Object {
  /** The token for the retrieval of the next page of product statuses. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** List of the products. */
  var products: js.UndefOr[js.Array[Product]] = js.undefined
}

object ListProductsResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, products: js.Array[Product] = null): ListProductsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (products != null) __obj.updateDynamic("products")(products)
    __obj.asInstanceOf[ListProductsResponse]
  }
}

