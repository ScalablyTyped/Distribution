package typings.googleAppsScript.GoogleAppsScript.Drive.Collection

import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Channel
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.FileList
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.GeneratedIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesCollection extends js.Object {
  
  // Creates a copy of the specified file.
  def copy(resource: File, fileId: String): File = js.native
  // Creates a copy of the specified file.
  def copy(resource: File, fileId: String, optionalArgs: js.Object): File = js.native
  
  // Permanently deletes all of the user's trashed files.
  def emptyTrash(): Unit = js.native
  
  // Exports a Google Doc to the requested MIME type and returns the exported content. Please note that the exported content is limited to 10MB.
  def export(fileId: String, mimeType: String): Unit = js.native
  
  // Generates a set of file IDs which can be provided in insert requests.
  def generateIds(): GeneratedIds = js.native
  // Generates a set of file IDs which can be provided in insert requests.
  def generateIds(optionalArgs: js.Object): GeneratedIds = js.native
  
  // Gets a file's metadata by ID.
  def get(fileId: String): File = js.native
  // Gets a file's metadata by ID.
  def get(fileId: String, optionalArgs: js.Object): File = js.native
  
  // Insert a new file.
  def insert(resource: File): File = js.native
  // Insert a new file.
  def insert(resource: File, mediaData: js.Any): File = js.native
  // Insert a new file.
  def insert(resource: File, mediaData: js.Any, optionalArgs: js.Object): File = js.native
  
  // Lists the user's files.
  def list(): FileList = js.native
  // Lists the user's files.
  def list(optionalArgs: js.Object): FileList = js.native
  
  // Updates file metadata and/or content. This method supports patch semantics.
  def patch(resource: File, fileId: String): File = js.native
  // Updates file metadata and/or content. This method supports patch semantics.
  def patch(resource: File, fileId: String, optionalArgs: js.Object): File = js.native
  
  // Permanently deletes a file by ID. Skips the trash. The currently authenticated user must own the file or be an organizer on the parent for Team Drive files.
  def remove(fileId: String): Unit = js.native
  // Permanently deletes a file by ID. Skips the trash. The currently authenticated user must own the file or be an organizer on the parent for Team Drive files.
  def remove(fileId: String, optionalArgs: js.Object): Unit = js.native
  
  // Set the file's updated time to the current server time.
  def touch(fileId: String): File = js.native
  // Set the file's updated time to the current server time.
  def touch(fileId: String, optionalArgs: js.Object): File = js.native
  
  // Moves a file to the trash. The currently authenticated user must own the file or be at least a fileOrganizer on the parent for Team Drive files.
  def trash(fileId: String): File = js.native
  // Moves a file to the trash. The currently authenticated user must own the file or be at least a fileOrganizer on the parent for Team Drive files.
  def trash(fileId: String, optionalArgs: js.Object): File = js.native
  
  // Restores a file from the trash.
  def untrash(fileId: String): File = js.native
  // Restores a file from the trash.
  def untrash(fileId: String, optionalArgs: js.Object): File = js.native
  
  // Updates file metadata and/or content.
  def update(resource: File, fileId: String): File = js.native
  // Updates file metadata and/or content.
  def update(resource: File, fileId: String, mediaData: js.Any): File = js.native
  // Updates file metadata and/or content.
  def update(resource: File, fileId: String, mediaData: js.Any, optionalArgs: js.Object): File = js.native
  
  // Subscribe to changes on a file
  def watch(resource: Channel, fileId: String): Channel = js.native
  // Subscribe to changes on a file
  def watch(resource: Channel, fileId: String, optionalArgs: js.Object): Channel = js.native
}
