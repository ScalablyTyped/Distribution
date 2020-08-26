package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Alt
import typings.gapiClientGmail.anon.Fields
import typings.gapiClientGmail.anon.Format
import typings.gapiClientGmail.anon.IncludeSpamTrash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraftsResource extends js.Object {
  /** Creates a new draft with the DRAFT label. */
  def create(request: Alt): Request[Draft] = js.native
  /** Immediately and permanently deletes the specified draft. Does not simply trash it. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets the specified draft. */
  def get(request: Format): Request[Draft] = js.native
  /** Lists the drafts in the user's mailbox. */
  def list(request: IncludeSpamTrash): Request[ListDraftsResponse] = js.native
  /** Sends the specified, existing draft to the recipients in the To, Cc, and Bcc headers. */
  def send(request: Alt): Request[Message] = js.native
  /** Replaces a draft's content. */
  def update(request: Fields): Request[Draft] = js.native
}

object DraftsResource {
  @scala.inline
  def apply(
    create: Alt => Request[Draft],
    delete: Fields => Request[Unit],
    get: Format => Request[Draft],
    list: IncludeSpamTrash => Request[ListDraftsResponse],
    send: Alt => Request[Message],
    update: Fields => Request[Draft]
  ): DraftsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), send = js.Any.fromFunction1(send), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DraftsResource]
  }
  @scala.inline
  implicit class DraftsResourceOps[Self <: DraftsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Alt => Request[Draft]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Format => Request[Draft]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: IncludeSpamTrash => Request[ListDraftsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setSend(value: Alt => Request[Message]): Self = this.set("send", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Fields => Request[Draft]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

