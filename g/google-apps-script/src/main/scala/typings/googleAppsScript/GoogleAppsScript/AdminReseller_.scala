package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Collection.CustomersCollection
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Collection.ResellernotifyCollection
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Collection.SubscriptionsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.Address
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.ChangePlanRequest
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.Customer
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.RenewalSettings
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.Seats
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.Subscription
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionPlan
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionPlanCommitmentInterval
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionTransferInfo
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionTrialSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminReseller_ extends js.Object {
  var Customers: js.UndefOr[CustomersCollection] = js.native
  var Resellernotify: js.UndefOr[ResellernotifyCollection] = js.native
  var Subscriptions: js.UndefOr[SubscriptionsCollection] = js.native
  // Create a new instance of Address
  def newAddress(): Address = js.native
  // Create a new instance of ChangePlanRequest
  def newChangePlanRequest(): ChangePlanRequest = js.native
  // Create a new instance of Customer
  def newCustomer(): Customer = js.native
  // Create a new instance of RenewalSettings
  def newRenewalSettings(): RenewalSettings = js.native
  // Create a new instance of Seats
  def newSeats(): Seats = js.native
  // Create a new instance of Subscription
  def newSubscription(): Subscription = js.native
  // Create a new instance of SubscriptionPlan
  def newSubscriptionPlan(): SubscriptionPlan = js.native
  // Create a new instance of SubscriptionPlanCommitmentInterval
  def newSubscriptionPlanCommitmentInterval(): SubscriptionPlanCommitmentInterval = js.native
  // Create a new instance of SubscriptionTransferInfo
  def newSubscriptionTransferInfo(): SubscriptionTransferInfo = js.native
  // Create a new instance of SubscriptionTrialSettings
  def newSubscriptionTrialSettings(): SubscriptionTrialSettings = js.native
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
    newSubscriptionTrialSettings: () => SubscriptionTrialSettings
  ): AdminReseller_ = {
    val __obj = js.Dynamic.literal(newAddress = js.Any.fromFunction0(newAddress), newChangePlanRequest = js.Any.fromFunction0(newChangePlanRequest), newCustomer = js.Any.fromFunction0(newCustomer), newRenewalSettings = js.Any.fromFunction0(newRenewalSettings), newSeats = js.Any.fromFunction0(newSeats), newSubscription = js.Any.fromFunction0(newSubscription), newSubscriptionPlan = js.Any.fromFunction0(newSubscriptionPlan), newSubscriptionPlanCommitmentInterval = js.Any.fromFunction0(newSubscriptionPlanCommitmentInterval), newSubscriptionTransferInfo = js.Any.fromFunction0(newSubscriptionTransferInfo), newSubscriptionTrialSettings = js.Any.fromFunction0(newSubscriptionTrialSettings))
    __obj.asInstanceOf[AdminReseller_]
  }
  @scala.inline
  implicit class AdminReseller_Ops[Self <: AdminReseller_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNewAddress(value: () => Address): Self = this.set("newAddress", js.Any.fromFunction0(value))
    @scala.inline
    def setNewChangePlanRequest(value: () => ChangePlanRequest): Self = this.set("newChangePlanRequest", js.Any.fromFunction0(value))
    @scala.inline
    def setNewCustomer(value: () => Customer): Self = this.set("newCustomer", js.Any.fromFunction0(value))
    @scala.inline
    def setNewRenewalSettings(value: () => RenewalSettings): Self = this.set("newRenewalSettings", js.Any.fromFunction0(value))
    @scala.inline
    def setNewSeats(value: () => Seats): Self = this.set("newSeats", js.Any.fromFunction0(value))
    @scala.inline
    def setNewSubscription(value: () => Subscription): Self = this.set("newSubscription", js.Any.fromFunction0(value))
    @scala.inline
    def setNewSubscriptionPlan(value: () => SubscriptionPlan): Self = this.set("newSubscriptionPlan", js.Any.fromFunction0(value))
    @scala.inline
    def setNewSubscriptionPlanCommitmentInterval(value: () => SubscriptionPlanCommitmentInterval): Self = this.set("newSubscriptionPlanCommitmentInterval", js.Any.fromFunction0(value))
    @scala.inline
    def setNewSubscriptionTransferInfo(value: () => SubscriptionTransferInfo): Self = this.set("newSubscriptionTransferInfo", js.Any.fromFunction0(value))
    @scala.inline
    def setNewSubscriptionTrialSettings(value: () => SubscriptionTrialSettings): Self = this.set("newSubscriptionTrialSettings", js.Any.fromFunction0(value))
    @scala.inline
    def setCustomers(value: CustomersCollection): Self = this.set("Customers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomers: Self = this.set("Customers", js.undefined)
    @scala.inline
    def setResellernotify(value: ResellernotifyCollection): Self = this.set("Resellernotify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResellernotify: Self = this.set("Resellernotify", js.undefined)
    @scala.inline
    def setSubscriptions(value: SubscriptionsCollection): Self = this.set("Subscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptions: Self = this.set("Subscriptions", js.undefined)
  }
  
}

