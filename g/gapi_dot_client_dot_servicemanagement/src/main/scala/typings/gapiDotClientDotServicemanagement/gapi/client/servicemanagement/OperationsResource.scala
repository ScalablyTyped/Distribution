package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotServicemanagement.Anon_Accesstoken
import typings.gapiDotClientDotServicemanagement.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: Anon_Accesstoken): Request[Operation]
  /** Lists service operations that match the specified filter in the request. */
  def list(request: Anon_AccesstokenAlt): Request[ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    get: Anon_Accesstoken => Request[Operation],
    list: Anon_AccesstokenAlt => Request[ListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

