package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesCollection extends js.Object {
  // Creates a copy of the specified file.
  def copy(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File,
    fileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Creates a copy of the specified file.
  def copy(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File,
    fileId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Permanently deletes all of the user's trashed files.
  def emptyTrash(): scala.Unit = js.native
  // Exports a Google Doc to the requested MIME type and returns the exported content. Please note that the exported content is limited to 10MB.
  def export(fileId: java.lang.String, mimeType: java.lang.String): scala.Unit = js.native
  // Generates a set of file IDs which can be provided in insert requests.
  def generateIds(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.GeneratedIds = js.native
  // Generates a set of file IDs which can be provided in insert requests.
  def generateIds(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.GeneratedIds = js.native
  // Gets a file's metadata by ID.
  def get(fileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Gets a file's metadata by ID.
  def get(fileId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Insert a new file.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Insert a new file.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File,
    mediaData: js.Any
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Insert a new file.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File,
    mediaData: js.Any,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Lists the user's files.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.FileList = js.native
  // Lists the user's files.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.FileList = js.native
  // Updates file metadata and/or content. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File,
    fileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Updates file metadata and/or content. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File,
    fileId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Permanently deletes a file by ID. Skips the trash. The currently authenticated user must own the file or be an organizer on the parent for Team Drive files.
  def remove(fileId: java.lang.String): scala.Unit = js.native
  // Permanently deletes a file by ID. Skips the trash. The currently authenticated user must own the file or be an organizer on the parent for Team Drive files.
  def remove(fileId: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
  // Set the file's updated time to the current server time.
  def touch(fileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Set the file's updated time to the current server time.
  def touch(fileId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Moves a file to the trash. The currently authenticated user must own the file or be at least a fileOrganizer on the parent for Team Drive files.
  def trash(fileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Moves a file to the trash. The currently authenticated user must own the file or be at least a fileOrganizer on the parent for Team Drive files.
  def trash(fileId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Restores a file from the trash.
  def untrash(fileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Restores a file from the trash.
  def untrash(fileId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Updates file metadata and/or content.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File,
    fileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Updates file metadata and/or content.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File,
    fileId: java.lang.String,
    mediaData: js.Any
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Updates file metadata and/or content.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File,
    fileId: java.lang.String,
    mediaData: js.Any,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.File = js.native
  // Subscribe to changes on a file
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.Channel,
    fileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.Channel = js.native
  // Subscribe to changes on a file
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.Channel,
    fileId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.Channel = js.native
}

