package typings.gapiDotClientDotDrive.gapi.client.drive

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDrive.Anon_AltFieldsKey
import typings.gapiDotClientDotDrive.Anon_AltFieldsKeyOauthtoken
import typings.gapiDotClientDotDrive.Anon_AltFieldsKeyOauthtokenPageSize
import typings.gapiDotClientDotDrive.Anon_AltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamdrivesResource extends js.Object {
  /** Creates a new Team Drive. */
  def create(request: Anon_AltFieldsKey): Request[TeamDrive]
  /** Permanently deletes a Team Drive for which the user is an organizer. The Team Drive cannot contain any untrashed items. */
  def delete(request: Anon_AltFieldsKeyOauthtoken): Request[Unit]
  /** Gets a Team Drive's metadata by ID. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[TeamDrive]
  /** Lists the user's Team Drives. */
  def list(request: Anon_AltFieldsKeyOauthtokenPageSize): Request[TeamDriveList]
  /** Updates a Team Drive's metadata */
  def update(request: Anon_AltFieldsKeyOauthtoken): Request[TeamDrive]
}

object TeamdrivesResource {
  @scala.inline
  def apply(
    create: Anon_AltFieldsKey => Request[TeamDrive],
    delete: Anon_AltFieldsKeyOauthtoken => Request[Unit],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[TeamDrive],
    list: Anon_AltFieldsKeyOauthtokenPageSize => Request[TeamDriveList],
    update: Anon_AltFieldsKeyOauthtoken => Request[TeamDrive]
  ): TeamdrivesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TeamdrivesResource]
  }
}

