package typings.gapiClientMirror.gapi.client.mirror

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMirror.anon.AttachmentId
import typings.gapiClientMirror.anon.ItemId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentsResource extends js.Object {
  /** Deletes an attachment from a timeline item. */
  def delete(request: AttachmentId): Request[Unit] = js.native
  /** Retrieves an attachment on a timeline item by item ID and attachment ID. */
  def get(request: AttachmentId): Request[Attachment] = js.native
  /** Adds a new attachment to a timeline item. */
  def insert(request: ItemId): Request[Attachment] = js.native
  /** Returns a list of attachments for a timeline item. */
  def list(request: ItemId): Request[AttachmentsListResponse] = js.native
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
  @scala.inline
  implicit class AttachmentsResourceOps[Self <: AttachmentsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: AttachmentId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: AttachmentId => Request[Attachment]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: ItemId => Request[Attachment]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: ItemId => Request[AttachmentsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

