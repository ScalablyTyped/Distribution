package typings.gapiDotClientDotCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCloudresourcemanager.Anon_AccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: Anon_AccesstokenAltBearertoken): Request[Operation]
}

object OperationsResource {
  @scala.inline
  def apply(get: Anon_AccesstokenAltBearertoken => Request[Operation]): OperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

