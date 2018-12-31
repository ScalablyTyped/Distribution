package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionDeferralInfo extends js.Object {
  /**
    * The desired next expiry time to assign to the subscription, in milliseconds since the Epoch. The given time must be later/greater than the current
    * expiry time for the subscription.
    */
  var desiredExpiryTimeMillis: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The expected expiry time for the subscription. If the current expiry time for the subscription is not the value specified here, the deferral will not
    * occur.
    */
  var expectedExpiryTimeMillis: js.UndefOr[java.lang.String] = js.undefined
}

