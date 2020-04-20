package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContent.AnonFieldsIncludeAttributes
import typings.gapiClientContent.AnonIncludeAttributes
import typings.gapiClientContent.AnonPageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductstatusesResource extends js.Object {
  /** Gets the statuses of multiple products in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: AnonIncludeAttributes): Request_[ProductstatusesCustomBatchResponse]
  /** Gets the status of a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AnonFieldsIncludeAttributes): Request_[ProductStatus]
  /** Lists the statuses of the products in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: AnonPageToken): Request_[ProductstatusesListResponse]
}

object ProductstatusesResource {
  @scala.inline
  def apply(
    custombatch: AnonIncludeAttributes => Request_[ProductstatusesCustomBatchResponse],
    get: AnonFieldsIncludeAttributes => Request_[ProductStatus],
    list: AnonPageToken => Request_[ProductstatusesListResponse]
  ): ProductstatusesResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ProductstatusesResource]
  }
}

