package typings.googleDashAppsDashScript.GoogleAppsScriptNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.CollectionNs.CustomersCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.CollectionNs.ResellernotifyCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.CollectionNs.SubscriptionsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Address
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.ChangePlanRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Customer
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.RenewalSettings
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Seats
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Subscription
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.SubscriptionPlan
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.SubscriptionPlanCommitmentInterval
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.SubscriptionTransferInfo
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.SubscriptionTrialSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminReseller extends js.Object {
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

object AdminReseller {
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
  ): AdminReseller = {
    val __obj = js.Dynamic.literal(newAddress = js.Any.fromFunction0(newAddress), newChangePlanRequest = js.Any.fromFunction0(newChangePlanRequest), newCustomer = js.Any.fromFunction0(newCustomer), newRenewalSettings = js.Any.fromFunction0(newRenewalSettings), newSeats = js.Any.fromFunction0(newSeats), newSubscription = js.Any.fromFunction0(newSubscription), newSubscriptionPlan = js.Any.fromFunction0(newSubscriptionPlan), newSubscriptionPlanCommitmentInterval = js.Any.fromFunction0(newSubscriptionPlanCommitmentInterval), newSubscriptionTransferInfo = js.Any.fromFunction0(newSubscriptionTransferInfo), newSubscriptionTrialSettings = js.Any.fromFunction0(newSubscriptionTrialSettings))
    if (Customers != null) __obj.updateDynamic("Customers")(Customers)
    if (Resellernotify != null) __obj.updateDynamic("Resellernotify")(Resellernotify)
    if (Subscriptions != null) __obj.updateDynamic("Subscriptions")(Subscriptions)
    __obj.asInstanceOf[AdminReseller]
  }
}

