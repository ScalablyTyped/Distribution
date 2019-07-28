package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidpublisher.Anon_AltAutoConvertMissingPrices
import typings.gapiDotClientDotAndroidpublisher.Anon_AltAutoConvertMissingPricesFields
import typings.gapiDotClientDotAndroidpublisher.Anon_AltFieldsKeyMaxResults
import typings.gapiDotClientDotAndroidpublisher.Anon_AltFieldsKeyOauthtoken
import typings.gapiDotClientDotAndroidpublisher.Anon_AltFieldsKeyOauthtokenPackageName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InappproductsResource extends js.Object {
  def batch(request: Anon_AltFieldsKeyOauthtoken): Request[InappproductsBatchResponse]
  /** Delete an in-app product for an app. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPackageName): Request[Unit]
  /** Returns information about the in-app product specified. */
  def get(request: Anon_AltFieldsKeyOauthtokenPackageName): Request[InAppProduct]
  /** Creates a new in-app product for an app. */
  def insert(request: Anon_AltAutoConvertMissingPrices): Request[InAppProduct]
  /** List all the in-app products for an Android app, both subscriptions and managed in-app products.. */
  def list(request: Anon_AltFieldsKeyMaxResults): Request[InappproductsListResponse]
  /** Updates the details of an in-app product. This method supports patch semantics. */
  def patch(request: Anon_AltAutoConvertMissingPricesFields): Request[InAppProduct]
  /** Updates the details of an in-app product. */
  def update(request: Anon_AltAutoConvertMissingPricesFields): Request[InAppProduct]
}

object InappproductsResource {
  @scala.inline
  def apply(
    batch: Anon_AltFieldsKeyOauthtoken => Request[InappproductsBatchResponse],
    delete: Anon_AltFieldsKeyOauthtokenPackageName => Request[Unit],
    get: Anon_AltFieldsKeyOauthtokenPackageName => Request[InAppProduct],
    insert: Anon_AltAutoConvertMissingPrices => Request[InAppProduct],
    list: Anon_AltFieldsKeyMaxResults => Request[InappproductsListResponse],
    patch: Anon_AltAutoConvertMissingPricesFields => Request[InAppProduct],
    update: Anon_AltAutoConvertMissingPricesFields => Request[InAppProduct]
  ): InappproductsResource = {
    val __obj = js.Dynamic.literal(batch = js.Any.fromFunction1(batch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[InappproductsResource]
  }
}

