package typings.gapiDotClientDotMirror.gapiNs.clientNs.mirrorNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotMirror.Anon_AltAttachmentId
import typings.gapiDotClientDotMirror.Anon_AltFieldsItemId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsResource extends js.Object {
  /** Deletes an attachment from a timeline item. */
  def delete(request: Anon_AltAttachmentId): Request[Unit]
  /** Retrieves an attachment on a timeline item by item ID and attachment ID. */
  def get(request: Anon_AltAttachmentId): Request[Attachment]
  /** Adds a new attachment to a timeline item. */
  def insert(request: Anon_AltFieldsItemId): Request[Attachment]
  /** Returns a list of attachments for a timeline item. */
  def list(request: Anon_AltFieldsItemId): Request[AttachmentsListResponse]
}

object AttachmentsResource {
  @scala.inline
  def apply(
    delete: Anon_AltAttachmentId => Request[Unit],
    get: Anon_AltAttachmentId => Request[Attachment],
    insert: Anon_AltFieldsItemId => Request[Attachment],
    list: Anon_AltFieldsItemId => Request[AttachmentsListResponse]
  ): AttachmentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AttachmentsResource]
  }
}

