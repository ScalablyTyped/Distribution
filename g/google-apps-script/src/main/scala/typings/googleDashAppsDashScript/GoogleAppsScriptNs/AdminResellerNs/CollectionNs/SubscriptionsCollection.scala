package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.ChangePlanRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.RenewalSettings
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Seats
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Subscription
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Subscriptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionsCollection extends js.Object {
  // Activates a subscription previously suspended by the reseller
  def activate(customerId: String, subscriptionId: String): Subscription = js.native
  // Update a subscription plan. Use this method to update a plan for a 30-day trial or a flexible plan subscription to an annual commitment plan with monthly or yearly payments.
  def changePlan(resource: ChangePlanRequest, customerId: String, subscriptionId: String): Subscription = js.native
  // Update a user license's renewal settings. This is applicable for accounts with annual commitment plans only.
  def changeRenewalSettings(resource: RenewalSettings, customerId: String, subscriptionId: String): Subscription = js.native
  // Update a subscription's user license settings.
  def changeSeats(resource: Seats, customerId: String, subscriptionId: String): Subscription = js.native
  // Get a specific subscription.
  def get(customerId: String, subscriptionId: String): Subscription = js.native
  // Create or transfer a subscription.
  def insert(resource: Subscription, customerId: String): Subscription = js.native
  // Create or transfer a subscription.
  def insert(resource: Subscription, customerId: String, optionalArgs: js.Object): Subscription = js.native
  // List of subscriptions managed by the reseller. The list can be all subscriptions, all of a customer's subscriptions, or all of a customer's transferable subscriptions.
  def list(): Subscriptions = js.native
  // List of subscriptions managed by the reseller. The list can be all subscriptions, all of a customer's subscriptions, or all of a customer's transferable subscriptions.
  def list(optionalArgs: js.Object): Subscriptions = js.native
  // Cancel or transfer a subscription to direct.
  def remove(customerId: String, subscriptionId: String, deletionType: String): Unit = js.native
  // Immediately move a 30-day free trial subscription to a paid service subscription.
  def startPaidService(customerId: String, subscriptionId: String): Subscription = js.native
  // Suspends an active subscription.
  def suspend(customerId: String, subscriptionId: String): Subscription = js.native
}

