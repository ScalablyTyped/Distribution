package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GmailDraft extends js.Object {
  /**
         * Deletes this draft message.
         */
  def deleteDraft(): scala.Unit = js.native
  /**
         * Gets the ID of this draft message.
         */
  def getId(): java.lang.String = js.native
  /**
         * Returns a GmailMessage representing this draft.
         */
  def getMessage(): GmailMessage = js.native
  /**
         * Returns the ID of the `GmailMessage` representing this draft.
         */
  def getMessageId(): java.lang.String = js.native
  /**
         * Sends this draft email message.
         */
  def send(): GmailMessage = js.native
  /**
         * Replaces the contents of this draft message.
         */
  def update(recipient: java.lang.String, subject: java.lang.String, body: java.lang.String): GmailDraft = js.native
  /**
         * Replaces the contents of this draft message using optional arguments.
         */
  def update(
    recipient: java.lang.String,
    subject: java.lang.String,
    body: java.lang.String,
    options: GmailDraftOptions
  ): GmailDraft = js.native
}

