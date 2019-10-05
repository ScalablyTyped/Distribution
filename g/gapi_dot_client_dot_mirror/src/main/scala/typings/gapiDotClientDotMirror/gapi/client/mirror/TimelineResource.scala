package typings.gapiDotClientDotMirror.gapi.client.mirror

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotMirror.Anon_Alt
import typings.gapiDotClientDotMirror.Anon_AltBundleId
import typings.gapiDotClientDotMirror.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineResource extends js.Object {
  var attachments: AttachmentsResource
  /** Deletes a timeline item. */
  def delete(request: Anon_Alt): Request[Unit]
  /** Gets a single timeline item by ID. */
  def get(request: Anon_Alt): Request[TimelineItem]
  /** Inserts a new item into the timeline. */
  def insert(request: Anon_AltFields): Request[TimelineItem]
  /** Retrieves a list of timeline items for the authenticated user. */
  def list(request: Anon_AltBundleId): Request[TimelineListResponse]
  /** Updates a timeline item in place. This method supports patch semantics. */
  def patch(request: Anon_Alt): Request[TimelineItem]
  /** Updates a timeline item in place. */
  def update(request: Anon_Alt): Request[TimelineItem]
}

object TimelineResource {
  @scala.inline
  def apply(
    attachments: AttachmentsResource,
    delete: Anon_Alt => Request[Unit],
    get: Anon_Alt => Request[TimelineItem],
    insert: Anon_AltFields => Request[TimelineItem],
    list: Anon_AltBundleId => Request[TimelineListResponse],
    patch: Anon_Alt => Request[TimelineItem],
    update: Anon_Alt => Request[TimelineItem]
  ): TimelineResource = {
    val __obj = js.Dynamic.literal(attachments = attachments, delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TimelineResource]
  }
}

