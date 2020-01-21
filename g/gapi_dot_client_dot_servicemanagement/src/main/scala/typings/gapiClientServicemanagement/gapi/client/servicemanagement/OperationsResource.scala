package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientServicemanagement.AnonAccesstoken
import typings.gapiClientServicemanagement.AnonAccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: AnonAccesstoken): Request_[Operation]
  /** Lists service operations that match the specified filter in the request. */
  def list(request: AnonAccesstokenAlt): Request_[ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    get: AnonAccesstoken => Request_[Operation],
    list: AnonAccesstokenAlt => Request_[ListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

