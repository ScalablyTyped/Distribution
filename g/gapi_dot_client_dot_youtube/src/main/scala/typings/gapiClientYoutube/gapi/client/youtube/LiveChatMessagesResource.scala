package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.Alt
import typings.gapiClientYoutube.anon.LiveChatId
import typings.gapiClientYoutube.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatMessagesResource extends js.Object {
  /** Deletes a chat message. */
  def delete(request: QuotaUser): Request[Unit] = js.native
  /** Adds a message to a live chat. */
  def insert(request: Alt): Request[LiveChatMessage] = js.native
  /** Lists live chat messages for a specific chat. */
  def list(request: LiveChatId): Request[LiveChatMessageListResponse] = js.native
}

object LiveChatMessagesResource {
  @scala.inline
  def apply(
    delete: QuotaUser => Request[Unit],
    insert: Alt => Request[LiveChatMessage],
    list: LiveChatId => Request[LiveChatMessageListResponse]
  ): LiveChatMessagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LiveChatMessagesResource]
  }
  @scala.inline
  implicit class LiveChatMessagesResourceOps[Self <: LiveChatMessagesResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: QuotaUser => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Alt => Request[LiveChatMessage]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: LiveChatId => Request[LiveChatMessageListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

