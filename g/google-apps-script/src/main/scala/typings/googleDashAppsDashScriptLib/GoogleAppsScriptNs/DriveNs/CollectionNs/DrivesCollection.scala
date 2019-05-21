package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrivesCollection extends js.Object {
  // Gets a shared drive's metadata by ID.
  def get(driveId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Drive = js.native
  // Gets a shared drive's metadata by ID.
  def get(driveId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Drive = js.native
  // Hides a shared drive from the default view.
  def hide(driveId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Drive = js.native
  // Creates a new shared drive.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Drive,
    requestId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Drive = js.native
  // Lists the user's shared drives.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.DriveList = js.native
  // Lists the user's shared drives.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.DriveList = js.native
  // Permanently deletes a shared drive for which the user is an organizer. The shared drive cannot contain any untrashed items.
  def remove(driveId: java.lang.String): scala.Unit = js.native
  // Restores a shared drive to the default view.
  def unhide(driveId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Drive = js.native
  // Updates the metadata for a shared drive.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Drive,
    driveId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Drive = js.native
  // Updates the metadata for a shared drive.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Drive,
    driveId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Drive = js.native
}

