package typings.gapiClientMirror.gapi.client.mirror

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientMirror.AnonAltAttachmentId
import typings.gapiClientMirror.AnonAltFieldsItemId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsResource extends js.Object {
  /** Deletes an attachment from a timeline item. */
  def delete(request: AnonAltAttachmentId): Request_[Unit]
  /** Retrieves an attachment on a timeline item by item ID and attachment ID. */
  def get(request: AnonAltAttachmentId): Request_[Attachment]
  /** Adds a new attachment to a timeline item. */
  def insert(request: AnonAltFieldsItemId): Request_[Attachment]
  /** Returns a list of attachments for a timeline item. */
  def list(request: AnonAltFieldsItemId): Request_[AttachmentsListResponse]
}

object AttachmentsResource {
  @scala.inline
  def apply(
    delete: AnonAltAttachmentId => Request_[Unit],
    get: AnonAltAttachmentId => Request_[Attachment],
    insert: AnonAltFieldsItemId => Request_[Attachment],
    list: AnonAltFieldsItemId => Request_[AttachmentsListResponse]
  ): AttachmentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AttachmentsResource]
  }
}

