package typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGenomics.Anon_AccesstokenAltBearertokenCallbackFieldsFilter
import typings.gapiDotClientDotGenomics.Anon_AccesstokenAltBearertokenCallbackFieldsKeyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /**
    * Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed.
    * Clients may use Operations.GetOperation or Operations.ListOperations to check whether the cancellation succeeded or the operation completed despite
    * cancellation.
    */
  def cancel(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyName): Request[js.Object]
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyName): Request[Operation]
  /** Lists operations that match the specified filter in the request. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsFilter): Request[ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: Anon_AccesstokenAltBearertokenCallbackFieldsKeyName => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallbackFieldsKeyName => Request[Operation],
    list: Anon_AccesstokenAltBearertokenCallbackFieldsFilter => Request[ListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

