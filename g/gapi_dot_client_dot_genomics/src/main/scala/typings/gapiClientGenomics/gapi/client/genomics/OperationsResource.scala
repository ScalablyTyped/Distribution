package typings.gapiClientGenomics.gapi.client.genomics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGenomics.AnonAccesstokenAltBearertokenCallbackFieldsFilter
import typings.gapiClientGenomics.AnonAccesstokenAltBearertokenCallbackFieldsKeyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /**
    * Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed.
    * Clients may use Operations.GetOperation or Operations.ListOperations to check whether the cancellation succeeded or the operation completed despite
    * cancellation.
    */
  def cancel(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyName): Request_[js.Object]
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyName): Request_[Operation]
  /** Lists operations that match the specified filter in the request. */
  def list(request: AnonAccesstokenAltBearertokenCallbackFieldsFilter): Request_[ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: AnonAccesstokenAltBearertokenCallbackFieldsKeyName => Request_[js.Object],
    get: AnonAccesstokenAltBearertokenCallbackFieldsKeyName => Request_[Operation],
    list: AnonAccesstokenAltBearertokenCallbackFieldsFilter => Request_[ListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

