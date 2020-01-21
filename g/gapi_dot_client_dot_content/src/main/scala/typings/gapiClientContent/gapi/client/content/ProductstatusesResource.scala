package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContent.AnonAltFieldsIncludeAttributes
import typings.gapiClientContent.AnonAltFieldsIncludeAttributesIncludeInvalidInsertedItems
import typings.gapiClientContent.AnonAltFieldsIncludeAttributesKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductstatusesResource extends js.Object {
  /** Gets the statuses of multiple products in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: AnonAltFieldsIncludeAttributes): Request_[ProductstatusesCustomBatchResponse]
  /** Gets the status of a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AnonAltFieldsIncludeAttributesKey): Request_[ProductStatus]
  /** Lists the statuses of the products in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: AnonAltFieldsIncludeAttributesIncludeInvalidInsertedItems): Request_[ProductstatusesListResponse]
}

object ProductstatusesResource {
  @scala.inline
  def apply(
    custombatch: AnonAltFieldsIncludeAttributes => Request_[ProductstatusesCustomBatchResponse],
    get: AnonAltFieldsIncludeAttributesKey => Request_[ProductStatus],
    list: AnonAltFieldsIncludeAttributesIncludeInvalidInsertedItems => Request_[ProductstatusesListResponse]
  ): ProductstatusesResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ProductstatusesResource]
  }
}

