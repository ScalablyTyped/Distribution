package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineResource extends js.Object {
  var attachments: AttachmentsResource
  /** Deletes a timeline item. */
  def delete(request: gapiDotClientDotMirrorLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a single timeline item by ID. */
  def get(request: gapiDotClientDotMirrorLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[TimelineItem]
  /** Inserts a new item into the timeline. */
  def insert(request: gapiDotClientDotMirrorLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[TimelineItem]
  /** Retrieves a list of timeline items for the authenticated user. */
  def list(request: gapiDotClientDotMirrorLib.Anon_AltBundleId): gapiDotClientLib.gapiNs.clientNs.Request[TimelineListResponse]
  /** Updates a timeline item in place. This method supports patch semantics. */
  def patch(request: gapiDotClientDotMirrorLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[TimelineItem]
  /** Updates a timeline item in place. */
  def update(request: gapiDotClientDotMirrorLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[TimelineItem]
}

object TimelineResource {
  @scala.inline
  def apply(
    attachments: AttachmentsResource,
    delete: gapiDotClientDotMirrorLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotMirrorLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[TimelineItem],
    insert: gapiDotClientDotMirrorLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[TimelineItem],
    list: gapiDotClientDotMirrorLib.Anon_AltBundleId => gapiDotClientLib.gapiNs.clientNs.Request[TimelineListResponse],
    patch: gapiDotClientDotMirrorLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[TimelineItem],
    update: gapiDotClientDotMirrorLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[TimelineItem]
  ): TimelineResource = {
    val __obj = js.Dynamic.literal(attachments = attachments, delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TimelineResource]
  }
}

