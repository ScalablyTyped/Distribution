package typings
package gapiDotClientDotResellerLib.gapiNs.clientNs.resellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Activates a subscription previously suspended by the reseller */
  def activate(request: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /**
    * Update a subscription plan. Use this method to update a plan for a 30-day trial or a flexible plan subscription to an annual commitment plan with
    * monthly or yearly payments.
    */
  def changePlan(request: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /** Update a user license's renewal settings. This is applicable for accounts with annual commitment plans only. */
  def changeRenewalSettings(request: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /** Update a subscription's user license settings. */
  def changeSeats(request: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /** Cancel, suspend or transfer a subscription to direct. */
  def delete(request: gapiDotClientDotResellerLib.Anon_AltCustomerIdDeletionType): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Get a specific subscription. */
  def get(request: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /** Create or transfer a subscription. */
  def insert(request: gapiDotClientDotResellerLib.Anon_AltCustomerAuthTokenCustomerId): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /**
    * List of subscriptions managed by the reseller. The list can be all subscriptions, all of a customer's subscriptions, or all of a customer's
    * transferable subscriptions.
    */
  def list(request: gapiDotClientDotResellerLib.Anon_AltCustomerAuthTokenCustomerIdCustomerNamePrefix): gapiDotClientLib.gapiNs.clientNs.Request[Subscriptions]
  /** Immediately move a 30-day free trial subscription to a paid service subscription. */
  def startPaidService(request: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /** Suspends an active subscription. */
  def suspend(request: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    activate: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Subscription],
    changePlan: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Subscription],
    changeRenewalSettings: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Subscription],
    changeSeats: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Subscription],
    delete: gapiDotClientDotResellerLib.Anon_AltCustomerIdDeletionType => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Subscription],
    insert: gapiDotClientDotResellerLib.Anon_AltCustomerAuthTokenCustomerId => gapiDotClientLib.gapiNs.clientNs.Request[Subscription],
    list: gapiDotClientDotResellerLib.Anon_AltCustomerAuthTokenCustomerIdCustomerNamePrefix => gapiDotClientLib.gapiNs.clientNs.Request[Subscriptions],
    startPaidService: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Subscription],
    suspend: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), changePlan = js.Any.fromFunction1(changePlan), changeRenewalSettings = js.Any.fromFunction1(changeRenewalSettings), changeSeats = js.Any.fromFunction1(changeSeats), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), startPaidService = js.Any.fromFunction1(startPaidService), suspend = js.Any.fromFunction1(suspend))
  
    __obj.asInstanceOf[SubscriptionsResource]
  }
}

