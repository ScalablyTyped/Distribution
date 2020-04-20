package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

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
    val __obj = js.Dynamic.literal(products = products.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], voidedpurchases = voidedpurchases.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchasesResource]
  }
}

