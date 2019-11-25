package typings.googleDashAppsDashScript.GoogleAppsScript

import typings.googleDashAppsDashScript.GoogleAppsScript.AdminReseller.Collection.CustomersCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminReseller.Collection.ResellernotifyCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminReseller.Collection.SubscriptionsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminReseller.Schema.Address
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminReseller.Schema.ChangePlanRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminReseller.Schema.Customer
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminReseller.Schema.RenewalSettings
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminReseller.Schema.Seats
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminReseller.Schema.Subscription
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionPlan
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionPlanCommitmentInterval
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionTransferInfo
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionTrialSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("AdminReseller")
trait AdminReseller_ extends js.Object {
  var Customers: js.UndefOr[CustomersCollection] = js.undefined
  var Resellernotify: js.UndefOr[ResellernotifyCollection] = js.undefined
  var Subscriptions: js.UndefOr[SubscriptionsCollection] = js.undefined
  // Create a new instance of Address
  def newAddress(): Address
  // Create a new instance of ChangePlanRequest
  def newChangePlanRequest(): ChangePlanRequest
  // Create a new instance of Customer
  def newCustomer(): Customer
  // Create a new instance of RenewalSettings
  def newRenewalSettings(): RenewalSettings
  // Create a new instance of Seats
  def newSeats(): Seats
  // Create a new instance of Subscription
  def newSubscription(): Subscription
  // Create a new instance of SubscriptionPlan
  def newSubscriptionPlan(): SubscriptionPlan
  // Create a new instance of SubscriptionPlanCommitmentInterval
  def newSubscriptionPlanCommitmentInterval(): SubscriptionPlanCommitmentInterval
  // Create a new instance of SubscriptionTransferInfo
  def newSubscriptionTransferInfo(): SubscriptionTransferInfo
  // Create a new instance of SubscriptionTrialSettings
  def newSubscriptionTrialSettings(): SubscriptionTrialSettings
}

object AdminReseller_ {
  @scala.inline
  def apply(
    newAddress: () => Address,
    newChangePlanRequest: () => ChangePlanRequest,
    newCustomer: () => Customer,
    newRenewalSettings: () => RenewalSettings,
    newSeats: () => Seats,
    newSubscription: () => Subscription,
    newSubscriptionPlan: () => SubscriptionPlan,
    newSubscriptionPlanCommitmentInterval: () => SubscriptionPlanCommitmentInterval,
    newSubscriptionTransferInfo: () => SubscriptionTransferInfo,
    newSubscriptionTrialSettings: () => SubscriptionTrialSettings,
    Customers: CustomersCollection = null,
    Resellernotify: ResellernotifyCollection = null,
    Subscriptions: SubscriptionsCollection = null
  ): AdminReseller_ = {
    val __obj = js.Dynamic.literal(newAddress = js.Any.fromFunction0(newAddress), newChangePlanRequest = js.Any.fromFunction0(newChangePlanRequest), newCustomer = js.Any.fromFunction0(newCustomer), newRenewalSettings = js.Any.fromFunction0(newRenewalSettings), newSeats = js.Any.fromFunction0(newSeats), newSubscription = js.Any.fromFunction0(newSubscription), newSubscriptionPlan = js.Any.fromFunction0(newSubscriptionPlan), newSubscriptionPlanCommitmentInterval = js.Any.fromFunction0(newSubscriptionPlanCommitmentInterval), newSubscriptionTransferInfo = js.Any.fromFunction0(newSubscriptionTransferInfo), newSubscriptionTrialSettings = js.Any.fromFunction0(newSubscriptionTrialSettings))
    if (Customers != null) __obj.updateDynamic("Customers")(Customers.asInstanceOf[js.Any])
    if (Resellernotify != null) __obj.updateDynamic("Resellernotify")(Resellernotify.asInstanceOf[js.Any])
    if (Subscriptions != null) __obj.updateDynamic("Subscriptions")(Subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminReseller_]
  }
}

