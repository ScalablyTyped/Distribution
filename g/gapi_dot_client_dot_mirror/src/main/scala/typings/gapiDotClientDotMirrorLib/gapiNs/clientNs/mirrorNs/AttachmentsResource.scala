package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsResource extends js.Object {
  /** Deletes an attachment from a timeline item. */
  def delete(request: gapiDotClientDotMirrorLib.Anon_AltAttachmentId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves an attachment on a timeline item by item ID and attachment ID. */
  def get(request: gapiDotClientDotMirrorLib.Anon_AltAttachmentId): gapiDotClientLib.gapiNs.clientNs.Request[Attachment]
  /** Adds a new attachment to a timeline item. */
  def insert(request: gapiDotClientDotMirrorLib.Anon_AltFieldsItemId): gapiDotClientLib.gapiNs.clientNs.Request[Attachment]
  /** Returns a list of attachments for a timeline item. */
  def list(request: gapiDotClientDotMirrorLib.Anon_AltFieldsItemId): gapiDotClientLib.gapiNs.clientNs.Request[AttachmentsListResponse]
}

object AttachmentsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotMirrorLib.Anon_AltAttachmentId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotMirrorLib.Anon_AltAttachmentId => gapiDotClientLib.gapiNs.clientNs.Request[Attachment],
    insert: gapiDotClientDotMirrorLib.Anon_AltFieldsItemId => gapiDotClientLib.gapiNs.clientNs.Request[Attachment],
    list: gapiDotClientDotMirrorLib.Anon_AltFieldsItemId => gapiDotClientLib.gapiNs.clientNs.Request[AttachmentsListResponse]
  ): AttachmentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AttachmentsResource]
  }
}

