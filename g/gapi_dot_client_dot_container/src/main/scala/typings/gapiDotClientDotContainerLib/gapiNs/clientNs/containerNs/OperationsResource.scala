package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Cancels the specified operation. */
  def cancel(request: gapiDotClientDotContainerLib.Anon_AccesstokenPrettyPrintBearertokenProjectId): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets the specified operation. */
  def get(request: gapiDotClientDotContainerLib.Anon_AccesstokenPrettyPrintBearertokenProjectId): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Lists all operations in a project in a specific zone or all zones. */
  def list(request: gapiDotClientDotContainerLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListOperationsResponse]
}

