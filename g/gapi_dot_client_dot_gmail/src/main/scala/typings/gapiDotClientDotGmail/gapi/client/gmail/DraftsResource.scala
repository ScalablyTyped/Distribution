package typings.gapiDotClientDotGmail.gapi.client.gmail

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGmail.Anon_Alt
import typings.gapiDotClientDotGmail.Anon_AltFields
import typings.gapiDotClientDotGmail.Anon_AltFieldsFormat
import typings.gapiDotClientDotGmail.Anon_AltFieldsIncludeSpamTrash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftsResource extends js.Object {
  /** Creates a new draft with the DRAFT label. */
  def create(request: Anon_Alt): Request[Draft]
  /** Immediately and permanently deletes the specified draft. Does not simply trash it. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets the specified draft. */
  def get(request: Anon_AltFieldsFormat): Request[Draft]
  /** Lists the drafts in the user's mailbox. */
  def list(request: Anon_AltFieldsIncludeSpamTrash): Request[ListDraftsResponse]
  /** Sends the specified, existing draft to the recipients in the To, Cc, and Bcc headers. */
  def send(request: Anon_Alt): Request[Message]
  /** Replaces a draft's content. */
  def update(request: Anon_AltFields): Request[Draft]
}

object DraftsResource {
  @scala.inline
  def apply(
    create: Anon_Alt => Request[Draft],
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFieldsFormat => Request[Draft],
    list: Anon_AltFieldsIncludeSpamTrash => Request[ListDraftsResponse],
    send: Anon_Alt => Request[Message],
    update: Anon_AltFields => Request[Draft]
  ): DraftsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), send = js.Any.fromFunction1(send), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DraftsResource]
  }
}

