package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotContent.Anon_AltFieldsIncludeAttributes
import typings.gapiDotClientDotContent.Anon_AltFieldsIncludeAttributesIncludeInvalidInsertedItems
import typings.gapiDotClientDotContent.Anon_AltFieldsIncludeAttributesKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductstatusesResource extends js.Object {
  /** Gets the statuses of multiple products in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: Anon_AltFieldsIncludeAttributes): Request[ProductstatusesCustomBatchResponse]
  /** Gets the status of a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: Anon_AltFieldsIncludeAttributesKey): Request[ProductStatus]
  /** Lists the statuses of the products in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: Anon_AltFieldsIncludeAttributesIncludeInvalidInsertedItems): Request[ProductstatusesListResponse]
}

object ProductstatusesResource {
  @scala.inline
  def apply(
    custombatch: Anon_AltFieldsIncludeAttributes => Request[ProductstatusesCustomBatchResponse],
    get: Anon_AltFieldsIncludeAttributesKey => Request[ProductStatus],
    list: Anon_AltFieldsIncludeAttributesIncludeInvalidInsertedItems => Request[ProductstatusesListResponse]
  ): ProductstatusesResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ProductstatusesResource]
  }
}

