package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.gapiClientContent.anon.AltFields
import typings.gapiClientContent.anon.DryRun
import typings.gapiClientContent.anon.IncludeInvalidInsertedItems
import typings.gapiClientContent.anon.MerchantId
import typings.gapiClientContent.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductsResource extends js.Object {
  /** Retrieves, inserts, and deletes multiple products in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: DryRun): Request[ProductsCustomBatchResponse] = js.native
  /** Deletes a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def delete(request: UserIp): Request[Unit] = js.native
  /** Retrieves a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AltFields): Request[Product] = js.native
  /**
    * Uploads a product to your Merchant Center account. If an item with the same channel, contentLanguage, offerId, and targetCountry already exists, this
    * method updates that entry. This method can only be called for non-multi-client accounts.
    */
  def insert(request: MerchantId): Request[Product] = js.native
  /** Lists the products in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: IncludeInvalidInsertedItems): Request[ProductsListResponse] = js.native
}

object ProductsResource {
  @scala.inline
  def apply(
    custombatch: DryRun => Request[ProductsCustomBatchResponse],
    delete: UserIp => Request[Unit],
    get: AltFields => Request[Product],
    insert: MerchantId => Request[Product],
    list: IncludeInvalidInsertedItems => Request[ProductsListResponse]
  ): ProductsResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ProductsResource]
  }
  @scala.inline
  implicit class ProductsResourceOps[Self <: ProductsResource] (val x: Self) extends AnyVal {
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
    def setCustombatch(value: DryRun => Request[ProductsCustomBatchResponse]): Self = this.set("custombatch", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: UserIp => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: AltFields => Request[Product]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: MerchantId => Request[Product]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: IncludeInvalidInsertedItems => Request[ProductsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

