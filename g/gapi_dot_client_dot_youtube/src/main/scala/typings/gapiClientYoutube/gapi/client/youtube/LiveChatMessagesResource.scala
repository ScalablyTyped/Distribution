package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAlt
import typings.gapiClientYoutube.AnonLiveChatId
import typings.gapiClientYoutube.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessagesResource extends js.Object {
  /** Deletes a chat message. */
  def delete(request: AnonQuotaUser): Request_[Unit]
  /** Adds a message to a live chat. */
  def insert(request: AnonAlt): Request_[LiveChatMessage]
  /** Lists live chat messages for a specific chat. */
  def list(request: AnonLiveChatId): Request_[LiveChatMessageListResponse]
}

object LiveChatMessagesResource {
  @scala.inline
  def apply(
    delete: AnonQuotaUser => Request_[Unit],
    insert: AnonAlt => Request_[LiveChatMessage],
    list: AnonLiveChatId => Request_[LiveChatMessageListResponse]
  ): LiveChatMessagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LiveChatMessagesResource]
  }
}

