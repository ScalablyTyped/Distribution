package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDrive.anon.Q
import typings.gapiClientDrive.anon.RequestId
import typings.gapiClientDrive.anon.TeamDriveId
import typings.gapiClientDrive.anon.UseDomainAdminAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamdrivesResource extends js.Object {
  /** Creates a new Team Drive. */
  def create(request: RequestId): Request[TeamDrive]
  /** Permanently deletes a Team Drive for which the user is an organizer. The Team Drive cannot contain any untrashed items. */
  def delete(request: TeamDriveId): Request[Unit]
  /** Gets a Team Drive's metadata by ID. */
  def get(request: UseDomainAdminAccess): Request[TeamDrive]
  /** Lists the user's Team Drives. */
  def list(request: Q): Request[TeamDriveList]
  /** Updates a Team Drive's metadata */
  def update(request: TeamDriveId): Request[TeamDrive]
}

object TeamdrivesResource {
  @scala.inline
  def apply(
    create: RequestId => Request[TeamDrive],
    delete: TeamDriveId => Request[Unit],
    get: UseDomainAdminAccess => Request[TeamDrive],
    list: Q => Request[TeamDriveList],
    update: TeamDriveId => Request[TeamDrive]
  ): TeamdrivesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TeamdrivesResource]
  }
}

