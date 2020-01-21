package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDrive.AnonAltFieldsKey
import typings.gapiClientDrive.AnonAltFieldsKeyOauthtoken
import typings.gapiClientDrive.AnonAltFieldsKeyOauthtokenPageSize
import typings.gapiClientDrive.AnonAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamdrivesResource extends js.Object {
  /** Creates a new Team Drive. */
  def create(request: AnonAltFieldsKey): Request_[TeamDrive]
  /** Permanently deletes a Team Drive for which the user is an organizer. The Team Drive cannot contain any untrashed items. */
  def delete(request: AnonAltFieldsKeyOauthtoken): Request_[Unit]
  /** Gets a Team Drive's metadata by ID. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[TeamDrive]
  /** Lists the user's Team Drives. */
  def list(request: AnonAltFieldsKeyOauthtokenPageSize): Request_[TeamDriveList]
  /** Updates a Team Drive's metadata */
  def update(request: AnonAltFieldsKeyOauthtoken): Request_[TeamDrive]
}

object TeamdrivesResource {
  @scala.inline
  def apply(
    create: AnonAltFieldsKey => Request_[TeamDrive],
    delete: AnonAltFieldsKeyOauthtoken => Request_[Unit],
    get: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[TeamDrive],
    list: AnonAltFieldsKeyOauthtokenPageSize => Request_[TeamDriveList],
    update: AnonAltFieldsKeyOauthtoken => Request_[TeamDrive]
  ): TeamdrivesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TeamdrivesResource]
  }
}

