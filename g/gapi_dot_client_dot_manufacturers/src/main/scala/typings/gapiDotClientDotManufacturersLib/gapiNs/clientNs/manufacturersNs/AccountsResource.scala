package typings
package gapiDotClientDotManufacturersLib.gapiNs.clientNs.manufacturersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var products: ProductsResource
}

object AccountsResource {
  @scala.inline
  def apply(products: ProductsResource): AccountsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("products")(products)
    __obj.asInstanceOf[AccountsResource]
  }
}

