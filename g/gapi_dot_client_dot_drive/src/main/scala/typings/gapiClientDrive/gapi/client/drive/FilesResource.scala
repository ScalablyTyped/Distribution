package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDrive.AnonAcknowledgeAbuse
import typings.gapiClientDrive.AnonAddParents
import typings.gapiClientDrive.AnonAlt
import typings.gapiClientDrive.AnonCorpora
import typings.gapiClientDrive.AnonCount
import typings.gapiClientDrive.AnonIgnoreDefaultVisibility
import typings.gapiClientDrive.AnonKeepRevisionForever
import typings.gapiClientDrive.AnonOauthtoken
import typings.gapiClientDrive.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesResource extends js.Object {
  /** Creates a copy of a file and applies any requested updates with patch semantics. */
  def copy(request: AnonIgnoreDefaultVisibility): Request_[File]
  /** Creates a new file. */
  def create(request: AnonKeepRevisionForever): Request_[File]
  /**
    * Permanently deletes a file owned by the user without moving it to the trash. If the file belongs to a Team Drive the user must be an organizer on the
    * parent. If the target is a folder, all descendants owned by the user are also deleted.
    */
  def delete(request: AnonOauthtoken): Request_[Unit]
  /** Permanently deletes all of the user's trashed files. */
  def emptyTrash(request: AnonAlt): Request_[Unit]
  /** Exports a Google Doc to the requested MIME type and returns the exported content. Please note that the exported content is limited to 10MB. */
  def export(request: AnonPrettyPrint): Request_[Unit]
  /** Generates a set of file IDs which can be provided in create requests. */
  def generateIds(request: AnonCount): Request_[GeneratedIds]
  /** Gets a file's metadata or content by ID. */
  def get(request: AnonAcknowledgeAbuse): Request_[File]
  /** Lists or searches files. */
  def list(request: AnonCorpora): Request_[FileList]
  /** Updates a file's metadata and/or content with patch semantics. */
  def update(request: AnonAddParents): Request_[File]
  /** Subscribes to changes to a file */
  def watch(request: AnonAcknowledgeAbuse): Request_[Channel]
}

object FilesResource {
  @scala.inline
  def apply(
    copy: AnonIgnoreDefaultVisibility => Request_[File],
    create: AnonKeepRevisionForever => Request_[File],
    delete: AnonOauthtoken => Request_[Unit],
    emptyTrash: AnonAlt => Request_[Unit],
    export: AnonPrettyPrint => Request_[Unit],
    generateIds: AnonCount => Request_[GeneratedIds],
    get: AnonAcknowledgeAbuse => Request_[File],
    list: AnonCorpora => Request_[FileList],
    update: AnonAddParents => Request_[File],
    watch: AnonAcknowledgeAbuse => Request_[Channel]
  ): FilesResource = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), emptyTrash = js.Any.fromFunction1(emptyTrash), export = js.Any.fromFunction1(export), generateIds = js.Any.fromFunction1(generateIds), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[FilesResource]
  }
}

