package typings.gapiClientMirror.gapi.client.mirror

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientMirror.AnonAlt
import typings.gapiClientMirror.AnonBundleId
import typings.gapiClientMirror.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineResource extends js.Object {
  var attachments: AttachmentsResource
  /** Deletes a timeline item. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Gets a single timeline item by ID. */
  def get(request: AnonAlt): Request_[TimelineItem]
  /** Inserts a new item into the timeline. */
  def insert(request: AnonFields): Request_[TimelineItem]
  /** Retrieves a list of timeline items for the authenticated user. */
  def list(request: AnonBundleId): Request_[TimelineListResponse]
  /** Updates a timeline item in place. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[TimelineItem]
  /** Updates a timeline item in place. */
  def update(request: AnonAlt): Request_[TimelineItem]
}

object TimelineResource {
  @scala.inline
  def apply(
    attachments: AttachmentsResource,
    delete: AnonAlt => Request_[Unit],
    get: AnonAlt => Request_[TimelineItem],
    insert: AnonFields => Request_[TimelineItem],
    list: AnonBundleId => Request_[TimelineListResponse],
    patch: AnonAlt => Request_[TimelineItem],
    update: AnonAlt => Request_[TimelineItem]
  ): TimelineResource = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TimelineResource]
  }
}

