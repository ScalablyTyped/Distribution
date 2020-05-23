package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Alt
import typings.gapiClientGmail.anon.Fields
import typings.gapiClientGmail.anon.Format
import typings.gapiClientGmail.anon.IncludeSpamTrash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftsResource extends js.Object {
  /** Creates a new draft with the DRAFT label. */
  def create(request: Alt): Request[Draft]
  /** Immediately and permanently deletes the specified draft. Does not simply trash it. */
  def delete(request: Fields): Request[Unit]
  /** Gets the specified draft. */
  def get(request: Format): Request[Draft]
  /** Lists the drafts in the user's mailbox. */
  def list(request: IncludeSpamTrash): Request[ListDraftsResponse]
  /** Sends the specified, existing draft to the recipients in the To, Cc, and Bcc headers. */
  def send(request: Alt): Request[Message]
  /** Replaces a draft's content. */
  def update(request: Fields): Request[Draft]
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
}

