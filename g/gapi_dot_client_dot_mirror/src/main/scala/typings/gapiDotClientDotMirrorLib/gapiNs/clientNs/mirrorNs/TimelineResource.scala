package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TimelineResource extends js.Object {
  var attachments: AttachmentsResource
  /** Deletes a timeline item. */
  def delete(request: gapiDotClientDotMirrorLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a single timeline item by ID. */
  def get(request: gapiDotClientDotMirrorLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[TimelineItem]
  /** Inserts a new item into the timeline. */
  def insert(request: gapiDotClientDotMirrorLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[TimelineItem]
  /** Retrieves a list of timeline items for the authenticated user. */
  def list(request: gapiDotClientDotMirrorLib.Anon_BundleId): gapiDotClientLib.gapiNs.clientNs.Request[TimelineListResponse]
  /** Updates a timeline item in place. This method supports patch semantics. */
  def patch(request: gapiDotClientDotMirrorLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[TimelineItem]
  /** Updates a timeline item in place. */
  def update(request: gapiDotClientDotMirrorLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[TimelineItem]
}

