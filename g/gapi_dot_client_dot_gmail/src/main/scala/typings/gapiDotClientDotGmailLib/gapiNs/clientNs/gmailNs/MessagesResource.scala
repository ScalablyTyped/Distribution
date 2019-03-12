package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagesResource extends js.Object {
  var attachments: AttachmentsResource
  /** Deletes many messages by message ID. Provides no guarantees that messages were not already deleted or even existed at all. */
  def batchDelete(request: gapiDotClientDotGmailLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Modifies the labels on the specified messages. */
  def batchModify(request: gapiDotClientDotGmailLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Immediately and permanently deletes the specified message. This operation cannot be undone. Prefer messages.trash instead. */
  def delete(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets the specified message. */
  def get(request: gapiDotClientDotGmailLib.Anon_AltFieldsFormatId): gapiDotClientLib.gapiNs.clientNs.Request[Message]
  /**
    * Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP. Does not send
    * a message.
    */
  def `import`(request: gapiDotClientDotGmailLib.Anon_AltDeleted): gapiDotClientLib.gapiNs.clientNs.Request[Message]
  /** Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification. Does not send a message. */
  def insert(request: gapiDotClientDotGmailLib.Anon_AltDeletedFields): gapiDotClientLib.gapiNs.clientNs.Request[Message]
  /** Lists the messages in the user's mailbox. */
  def list(request: gapiDotClientDotGmailLib.Anon_AltFieldsIncludeSpamTrashKey): gapiDotClientLib.gapiNs.clientNs.Request[ListMessagesResponse]
  /** Modifies the labels on the specified message. */
  def modify(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Message]
  /** Sends the specified message to the recipients in the To, Cc, and Bcc headers. */
  def send(request: gapiDotClientDotGmailLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Message]
  /** Moves the specified message to the trash. */
  def trash(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Message]
  /** Removes the specified message from the trash. */
  def untrash(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Message]
}

object MessagesResource {
  @scala.inline
  def apply(
    attachments: AttachmentsResource,
    batchDelete: gapiDotClientDotGmailLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    batchModify: gapiDotClientDotGmailLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    delete: gapiDotClientDotGmailLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotGmailLib.Anon_AltFieldsFormatId => gapiDotClientLib.gapiNs.clientNs.Request[Message],
    `import`: gapiDotClientDotGmailLib.Anon_AltDeleted => gapiDotClientLib.gapiNs.clientNs.Request[Message],
    insert: gapiDotClientDotGmailLib.Anon_AltDeletedFields => gapiDotClientLib.gapiNs.clientNs.Request[Message],
    list: gapiDotClientDotGmailLib.Anon_AltFieldsIncludeSpamTrashKey => gapiDotClientLib.gapiNs.clientNs.Request[ListMessagesResponse],
    modify: gapiDotClientDotGmailLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Message],
    send: gapiDotClientDotGmailLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Message],
    trash: gapiDotClientDotGmailLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Message],
    untrash: gapiDotClientDotGmailLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Message]
  ): MessagesResource = {
    val __obj = js.Dynamic.literal(attachments = attachments, batchDelete = js.Any.fromFunction1(batchDelete), batchModify = js.Any.fromFunction1(batchModify), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), modify = js.Any.fromFunction1(modify), send = js.Any.fromFunction1(send), trash = js.Any.fromFunction1(trash), untrash = js.Any.fromFunction1(untrash))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[MessagesResource]
  }
}

