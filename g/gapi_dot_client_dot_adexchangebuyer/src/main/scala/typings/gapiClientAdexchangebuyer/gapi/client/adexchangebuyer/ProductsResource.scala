package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer.anon.ProductId
import typings.gapiClientAdexchangebuyer.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductsResource extends js.Object {
  /** Gets the requested product by id. */
  def get(request: ProductId): Request[Product] = js.native
  /** Gets the requested product. */
  def search(request: UserIp): Request[GetOffersResponse] = js.native
}

object ProductsResource {
  @scala.inline
  def apply(get: ProductId => Request[Product], search: UserIp => Request[GetOffersResponse]): ProductsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), search = js.Any.fromFunction1(search))
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
    def setGet(value: ProductId => Request[Product]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setSearch(value: UserIp => Request[GetOffersResponse]): Self = this.set("search", js.Any.fromFunction1(value))
  }
  
}

