package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payment extends js.Object {
  /** Unique identifier of this Payment. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is, in this case adsense#payment. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The amount to be paid. */
  var paymentAmount: js.UndefOr[java.lang.String] = js.undefined
  /** The currency code for the amount to be paid. */
  var paymentAmountCurrencyCode: js.UndefOr[java.lang.String] = js.undefined
  /** The date this payment was/will be credited to the user, or none if the payment threshold has not been met. */
  var paymentDate: js.UndefOr[java.lang.String] = js.undefined
}

