package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupRunsResource extends js.Object {
  /** Deletes the backup taken by a backup run. */
  def delete(request: gapiDotClientDotSqladminLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a resource containing information about a backup run. */
  def get(request: gapiDotClientDotSqladminLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[BackupRun]
  /** Creates a new backup run on demand. This method is applicable only to Second Generation instances. */
  def insert(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Lists all backup runs associated with a given instance and configuration in the reverse chronological order of the enqueued time. */
  def list(request: gapiDotClientDotSqladminLib.Anon_AltFieldsInstance): gapiDotClientLib.gapiNs.clientNs.Request[BackupRunsListResponse]
}

object BackupRunsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotSqladminLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    get: gapiDotClientDotSqladminLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[BackupRun],
    insert: gapiDotClientDotSqladminLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    list: gapiDotClientDotSqladminLib.Anon_AltFieldsInstance => gapiDotClientLib.gapiNs.clientNs.Request[BackupRunsListResponse]
  ): BackupRunsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[BackupRunsResource]
  }
}

