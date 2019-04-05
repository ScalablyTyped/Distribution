package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamdrivesCollection extends js.Object {
  // Gets a Team Drive's metadata by ID.
  def get(teamDriveId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.TeamDrive = js.native
  // Gets a Team Drive's metadata by ID.
  def get(teamDriveId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.TeamDrive = js.native
  // Creates a new Team Drive.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.TeamDrive,
    requestId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.TeamDrive = js.native
  // Lists the user's Team Drives.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.TeamDriveList = js.native
  // Lists the user's Team Drives.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.TeamDriveList = js.native
  // Permanently deletes a Team Drive for which the user is an organizer. The Team Drive cannot contain any untrashed items.
  def remove(teamDriveId: java.lang.String): scala.Unit = js.native
  // Updates a Team Drive's metadata
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.TeamDrive,
    teamDriveId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.TeamDrive = js.native
  // Updates a Team Drive's metadata
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.TeamDrive,
    teamDriveId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.TeamDrive = js.native
}

