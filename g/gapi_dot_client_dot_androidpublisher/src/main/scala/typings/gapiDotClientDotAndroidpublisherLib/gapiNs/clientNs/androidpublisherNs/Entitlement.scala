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

