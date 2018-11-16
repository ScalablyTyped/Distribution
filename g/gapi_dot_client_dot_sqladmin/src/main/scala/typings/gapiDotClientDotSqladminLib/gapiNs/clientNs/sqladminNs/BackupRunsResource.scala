package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BackupRunsResource extends js.Object {
  /** Deletes the backup taken by a backup run. */
  def delete(request: gapiDotClientDotSqladminLib.Anon_ProjectPrettyPrintInstanceQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a resource containing information about a backup run. */
  def get(request: gapiDotClientDotSqladminLib.Anon_ProjectPrettyPrintInstanceQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[BackupRun]
  /** Creates a new backup run on demand. This method is applicable only to Second Generation instances. */
  def insert(request: gapiDotClientDotSqladminLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Lists all backup runs associated with a given instance and configuration in the reverse chronological order of the enqueued time. */
  def list(request: gapiDotClientDotSqladminLib.Anon_ProjectMaxResultsPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[BackupRunsListResponse]
}

