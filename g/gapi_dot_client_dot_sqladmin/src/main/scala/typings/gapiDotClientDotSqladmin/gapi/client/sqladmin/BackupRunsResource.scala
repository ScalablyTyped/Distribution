package typings.gapiDotClientDotSqladmin.gapi.client.sqladmin

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotSqladmin.Anon_Alt
import typings.gapiDotClientDotSqladmin.Anon_AltFields
import typings.gapiDotClientDotSqladmin.Anon_AltFieldsInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupRunsResource extends js.Object {
  /** Deletes the backup taken by a backup run. */
  def delete(request: Anon_Alt): Request[Operation]
  /** Retrieves a resource containing information about a backup run. */
  def get(request: Anon_Alt): Request[BackupRun]
  /** Creates a new backup run on demand. This method is applicable only to Second Generation instances. */
  def insert(request: Anon_AltFields): Request[Operation]
  /** Lists all backup runs associated with a given instance and configuration in the reverse chronological order of the enqueued time. */
  def list(request: Anon_AltFieldsInstance): Request[BackupRunsListResponse]
}

object BackupRunsResource {
  @scala.inline
  def apply(
    delete: Anon_Alt => Request[Operation],
    get: Anon_Alt => Request[BackupRun],
    insert: Anon_AltFields => Request[Operation],
    list: Anon_AltFieldsInstance => Request[BackupRunsListResponse]
  ): BackupRunsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[BackupRunsResource]
  }
}

