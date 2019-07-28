package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotYoutube.Anon_Alt
import typings.gapiDotClientDotYoutube.Anon_AltFieldsIdKeyOauthtokenPrettyPrint
import typings.gapiDotClientDotYoutube.Anon_AltFieldsKeyLiveChatId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatModeratorsResource extends js.Object {
  /** Removes a chat moderator. */
  def delete(request: Anon_AltFieldsIdKeyOauthtokenPrettyPrint): Request[Unit]
  /** Adds a new moderator for the chat. */
  def insert(request: Anon_Alt): Request[LiveChatModerator]
  /** Lists moderators for a live chat. */
  def list(request: Anon_AltFieldsKeyLiveChatId): Request[LiveChatModeratorListResponse]
}

object LiveChatModeratorsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsIdKeyOauthtokenPrettyPrint => Request[Unit],
    insert: Anon_Alt => Request[LiveChatModerator],
    list: Anon_AltFieldsKeyLiveChatId => Request[LiveChatModeratorListResponse]
  ): LiveChatModeratorsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LiveChatModeratorsResource]
  }
}

