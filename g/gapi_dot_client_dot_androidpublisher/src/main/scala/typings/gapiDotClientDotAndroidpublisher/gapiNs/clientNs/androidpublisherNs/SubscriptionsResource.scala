package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidpublisher.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Cancels a user's subscription purchase. The subscription remains valid until its expiration time. */
  def cancel(request: Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser): Request[Unit]
  /** Defers a user's subscription purchase until a specified future expiration time. */
  def defer(request: Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser): Request[SubscriptionPurchasesDeferResponse]
  /** Checks whether a user's subscription purchase is valid and returns its expiry time. */
  def get(request: Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser): Request[SubscriptionPurchase]
  /** Refunds a user's subscription purchase, but the subscription remains valid until its expiration time and it will continue to recur. */
  def refund(request: Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser): Request[Unit]
  /** Refunds and immediately revokes a user's subscription purchase. Access to the subscription will be terminated immediately and it will stop recurring. */
  def revoke(request: Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser): Request[Unit]
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    cancel: Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser => Request[Unit],
    defer: Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser => Request[SubscriptionPurchasesDeferResponse],
    get: Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser => Request[SubscriptionPurchase],
    refund: Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser => Request[Unit],
    revoke: Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser => Request[Unit]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), defer = js.Any.fromFunction1(defer), get = js.Any.fromFunction1(get), refund = js.Any.fromFunction1(refund), revoke = js.Any.fromFunction1(revoke))
  
    __obj.asInstanceOf[SubscriptionsResource]
  }
}

