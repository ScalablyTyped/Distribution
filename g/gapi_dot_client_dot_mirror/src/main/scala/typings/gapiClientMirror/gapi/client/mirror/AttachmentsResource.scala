package typings.gapiClientMirror.gapi.client.mirror

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMirror.anon.AttachmentId
import typings.gapiClientMirror.anon.ItemId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsResource extends js.Object {
  /** Deletes an attachment from a timeline item. */
  def delete(request: AttachmentId): Request[Unit]
  /** Retrieves an attachment on a timeline item by item ID and attachment ID. */
  def get(request: AttachmentId): Request[Attachment]
  /** Adds a new attachment to a timeline item. */
  def insert(request: ItemId): Request[Attachment]
  /** Returns a list of attachments for a timeline item. */
  def list(request: ItemId): Request[AttachmentsListResponse]
}

object AttachmentsResource {
  @scala.inline
  def apply(
    delete: AttachmentId => Request[Unit],
    get: AttachmentId => Request[Attachment],
    insert: ItemId => Request[Attachment],
    list: ItemId => Request[AttachmentsListResponse]
  ): AttachmentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AttachmentsResource]
  }
}

