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

@js.native
trait InappproductsResource extends js.Object {
  def batch(request: PrettyPrint): Request[InappproductsBatchResponse] = js.native
  /** Delete an in-app product for an app. */
  def delete(request: QuotaUser): Request[Unit] = js.native
  /** Returns information about the in-app product specified. */
  def get(request: QuotaUser): Request[InAppProduct] = js.native
  /** Creates a new in-app product for an app. */
  def insert(request: AutoConvertMissingPrices): Request[InAppProduct] = js.native
  /** List all the in-app products for an Android app, both subscriptions and managed in-app products.. */
  def list(request: StartIndex): Request[InappproductsListResponse] = js.native
  /** Updates the details of an in-app product. This method supports patch semantics. */
  def patch(request: Sku): Request[InAppProduct] = js.native
  /** Updates the details of an in-app product. */
  def update(request: Sku): Request[InAppProduct] = js.native
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
  @scala.inline
  implicit class InappproductsResourceOps[Self <: InappproductsResource] (val x: Self) extends AnyVal {
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
    def setBatch(value: PrettyPrint => Request[InappproductsBatchResponse]): Self = this.set("batch", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: QuotaUser => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: QuotaUser => Request[InAppProduct]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: AutoConvertMissingPrices => Request[InAppProduct]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: StartIndex => Request[InappproductsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Sku => Request[InAppProduct]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Sku => Request[InAppProduct]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

