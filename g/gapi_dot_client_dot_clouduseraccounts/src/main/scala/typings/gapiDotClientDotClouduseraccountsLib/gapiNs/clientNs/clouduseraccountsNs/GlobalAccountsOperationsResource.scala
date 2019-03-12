package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalAccountsOperationsResource extends js.Object {
  /** Deletes the specified operation resource. */
  def delete(request: gapiDotClientDotClouduseraccountsLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves the specified operation resource. */
  def get(request: gapiDotClientDotClouduseraccountsLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of operation resources contained within the specified project. */
  def list(request: gapiDotClientDotClouduseraccountsLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[OperationList]
}

object GlobalAccountsOperationsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotClouduseraccountsLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotClouduseraccountsLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    list: gapiDotClientDotClouduseraccountsLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[OperationList]
  ): GlobalAccountsOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GlobalAccountsOperationsResource]
  }
}

