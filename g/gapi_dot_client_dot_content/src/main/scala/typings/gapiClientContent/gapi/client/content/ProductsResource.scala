package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContent.AnonAltFields
import typings.gapiClientContent.AnonDryRun
import typings.gapiClientContent.AnonIncludeInvalidInsertedItems
import typings.gapiClientContent.AnonMerchantId
import typings.gapiClientContent.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /** Retrieves, inserts, and deletes multiple products in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: AnonDryRun): Request_[ProductsCustomBatchResponse]
  /** Deletes a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def delete(request: AnonUserIp): Request_[Unit]
  /** Retrieves a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AnonAltFields): Request_[Product]
  /**
    * Uploads a product to your Merchant Center account. If an item with the same channel, contentLanguage, offerId, and targetCountry already exists, this
    * method updates that entry. This method can only be called for non-multi-client accounts.
    */
  def insert(request: AnonMerchantId): Request_[Product]
  /** Lists the products in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: AnonIncludeInvalidInsertedItems): Request_[ProductsListResponse]
}

object ProductsResource {
  @scala.inline
  def apply(
    custombatch: AnonDryRun => Request_[ProductsCustomBatchResponse],
    delete: AnonUserIp => Request_[Unit],
    get: AnonAltFields => Request_[Product],
    insert: AnonMerchantId => Request_[Product],
    list: AnonIncludeInvalidInsertedItems => Request_[ProductsListResponse]
  ): ProductsResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ProductsResource]
  }
}

