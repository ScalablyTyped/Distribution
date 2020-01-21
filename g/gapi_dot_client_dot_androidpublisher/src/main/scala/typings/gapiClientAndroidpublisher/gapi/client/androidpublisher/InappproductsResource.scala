package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonAltAutoConvertMissingPrices
import typings.gapiClientAndroidpublisher.AnonAltAutoConvertMissingPricesFields
import typings.gapiClientAndroidpublisher.AnonAltFieldsKeyMaxResults
import typings.gapiClientAndroidpublisher.AnonAltFieldsKeyOauthtoken
import typings.gapiClientAndroidpublisher.AnonAltFieldsKeyOauthtokenPackageName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InappproductsResource extends js.Object {
  def batch(request: AnonAltFieldsKeyOauthtoken): Request_[InappproductsBatchResponse]
  /** Delete an in-app product for an app. */
  def delete(request: AnonAltFieldsKeyOauthtokenPackageName): Request_[Unit]
  /** Returns information about the in-app product specified. */
  def get(request: AnonAltFieldsKeyOauthtokenPackageName): Request_[InAppProduct]
  /** Creates a new in-app product for an app. */
  def insert(request: AnonAltAutoConvertMissingPrices): Request_[InAppProduct]
  /** List all the in-app products for an Android app, both subscriptions and managed in-app products.. */
  def list(request: AnonAltFieldsKeyMaxResults): Request_[InappproductsListResponse]
  /** Updates the details of an in-app product. This method supports patch semantics. */
  def patch(request: AnonAltAutoConvertMissingPricesFields): Request_[InAppProduct]
  /** Updates the details of an in-app product. */
  def update(request: AnonAltAutoConvertMissingPricesFields): Request_[InAppProduct]
}

object InappproductsResource {
  @scala.inline
  def apply(
    batch: AnonAltFieldsKeyOauthtoken => Request_[InappproductsBatchResponse],
    delete: AnonAltFieldsKeyOauthtokenPackageName => Request_[Unit],
    get: AnonAltFieldsKeyOauthtokenPackageName => Request_[InAppProduct],
    insert: AnonAltAutoConvertMissingPrices => Request_[InAppProduct],
    list: AnonAltFieldsKeyMaxResults => Request_[InappproductsListResponse],
    patch: AnonAltAutoConvertMissingPricesFields => Request_[InAppProduct],
    update: AnonAltAutoConvertMissingPricesFields => Request_[InAppProduct]
  ): InappproductsResource = {
    val __obj = js.Dynamic.literal(batch = js.Any.fromFunction1(batch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[InappproductsResource]
  }
}

