package typings.gapiClientReseller.gapi.client.reseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Seats extends js.Object {
  /** Identifies the resource as a subscription change plan request. Value: subscriptions#seats */
  var kind: js.UndefOr[String] = js.native
  /**
    * Read-only field containing the current number of licensed seats for FLEXIBLE Google-Apps subscriptions and secondary subscriptions such as Google-Vault
    * and Drive-storage.
    */
  var licensedNumberOfSeats: js.UndefOr[Double] = js.native
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
  var maximumNumberOfSeats: js.UndefOr[Double] = js.native
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
  var numberOfSeats: js.UndefOr[Double] = js.native
}

object Seats {
  @scala.inline
  def apply(): Seats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Seats]
  }
  @scala.inline
  implicit class SeatsOps[Self <: Seats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLicensedNumberOfSeats(value: Double): Self = this.set("licensedNumberOfSeats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicensedNumberOfSeats: Self = this.set("licensedNumberOfSeats", js.undefined)
    @scala.inline
    def setMaximumNumberOfSeats(value: Double): Self = this.set("maximumNumberOfSeats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumNumberOfSeats: Self = this.set("maximumNumberOfSeats", js.undefined)
    @scala.inline
    def setNumberOfSeats(value: Double): Self = this.set("numberOfSeats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfSeats: Self = this.set("numberOfSeats", js.undefined)
  }
  
}

