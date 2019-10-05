package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GmailDraft extends js.Object {
  /**
    * Deletes this draft message.
    */
  def deleteDraft(): Unit = js.native
  /**
    * Gets the ID of this draft message.
    */
  def getId(): String = js.native
  /**
    * Returns a GmailMessage representing this draft.
    */
  def getMessage(): GmailMessage = js.native
  /**
    * Returns the ID of the `GmailMessage` representing this draft.
    */
  def getMessageId(): String = js.native
  /**
    * Sends this draft email message.
    */
  def send(): GmailMessage = js.native
  /**
    * Replaces the contents of this draft message.
    */
  def update(recipient: String, subject: String, body: String): GmailDraft = js.native
  /**
    * Replaces the contents of this draft message using optional arguments.
    */
  def update(recipient: String, subject: String, body: String, options: GmailAdvancedOptions): GmailDraft = js.native
}

