package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSqladmin.anon.Alt
import typings.gapiClientSqladmin.anon.Fields
import typings.gapiClientSqladmin.anon.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupRunsResource extends js.Object {
  /** Deletes the backup taken by a backup run. */
  def delete(request: Alt): Request[Operation]
  /** Retrieves a resource containing information about a backup run. */
  def get(request: Alt): Request[BackupRun]
  /** Creates a new backup run on demand. This method is applicable only to Second Generation instances. */
  def insert(request: Fields): Request[Operation]
  /** Lists all backup runs associated with a given instance and configuration in the reverse chronological order of the enqueued time. */
  def list(request: Instance): Request[BackupRunsListResponse]
}

object BackupRunsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Operation],
    get: Alt => Request[BackupRun],
    insert: Fields => Request[Operation],
    list: Instance => Request[BackupRunsListResponse]
  ): BackupRunsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BackupRunsResource]
  }
}

