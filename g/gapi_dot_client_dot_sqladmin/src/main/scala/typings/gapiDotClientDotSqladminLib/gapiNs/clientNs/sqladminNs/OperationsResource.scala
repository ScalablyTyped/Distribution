package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Retrieves an instance operation that has been performed on an instance. */
  def get(request: gapiDotClientDotSqladminLib.Anon_ProjectPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Lists all instance operations that have been performed on the given Cloud SQL instance in the reverse chronological order of the start time. */
  def list(request: gapiDotClientDotSqladminLib.Anon_ProjectMaxResultsPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[OperationsListResponse]
}

