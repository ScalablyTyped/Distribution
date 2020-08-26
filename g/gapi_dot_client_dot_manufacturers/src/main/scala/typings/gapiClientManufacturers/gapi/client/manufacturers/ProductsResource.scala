package typings.gapiClientManufacturers.gapi.client.manufacturers

import typings.gapiClient.gapi.client.Request
import typings.gapiClientManufacturers.anon.Accesstoken
import typings.gapiClientManufacturers.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductsResource extends js.Object {
  /** Deletes the product from a Manufacturer Center account. */
  def delete(request: Accesstoken): Request[js.Object] = js.native
  /**
    * Gets the product from a Manufacturer Center account, including product
    * issues.
    *
    * A recently updated product takes around 15 minutes to process. Changes are
    * only visible after it has been processed. While some issues may be
    * available once the product has been processed, other issues may take days
    * to appear.
    */
  def get(request: Accesstoken): Request[Product] = js.native
  /** Lists all the products in a Manufacturer Center account. */
  def list(request: Alt): Request[ListProductsResponse] = js.native
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
  def update(request: Accesstoken): Request[Product] = js.native
}

object ProductsResource {
  @scala.inline
  def apply(
    delete: Accesstoken => Request[js.Object],
    get: Accesstoken => Request[Product],
    list: Alt => Request[ListProductsResponse],
    update: Accesstoken => Request[Product]
  ): ProductsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ProductsResource]
  }
  @scala.inline
  implicit class ProductsResourceOps[Self <: ProductsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: Accesstoken => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Accesstoken => Request[Product]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[ListProductsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Accesstoken => Request[Product]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

