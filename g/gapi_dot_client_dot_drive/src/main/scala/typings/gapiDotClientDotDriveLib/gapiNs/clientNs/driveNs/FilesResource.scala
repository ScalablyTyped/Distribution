package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesResource extends js.Object {
  /** Creates a copy of a file and applies any requested updates with patch semantics. */
  def copy(request: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdIgnoreDefaultVisibility): gapiDotClientLib.gapiNs.clientNs.Request[File]
  /** Creates a new file. */
  def create(request: gapiDotClientDotDriveLib.Anon_AltFieldsIgnoreDefaultVisibility): gapiDotClientLib.gapiNs.clientNs.Request[File]
  /**
    * Permanently deletes a file owned by the user without moving it to the trash. If the file belongs to a Team Drive the user must be an organizer on the
    * parent. If the target is a folder, all descendants owned by the user are also deleted.
    */
  def delete(request: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Permanently deletes all of the user's trashed files. */
  def emptyTrash(request: gapiDotClientDotDriveLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Exports a Google Doc to the requested MIME type and returns the exported content. Please note that the exported content is limited to 10MB. */
  def export(request: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyMimeType): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Generates a set of file IDs which can be provided in create requests. */
  def generateIds(request: gapiDotClientDotDriveLib.Anon_AltCount): gapiDotClientLib.gapiNs.clientNs.Request[GeneratedIds]
  /** Gets a file's metadata or content by ID. */
  def get(request: gapiDotClientDotDriveLib.Anon_AcknowledgeAbuse): gapiDotClientLib.gapiNs.clientNs.Request[File]
  /** Lists or searches files. */
  def list(request: gapiDotClientDotDriveLib.Anon_AltCorpora): gapiDotClientLib.gapiNs.clientNs.Request[FileList]
  /** Updates a file's metadata and/or content with patch semantics. */
  def update(request: gapiDotClientDotDriveLib.Anon_AddParents): gapiDotClientLib.gapiNs.clientNs.Request[File]
  /** Subscribes to changes to a file */
  def watch(request: gapiDotClientDotDriveLib.Anon_AcknowledgeAbuse): gapiDotClientLib.gapiNs.clientNs.Request[Channel]
}

object FilesResource {
  @scala.inline
  def apply(
    copy: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltFieldsFileIdIgnoreDefaultVisibility, 
      gapiDotClientLib.gapiNs.clientNs.Request[File]
    ],
    create: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltFieldsIgnoreDefaultVisibility, 
      gapiDotClientLib.gapiNs.clientNs.Request[File]
    ],
    delete: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    emptyTrash: js.Function1[
      gapiDotClientDotDriveLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    export: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyMimeType, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    generateIds: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltCount, 
      gapiDotClientLib.gapiNs.clientNs.Request[GeneratedIds]
    ],
    get: js.Function1[
      gapiDotClientDotDriveLib.Anon_AcknowledgeAbuse, 
      gapiDotClientLib.gapiNs.clientNs.Request[File]
    ],
    list: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltCorpora, 
      gapiDotClientLib.gapiNs.clientNs.Request[FileList]
    ],
    update: js.Function1[
      gapiDotClientDotDriveLib.Anon_AddParents, 
      gapiDotClientLib.gapiNs.clientNs.Request[File]
    ],
    watch: js.Function1[
      gapiDotClientDotDriveLib.Anon_AcknowledgeAbuse, 
      gapiDotClientLib.gapiNs.clientNs.Request[Channel]
    ]
  ): FilesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("emptyTrash")(emptyTrash)
    __obj.updateDynamic("export")(export)
    __obj.updateDynamic("generateIds")(generateIds)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[FilesResource]
  }
}

