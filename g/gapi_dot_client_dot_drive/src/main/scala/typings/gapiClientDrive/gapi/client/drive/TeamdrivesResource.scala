package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDrive.AnonQ
import typings.gapiClientDrive.AnonRequestId
import typings.gapiClientDrive.AnonTeamDriveId
import typings.gapiClientDrive.AnonUseDomainAdminAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamdrivesResource extends js.Object {
  /** Creates a new Team Drive. */
  def create(request: AnonRequestId): Request_[TeamDrive]
  /** Permanently deletes a Team Drive for which the user is an organizer. The Team Drive cannot contain any untrashed items. */
  def delete(request: AnonTeamDriveId): Request_[Unit]
  /** Gets a Team Drive's metadata by ID. */
  def get(request: AnonUseDomainAdminAccess): Request_[TeamDrive]
  /** Lists the user's Team Drives. */
  def list(request: AnonQ): Request_[TeamDriveList]
  /** Updates a Team Drive's metadata */
  def update(request: AnonTeamDriveId): Request_[TeamDrive]
}

object TeamdrivesResource {
  @scala.inline
  def apply(
    create: AnonRequestId => Request_[TeamDrive],
    delete: AnonTeamDriveId => Request_[Unit],
    get: AnonUseDomainAdminAccess => Request_[TeamDrive],
    list: AnonQ => Request_[TeamDriveList],
    update: AnonTeamDriveId => Request_[TeamDrive]
  ): TeamdrivesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TeamdrivesResource]
  }
}

