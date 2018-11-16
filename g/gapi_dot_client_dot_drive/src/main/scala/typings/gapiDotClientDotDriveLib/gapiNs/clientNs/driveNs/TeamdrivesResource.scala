package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TeamdrivesResource extends js.Object {
  /** Creates a new Team Drive. */
  def create(request: gapiDotClientDotDriveLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[TeamDrive]
  /** Permanently deletes a Team Drive for which the user is an organizer. The Team Drive cannot contain any untrashed items. */
  def delete(request: gapiDotClientDotDriveLib.Anon_PrettyPrintQuotaUserKeyTeamDriveId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a Team Drive's metadata by ID. */
  def get(request: gapiDotClientDotDriveLib.Anon_PrettyPrintQuotaUserKeyTeamDriveIdUserIp): gapiDotClientLib.gapiNs.clientNs.Request[TeamDrive]
  /** Lists the user's Team Drives. */
  def list(request: gapiDotClientDotDriveLib.Anon_PageSizePrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[TeamDriveList]
  /** Updates a Team Drive's metadata */
  def update(request: gapiDotClientDotDriveLib.Anon_PrettyPrintQuotaUserKeyTeamDriveId): gapiDotClientLib.gapiNs.clientNs.Request[TeamDrive]
}

