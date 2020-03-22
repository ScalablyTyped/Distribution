package typings.gapiClientReseller.gapi.client.reseller

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientReseller.AnonCustomerNamePrefix
import typings.gapiClientReseller.AnonDeletionType
import typings.gapiClientReseller.AnonKey
import typings.gapiClientReseller.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Activates a subscription previously suspended by the reseller */
  def activate(request: AnonKey): Request_[Subscription]
  /**
    * Update a subscription plan. Use this method to update a plan for a 30-day trial or a flexible plan subscription to an annual commitment plan with
    * monthly or yearly payments.
    */
  def changePlan(request: AnonKey): Request_[Subscription]
  /** Update a user license's renewal settings. This is applicable for accounts with annual commitment plans only. */
  def changeRenewalSettings(request: AnonKey): Request_[Subscription]
  /** Update a subscription's user license settings. */
  def changeSeats(request: AnonKey): Request_[Subscription]
  /** Cancel, suspend or transfer a subscription to direct. */
  def delete(request: AnonDeletionType): Request_[Unit]
  /** Get a specific subscription. */
  def get(request: AnonKey): Request_[Subscription]
  /** Create or transfer a subscription. */
  def insert(request: AnonOauthtoken): Request_[Subscription]
  /**
    * List of subscriptions managed by the reseller. The list can be all subscriptions, all of a customer's subscriptions, or all of a customer's
    * transferable subscriptions.
    */
  def list(request: AnonCustomerNamePrefix): Request_[Subscriptions]
  /** Immediately move a 30-day free trial subscription to a paid service subscription. */
  def startPaidService(request: AnonKey): Request_[Subscription]
  /** Suspends an active subscription. */
  def suspend(request: AnonKey): Request_[Subscription]
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    activate: AnonKey => Request_[Subscription],
    changePlan: AnonKey => Request_[Subscription],
    changeRenewalSettings: AnonKey => Request_[Subscription],
    changeSeats: AnonKey => Request_[Subscription],
    delete: AnonDeletionType => Request_[Unit],
    get: AnonKey => Request_[Subscription],
    insert: AnonOauthtoken => Request_[Subscription],
    list: AnonCustomerNamePrefix => Request_[Subscriptions],
    startPaidService: AnonKey => Request_[Subscription],
    suspend: AnonKey => Request_[Subscription]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), changePlan = js.Any.fromFunction1(changePlan), changeRenewalSettings = js.Any.fromFunction1(changeRenewalSettings), changeSeats = js.Any.fromFunction1(changeSeats), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), startPaidService = js.Any.fromFunction1(startPaidService), suspend = js.Any.fromFunction1(suspend))
  
    __obj.asInstanceOf[SubscriptionsResource]
  }
}

