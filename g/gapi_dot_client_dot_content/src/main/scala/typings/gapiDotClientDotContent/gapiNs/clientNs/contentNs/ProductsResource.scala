package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotContent.Anon_AltDryRun
import typings.gapiDotClientDotContent.Anon_AltDryRunFields
import typings.gapiDotClientDotContent.Anon_AltDryRunFieldsKeyMerchantId
import typings.gapiDotClientDotContent.Anon_AltFieldsIncludeInvalidInsertedItems
import typings.gapiDotClientDotContent.Anon_AltFieldsKeyMerchantIdOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /** Retrieves, inserts, and deletes multiple products in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: Anon_AltDryRun): Request[ProductsCustomBatchResponse]
  /** Deletes a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def delete(request: Anon_AltDryRunFieldsKeyMerchantId): Request[Unit]
  /** Retrieves a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: Anon_AltFieldsKeyMerchantIdOauthtokenPrettyPrint): Request[Product]
  /**
    * Uploads a product to your Merchant Center account. If an item with the same channel, contentLanguage, offerId, and targetCountry already exists, this
    * method updates that entry. This method can only be called for non-multi-client accounts.
    */
  def insert(request: Anon_AltDryRunFields): Request[Product]
  /** Lists the products in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: Anon_AltFieldsIncludeInvalidInsertedItems): Request[ProductsListResponse]
}

object ProductsResource {
  @scala.inline
  def apply(
    custombatch: Anon_AltDryRun => Request[ProductsCustomBatchResponse],
    delete: Anon_AltDryRunFieldsKeyMerchantId => Request[Unit],
    get: Anon_AltFieldsKeyMerchantIdOauthtokenPrettyPrint => Request[Product],
    insert: Anon_AltDryRunFields => Request[Product],
    list: Anon_AltFieldsIncludeInvalidInsertedItems => Request[ProductsListResponse]
  ): ProductsResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ProductsResource]
  }
}

