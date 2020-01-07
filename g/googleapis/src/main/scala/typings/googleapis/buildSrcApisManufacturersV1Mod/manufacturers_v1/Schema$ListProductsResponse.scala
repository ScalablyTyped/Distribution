package typings.googleapis.buildSrcApisManufacturersV1Mod.manufacturers_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListProductsResponse extends js.Object {
  /**
    * The token for the retrieval of the next page of product statuses.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of the products.
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

