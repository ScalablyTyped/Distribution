package typings.gapiDotClientDotManufacturers.gapi.client.manufacturers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var products: ProductsResource
}

object AccountsResource {
  @scala.inline
  def apply(products: ProductsResource): AccountsResource = {
    val __obj = js.Dynamic.literal(products = products.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountsResource]
  }
}

