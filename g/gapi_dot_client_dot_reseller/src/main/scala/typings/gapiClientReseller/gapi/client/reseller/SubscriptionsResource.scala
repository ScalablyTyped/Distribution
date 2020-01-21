package typings.gapiClientReseller.gapi.client.reseller

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientReseller.AnonAltCustomerAuthTokenCustomerId
import typings.gapiClientReseller.AnonAltCustomerAuthTokenCustomerIdCustomerNamePrefix
import typings.gapiClientReseller.AnonAltCustomerIdDeletionType
import typings.gapiClientReseller.AnonAltCustomerIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Activates a subscription previously suspended by the reseller */
  def activate(request: AnonAltCustomerIdFields): Request_[Subscription]
  /**
    * Update a subscription plan. Use this method to update a plan for a 30-day trial or a flexible plan subscription to an annual commitment plan with
    * monthly or yearly payments.
    */
  def changePlan(request: AnonAltCustomerIdFields): Request_[Subscription]
  /** Update a user license's renewal settings. This is applicable for accounts with annual commitment plans only. */
  def changeRenewalSettings(request: AnonAltCustomerIdFields): Request_[Subscription]
  /** Update a subscription's user license settings. */
  def changeSeats(request: AnonAltCustomerIdFields): Request_[Subscription]
  /** Cancel, suspend or transfer a subscription to direct. */
  def delete(request: AnonAltCustomerIdDeletionType): Request_[Unit]
  /** Get a specific subscription. */
  def get(request: AnonAltCustomerIdFields): Request_[Subscription]
  /** Create or transfer a subscription. */
  def insert(request: AnonAltCustomerAuthTokenCustomerId): Request_[Subscription]
  /**
    * List of subscriptions managed by the reseller. The list can be all subscriptions, all of a customer's subscriptions, or all of a customer's
    * transferable subscriptions.
    */
  def list(request: AnonAltCustomerAuthTokenCustomerIdCustomerNamePrefix): Request_[Subscriptions]
  /** Immediately move a 30-day free trial subscription to a paid service subscription. */
  def startPaidService(request: AnonAltCustomerIdFields): Request_[Subscription]
  /** Suspends an active subscription. */
  def suspend(request: AnonAltCustomerIdFields): Request_[Subscription]
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    activate: AnonAltCustomerIdFields => Request_[Subscription],
    changePlan: AnonAltCustomerIdFields => Request_[Subscription],
    changeRenewalSettings: AnonAltCustomerIdFields => Request_[Subscription],
    changeSeats: AnonAltCustomerIdFields => Request_[Subscription],
    delete: AnonAltCustomerIdDeletionType => Request_[Unit],
    get: AnonAltCustomerIdFields => Request_[Subscription],
    insert: AnonAltCustomerAuthTokenCustomerId => Request_[Subscription],
    list: AnonAltCustomerAuthTokenCustomerIdCustomerNamePrefix => Request_[Subscriptions],
    startPaidService: AnonAltCustomerIdFields => Request_[Subscription],
    suspend: AnonAltCustomerIdFields => Request_[Subscription]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), changePlan = js.Any.fromFunction1(changePlan), changeRenewalSettings = js.Any.fromFunction1(changeRenewalSettings), changeSeats = js.Any.fromFunction1(changeSeats), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), startPaidService = js.Any.fromFunction1(startPaidService), suspend = js.Any.fromFunction1(suspend))
  
    __obj.asInstanceOf[SubscriptionsResource]
  }
}

