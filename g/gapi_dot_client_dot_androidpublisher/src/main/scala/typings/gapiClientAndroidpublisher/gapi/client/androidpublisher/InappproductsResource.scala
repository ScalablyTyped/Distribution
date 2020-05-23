package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.AutoConvertMissingPrices
import typings.gapiClientAndroidpublisher.anon.PrettyPrint
import typings.gapiClientAndroidpublisher.anon.QuotaUser
import typings.gapiClientAndroidpublisher.anon.Sku
import typings.gapiClientAndroidpublisher.anon.StartIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InappproductsResource extends js.Object {
  def batch(request: PrettyPrint): Request[InappproductsBatchResponse]
  /** Delete an in-app product for an app. */
  def delete(request: QuotaUser): Request[Unit]
  /** Returns information about the in-app product specified. */
  def get(request: QuotaUser): Request[InAppProduct]
  /** Creates a new in-app product for an app. */
  def insert(request: AutoConvertMissingPrices): Request[InAppProduct]
  /** List all the in-app products for an Android app, both subscriptions and managed in-app products.. */
  def list(request: StartIndex): Request[InappproductsListResponse]
  /** Updates the details of an in-app product. This method supports patch semantics. */
  def patch(request: Sku): Request[InAppProduct]
  /** Updates the details of an in-app product. */
  def update(request: Sku): Request[InAppProduct]
}

object InappproductsResource {
  @scala.inline
  def apply(
    batch: PrettyPrint => Request[InappproductsBatchResponse],
    delete: QuotaUser => Request[Unit],
    get: QuotaUser => Request[InAppProduct],
    insert: AutoConvertMissingPrices => Request[InAppProduct],
    list: StartIndex => Request[InappproductsListResponse],
    patch: Sku => Request[InAppProduct],
    update: Sku => Request[InAppProduct]
  ): InappproductsResource = {
    val __obj = js.Dynamic.literal(batch = js.Any.fromFunction1(batch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[InappproductsResource]
  }
}

