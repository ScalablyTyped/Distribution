package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.Alt
import typings.gapiClientYoutube.anon.LiveChatId
import typings.gapiClientYoutube.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessagesResource extends js.Object {
  /** Deletes a chat message. */
  def delete(request: QuotaUser): Request[Unit]
  /** Adds a message to a live chat. */
  def insert(request: Alt): Request[LiveChatMessage]
  /** Lists live chat messages for a specific chat. */
  def list(request: LiveChatId): Request[LiveChatMessageListResponse]
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
}

