package typings
package gapiDotClientDotResellerLib.gapiNs.clientNs.resellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SubscriptionsResource extends js.Object {
  /** Activates a subscription previously suspended by the reseller */
  def activate(request: gapiDotClientDotResellerLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /**
               * Update a subscription plan. Use this method to update a plan for a 30-day trial or a flexible plan subscription to an annual commitment plan with
               * monthly or yearly payments.
               */
  def changePlan(request: gapiDotClientDotResellerLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /** Update a user license's renewal settings. This is applicable for accounts with annual commitment plans only. */
  def changeRenewalSettings(request: gapiDotClientDotResellerLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /** Update a subscription's user license settings. */
  def changeSeats(request: gapiDotClientDotResellerLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /** Cancel, suspend or transfer a subscription to direct. */
  def delete(request: gapiDotClientDotResellerLib.Anon_PrettyPrintSubscriptionId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Get a specific subscription. */
  def get(request: gapiDotClientDotResellerLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /** Create or transfer a subscription. */
  def insert(request: gapiDotClientDotResellerLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /**
               * List of subscriptions managed by the reseller. The list can be all subscriptions, all of a customer's subscriptions, or all of a customer's
               * transferable subscriptions.
               */
  def list(request: gapiDotClientDotResellerLib.Anon_MaxResults): gapiDotClientLib.gapiNs.clientNs.Request[Subscriptions]
  /** Immediately move a 30-day free trial subscription to a paid service subscription. */
  def startPaidService(request: gapiDotClientDotResellerLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /** Suspends an active subscription. */
  def suspend(request: gapiDotClientDotResellerLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
}

