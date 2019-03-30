package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reseller_v1 extends js.Object {
  var Customers: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.CollectionNs.CustomersCollection
  ] = js.undefined
  var Resellernotify: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.CollectionNs.ResellernotifyCollection
  ] = js.undefined
  var Subscriptions: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.CollectionNs.SubscriptionsCollection
  ] = js.undefined
  // Create a new instance of Address
  def newAddress(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Address
  // Create a new instance of ChangePlanRequest
  def newChangePlanRequest(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.ChangePlanRequest
  // Create a new instance of Customer
  def newCustomer(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Customer
  // Create a new instance of RenewalSettings
  def newRenewalSettings(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.RenewalSettings
  // Create a new instance of Seats
  def newSeats(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Seats
  // Create a new instance of Subscription
  def newSubscription(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Subscription
  // Create a new instance of SubscriptionPlan
  def newSubscriptionPlan(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.SubscriptionPlan
  // Create a new instance of SubscriptionPlanCommitmentInterval
  def newSubscriptionPlanCommitmentInterval(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.SubscriptionPlanCommitmentInterval
  // Create a new instance of SubscriptionTransferInfo
  def newSubscriptionTransferInfo(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.SubscriptionTransferInfo
  // Create a new instance of SubscriptionTrialSettings
  def newSubscriptionTrialSettings(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.SubscriptionTrialSettings
}

object Reseller_v1 {
  @scala.inline
  def apply(
    newAddress: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Address,
    newChangePlanRequest: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.ChangePlanRequest,
    newCustomer: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Customer,
    newRenewalSettings: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.RenewalSettings,
    newSeats: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Seats,
    newSubscription: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Subscription,
    newSubscriptionPlan: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.SubscriptionPlan,
    newSubscriptionPlanCommitmentInterval: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.SubscriptionPlanCommitmentInterval,
    newSubscriptionTransferInfo: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.SubscriptionTransferInfo,
    newSubscriptionTrialSettings: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.SubscriptionTrialSettings,
    Customers: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.CollectionNs.CustomersCollection = null,
    Resellernotify: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.CollectionNs.ResellernotifyCollection = null,
    Subscriptions: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.CollectionNs.SubscriptionsCollection = null
  ): Reseller_v1 = {
    val __obj = js.Dynamic.literal(newAddress = js.Any.fromFunction0(newAddress), newChangePlanRequest = js.Any.fromFunction0(newChangePlanRequest), newCustomer = js.Any.fromFunction0(newCustomer), newRenewalSettings = js.Any.fromFunction0(newRenewalSettings), newSeats = js.Any.fromFunction0(newSeats), newSubscription = js.Any.fromFunction0(newSubscription), newSubscriptionPlan = js.Any.fromFunction0(newSubscriptionPlan), newSubscriptionPlanCommitmentInterval = js.Any.fromFunction0(newSubscriptionPlanCommitmentInterval), newSubscriptionTransferInfo = js.Any.fromFunction0(newSubscriptionTransferInfo), newSubscriptionTrialSettings = js.Any.fromFunction0(newSubscriptionTrialSettings))
    if (Customers != null) __obj.updateDynamic("Customers")(Customers)
    if (Resellernotify != null) __obj.updateDynamic("Resellernotify")(Resellernotify)
    if (Subscriptions != null) __obj.updateDynamic("Subscriptions")(Subscriptions)
    __obj.asInstanceOf[Reseller_v1]
  }
}

