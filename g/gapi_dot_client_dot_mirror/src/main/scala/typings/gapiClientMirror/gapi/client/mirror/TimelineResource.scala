package typings.gapiClientMirror.gapi.client.mirror

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMirror.anon.Alt
import typings.gapiClientMirror.anon.BundleId
import typings.gapiClientMirror.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineResource extends js.Object {
  var attachments: AttachmentsResource = js.native
  /** Deletes a timeline item. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Gets a single timeline item by ID. */
  def get(request: Alt): Request[TimelineItem] = js.native
  /** Inserts a new item into the timeline. */
  def insert(request: Fields): Request[TimelineItem] = js.native
  /** Retrieves a list of timeline items for the authenticated user. */
  def list(request: BundleId): Request[TimelineListResponse] = js.native
  /** Updates a timeline item in place. This method supports patch semantics. */
  def patch(request: Alt): Request[TimelineItem] = js.native
  /** Updates a timeline item in place. */
  def update(request: Alt): Request[TimelineItem] = js.native
}

object TimelineResource {
  @scala.inline
  def apply(
    attachments: AttachmentsResource,
    delete: Alt => Request[Unit],
    get: Alt => Request[TimelineItem],
    insert: Fields => Request[TimelineItem],
    list: BundleId => Request[TimelineListResponse],
    patch: Alt => Request[TimelineItem],
    update: Alt => Request[TimelineItem]
  ): TimelineResource = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TimelineResource]
  }
  @scala.inline
  implicit class TimelineResourceOps[Self <: TimelineResource] (val x: Self) extends AnyVal {
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
    def setAttachments(value: AttachmentsResource): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: Alt => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Alt => Request[TimelineItem]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Fields => Request[TimelineItem]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: BundleId => Request[TimelineListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Alt => Request[TimelineItem]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Alt => Request[TimelineItem]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

