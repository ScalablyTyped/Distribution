package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Alt
import typings.gapiClientGmail.anon.Deleted
import typings.gapiClientGmail.anon.Fields
import typings.gapiClientGmail.anon.InternalDateSource
import typings.gapiClientGmail.anon.Key
import typings.gapiClientGmail.anon.LabelIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagesResource extends js.Object {
  var attachments: AttachmentsResource = js.native
  /** Deletes many messages by message ID. Provides no guarantees that messages were not already deleted or even existed at all. */
  def batchDelete(request: Alt): Request[Unit] = js.native
  /** Modifies the labels on the specified messages. */
  def batchModify(request: Alt): Request[Unit] = js.native
  /** Immediately and permanently deletes the specified message. This operation cannot be undone. Prefer messages.trash instead. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets the specified message. */
  def get(request: Key): Request[Message] = js.native
  /**
    * Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP. Does not send
    * a message.
    */
  def `import`(request: Deleted): Request[Message] = js.native
  /** Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification. Does not send a message. */
  def insert(request: InternalDateSource): Request[Message] = js.native
  /** Lists the messages in the user's mailbox. */
  def list(request: LabelIds): Request[ListMessagesResponse] = js.native
  /** Modifies the labels on the specified message. */
  def modify(request: Fields): Request[Message] = js.native
  /** Sends the specified message to the recipients in the To, Cc, and Bcc headers. */
  def send(request: Alt): Request[Message] = js.native
  /** Moves the specified message to the trash. */
  def trash(request: Fields): Request[Message] = js.native
  /** Removes the specified message from the trash. */
  def untrash(request: Fields): Request[Message] = js.native
}

object MessagesResource {
  @scala.inline
  def apply(
    attachments: AttachmentsResource,
    batchDelete: Alt => Request[Unit],
    batchModify: Alt => Request[Unit],
    delete: Fields => Request[Unit],
    get: Key => Request[Message],
    `import`: Deleted => Request[Message],
    insert: InternalDateSource => Request[Message],
    list: LabelIds => Request[ListMessagesResponse],
    modify: Fields => Request[Message],
    send: Alt => Request[Message],
    trash: Fields => Request[Message],
    untrash: Fields => Request[Message]
  ): MessagesResource = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], batchDelete = js.Any.fromFunction1(batchDelete), batchModify = js.Any.fromFunction1(batchModify), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), modify = js.Any.fromFunction1(modify), send = js.Any.fromFunction1(send), trash = js.Any.fromFunction1(trash), untrash = js.Any.fromFunction1(untrash))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[MessagesResource]
  }
  @scala.inline
  implicit class MessagesResourceOps[Self <: MessagesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttachments(value: AttachmentsResource): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchDelete(value: Alt => Request[Unit]): Self = this.set("batchDelete", js.Any.fromFunction1(value))
    @scala.inline
    def setBatchModify(value: Alt => Request[Unit]): Self = this.set("batchModify", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => Request[Message]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setImport(value: Deleted => Request[Message]): Self = this.set("import", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: InternalDateSource => Request[Message]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: LabelIds => Request[ListMessagesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setModify(value: Fields => Request[Message]): Self = this.set("modify", js.Any.fromFunction1(value))
    @scala.inline
    def setSend(value: Alt => Request[Message]): Self = this.set("send", js.Any.fromFunction1(value))
    @scala.inline
    def setTrash(value: Fields => Request[Message]): Self = this.set("trash", js.Any.fromFunction1(value))
    @scala.inline
    def setUntrash(value: Fields => Request[Message]): Self = this.set("untrash", js.Any.fromFunction1(value))
  }
  
}

