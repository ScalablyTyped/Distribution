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
    delete: js.Function1[
      gapiDotClientDotClouduseraccountsLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotClouduseraccountsLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotClouduseraccountsLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[OperationList]
    ]
  ): GlobalAccountsOperationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[GlobalAccountsOperationsResource]
  }
}

