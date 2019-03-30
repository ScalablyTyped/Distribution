package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.CollectionNs.TimelineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentsCollection extends js.Object {
  // Retrieves an attachment on a timeline item by item ID and attachment ID.
  def get(itemId: java.lang.String, attachmentId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Attachment = js.native
  // Adds a new attachment to a timeline item.
  def insert(itemId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Attachment = js.native
  // Adds a new attachment to a timeline item.
  def insert(itemId: java.lang.String, mediaData: js.Any): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Attachment = js.native
  // Returns a list of attachments for a timeline item.
  def list(itemId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.AttachmentsListResponse = js.native
  // Deletes an attachment from a timeline item.
  def remove(itemId: java.lang.String, attachmentId: java.lang.String): scala.Unit = js.native
}

