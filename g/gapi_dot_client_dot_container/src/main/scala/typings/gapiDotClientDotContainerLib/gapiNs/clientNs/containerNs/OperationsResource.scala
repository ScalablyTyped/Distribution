package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Cancels the specified operation. */
  def cancel(request: gapiDotClientDotContainerLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets the specified operation. */
  def get(request: gapiDotClientDotContainerLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Lists all operations in a project in a specific zone or all zones. */
  def list(request: gapiDotClientDotContainerLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListOperationsResponse]
    ]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = cancel, get = get, list = list)
  
    __obj.asInstanceOf[OperationsResource]
  }
}

