package typings.gapiClientReseller.gapi.client.reseller

import typings.gapiClient.gapi.client.Request
import typings.gapiClientReseller.anon.CustomerNamePrefix
import typings.gapiClientReseller.anon.DeletionType
import typings.gapiClientReseller.anon.Key
import typings.gapiClientReseller.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionsResource extends js.Object {
  /** Activates a subscription previously suspended by the reseller */
  def activate(request: Key): Request[Subscription] = js.native
  /**
    * Update a subscription plan. Use this method to update a plan for a 30-day trial or a flexible plan subscription to an annual commitment plan with
    * monthly or yearly payments.
    */
  def changePlan(request: Key): Request[Subscription] = js.native
  /** Update a user license's renewal settings. This is applicable for accounts with annual commitment plans only. */
  def changeRenewalSettings(request: Key): Request[Subscription] = js.native
  /** Update a subscription's user license settings. */
  def changeSeats(request: Key): Request[Subscription] = js.native
  /** Cancel, suspend or transfer a subscription to direct. */
  def delete(request: DeletionType): Request[Unit] = js.native
  /** Get a specific subscription. */
  def get(request: Key): Request[Subscription] = js.native
  /** Create or transfer a subscription. */
  def insert(request: Oauthtoken): Request[Subscription] = js.native
  /**
    * List of subscriptions managed by the reseller. The list can be all subscriptions, all of a customer's subscriptions, or all of a customer's
    * transferable subscriptions.
    */
  def list(request: CustomerNamePrefix): Request[Subscriptions] = js.native
  /** Immediately move a 30-day free trial subscription to a paid service subscription. */
  def startPaidService(request: Key): Request[Subscription] = js.native
  /** Suspends an active subscription. */
  def suspend(request: Key): Request[Subscription] = js.native
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    activate: Key => Request[Subscription],
    changePlan: Key => Request[Subscription],
    changeRenewalSettings: Key => Request[Subscription],
    changeSeats: Key => Request[Subscription],
    delete: DeletionType => Request[Unit],
    get: Key => Request[Subscription],
    insert: Oauthtoken => Request[Subscription],
    list: CustomerNamePrefix => Request[Subscriptions],
    startPaidService: Key => Request[Subscription],
    suspend: Key => Request[Subscription]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), changePlan = js.Any.fromFunction1(changePlan), changeRenewalSettings = js.Any.fromFunction1(changeRenewalSettings), changeSeats = js.Any.fromFunction1(changeSeats), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), startPaidService = js.Any.fromFunction1(startPaidService), suspend = js.Any.fromFunction1(suspend))
    __obj.asInstanceOf[SubscriptionsResource]
  }
  @scala.inline
  implicit class SubscriptionsResourceOps[Self <: SubscriptionsResource] (val x: Self) extends AnyVal {
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
    def setActivate(value: Key => Request[Subscription]): Self = this.set("activate", js.Any.fromFunction1(value))
    @scala.inline
    def setChangePlan(value: Key => Request[Subscription]): Self = this.set("changePlan", js.Any.fromFunction1(value))
    @scala.inline
    def setChangeRenewalSettings(value: Key => Request[Subscription]): Self = this.set("changeRenewalSettings", js.Any.fromFunction1(value))
    @scala.inline
    def setChangeSeats(value: Key => Request[Subscription]): Self = this.set("changeSeats", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: DeletionType => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => Request[Subscription]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Oauthtoken => Request[Subscription]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: CustomerNamePrefix => Request[Subscriptions]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setStartPaidService(value: Key => Request[Subscription]): Self = this.set("startPaidService", js.Any.fromFunction1(value))
    @scala.inline
    def setSuspend(value: Key => Request[Subscription]): Self = this.set("suspend", js.Any.fromFunction1(value))
  }
  
}

