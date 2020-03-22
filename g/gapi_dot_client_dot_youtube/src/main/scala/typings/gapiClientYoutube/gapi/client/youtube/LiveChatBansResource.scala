package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAlt
import typings.gapiClientYoutube.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatBansResource extends js.Object {
  /** Removes a chat ban. */
  def delete(request: AnonQuotaUser): Request_[Unit]
  /** Adds a new ban to the chat. */
  def insert(request: AnonAlt): Request_[LiveChatBan]
}

object LiveChatBansResource {
  @scala.inline
  def apply(delete: AnonQuotaUser => Request_[Unit], insert: AnonAlt => Request_[LiveChatBan]): LiveChatBansResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert))
  
    __obj.asInstanceOf[LiveChatBansResource]
  }
}

