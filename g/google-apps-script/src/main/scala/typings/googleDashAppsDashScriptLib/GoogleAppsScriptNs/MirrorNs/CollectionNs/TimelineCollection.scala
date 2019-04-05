package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineCollection extends js.Object {
  var Attachments: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs.TimelineNs.AttachmentsCollection
  ] = js.native
  // Gets a single timeline item by ID.
  def get(id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.TimelineItem = js.native
  // Inserts a new item into the timeline.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.TimelineItem): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.TimelineItem = js.native
  // Inserts a new item into the timeline.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.TimelineItem,
    mediaData: js.Any
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.TimelineItem = js.native
  // Retrieves a list of timeline items for the authenticated user.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.TimelineListResponse = js.native
  // Retrieves a list of timeline items for the authenticated user.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.TimelineListResponse = js.native
  // Updates a timeline item in place. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.TimelineItem,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.TimelineItem = js.native
  // Deletes a timeline item.
  def remove(id: java.lang.String): scala.Unit = js.native
  // Updates a timeline item in place.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.TimelineItem,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.TimelineItem = js.native
  // Updates a timeline item in place.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.TimelineItem,
    id: java.lang.String,
    mediaData: js.Any
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.TimelineItem = js.native
}

