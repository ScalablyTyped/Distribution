package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagesCollection extends js.Object {
  var Attachments: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.MessagesNs.AttachmentsCollection
  ] = js.native
  // Deletes many messages by message ID. Provides no guarantees that messages were not already deleted or even existed at all.
  def batchDelete(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.BatchDeleteMessagesRequest,
    userId: java.lang.String
  ): scala.Unit = js.native
  // Modifies the labels on the specified messages.
  def batchModify(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.BatchModifyMessagesRequest,
    userId: java.lang.String
  ): scala.Unit = js.native
  // Gets the specified message.
  def get(userId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message = js.native
  // Gets the specified message.
  def get(userId: java.lang.String, id: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message = js.native
  // Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP. Does not send a message.
  def `import`(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message = js.native
  // Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP. Does not send a message.
  def `import`(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message,
    userId: java.lang.String,
    mediaData: js.Any
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message = js.native
  // Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP. Does not send a message.
  def `import`(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message,
    userId: java.lang.String,
    mediaData: js.Any,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message = js.native
  // Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification. Does not send a message.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message = js.native
  // Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification. Does not send a message.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message,
    userId: java.lang.String,
    mediaData: js.Any
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message = js.native
  // Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification. Does not send a message.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message,
    userId: java.lang.String,
    mediaData: js.Any,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message = js.native
  // Lists the messages in the user's mailbox.
  def list(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ListMessagesResponse = js.native
  // Lists the messages in the user's mailbox.
  def list(userId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ListMessagesResponse = js.native
  // Modifies the labels on the specified message.
  def modify(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ModifyMessageRequest,
    userId: java.lang.String,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message = js.native
  // Immediately and permanently deletes the specified message. This operation cannot be undone. Prefer messages.trash instead.
  def remove(userId: java.lang.String, id: java.lang.String): scala.Unit = js.native
  // Sends the specified message to the recipients in the To, Cc, and Bcc headers.
  def send(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message = js.native
  // Sends the specified message to the recipients in the To, Cc, and Bcc headers.
  def send(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message,
    userId: java.lang.String,
    mediaData: js.Any
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message = js.native
  // Moves the specified message to the trash.
  def trash(userId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message = js.native
  // Removes the specified message from the trash.
  def untrash(userId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message = js.native
}

