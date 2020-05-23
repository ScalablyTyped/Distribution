package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.Alt
import typings.gapiClientYoutube.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatBansResource extends js.Object {
  /** Removes a chat ban. */
  def delete(request: QuotaUser): Request[Unit]
  /** Adds a new ban to the chat. */
  def insert(request: Alt): Request[LiveChatBan]
}

object LiveChatBansResource {
  @scala.inline
  def apply(delete: QuotaUser => Request[Unit], insert: Alt => Request[LiveChatBan]): LiveChatBansResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[LiveChatBansResource]
  }
}

