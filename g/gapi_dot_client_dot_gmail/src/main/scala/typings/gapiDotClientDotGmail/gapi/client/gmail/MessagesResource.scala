package typings.gapiDotClientDotGmail.gapi.client.gmail

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGmail.Anon_Alt
import typings.gapiDotClientDotGmail.Anon_AltDeleted
import typings.gapiDotClientDotGmail.Anon_AltDeletedFields
import typings.gapiDotClientDotGmail.Anon_AltFields
import typings.gapiDotClientDotGmail.Anon_AltFieldsFormatId
import typings.gapiDotClientDotGmail.Anon_AltFieldsIncludeSpamTrashKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagesResource extends js.Object {
  var attachments: AttachmentsResource
  /** Deletes many messages by message ID. Provides no guarantees that messages were not already deleted or even existed at all. */
  def batchDelete(request: Anon_Alt): Request[Unit]
  /** Modifies the labels on the specified messages. */
  def batchModify(request: Anon_Alt): Request[Unit]
  /** Immediately and permanently deletes the specified message. This operation cannot be undone. Prefer messages.trash instead. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets the specified message. */
  def get(request: Anon_AltFieldsFormatId): Request[Message]
  /**
    * Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP. Does not send
    * a message.
    */
  def `import`(request: Anon_AltDeleted): Request[Message]
  /** Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification. Does not send a message. */
  def insert(request: Anon_AltDeletedFields): Request[Message]
  /** Lists the messages in the user's mailbox. */
  def list(request: Anon_AltFieldsIncludeSpamTrashKey): Request[ListMessagesResponse]
  /** Modifies the labels on the specified message. */
  def modify(request: Anon_AltFields): Request[Message]
  /** Sends the specified message to the recipients in the To, Cc, and Bcc headers. */
  def send(request: Anon_Alt): Request[Message]
  /** Moves the specified message to the trash. */
  def trash(request: Anon_AltFields): Request[Message]
  /** Removes the specified message from the trash. */
  def untrash(request: Anon_AltFields): Request[Message]
}

object MessagesResource {
  @scala.inline
  def apply(
    attachments: AttachmentsResource,
    batchDelete: Anon_Alt => Request[Unit],
    batchModify: Anon_Alt => Request[Unit],
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFieldsFormatId => Request[Message],
    `import`: Anon_AltDeleted => Request[Message],
    insert: Anon_AltDeletedFields => Request[Message],
    list: Anon_AltFieldsIncludeSpamTrashKey => Request[ListMessagesResponse],
    modify: Anon_AltFields => Request[Message],
    send: Anon_Alt => Request[Message],
    trash: Anon_AltFields => Request[Message],
    untrash: Anon_AltFields => Request[Message]
  ): MessagesResource = {
    val __obj = js.Dynamic.literal(attachments = attachments, batchDelete = js.Any.fromFunction1(batchDelete), batchModify = js.Any.fromFunction1(batchModify), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), modify = js.Any.fromFunction1(modify), send = js.Any.fromFunction1(send), trash = js.Any.fromFunction1(trash), untrash = js.Any.fromFunction1(untrash))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[MessagesResource]
  }
}

