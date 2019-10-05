package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.DriveList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrivesCollection extends js.Object {
  // Gets a shared drive's metadata by ID.
  def get(driveId: String): typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Drive = js.native
  // Gets a shared drive's metadata by ID.
  def get(driveId: String, optionalArgs: js.Object): typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Drive = js.native
  // Hides a shared drive from the default view.
  def hide(driveId: String): typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Drive = js.native
  // Creates a new shared drive.
  def insert(resource: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Drive, requestId: String): typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Drive = js.native
  // Lists the user's shared drives.
  def list(): DriveList = js.native
  // Lists the user's shared drives.
  def list(optionalArgs: js.Object): DriveList = js.native
  // Permanently deletes a shared drive for which the user is an organizer. The shared drive cannot contain any untrashed items.
  def remove(driveId: String): Unit = js.native
  // Restores a shared drive to the default view.
  def unhide(driveId: String): typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Drive = js.native
  // Updates the metadata for a shared drive.
  def update(resource: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Drive, driveId: String): typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Drive = js.native
  // Updates the metadata for a shared drive.
  def update(
    resource: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Drive,
    driveId: String,
    optionalArgs: js.Object
  ): typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Drive = js.native
}

