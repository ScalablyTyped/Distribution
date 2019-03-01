package typings
package gapiDotClientDotResellerLib.gapiNs.clientNs.resellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Activates a subscription previously suspended by the reseller */
  def activate(request: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /**
    * Update a subscription plan. Use this method to update a plan for a 30-day trial or a flexible plan subscription to an annual commitment plan with
    * monthly or yearly payments.
    */
  def changePlan(request: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /** Update a user license's renewal settings. This is applicable for accounts with annual commitment plans only. */
  def changeRenewalSettings(request: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /** Update a subscription's user license settings. */
  def changeSeats(request: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /** Cancel, suspend or transfer a subscription to direct. */
  def delete(request: gapiDotClientDotResellerLib.Anon_AltCustomerIdDeletionType): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Get a specific subscription. */
  def get(request: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /** Create or transfer a subscription. */
  def insert(request: gapiDotClientDotResellerLib.Anon_AltCustomerAuthTokenCustomerId): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /**
    * List of subscriptions managed by the reseller. The list can be all subscriptions, all of a customer's subscriptions, or all of a customer's
    * transferable subscriptions.
    */
  def list(request: gapiDotClientDotResellerLib.Anon_AltCustomerAuthTokenCustomerIdCustomerNamePrefix): gapiDotClientLib.gapiNs.clientNs.Request[Subscriptions]
  /** Immediately move a 30-day free trial subscription to a paid service subscription. */
  def startPaidService(request: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /** Suspends an active subscription. */
  def suspend(request: gapiDotClientDotResellerLib.Anon_AltCustomerIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    activate: js.Function1[
      gapiDotClientDotResellerLib.Anon_AltCustomerIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
    ],
    changePlan: js.Function1[
      gapiDotClientDotResellerLib.Anon_AltCustomerIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
    ],
    changeRenewalSettings: js.Function1[
      gapiDotClientDotResellerLib.Anon_AltCustomerIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
    ],
    changeSeats: js.Function1[
      gapiDotClientDotResellerLib.Anon_AltCustomerIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
    ],
    delete: js.Function1[
      gapiDotClientDotResellerLib.Anon_AltCustomerIdDeletionType, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotResellerLib.Anon_AltCustomerIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
    ],
    insert: js.Function1[
      gapiDotClientDotResellerLib.Anon_AltCustomerAuthTokenCustomerId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
    ],
    list: js.Function1[
      gapiDotClientDotResellerLib.Anon_AltCustomerAuthTokenCustomerIdCustomerNamePrefix, 
      gapiDotClientLib.gapiNs.clientNs.Request[Subscriptions]
    ],
    startPaidService: js.Function1[
      gapiDotClientDotResellerLib.Anon_AltCustomerIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
    ],
    suspend: js.Function1[
      gapiDotClientDotResellerLib.Anon_AltCustomerIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
    ]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activate")(activate)
    __obj.updateDynamic("changePlan")(changePlan)
    __obj.updateDynamic("changeRenewalSettings")(changeRenewalSettings)
    __obj.updateDynamic("changeSeats")(changeSeats)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("startPaidService")(startPaidService)
    __obj.updateDynamic("suspend")(suspend)
    __obj.asInstanceOf[SubscriptionsResource]
  }
}

