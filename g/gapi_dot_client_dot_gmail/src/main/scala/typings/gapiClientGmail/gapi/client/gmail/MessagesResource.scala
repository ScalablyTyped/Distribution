package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGmail.AnonAlt
import typings.gapiClientGmail.AnonAltDeleted
import typings.gapiClientGmail.AnonAltDeletedFields
import typings.gapiClientGmail.AnonAltFields
import typings.gapiClientGmail.AnonAltFieldsFormatId
import typings.gapiClientGmail.AnonAltFieldsIncludeSpamTrashKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagesResource extends js.Object {
  var attachments: AttachmentsResource
  /** Deletes many messages by message ID. Provides no guarantees that messages were not already deleted or even existed at all. */
  def batchDelete(request: AnonAlt): Request_[Unit]
  /** Modifies the labels on the specified messages. */
  def batchModify(request: AnonAlt): Request_[Unit]
  /** Immediately and permanently deletes the specified message. This operation cannot be undone. Prefer messages.trash instead. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Gets the specified message. */
  def get(request: AnonAltFieldsFormatId): Request_[Message]
  /**
    * Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP. Does not send
    * a message.
    */
  def `import`(request: AnonAltDeleted): Request_[Message]
  /** Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification. Does not send a message. */
  def insert(request: AnonAltDeletedFields): Request_[Message]
  /** Lists the messages in the user's mailbox. */
  def list(request: AnonAltFieldsIncludeSpamTrashKey): Request_[ListMessagesResponse]
  /** Modifies the labels on the specified message. */
  def modify(request: AnonAltFields): Request_[Message]
  /** Sends the specified message to the recipients in the To, Cc, and Bcc headers. */
  def send(request: AnonAlt): Request_[Message]
  /** Moves the specified message to the trash. */
  def trash(request: AnonAltFields): Request_[Message]
  /** Removes the specified message from the trash. */
  def untrash(request: AnonAltFields): Request_[Message]
}

object MessagesResource {
  @scala.inline
  def apply(
    attachments: AttachmentsResource,
    batchDelete: AnonAlt => Request_[Unit],
    batchModify: AnonAlt => Request_[Unit],
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFieldsFormatId => Request_[Message],
    `import`: AnonAltDeleted => Request_[Message],
    insert: AnonAltDeletedFields => Request_[Message],
    list: AnonAltFieldsIncludeSpamTrashKey => Request_[ListMessagesResponse],
    modify: AnonAltFields => Request_[Message],
    send: AnonAlt => Request_[Message],
    trash: AnonAltFields => Request_[Message],
    untrash: AnonAltFields => Request_[Message]
  ): MessagesResource = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], batchDelete = js.Any.fromFunction1(batchDelete), batchModify = js.Any.fromFunction1(batchModify), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), modify = js.Any.fromFunction1(modify), send = js.Any.fromFunction1(send), trash = js.Any.fromFunction1(trash), untrash = js.Any.fromFunction1(untrash))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[MessagesResource]
  }
}

