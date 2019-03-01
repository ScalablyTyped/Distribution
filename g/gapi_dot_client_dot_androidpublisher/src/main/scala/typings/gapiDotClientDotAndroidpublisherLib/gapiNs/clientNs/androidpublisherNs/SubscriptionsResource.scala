package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Cancels a user's subscription purchase. The subscription remains valid until its expiration time. */
  def cancel(
    request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser
  ): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Defers a user's subscription purchase until a specified future expiration time. */
  def defer(
    request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser
  ): gapiDotClientLib.gapiNs.clientNs.Request[SubscriptionPurchasesDeferResponse]
  /** Checks whether a user's subscription purchase is valid and returns its expiry time. */
  def get(
    request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser
  ): gapiDotClientLib.gapiNs.clientNs.Request[SubscriptionPurchase]
  /** Refunds a user's subscription purchase, but the subscription remains valid until its expiration time and it will continue to recur. */
  def refund(
    request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser
  ): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Refunds and immediately revokes a user's subscription purchase. Access to the subscription will be terminated immediately and it will stop recurring. */
  def revoke(
    request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser
  ): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    cancel: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    defer: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser, 
      gapiDotClientLib.gapiNs.clientNs.Request[SubscriptionPurchasesDeferResponse]
    ],
    get: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser, 
      gapiDotClientLib.gapiNs.clientNs.Request[SubscriptionPurchase]
    ],
    refund: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    revoke: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrintQuotaUser, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("defer")(defer)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("refund")(refund)
    __obj.updateDynamic("revoke")(revoke)
    __obj.asInstanceOf[SubscriptionsResource]
  }
}

