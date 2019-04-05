package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminReseller extends js.Object {
  var Customers: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.CollectionNs.CustomersCollection
  ] = js.undefined
  var Resellernotify: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.CollectionNs.ResellernotifyCollection
  ] = js.undefined
  var Subscriptions: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.CollectionNs.SubscriptionsCollection
  ] = js.undefined
  // Create a new instance of Address
  def newAddress(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Address
  // Create a new instance of ChangePlanRequest
  def newChangePlanRequest(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.ChangePlanRequest
  // Create a new instance of Customer
  def newCustomer(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Customer
  // Create a new instance of RenewalSettings
  def newRenewalSettings(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.RenewalSettings
  // Create a new instance of Seats
  def newSeats(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Seats
  // Create a new instance of Subscription
  def newSubscription(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Subscription
  // Create a new instance of SubscriptionPlan
  def newSubscriptionPlan(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.SubscriptionPlan
  // Create a new instance of SubscriptionPlanCommitmentInterval
  def newSubscriptionPlanCommitmentInterval(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.SubscriptionPlanCommitmentInterval
  // Create a new instance of SubscriptionTransferInfo
  def newSubscriptionTransferInfo(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.SubscriptionTransferInfo
  // Create a new instance of SubscriptionTrialSettings
  def newSubscriptionTrialSettings(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.SubscriptionTrialSettings
}

object AdminReseller {
  @scala.inline
  def apply(
    newAddress: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Address,
    newChangePlanRequest: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.ChangePlanRequest,
    newCustomer: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Customer,
    newRenewalSettings: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.RenewalSettings,
    newSeats: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Seats,
    newSubscription: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Subscription,
    newSubscriptionPlan: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.SubscriptionPlan,
    newSubscriptionPlanCommitmentInterval: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.SubscriptionPlanCommitmentInterval,
    newSubscriptionTransferInfo: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.SubscriptionTransferInfo,
    newSubscriptionTrialSettings: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.SubscriptionTrialSettings,
    Customers: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.CollectionNs.CustomersCollection = null,
    Resellernotify: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.CollectionNs.ResellernotifyCollection = null,
    Subscriptions: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.CollectionNs.SubscriptionsCollection = null
  ): AdminReseller = {
    val __obj = js.Dynamic.literal(newAddress = js.Any.fromFunction0(newAddress), newChangePlanRequest = js.Any.fromFunction0(newChangePlanRequest), newCustomer = js.Any.fromFunction0(newCustomer), newRenewalSettings = js.Any.fromFunction0(newRenewalSettings), newSeats = js.Any.fromFunction0(newSeats), newSubscription = js.Any.fromFunction0(newSubscription), newSubscriptionPlan = js.Any.fromFunction0(newSubscriptionPlan), newSubscriptionPlanCommitmentInterval = js.Any.fromFunction0(newSubscriptionPlanCommitmentInterval), newSubscriptionTransferInfo = js.Any.fromFunction0(newSubscriptionTransferInfo), newSubscriptionTrialSettings = js.Any.fromFunction0(newSubscriptionTrialSettings))
    if (Customers != null) __obj.updateDynamic("Customers")(Customers)
    if (Resellernotify != null) __obj.updateDynamic("Resellernotify")(Resellernotify)
    if (Subscriptions != null) __obj.updateDynamic("Subscriptions")(Subscriptions)
    __obj.asInstanceOf[AdminReseller]
  }
}

