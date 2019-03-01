package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entitlement extends js.Object {
  /** This kind represents an entitlement object in the androidpublisher service. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The SKU of the product. */
  var productId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the inapp product. Possible values are:
    * - In-app item: "inapp"
    * - Subscription: "subs"
    */
  var productType: js.UndefOr[java.lang.String] = js.undefined
  /** The token which can be verified using the subscriptions or products API. */
  var token: js.UndefOr[java.lang.String] = js.undefined
}

object Entitlement {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    productId: java.lang.String = null,
    productType: java.lang.String = null,
    token: java.lang.String = null
  ): Entitlement = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (productType != null) __obj.updateDynamic("productType")(productType)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Entitlement]
  }
}

