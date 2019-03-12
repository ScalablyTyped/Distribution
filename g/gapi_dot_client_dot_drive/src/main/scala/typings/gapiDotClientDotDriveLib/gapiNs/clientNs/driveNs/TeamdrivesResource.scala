package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamdrivesResource extends js.Object {
  /** Creates a new Team Drive. */
  def create(request: gapiDotClientDotDriveLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[TeamDrive]
  /** Permanently deletes a Team Drive for which the user is an organizer. The Team Drive cannot contain any untrashed items. */
  def delete(request: gapiDotClientDotDriveLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a Team Drive's metadata by ID. */
  def get(request: gapiDotClientDotDriveLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[TeamDrive]
  /** Lists the user's Team Drives. */
  def list(request: gapiDotClientDotDriveLib.Anon_AltFieldsKeyOauthtokenPageSize): gapiDotClientLib.gapiNs.clientNs.Request[TeamDriveList]
  /** Updates a Team Drive's metadata */
  def update(request: gapiDotClientDotDriveLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[TeamDrive]
}

object TeamdrivesResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotDriveLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[TeamDrive],
    delete: gapiDotClientDotDriveLib.Anon_AltFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotDriveLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[TeamDrive],
    list: gapiDotClientDotDriveLib.Anon_AltFieldsKeyOauthtokenPageSize => gapiDotClientLib.gapiNs.clientNs.Request[TeamDriveList],
    update: gapiDotClientDotDriveLib.Anon_AltFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[TeamDrive]
  ): TeamdrivesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TeamdrivesResource]
  }
}

