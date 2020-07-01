package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDrive.anon.AcknowledgeAbuse
import typings.gapiClientDrive.anon.AddParents
import typings.gapiClientDrive.anon.Alt
import typings.gapiClientDrive.anon.AltFields
import typings.gapiClientDrive.anon.Corpora
import typings.gapiClientDrive.anon.Count
import typings.gapiClientDrive.anon.EnforceSingleParent
import typings.gapiClientDrive.anon.IgnoreDefaultVisibility
import typings.gapiClientDrive.anon.KeepRevisionForever
import typings.gapiClientDrive.anon.OcrLanguage
import typings.gapiClientDrive.anon.RemoveParents
import typings.gapiClientDrive.anon.SupportsAllDrives
import typings.gapiClientDrive.anon.SupportsTeamDrives
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesResource extends js.Object {
  /** Creates a copy of a file and applies any requested updates with patch semantics. */
  def copy(request: EnforceSingleParent): Request[File] = js.native
  def copy(request: IgnoreDefaultVisibility, body: File): Request[File] = js.native
  /** Creates a new file. */
  def create(request: KeepRevisionForever): Request[File] = js.native
  def create(request: OcrLanguage, body: File): Request[File] = js.native
  /**
    * Permanently deletes a file owned by the user without moving it to the trash. If the file belongs to a shared drive the user must be an organizer on the
    * parent. If the target is a folder, all descendants owned by the user are also deleted.
    */
  def delete(): Request[Unit] = js.native
  def delete(request: SupportsAllDrives): Request[Unit] = js.native
  /** Permanently deletes all of the user's trashed files. */
  def emptyTrash(): Request[Unit] = js.native
  def emptyTrash(request: Alt): Request[Unit] = js.native
  /** Exports a Google Doc to the requested MIME type and returns the exported content. Please note that the exported content is limited to 10MB. */
  def export(): Request[Unit] = js.native
  def export(request: AltFields): Request[Unit] = js.native
  /** Generates a set of file IDs which can be provided in create or copy requests. */
  def generateIds(): Request[GeneratedIds] = js.native
  def generateIds(request: Count): Request[GeneratedIds] = js.native
  /** Gets a file's metadata or content by ID. */
  def get(): Request[File] = js.native
  def get(request: AcknowledgeAbuse): Request[File] = js.native
  /** Lists or searches files. */
  def list(): Request[FileList] = js.native
  def list(request: Corpora): Request[FileList] = js.native
  /** Updates a file's metadata and/or content with patch semantics. */
  def update(request: AddParents): Request[File] = js.native
  def update(request: RemoveParents, body: File): Request[File] = js.native
  def watch(request: AcknowledgeAbuse, body: Channel): Request[Channel] = js.native
  /** Subscribes to changes to a file */
  def watch(request: SupportsTeamDrives): Request[Channel] = js.native
}

