package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDrive.anon.AcknowledgeAbuse
import typings.gapiClientDrive.anon.AddParents
import typings.gapiClientDrive.anon.Alt
import typings.gapiClientDrive.anon.Corpora
import typings.gapiClientDrive.anon.Count
import typings.gapiClientDrive.anon.IgnoreDefaultVisibility
import typings.gapiClientDrive.anon.KeepRevisionForever
import typings.gapiClientDrive.anon.Oauthtoken
import typings.gapiClientDrive.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesResource extends js.Object {
  /** Creates a copy of a file and applies any requested updates with patch semantics. */
  def copy(request: IgnoreDefaultVisibility): Request[File]
  /** Creates a new file. */
  def create(request: KeepRevisionForever): Request[File]
  /**
    * Permanently deletes a file owned by the user without moving it to the trash. If the file belongs to a Team Drive the user must be an organizer on the
    * parent. If the target is a folder, all descendants owned by the user are also deleted.
    */
  def delete(request: Oauthtoken): Request[Unit]
  /** Permanently deletes all of the user's trashed files. */
  def emptyTrash(request: Alt): Request[Unit]
  /** Exports a Google Doc to the requested MIME type and returns the exported content. Please note that the exported content is limited to 10MB. */
  def export(request: PrettyPrint): Request[Unit]
  /** Generates a set of file IDs which can be provided in create requests. */
  def generateIds(request: Count): Request[GeneratedIds]
  /** Gets a file's metadata or content by ID. */
  def get(request: AcknowledgeAbuse): Request[File]
  /** Lists or searches files. */
  def list(request: Corpora): Request[FileList]
  /** Updates a file's metadata and/or content with patch semantics. */
  def update(request: AddParents): Request[File]
  /** Subscribes to changes to a file */
  def watch(request: AcknowledgeAbuse): Request[Channel]
}

object FilesResource {
  @scala.inline
  def apply(
    copy: IgnoreDefaultVisibility => Request[File],
    create: KeepRevisionForever => Request[File],
    delete: Oauthtoken => Request[Unit],
    emptyTrash: Alt => Request[Unit],
    export: PrettyPrint => Request[Unit],
    generateIds: Count => Request[GeneratedIds],
    get: AcknowledgeAbuse => Request[File],
    list: Corpora => Request[FileList],
    update: AddParents => Request[File],
    watch: AcknowledgeAbuse => Request[Channel]
  ): FilesResource = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), emptyTrash = js.Any.fromFunction1(emptyTrash), export = js.Any.fromFunction1(export), generateIds = js.Any.fromFunction1(generateIds), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
    __obj.asInstanceOf[FilesResource]
  }
}

