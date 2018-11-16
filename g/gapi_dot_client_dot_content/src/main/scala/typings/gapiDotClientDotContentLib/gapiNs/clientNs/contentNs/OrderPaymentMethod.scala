package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OrderPaymentMethod extends js.Object {
  /** The billing address. */
  var billingAddress: js.UndefOr[OrderAddress] = js.undefined
  /** The card expiration month (January = 1, February = 2 etc.). */
  var expirationMonth: js.UndefOr[scala.Double] = js.undefined
  /** The card expiration year (4-digit, e.g. 2015). */
  var expirationYear: js.UndefOr[scala.Double] = js.undefined
  /** The last four digits of the card number. */
  var lastFourDigits: js.UndefOr[java.lang.String] = js.undefined
  /** The billing phone number. */
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The type of instrument.
               *
               * Acceptable values are:
               * - "AMEX"
               * - "DISCOVER"
               * - "JCB"
               * - "MASTERCARD"
               * - "UNIONPAY"
               * - "VISA"
               * - ""
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

