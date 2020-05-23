package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.gapiClientContent.anon.FieldsIncludeAttributes
import typings.gapiClientContent.anon.IncludeAttributes
import typings.gapiClientContent.anon.PageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductstatusesResource extends js.Object {
  /** Gets the statuses of multiple products in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: IncludeAttributes): Request[ProductstatusesCustomBatchResponse]
  /** Gets the status of a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: FieldsIncludeAttributes): Request[ProductStatus]
  /** Lists the statuses of the products in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: PageToken): Request[ProductstatusesListResponse]
}

object ProductstatusesResource {
  @scala.inline
  def apply(
    custombatch: IncludeAttributes => Request[ProductstatusesCustomBatchResponse],
    get: FieldsIncludeAttributes => Request[ProductStatus],
    list: PageToken => Request[ProductstatusesListResponse]
  ): ProductstatusesResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ProductstatusesResource]
  }
}

