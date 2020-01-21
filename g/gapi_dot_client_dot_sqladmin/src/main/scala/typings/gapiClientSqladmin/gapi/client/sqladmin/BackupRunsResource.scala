package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSqladmin.AnonAlt
import typings.gapiClientSqladmin.AnonAltFields
import typings.gapiClientSqladmin.AnonAltFieldsInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupRunsResource extends js.Object {
  /** Deletes the backup taken by a backup run. */
  def delete(request: AnonAlt): Request_[Operation]
  /** Retrieves a resource containing information about a backup run. */
  def get(request: AnonAlt): Request_[BackupRun]
  /** Creates a new backup run on demand. This method is applicable only to Second Generation instances. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Lists all backup runs associated with a given instance and configuration in the reverse chronological order of the enqueued time. */
  def list(request: AnonAltFieldsInstance): Request_[BackupRunsListResponse]
}

object BackupRunsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Operation],
    get: AnonAlt => Request_[BackupRun],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAltFieldsInstance => Request_[BackupRunsListResponse]
  ): BackupRunsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[BackupRunsResource]
  }
}

