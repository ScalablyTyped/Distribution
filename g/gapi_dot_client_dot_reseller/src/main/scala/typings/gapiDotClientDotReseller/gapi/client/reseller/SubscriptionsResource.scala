package typings.gapiDotClientDotReseller.gapi.client.reseller

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotReseller.Anon_AltCustomerAuthTokenCustomerId
import typings.gapiDotClientDotReseller.Anon_AltCustomerAuthTokenCustomerIdCustomerNamePrefix
import typings.gapiDotClientDotReseller.Anon_AltCustomerIdDeletionType
import typings.gapiDotClientDotReseller.Anon_AltCustomerIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Activates a subscription previously suspended by the reseller */
  def activate(request: Anon_AltCustomerIdFields): Request[Subscription]
  /**
    * Update a subscription plan. Use this method to update a plan for a 30-day trial or a flexible plan subscription to an annual commitment plan with
    * monthly or yearly payments.
    */
  def changePlan(request: Anon_AltCustomerIdFields): Request[Subscription]
  /** Update a user license's renewal settings. This is applicable for accounts with annual commitment plans only. */
  def changeRenewalSettings(request: Anon_AltCustomerIdFields): Request[Subscription]
  /** Update a subscription's user license settings. */
  def changeSeats(request: Anon_AltCustomerIdFields): Request[Subscription]
  /** Cancel, suspend or transfer a subscription to direct. */
  def delete(request: Anon_AltCustomerIdDeletionType): Request[Unit]
  /** Get a specific subscription. */
  def get(request: Anon_AltCustomerIdFields): Request[Subscription]
  /** Create or transfer a subscription. */
  def insert(request: Anon_AltCustomerAuthTokenCustomerId): Request[Subscription]
  /**
    * List of subscriptions managed by the reseller. The list can be all subscriptions, all of a customer's subscriptions, or all of a customer's
    * transferable subscriptions.
    */
  def list(request: Anon_AltCustomerAuthTokenCustomerIdCustomerNamePrefix): Request[Subscriptions]
  /** Immediately move a 30-day free trial subscription to a paid service subscription. */
  def startPaidService(request: Anon_AltCustomerIdFields): Request[Subscription]
  /** Suspends an active subscription. */
  def suspend(request: Anon_AltCustomerIdFields): Request[Subscription]
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    activate: Anon_AltCustomerIdFields => Request[Subscription],
    changePlan: Anon_AltCustomerIdFields => Request[Subscription],
    changeRenewalSettings: Anon_AltCustomerIdFields => Request[Subscription],
    changeSeats: Anon_AltCustomerIdFields => Request[Subscription],
    delete: Anon_AltCustomerIdDeletionType => Request[Unit],
    get: Anon_AltCustomerIdFields => Request[Subscription],
    insert: Anon_AltCustomerAuthTokenCustomerId => Request[Subscription],
    list: Anon_AltCustomerAuthTokenCustomerIdCustomerNamePrefix => Request[Subscriptions],
    startPaidService: Anon_AltCustomerIdFields => Request[Subscription],
    suspend: Anon_AltCustomerIdFields => Request[Subscription]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), changePlan = js.Any.fromFunction1(changePlan), changeRenewalSettings = js.Any.fromFunction1(changeRenewalSettings), changeSeats = js.Any.fromFunction1(changeSeats), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), startPaidService = js.Any.fromFunction1(startPaidService), suspend = js.Any.fromFunction1(suspend))
  
    __obj.asInstanceOf[SubscriptionsResource]
  }
}

