package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Collection.Users

import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Collection.Users.Messages.AttachmentsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.BatchDeleteMessagesRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.BatchModifyMessagesRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.ListMessagesResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.Message
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.ModifyMessageRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagesCollection extends js.Object {
  var Attachments: js.UndefOr[AttachmentsCollection] = js.native
  // Deletes many messages by message ID. Provides no guarantees that messages were not already deleted or even existed at all.
  def batchDelete(resource: BatchDeleteMessagesRequest, userId: String): Unit = js.native
  // Modifies the labels on the specified messages.
  def batchModify(resource: BatchModifyMessagesRequest, userId: String): Unit = js.native
  // Gets the specified message.
  def get(userId: String, id: String): Message = js.native
  // Gets the specified message.
  def get(userId: String, id: String, optionalArgs: js.Object): Message = js.native
  // Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP. Does not send a message.
  def `import`(resource: Message, userId: String): Message = js.native
  // Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP. Does not send a message.
  def `import`(resource: Message, userId: String, mediaData: js.Any): Message = js.native
  // Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP. Does not send a message.
  def `import`(resource: Message, userId: String, mediaData: js.Any, optionalArgs: js.Object): Message = js.native
  // Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification. Does not send a message.
  def insert(resource: Message, userId: String): Message = js.native
  // Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification. Does not send a message.
  def insert(resource: Message, userId: String, mediaData: js.Any): Message = js.native
  // Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification. Does not send a message.
  def insert(resource: Message, userId: String, mediaData: js.Any, optionalArgs: js.Object): Message = js.native
  // Lists the messages in the user's mailbox.
  def list(userId: String): ListMessagesResponse = js.native
  // Lists the messages in the user's mailbox.
  def list(userId: String, optionalArgs: js.Object): ListMessagesResponse = js.native
  // Modifies the labels on the specified message.
  def modify(resource: ModifyMessageRequest, userId: String, id: String): Message = js.native
  // Immediately and permanently deletes the specified message. This operation cannot be undone. Prefer messages.trash instead.
  def remove(userId: String, id: String): Unit = js.native
  // Sends the specified message to the recipients in the To, Cc, and Bcc headers.
  def send(resource: Message, userId: String): Message = js.native
  // Sends the specified message to the recipients in the To, Cc, and Bcc headers.
  def send(resource: Message, userId: String, mediaData: js.Any): Message = js.native
  // Moves the specified message to the trash.
  def trash(userId: String, id: String): Message = js.native
  // Removes the specified message from the trash.
  def untrash(userId: String, id: String): Message = js.native
}

