package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.ProductId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductsResource extends js.Object {
  /** Checks the purchase and consumption status of an inapp item. */
  def get(request: ProductId): Request[ProductPurchase] = js.native
}

object ProductsResource {
  @scala.inline
  def apply(get: ProductId => Request[ProductPurchase]): ProductsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
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
    def setGet(value: ProductId => Request[ProductPurchase]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

