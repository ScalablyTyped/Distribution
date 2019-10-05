package typings.gapiDotClientDotClouduseraccounts.gapi.client.clouduseraccounts

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotClouduseraccounts.Anon_Alt
import typings.gapiDotClientDotClouduseraccounts.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalAccountsOperationsResource extends js.Object {
  /** Deletes the specified operation resource. */
  def delete(request: Anon_Alt): Request[Unit]
  /** Retrieves the specified operation resource. */
  def get(request: Anon_Alt): Request[Operation]
  /** Retrieves the list of operation resources contained within the specified project. */
  def list(request: Anon_AltFields): Request[OperationList]
}

object GlobalAccountsOperationsResource {
  @scala.inline
  def apply(
    delete: Anon_Alt => Request[Unit],
    get: Anon_Alt => Request[Operation],
    list: Anon_AltFields => Request[OperationList]
  ): GlobalAccountsOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GlobalAccountsOperationsResource]
  }
}

