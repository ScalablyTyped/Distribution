package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionsCollection extends js.Object {
  // Activates a subscription previously suspended by the reseller
  def activate(customerId: java.lang.String, subscriptionId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Subscription = js.native
  // Update a subscription plan. Use this method to update a plan for a 30-day trial or a flexible plan subscription to an annual commitment plan with monthly or yearly payments.
  def changePlan(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.ChangePlanRequest,
    customerId: java.lang.String,
    subscriptionId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Subscription = js.native
  // Update a user license's renewal settings. This is applicable for accounts with annual commitment plans only.
  def changeRenewalSettings(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.RenewalSettings,
    customerId: java.lang.String,
    subscriptionId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Subscription = js.native
  // Update a subscription's user license settings.
  def changeSeats(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Seats,
    customerId: java.lang.String,
    subscriptionId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Subscription = js.native
  // Get a specific subscription.
  def get(customerId: java.lang.String, subscriptionId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Subscription = js.native
  // Create or transfer a subscription.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Subscription,
    customerId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Subscription = js.native
  // Create or transfer a subscription.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Subscription,
    customerId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Subscription = js.native
  // List of subscriptions managed by the reseller. The list can be all subscriptions, all of a customer's subscriptions, or all of a customer's transferable subscriptions.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Subscriptions = js.native
  // List of subscriptions managed by the reseller. The list can be all subscriptions, all of a customer's subscriptions, or all of a customer's transferable subscriptions.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Subscriptions = js.native
  // Cancel or transfer a subscription to direct.
  def remove(customerId: java.lang.String, subscriptionId: java.lang.String, deletionType: java.lang.String): scala.Unit = js.native
  // Immediately move a 30-day free trial subscription to a paid service subscription.
  def startPaidService(customerId: java.lang.String, subscriptionId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Subscription = js.native
  // Suspends an active subscription.
  def suspend(customerId: java.lang.String, subscriptionId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Subscription = js.native
}

