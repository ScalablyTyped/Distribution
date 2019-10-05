package typings.gapiDotClientDotYoutube.gapi.client.youtube

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotYoutube.Anon_Alt
import typings.gapiDotClientDotYoutube.Anon_AltFieldsHlKeyLiveChatId
import typings.gapiDotClientDotYoutube.Anon_AltFieldsIdKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessagesResource extends js.Object {
  /** Deletes a chat message. */
  def delete(request: Anon_AltFieldsIdKeyOauthtokenPrettyPrint): Request[Unit]
  /** Adds a message to a live chat. */
  def insert(request: Anon_Alt): Request[LiveChatMessage]
  /** Lists live chat messages for a specific chat. */
  def list(request: Anon_AltFieldsHlKeyLiveChatId): Request[LiveChatMessageListResponse]
}

object LiveChatMessagesResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsIdKeyOauthtokenPrettyPrint => Request[Unit],
    insert: Anon_Alt => Request[LiveChatMessage],
    list: Anon_AltFieldsHlKeyLiveChatId => Request[LiveChatMessageListResponse]
  ): LiveChatMessagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LiveChatMessagesResource]
  }
}

