package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.TeamDrive
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.TeamDriveList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamdrivesCollection extends js.Object {
  // Gets a Team Drive's metadata by ID.
  def get(teamDriveId: String): TeamDrive = js.native
  // Gets a Team Drive's metadata by ID.
  def get(teamDriveId: String, optionalArgs: js.Object): TeamDrive = js.native
  // Creates a new Team Drive.
  def insert(resource: TeamDrive, requestId: String): TeamDrive = js.native
  // Lists the user's Team Drives.
  def list(): TeamDriveList = js.native
  // Lists the user's Team Drives.
  def list(optionalArgs: js.Object): TeamDriveList = js.native
  // Permanently deletes a Team Drive for which the user is an organizer. The Team Drive cannot contain any untrashed items.
  def remove(teamDriveId: String): Unit = js.native
  // Updates a Team Drive's metadata
  def update(resource: TeamDrive, teamDriveId: String): TeamDrive = js.native
  // Updates a Team Drive's metadata
  def update(resource: TeamDrive, teamDriveId: String, optionalArgs: js.Object): TeamDrive = js.native
}

