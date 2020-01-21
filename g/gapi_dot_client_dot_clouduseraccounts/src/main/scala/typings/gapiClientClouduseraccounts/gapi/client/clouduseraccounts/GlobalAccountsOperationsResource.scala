package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClouduseraccounts.AnonAlt
import typings.gapiClientClouduseraccounts.AnonAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalAccountsOperationsResource extends js.Object {
  /** Deletes the specified operation resource. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Retrieves the specified operation resource. */
  def get(request: AnonAlt): Request_[Operation]
  /** Retrieves the list of operation resources contained within the specified project. */
  def list(request: AnonAltFields): Request_[OperationList]
}

object GlobalAccountsOperationsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    get: AnonAlt => Request_[Operation],
    list: AnonAltFields => Request_[OperationList]
  ): GlobalAccountsOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GlobalAccountsOperationsResource]
  }
}

