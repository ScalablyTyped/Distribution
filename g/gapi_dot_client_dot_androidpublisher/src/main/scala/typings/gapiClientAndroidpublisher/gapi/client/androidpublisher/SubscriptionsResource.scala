package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.SubscriptionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionsResource extends js.Object {
  /** Cancels a user's subscription purchase. The subscription remains valid until its expiration time. */
  def cancel(request: SubscriptionId): Request[Unit] = js.native
  /** Defers a user's subscription purchase until a specified future expiration time. */
  def defer(request: SubscriptionId): Request[SubscriptionPurchasesDeferResponse] = js.native
  /** Checks whether a user's subscription purchase is valid and returns its expiry time. */
  def get(request: SubscriptionId): Request[SubscriptionPurchase] = js.native
  /** Refunds a user's subscription purchase, but the subscription remains valid until its expiration time and it will continue to recur. */
  def refund(request: SubscriptionId): Request[Unit] = js.native
  /** Refunds and immediately revokes a user's subscription purchase. Access to the subscription will be terminated immediately and it will stop recurring. */
  def revoke(request: SubscriptionId): Request[Unit] = js.native
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    cancel: SubscriptionId => Request[Unit],
    defer: SubscriptionId => Request[SubscriptionPurchasesDeferResponse],
    get: SubscriptionId => Request[SubscriptionPurchase],
    refund: SubscriptionId => Request[Unit],
    revoke: SubscriptionId => Request[Unit]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), defer = js.Any.fromFunction1(defer), get = js.Any.fromFunction1(get), refund = js.Any.fromFunction1(refund), revoke = js.Any.fromFunction1(revoke))
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
    def setCancel(value: SubscriptionId => Request[Unit]): Self = this.set("cancel", js.Any.fromFunction1(value))
    @scala.inline
    def setDefer(value: SubscriptionId => Request[SubscriptionPurchasesDeferResponse]): Self = this.set("defer", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: SubscriptionId => Request[SubscriptionPurchase]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setRefund(value: SubscriptionId => Request[Unit]): Self = this.set("refund", js.Any.fromFunction1(value))
    @scala.inline
    def setRevoke(value: SubscriptionId => Request[Unit]): Self = this.set("revoke", js.Any.fromFunction1(value))
  }
  
}

