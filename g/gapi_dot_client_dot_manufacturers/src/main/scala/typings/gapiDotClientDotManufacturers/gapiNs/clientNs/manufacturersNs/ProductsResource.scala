package typings.gapiDotClientDotManufacturers.gapiNs.clientNs.manufacturersNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotManufacturers.Anon_Accesstoken
import typings.gapiDotClientDotManufacturers.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /** Deletes the product from a Manufacturer Center account. */
  def delete(request: Anon_Accesstoken): Request[js.Object]
  /**
    * Gets the product from a Manufacturer Center account, including product
    * issues.
    *
    * A recently updated product takes around 15 minutes to process. Changes are
    * only visible after it has been processed. While some issues may be
    * available once the product has been processed, other issues may take days
    * to appear.
    */
  def get(request: Anon_Accesstoken): Request[Product]
  /** Lists all the products in a Manufacturer Center account. */
  def list(request: Anon_AccesstokenAlt): Request[ListProductsResponse]
  /**
    * Inserts or updates the product in a Manufacturer Center account.
    *
    * The checks at upload time are minimal. All required attributes need to be
    * present for a product to be valid. Issues may show up later
    * after the API has accepted an update for a product and it is possible to
    * overwrite an existing valid product with an invalid product. To detect
    * this, you should retrieve the product and check it for issues once the
    * updated version is available.
    *
    * Inserted or updated products first need to be processed before they can be
    * retrieved. Until then, new products will be unavailable, and retrieval
    * of updated products will return the original state of the product.
    */
  def update(request: Anon_Accesstoken): Request[Product]
}

object ProductsResource {
  @scala.inline
  def apply(
    delete: Anon_Accesstoken => Request[js.Object],
    get: Anon_Accesstoken => Request[Product],
    list: Anon_AccesstokenAlt => Request[ListProductsResponse],
    update: Anon_Accesstoken => Request[Product]
  ): ProductsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ProductsResource]
  }
}

