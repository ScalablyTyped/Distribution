package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchasesResource extends js.Object {
  var products: ProductsResource
  var subscriptions: SubscriptionsResource
  var voidedpurchases: VoidedpurchasesResource
}

object PurchasesResource {
  @scala.inline
  def apply(
    products: ProductsResource,
    subscriptions: SubscriptionsResource,
    voidedpurchases: VoidedpurchasesResource
  ): PurchasesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("products")(products)
    __obj.updateDynamic("subscriptions")(subscriptions)
    __obj.updateDynamic("voidedpurchases")(voidedpurchases)
    __obj.asInstanceOf[PurchasesResource]
  }
}

