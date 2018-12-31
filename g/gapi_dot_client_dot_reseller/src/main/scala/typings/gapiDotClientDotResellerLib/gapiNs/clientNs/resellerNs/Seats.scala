package typings
package gapiDotClientDotResellerLib.gapiNs.clientNs.resellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Seats extends js.Object {
  /** Identifies the resource as a subscription change plan request. Value: subscriptions#seats */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Read-only field containing the current number of licensed seats for FLEXIBLE Google-Apps subscriptions and secondary subscriptions such as Google-Vault
    * and Drive-storage.
    */
  var licensedNumberOfSeats: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximumNumberOfSeats property is the maximum number of licenses that the customer can purchase. This property applies to plans other than the
    * annual commitment plan. How a user's licenses are managed depends on the subscription's payment plan:
    * - annual commitment plan (with monthly or yearly payments) — For this plan, a reseller is invoiced on the number of user licenses in the numberOfSeats
    * property. The maximumNumberOfSeats property is a read-only property in the API's response.
    * - flexible plan — For this plan, a reseller is invoiced on the actual number of users which is capped by the maximumNumberOfSeats. This is the maximum
    * number of user licenses a customer has for user license provisioning. This quantity can be increased up to the maximum limit defined in the reseller's
    * contract. And the minimum quantity is the current number of users in the customer account.
    * - 30-day free trial plan — A subscription in a 30-day free trial is restricted to maximum 10 seats.
    */
  var maximumNumberOfSeats: js.UndefOr[scala.Double] = js.undefined
  /**
    * The numberOfSeats property holds the customer's number of user licenses. How a user's licenses are managed depends on the subscription's plan:
    * - annual commitment plan (with monthly or yearly pay) — For this plan, a reseller is invoiced on the number of user licenses in the numberOfSeats
    * property. This is the maximum number of user licenses that a reseller's customer can create. The reseller can add more licenses, but once set, the
    * numberOfSeats can not be reduced until renewal. The reseller is invoiced based on the numberOfSeats value regardless of how many of these user licenses
    * are provisioned users.
    * - flexible plan — For this plan, a reseller is invoiced on the actual number of users which is capped by the maximumNumberOfSeats. The numberOfSeats
    * property is not used in the request or response for flexible plan customers.
    * - 30-day free trial plan — The numberOfSeats property is not used in the request or response for an account in a 30-day trial.
    */
  var numberOfSeats: js.UndefOr[scala.Double] = js.undefined
}

