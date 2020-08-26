package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOffersResponse extends js.Object {
  /** The returned list of products. */
  var products: js.UndefOr[js.Array[Product]] = js.native
}

object GetOffersResponse {
  @scala.inline
  def apply(): GetOffersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOffersResponse]
  }
  @scala.inline
  implicit class GetOffersResponseOps[Self <: GetOffersResponse] (val x: Self) extends AnyVal {
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
    def setProductsVarargs(value: Product*): Self = this.set("products", js.Array(value :_*))
    @scala.inline
    def setProducts(value: js.Array[Product]): Self = this.set("products", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducts: Self = this.set("products", js.undefined)
  }
  
}

