package typings.gapiDotClientDotYoutube.gapi.client.youtube

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotYoutube.Anon_Alt
import typings.gapiDotClientDotYoutube.Anon_AltFieldsIdKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatBansResource extends js.Object {
  /** Removes a chat ban. */
  def delete(request: Anon_AltFieldsIdKeyOauthtokenPrettyPrint): Request[Unit]
  /** Adds a new ban to the chat. */
  def insert(request: Anon_Alt): Request[LiveChatBan]
}

object LiveChatBansResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsIdKeyOauthtokenPrettyPrint => Request[Unit],
    insert: Anon_Alt => Request[LiveChatBan]
  ): LiveChatBansResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert))
  
    __obj.asInstanceOf[LiveChatBansResource]
  }
}

