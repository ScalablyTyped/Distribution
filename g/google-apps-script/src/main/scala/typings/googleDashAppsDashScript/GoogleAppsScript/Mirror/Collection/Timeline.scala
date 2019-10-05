package typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema.Attachment
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema.AttachmentsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.Mirror.Collection.Timeline")
@js.native
object Timeline extends js.Object {
  @js.native
  trait AttachmentsCollection extends js.Object {
    // Retrieves an attachment on a timeline item by item ID and attachment ID.
    def get(itemId: String, attachmentId: String): Attachment = js.native
    // Adds a new attachment to a timeline item.
    def insert(itemId: String): Attachment = js.native
    // Adds a new attachment to a timeline item.
    def insert(itemId: String, mediaData: js.Any): Attachment = js.native
    // Returns a list of attachments for a timeline item.
    def list(itemId: String): AttachmentsListResponse = js.native
    // Deletes an attachment from a timeline item.
    def remove(itemId: String, attachmentId: String): Unit = js.native
  }
  
}

