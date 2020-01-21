package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonAltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Cancels a user's subscription purchase. The subscription remains valid until its expiration time. */
  def cancel(request: AnonAltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser): Request_[Unit]
  /** Defers a user's subscription purchase until a specified future expiration time. */
  def defer(request: AnonAltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser): Request_[SubscriptionPurchasesDeferResponse]
  /** Checks whether a user's subscription purchase is valid and returns its expiry time. */
  def get(request: AnonAltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser): Request_[SubscriptionPurchase]
  /** Refunds a user's subscription purchase, but the subscription remains valid until its expiration time and it will continue to recur. */
  def refund(request: AnonAltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser): Request_[Unit]
  /** Refunds and immediately revokes a user's subscription purchase. Access to the subscription will be terminated immediately and it will stop recurring. */
  def revoke(request: AnonAltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser): Request_[Unit]
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    cancel: AnonAltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser => Request_[Unit],
    defer: AnonAltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser => Request_[SubscriptionPurchasesDeferResponse],
    get: AnonAltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser => Request_[SubscriptionPurchase],
    refund: AnonAltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser => Request_[Unit],
    revoke: AnonAltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser => Request_[Unit]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), defer = js.Any.fromFunction1(defer), get = js.Any.fromFunction1(get), refund = js.Any.fromFunction1(refund), revoke = js.Any.fromFunction1(revoke))
  
    __obj.asInstanceOf[SubscriptionsResource]
  }
}

