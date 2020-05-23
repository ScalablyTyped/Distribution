package typings.gapiClientMirror.gapi.client.mirror

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMirror.anon.Alt
import typings.gapiClientMirror.anon.BundleId
import typings.gapiClientMirror.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineResource extends js.Object {
  var attachments: AttachmentsResource
  /** Deletes a timeline item. */
  def delete(request: Alt): Request[Unit]
  /** Gets a single timeline item by ID. */
  def get(request: Alt): Request[TimelineItem]
  /** Inserts a new item into the timeline. */
  def insert(request: Fields): Request[TimelineItem]
  /** Retrieves a list of timeline items for the authenticated user. */
  def list(request: BundleId): Request[TimelineListResponse]
  /** Updates a timeline item in place. This method supports patch semantics. */
  def patch(request: Alt): Request[TimelineItem]
  /** Updates a timeline item in place. */
  def update(request: Alt): Request[TimelineItem]
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
}

