package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typings.gapiClient.gapi.client.Request
import typings.gapiClientClouduseraccounts.anon.Alt
import typings.gapiClientClouduseraccounts.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalAccountsOperationsResource extends js.Object {
  /** Deletes the specified operation resource. */
  def delete(request: Alt): Request[Unit]
  /** Retrieves the specified operation resource. */
  def get(request: Alt): Request[Operation]
  /** Retrieves the list of operation resources contained within the specified project. */
  def list(request: Fields): Request[OperationList]
}

object GlobalAccountsOperationsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    get: Alt => Request[Operation],
    list: Fields => Request[OperationList]
  ): GlobalAccountsOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[GlobalAccountsOperationsResource]
  }
}

