package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonAutoConvertMissingPrices
import typings.gapiClientAndroidpublisher.AnonPrettyPrint
import typings.gapiClientAndroidpublisher.AnonQuotaUser
import typings.gapiClientAndroidpublisher.AnonSku
import typings.gapiClientAndroidpublisher.AnonStartIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InappproductsResource extends js.Object {
  def batch(request: AnonPrettyPrint): Request_[InappproductsBatchResponse]
  /** Delete an in-app product for an app. */
  def delete(request: AnonQuotaUser): Request_[Unit]
  /** Returns information about the in-app product specified. */
  def get(request: AnonQuotaUser): Request_[InAppProduct]
  /** Creates a new in-app product for an app. */
  def insert(request: AnonAutoConvertMissingPrices): Request_[InAppProduct]
  /** List all the in-app products for an Android app, both subscriptions and managed in-app products.. */
  def list(request: AnonStartIndex): Request_[InappproductsListResponse]
  /** Updates the details of an in-app product. This method supports patch semantics. */
  def patch(request: AnonSku): Request_[InAppProduct]
  /** Updates the details of an in-app product. */
  def update(request: AnonSku): Request_[InAppProduct]
}

object InappproductsResource {
  @scala.inline
  def apply(
    batch: AnonPrettyPrint => Request_[InappproductsBatchResponse],
    delete: AnonQuotaUser => Request_[Unit],
    get: AnonQuotaUser => Request_[InAppProduct],
    insert: AnonAutoConvertMissingPrices => Request_[InAppProduct],
    list: AnonStartIndex => Request_[InappproductsListResponse],
    patch: AnonSku => Request_[InAppProduct],
    update: AnonSku => Request_[InAppProduct]
  ): InappproductsResource = {
    val __obj = js.Dynamic.literal(batch = js.Any.fromFunction1(batch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[InappproductsResource]
  }
}

