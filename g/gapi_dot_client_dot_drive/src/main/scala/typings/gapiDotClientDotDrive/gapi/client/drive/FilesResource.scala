package typings.gapiDotClientDotDrive.gapi.client.drive

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDrive.Anon_AcknowledgeAbuse
import typings.gapiDotClientDotDrive.Anon_AddParents
import typings.gapiDotClientDotDrive.Anon_Alt
import typings.gapiDotClientDotDrive.Anon_AltCorpora
import typings.gapiDotClientDotDrive.Anon_AltCount
import typings.gapiDotClientDotDrive.Anon_AltFieldsFileIdIgnoreDefaultVisibility
import typings.gapiDotClientDotDrive.Anon_AltFieldsFileIdKey
import typings.gapiDotClientDotDrive.Anon_AltFieldsFileIdKeyMimeType
import typings.gapiDotClientDotDrive.Anon_AltFieldsIgnoreDefaultVisibility
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesResource extends js.Object {
  /** Creates a copy of a file and applies any requested updates with patch semantics. */
  def copy(request: Anon_AltFieldsFileIdIgnoreDefaultVisibility): Request[File]
  /** Creates a new file. */
  def create(request: Anon_AltFieldsIgnoreDefaultVisibility): Request[File]
  /**
    * Permanently deletes a file owned by the user without moving it to the trash. If the file belongs to a Team Drive the user must be an organizer on the
    * parent. If the target is a folder, all descendants owned by the user are also deleted.
    */
  def delete(request: Anon_AltFieldsFileIdKey): Request[Unit]
  /** Permanently deletes all of the user's trashed files. */
  def emptyTrash(request: Anon_Alt): Request[Unit]
  /** Exports a Google Doc to the requested MIME type and returns the exported content. Please note that the exported content is limited to 10MB. */
  def export(request: Anon_AltFieldsFileIdKeyMimeType): Request[Unit]
  /** Generates a set of file IDs which can be provided in create requests. */
  def generateIds(request: Anon_AltCount): Request[GeneratedIds]
  /** Gets a file's metadata or content by ID. */
  def get(request: Anon_AcknowledgeAbuse): Request[File]
  /** Lists or searches files. */
  def list(request: Anon_AltCorpora): Request[FileList]
  /** Updates a file's metadata and/or content with patch semantics. */
  def update(request: Anon_AddParents): Request[File]
  /** Subscribes to changes to a file */
  def watch(request: Anon_AcknowledgeAbuse): Request[Channel]
}

object FilesResource {
  @scala.inline
  def apply(
    copy: Anon_AltFieldsFileIdIgnoreDefaultVisibility => Request[File],
    create: Anon_AltFieldsIgnoreDefaultVisibility => Request[File],
    delete: Anon_AltFieldsFileIdKey => Request[Unit],
    emptyTrash: Anon_Alt => Request[Unit],
    export: Anon_AltFieldsFileIdKeyMimeType => Request[Unit],
    generateIds: Anon_AltCount => Request[GeneratedIds],
    get: Anon_AcknowledgeAbuse => Request[File],
    list: Anon_AltCorpora => Request[FileList],
    update: Anon_AddParents => Request[File],
    watch: Anon_AcknowledgeAbuse => Request[Channel]
  ): FilesResource = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), emptyTrash = js.Any.fromFunction1(emptyTrash), export = js.Any.fromFunction1(export), generateIds = js.Any.fromFunction1(generateIds), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[FilesResource]
  }
}

